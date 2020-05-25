package com.p683ss.android.ugc.aweme.story.live;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.story.live.d */
public final class C46641d {
    /* renamed from: a */
    public static void m101217a(String str, String str2, String str3, String str4, Boolean bool, String str5, String str6) {
        HashMap hashMap = new HashMap();
        hashMap.put("anchor_id", str3);
        hashMap.put("room_id", str4);
        hashMap.put("user_type", bool.booleanValue() ? "host" : "aud");
        hashMap.put("enter_from", str);
        hashMap.put("previous_page", str2);
        hashMap.put("to_user_id", str5);
        hashMap.put("request_id", str6);
        C26890h.m65011a("follow", (Map<String, String>) hashMap);
    }

    /* renamed from: a */
    public static void m101218a(String str, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("enter_from", str);
        if (z) {
            hashMap.put("ui_type", "new_type");
        } else {
            hashMap.put("ui_type", "normal_type");
        }
        C26890h.m65011a("live_merge_show", (Map<String, String>) hashMap);
    }

    /* renamed from: a */
    public static void m101215a(String str, long j, String str2, String str3, String str4, int i, String str5) {
        m101214a(str, j, str2, str3, str4, i, -1, str5);
    }

    /* renamed from: a */
    private static void m101214a(String str, long j, String str2, String str3, String str4, int i, int i2, String str5) {
        m101212a(str, j, str2, str4, i, -1, str5, str3);
    }

