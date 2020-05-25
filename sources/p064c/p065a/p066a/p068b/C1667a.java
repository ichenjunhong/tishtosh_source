package p064c.p065a.p066a.p068b;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Callable;
import p064c.p065a.C1675ac;
import p064c.p065a.p066a.p067a.C1666a;
import p064c.p065a.p071d.C1711f;

/* renamed from: c.a.a.b.a */
public final class C1667a {

    /* renamed from: a */
    private static final C1675ac f5807a;

    /* renamed from: c.a.a.b.a$a */
    static final class C1669a {

        /* renamed from: a */
        static final C1675ac f5808a = new C1670b(new Handler(Looper.getMainLooper()), false);
    }

    /* renamed from: a */
    public static C1675ac m5940a() {
        return C1666a.m5937a(f5807a);
    }

    static {
        C1675ac acVar;
        C16681 r0 = new Callable<C1675ac>() {
            public final /* bridge */ /* synthetic */ Object call() throws Exception {
                return C1669a.f5808a;
            }
        };
        C1711f<Callable<C1675ac>, C1675ac> fVar = C1666a.f5805a;
        if (fVar == null) {
            acVar = C1666a.m5938a((Callable<C1675ac>) r0);
        } else {
            acVar = (C1675ac) C1666a.m5939a(fVar, r0);
            if (acVar == null) {
                throw new NullPointerException("Scheduler Callable returned null");
            }
        }
        f5807a = acVar;
    }

    /* renamed from: a */
    public static C1675ac m5941a(Looper looper) {
        return m5942a(looper, false);
    }

    /* renamed from: a */
    private static C1675ac m5942a(Looper looper, boolean z) {
        if (looper != null) {
            return new C1670b(new Handler(looper), false);
        }
        throw new NullPointerException("looper == null");
    }
}
