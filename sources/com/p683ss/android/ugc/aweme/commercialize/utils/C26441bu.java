package com.p683ss.android.ugc.aweme.commercialize.utils;

import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.p1103ad.p1104a.p1105a.C18517c;
import com.p683ss.android.ugc.aweme.commercialize.C25945k;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.MobClick;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.bu */
final /* synthetic */ class C26441bu implements C18517c {

    /* renamed from: a */
    static final C18517c f69705a = new C26441bu();

    private C26441bu() {
    }

    /* renamed from: a */
    public final void mo37781a(String str, String str2, String str3, String str4, JSONObject jSONObject) {
        try {
            C25945k.m62911b().mo53114a(C11010c.m22280a(), jSONObject, str4);
        } catch (JSONException unused) {
        }
        C26890h.onEvent(MobClick.obtain().setEventName(str2).setLabelName(str3).setValue(str).setJsonObject(jSONObject));
    }
}
