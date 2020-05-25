package com.bytedance.android.livesdk.chatroom.interact;

import com.bytedance.android.live.core.p225d.C3833a;
import com.bytedance.android.live.core.p225d.C3836d;
import com.bytedance.android.live.core.p225d.C3837e;
import com.bytedance.android.live.core.p226e.C3838a;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.al */
public final class C5278al extends C3833a {

    /* renamed from: a */
    public static final String f14123a = C3836d.m9734a("ttlive_pk_sei_api");

    /* renamed from: b */
    public static final String f14124b = C3836d.m9735b("ttlive_pk_sei_api");

    /* renamed from: c */
    public static final String f14125c = C3836d.m9734a("ttlive_pk_permission_api");

    /* renamed from: d */
    public static final String f14126d = C3836d.m9735b("ttlive_pk_permission_api");

    /* renamed from: e */
    private static final String f14127e = C3836d.m9734a("ttlive_pk_open_api");

    /* renamed from: f */
    private static final String f14128f = C3836d.m9735b("ttlive_pk_open_api");

    /* renamed from: g */
    private static final String f14129g = C3836d.m9734a("ttlive_pk_finish_api");

    /* renamed from: h */
    private static final String f14130h = C3836d.m9735b("ttlive_pk_finish_api");

    /* renamed from: i */
    private static final String f14131i = C3836d.m9734a("ttlive_pk_stats_api");

    /* renamed from: j */
    private static final String f14132j = C3836d.m9735b("ttlive_pk_stats_api");

    /* renamed from: a */
    public static void m11932a(long j) {
        m11933a(f14127e, j);
    }

    /* renamed from: b */
    public static void m11939b(long j) {
        m11933a(f14129g, j);
    }

    /* renamed from: c */
    public static void m11941c(long j) {
        m11933a(f14131i, j);
    }

    /* renamed from: b */
    public static void m11940b(Throwable th) {
        m11936a(f14129g, f14130h, th);
    }

    /* renamed from: c */
    public static void m11942c(Throwable th) {
        m11936a(f14131i, f14132j, th);
    }

    /* renamed from: a */
    public static void m11937a(Throwable th) {
        m11936a(f14127e, f14128f, th);
    }

    /* renamed from: a */
    public static void m11933a(String str, long j) {
        C3837e.m9742a(str, 0, j, (JSONObject) null);
    }

    /* renamed from: a */
    public static void m11936a(String str, String str2, Throwable th) {
        String str3;
        int i;
        if (th instanceof C3838a) {
            C3838a aVar = (C3838a) th;
            i = aVar.getErrorCode();
            str3 = aVar.getErrorMsg();
        } else {
            i = 0;
            if (th == null) {
                str3 = "Unknown";
            } else {
                str3 = th.getMessage();
            }
        }
        m11934a(str, str2, i, str3);
    }

    /* renamed from: a */
    private static void m11934a(String str, String str2, int i, String str3) {
        JSONObject jSONObject = new JSONObject();
        m9730a(jSONObject, "error_code", (long) i);
        m9731a(jSONObject, "error_msg", str3);
        C3837e.m9749b(str, 1, jSONObject);
        C3837e.m9744a(str2, 1, jSONObject);
    }

    /* renamed from: a */
    public static void m11935a(String str, String str2, String str3, String str4, String str5, String str6) {
        JSONObject jSONObject = new JSONObject();
        m11938a(jSONObject, str, str2, str3, str4, str5, str6);
        C3837e.m9749b("ttlive_interact_connect_status_all", 0, jSONObject);
    }

    /* renamed from: a */
    private static void m11938a(JSONObject jSONObject, String str, String str2, String str3, String str4, String str5, String str6) {
        m9731a(jSONObject, "role_type", str);
        m9731a(jSONObject, "line_type", str2);
        m9731a(jSONObject, "vendor", str3);
        m9731a(jSONObject, "interact_id", str4);
        m9731a(jSONObject, "channel_id", str5);
        m9731a(jSONObject, "to_uid", str6);
    }

    /* renamed from: a */
    public static void m11931a(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        JSONObject jSONObject = new JSONObject();
        m9730a(jSONObject, "error_code", (long) i);
        m9731a(jSONObject, "error_msg", str);
        m11938a(jSONObject, str2, str3, str4, str5, str6, str7);
        C3837e.m9749b("ttlive_interact_connect_status_all", 1, jSONObject);
        C3837e.m9744a("ttlive_interact_connect_status_error", 1, jSONObject);
    }
}
