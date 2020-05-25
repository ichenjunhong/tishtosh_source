package com.p683ss.android.ugc.aweme.web.jsbridge;

import android.content.Context;
import com.p683ss.android.ugc.aweme.crossplatform.HybridRegistryProvider;
import com.p683ss.android.ugc.aweme.web.C48373l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.s */
public final class C48361s {

    /* renamed from: a */
    public static final C48361s f121657a = new C48361s();

    private C48361s() {
    }

    /* renamed from: a */
    public static C48373l m104668a(Context context) {
        IHybridRegistryProvider createIHybridRegistryProviderbyMonsterPlugin = HybridRegistryProvider.createIHybridRegistryProviderbyMonsterPlugin();
        if (context == null) {
            C52711k.m112234a();
        }
        C48373l createJsMessageHandler = createIHybridRegistryProviderbyMonsterPlugin.createJsMessageHandler(context);
        C52711k.m112236a((Object) createJsMessageHandler, "ServiceManager.get().get…MessageHandler(context!!)");
        return createJsMessageHandler;
    }
}
