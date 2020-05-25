package com.google.android.gms.internal.ads;

import org.json.JSONObject;

@C16299uq
public final class bve implements bvr {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final buv f44035a;

    /* renamed from: b */
    private final ama f44036b;

    /* renamed from: c */
    private final C15948hq<ama> f44037c = new bvf(this);

    /* renamed from: d */
    private final C15948hq<ama> f44038d = new bvg(this);

    /* renamed from: e */
    private final C15948hq<ama> f44039e = new bvh(this);

    public bve(buv buv, ama ama) {
        this.f44035a = buv;
        this.f44036b = ama;
        ama ama2 = this.f44036b;
        ama2.mo29157a("/updateActiveView", this.f44037c);
        ama2.mo29157a("/untrackActiveViewUnit", this.f44038d);
        ama2.mo29157a("/visibilityChanged", this.f44039e);
        String str = "Custom JS tracking ad unit: ";
        String valueOf = String.valueOf(this.f44035a.f43998a.f43987c);
        abv.m32792b(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }

    /* renamed from: a */
    public final boolean mo30773a() {
        return true;
    }

    /* renamed from: a */
    public final void mo30772a(JSONObject jSONObject, boolean z) {
        if (!z) {
            this.f44036b.mo29247b("AFMA_updateActiveView", jSONObject);
        } else {
            this.f44035a.mo30756b((bvr) this);
        }
    }

    /* renamed from: b */
    public final void mo30774b() {
        ama ama = this.f44036b;
        ama.mo29161b("/visibilityChanged", this.f44039e);
        ama.mo29161b("/untrackActiveViewUnit", this.f44038d);
        ama.mo29161b("/updateActiveView", this.f44037c);
    }
}
