package com.p683ss.android.ugc.aweme.account.p1277j;

import java.util.HashMap;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.account.j.d */
public final class C21000d extends C20998c {

    /* renamed from: a */
    public static final C21000d f57109a = new C21000d();

    private C21000d() {
    }

    /* renamed from: a */
    public final String mo44981a() {
        return "Captcha";
    }

    /* renamed from: b */
    public static final void m53378b() {
        f57109a.mo44982c("on refresh captcha");
    }

    /* renamed from: a */
    public static final void m53376a(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "on ok");
        String str3 = "captcha";
        if (str == null) {
            str = "";
        }
        hashMap.put(str3, str);
        String str4 = "scenario";
        if (str2 == null) {
            str2 = "";
        }
        hashMap.put(str4, str2);
        C21000d dVar = f57109a;
        String hashMap2 = hashMap.toString();
        C52711k.m112236a((Object) hashMap2, "map.toString()");
        dVar.mo44982c(hashMap2);
    }

    /* renamed from: b */
    public static final void m53379b(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "on refresh captcha success");
        String str3 = "captcha";
        if (str == null) {
            str = "";
        }
        hashMap.put(str3, str);
        String str4 = "scenario";
        if (str2 == null) {
            str2 = "";
        }
        hashMap.put(str4, str2);
        C21000d dVar = f57109a;
        String hashMap2 = hashMap.toString();
        C52711k.m112236a((Object) hashMap2, "map.toString()");
        dVar.mo44982c(hashMap2);
    }

    /* renamed from: c */
    public static final void m53380c(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "on refresh captcha error");
        String str3 = "errCode";
        if (str == null) {
            str = "";
        }
        hashMap.put(str3, str);
        String str4 = "errorMsg";
        if (str2 == null) {
            str2 = "";
        }
        hashMap.put(str4, str2);
        C21000d dVar = f57109a;
        String hashMap2 = hashMap.toString();
        C52711k.m112236a((Object) hashMap2, "map.toString()");
        dVar.mo44982c(hashMap2);
    }

    /* renamed from: a */
    public static final void m53377a(String str, String str2, String str3) {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "on show captcha");
        String str4 = "captcha";
        if (str == null) {
            str = "";
        }
        hashMap.put(str4, str);
        String str5 = "scenario";
        if (str2 == null) {
            str2 = "";
        }
        hashMap.put(str5, str2);
        String str6 = "errorMsg";
        if (str3 == null) {
            str3 = "";
        }
        hashMap.put(str6, str3);
        C21000d dVar = f57109a;
        String hashMap2 = hashMap.toString();
        C52711k.m112236a((Object) hashMap2, "map.toString()");
        dVar.mo44982c(hashMap2);
    }
}
