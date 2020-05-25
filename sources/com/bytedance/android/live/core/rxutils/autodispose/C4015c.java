package com.bytedance.android.live.core.rxutils.autodispose;

import java.util.concurrent.atomic.AtomicReference;
import p064c.p065a.p070c.C1695a;

/* renamed from: com.bytedance.android.live.core.rxutils.autodispose.c */
final class C4015c extends AtomicReference<Throwable> {
    private static final long serialVersionUID = 3949248817947090603L;

    C4015c() {
    }

    /* renamed from: a */
    public final Throwable mo9412a() {
        Throwable th = (Throwable) get();
        if (th != C4051z.f11202a) {
            return (Throwable) getAndSet(C4051z.f11202a);
        }
        return th;
    }

    /* renamed from: a */
    public final boolean mo9413a(Throwable th) {
        Throwable th2;
        Throwable th3;
        do {
            th2 = (Throwable) get();
            if (th2 == C4051z.f11202a) {
                return false;
            }
            if (th2 == null) {
                th3 = th;
            } else {
                th3 = new C1695a(th2, th);
            }
        } while (!compareAndSet(th2, th3));
        return true;
    }
}
