package com.p683ss.android.ugc.aweme.p1706fe.method;

import com.p683ss.android.common.applog.NetUtil;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod.C29789a;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.fe.method.ApiParamMethod */
public class ApiParamMethod extends BaseCommonJavaMethod {
    /* renamed from: a */
    public final void mo49914a(JSONObject jSONObject, C29789a aVar) {
        HashMap hashMap = new HashMap();
        NetUtil.putCommonParams(hashMap, true);
        aVar.mo60039a((Object) new JSONObject(hashMap));
    }
}
