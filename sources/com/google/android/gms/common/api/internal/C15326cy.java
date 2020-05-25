package com.google.android.gms.common.api.internal;

/* renamed from: com.google.android.gms.common.api.internal.cy */
final class C15326cy implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ LifecycleCallback f39560a;

    /* renamed from: b */
    private final /* synthetic */ String f39561b;

    /* renamed from: c */
    private final /* synthetic */ C15325cx f39562c;

    C15326cy(C15325cx cxVar, LifecycleCallback lifecycleCallback, String str) {
        this.f39562c = cxVar;
        this.f39560a = lifecycleCallback;
        this.f39561b = str;
    }

    public final void run() {
        if (this.f39562c.f39558c > 0) {
            this.f39560a.mo28141a(this.f39562c.f39559d != null ? this.f39562c.f39559d.getBundle(this.f39561b) : null);
        }
        if (this.f39562c.f39558c >= 2) {
            this.f39560a.mo28143b();
        }
        if (this.f39562c.f39558c >= 3) {
            this.f39560a.mo28145c();
        }
        if (this.f39562c.f39558c >= 4) {
            this.f39560a.mo28146d();
        }
    }
}
