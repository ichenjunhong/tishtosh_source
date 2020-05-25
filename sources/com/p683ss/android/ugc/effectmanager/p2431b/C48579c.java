package com.p683ss.android.ugc.effectmanager.p2431b;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

/* renamed from: com.ss.android.ugc.effectmanager.b.c */
final class C48579c {

    /* renamed from: a */
    static final Charset f122128a = Charset.forName("US-ASCII");

    /* renamed from: b */
    static final Charset f122129b = Charset.forName("UTF-8");

    /* renamed from: a */
    static void m105103a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    static void m105104a(File file) throws IOException {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            int length = listFiles.length;
            int i = 0;
            while (i < length) {
                File file2 = listFiles[i];
                if (file2.isDirectory()) {
                    m105104a(file2);
                }
                if (file2.delete()) {
                    i++;
                } else {
                    StringBuilder sb = new StringBuilder("failed to delete file: ");
                    sb.append(file2);
                    throw new IOException(sb.toString());
                }
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder("not a readable directory: ");
        sb2.append(file);
        throw new IOException(sb2.toString());
    }
}
