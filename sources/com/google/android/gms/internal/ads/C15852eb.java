package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.eb */
final class C15852eb implements C15948hq<Object> {

    /* renamed from: a */
    private final /* synthetic */ C16276tu f44934a;

    /* renamed from: b */
    private final /* synthetic */ C15847dx f44935b;

    C15852eb(C15847dx dxVar, C16276tu tuVar) {
        this.f44935b = dxVar;
        this.f44934a = tuVar;
    }

    /* renamed from: a */
    public final void mo27606a(Object obj, Map<String, String> map) {
        ama ama = (ama) this.f44935b.f44925a.get();
        if (ama == null) {
            this.f44934a.mo31418b("/hideOverlay", this);
        } else {
            ama.getView().setVisibility(8);
        }
    }
}
