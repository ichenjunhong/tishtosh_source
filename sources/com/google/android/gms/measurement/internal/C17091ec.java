package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.ec */
abstract class C17091ec extends C17090eb {

    /* renamed from: a */
    private boolean f48233a;

    C17091ec(C17092ed edVar) {
        super(edVar);
        this.f48232b.f48238d++;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract boolean mo32904d();

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public final boolean mo33088i() {
        return this.f48233a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo33089j() {
        if (!mo33088i()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: t */
    public final void mo33090t() {
        if (!this.f48233a) {
            mo32904d();
            this.f48232b.f48239e++;
            this.f48233a = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }
}
