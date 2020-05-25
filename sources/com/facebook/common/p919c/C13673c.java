package com.facebook.common.p919c;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: com.facebook.common.c.c */
public final class C13673c {

    /* renamed from: com.facebook.common.c.c$a */
    public static class C13674a extends IOException {
        public C13674a(String str) {
            super(str);
        }

        public C13674a(String str, Throwable th) {
            super(str);
            initCause(th);
        }
    }

    /* renamed from: com.facebook.common.c.c$b */
    public static class C13675b extends IOException {
        public C13675b(String str) {
            super(str);
        }
    }

    /* renamed from: com.facebook.common.c.c$c */
    public static class C13676c extends FileNotFoundException {
        public C13676c(String str) {
            super(str);
        }
    }

    /* renamed from: com.facebook.common.c.c$d */
    public static class C13677d extends IOException {
        public C13677d(String str) {
            super(str);
        }

        public C13677d(String str, Throwable th) {
            super(str);
            initCause(th);
        }
    }

    /* renamed from: a */
    public static void m27630a(File file) throws C13674a {
        if (file.exists()) {
            if (!file.isDirectory()) {
                if (!file.delete()) {
                    throw new C13674a(file.getAbsolutePath(), new C13675b(file.getAbsolutePath()));
                }
            } else {
                return;
            }
        }
        if (!file.mkdirs() && !file.isDirectory()) {
            throw new C13674a(file.getAbsolutePath());
        }
    }
}
