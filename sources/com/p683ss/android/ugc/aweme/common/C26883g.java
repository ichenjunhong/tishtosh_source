package com.p683ss.android.ugc.aweme.common;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.C9431p;
import com.p683ss.android.p1163f.C19149b;
import com.p683ss.android.p1163f.C19158d;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.common.g */
public final class C26883g {

    /* renamed from: a */
    private static String f70740a;

    /* renamed from: a */
    public static void m64995a(String str, Map<String, String> map) {
        if (!TextUtils.isEmpty(str)) {
            if (!TextUtils.isEmpty(f70740a)) {
                if (map == null) {
                    map = new HashMap<>();
                }
                map.put("launch_from", f70740a);
            }
            C19158d.m46704a().mo39107a(str, map, C19149b.f52773i);
        }
    }

    /* renamed from: a */
    public static void m64991a(Context context, String str, String str2) {
        if (!TextUtils.isEmpty(str) && context != null) {
            if (!TextUtils.isEmpty(f70740a)) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("launch_from", f70740a);
                } catch (JSONException unused) {
                    C19158d.m46704a().mo39106a("umeng", str, str2, null, null, jSONObject, C19149b.f52772h | C19149b.f52769e);
                }
            } else {
                C19158d.m46704a().mo39106a("umeng", str, str2, null, null, null, C19149b.f52772h | C19149b.f52769e);
            }
        }
    }

    /* renamed from: a */
    public static void m64992a(Context context, String str, String str2, long j, long j2) {
        m64994a(context, "umeng", str, str2, j, j2, null);
    }

    /* renamed from: a */
    public static void m64993a(Context context, String str, String str2, long j, long j2, JSONObject jSONObject) {
        m64994a(context, "umeng", str, str2, j, j2, jSONObject);
    }

    /* renamed from: a */
    public static void m64994a(Context context, String str, String str2, String str3, long j, long j2, JSONObject jSONObject) {
        String str4;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        if (!TextUtils.isEmpty(str2)) {
            if (TextUtils.isEmpty(str)) {
                str4 = "umeng";
            } else {
                str4 = str;
            }
            if (!C9431p.m18664a(f70740a)) {
                if (jSONObject == null) {
                    jSONObject3 = new JSONObject();
                } else {
                    jSONObject3 = jSONObject;
                }
                try {
                    jSONObject3.put("launch_from", f70740a);
                } catch (JSONException unused) {
                }
                jSONObject2 = jSONObject3;
            } else {
                jSONObject2 = jSONObject;
            }
            if (context != null) {
                C19158d.m46704a().mo39106a(str4, str2, str3, Long.valueOf(j), Long.valueOf(j2), jSONObject2, C19149b.f52772h | C19149b.f52769e);
            }
        }
    }
}
