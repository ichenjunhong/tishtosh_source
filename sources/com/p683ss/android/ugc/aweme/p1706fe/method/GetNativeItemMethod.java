package com.p683ss.android.ugc.aweme.p1706fe.method;

import android.text.TextUtils;
import com.bytedance.ies.p675g.p676a.C10757a;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod.C29789a;
import com.p683ss.android.ugc.aweme.p1706fe.utils.C29973d;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.fe.method.GetNativeItemMethod */
public class GetNativeItemMethod extends BaseCommonJavaMethod {
    public GetNativeItemMethod() {
    }

    public GetNativeItemMethod(C10757a aVar) {
        super(aVar);
    }

    /* renamed from: a */
    public final void mo49914a(JSONObject jSONObject, C29789a aVar) {
        try {
            String a = C29973d.m70118a().mo60150a(jSONObject.getString("key"), "");
            if (!TextUtils.isEmpty(a)) {
                aVar.mo60039a((Object) a);
            } else {
                aVar.mo60038a(-1, "value为空");
            }
        } catch (Exception e) {
            aVar.mo60038a(-1, e.getMessage());
        }
    }
}
