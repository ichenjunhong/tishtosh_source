package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.by */
final class C16581by implements C16557ba {

    /* renamed from: a */
    private final /* synthetic */ Runnable f46594a;

    /* renamed from: b */
    private final /* synthetic */ C16578bv f46595b;

    C16581by(C16578bv bvVar, Runnable runnable) {
        this.f46595b = bvVar;
        this.f46594a = runnable;
    }

    /* renamed from: a */
    public final void mo31795a(Throwable th) {
        this.f46595b.f46586a.post(this.f46594a);
    }
}
