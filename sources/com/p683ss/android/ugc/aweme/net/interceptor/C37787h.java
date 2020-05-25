package com.p683ss.android.ugc.aweme.net.interceptor;

import com.p683ss.android.ugc.aweme.net.p1991d.C37767h;
import okhttp3.C53673t.C53674a;

/* renamed from: com.ss.android.ugc.aweme.net.interceptor.h */
public final class C37787h {
    /* renamed from: a */
    public static String m84396a(String str, C53674a aVar) {
        String str2;
        if (!str.contains("/service/settings/v2")) {
            return str;
        }
        String str3 = "googleServiceEnable";
        if (C37767h.m84354a()) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        aVar.mo111629a(str3, str2);
        return aVar.mo111632b().mo111610a().toString();
    }
}
