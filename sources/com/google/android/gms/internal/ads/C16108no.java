package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.no */
final class C16108no implements agq<C16090mx> {

    /* renamed from: a */
    private final /* synthetic */ C16081mo f45256a;

    /* renamed from: b */
    private final /* synthetic */ Object f45257b;

    /* renamed from: c */
    private final /* synthetic */ agl f45258c;

    /* renamed from: d */
    private final /* synthetic */ C16106nm f45259d;

    C16108no(C16106nm nmVar, C16081mo moVar, Object obj, agl agl) {
        this.f45259d = nmVar;
        this.f45256a = moVar;
        this.f45257b = obj;
        this.f45258c = agl;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo28832a(Object obj) {
        C16090mx mxVar = (C16090mx) obj;
        C16106nm nmVar = this.f45259d;
        C16081mo moVar = this.f45256a;
        Object obj2 = this.f45257b;
        agl agl = this.f45258c;
        try {
            String a = acd.m32575a();
            C15932ha.f45022o.mo31091a(a, (C15965ig) new C16110nq(nmVar, moVar, agl));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", a);
            jSONObject.put("args", nmVar.f45253b.mo31192a(obj2));
            mxVar.mo29247b(nmVar.f45254c, jSONObject);
        } catch (Exception e) {
            agl.mo28822a(e);
            abv.m32793b("Unable to invokeJavascript", e);
            moVar.mo31182a();
        } catch (Throwable th) {
            moVar.mo31182a();
            throw th;
        }
    }
}
