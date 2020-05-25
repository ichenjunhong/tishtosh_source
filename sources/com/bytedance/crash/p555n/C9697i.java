package com.bytedance.crash.p555n;

import java.io.Closeable;
import java.io.IOException;
import java.util.zip.ZipFile;

/* renamed from: com.bytedance.crash.n.i */
public final class C9697i {
    /* renamed from: a */
    public static void m19370a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m19371a(ZipFile zipFile) {
        if (zipFile != null) {
            try {
                zipFile.close();
            } catch (IOException unused) {
            }
        }
    }
}
