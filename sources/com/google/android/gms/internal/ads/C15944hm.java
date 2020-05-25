package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.hm */
final class C15944hm implements C15948hq<ama> {
    C15944hm() {
    }

    /* renamed from: a */
    public final /* synthetic */ void mo27606a(Object obj, Map map) {
        ama ama = (ama) obj;
        if (map.keySet().contains("start")) {
            ama.mo29197w().mo29222h();
        } else if (map.keySet().contains("stop")) {
            ama.mo29197w().mo29223i();
        } else {
            if (map.keySet().contains("cancel")) {
                ama.mo29197w().mo29224j();
            }
        }
    }
}
