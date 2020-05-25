package com.p683ss.android.ugc.aweme.feed.p1727j;

import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.feed.C30578o;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.feed.j.a */
public final class C30434a {
    /* renamed from: a */
    public static void m71359a(String str, String str2, String str3, JSONObject jSONObject) {
        C30435b bVar = new C30435b(jSONObject, C30578o.m71570d(), C30578o.m71569c(), str, str2, str3);
        C0013i.m18a((Callable<TResult>) bVar, (Executor) C26890h.m65003a());
    }

    /* renamed from: a */
    static final /* synthetic */ Object m71358a(JSONObject jSONObject, String str, String str2, String str3, String str4, String str5) throws Exception {
        JSONObject jSONObject2;
        if (jSONObject == null) {
            try {
                jSONObject2 = new JSONObject();
            } catch (JSONException unused) {
            }
        } else {
            jSONObject2 = jSONObject;
        }
        jSONObject2.put("top_activity", str);
        jSONObject2.put("feed_tab", str2);
        jSONObject2.put("err_code", str3);
        jSONObject2.put("err_msg", str4);
        C26890h.onEvent(MobClick.obtain().setEventName("video_play_failed").setValue(str5).setJsonObject(jSONObject));
        return null;
    }
}
