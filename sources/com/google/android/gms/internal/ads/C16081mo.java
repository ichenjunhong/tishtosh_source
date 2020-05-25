package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.mo */
public final class C16081mo extends agr<C16090mx> {

    /* renamed from: a */
    private final Object f45225a = new Object();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C16085ms f45226b;

    /* renamed from: c */
    private boolean f45227c;

    public C16081mo(C16085ms msVar) {
        this.f45226b = msVar;
    }

    /* renamed from: a */
    public final void mo31182a() {
        synchronized (this.f45225a) {
            if (!this.f45227c) {
                this.f45227c = true;
                mo28829a(new C16082mp(this), new agp());
                mo28829a(new C16083mq(this), new C16084mr(this));
            }
        }
    }
}
