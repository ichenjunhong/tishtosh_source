package com.google.android.gms.internal.ads;

import android.content.Context;
import org.json.JSONObject;

@C16299uq
public final class bvi implements bvr {

    /* renamed from: a */
    final Context f44043a;

    /* renamed from: b */
    final C15960ib f44044b;

    /* renamed from: c */
    boolean f44045c;

    /* renamed from: d */
    final C15948hq<C16090mx> f44046d = new bvn(this);

    /* renamed from: e */
    final C15948hq<C16090mx> f44047e = new bvo(this);

    /* renamed from: f */
    final C15948hq<C16090mx> f44048f = new bvp(this);

    /* renamed from: g */
    final C15948hq<C16090mx> f44049g = new bvq(this);
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final buv f44050h;

    /* renamed from: i */
    private C16081mo f44051i;

    public bvi(buv buv, C16064ly lyVar, Context context) {
        this.f44050h = buv;
        this.f44043a = context;
        this.f44044b = new C15960ib(this.f44043a);
        this.f44051i = lyVar.mo31173b((beh) null);
        this.f44051i.mo28829a(new bvj(this), new bvk(this));
        String str = "Core JS tracking ad unit: ";
        String valueOf = String.valueOf(this.f44050h.f43998a.f43987c);
        abv.m32792b(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }

    /* renamed from: a */
    public final void mo30772a(JSONObject jSONObject, boolean z) {
        this.f44051i.mo28829a(new bvl(this, jSONObject), new agp());
    }

    /* renamed from: a */
    public final boolean mo30773a() {
        return this.f44045c;
    }

    /* renamed from: b */
    public final void mo30774b() {
        this.f44051i.mo28829a(new bvm(this), new agp());
        this.f44051i.mo31182a();
    }
}
