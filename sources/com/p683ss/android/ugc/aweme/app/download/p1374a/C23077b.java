package com.p683ss.android.ugc.aweme.app.download.p1374a;

import android.content.Context;
import com.p683ss.android.ugc.aweme.commercialize.views.cards.AbsAdCardAction.C26685a;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.app.download.a.b */
public class C23077b {

    /* renamed from: a */
    public static final String f61478a = "b";

    /* renamed from: b */
    private C23078c f61479b;

    /* renamed from: c */
    public static void m56618c(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.length() != 0) {
            jSONObject.optJSONArray("task_list");
        }
    }

    /* renamed from: b */
    public final void mo47813b(JSONObject jSONObject) {
        if (jSONObject != null && this.f61479b != null) {
            new C23076a().mo47812a(jSONObject.optJSONObject("data"));
        }
    }

    /* renamed from: a */
    public static void m56616a(JSONObject jSONObject) {
        if (jSONObject != null) {
            new C23076a().mo47812a(jSONObject.optJSONObject("data"));
        }
    }

    private C23077b(Context context, C23078c cVar) {
        this.f61479b = cVar;
    }

    /* renamed from: a */
    public static C23077b m56614a(Context context, C23078c cVar) {
        return new C23077b(context, cVar);
    }

    /* renamed from: a */
    public static void m56615a(Context context, JSONObject jSONObject) {
        if (context != null && jSONObject != null) {
            new C23076a().mo47812a(jSONObject.optJSONObject("data"));
        }
    }

    /* renamed from: b */
    public static void m56617b(Context context, JSONObject jSONObject) {
        if (context != null && jSONObject != null) {
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            new C23076a().mo47812a(optJSONObject);
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("extParam");
            if (optJSONObject2 != null) {
                optJSONObject2.optString("refer");
                optJSONObject2.optJSONObject("ad_extra_data");
            }
            C47718bf.m103288a(new C26685a(-1));
        }
    }
}
