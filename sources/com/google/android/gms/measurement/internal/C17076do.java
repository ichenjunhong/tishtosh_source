package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.do */
abstract class C17076do extends C17053cs {

    /* renamed from: a */
    private boolean f48204a;

    C17076do(C17005ay ayVar) {
        super(ayVar);
        this.f48052r.f47971j++;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public abstract boolean mo32997t();

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo33071u() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: B */
    public final boolean mo33067B() {
        return this.f48204a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final void mo33068C() {
        if (!mo33067B()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: D */
    public final void mo33069D() {
        if (this.f48204a) {
            throw new IllegalStateException("Can't initialize twice");
        } else if (!mo32997t()) {
            this.f48052r.mo32938u();
            this.f48204a = true;
        }
    }

    /* renamed from: E */
    public final void mo33070E() {
        if (!this.f48204a) {
            mo33071u();
            this.f48052r.mo32938u();
            this.f48204a = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }
}
