package com.bytedance.liko.memoryexplorer.assemble;

import com.C2240a;
import com.bytedance.liko.memoryexplorer.MemoryConfig;
import com.bytedance.liko.memoryexplorer.analyse.trace.LeakInfo;
import com.bytedance.liko.memoryexplorer.android.AndroidOS;
import com.bytedance.liko.memoryexplorer.bitmap.HprofBitmapProvider;
import com.bytedance.liko.memoryexplorer.report.BitmapReporter;
import com.bytedance.liko.memoryexplorer.report.model.ExplorerAnalysisResult.ResultBitmapNode;
import com.bytedance.liko.memoryexplorer.util.MemorySizeFormat;
import java.awt.Dimension;
import java.io.File;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class BitmapAssembler extends AssemblerProxy<HprofBitmapProvider> {
    private List<HprofBitmapProvider> mBitmapRecords = new LinkedList();
    private BitmapReporter mBitmapReporter;
    private final MemoryConfig mMemoryConfig;

    public void onFinish() {
        if (this.mBitmapRecords.size() != 0) {
            Collections.sort(this.mBitmapRecords, new Comparator<HprofBitmapProvider>() {
                public int compare(HprofBitmapProvider hprofBitmapProvider, HprofBitmapProvider hprofBitmapProvider2) {
                    return hprofBitmapProvider2.getPixelBytes().length - hprofBitmapProvider.getPixelBytes().length;
                }
            });
            for (int i = 0; i < this.mBitmapRecords.size(); i++) {
                HprofBitmapProvider hprofBitmapProvider = (HprofBitmapProvider) this.mBitmapRecords.get(i);
                writeBitmapRecord(hprofBitmapProvider, i);
                reportBitmapRecord(hprofBitmapProvider);
            }
        } else if (AndroidOS.SDK_INT >= 26) {
            nothingFound("Can't read bitmap data in java heap on Android 8.0 and above!");
        } else {
            nothingFound("No Bitmap found!");
        }
    }

    public void onAssemble(HprofBitmapProvider hprofBitmapProvider) {
        if (hprofBitmapProvider != null && hprofBitmapProvider.getPixelBytes().length > 0) {
            this.mBitmapRecords.add(hprofBitmapProvider);
        }
    }

    private int[] calcImageSize(Dimension dimension) {
        if (dimension.width > 1000 || dimension.height > 1000) {
            return new int[]{dimension.width / 2, dimension.height / 2};
        }
        return new int[]{dimension.width, dimension.height};
    }

    private void reportBitmapRecord(HprofBitmapProvider hprofBitmapProvider) {
        ResultBitmapNode resultBitmapNode = new ResultBitmapNode();
        resultBitmapNode.height = hprofBitmapProvider.getDimension().height;
        resultBitmapNode.width = hprofBitmapProvider.getDimension().width;
        resultBitmapNode.url = hprofBitmapProvider.getImageFile().getPath();
        this.mBitmapReporter.onReport(new LeakInfo(hprofBitmapProvider.getLeakTrace(), resultBitmapNode));
    }

    private void writeBitmapRecord(HprofBitmapProvider hprofBitmapProvider, int i) {
        Dimension dimension = hprofBitmapProvider.getDimension();
        String formatMB = MemorySizeFormat.formatMB((long) hprofBitmapProvider.getPixelBytes().length);
        StringBuilder sb = new StringBuilder("images");
        sb.append(File.separator);
        sb.append(hprofBitmapProvider.getImageFile().getName());
        String sb2 = sb.toString();
        String a = C2240a.m6772a("Bitmap %d : %d x %d,  size= %s. File : %s", new Object[]{Integer.valueOf(i + 1), Integer.valueOf(dimension.width), Integer.valueOf(dimension.height), formatMB, sb2});
        StringBuilder sb3 = new StringBuilder("<h3>");
        sb3.append(a);
        sb3.append("</h3>");
        writeLine(sb3.toString());
        if (hprofBitmapProvider.getLeakTrace() != null) {
            writeLine("<pre class=\"bitmap_code\">");
            writeLine(hprofBitmapProvider.getLeakTrace().format(true));
            writeLine("</pre>");
        }
        int[] calcImageSize = calcImageSize(dimension);
        writeLine(C2240a.m6772a("<img src=\"%s\" width=\"%d\" height=\"%d\"></img>", new Object[]{sb2, Integer.valueOf(calcImageSize[0]), Integer.valueOf(calcImageSize[1])}));
        writeDivider();
    }

    public BitmapAssembler(MemoryConfig memoryConfig, IAssembler iAssembler, BitmapReporter bitmapReporter) {
        super(iAssembler);
        this.mBitmapReporter = bitmapReporter;
        this.mMemoryConfig = memoryConfig;
        writeLine("<div class=\"bitmap_h2\" ><h1 align=\"center\">2、图片</h1></div>");
    }
}
