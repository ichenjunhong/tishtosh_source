package com.p683ss.android.ugc.aweme.notification.utils;

import com.p683ss.android.ugc.aweme.common.C26890h;
import java.util.HashMap;
import java.util.Map;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.notification.utils.b */
public final class C38453b {
    /* renamed from: a */
    public static final void m85774a(String str, String str2, int i, boolean z) {
        C52711k.m112240b(str, "accountType");
        C52711k.m112240b(str2, "position");
        Map hashMap = new HashMap();
        hashMap.put("account_type", str);
        hashMap.put("client_order", str2);
        if (i > 0) {
            if (z) {
                hashMap.put("notice_type", "number_dot");
                hashMap.put("show_cnt", String.valueOf(i));
            } else {
                hashMap.put("notice_type", "yellow_dot");
            }
        }
        C26890h.m65011a("enter_official_message", hashMap);
    }
}
