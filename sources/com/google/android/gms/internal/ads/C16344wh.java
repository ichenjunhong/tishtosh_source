package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.wh */
final class C16344wh implements Runnable {

    /* renamed from: a */
    final /* synthetic */ JSONObject f45804a;

    /* renamed from: b */
    final /* synthetic */ String f45805b;

    /* renamed from: c */
    private final /* synthetic */ C16341we f45806c;

    C16344wh(C16341we weVar, JSONObject jSONObject, String str) {
        this.f45806c = weVar;
        this.f45804a = jSONObject;
        this.f45805b = str;
    }

    public final void run() {
        this.f45806c.f45800m = C16341we.f45789a.mo31173b((beh) null);
        this.f45806c.f45800m.mo28829a(new C16345wi(this), new C16346wj(this));
    }
}
