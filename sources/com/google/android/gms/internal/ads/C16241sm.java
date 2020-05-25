package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.sm */
final class C16241sm implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ abb f45539a;

    /* renamed from: b */
    private final /* synthetic */ C16239sk f45540b;

    C16241sm(C16239sk skVar, abb abb) {
        this.f45540b = skVar;
        this.f45539a = abb;
    }

    public final void run() {
        synchronized (this.f45540b.f45534c) {
            C16239sk skVar = this.f45540b;
            skVar.f45532a.mo27479b(this.f45539a);
        }
    }
}
