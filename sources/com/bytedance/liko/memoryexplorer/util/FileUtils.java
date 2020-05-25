package com.bytedance.liko.memoryexplorer.util;

import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import org.eclipse.mat.json.JSONObject;

public class FileUtils {
    private static File sProjectDir;

    private FileUtils() {
    }

    public static File getRuntimeWorkDir() {
        return new File(System.getProperty("user.dir"));
    }

    public static File getHeapDumpCacheDir() {
        File file = new File(getHeapDumpDir(), "hprof");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static File getRawHeapDumpDir() {
        File file;
        if (sProjectDir == null) {
            file = getRuntimeWorkDir();
        } else {
            file = sProjectDir;
        }
        File file2 = new File(file.getParent());
        if (!file2.exists()) {
            file2.mkdirs();
        }
        return file2;
    }

    public static File getReportDir() {
        File file = new File(getHeapDumpDir(), "report");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static File getHeapDumpDir() {
        String str;
        if (sProjectDir == null) {
            str = getRuntimeWorkDir().getParent();
        } else {
            str = sProjectDir.getAbsolutePath();
        }
        File file = new File(str, "memory-explorer-result");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static void clearHeapDumpDir() {
        File heapDumpDir = getHeapDumpDir();
        PrintStream printStream = System.out;
        StringBuilder sb = new StringBuilder("==> 清空 ");
        sb.append(heapDumpDir.getAbsolutePath());
        printStream.println(sb.toString());
        if (heapDumpDir.isDirectory()) {
            File[] listFiles = heapDumpDir.listFiles();
            if (listFiles != null) {
                for (File clearDir : listFiles) {
                    clearDir(clearDir);
                }
            }
        } else if (!heapDumpDir.getAbsolutePath().endsWith(".hprof") || System.currentTimeMillis() - heapDumpDir.lastModified() > 600000) {
            heapDumpDir.delete();
        }
    }

    public static void setProjectDir(File file) {
        sProjectDir = file;
    }

    public static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    public static String read(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[PreloadTask.BYTE_UNIT_NUMBER];
        StringBuilder sb = new StringBuilder();
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return sb.toString();
            }
            sb.append(new String(bArr, 0, read));
        }
    }

    public static void clearDir(File file) {
        if (!file.isDirectory()) {
            file.delete();
        } else if (!"hprof".equals(file.getName())) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File clearDir : listFiles) {
                    clearDir(clearDir);
                }
            }
        }
    }

    public static JSONObject readJson(File file) {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = new FileInputStream(file);
            try {
                JSONObject jSONObject = new JSONObject(read(fileInputStream));
                closeQuietly(fileInputStream);
                return jSONObject;
            } catch (Exception unused) {
                fileInputStream2 = fileInputStream;
                closeQuietly(fileInputStream2);
                return new JSONObject();
            } catch (Throwable th) {
                th = th;
                closeQuietly(fileInputStream);
                throw th;
            }
        } catch (Exception unused2) {
            closeQuietly(fileInputStream2);
            return new JSONObject();
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = null;
            closeQuietly(fileInputStream);
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0049  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void copyFile(java.io.File r9, java.io.File r10) throws java.io.IOException {
        /*
            if (r9 == 0) goto L_0x004d
            if (r10 == 0) goto L_0x004d
            boolean r0 = r9.exists()
            if (r0 != 0) goto L_0x000b
            goto L_0x004d
        L_0x000b:
            r0 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ all -> 0x0040 }
            r1.<init>(r9)     // Catch:{ all -> 0x0040 }
            java.nio.channels.FileChannel r9 = r1.getChannel()     // Catch:{ all -> 0x0040 }
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ all -> 0x003a }
            r1.<init>(r10)     // Catch:{ all -> 0x003a }
            java.nio.channels.FileChannel r10 = r1.getChannel()     // Catch:{ all -> 0x003a }
            r4 = 0
            long r6 = r9.size()     // Catch:{ all -> 0x0035 }
            r2 = r10
            r3 = r9
            r2.transferFrom(r3, r4, r6)     // Catch:{ all -> 0x0035 }
            if (r9 == 0) goto L_0x002e
            r9.close()
        L_0x002e:
            if (r10 == 0) goto L_0x0034
            r10.close()
            return
        L_0x0034:
            return
        L_0x0035:
            r0 = move-exception
            r8 = r0
            r0 = r9
            r9 = r8
            goto L_0x0042
        L_0x003a:
            r10 = move-exception
            r8 = r0
            r0 = r9
            r9 = r10
            r10 = r8
            goto L_0x0042
        L_0x0040:
            r9 = move-exception
            r10 = r0
        L_0x0042:
            if (r0 == 0) goto L_0x0047
            r0.close()
        L_0x0047:
            if (r10 == 0) goto L_0x004c
            r10.close()
        L_0x004c:
            throw r9
        L_0x004d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.liko.memoryexplorer.util.FileUtils.copyFile(java.io.File, java.io.File):void");
    }
}
