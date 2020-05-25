package com.bytedance.android.p161c.p172j;

import java.io.File;

/* renamed from: com.bytedance.android.c.j.b */
public final class C2879b implements Runnable {

    /* renamed from: a */
    private File[] f8546a;

    public final void run() {
        if (this.f8546a != null) {
            for (File a : this.f8546a) {
                m8177a(a);
            }
        }
    }

    public C2879b(File[] fileArr) {
        this.f8546a = fileArr;
    }

    /* renamed from: a */
    private void m8177a(File file) {
        if (file != null && file.exists()) {
            if (!file.isDirectory()) {
                file.delete();
                return;
            }
            File[] listFiles = file.listFiles();
            if (listFiles == null || listFiles.length == 0) {
                file.delete();
            }
            for (File file2 : listFiles) {
                if (file2 != null) {
                    if (file2.isDirectory()) {
                        m8177a(file2);
                    } else {
                        file2.delete();
                    }
                }
            }
            file.delete();
        }
    }
}
