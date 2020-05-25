package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.C14986bt;

final /* synthetic */ class amh implements afk {

    /* renamed from: a */
    private final Context f40926a;

    /* renamed from: b */
    private final beh f40927b;

    /* renamed from: c */
    private final zzbgz f40928c;

    /* renamed from: d */
    private final C14986bt f40929d;

    /* renamed from: e */
    private final String f40930e;

    amh(Context context, beh beh, zzbgz zzbgz, C14986bt btVar, String str) {
        this.f40926a = context;
        this.f40927b = beh;
        this.f40928c = zzbgz;
        this.f40929d = btVar;
        this.f40930e = str;
    }

    /* renamed from: a */
    public final aga mo27633a(Object obj) {
        Context context = this.f40926a;
        beh beh = this.f40927b;
        zzbgz zzbgz = this.f40928c;
        C14986bt btVar = this.f40929d;
        String str = this.f40930e;
        ama a = amg.m33346a(context, anp.m33671a(), "", false, false, beh, zzbgz, null, null, btVar, byc.m36979a());
        agk a2 = agk.m32840a(a);
        a.mo29197w().mo29207a((ank) new amj(a2));
        a.loadUrl(str);
        return a2;
    }
}
