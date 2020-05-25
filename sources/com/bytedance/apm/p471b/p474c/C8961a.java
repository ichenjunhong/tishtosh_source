package com.bytedance.apm.p471b.p474c;

import com.bytedance.apm.p471b.p473b.C8956a;
import com.bytedance.apm.p471b.p474c.p475a.C8964b;
import com.bytedance.apm.p485h.C9040b;
import com.bytedance.apm.p497o.C9149b;

/* renamed from: com.bytedance.apm.b.c.a */
public abstract class C8961a<T extends C8964b> extends C8969c<T> implements C8975i {

    /* renamed from: e */
    private volatile int f24387e;

    /* renamed from: f */
    private long f24388f;

    /* renamed from: g */
    private int f24389g;

    /* renamed from: h */
    private long f24390h;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo16244a(double d, double d2);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo16246a(T t, long j);

    /* renamed from: b */
    public final void mo16248b() {
        if (this.f24387e > 0 && this.f24390h > 0) {
            long currentTimeMillis = System.currentTimeMillis();
            m17688a(currentTimeMillis - this.f24390h, this.f24411c);
            this.f24390h = currentTimeMillis;
        }
        super.mo16248b();
    }

    /* renamed from: c */
    public final void mo16249c() {
        if (this.f24387e > 0) {
            long currentTimeMillis = System.currentTimeMillis();
            m17688a(currentTimeMillis - this.f24390h, this.f24411c);
            this.f24390h = currentTimeMillis;
        }
        super.mo16249c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final synchronized void mo16250d() {
        this.f24387e++;
        if (this.f24387e == 1) {
            this.f24390h = System.currentTimeMillis();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final synchronized void mo16251e() {
        this.f24387e--;
        if (this.f24387e == 0) {
            m17688a(System.currentTimeMillis() - this.f24390h, this.f24411c);
            this.f24390h = -1;
        }
    }

    C8961a(String str) {
        super(str);
    }

    /* renamed from: a */
    private void m17688a(final long j, final boolean z) {
        C9149b.m18170a().mo16524a((Runnable) new Runnable() {
            public final void run() {
                C9040b bVar = new C9040b(z, System.currentTimeMillis(), C8961a.this.f24409a, j);
                C8956a.m17674a().mo16233a(bVar);
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo16245a(long j, long j2) {
        this.f24389g = 0;
        this.f24388f = 0;
        if (this.f24387e > 0 && this.f24390h > 0) {
            long currentTimeMillis = System.currentTimeMillis();
            m17688a(currentTimeMillis - this.f24390h, this.f24411c);
            this.f24390h = currentTimeMillis;
        }
        super.mo16245a(j, j2);
        long currentTimeMillis2 = System.currentTimeMillis();
        double d = (double) this.f24388f;
        double d2 = (double) (currentTimeMillis2 - this.f24410b);
        Double.isNaN(d);
        Double.isNaN(d2);
        double d3 = (d / d2) * 60000.0d * 10.0d;
        double d4 = (double) this.f24389g;
        double d5 = (double) (currentTimeMillis2 - this.f24410b);
        Double.isNaN(d4);
        Double.isNaN(d5);
        mo16244a(d3, (d4 / d5) * 60000.0d * 10.0d);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo16247a(T t, long j, long j2) {
        this.f24389g++;
        long j3 = t.f24397d;
        if (j3 >= j) {
            j = j3;
        }
        long j4 = t.f24398e;
        if (j4 > 0 && j2 >= j4) {
            j2 = j4;
        }
        mo16246a(t, j2 - t.f24397d);
        long j5 = j2 - j;
        if (j5 > 0) {
            this.f24388f += j5;
        }
    }
}
