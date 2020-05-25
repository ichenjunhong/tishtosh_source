package com.p683ss.android.ugc.aweme.account.p1277j;

import java.util.HashMap;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.account.j.e */
public final class C21001e extends C20998c {

    /* renamed from: a */
    public static final C21001e f57110a = new C21001e();

    private C21001e() {
    }

    /* renamed from: a */
    public final String mo44981a() {
        return "VerifyCode";
    }

    /* renamed from: b */
    public static final void m53384b() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "on send code success");
        C21001e eVar = f57110a;
        String hashMap2 = hashMap.toString();
        C52711k.m112236a((Object) hashMap2, "map.toString()");
        eVar.mo44982c(hashMap2);
    }

    /* renamed from: a */
    public static final void m53382a(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "on send code error");
        String str3 = "errorCode";
        if (str == null) {
            str = "";
        }
        hashMap.put(str3, str);
        String str4 = "errorMsg";
        if (str2 == null) {
            str2 = "";
        }
        hashMap.put(str4, str2);
        C21001e eVar = f57110a;
        String hashMap2 = hashMap.toString();
        C52711k.m112236a((Object) hashMap2, "map.toString()");
        eVar.mo44982c(hashMap2);
    }

    /* renamed from: a */
    public static final void m53383a(boolean z, String str) {
        String str2;
        HashMap hashMap = new HashMap();
        hashMap.put("event", "send code");
        String str3 = "isVoiceCode";
        if (z) {
            str2 = "true";
        } else {
            str2 = "false";
        }
        hashMap.put(str3, str2);
        String str4 = "mobile";
        if (str == null) {
            str = "";
        }
        hashMap.put(str4, str);
        C21001e eVar = f57110a;
        String hashMap2 = hashMap.toString();
        C52711k.m112236a((Object) hashMap2, "map.toString()");
        eVar.mo44982c(hashMap2);
    }
}
