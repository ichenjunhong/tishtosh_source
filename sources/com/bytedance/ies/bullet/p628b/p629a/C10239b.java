package com.bytedance.ies.bullet.p628b.p629a;

import java.io.File;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.ies.bullet.b.a.b */
public final class C10239b {
    /* renamed from: a */
    public static final File m20715a(File file, C52671b<? super File, Boolean> bVar) {
        C52711k.m112240b(file, "$this$searchDir");
        C52711k.m112240b(bVar, "matcher");
        if (!file.exists()) {
            file = null;
        }
        if (file != null) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    if (((Boolean) bVar.invoke(file2)).booleanValue()) {
                        return file2;
                    }
                }
                return null;
            }
        }
        return null;
    }
}
