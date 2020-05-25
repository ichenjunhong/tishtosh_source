package com.p683ss.android.ugc.aweme.web.jsbridge;

import com.bytedance.ies.p675g.p676a.C10757a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod.C29789a;
import com.p683ss.android.ugc.aweme.utils.C47899fs;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.IsAppInstalledMethod */
public class IsAppInstalledMethod extends BaseCommonJavaMethod {
    public IsAppInstalledMethod() {
    }

    public IsAppInstalledMethod(C10757a aVar) {
        super(aVar);
    }

    /* renamed from: a */
    public final void mo49914a(JSONObject jSONObject, C29789a aVar) throws JSONException {
        String string = jSONObject.getString("packageName");
        if (C47899fs.m103617a(C11010c.m22280a(), string)) {
            aVar.mo60039a((Object) new JSONObject());
        } else {
            aVar.mo60038a(-1, string);
        }
    }
}
