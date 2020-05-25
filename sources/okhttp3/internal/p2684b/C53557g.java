package okhttp3.internal.p2684b;

import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Proxy.Type;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import okhttp3.C53495a;
import okhttp3.C53498ab;
import okhttp3.C53509af;
import okhttp3.C53524e;
import okhttp3.C53653j;
import okhttp3.C53664p;
import okhttp3.C53676u.C53677a;
import okhttp3.C53682y;
import okhttp3.internal.C53533a;
import okhttp3.internal.C53559c;
import okhttp3.internal.p2684b.C53555f.C53556a;
import okhttp3.internal.p2685c.C53565c;
import okhttp3.internal.p2686d.C53577a;
import okhttp3.internal.p2687e.C53585a;
import okhttp3.internal.p2687e.C53586b;
import okhttp3.internal.p2687e.C53592f;
import okhttp3.internal.p2687e.C53622n;

/* renamed from: okhttp3.internal.b.g */
public final class C53557g {

    /* renamed from: i */
    public static final /* synthetic */ boolean f132716i = (!C53557g.class.desiredAssertionStatus());

    /* renamed from: a */
    public final C53495a f132717a;

    /* renamed from: b */
    public C53509af f132718b;

    /* renamed from: c */
    public final C53653j f132719c;

    /* renamed from: d */
    public final C53524e f132720d;

    /* renamed from: e */
    public final C53664p f132721e;

    /* renamed from: f */
    public int f132722f;

    /* renamed from: g */
    public C53551c f132723g;

    /* renamed from: h */
    public C53565c f132724h;

    /* renamed from: j */
    private C53556a f132725j;

    /* renamed from: k */
    private final Object f132726k;

    /* renamed from: l */
    private final C53555f f132727l;

    /* renamed from: m */
    private int f132728m;

    /* renamed from: n */
    private boolean f132729n;

    /* renamed from: o */
    private boolean f132730o;

    /* renamed from: p */
    private boolean f132731p;

    /* renamed from: okhttp3.internal.b.g$a */
    public static final class C53558a extends WeakReference<C53557g> {

        /* renamed from: a */
        public final Object f132732a;

        C53558a(C53557g gVar, Object obj) {
            super(gVar);
            this.f132732a = obj;
        }
    }

    /* renamed from: a */
    public final void mo111399a(boolean z, C53565c cVar, long j, IOException iOException) {
        C53551c cVar2;
        Socket a;
        boolean z2;
        this.f132721e.responseBodyEnd(this.f132720d, j);
        synchronized (this.f132719c) {
            if (cVar != null) {
                if (cVar == this.f132724h) {
                    if (!z) {
                        this.f132723g.f132692f++;
                        this.f132722f = this.f132723g.f132692f;
                    }
                    cVar2 = this.f132723g;
                    a = mo111394a(z, false, true);
                    if (this.f132723g != null) {
                        cVar2 = null;
                    }
                    z2 = this.f132730o;
                }
            }
            StringBuilder sb = new StringBuilder("expected ");
            sb.append(this.f132724h);
            sb.append(" but was ");
            sb.append(cVar);
            throw new IllegalStateException(sb.toString());
        }
        C53559c.m113806a(a);
        if (cVar2 != null) {
            this.f132721e.connectionReleased(this.f132720d, cVar2);
        }
        if (iOException != null) {
            this.f132721e.callFailed(this.f132720d, iOException);
            return;
        }
        if (z2) {
            this.f132721e.callEnd(this.f132720d);
        }
    }

    /* renamed from: b */
    public final synchronized C53551c mo111400b() {
        return this.f132723g;
    }

    /* renamed from: g */
    private C53553d m113779g() {
        return C53533a.f132616a.mo111342a(this.f132719c);
    }

    /* renamed from: e */
    public final void mo111403e() {
        C53565c cVar;
        C53551c cVar2;
        synchronized (this.f132719c) {
            this.f132731p = true;
            cVar = this.f132724h;
            cVar2 = this.f132723g;
        }
        if (cVar != null) {
            cVar.mo111414c();
            return;
        }
        if (cVar2 != null) {
            cVar2.mo111381c();
        }
    }

