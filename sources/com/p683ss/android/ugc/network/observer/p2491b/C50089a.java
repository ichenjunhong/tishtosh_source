package com.p683ss.android.ugc.network.observer.p2491b;

import com.p683ss.android.ugc.network.observer.bean.C50094c;
import java.util.HashMap;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.network.observer.b.a */
public final class C50089a {

    /* renamed from: a */
    public static final C50089a f125461a = new C50089a();

    private C50089a() {
    }

    /* renamed from: a */
    public static HashMap<String, Object> m108045a(String str, C50094c cVar) {
        C52711k.m112240b(cVar, "localParam");
        HashMap<String, Object> hashMap = new HashMap<>();
        if (str != null) {
            hashMap.put("unknown_reason", str);
        }
        String str2 = cVar.f125469a;
        if (str2 != null) {
            hashMap.put("top_activity", str2);
        }
        String str3 = cVar.f125470b;
        if (str3 != null) {
            hashMap.put("top_page", str3);
        }
        return hashMap;
    }
}
