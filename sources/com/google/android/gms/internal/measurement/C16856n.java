package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.n */
final class C16856n implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f47322a;

    /* renamed from: b */
    private final /* synthetic */ Runnable f47323b;

    /* renamed from: c */
    private final /* synthetic */ C16849l f47324c;

    C16856n(C16849l lVar, String str, Runnable runnable) {
        this.f47324c = lVar;
        this.f47322a = str;
        this.f47323b = runnable;
    }

    public final void run() {
        this.f47324c.f47303a.mo31787a(this.f47322a);
        if (this.f47323b != null) {
            this.f47323b.run();
        }
    }
}
