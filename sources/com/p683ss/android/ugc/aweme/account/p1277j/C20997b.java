package com.p683ss.android.ugc.aweme.account.p1277j;

import java.util.HashMap;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.account.j.b */
public final class C20997b extends C20998c {

    /* renamed from: a */
    public static final C20997b f57106a = new C20997b();

    /* renamed from: c */
    private static final String f57107c = f57107c;

    private C20997b() {
    }

    /* renamed from: a */
    public final String mo44981a() {
        return f57107c;
    }

    /* renamed from: b */
    public static final void m53372b() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "switch account successfully");
        C20997b bVar = f57106a;
        String hashMap2 = hashMap.toString();
        C52711k.m112236a((Object) hashMap2, "map.toString()");
        bVar.mo44982c(hashMap2);
    }

    /* renamed from: a */
    public static final void m53370a(Integer num, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "switch account failed");
        hashMap.put("errorCode", String.valueOf(num));
        String str2 = "errorMsg";
        if (str == null) {
            str = "";
        }
        hashMap.put(str2, str);
        C20997b bVar = f57106a;
        String hashMap2 = hashMap.toString();
        C52711k.m112236a((Object) hashMap2, "map.toString()");
        bVar.mo44982c(hashMap2);
    }

    /* renamed from: a */
    public static final void m53371a(String str, String str2, String str3, String str4) {
        C52711k.m112240b(str, "fromUid");
        C52711k.m112240b(str2, "switchToUid");
        C52711k.m112240b(str4, "from");
        HashMap hashMap = new HashMap();
        hashMap.put("event", "start switch account");
        hashMap.put("from", str4);
        StringBuilder sb = new StringBuilder("from ");
        sb.append(str);
        sb.append(" to ");
        sb.append(str2);
        sb.append(" with ");
        sb.append(str3);
        hashMap.put("extra", sb.toString());
        C20997b bVar = f57106a;
        String hashMap2 = hashMap.toString();
        C52711k.m112236a((Object) hashMap2, "map.toString()");
        bVar.mo44982c(hashMap2);
    }
}
