package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.tl */
final /* synthetic */ class C16267tl implements Runnable {

    /* renamed from: a */
    private final C16266tk f45622a;

    /* renamed from: b */
    private final boolean f45623b;

    /* renamed from: c */
    private final JSONObject f45624c;

    /* renamed from: d */
    private final agl f45625d;

    C16267tl(C16266tk tkVar, boolean z, JSONObject jSONObject, agl agl) {
        this.f45622a = tkVar;
        this.f45623b = z;
        this.f45624c = jSONObject;
        this.f45625d = agl;
    }

    public final void run() {
        C16266tk tkVar = this.f45622a;
        boolean z = this.f45623b;
        JSONObject jSONObject = this.f45624c;
        agl agl = this.f45625d;
        try {
            ama a = tkVar.mo31406a();
            if (z) {
                a.mo29153a(anp.m33675c());
            } else {
                a.mo29153a(anp.m33674b());
            }
            tkVar.f45610a.f38515k = a;
            WeakReference weakReference = new WeakReference(a);
            a.mo29197w().mo29205a(tkVar.mo31405a(weakReference), tkVar.mo31408b(weakReference));
            tkVar.mo31407a(a, z);
            a.mo29197w().mo29208a((anl) new C16270to(a, jSONObject));
            a.mo29197w().mo29207a((ank) new C16271tp(tkVar, agl, a));
            a.loadUrl((String) caf.m37099d().mo30717a(C15740bx.f44279bM));
        } catch (Exception e) {
            abv.m32795c("Exception occurred while getting video view", e);
            agl.mo28823b(null);
        }
    }
}
