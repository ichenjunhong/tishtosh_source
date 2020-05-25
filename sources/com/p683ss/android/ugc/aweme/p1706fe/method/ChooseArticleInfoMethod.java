package com.p683ss.android.ugc.aweme.p1706fe.method;

import android.text.TextUtils;
import com.bytedance.ies.p675g.p676a.C10757a;
import com.p683ss.android.ugc.aweme.commercialize.anchor.C25600a;
import com.p683ss.android.ugc.aweme.commercialize.anchor.C25615b;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod.C29789a;
import com.p683ss.android.ugc.aweme.services.publish.AnchorTransData;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.fe.method.ChooseArticleInfoMethod */
public class ChooseArticleInfoMethod extends BaseCommonJavaMethod {
    public ChooseArticleInfoMethod(C10757a aVar) {
        super(aVar);
    }

    /* renamed from: a */
    public final void mo49914a(JSONObject jSONObject, C29789a aVar) throws JSONException {
        if (jSONObject == null) {
            aVar.mo60038a(0, "no params found");
            return;
        }
        String optString = jSONObject.optString("data");
        if (TextUtils.isEmpty(optString)) {
            aVar.mo60038a(0, "no data in params");
            return;
        }
        JSONObject jSONObject2 = new JSONObject(optString);
        String optString2 = jSONObject2.optString("article_title");
        if (TextUtils.isEmpty(optString2)) {
            aVar.mo60038a(0, "no article_title in data");
        } else if (TextUtils.isEmpty(jSONObject2.optString("micro_app_id"))) {
            aVar.mo60038a(0, "no micro_app_id in data");
        } else {
            if (this.f77793e != null) {
                AnchorTransData anchorTransData = new AnchorTransData(C25600a.ARTICLE.getTYPE(), optString, optString2, "", Integer.valueOf(1));
                C47718bf.m103288a(new C25615b(anchorTransData));
            }
            aVar.mo60039a((Object) Integer.valueOf(1));
        }
    }
}
