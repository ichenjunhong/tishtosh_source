package com.google.android.gms.internal.ads;

import java.util.Map;

final /* synthetic */ class amt implements Runnable {

    /* renamed from: a */
    private final ams f41048a;

    /* renamed from: b */
    private final Map f41049b;

    amt(ams ams, Map map) {
        this.f41048a = ams;
        this.f41049b = map;
    }

    public final void run() {
        ams ams = this.f41048a;
        ams.f41035a.mo29242a("pubVideoCmd", this.f41049b);
    }
}
