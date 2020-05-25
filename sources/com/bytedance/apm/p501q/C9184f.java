package com.bytedance.apm.p501q;

import java.io.Closeable;

/* renamed from: com.bytedance.apm.q.f */
public final class C9184f {
    /* renamed from: a */
    public static void m18231a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }
}
