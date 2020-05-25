package com.facebook.common.p919c;

import java.io.File;

/* renamed from: com.facebook.common.c.a */
public final class C13671a {
    /* renamed from: b */
    public static boolean m27626b(File file) {
        if (file.isDirectory()) {
            m27625a(file);
        }
        return file.delete();
    }

    /* renamed from: a */
    public static boolean m27625a(File file) {
        File[] listFiles = file.listFiles();
        boolean z = true;
        if (listFiles != null) {
            for (File b : listFiles) {
                z &= m27626b(b);
            }
        }
        return z;
    }

    /* renamed from: a */
    public static void m27624a(File file, C13672b bVar) {
        bVar.mo25487a(file);
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    m27624a(file2, bVar);
                } else {
                    bVar.mo25488b(file2);
                }
            }
        }
        bVar.mo25489c(file);
    }
}
