package com.p683ss.android.ugc.aweme.bullet.bridge.commerce;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.ies.bullet.p628b.p637g.p638a.C10326b;
import com.p683ss.android.common.util.C18920g;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod.C24112a;
import com.p683ss.android.ugc.aweme.commerce.service.C25539a;
import com.p683ss.android.ugc.aweme.commerce.service.ICommerceService;
import com.p683ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.commerce.OpenTaobaoGoodMethod */
public final class OpenTaobaoGoodMethod extends BaseBridgeMethod {

    /* renamed from: b */
    public static final C24136a f64036b = new C24136a(null);

    /* renamed from: c */
    private final String f64037c = "openTaobaoGood";

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.commerce.OpenTaobaoGoodMethod$a */
    public static final class C24136a {
        private C24136a() {
        }

        public /* synthetic */ C24136a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: d */
    public final String mo18313d() {
        return this.f64037c;
    }

    public OpenTaobaoGoodMethod(C10326b bVar) {
        C52711k.m112240b(bVar, "contextProviderFactory");
        super(bVar);
    }

    /* renamed from: a */
    public final void mo49906a(JSONObject jSONObject, C24112a aVar) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        C52711k.m112240b(jSONObject, "params");
        C52711k.m112240b(aVar, "iReturn");
        String optString = jSONObject.optString("goodPromotionID", "STRING_NOT_SET");
        if (optString == null) {
            optString = "STRING_NOT_SET";
        }
        String optString2 = jSONObject.optString("goodUrl", "STRING_NOT_SET");
        if (optString2 == null) {
            optString2 = "STRING_NOT_SET";
        }
        String str6 = optString2;
        JSONObject optJSONObject = jSONObject.optJSONObject("ec_show_aweme_return");
        if (!TextUtils.equals(optString, "STRING_NOT_SET") && !TextUtils.equals(str6, "STRING_NOT_SET")) {
            Context e = mo18743e();
            if (e != null) {
                if (C18920g.m46052b(e, "com.taobao.taobao")) {
                    ICommerceService a = C25539a.m62079a();
                    if (optJSONObject != null) {
                        str = optJSONObject.optString("commodity_id");
                    } else {
                        str = null;
                    }
                    if (optJSONObject != null) {
                        str2 = String.valueOf(optJSONObject.optInt("commodity_type"));
                    } else {
                        str2 = null;
                    }
                    if (optJSONObject != null) {
                        str3 = optJSONObject.optString("group_id");
                    } else {
                        str3 = null;
                    }
                    if (optJSONObject != null) {
                        str4 = optJSONObject.optString("author_id");
                    } else {
                        str4 = null;
                    }
                    if (optJSONObject != null) {
                        str5 = optJSONObject.optString("previous_page");
                    } else {
                        str5 = null;
                    }
                    a.openTaobao(e, str6, str, str2, str3, str4, str5, null);
                    return;
                }
                Intent intent = new Intent(e, CrossPlatformActivity.class);
                intent.setData(Uri.parse(str6));
                e.startActivity(intent);
            }
        }
    }
}
