package p064c.p065a.p072e.p087j;

import java.util.concurrent.atomic.AtomicReference;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p070c.C1703e;
import p064c.p065a.p072e.p073a.C1718b;
import p064c.p065a.p072e.p074b.C1745b;
import p064c.p065a.p090h.C2150a;

/* renamed from: c.a.e.j.f */
public final class C2129f {
    /* renamed from: a */
    private static String m6419a(String str) {
        StringBuilder sb = new StringBuilder("It is not allowed to subscribe with a(n) ");
        sb.append(str);
        sb.append(" multiple times. Please create a fresh instance of ");
        sb.append(str);
        sb.append(" and subscribe that to the target source instead.");
        return sb.toString();
    }

    /* renamed from: a */
    public static void m6420a(Class<?> cls) {
        C2150a.m6492a((Throwable) new C1703e(m6419a(cls.getName())));
    }

    /* renamed from: a */
    public static boolean m6421a(AtomicReference<C1690c> atomicReference, C1690c cVar, Class<?> cls) {
        C1745b.m6050a(cVar, "next is null");
        if (atomicReference.compareAndSet(null, cVar)) {
            return true;
        }
        cVar.dispose();
        if (atomicReference.get() != C1718b.DISPOSED) {
            m6420a(cls);
        }
        return false;
    }
}
