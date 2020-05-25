package com.bytedance.geckox.utils;

import android.os.Process;
import com.bytedance.geckox.p611i.C10117b;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.bytedance.geckox.utils.d */
public final class C10154d {
    /* renamed from: b */
    private static boolean m20481b(File file) {
        boolean z;
        boolean z2 = true;
        if (file == null || !file.exists()) {
            return true;
        }
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                z = true;
                for (File file2 : listFiles) {
                    if (!z || !m20481b(file2)) {
                        z = false;
                    } else {
                        z = true;
                    }
                }
                if (!z || !file.delete()) {
                    z2 = false;
                }
                return z2;
            }
        }
        z = true;
        z2 = false;
        return z2;
    }

    /* renamed from: a */
    public static boolean m20480a(File file) {
        if (file == null || !file.exists()) {
            return true;
        }
        StringBuilder sb = new StringBuilder(", file:");
        sb.append(file.getAbsolutePath());
        C10117b.m20388a("gecko-debug-tag", "删除文件，pid:", Integer.valueOf(Process.myPid()), ", thread:", Thread.currentThread().toString(), sb.toString());
        return m20481b(file);
    }

    /* renamed from: a */
    public static void m20479a(InputStream inputStream, OutputStream outputStream) throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
        byte[] bArr = new byte[PreloadTask.BYTE_UNIT_NUMBER];
        while (true) {
            int read = bufferedInputStream.read(bArr);
            if (read != -1) {
                bufferedOutputStream.write(bArr, 0, read);
            } else {
                bufferedOutputStream.flush();
                return;
            }
        }
    }
}
