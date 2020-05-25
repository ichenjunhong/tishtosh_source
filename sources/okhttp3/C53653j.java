package okhttp3;

import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.C53559c;
import okhttp3.internal.p2684b.C53551c;
import okhttp3.internal.p2684b.C53553d;
import okhttp3.internal.p2684b.C53557g;
import okhttp3.internal.p2684b.C53557g.C53558a;
import okhttp3.internal.p2689g.C53634f;

/* renamed from: okhttp3.j */
public final class C53653j {

    /* renamed from: a */
    static final Executor f133074a;

    /* renamed from: g */
    static final /* synthetic */ boolean f133075g = (!C53653j.class.desiredAssertionStatus());

    /* renamed from: b */
    final int f133076b;

    /* renamed from: c */
    final Runnable f133077c;

    /* renamed from: d */
    final Deque<C53551c> f133078d;

    /* renamed from: e */
    final C53553d f133079e;

    /* renamed from: f */
    boolean f133080f;

    /* renamed from: h */
    private final long f133081h;

    public C53653j() {
        this(5, 5, TimeUnit.MINUTES);
    }

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), C53559c.m113803a("OkHttp ConnectionPool", true));
        f133074a = threadPoolExecutor;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final long mo111552a(long j) {
        int size;
        synchronized (this) {
            long j2 = Long.MIN_VALUE;
            C53551c cVar = null;
            int i = 0;
            int i2 = 0;
            for (C53551c cVar2 : this.f133078d) {
                List<Reference<C53557g>> list = cVar2.f132694h;
                int i3 = 0;
                while (true) {
                    if (i3 >= list.size()) {
                        size = list.size();
                        break;
                    }
                    Reference reference = (Reference) list.get(i3);
                    if (reference.get() != null) {
                        i3++;
                    } else {
                        C53558a aVar = (C53558a) reference;
                        StringBuilder sb = new StringBuilder("A connection to ");
                        sb.append(cVar2.mo111336a().f132430a.f132359a);
                        sb.append(" was leaked. Did you forget to close a response body?");
                        C53634f.m114048c().mo111505a(sb.toString(), aVar.f132732a);
                        list.remove(i3);
                        cVar2.f132691e = true;
                        if (list.isEmpty()) {
                            cVar2.f132695i = j - this.f133081h;
                            size = 0;
                            break;
                        }
                    }
                }
                if (size > 0) {
                    i2++;
                } else {
                    i++;
                    long j3 = j - cVar2.f132695i;
                    if (j3 > j2) {
                        cVar = cVar2;
                        j2 = j3;
                    }
                }
            }
            if (j2 < this.f133081h) {
                if (i <= this.f133076b) {
                    if (i > 0) {
                        long j4 = this.f133081h - j2;
                        return j4;
                    } else if (i2 > 0) {
                        long j5 = this.f133081h;
                        return j5;
                    } else {
                        this.f133080f = false;
                        return -1;
                    }
                }
            }
            this.f133078d.remove(cVar);
            C53559c.m113806a(cVar.mo111337b());
            return 0;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Socket mo111553a(C53495a aVar, C53557g gVar) {
        if (f133075g || Thread.holdsLock(this)) {
            for (C53551c cVar : this.f133078d) {
                if (cVar.mo111378a(aVar, null) && cVar.mo111383e() && cVar != gVar.mo111400b()) {
                    if (!C53557g.f132716i && !Thread.holdsLock(gVar.f132719c)) {
                        throw new AssertionError();
                    } else if (gVar.f132724h == null && gVar.f132723g.f132694h.size() == 1) {
                        Reference reference = (Reference) gVar.f132723g.f132694h.get(0);
                        Socket a = gVar.mo111394a(true, false, false);
                        gVar.f132723g = cVar;
                        cVar.f132694h.add(reference);
                        return a;
                    } else {
                        throw new IllegalStateException();
                    }
                }
            }
            return null;
        }
        throw new AssertionError();
    }

    public C53653j(int i, long j, TimeUnit timeUnit) {
        this.f133077c = new Runnable() {
            /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
            /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x002b */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                    r6 = this;
                L_0x0000:
                    okhttp3.j r0 = okhttp3.C53653j.this
                    long r1 = java.lang.System.nanoTime()
                    long r0 = r0.mo111552a(r1)
                    r2 = -1
                    int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                    if (r4 != 0) goto L_0x0011
                    return
                L_0x0011:
                    r2 = 0
                    int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                    if (r4 <= 0) goto L_0x0000
                    r2 = 1000000(0xf4240, double:4.940656E-318)
                    long r4 = r0 / r2
                    long r2 = r2 * r4
                    long r0 = r0 - r2
                    okhttp3.j r2 = okhttp3.C53653j.this
                    monitor-enter(r2)
                    okhttp3.j r3 = okhttp3.C53653j.this     // Catch:{ InterruptedException -> 0x002b }
                    int r0 = (int) r0     // Catch:{ InterruptedException -> 0x002b }
                    r3.wait(r4, r0)     // Catch:{ InterruptedException -> 0x002b }
                    goto L_0x002b
                L_0x0029:
                    r0 = move-exception
                    goto L_0x002d
                L_0x002b:
                    monitor-exit(r2)     // Catch:{ all -> 0x0029 }
                    goto L_0x0000
                L_0x002d:
                    monitor-exit(r2)     // Catch:{ all -> 0x0029 }
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: okhttp3.C53653j.C536541.run():void");
            }
        };
        this.f133078d = new ArrayDeque();
        this.f133079e = new C53553d();
        this.f133076b = i;
        this.f133081h = timeUnit.toNanos(j);
        if (j <= 0) {
            StringBuilder sb = new StringBuilder("keepAliveDuration <= 0: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        }
    }
}
