package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.ht */
final class C15951ht implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ JSONObject f45040a;

    /* renamed from: b */
    private final /* synthetic */ C15950hs f45041b;

    C15951ht(C15950hs hsVar, JSONObject jSONObject) {
        this.f45041b = hsVar;
        this.f45040a = jSONObject;
    }

    public final void run() {
        this.f45041b.f45037a.mo29243a("fetchHttpRequestCompleted", this.f45040a);
        abv.m32792b("Dispatched http response.");
    }
}