    /* renamed from: f */
    public final boolean mo111404f() {
        if (this.f132718b != null || ((this.f132725j != null && this.f132725j.mo111393a()) || this.f132727l.mo111391a())) {
            return true;
        }
        return false;
    }

    public final String toString() {
        C53551c b = mo111400b();
        if (b != null) {
            return b.toString();
        }
        return this.f132717a.toString();
    }

    /* renamed from: a */
    public final C53565c mo111395a() {
        C53565c cVar;
        synchronized (this.f132719c) {
            cVar = this.f132724h;
        }
        return cVar;
    }

    /* renamed from: d */
    public final void mo111402d() {
        C53551c cVar;
        Socket a;
        synchronized (this.f132719c) {
            cVar = this.f132723g;
            a = mo111394a(true, false, false);
            if (this.f132723g != null) {
                cVar = null;
            }
        }
        C53559c.m113806a(a);
        if (cVar != null) {
            this.f132721e.connectionReleased(this.f132720d, cVar);
        }
    }

    /* renamed from: c */
    public final void mo111401c() {
        C53551c cVar;
        Socket a;
        synchronized (this.f132719c) {
            cVar = this.f132723g;
            a = mo111394a(false, true, false);
            if (this.f132723g != null) {
                cVar = null;
            }
        }
        C53559c.m113806a(a);
        if (cVar != null) {
            this.f132721e.connectionReleased(this.f132720d, cVar);
        }
    }

    /* renamed from: a */
    private void m113776a(C53551c cVar) {
        C53498ab a = this.f132720d.mo111245a();
        if (a != null) {
            a.f132383f = m113777b(cVar);
        }
    }

    /* renamed from: b */
    private static String m113777b(C53551c cVar) {
        if (cVar == null && cVar.mo111336a() == null && cVar.mo111336a().f132432c == null) {
            return "";
        }
        return cVar.mo111336a().f132432c.getAddress().getHostAddress();
    }

    /* renamed from: c */
    private void m113778c(C53551c cVar) {
        int size = cVar.f132694h.size();
        for (int i = 0; i < size; i++) {
            if (((Reference) cVar.f132694h.get(i)).get() == this) {
                cVar.f132694h.remove(i);
                return;
            }
        }
        throw new IllegalStateException();
    }

    /* renamed from: a */
    public final void mo111397a(IOException iOException) {
        boolean z;
        C53551c cVar;
        Socket a;
        synchronized (this.f132719c) {
            if (iOException instanceof C53622n) {
                C53622n nVar = (C53622n) iOException;
                if (nVar.errorCode == C53586b.REFUSED_STREAM) {
                    this.f132728m++;
                }
                if (nVar.errorCode != C53586b.REFUSED_STREAM || this.f132728m > 1) {
                    this.f132718b = null;
                }
                z = false;
                cVar = this.f132723g;
                a = mo111394a(z, false, true);
                if (this.f132723g != null || !this.f132729n) {
                    cVar = null;
                }
            } else {
                if (this.f132723g != null && (!this.f132723g.mo111383e() || (iOException instanceof C53585a))) {
                    if (this.f132723g.f132692f == 0) {
                        if (!(this.f132718b == null || iOException == null)) {
                            C53555f fVar = this.f132727l;
                            C53509af afVar = this.f132718b;
                            if (!(afVar.f132431b.type() == Type.DIRECT || fVar.f132706a.f132365g == null)) {
                                fVar.f132706a.f132365g.connectFailed(fVar.f132706a.f132359a.mo111611b(), afVar.f132431b.address(), iOException);
                            }
                            fVar.f132707b.mo111386a(afVar);
                        }
                        this.f132718b = null;
                    }
                }
                z = false;
                cVar = this.f132723g;
                a = mo111394a(z, false, true);
                cVar = null;
            }
            z = true;
            cVar = this.f132723g;
            a = mo111394a(z, false, true);
            cVar = null;
        }
        C53559c.m113806a(a);
        if (cVar != null) {
            this.f132721e.connectionReleased(this.f132720d, cVar);
        }
    }

