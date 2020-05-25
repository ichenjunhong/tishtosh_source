package com.p683ss.android.ugc.aweme.p1706fe.method;

import com.p683ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.p683ss.android.ugc.aweme.language.C35837h;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod.C29789a;
import com.p683ss.android.ugc.aweme.setting.C41589c;
import com.p683ss.android.ugc.aweme.setting.model.MigrateABTestModel;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.fe.method.AppSettingMethod */
public class AppSettingMethod extends BaseCommonJavaMethod {
    /* renamed from: c */
    private static JSONObject m69891c() {
        JSONObject jSONObject = new JSONObject();
        String str = "isTeenagersModel";
        try {
            C41589c.m91432a();
            int i = 1;
            if (MigrateABTestModel.getInstance().getUndegradeProtect() != 1 || !TimeLockRuler.isContentFilterOn()) {
                i = 0;
            }
            jSONObject.put(str, i);
            jSONObject.put("language", C35837h.m80980e());
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* renamed from: a */
    public final void mo49914a(JSONObject jSONObject, C29789a aVar) {
        aVar.mo60039a((Object) m69891c());
    }
}
