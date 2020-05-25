package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.C14943ad;
import com.google.android.gms.ads.internal.C14986bt;
import org.json.JSONObject;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.ty */
public final class C16280ty implements C16276tu<ama> {

    /* renamed from: a */
    final C15846dw f45652a;

    /* renamed from: b */
    final Context f45653b;

    /* renamed from: c */
    final C14943ad f45654c;

    /* renamed from: d */
    String f45655d;

    /* renamed from: e */
    private aga<ama> f45656e;

    /* renamed from: f */
    private final zzbgz f45657f;

    /* renamed from: g */
    private final beh f45658g;

    public C16280ty(Context context, C14943ad adVar, String str, beh beh, zzbgz zzbgz) {
        abv.m32796d("Webview loading for native ads.");
        this.f45653b = context;
        this.f45654c = adVar;
        this.f45658g = beh;
        this.f45657f = zzbgz;
        this.f45655d = str;
        Context context2 = this.f45653b;
        zzbgz zzbgz2 = this.f45657f;
        String str2 = (String) caf.m37099d().mo30717a(C15740bx.f44278bL);
        beh beh2 = this.f45658g;
        C14986bt btVar = this.f45654c.f38505i;
        afz a = afp.m32820a(null);
        amh amh = new amh(context2, beh2, zzbgz2, btVar, str2);
        aga a2 = afp.m32822a((aga<A>) a, (afk<? super A, ? extends B>) amh, agf.f40430a);
        this.f45652a = new C15846dw(adVar, str);
        this.f45656e = afp.m32822a(a2, (afk<? super A, ? extends B>) new C16281tz<Object,Object>(this), agf.f40431b);
        afn.m32817a(this.f45656e, "WebViewNativeAdsUtil.constructor");
    }

    /* renamed from: a */
    public final aga<JSONObject> mo31413a(JSONObject jSONObject) {
        return afp.m32822a(this.f45656e, (afk<? super A, ? extends B>) new C16283ua<Object,Object>(this, jSONObject), agf.f40430a);
    }

    /* renamed from: b */
    public final aga<JSONObject> mo31417b(JSONObject jSONObject) {
        return afp.m32822a(this.f45656e, (afk<? super A, ? extends B>) new C16284ub<Object,Object>(this, jSONObject), agf.f40430a);
    }

    /* renamed from: c */
    public final aga<JSONObject> mo31419c(JSONObject jSONObject) {
        return afp.m32822a(this.f45656e, (afk<? super A, ? extends B>) new C16285uc<Object,Object>(this, jSONObject), agf.f40430a);
    }

    /* renamed from: d */
    public final aga<JSONObject> mo31420d(JSONObject jSONObject) {
        return afp.m32822a(this.f45656e, (afk<? super A, ? extends B>) new C16286ud<Object,Object>(this, jSONObject), agf.f40430a);
    }

    /* renamed from: a */
    public final void mo31415a(String str, C15948hq<? super ama> hqVar) {
        afp.m32827a(this.f45656e, (afm<? super V>) new C16288uf<Object>(this, str, hqVar), agf.f40430a);
    }

    /* renamed from: b */
    public final void mo31418b(String str, C15948hq<? super ama> hqVar) {
        afp.m32827a(this.f45656e, (afm<? super V>) new C16289ug<Object>(this, str, hqVar), agf.f40430a);
    }

    /* renamed from: a */
    public final void mo31416a(String str, JSONObject jSONObject) {
        afp.m32827a(this.f45656e, (afm<? super V>) new C16290uh<Object>(this, str, jSONObject), agf.f40430a);
    }

    /* renamed from: a */
    public final void mo31414a() {
        afp.m32827a(this.f45656e, (afm<? super V>) new C16291ui<Object>(this), agf.f40430a);
    }
}
