package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.r */
public abstract class C16860r extends C16859q {

    /* renamed from: a */
    private boolean f47330a;

    protected C16860r(C16862t tVar) {
        super(tVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo31765a();

    /* renamed from: q */
    public final boolean mo32515q() {
        return this.f47330a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final void mo32516r() {
        if (!mo32515q()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: s */
    public final void mo32517s() {
        mo31765a();
        this.f47330a = true;
    }
}
