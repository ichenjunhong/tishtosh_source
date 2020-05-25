package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.he */
final /* synthetic */ class C15936he implements C15948hq {

    /* renamed from: a */
    static final C15948hq f45029a = new C15936he();

    private C15936he() {
    }

    /* renamed from: a */
    public final void mo27606a(Object obj, Map map) {
        amy amy = (amy) obj;
        String str = (String) map.get("u");
        if (str == null) {
            abv.m32798e("URL missing from httpTrack GMSG.");
        } else {
            new aeg(amy.getContext(), ((anh) amy).mo28944k().f46237a, str).mo28619g();
        }
    }
}
