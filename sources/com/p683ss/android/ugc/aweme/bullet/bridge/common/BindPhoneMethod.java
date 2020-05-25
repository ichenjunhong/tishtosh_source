package com.p683ss.android.ugc.aweme.bullet.bridge.common;

import android.text.TextUtils;
import com.bytedance.ies.bullet.p628b.p637g.p638a.C10326b;
import com.p683ss.android.ugc.aweme.account.p1273f.C20968a;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod.C24112a;
import com.p683ss.android.ugc.aweme.p1706fe.utils.C29970a;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import org.greenrobot.eventbus.C53771m;
import org.json.JSONException;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.BindPhoneMethod */
public final class BindPhoneMethod extends BaseBridgeMethod {

    /* renamed from: b */
    public static final C24142a f64049b = new C24142a(null);

    /* renamed from: c */
    private final String f64050c = "bindPhone";

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.BindPhoneMethod$a */
    public static final class C24142a {
        private C24142a() {
        }

        public /* synthetic */ C24142a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: d */
    public final String mo18313d() {
        return this.f64050c;
    }

    public BindPhoneMethod(C10326b bVar) {
        C52711k.m112240b(bVar, "contextProviderFactory");
        super(bVar);
    }

    @C53771m
    public final void onEvent(C20968a aVar) {
        C52711k.m112240b(aVar, "event");
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject.put("type", "bindPhone");
                jSONObject2.put("code", TextUtils.isEmpty(aVar.f57074a) ^ true ? 1 : 0);
                if (!TextUtils.isEmpty(aVar.f57075b)) {
                    jSONObject2.put("_raw", aVar.f57075b);
                }
                jSONObject.put("args", jSONObject2);
            } catch (JSONException unused) {
            }
            mo49905a("H5_nativeEvent", jSONObject);
        } catch (Exception unused2) {
        }
        C47718bf.m103291d(this);
    }

    /* renamed from: a */
    public final void mo49906a(JSONObject jSONObject, C24112a aVar) {
        C52711k.m112240b(jSONObject, "params");
        C52711k.m112240b(aVar, "iReturn");
        C47718bf.m103290c(this);
        C29970a.m70114a(mo18743e(), jSONObject);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("code", 1);
        aVar.mo49913a(jSONObject2);
    }
}
