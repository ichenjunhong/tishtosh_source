package com.p683ss.android.ugc.aweme.detail;

import android.text.TextUtils;

/* renamed from: com.ss.android.ugc.aweme.detail.f */
public final class C27333f {
    /* renamed from: b */
    public static boolean m65866b(String str) {
        if (TextUtils.equals("from_follow_page", str) || TextUtils.equals("from_user_state_tab", str) || TextUtils.equals("from_chat", str) || TextUtils.equals("from_launch_forward", str) || TextUtils.equals("from_forward_push", str) || TextUtils.equals("from_familiar_tab", str)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m65865a(String str) {
        if (TextUtils.equals("from_follow_page", str) || TextUtils.equals("from_user_state_tab", str) || TextUtils.equals("from_search_mix", str) || TextUtils.equals("from_special_topic", str) || TextUtils.equals("from_poi_detail", str) || TextUtils.equals("poi_rate", str) || TextUtils.equals("from_commerce_banner", str) || TextUtils.equals("from_familiar_tab", str) || TextUtils.equals("from_search_compilation", str) || TextUtils.equals("from_search_ad_no_request", str) || TextUtils.equals("from_mix_video", str)) {
            return true;
        }
        return false;
    }
}
