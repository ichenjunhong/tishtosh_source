package com.p683ss.android.ugc.aweme.p1807im.sdk.utils;

import java.util.LinkedHashMap;
import java.util.Map;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.c */
public final class C35263c {

    /* renamed from: a */
    public static final C35263c f90598a = new C35263c();

    private C35263c() {
    }

    /* renamed from: a */
    public static void m79719a() {
        C35268h.f90601b = "https://api.tiktokv.com/aweme/v1/";
    }

    /* renamed from: b */
    public static boolean m79722b(String str) {
        if (C52711k.m112239a((Object) str, (Object) "https://aweme.snssdk.com/aweme/v1/")) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m79720a(int i) {
        Map linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("error", String.valueOf(i));
        C35265e.m79731b("im_api_domain_error", linkedHashMap);
    }

    /* renamed from: a */
    public static final void m79721a(String str) {
        C52711k.m112240b(str, "domain");
        if (!m79722b(str)) {
            m79719a();
            m79720a(3);
        }
    }
}
