package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.android.live.network.api.INetworkService;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.livesdkapi.p455i.C8815e;
import org.json.JSONObject;
import p064c.p065a.p071d.C1711f;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.w */
final /* synthetic */ class C4942w implements C1711f {

    /* renamed from: a */
    private final String f13279a;

    /* renamed from: b */
    private final JSONObject f13280b;

    /* renamed from: c */
    private final JSONObject f13281c;

    /* renamed from: d */
    private final JSONObject f13282d;

    C4942w(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        this.f13279a = str;
        this.f13280b = jSONObject;
        this.f13281c = jSONObject2;
        this.f13282d = jSONObject3;
    }

    public final Object apply(Object obj) {
        String str = this.f13279a;
        JSONObject jSONObject = this.f13280b;
        JSONObject jSONObject2 = this.f13281c;
        JSONObject jSONObject3 = this.f13282d;
        if (TextUtils.equals((String) obj, "post")) {
            return C4940v.m11437a(str, jSONObject, jSONObject2, jSONObject3);
        }
        return Base64.encodeToString(((C8815e) ((INetworkService) C4116c.m10249a(INetworkService.class)).get(C4940v.m11436a(str, jSONObject2), C4940v.m11438a(jSONObject)).mo15805a()).f24066e, 2);
    }
}
