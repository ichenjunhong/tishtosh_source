package p064c.p065a.p072e.p087j;

import p064c.p065a.p072e.p084g.C2094j;
import p064c.p065a.p090h.C2150a;

/* renamed from: c.a.e.j.e */
public final class C2128e {
    /* renamed from: a */
    public static void m6418a() {
        if (!C2150a.m6493a()) {
            return;
        }
        if ((Thread.currentThread() instanceof C2094j) || C2150a.m6499c()) {
            StringBuilder sb = new StringBuilder("Attempt to block on a Scheduler ");
            sb.append(Thread.currentThread().getName());
            sb.append(" that doesn't support blocking operators as they may lead to deadlock");
            throw new IllegalStateException(sb.toString());
        }
    }
}
