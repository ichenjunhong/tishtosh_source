package com.p683ss.android.ugc.aweme.commercialize.link;

import com.bytedance.ies.p675g.p676a.C10757a;
import com.p683ss.android.ugc.aweme.commercialize.link.C25957e.C25958a;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod.C29789a;
import org.json.JSONException;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.link.LinkAuthBridgeSet */
public class LinkAuthBridgeSet extends BaseCommonJavaMethod {
    public LinkAuthBridgeSet() {
    }

    public LinkAuthBridgeSet(C10757a aVar) {
        super(aVar);
    }

    /* renamed from: a */
    public final void mo49914a(JSONObject jSONObject, C29789a aVar) throws JSONException {
        String str;
        if (jSONObject == null) {
            str = "";
        } else {
            str = jSONObject.optString("data", "");
        }
        C52711k.m112240b(str, "value");
        C25958a aVar2 = C25957e.f68538a;
        if (aVar2 != null) {
            aVar2.setLinkData(str);
        }
        aVar.mo60039a((Object) null);
    }
}
