package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.text.TextUtils;
import org.json.JSONObject;
import p064c.p065a.p071d.C1715j;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.bu */
public final /* synthetic */ class C6486bu implements C1715j {

    /* renamed from: a */
    public static final C1715j f17786a = new C6486bu();

    private C6486bu() {
    }

    /* renamed from: a */
    public final boolean mo6207a(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        return TextUtils.equals(jSONObject.optString("source"), "TTLiveSDK_Android") || TextUtils.equals(jSONObject.optString("source"), "TTLiveSDK_IOS");
    }
}
