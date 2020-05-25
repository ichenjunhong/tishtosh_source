package kotlinx.coroutines;

import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.C53250bb.C53252b;
import kotlinx.coroutines.C53250bb.C53253c;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2647j.C52753d;

/* renamed from: kotlinx.coroutines.aj */
public final class C53204aj extends C53250bb implements Runnable {
    private static volatile Thread _thread;

    /* renamed from: b */
    public static final C53204aj f131779b;

    /* renamed from: c */
    private static final long f131780c;
    private static volatile int debugStatus;

    private C53204aj() {
    }

    /* renamed from: i */
    private static boolean m113031i() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Thread mo110772a() {
        Thread thread = _thread;
        if (thread == null) {
            return m113032j();
        }
        return thread;
    }

    /* renamed from: j */
    private final synchronized Thread m113032j() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread;
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    /* renamed from: k */
    private final synchronized boolean m113033k() {
        if (m113031i()) {
            return false;
        }
        debugStatus = 1;
        notifyAll();
        return true;
    }

    /* renamed from: l */
    private final synchronized void m113034l() {
        if (m113031i()) {
            debugStatus = 3;
            this._queue = null;
            this._delayed = null;
            notifyAll();
        }
    }

    static {
        Long l;
        C53204aj ajVar = new C53204aj();
        f131779b = ajVar;
        ajVar.mo110837a(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000);
        } catch (SecurityException unused) {
            l = Long.valueOf(1000);
        }
        C52711k.m112236a((Object) l, "try {\n            java.l…AULT_KEEP_ALIVE\n        }");
        f131780c = timeUnit.toNanos(l.longValue());
    }

    public final void run() {
        C53249ba baVar = this;
        C52711k.m112240b(baVar, "eventLoop");
        C53291cg.f131915a.set(baVar);
        try {
            if (m113033k()) {
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long b = mo110838b();
                    if (b == Long.MAX_VALUE) {
                        if (j == Long.MAX_VALUE) {
                            long a = C53293ci.m113275a().mo110775a();
                            if (j == Long.MAX_VALUE) {
                                j = f131780c + a;
                            }
                            long j2 = j - a;
                            if (j2 <= 0) {
                                _thread = null;
                                m113034l();
                                if (!mo110840c()) {
                                    mo110772a();
                                }
                                return;
                            }
                            b = C52753d.m112319b(b, j2);
                        } else {
                            b = C52753d.m112319b(b, f131780c);
                        }
                    }
                    if (b > 0) {
                        if (m113031i()) {
                            _thread = null;
                            m113034l();
                            if (!mo110840c()) {
                                mo110772a();
                            }
                            return;
                        }
                        C53293ci.m113275a().mo110777a(this, b);
                    }
                }
            }
        } finally {
            _thread = null;
            m113034l();
            if (!mo110840c()) {
                mo110772a();
            }
        }
    }

    /* renamed from: a */
    public final C53226aw mo110773a(long j, Runnable runnable) {
        C52711k.m112240b(runnable, "block");
        C53252b bVar = new C53252b(j, runnable);
        f131779b.mo110847a((C53253c) bVar);
        return bVar;
    }
}
