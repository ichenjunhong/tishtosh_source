package com.p683ss.android.ugc.aweme.p1706fe.method;

import com.bytedance.ies.p675g.p676a.C10757a;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod.C29789a;
import com.p683ss.android.ugc.aweme.p1706fe.utils.C29973d;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.fe.method.SetNativeItemMethod */
public class SetNativeItemMethod extends BaseCommonJavaMethod {
    public SetNativeItemMethod() {
    }

    public SetNativeItemMethod(C10757a aVar) {
        super(aVar);
    }

    /* renamed from: a */
    public final void mo49914a(JSONObject jSONObject, C29789a aVar) {
        try {
            if (C29973d.m70118a().mo60151a(jSONObject.getString("key"), (Object) jSONObject.getString("value"))) {
                aVar.mo60039a((Object) null);
            } else {
                aVar.mo60038a(-1, "");
            }
        } catch (Exception unused) {
            aVar.mo60038a(-1, "");
        }
    }
}
