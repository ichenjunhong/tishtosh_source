package com.bytedance.android.live.core.rxutils.autodispose;

import java.util.concurrent.atomic.AtomicReference;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p070c.C1703e;
import p064c.p065a.p090h.C2150a;

/* renamed from: com.bytedance.android.live.core.rxutils.autodispose.n */
final class C4035n {
    /* renamed from: a */
    private static String m10162a(String str) {
        StringBuilder sb = new StringBuilder("It is not allowed to subscribe with a(n) ");
        sb.append(str);
        sb.append(" multiple times. Please create a fresh instance of ");
        sb.append(str);
        sb.append(" and subscribe that to the target source instead.");
        return sb.toString();
    }

    /* renamed from: a */
    public static void m10163a(Class<?> cls) {
        C2150a.m6492a((Throwable) new C1703e(m10162a(cls.getName())));
    }

    /* renamed from: a */
    public static boolean m10164a(AtomicReference<C1690c> atomicReference, C1690c cVar, Class<?> cls) {
        C4041t.m10170a(cVar, "next is null");
        if (atomicReference.compareAndSet(null, cVar)) {
            return true;
        }
        cVar.dispose();
        if (atomicReference.get() != C4020d.DISPOSED) {
            m10163a(cls);
        }
        return false;
    }
}
