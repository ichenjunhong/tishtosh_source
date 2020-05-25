package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.hf */
final /* synthetic */ class C15937hf implements C15948hq {

    /* renamed from: a */
    static final C15948hq f45030a = new C15937hf();

    private C15937hf() {
    }

    /* renamed from: a */
    public final void mo27606a(Object obj, Map map) {
        ang ang = (ang) obj;
        String str = (String) map.get("tx");
        String str2 = (String) map.get("ty");
        String str3 = (String) map.get("td");
        try {
            int parseInt = Integer.parseInt(str);
            int parseInt2 = Integer.parseInt(str2);
            int parseInt3 = Integer.parseInt(str3);
            beh z = ang.mo29200z();
            if (z != null) {
                z.f42188b.mo27637a(parseInt, parseInt2, parseInt3);
            }
        } catch (NumberFormatException unused) {
            abv.m32798e("Could not parse touch parameters from gmsg.");
        }
    }
}
