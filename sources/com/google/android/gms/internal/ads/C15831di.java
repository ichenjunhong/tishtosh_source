package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.di */
final class C15831di implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C15830dh f44860a;

    C15831di(C15830dh dhVar) {
        this.f44860a = dhVar;
    }

    public final void run() {
        if (this.f44860a.f44846a != null) {
            this.f44860a.f44846a.mo31029l();
            this.f44860a.f44846a.mo31028k();
            this.f44860a.f44846a.mo31031n();
        }
        this.f44860a.f44846a = null;
    }
}
