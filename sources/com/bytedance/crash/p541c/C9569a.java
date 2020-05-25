package com.bytedance.crash.p541c;

import com.bytedance.crash.C9616k;
import java.io.File;

/* renamed from: com.bytedance.crash.c.a */
public final class C9569a {
    /* renamed from: a */
    public static void m18981a() {
        File file = new File(C9616k.m19155g().getFilesDir(), "crashCommand");
        if (file.exists()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    try {
                        file2.getName().split("_")[0].equals("0");
                        file2.delete();
                    } catch (Throwable unused) {
                    }
                }
            }
        }
    }
}
