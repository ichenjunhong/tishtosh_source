package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;

@C16299uq
public class bzy {

    /* renamed from: a */
    final bzp f44721a;

    /* renamed from: b */
    final C16221rt f44722b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final bzq f44723c;

    /* renamed from: d */
    private final C15664ax f44724d;

    /* renamed from: e */
    private final C15918gn f44725e;

    /* renamed from: f */
    private final C16402yl f44726f;

    /* renamed from: g */
    private final C16431zn f44727g;

    /* renamed from: h */
    private final C15919go f44728h;

    public bzy(bzq bzq, bzp bzp, C15664ax axVar, C15918gn gnVar, C16402yl ylVar, C16431zn znVar, C16221rt rtVar, C15919go goVar) {
        this.f44723c = bzq;
        this.f44721a = bzp;
        this.f44724d = axVar;
        this.f44725e = gnVar;
        this.f44726f = ylVar;
        this.f44727g = znVar;
        this.f44722b = rtVar;
        this.f44728h = goVar;
    }

    /* renamed from: a */
    static /* synthetic */ void m37057a(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("action", "no_ads_fallback");
        bundle.putString("flow", str);
        caf.m37096a().mo28761a(context, caf.m37101f().f46237a, "gmob-apps", bundle, true);
    }
}
