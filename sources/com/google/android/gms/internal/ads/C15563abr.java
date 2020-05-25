package com.google.android.gms.internal.ads;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.abr */
public abstract class C15563abr implements acz<aga> {

    /* renamed from: a */
    private final Runnable f40208a = new C15564abs(this);

    /* renamed from: b */
    private boolean f40209b = false;

    /* renamed from: g */
    volatile Thread f40210g;

    public C15563abr() {
    }

    /* renamed from: a */
    public abstract void mo27696a();

    /* renamed from: x_ */
    public abstract void mo27697x_();

    public C15563abr(boolean z) {
    }

    /* renamed from: g */
    public final aga mo28619g() {
        if (!this.f40209b) {
            return acb.m32566a(this.f40208a);
        }
        return acb.f40241b.mo28780a(this.f40208a);
    }

    /* renamed from: b */
    public final void mo28617b() {
        mo27697x_();
        if (this.f40210g != null) {
            this.f40210g.interrupt();
        }
    }

    /* renamed from: c */
    public final /* synthetic */ Object mo28618c() {
        if (!this.f40209b) {
            return acb.m32566a(this.f40208a);
        }
        return acb.f40241b.mo28780a(this.f40208a);
    }
}
