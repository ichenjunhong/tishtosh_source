package com.p683ss.android.vesdk;

import android.text.TextUtils;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.zip.ZipFile;

/* renamed from: com.ss.android.vesdk.q */
public final class C50752q {
    /* renamed from: a */
    public static void m109847a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m109849a(ZipFile zipFile) {
        if (zipFile != null) {
            try {
                zipFile.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: b */
    public static boolean m109850b(String str) {
        return new File(str).mkdirs();
    }

    /* renamed from: a */
    public static void m109848a(String str) {
        if (!TextUtils.isEmpty(str)) {
            File file = new File(str);
            if (file.exists() && file.isFile()) {
                file.delete();
            }
        }
    }
}
