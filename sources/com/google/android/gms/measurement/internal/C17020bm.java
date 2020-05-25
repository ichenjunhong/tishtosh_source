package com.google.android.gms.measurement.internal;

import android.text.TextUtils;

/* renamed from: com.google.android.gms.measurement.internal.bm */
final class C17020bm implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ zzag f48028a;

    /* renamed from: b */
    private final /* synthetic */ zzk f48029b;

    /* renamed from: c */
    private final /* synthetic */ C17008ba f48030c;

    C17020bm(C17008ba baVar, zzag zzag, zzk zzk) {
        this.f48030c = baVar;
        this.f48028a = zzag;
        this.f48029b = zzk;
    }

    public final void run() {
        zzag zzag;
        C17008ba baVar = this.f48030c;
        zzag zzag2 = this.f48028a;
        zzk zzk = this.f48029b;
        boolean z = false;
        if (!(!"_cmp".equals(zzag2.f48475a) || zzag2.f48476b == null || zzag2.f48476b.mo33382a() == 0)) {
            String d = zzag2.f48476b.mo33387d("_cis");
            if (!TextUtils.isEmpty(d) && (("referrer broadcast".equals(d) || "referrer API".equals(d)) && baVar.f47992a.mo33100b().mo33286g(zzk.f48487a))) {
                z = true;
            }
        }
        if (z) {
            baVar.f47992a.mo32854q().f48451h.mo33377a("Event has been filtered ", zzag2.toString());
            zzag = new zzag("_cmpx", zzag2.f48476b, zzag2.f48477c, zzag2.f48478d);
        } else {
            zzag = zzag2;
        }
        this.f48030c.f47992a.mo33116o();
        this.f48030c.f47992a.mo33094a(zzag, this.f48029b);
    }
}
