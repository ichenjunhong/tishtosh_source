package com.p683ss.android.ugc.aweme.p1706fe.method.commerce;

import com.bytedance.ies.p675g.p676a.C10757a;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.p683ss.android.ugc.aweme.commerce.service.C25539a;
import com.p683ss.android.ugc.aweme.commerce.service.ICommerceService;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod.C29789a;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.fe.method.commerce.JumpToTaobaoBindMethod */
public final class JumpToTaobaoBindMethod extends BaseCommonJavaMethod {

    /* renamed from: a */
    public static final C29869a f77970a = new C29869a(null);

    /* renamed from: com.ss.android.ugc.aweme.fe.method.commerce.JumpToTaobaoBindMethod$a */
    public static final class C29869a {
        private C29869a() {
        }

        public /* synthetic */ C29869a(C52707g gVar) {
            this();
        }
    }

    public JumpToTaobaoBindMethod() {
        this(null, 1, null);
    }

    public JumpToTaobaoBindMethod(C10757a aVar) {
        super(aVar);
    }

    /* renamed from: a */
    public final void mo49914a(JSONObject jSONObject, C29789a aVar) {
        int i = 1;
        boolean z = false;
        if (jSONObject != null && jSONObject.has("taobaoUrl")) {
            try {
                ICommerceService a = C25539a.m62079a();
                String optString = jSONObject.optString("taobaoUrl");
                C52711k.m112236a((Object) optString, "params.optString(KEY_TAOBAO_URL)");
                a.goBindTaobao(optString, C11016e.m22312g());
                z = true;
            } catch (Exception unused) {
            }
        }
        if (!z) {
            i = -1;
        }
        aVar.mo60040a(null, i, "");
    }

    private /* synthetic */ JumpToTaobaoBindMethod(C10757a aVar, int i, C52707g gVar) {
        this(null);
    }
}
