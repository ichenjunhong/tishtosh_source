package p064c.p065a.p066a.p067a;

import java.util.concurrent.Callable;
import p064c.p065a.C1675ac;
import p064c.p065a.p070c.C1700b;
import p064c.p065a.p071d.C1711f;

/* renamed from: c.a.a.a.a */
public final class C1666a {

    /* renamed from: a */
    public static volatile C1711f<Callable<C1675ac>, C1675ac> f5805a;

    /* renamed from: b */
    private static volatile C1711f<C1675ac, C1675ac> f5806b;

    /* renamed from: a */
    public static C1675ac m5937a(C1675ac acVar) {
        if (acVar != null) {
            C1711f<C1675ac, C1675ac> fVar = f5806b;
            if (fVar == null) {
                return acVar;
            }
            return (C1675ac) m5939a(fVar, acVar);
        }
        throw new NullPointerException("scheduler == null");
    }

    /* renamed from: a */
    public static C1675ac m5938a(Callable<C1675ac> callable) {
        try {
            C1675ac acVar = (C1675ac) callable.call();
            if (acVar != null) {
                return acVar;
            }
            throw new NullPointerException("Scheduler Callable returned null");
        } catch (Throwable th) {
            throw C1700b.m6016a(th);
        }
    }

    /* renamed from: a */
    public static <T, R> R m5939a(C1711f<T, R> fVar, T t) {
        try {
            return fVar.apply(t);
        } catch (Throwable th) {
            throw C1700b.m6016a(th);
        }
    }
}
