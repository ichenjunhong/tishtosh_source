package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.bv */
abstract class C17029bv extends C17028bu {

    /* renamed from: a */
    private boolean f48053a;

    C17029bv(C17005ay ayVar) {
        super(ayVar);
        this.f48052r.f47971j++;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract boolean mo32871d();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo32872e() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: v */
    public final boolean mo32979v() {
        return this.f48053a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final void mo32980w() {
        if (!mo32979v()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: x */
    public final void mo32981x() {
        if (this.f48053a) {
            throw new IllegalStateException("Can't initialize twice");
        } else if (!mo32871d()) {
            this.f48052r.mo32938u();
            this.f48053a = true;
        }
    }

    /* renamed from: y */
    public final void mo32982y() {
        if (!this.f48053a) {
            mo32872e();
            this.f48052r.mo32938u();
            this.f48053a = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }
}
