package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.C15006c;

final /* synthetic */ class amc implements Runnable {

    /* renamed from: a */
    private final amb f40917a;

    amc(amb amb) {
        this.f40917a = amb;
    }

    public final void run() {
        amb amb = this.f40917a;
        amb.f40893a.mo29144H();
        C15006c s = amb.f40893a.mo29187s();
        if (s != null) {
            s.mo27688m();
        }
        if (amb.f40896d != null) {
            amb.f40896d.mo27576a();
            amb.f40896d = null;
        }
    }
}
