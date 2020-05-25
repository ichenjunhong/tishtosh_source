package com.p683ss.android.ugc.aweme.web.jsbridge;

import com.google.gson.C17971f;
import com.p683ss.android.ugc.aweme.commercialize.anchor.C25600a;
import com.p683ss.android.ugc.aweme.commercialize.anchor.C25615b;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod.C29789a;
import com.p683ss.android.ugc.aweme.services.publish.AnchorTransData;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.AsyncGoodsEditInfoMethod */
public class AsyncGoodsEditInfoMethod extends BaseCommonJavaMethod {
    /* renamed from: a */
    public final void mo49914a(JSONObject jSONObject, C29789a aVar) {
        AnchorTransData anchorTransData;
        String optString = jSONObject.optString("draftId");
        String optString2 = jSONObject.optString("title");
        HashMap hashMap = new HashMap();
        hashMap.put("shop_draft_id", optString);
        if (!optString.isEmpty()) {
            anchorTransData = new AnchorTransData(C25600a.SHOP.getTYPE(), new C17971f().mo34889b(hashMap), optString2, "", Integer.valueOf(1));
        } else {
            anchorTransData = null;
        }
        C47718bf.m103288a(new C25615b(anchorTransData));
    }
}
