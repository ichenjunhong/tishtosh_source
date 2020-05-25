package com.p683ss.android.ugc.aweme.utils;

import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.app.C23051bf;
import com.p683ss.android.ugc.aweme.app.C23183v;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.MobClick;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.utils.ek */
public final class C47853ek {
    /* renamed from: a */
    static final /* synthetic */ Object m103501a() throws Exception {
        int g = (int) C11010c.m22286g();
        String p = C11010c.m22295p();
        String i = C11010c.m22288i();
        C23051bf L = C23183v.m56778a().mo47901L();
        C23183v a = C23183v.m56778a();
        if (a.f61614a == null) {
            a.f61614a = new C23051bf<>("last_app_version_name", "");
        }
        C23051bf<String> bfVar = a.f61614a;
        C23183v a2 = C23183v.m56778a();
        if (a2.f61620b == null) {
            a2.f61620b = new C23051bf<>("last_channel_name", "");
        }
        C23051bf<String> bfVar2 = a2.f61620b;
        int intValue = ((Integer) L.mo47782d()).intValue();
        if (((Integer) SharePrefCache.inst().getIsNewInstall().mo47782d()).intValue() == -1) {
            if (intValue == 0) {
                SharePrefCache.inst().getIsNewInstall().mo47776a(Integer.valueOf(1));
            } else {
                SharePrefCache.inst().getIsNewInstall().mo47776a(Integer.valueOf(0));
            }
        }
        if (((Integer) SharePrefCache.inst().getIsNewInstall().mo47782d()).intValue() == -1) {
            if (intValue == 0) {
                SharePrefCache.inst().getIsNewInstall().mo47776a(Integer.valueOf(1));
            } else {
                SharePrefCache.inst().getIsNewInstall().mo47776a(Integer.valueOf(0));
            }
        }
        if (intValue == 0) {
            L.mo47776a(Integer.valueOf(g));
            bfVar.mo47776a(i);
            bfVar2.mo47776a(p);
        } else if (g > intValue) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("last_app_version", bfVar.mo47782d());
                jSONObject.put("last_channel_name", bfVar2.mo47782d());
            } catch (JSONException unused) {
            }
            C26890h.onEvent(new MobClick().setEventName("update_from").setLabelName("lite_update").setJsonObject(jSONObject));
            L.mo47776a(Integer.valueOf(g));
            bfVar.mo47776a(i);
            bfVar2.mo47776a(p);
        }
        return null;
    }
}
