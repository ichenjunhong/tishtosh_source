package com.p683ss.android.p1147d;

import android.os.Looper;
import android.os.Message;
import com.bytedance.common.utility.p522b.C9379e;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.ss.android.d.j */
public final class C18953j implements C9382a {

    /* renamed from: a */
    public static C18953j f52228a = new C18953j();

    /* renamed from: c */
    public static final AtomicLong f52229c = new AtomicLong();

    /* renamed from: b */
    public long f52230b;

    /* renamed from: d */
    final Object f52231d = new Object();

    /* renamed from: e */
    int f52232e = 0;

    /* renamed from: f */
    int f52233f = 0;

    /* renamed from: g */
    WeakReference<C18933b> f52234g;

    /* renamed from: h */
    public final AtomicLong f52235h = new AtomicLong(0);

    /* renamed from: i */
    public boolean f52236i = false;

    /* renamed from: j */
    public C9381g f52237j = new C9381g(Looper.getMainLooper(), this);

    /* renamed from: k */
    final C9379e<Object> f52238k = new C9379e<>();

    /* renamed from: l */
    public final Runnable f52239l = new Runnable() {
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0043, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r4 = this;
                com.ss.android.d.j r0 = com.p683ss.android.p1147d.C18953j.this
                java.util.concurrent.atomic.AtomicLong r1 = r0.f52235h
                r1.get()
                java.util.concurrent.atomic.AtomicLong r1 = com.p683ss.android.p1147d.C18953j.f52229c
                r1.get()
                com.bytedance.common.utility.b.e<java.lang.Object> r1 = r0.f52238k
                java.util.Iterator r1 = r1.iterator()
            L_0x0012:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L_0x001c
                r1.next()
                goto L_0x0012
            L_0x001c:
                java.lang.Object r1 = r0.f52231d
                monitor-enter(r1)
                int r2 = r0.f52232e     // Catch:{ all -> 0x0044 }
                int r3 = r0.f52233f     // Catch:{ all -> 0x0044 }
                if (r2 == r3) goto L_0x0042
                int r2 = r0.f52232e     // Catch:{ all -> 0x0044 }
                r0.f52233f = r2     // Catch:{ all -> 0x0044 }
                r2 = 0
                java.lang.ref.WeakReference<com.ss.android.d.b> r3 = r0.f52234g     // Catch:{ all -> 0x0044 }
                if (r3 == 0) goto L_0x0036
                java.lang.ref.WeakReference<com.ss.android.d.b> r2 = r0.f52234g     // Catch:{ all -> 0x0044 }
                java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x0044 }
                com.ss.android.d.b r2 = (com.p683ss.android.p1147d.C18933b) r2     // Catch:{ all -> 0x0044 }
            L_0x0036:
                if (r2 != 0) goto L_0x003a
                monitor-exit(r1)     // Catch:{ all -> 0x0044 }
                return
            L_0x003a:
                com.ss.android.d.j$a r3 = new com.ss.android.d.j$a     // Catch:{ all -> 0x0044 }
                r3.<init>(r2)     // Catch:{ all -> 0x0044 }
                r3.start()     // Catch:{ all -> 0x0044 }
            L_0x0042:
                monitor-exit(r1)     // Catch:{ all -> 0x0044 }
                return
            L_0x0044:
                r0 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x0044 }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.p1147d.C18953j.C189541.run():void");
        }
    };

    /* renamed from: com.ss.android.d.j$a */
    class C18955a extends Thread {

        /* renamed from: a */
        final C18933b f52241a;

        public final void run() {
            System.currentTimeMillis();
            long d = C18933b.m46094d();
            System.currentTimeMillis();
            C18953j.this.f52236i = true;
            C18953j.this.f52235h.set(d);
            C18953j.f52229c.set(0);
            C18953j.this.f52237j.post(C18953j.this.f52239l);
        }

        public C18955a(C18933b bVar) {
            super("CacheSizeThread");
            this.f52241a = bVar;
        }
    }

    public final void handleMsg(Message message) {
    }

    private C18953j() {
    }

    /* renamed from: a */
    public final int mo38827a(C18933b bVar) {
        int i;
        boolean z = false;
        if (bVar == null) {
            return 0;
        }
        synchronized (this.f52231d) {
            if (this.f52232e > this.f52233f) {
                z = true;
            }
            this.f52232e++;
            this.f52234g = new WeakReference<>(bVar);
            if (!z) {
                this.f52233f = this.f52232e;
                new C18955a(bVar).start();
            }
            i = this.f52232e;
        }
        return i;
    }
}
