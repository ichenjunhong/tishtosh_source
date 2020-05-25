package com.google.android.gms.internal.ads;

public abstract class bik implements bha {

    /* renamed from: e */
    public int f42494e;

    /* renamed from: a */
    public void mo30161a(int i, Object obj) throws bgy {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo30181a(long j) throws bgy;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo30196a(long j, long j2) throws bgy;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo30182a(long j, boolean z) throws bgy {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo30185a() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract int mo30199b(long j) throws bgy;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo30188b() throws bgy {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo30189c() throws bgy {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract boolean mo30190d();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract boolean mo30191e();

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract long mo30192f();

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo30193g() throws bgy {
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo30203k() throws bgy {
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public abstract long mo30204l();

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public abstract long mo30205m();

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final int mo30226c(long j) throws bgy {
        boolean z = false;
        blg.m36001b(this.f42494e == 0);
        this.f42494e = mo30199b(j);
        if (this.f42494e == 0 || this.f42494e == 1 || this.f42494e == -1) {
            z = true;
        }
        blg.m36001b(z);
        return this.f42494e;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo30225b(long j, boolean z) throws bgy {
        boolean z2 = true;
        if (this.f42494e != 1) {
            z2 = false;
        }
        blg.m36001b(z2);
        this.f42494e = 2;
        mo30182a(j, z);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public final void mo30227n() throws bgy {
        blg.m36001b(this.f42494e == 2);
        this.f42494e = 3;
        mo30188b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public final void mo30228o() throws bgy {
        blg.m36001b(this.f42494e == 3);
        this.f42494e = 2;
        mo30189c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: p */
    public final void mo30229p() throws bgy {
        blg.m36001b(this.f42494e == 2);
        this.f42494e = 1;
        mo30193g();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: q */
    public final void mo30230q() throws bgy {
        blg.m36001b((this.f42494e == 2 || this.f42494e == 3 || this.f42494e == -2) ? false : true);
        this.f42494e = -2;
        mo30203k();
    }
}
