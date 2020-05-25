package com.p683ss.android.ugc.aweme.bullet.bridge.common;

import android.text.TextUtils;
import com.bytedance.ies.bullet.p628b.p637g.p638a.C10326b;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod.C24112a;
import com.p683ss.android.ugc.aweme.p1706fe.utils.C29973d;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.GetNativeItemMethod */
public final class GetNativeItemMethod extends BaseBridgeMethod {

    /* renamed from: b */
    public static final C24154a f64075b = new C24154a(null);

    /* renamed from: c */
    private final String f64076c = "getNativeItem";

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.GetNativeItemMethod$a */
    public static final class C24154a {
        private C24154a() {
        }

        public /* synthetic */ C24154a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: d */
    public final String mo18313d() {
        return this.f64076c;
    }

    public GetNativeItemMethod(C10326b bVar) {
        C52711k.m112240b(bVar, "contextProviderFactory");
        super(bVar);
    }

    /* renamed from: a */
    public final void mo49906a(JSONObject jSONObject, C24112a aVar) {
        C52711k.m112240b(jSONObject, "params");
        C52711k.m112240b(aVar, "iReturn");
        try {
            String a = C29973d.m70118a().mo60150a(jSONObject.optString("key"), "");
            if (!TextUtils.isEmpty(a)) {
                aVar.mo49911a((Object) a);
            } else {
                aVar.mo49910a(-1, "value为空");
            }
        } catch (Exception e) {
            aVar.mo49910a(-1, e.getMessage());
        }
    }
}