    /* renamed from: a */
    public final void mo111398a(C53551c cVar, boolean z) {
        if (!f132716i && !Thread.holdsLock(this.f132719c)) {
            throw new AssertionError();
        } else if (this.f132723g == null) {
            this.f132723g = cVar;
            this.f132729n = z;
            cVar.f132694h.add(new C53558a(this, this.f132726k));
        } else {
            throw new IllegalStateException();
        }
    }

    /* renamed from: a */
    public Socket mo111394a(boolean z, boolean z2, boolean z3) {
        Socket socket;
        if (f132716i || Thread.holdsLock(this.f132719c)) {
            if (z3) {
                this.f132724h = null;
            }
            if (z2) {
                this.f132730o = true;
            }
            if (this.f132723g != null) {
                if (z) {
                    this.f132723g.f132691e = true;
                }
                if (this.f132724h == null && (this.f132730o || this.f132723g.f132691e)) {
                    m113778c(this.f132723g);
                    if (this.f132723g.f132694h.isEmpty()) {
                        this.f132723g.f132695i = System.nanoTime();
                        if (C53533a.f132616a.mo111348a(this.f132719c, this.f132723g)) {
                            socket = this.f132723g.mo111337b();
                            this.f132723g = null;
                            return socket;
                        }
                    }
                    socket = null;
                    this.f132723g = null;
                    return socket;
                }
            }
            return null;
        }
        throw new AssertionError();
    }

    /* renamed from: a */
    public final C53565c mo111396a(C53682y yVar, C53677a aVar, boolean z) {
        C53551c cVar;
        C53565c cVar2;
        try {
            cVar = m113775a(aVar.mo111420c(), aVar.mo111421d(), aVar.mo111422e(), yVar.f133191C, yVar.f133214y, z);
            try {
                if (cVar.f132688b != null) {
                    cVar2 = new C53592f(yVar, aVar, this, cVar.f132688b);
                } else {
                    cVar.f132687a.setSoTimeout(aVar.mo111421d());
                    cVar.f132689c.timeout().timeout((long) aVar.mo111421d(), TimeUnit.MILLISECONDS);
                    cVar.f132690d.timeout().timeout((long) aVar.mo111422e(), TimeUnit.MILLISECONDS);
                    cVar2 = new C53577a(yVar, this, cVar.f132689c, cVar.f132690d);
                }
                m113776a(cVar);
                synchronized (this.f132719c) {
                    this.f132724h = cVar2;
                }
                return cVar2;
            } catch (IOException e) {
                e = e;
            }
        } catch (IOException e2) {
            e = e2;
            cVar = null;
            if (cVar != null) {
                m113776a(cVar);
            }
            throw new C53554e(e);
        }
    }

    public C53557g(C53653j jVar, C53495a aVar, C53524e eVar, C53664p pVar, Object obj) {
        this.f132719c = jVar;
        this.f132717a = aVar;
        this.f132720d = eVar;
        this.f132721e = pVar;
        this.f132727l = new C53555f(aVar, m113779g(), eVar, pVar);
        this.f132726k = obj;
    }

