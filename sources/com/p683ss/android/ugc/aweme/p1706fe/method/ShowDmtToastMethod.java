package com.p683ss.android.ugc.aweme.p1706fe.method;

import android.content.Context;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod.C29789a;
import java.lang.ref.WeakReference;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.fe.method.ShowDmtToastMethod */
public final class ShowDmtToastMethod extends BaseCommonJavaMethod {
    /* renamed from: a */
    public final void mo49914a(JSONObject jSONObject, C29789a aVar) {
        if (jSONObject == null) {
            aVar.mo60038a(0, "no params found");
            return;
        }
        String optString = jSONObject.optString("msg");
        C52711k.m112236a((Object) optString, "params.optString(\"msg\")");
        WeakReference weakReference = this.f77793e;
        if (weakReference != null) {
            Context context = (Context) weakReference.get();
            if (context != null) {
                C10691a.m21537a(context, optString).mo19066a();
            }
        }
    }
}
