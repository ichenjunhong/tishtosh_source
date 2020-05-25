package com.bytedance.common.utility.p524d;

import android.text.TextUtils;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;

/* renamed from: com.bytedance.common.utility.d.b */
public final class C9398b {
    /* renamed from: a */
    public static void m18586a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: b */
    public static boolean m18588b(String str) {
        return new File(str).mkdirs();
    }

    /* renamed from: a */
    public static void m18587a(String str) {
        if (!TextUtils.isEmpty(str)) {
            File file = new File(str);
            if (file.exists() && file.isFile()) {
                file.delete();
            }
        }
    }

    /* renamed from: c */
    public static long m18589c(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        File file = new File(str);
        if (!file.exists()) {
            return 0;
        }
        long length = file.length();
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                int i = 0;
                while (i < listFiles.length) {
                    try {
                        length += m18589c(listFiles[i].getAbsolutePath());
                        i++;
                    } catch (StackOverflowError unused) {
                        return 0;
                    } catch (OutOfMemoryError unused2) {
                        return 0;
                    }
                }
            }
        }
        return length;
    }
}
