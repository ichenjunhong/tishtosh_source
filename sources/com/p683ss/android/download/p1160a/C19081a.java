package com.p683ss.android.download.p1160a;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.bytedance.common.utility.p523c.C9388b;
import com.p683ss.android.download.p1160a.C19083b;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.ss.android.download.a.a */
abstract class C19081a<K, T, E, V, R, C, N extends C19083b<K, T, E, V, R, C, N>> implements C9382a {

    /* renamed from: a */
    public static final AtomicInteger f52539a = new AtomicInteger();

    /* renamed from: g */
    private static final ExecutorService f52540g = C24076h.m58902c();

    /* renamed from: b */
    final String f52541b;

    /* renamed from: c */
    final int f52542c;

    /* renamed from: d */
    final int f52543d;

    /* renamed from: e */
    final Object f52544e;

    /* renamed from: f */
    public final Handler f52545f;

    /* renamed from: h */
    private final HashMap<K, N> f52546h;

    /* renamed from: i */
    private N f52547i;

    /* renamed from: j */
    private N f52548j;

    /* renamed from: k */
    private volatile boolean f52549k;

    /* renamed from: l */
    private final AtomicBoolean f52550l;

    /* renamed from: m */
    private final AtomicBoolean f52551m;

    /* renamed from: n */
    private volatile int f52552n;

    /* renamed from: o */
    private final LinkedList<C19082a> f52553o;

    /* renamed from: p */
    private ArrayList<N> f52554p;

    /* renamed from: com.ss.android.download.a.a$a */
    class C19082a implements Runnable {

        /* renamed from: a */
        N f52555a;

        /* renamed from: b */
        int f52556b;

        public final void run() {
            if (this.f52555a != null) {
                R r = null;
                try {
                    r = C19081a.this.mo39004a(this.f52555a.f52560c, this.f52555a.f52561d, this.f52555a.f52562e);
                } catch (Exception unused) {
                }
                this.f52555a.f52563f = r;
                Message obtainMessage = C19081a.this.f52545f.obtainMessage(1001);
                obtainMessage.obj = this;
                obtainMessage.arg1 = this.f52556b;
                C19081a.this.f52545f.sendMessage(obtainMessage);
                return;
            }
            Message obtainMessage2 = C19081a.this.f52545f.obtainMessage(BaseNotice.CHECK_PROFILE);
            obtainMessage2.obj = this;
            C19081a.this.f52545f.sendMessage(obtainMessage2);
        }

