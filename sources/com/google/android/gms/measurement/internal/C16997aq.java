package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver.PendingResult;
import android.content.Context;
import android.os.Bundle;

/* renamed from: com.google.android.gms.measurement.internal.aq */
final class C16997aq implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C17005ay f47921a;

    /* renamed from: b */
    private final /* synthetic */ long f47922b;

    /* renamed from: c */
    private final /* synthetic */ Bundle f47923c;

    /* renamed from: d */
    private final /* synthetic */ Context f47924d;

    /* renamed from: e */
    private final /* synthetic */ C17133r f47925e;

    /* renamed from: f */
    private final /* synthetic */ PendingResult f47926f;

    C16997aq(C16995ao aoVar, C17005ay ayVar, long j, Bundle bundle, Context context, C17133r rVar, PendingResult pendingResult) {
        this.f47921a = ayVar;
        this.f47922b = j;
        this.f47923c = bundle;
        this.f47924d = context;
        this.f47925e = rVar;
        this.f47926f = pendingResult;
    }

    public final void run() {
        long a = this.f47921a.mo32923b().f47880i.mo32882a();
        long j = this.f47922b;
        if (a > 0 && (j >= a || j <= 0)) {
            j = a - 1;
        }
        if (j > 0) {
            this.f47923c.putLong("click_timestamp", j);
        }
        this.f47923c.putString("_cis", "referrer broadcast");
        C17005ay.m41256a(this.f47924d, (C17128m) null).mo32925d().mo32991a("auto", "_cmp", this.f47923c);
        this.f47925e.f48453j.mo33376a("Install campaign recorded");
        if (this.f47926f != null) {
            this.f47926f.finish();
        }
    }
}