    /* renamed from: a */
    private C53551c m113774a(int i, int i2, int i3, int i4, boolean z) throws IOException {
        Socket socket;
        Socket socket2;
        C53551c cVar;
        C53551c cVar2;
        C53509af afVar;
        C53551c cVar3;
        boolean z2;
        boolean z3;
        synchronized (this.f132719c) {
            if (this.f132730o) {
                throw new IllegalStateException("released");
            } else if (this.f132724h != null) {
                throw new IllegalStateException("codec != null");
            } else if (!this.f132731p) {
                C53551c cVar4 = this.f132723g;
                if (!f132716i) {
                    if (!Thread.holdsLock(this.f132719c)) {
                        throw new AssertionError();
                    }
                }
                C53551c cVar5 = this.f132723g;
                socket = null;
                if (cVar5 == null || !cVar5.f132691e) {
                    socket2 = null;
                } else {
                    socket2 = mo111394a(false, false, true);
                }
                if (this.f132723g != null) {
                    cVar2 = this.f132723g;
                    cVar = null;
                } else {
                    cVar = cVar4;
                    cVar2 = null;
                }
                if (!this.f132729n) {
                    cVar = null;
                }
                if (cVar2 == null) {
                    C53533a.f132616a.mo111341a(this.f132719c, this.f132717a, this, null);
                    if (this.f132723g != null) {
                        cVar3 = this.f132723g;
                        afVar = null;
                        z2 = true;
                    } else {
                        afVar = this.f132718b;
                        cVar3 = cVar2;
                    }
                } else {
                    cVar3 = cVar2;
                    afVar = null;
                }
                z2 = false;
            } else {
                throw new IOException("Canceled");
            }
        }
        C53559c.m113806a(socket2);
        if (cVar != null) {
            this.f132721e.connectionReleased(this.f132720d, cVar);
        }
        if (z2) {
            this.f132721e.connectionAcquired(this.f132720d, cVar3);
        }
        if (cVar3 != null) {
            return cVar3;
        }
        if (afVar != null || (this.f132725j != null && this.f132725j.mo111393a())) {
            z3 = false;
        } else {
            this.f132725j = this.f132727l.mo111392b();
            z3 = true;
        }
        synchronized (this.f132719c) {
            if (!this.f132731p) {
                if (z3) {
                    ArrayList arrayList = new ArrayList(this.f132725j.f132714a);
                    int size = arrayList.size();
                    int i5 = 0;
                    while (true) {
                        if (i5 >= size) {
                            break;
                        }
                        C53509af afVar2 = (C53509af) arrayList.get(i5);
                        C53533a.f132616a.mo111341a(this.f132719c, this.f132717a, this, afVar2);
                        if (this.f132723g != null) {
                            cVar3 = this.f132723g;
                            this.f132718b = afVar2;
                            z2 = true;
                            break;
                        }
                        i5++;
                    }
                }
                if (!z2) {
                    if (afVar == null) {
                        C53556a aVar = this.f132725j;
                        if (aVar.mo111393a()) {
                            List<C53509af> list = aVar.f132714a;
                            int i6 = aVar.f132715b;
                            aVar.f132715b = i6 + 1;
                            afVar = (C53509af) list.get(i6);
                        } else {
                            throw new NoSuchElementException();
                        }
                    }
                    this.f132718b = afVar;
                    this.f132728m = 0;
                    cVar3 = new C53551c(this.f132719c, afVar);
                    mo111398a(cVar3, false);
                }
            } else {
                throw new IOException("Canceled");
            }
        }
        if (z2) {
            this.f132721e.connectionAcquired(this.f132720d, cVar3);
            return cVar3;
        }
        cVar3.mo111375a(i, i2, i3, i4, z, this.f132720d, this.f132721e);
        m113779g().mo111387b(cVar3.mo111336a());
        synchronized (this.f132719c) {
            this.f132729n = true;
            C53533a.f132616a.mo111349b(this.f132719c, cVar3);
            if (cVar3.mo111383e()) {
                socket = C53533a.f132616a.mo111339a(this.f132719c, this.f132717a, this);
                cVar3 = this.f132723g;
            }
        }
        C53559c.m113806a(socket);
        this.f132721e.connectionAcquired(this.f132720d, cVar3);
        return cVar3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0018, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        if (r0.mo111380a(r9) != false) goto L_0x0018;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private okhttp3.internal.p2684b.C53551c m113775a(int r4, int r5, int r6, int r7, boolean r8, boolean r9) throws java.io.IOException {
        /*
            r3 = this;
        L_0x0000:
            okhttp3.internal.b.c r0 = r3.m113774a(r4, r5, r6, r7, r8)
            okhttp3.j r1 = r3.f132719c
            monitor-enter(r1)
            int r2 = r0.f132692f     // Catch:{ all -> 0x0019 }
            if (r2 != 0) goto L_0x000d
            monitor-exit(r1)     // Catch:{ all -> 0x0019 }
            return r0
        L_0x000d:
            monitor-exit(r1)     // Catch:{ all -> 0x0019 }
            boolean r1 = r0.mo111380a(r9)
            if (r1 != 0) goto L_0x0018
            r3.mo111402d()
            goto L_0x0000
        L_0x0018:
            return r0
        L_0x0019:
            r4 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0019 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.p2684b.C53557g.m113775a(int, int, int, int, boolean, boolean):okhttp3.internal.b.c");
    }
}
