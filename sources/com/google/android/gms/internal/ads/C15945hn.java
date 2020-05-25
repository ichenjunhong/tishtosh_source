package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.hn */
final class C15945hn implements C15948hq<ama> {
    C15945hn() {
    }

    /* renamed from: a */
    public final /* synthetic */ void mo27606a(Object obj, Map map) {
        ama ama = (ama) obj;
        if (map.keySet().contains("start")) {
            ama.mo29166e(true);
        }
        if (map.keySet().contains("stop")) {
            ama.mo29166e(false);
        }
    }
}
