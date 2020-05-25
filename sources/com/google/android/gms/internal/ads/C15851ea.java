package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.ea */
final class C15851ea implements C15948hq<Object> {

    /* renamed from: a */
    private final /* synthetic */ C16276tu f44932a;

    /* renamed from: b */
    private final /* synthetic */ C15847dx f44933b;

    C15851ea(C15847dx dxVar, C16276tu tuVar) {
        this.f44933b = dxVar;
        this.f44932a = tuVar;
    }

    /* renamed from: a */
    public final void mo27606a(Object obj, Map<String, String> map) {
        ama ama = (ama) this.f44933b.f44925a.get();
        if (ama == null) {
            this.f44932a.mo31418b("/showOverlay", this);
        } else {
            ama.getView().setVisibility(0);
        }
    }
}
