package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.lm */
final /* synthetic */ class C16052lm implements Runnable {

    /* renamed from: a */
    private final C16050lk f45169a;

    /* renamed from: b */
    private final C15948hq f45170b;

    /* renamed from: c */
    private final Map f45171c;

    C16052lm(C16050lk lkVar, C15948hq hqVar, Map map) {
        this.f45169a = lkVar;
        this.f45170b = hqVar;
        this.f45171c = map;
    }

    public final void run() {
        C16050lk lkVar = this.f45169a;
        this.f45170b.mo27606a(lkVar.f45160b, this.f45171c);
    }
}
