package p2628d.p2638e;

import java.io.Closeable;
import p2628d.C52546a;

/* renamed from: d.e.c */
public final class C52647c {
    /* renamed from: a */
    public static final void m112189a(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                C52546a.m112152a(th, th2);
            }
        }
    }
}
