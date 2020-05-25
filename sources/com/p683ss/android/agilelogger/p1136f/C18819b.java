package com.p683ss.android.agilelogger.p1136f;

import java.io.Closeable;
import java.io.IOException;
import java.util.zip.ZipFile;

/* renamed from: com.ss.android.agilelogger.f.b */
public final class C18819b {
    /* renamed from: a */
    public static void m45904a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m45905a(ZipFile zipFile) {
        if (zipFile != null) {
            try {
                zipFile.close();
            } catch (IOException unused) {
            }
        }
    }
}
