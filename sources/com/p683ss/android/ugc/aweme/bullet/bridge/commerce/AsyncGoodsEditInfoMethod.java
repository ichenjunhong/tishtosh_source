package com.p683ss.android.ugc.aweme.bullet.bridge.commerce;

import com.bytedance.ies.bullet.p628b.p637g.p638a.C10326b;
import com.google.gson.C17971f;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod.C24112a;
import com.p683ss.android.ugc.aweme.commercialize.anchor.C25600a;
import com.p683ss.android.ugc.aweme.commercialize.anchor.C25615b;
import com.p683ss.android.ugc.aweme.services.publish.AnchorTransData;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import java.util.HashMap;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.commerce.AsyncGoodsEditInfoMethod */
public final class AsyncGoodsEditInfoMethod extends BaseBridgeMethod {

    /* renamed from: b */
    public static final C24128a f64020b = new C24128a(null);

    /* renamed from: c */
    private final String f64021c = "asyncGoodsEditInfo";

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.commerce.AsyncGoodsEditInfoMethod$a */
    public static final class C24128a {
        private C24128a() {
        }

        public /* synthetic */ C24128a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: d */
    public final String mo18313d() {
        return this.f64021c;
    }

    public AsyncGoodsEditInfoMethod(C10326b bVar) {
        C52711k.m112240b(bVar, "contextProviderFactory");
        super(bVar);
    }

    /* renamed from: a */
    public final void mo49906a(JSONObject jSONObject, C24112a aVar) {
        boolean z;
        AnchorTransData anchorTransData;
        C52711k.m112240b(jSONObject, "params");
        C52711k.m112240b(aVar, "iReturn");
        String optString = jSONObject.optString("draftId");
        String optString2 = jSONObject.optString("title");
        HashMap hashMap = new HashMap();
        C52711k.m112236a((Object) optString, "draftId");
        hashMap.put("shop_draft_id", optString);
        if (optString.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            int type = C25600a.SHOP.getTYPE();
            String b = new C17971f().mo34889b(hashMap);
            C52711k.m112236a((Object) b, "Gson().toJson(content)");
            anchorTransData = new AnchorTransData(type, b, optString2, "", Integer.valueOf(1), null, null, 96, null);
        } else {
            anchorTransData = null;
        }
        C47718bf.m103288a(new C25615b(anchorTransData));
    }
}
