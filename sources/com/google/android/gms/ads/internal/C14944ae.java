package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.abb;
import com.google.android.gms.internal.ads.abc;

/* renamed from: com.google.android.gms.ads.internal.ae */
final /* synthetic */ class C14944ae implements Runnable {

    /* renamed from: a */
    private final C14943ad f38523a;

    /* renamed from: b */
    private final abc f38524b;

    C14944ae(C14943ad adVar, abc abc) {
        this.f38523a = adVar;
        this.f38524b = abc;
    }

    public final void run() {
        C14943ad adVar = this.f38523a;
        abb abb = new abb(this.f38524b, null, null, null, null, null, null, null);
        adVar.mo27479b(abb);
    }
}
