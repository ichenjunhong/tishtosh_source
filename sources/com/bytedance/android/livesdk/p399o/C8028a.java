package com.bytedance.android.livesdk.p399o;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.o.a */
public final class C8028a {
    /* renamed from: a */
    public static void m15932a(String str, String str2) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("desc", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put("asset_id", str2);
        }
        C8064d.m16005b().mo9201c("ttlive_asset", (Map<String, ?>) hashMap);
    }
}
