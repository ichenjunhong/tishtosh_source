package com.p683ss.android.ugc.aweme.bullet.bridge.common;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod.C24112a;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26435bs;
import org.json.JSONObject;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.MakeCallMethod */
public final class MakeCallMethod extends BaseBridgeMethod {

    /* renamed from: b */
    public static final C24162a f64090b = new C24162a(null);

    /* renamed from: c */
    private final String f64091c;

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.MakeCallMethod$a */
    public static final class C24162a {
        private C24162a() {
        }

        public /* synthetic */ C24162a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: d */
    public final String mo18313d() {
        return this.f64091c;
    }

    /* renamed from: a */
    public final void mo49906a(JSONObject jSONObject, C24112a aVar) {
        C52711k.m112240b(jSONObject, "params");
        C52711k.m112240b(aVar, "iReturn");
        Context e = mo18743e();
        if (e != null) {
            String optString = jSONObject.optString("phone_number");
            String optString2 = jSONObject.optString("phone_id");
            String optString3 = jSONObject.optString("encrypt_key");
            String optString4 = jSONObject.optString("log_tag");
            if (TextUtils.isEmpty(optString)) {
                aVar.mo49910a(0, "phone_number is null");
            } else if (TextUtils.isEmpty(optString2)) {
                aVar.mo49910a(0, "phone_id is null");
            } else if (TextUtils.isEmpty(optString3)) {
                aVar.mo49910a(0, "encrypt_key is null");
            } else {
                C26435bs a = C26435bs.m63920a();
                if (e != null) {
                    a.mo54161a((Activity) e, optString, optString2, optString3, optString4);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("code", 1);
                    aVar.mo49913a(jSONObject2);
                    return;
                }
                throw new C52857u("null cannot be cast to non-null type android.app.Activity");
            }
        }
    }
}
