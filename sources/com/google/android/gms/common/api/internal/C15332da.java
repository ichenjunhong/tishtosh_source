package com.google.android.gms.common.api.internal;

/* renamed from: com.google.android.gms.common.api.internal.da */
final class C15332da implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ LifecycleCallback f39605a;

    /* renamed from: b */
    private final /* synthetic */ String f39606b;

    /* renamed from: c */
    private final /* synthetic */ C15327cz f39607c;

    C15332da(C15327cz czVar, LifecycleCallback lifecycleCallback, String str) {
        this.f39607c = czVar;
        this.f39605a = lifecycleCallback;
        this.f39606b = str;
    }

    public final void run() {
        if (this.f39607c.f39565c > 0) {
            this.f39605a.mo28141a(this.f39607c.f39566d != null ? this.f39607c.f39566d.getBundle(this.f39606b) : null);
        }
        if (this.f39607c.f39565c >= 2) {
            this.f39605a.mo28143b();
        }
        if (this.f39607c.f39565c >= 3) {
            this.f39605a.mo28145c();
        }
        if (this.f39607c.f39565c >= 4) {
            this.f39605a.mo28146d();
        }
    }
}