    /* renamed from: a */
    public static void m101216a(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("enter_from_merge", str);
        hashMap.put("_param_live_platform", CustomActionPushReceiver.f104061f);
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put("gd_label", str2);
        }
        C26890h.m65011a("livesdk_enter_live_merge", (Map<String, String>) hashMap);
    }

    /* renamed from: a */
    public static void m101210a(String str) {
        m101216a(str, "");
    }

    /* renamed from: b */
    public static void m101221b(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("enter_from_merge", str);
        hashMap.put("_param_live_platform", CustomActionPushReceiver.f104061f);
        C26890h.m65011a("livesdk_live_merge_show", (Map<String, String>) hashMap);
    }

    /* renamed from: b */
    public static void m101223b(String str, String str2) {
        C26890h.m65011a("livesdk_push_click", C23089d.m56640a().mo47829a("anchor_id", str2).mo47829a("room_id", str).f61491a);
    }

    /* renamed from: a */
    public static JSONObject m101204a(String str, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("position", str);
            if (TextUtils.equals(C11010c.m22283d(), "musical_ly")) {
                if (TextUtils.equals(str, "push")) {
                    str2 = "click_push";
                } else if (!TextUtils.equals(str, "homepage_follow") || !TextUtils.equals(str2, "head")) {
                    if (!TextUtils.equals(str, "others_homepage")) {
                        if (!TextUtils.equals(str2, "video")) {
                            if (TextUtils.equals(str, "message")) {
                                str2 = "click_watch_button";
                            }
                        }
                    }
                    str2 = "click_head";
                } else {
                    str2 = "click_watch_button";
                }
                jSONObject.put("enter_method", str2);
            } else {
                jSONObject.put("style", str2);
            }
            jSONObject.put("request_id", str3);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static void m101211a(String str, long j, String str2) {
        String str3 = "livesdk_push_click_lookup_anchor";
        C23089d a = C23089d.m56640a().mo47829a("anchor_id", str).mo47829a("anchor_status", str2);
        String str4 = "room_id";
        if (j <= 0) {
            j = 0;
        }
        C26890h.m65011a(str3, a.mo47829a(str4, String.valueOf(j)).f61491a);
    }

    /* renamed from: a */
    public static void m101206a(Context context, int i, String str, String str2, long j) {
        m101205a(context, 1, str2, j, m101204a("push", "push", str));
    }

    /* renamed from: b */
    public static void m101219b(Context context, int i, String str, String str2, long j) {
        m101205a(context, 0, str2, j, m101204a("homepage_hot", "video", str));
    }

    /* renamed from: a */
    public static void m101205a(Context context, int i, String str, long j, JSONObject jSONObject) {
        if (i == 0) {
            C26890h.m65006a(context, "impression", CustomActionPushReceiver.f104061f, str, j, jSONObject);
        } else if (i == 1 && jSONObject != null) {
            C26890h.m65006a(context, "enter_detail", "live_aud", str, j, jSONObject);
        }
    }

    /* renamed from: b */
    public static void m101220b(Context context, int i, String str, String str2, long j, String str3) {
        JSONObject a = m101204a("homepage_follow", "video", str);
        try {
            a.put("page_name", str3);
        } catch (JSONException unused) {
        }
        m101205a(context, 0, str2, j, a);
    }

    /* renamed from: c */
    public static void m101224c(Context context, int i, String str, String str2, long j, String str3) {
        JSONObject a = m101204a("homepage_follow", "video", str);
        try {
            a.put("video_value", str3);
        } catch (JSONException unused) {
        }
        m101205a(context, 1, str2, j, a);
    }

    /* renamed from: d */
    public static void m101225d(Context context, int i, String str, String str2, long j, String str3) {
        JSONObject a = m101204a("homepage_hot", "video", str);
        try {
            a.put("video_value", str3);
        } catch (JSONException unused) {
        }
        m101205a(context, 1, str2, j, a);
    }

    /* renamed from: a */
    public static void m101207a(Context context, int i, String str, String str2, long j, String str3) {
        JSONObject a = m101204a("toplist", "head", str);
        try {
            a.put("page_name", str3);
        } catch (JSONException unused) {
        }
        m101205a(context, i, str2, j, a);
    }

    /* renamed from: a */
    public static final void m101208a(Context context, int i, String str, String str2, String str3, long j) {
        m101205a(context, i, str3, j, m101204a(str, "head", str2));
    }

    /* renamed from: a */
    public static void m101209a(Context context, boolean z, int i, String str, String str2, long j) {
        String str3;
        if (z) {
            str3 = "homepage";
        } else {
            str3 = "others_homepage";
        }
        m101205a(context, i, str2, j, m101204a(str3, "head", str));
    }

    /* renamed from: a */
    public static void m101212a(String str, long j, String str2, String str3, int i, int i2, String str4, String str5) {
        m101222b(str, j, str2, str3, i, i2, str4, str5, "click", null);
    }

    /* renamed from: b */
    private static void m101222b(String str, long j, String str2, String str3, int i, int i2, String str4, String str5, String str6, String str7) {
        HashMap hashMap = new HashMap();
        hashMap.put("anchor_id", str);
        hashMap.put("room_id", String.valueOf(j));
        hashMap.put("enter_from_merge", str2);
        hashMap.put("scene_id", "1003");
        hashMap.put("action_type", str6);
        hashMap.put("video_id", str4);
        hashMap.put("sdk_version", "1510");
        hashMap.put("previous_page", null);
        hashMap.put("request_id", str3);
        if ("live_merge".equals(str2) || "homepage_fresh".equals(str2) || "homepage_channel".equals(str2)) {
            hashMap.put("order", String.valueOf(i));
        }
        if (i2 > 0) {
            String str8 = "room_type";
            int i3 = 5;
            if (i2 != 5) {
                if (i2 == 6) {
                    i3 = 1;
                } else {
                    i3 = 4;
                }
            }
            hashMap.put(str8, String.valueOf(i3));
        }
        if (str5 != null) {
            hashMap.put("enter_method", str5);
        }
        hashMap.put("_param_live_platform", CustomActionPushReceiver.f104061f);
        hashMap.put("sdk_version", "1510");
        C26890h.m65011a("livesdk_live_show", (Map<String, String>) hashMap);
    }

    /* renamed from: a */
    public static void m101213a(String str, long j, String str2, String str3, int i, int i2, String str4, String str5, String str6, String str7) {
        HashMap hashMap = new HashMap();
        hashMap.put("anchor_id", str);
        hashMap.put("room_id", String.valueOf(j));
        hashMap.put("enter_from_merge", str2);
        hashMap.put("scene_id", "1003");
        hashMap.put("action_type", "click");
        hashMap.put("video_id", null);
        hashMap.put("sdk_version", "1510");
        hashMap.put("previous_page", null);
        hashMap.put("request_id", str3);
        hashMap.put("live_reason", str7);
        if ("live_merge".equals(str2) || "homepage_fresh".equals(str2) || "homepage_channel".equals(str2)) {
            hashMap.put("order", String.valueOf(i));
        }
        hashMap.put("enter_method", str5);
        hashMap.put("_param_live_platform", CustomActionPushReceiver.f104061f);
        hashMap.put("sdk_version", "1510");
        C26890h.m65011a("livesdk_live_show", (Map<String, String>) hashMap);
    }
}
