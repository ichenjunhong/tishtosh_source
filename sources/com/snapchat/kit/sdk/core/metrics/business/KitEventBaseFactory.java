package com.snapchat.kit.sdk.core.metrics.business;

import com.snapchat.kit.sdk.core.metrics.model.KitEventBase;
import com.snapchat.kit.sdk.core.metrics.model.KitEventBase.Builder;
import com.snapchat.kit.sdk.core.metrics.model.KitType;
import com.snapchat.kit.sdk.core.networking.C18286b;
import java.util.Locale;

public class KitEventBaseFactory {

    /* renamed from: a */
    private final String f50454a;

    public KitEventBaseFactory(String str) {
        this.f50454a = str;
    }

    public KitEventBase createKitEventBase(KitType kitType, String str) {
        String str2;
        Builder kit_user_agent = new Builder().kit_variant(kitType).kit_variant_version(str).oauth_client_id(this.f50454a).kit_user_agent(C18286b.f50489a);
        Locale locale = Locale.getDefault();
        if (locale == null) {
            str2 = "";
        } else {
            str2 = locale.toString();
        }
        return kit_user_agent.locale(str2).kit_client_timestamp_millis(Long.valueOf(System.currentTimeMillis())).build();
    }
}
