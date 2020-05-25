package com.p683ss.android.ugc.aweme.web.jsbridge;

import com.p683ss.android.ugc.aweme.crossplatform.p1612a.C27094a;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod.C29789a;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.UpdateNavBarMethod */
public final class UpdateNavBarMethod extends BaseCommonJavaMethod {
    /* renamed from: a */
    public final void mo49914a(JSONObject jSONObject, C29789a aVar) {
        String str;
        if (jSONObject != null) {
            str = jSONObject.optString("topbar_type", "");
        } else {
            str = null;
        }
        C47718bf.m103288a(new C27094a(str));
        aVar.mo60039a((Object) null);
    }
}
