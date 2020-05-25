package com.bytedance.liko.memoryexplorer.analyse;

import com.bytedance.liko.memoryexplorer.MemoryConfig;
import com.bytedance.liko.memoryexplorer.analyse.trace.LeakInfo;
import com.bytedance.liko.memoryexplorer.analyse.trace.LeakTrace;
import com.bytedance.liko.memoryexplorer.analyse.trace.LeakTraceTracker;
import com.bytedance.liko.memoryexplorer.android.AndroidOS;
import com.bytedance.liko.memoryexplorer.assemble.BitmapAssembler;
import com.bytedance.liko.memoryexplorer.assemble.BitmapPathAssembler;
import com.bytedance.liko.memoryexplorer.assemble.IAssembler;
import com.bytedance.liko.memoryexplorer.bitmap.BitmapDecoder;
import com.bytedance.liko.memoryexplorer.bitmap.HprofBitmapProvider;
import com.bytedance.liko.memoryexplorer.report.BitmapReporter;
import com.bytedance.liko.memoryexplorer.report.model.ExplorerAnalysisResult;
import com.bytedance.liko.memoryexplorer.report.model.ExplorerAnalysisResult.ResultBitmapNode;
import com.bytedance.liko.memoryexplorer.util.CollectionsUtil;
import com.bytedance.liko.memoryexplorer.util.FileUtils;
import com.bytedance.liko.memoryexplorer.util.Logger;
import com.bytedance.liko.memoryexplorer.util.MemorySizeFormat;
import java.awt.image.BufferedImage;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Collection;
import javax.imageio.ImageIO;
import javax.imageio.ImageWriter;
import org.eclipse.mat.parser.model.PrimitiveArrayImpl;
import org.eclipse.mat.snapshot.ISnapshot;
import org.eclipse.mat.snapshot.model.IClass;
import org.eclipse.mat.snapshot.model.IObject;
import org.eclipse.mat.util.IProgressListener;

public class BitmapAnalyser implements HprofAnalyser {
    private static final String[] BITMAP_CLASS = {"android.graphics.Bitmap"};
    private final BitmapPathAssembler mBitmapPathAssembler;
    private final BitmapAssembler mHprofReport;
    private MemoryConfig mMemoryConfig;

