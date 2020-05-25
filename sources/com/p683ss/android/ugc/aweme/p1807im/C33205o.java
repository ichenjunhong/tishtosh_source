package com.p683ss.android.ugc.aweme.p1807im;

import android.text.TextUtils;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.google.gson.C17971f;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p683ss.android.ugc.aweme.p1308ad.AdServiceImpl;
import com.p683ss.android.ugc.aweme.p1308ad.p1314e.C22396a;
import com.p683ss.android.ugc.aweme.p1308ad.services.IAdService;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.im.o */
public final class C33205o {
    /* renamed from: b */
    public static void m76299b(String str) {
        m76297a("chat", str, "");
    }

    /* renamed from: a */
    public static void m76295a(String str) {
        C26890h.m65005a(C11010c.m22280a(), "chat", "others_homepage", str, 0);
    }

    /* renamed from: c */
    public static void m76300c(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("to_status", str);
        C26890h.m65011a("inner_push_setting", (Map<String, String>) hashMap);
    }

    /* renamed from: d */
    public static void m76301d(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("to_status", str);
        C26890h.m65011a("live_inner_push_setting", (Map<String, String>) hashMap);
    }

    /* renamed from: a */
    public static void m76296a(String str, String str2) {
        C26890h.onEvent(MobClick.obtain().setEventName("unblock").setLabelName(str).setValue(str2));
    }

    /* renamed from: a */
    public static void m76297a(String str, String str2, String str3) {
        JSONObject jSONObject;
        if (!TextUtils.isEmpty(str3)) {
            jSONObject = new JSONObject();
            try {
                jSONObject.put("enter_from", str3);
            } catch (JSONException unused) {
            }
        } else {
            jSONObject = null;
        }
        C26890h.onEvent(MobClick.obtain().setEventName("block").setLabelName(str).setValue(str2).setJsonObject(jSONObject));
    }

    /* renamed from: a */
    public static void m76298a(String str, String str2, String str3, String str4, String str5) {
        C22396a aVar;
        IAdService createIAdServicebyMonsterPlugin = AdServiceImpl.createIAdServicebyMonsterPlugin();
        if (createIAdServicebyMonsterPlugin != null) {
            aVar = createIAdServicebyMonsterPlugin.getLatestRecommendFeedAdInfo();
        } else {
            aVar = null;
        }
        String str6 = "";
        String str7 = "";
        if (aVar != null) {
            str6 = String.valueOf(aVar.f60319a);
            str7 = aVar.f60320b;
        }
        LogPbBean logPbBean = new LogPbBean();
        logPbBean.setImprId(str4);
        C26890h.m65011a("enter_chat", C23089d.m56640a().mo47829a("author_id", str).mo47829a("enter_from", "others_homepage").mo47829a("enter_type", "normal_way").mo47829a("group_id", str2).mo47829a("previous_page", str3).mo47829a("log_pb", new C17971f().mo34889b(logPbBean)).mo47829a("to_user_id", str).mo47829a("cid", str6).mo47829a("log_extra", str7).mo47829a("enter_method", str5).f61491a);
    }
}
