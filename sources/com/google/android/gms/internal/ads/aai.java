package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.measurement.C15044a;

final /* synthetic */ class aai implements Runnable {

    /* renamed from: a */
    private final aad f40065a;

    /* renamed from: b */
    private final aau f40066b;

    /* renamed from: c */
    private final String f40067c;

    aai(aad aad, aau aau, String str) {
        this.f40065a = aad;
        this.f40066b = aau;
        this.f40067c = str;
    }

    public final void run() {
        aad aad = this.f40065a;
        aau aau = this.f40066b;
        String str = this.f40067c;
        if (((C15044a) aad.f40051b.get()) != null) {
            try {
                aau.mo28569a((C15044a) aad.f40051b.get());
            } catch (Exception e) {
                aad.mo28555a(e, str, false);
            }
        }
    }
}
