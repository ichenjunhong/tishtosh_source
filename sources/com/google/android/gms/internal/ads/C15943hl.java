package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.hl */
final class C15943hl implements C15948hq<ama> {
    C15943hl() {
    }

    /* renamed from: a */
    public final /* synthetic */ void mo27606a(Object obj, Map map) {
        ama ama = (ama) obj;
        String str = (String) map.get("action");
        if ("pause".equals(str)) {
            ama.mo27548C_();
            return;
        }
        if ("resume".equals(str)) {
            ama.mo27549D_();
        }
    }
}
