package com.p683ss.android.ugc.aweme.services;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.ies.p675g.p676a.C10757a;
import com.bytedance.ies.p675g.p676a.C10762d;
import com.p683ss.android.ugc.aweme.C23359ba;
import com.p683ss.android.ugc.aweme.C23826bi;
import com.p683ss.android.ugc.aweme.account.p1260a.p1262b.C20856a;
import com.p683ss.android.ugc.aweme.account.p1273f.C20969b;
import com.p683ss.android.ugc.aweme.account.p1274g.C20975a;
import com.p683ss.android.ugc.aweme.account.p1304q.p1305a.C22121a;
import com.p683ss.android.ugc.aweme.account.p1304q.p1305a.C22132b;
import com.p683ss.android.ugc.aweme.account.p1304q.p1305a.C22135c;
import com.p683ss.android.ugc.aweme.common.C26890h;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONObject;
import p2628d.C52847n;
import p2628d.p2629a.C52550ab;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.services.RnAndH5Service */
public final class RnAndH5Service implements C23359ba {
    public final void notifyFromRnAndH5(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                if (TextUtils.equals("find_account_back", jSONObject.getString("eventName"))) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                    C20969b bVar = new C20969b(jSONObject2.getString("platform"), true, new JSONObject(jSONObject2.getString("user_info")));
                    C23826bi.m58455a(bVar.f57077a);
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("block_bind_phone", true);
                    C23826bi.m58464e().mo44377a(bundle);
                    String str = "";
                    if (TextUtils.equals(bVar.f57078b, "weixin")) {
                        str = "find_account_weixin";
                    } else if (TextUtils.equals(bVar.f57078b, "qzone_sns")) {
                        str = "find_account_qq";
                    }
                    C26890h.m65011a("login_submit", new C20856a().mo44776a("platform", "sms_verification").mo44776a("enter_method", str).f56798a);
                    C26890h.m65011a("login_success", new C20856a().mo44776a("platform", "sms_verification").mo44776a("enter_method", str).mo44774a("status", 1).f56798a);
                    C20975a.m53337a(4);
                } else if (TextUtils.equals("rebindPhone_certify_success", jSONObject.getString("eventName"))) {
                    C20975a.m53337a(8);
                }
                if (TextUtils.equals(jSONObject.getString("eventName"), "account_recover_done")) {
                    C20975a.m53337a(12);
                }
            } catch (Exception unused) {
            }
        }
    }

    public final Map<String, C10762d> getJavaMethods(WeakReference<Context> weakReference, C10757a aVar) {
        C52711k.m112240b(weakReference, "contextWrf");
        C52711k.m112240b(aVar, "iesJsBridge");
        return C52550ab.m112057c(new C52847n("sendVerifyCode", new C22132b(weakReference, aVar)), new C52847n("validateVerifyCode", new C22135c(weakReference, aVar)), new C52847n("localPhoneNo", new C22121a(weakReference, aVar)));
    }
}
