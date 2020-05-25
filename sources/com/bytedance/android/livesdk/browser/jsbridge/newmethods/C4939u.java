package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.text.TextUtils;
import com.bytedance.android.live.network.api.INetworkService;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.livesdkapi.p455i.C8815e;
import org.json.JSONObject;
import p064c.p065a.p071d.C1711f;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.u */
final /* synthetic */ class C4939u implements C1711f {

    /* renamed from: a */
    private final String f13273a;

    /* renamed from: b */
    private final JSONObject f13274b;

    /* renamed from: c */
    private final JSONObject f13275c;

    /* renamed from: d */
    private final JSONObject f13276d;

    C4939u(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        this.f13273a = str;
        this.f13274b = jSONObject;
        this.f13275c = jSONObject2;
        this.f13276d = jSONObject3;
    }

    public final Object apply(Object obj) {
        String str = this.f13273a;
        JSONObject jSONObject = this.f13274b;
        JSONObject jSONObject2 = this.f13275c;
        JSONObject jSONObject3 = this.f13276d;
        if (TextUtils.equals((String) obj, "post")) {
            return C4937t.m11435a(str, jSONObject2, jSONObject, jSONObject3);
        }
        return new JSONObject(new String(((C8815e) ((INetworkService) C4116c.m10249a(INetworkService.class)).get(C4937t.m11433a(str, jSONObject), C4937t.m11434a(jSONObject2)).mo15805a()).f24066e));
    }
}