        C19082a() {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract N mo39003a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract R mo39004a(K k, T t, E e);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo39006a(K k, T t, E e, C c, R r);

    /* renamed from: c */
    public void mo39008c() {
        synchronized (this.f52544e) {
            this.f52551m.set(true);
        }
    }

    static {
        new C9388b("AsyncLoader-Worker", true);
    }

    /* renamed from: e */
    private N m46465e() {
        int size = this.f52554p.size();
        if (size <= 0) {
            return mo39003a();
        }
        return (C19083b) this.f52554p.remove(size - 1);
    }

    /* renamed from: f */
    private boolean m46466f() {
        if (this.f52550l.get() || this.f52551m.get() || this.f52547i.f52559b == this.f52548j) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    private N m46467g() {
        if (this.f52550l.get() || this.f52551m.get() || this.f52547i.f52559b == this.f52548j) {
            return null;
        }
        N n = this.f52547i.f52559b;
        m46462a(n);
        n.f52559b = null;
        n.f52558a = null;
        return n;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0003, code lost:
        continue;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:2:0x0003 */
    /* JADX WARNING: Removed duplicated region for block: B:2:0x0003 A[LOOP:0: B:2:0x0003->B:26:0x0003, LOOP_START, SYNTHETIC] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m46468h() {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f52544e
            monitor-enter(r0)
        L_0x0003:
            boolean r1 = r4.m46466f()     // Catch:{ all -> 0x0030 }
            if (r1 == 0) goto L_0x002e
            java.util.LinkedList<com.ss.android.download.a.a$a<>> r1 = r4.f52553o     // Catch:{ Throwable -> 0x0003 }
            java.lang.Object r1 = r1.poll()     // Catch:{ Throwable -> 0x0003 }
            com.ss.android.download.a.a$a r1 = (com.p683ss.android.download.p1160a.C19081a.C19082a) r1     // Catch:{ Throwable -> 0x0003 }
            if (r1 != 0) goto L_0x0015
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            return
        L_0x0015:
            com.ss.android.download.a.b r2 = r4.m46467g()     // Catch:{ Throwable -> 0x0003 }
            if (r2 != 0) goto L_0x0022
            java.util.LinkedList<com.ss.android.download.a.a$a<>> r2 = r4.f52553o     // Catch:{ Throwable -> 0x0003 }
            r2.add(r1)     // Catch:{ Throwable -> 0x0003 }
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            return
        L_0x0022:
            int r3 = r4.f52552n     // Catch:{ Throwable -> 0x0003 }
            r1.f52556b = r3     // Catch:{ Throwable -> 0x0003 }
            r1.f52555a = r2     // Catch:{ Throwable -> 0x0003 }
            java.util.concurrent.ExecutorService r2 = f52540g     // Catch:{ Throwable -> 0x0003 }
            r2.submit(r1)     // Catch:{ Throwable -> 0x0003 }
            goto L_0x0003
        L_0x002e:
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            return
        L_0x0030:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.download.p1160a.C19081a.m46468h():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        return;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo39009d() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f52544e
            monitor-enter(r0)
            java.util.concurrent.atomic.AtomicBoolean r1 = r3.f52550l     // Catch:{ all -> 0x0020 }
            boolean r1 = r1.get()     // Catch:{ all -> 0x0020 }
            if (r1 == 0) goto L_0x000d
            monitor-exit(r0)     // Catch:{ all -> 0x0020 }
            return
        L_0x000d:
            java.util.concurrent.atomic.AtomicBoolean r1 = r3.f52551m     // Catch:{ all -> 0x0020 }
            boolean r1 = r1.get()     // Catch:{ all -> 0x0020 }
            if (r1 == 0) goto L_0x001e
            java.util.concurrent.atomic.AtomicBoolean r1 = r3.f52551m     // Catch:{ all -> 0x0020 }
            r2 = 0
            r1.set(r2)     // Catch:{ all -> 0x0020 }
            r3.m46468h()     // Catch:{ all -> 0x0020 }
        L_0x001e:
            monitor-exit(r0)     // Catch:{ all -> 0x0020 }
            return
        L_0x0020:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0020 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.download.p1160a.C19081a.mo39009d():void");
    }

    /* renamed from: b */
    public void mo39007b() {
        synchronized (this.f52544e) {
            if (!this.f52550l.get()) {
                f52539a.decrementAndGet();
                this.f52550l.set(true);
                for (C19083b a : this.f52546h.values()) {
                    a.mo39011a();
                }
                this.f52546h.clear();
                this.f52547i.f52559b = this.f52548j;
                this.f52548j.f52558a = this.f52547i;
            }
        }
        this.f52545f.removeMessages(1001);
    }

    /* renamed from: a */
    private static void m46462a(N n) {
        n.f52558a.f52559b = n.f52559b;
        n.f52559b.f52558a = n.f52558a;
    }

    /* renamed from: b */
    private void m46464b(N n) {
        if (n != null) {
            n.f52560c = null;
            n.f52558a = null;
            n.f52559b = null;
            n.f52562e = null;
            n.f52561d = null;
            n.f52563f = null;
            n.mo39011a();
            if (this.f52554p.size() < 50) {
                this.f52554p.add(n);
            }
        }
    }

    public void handleMsg(Message message) {
        C19083b bVar;
        if (message.what == 1001 || message.what == 1002) {
            C19082a aVar = (C19082a) message.obj;
            if (aVar != null) {
                synchronized (this.f52544e) {
                    if (message.what == 1001) {
                        bVar = aVar.f52555a;
                    } else {
                        bVar = null;
                    }
                    aVar.f52555a = null;
                    aVar.f52556b = 0;
                    this.f52553o.add(aVar);
                    if (bVar != null) {
                        if (!this.f52550l.get() && message.arg1 == this.f52552n) {
                            this.f52546h.remove(bVar.f52560c);
                        }
                        mo39006a(bVar.f52560c, bVar.f52561d, bVar.f52562e, bVar.mo39013b(), bVar.f52563f);
                        m46464b(bVar);
                    }
                }
                m46468h();
            }
        }
    }

    /* renamed from: a */
    private static void m46463a(N n, N n2) {
        n2.f52559b = n.f52559b;
        n2.f52558a = n;
        n2.f52559b.f52558a = n2;
        n.f52559b = n2;
    }

    protected C19081a(int i, int i2, String str) {
        this(i, i2, str, false);
    }

    /* renamed from: a */
    public void mo39005a(K k, T t, E e, V v) {
        if (k != null) {
            synchronized (this.f52544e) {
                if (!this.f52550l.get()) {
                    C19083b bVar = (C19083b) this.f52546h.get(k);
                    if (bVar != null) {
                        if (v != null) {
                            bVar.mo39012a(v);
                        }
                        if (!(bVar.f52559b == null || bVar.f52558a == null || bVar.f52558a == this.f52547i)) {
                            m46462a(bVar);
                            m46463a(this.f52547i, bVar);
                        }
                    } else {
                        C19083b e2 = m46465e();
                        e2.f52560c = k;
                        e2.f52561d = t;
                        if (v != null) {
                            e2.mo39012a(v);
                        }
                        e2.f52562e = e;
                        m46463a(this.f52547i, e2);
                        this.f52546h.put(k, e2);
                        if (this.f52546h.size() > this.f52542c) {
                            this.f52546h.remove(this.f52548j.f52558a.f52560c);
                            N n = this.f52548j.f52558a;
                            m46462a(this.f52548j.f52558a);
                            m46464b(n);
                        }
                    }
                    m46468h();
                }
            }
        }
    }

    protected C19081a(int i, int i2, String str, boolean z) {
        this.f52544e = new Object();
        this.f52549k = false;
        this.f52553o = new LinkedList<>();
        this.f52554p = new ArrayList<>();
        if (i2 > 0) {
            if (i <= i2) {
                i = i2 + 1;
            }
            this.f52542c = i;
            this.f52543d = i2;
            this.f52541b = str;
            this.f52552n = 1;
            this.f52550l = new AtomicBoolean();
            this.f52551m = new AtomicBoolean();
            this.f52546h = new HashMap<>();
            if (!this.f52549k) {
                this.f52547i = m46465e();
                this.f52548j = m46465e();
                this.f52547i.f52559b = this.f52548j;
                this.f52548j.f52558a = this.f52547i;
                this.f52549k = true;
            }
            if (z) {
                this.f52545f = new C9381g(Looper.getMainLooper(), this);
            } else {
                this.f52545f = new C9381g(this);
            }
            for (int i3 = 0; i3 < i2; i3++) {
                this.f52553o.add(new C19082a());
            }
            return;
        }
        throw new IllegalArgumentException("maxWorker must be great than 1");
    }
}