    private static File getDumpImagesDir() {
        File reportDir = FileUtils.getReportDir();
        StringBuilder sb = new StringBuilder();
        sb.append(File.separator);
        sb.append("images");
        sb.append(File.separator);
        File file = new File(reportDir, sb.toString());
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    private void dumpBitmap(ISnapshot iSnapshot, int i) {
        try {
            IObject object = iSnapshot.getObject(i);
            LeakTrace findLeakTrace = new LeakTraceTracker().findLeakTrace(iSnapshot, object, this.mMemoryConfig.excludedRefs);
            Logger.m24776i(findLeakTrace.format(false), new Object[0]);
            String hexString = Long.toHexString(iSnapshot.mapIdToAddress(i));
            int intValue = ((Integer) object.resolveValue("mWidth")).intValue();
            int intValue2 = ((Integer) object.resolveValue("mHeight")).intValue();
            saveBitmapToPNG(findLeakTrace, hexString, intValue, intValue2, readBitmapBytes(object, intValue, intValue2, hexString));
        } catch (Exception unused) {
        }
    }

    private void findBitmapPath(ISnapshot iSnapshot, IObject iObject) {
        try {
            int intValue = ((Integer) iObject.resolveValue("mWidth")).intValue();
            int intValue2 = ((Integer) iObject.resolveValue("mHeight")).intValue();
            if (((long) (intValue * intValue2)) > this.mMemoryConfig.bitmapLatitude || iObject.getRetainedHeapSize() > this.mMemoryConfig.bitmapLatitude) {
                LeakTrace findLeakTrace = new LeakTraceTracker().findLeakTrace(iSnapshot, iObject, this.mMemoryConfig.excludedRefs);
                ResultBitmapNode resultBitmapNode = new ResultBitmapNode();
                resultBitmapNode.height = intValue2;
                resultBitmapNode.width = intValue;
                resultBitmapNode.url = "";
                this.mBitmapPathAssembler.onAssemble(new LeakInfo(findLeakTrace, resultBitmapNode));
            }
        } catch (Exception unused) {
        }
    }

    public void analysis(ISnapshot iSnapshot, IProgressListener iProgressListener) {
        FileUtils.clearDir(getDumpImagesDir());
        try {
            for (String classesByName : BITMAP_CLASS) {
                Collection classesByName2 = iSnapshot.getClassesByName(classesByName, false);
                if (!CollectionsUtil.isEmpty(classesByName2)) {
                    IClass iClass = (IClass) classesByName2.iterator().next();
                    int[] objectIds = iClass.getObjectIds();
                    long minRetainedSize = iSnapshot.getMinRetainedSize(objectIds, iProgressListener);
                    Logger.m24776i("\n=================== BITMAP INSTANCE SUMMARY ================\n", new Object[0]);
                    Logger.m24776i("Detected %d %s instances, retained size : %s \n", Integer.valueOf(objectIds.length), iClass.getName(), MemorySizeFormat.format(minRetainedSize));
                    for (int i = 0; i < objectIds.length; i++) {
                        IObject object = iSnapshot.getObject(objectIds[i]);
                        if (object != null) {
                            if (AndroidOS.SDK_INT < 26) {
                                if (!"local_test".equals(this.mMemoryConfig.channel)) {
                                    if (object.getRetainedHeapSize() > this.mMemoryConfig.bitmapLatitude) {
                                        dumpBitmap(iSnapshot, objectIds[i]);
                                    }
                                }
                            }
                            findBitmapPath(iSnapshot, object);
                        }
                    }
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            this.mHprofReport.onFinish();
            throw th;
        }
        this.mHprofReport.onFinish();
    }

    public BitmapAnalyser(MemoryConfig memoryConfig, IAssembler iAssembler, ExplorerAnalysisResult explorerAnalysisResult) {
        BitmapReporter bitmapReporter = new BitmapReporter(explorerAnalysisResult);
        this.mHprofReport = new BitmapAssembler(memoryConfig, iAssembler, bitmapReporter);
        this.mBitmapPathAssembler = new BitmapPathAssembler(memoryConfig, iAssembler, bitmapReporter);
        this.mMemoryConfig = memoryConfig;
    }

    private static byte[] readBitmapBytes(IObject iObject, int i, int i2, String str) throws Exception {
        if (i2 <= 0 || i <= 0) {
            Logger.m24776i("Bitmap address=%s has bad height %d or width %d!", str, Integer.valueOf(i2), Integer.valueOf(i));
            return null;
        }
        PrimitiveArrayImpl primitiveArrayImpl = (PrimitiveArrayImpl) iObject.resolveValue("mBuffer");
        if (primitiveArrayImpl == null) {
            return null;
        }
        return (byte[]) primitiveArrayImpl.getValueArray();
    }

    private void saveBitmapToPNG(LeakTrace leakTrace, String str, int i, int i2, byte[] bArr) {
        Closeable closeable;
        Closeable closeable2;
        ImageWriter imageWriter;
        if (bArr != null) {
            File dumpImagesDir = getDumpImagesDir();
            StringBuilder sb = new StringBuilder("bitmap_0x");
            sb.append(str);
            sb.append("_");
            sb.append(bArr.length);
            sb.append("_bytes.png");
            File file = new File(dumpImagesDir, sb.toString());
            HprofBitmapProvider hprofBitmapProvider = new HprofBitmapProvider(leakTrace, bArr, i, i2, file);
            BufferedImage decode = BitmapDecoder.decode(hprofBitmapProvider);
            Closeable closeable3 = null;
            try {
                closeable = new FileOutputStream(file);
                try {
                    imageWriter = (ImageWriter) ImageIO.getImageWritersByFormatName("png").next();
                    closeable2 = ImageIO.createImageOutputStream(closeable);
                } catch (Exception unused) {
                    FileUtils.closeQuietly(closeable);
                    FileUtils.closeQuietly(closeable3);
                } catch (Throwable th) {
                    th = th;
                    closeable2 = null;
                    FileUtils.closeQuietly(closeable);
                    FileUtils.closeQuietly(closeable2);
                    throw th;
                }
                try {
                    imageWriter.setOutput(closeable2);
                    imageWriter.write(decode);
                    Logger.m24776i("address = 0x%s, %d x %d, size= %s", str, Integer.valueOf(i), Integer.valueOf(i2), MemorySizeFormat.format((long) bArr.length));
                    this.mHprofReport.onAssemble(hprofBitmapProvider);
                    FileUtils.closeQuietly(closeable);
                    FileUtils.closeQuietly(closeable2);
                } catch (Exception unused2) {
                    closeable3 = closeable2;
                    FileUtils.closeQuietly(closeable);
                    FileUtils.closeQuietly(closeable3);
                } catch (Throwable th2) {
                    th = th2;
                    FileUtils.closeQuietly(closeable);
                    FileUtils.closeQuietly(closeable2);
                    throw th;
                }
            } catch (Exception unused3) {
                closeable = null;
                FileUtils.closeQuietly(closeable);
                FileUtils.closeQuietly(closeable3);
            } catch (Throwable th3) {
                th = th3;
                closeable = null;
                closeable2 = null;
                FileUtils.closeQuietly(closeable);
                FileUtils.closeQuietly(closeable2);
                throw th;
            }
        }
    }
}
