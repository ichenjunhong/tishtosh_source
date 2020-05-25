package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import com.bytedance.ies.p675g.p677b.C10782e;
import com.bytedance.ies.p675g.p677b.C10783f;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.z */
public final class C4945z {

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.z$a */
    public static class C4946a extends C10782e<JSONObject, JSONObject> {
        public final /* synthetic */ Object invoke(Object obj, C10783f fVar) throws Exception {
            JSONObject jSONObject = (JSONObject) obj;
            JSONObject jSONObject2 = new JSONObject();
            if (TextUtils.equals(jSONObject.optString("type", ""), "all")) {
                Map all = C4945z.m11441b(fVar).getAll();
                JSONObject jSONObject3 = new JSONObject();
                if (all != null && !all.isEmpty()) {
                    for (Object next : all.keySet()) {
                        if (next != null) {
                            jSONObject3.put(next.toString(), C4945z.m11441b(fVar).getString(next.toString(), ""));
                        }
                    }
                }
                jSONObject2.put("value", jSONObject3);
            } else {
                jSONObject2.put("value", C4945z.m11441b(fVar).getString(jSONObject.optString("key"), ""));
            }
            jSONObject2.put("code", 1);
            return jSONObject2;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.z$b */
    public static class C4947b extends C10782e<JSONObject, JSONObject> {
        public final /* synthetic */ Object invoke(Object obj, C10783f fVar) throws Exception {
            boolean z;
            JSONObject jSONObject = (JSONObject) obj;
            boolean equals = TextUtils.equals(jSONObject.optString("type", ""), "all");
            JSONObject jSONObject2 = new JSONObject();
            if (equals) {
                z = C4945z.m11439a(fVar).clear().commit();
            } else {
                z = C4945z.m11439a(fVar).remove(jSONObject.optString("key")).commit();
            }
            jSONObject2.put("code", z ? 1 : 0);
            return jSONObject2;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.z$c */
    public static class C4948c extends C10782e<JSONObject, JSONObject> {
        public final /* synthetic */ Object invoke(Object obj, C10783f fVar) throws Exception {
            JSONObject jSONObject = (JSONObject) obj;
            boolean commit = C4945z.m11439a(fVar).putString(jSONObject.optString("key"), jSONObject.optString("value")).commit();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("code", commit ? 1 : 0);
            return jSONObject2;
        }
    }

    /* renamed from: a */
    private static String m11440a() {
        return "js_kv_methods_20191113";
    }

    /* renamed from: a */
    public static Editor m11439a(C10783f fVar) {
        return C35807d.m80935a(fVar.f28972a, m11440a(), 0).edit();
    }

    /* renamed from: b */
    public static SharedPreferences m11441b(C10783f fVar) {
        return C35807d.m80935a(fVar.f28972a, m11440a(), 0);
    }
}
