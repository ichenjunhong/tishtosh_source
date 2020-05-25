package com.p2620vk.sdk.api;

import com.p2620vk.sdk.api.model.VKApiModel;
import org.json.JSONObject;

/* renamed from: com.vk.sdk.api.a */
public final class C52326a extends C52353d {

    /* renamed from: a */
    private final Class<? extends VKApiModel> f130307a;

    public C52326a(Class<? extends VKApiModel> cls) {
        this.f130307a = cls;
    }

    /* renamed from: a */
    public final Object mo109138a(JSONObject jSONObject) {
        try {
            VKApiModel vKApiModel = (VKApiModel) this.f130307a.newInstance();
            vKApiModel.mo109175b(jSONObject);
            return vKApiModel;
        } catch (Exception unused) {
            return null;
        }
    }
}
