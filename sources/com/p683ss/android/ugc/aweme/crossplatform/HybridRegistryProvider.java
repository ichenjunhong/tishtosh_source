package com.p683ss.android.ugc.aweme.crossplatform;

import android.content.Context;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.web.C48271c;
import com.p683ss.android.ugc.aweme.web.C48373l;
import com.p683ss.android.ugc.aweme.web.jsbridge.IHybridRegistryProvider;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.HybridRegistryProvider */
public class HybridRegistryProvider implements IHybridRegistryProvider {
    public static IHybridRegistryProvider createIHybridRegistryProviderbyMonsterPlugin() {
        Object a = C27991b.m66756a(IHybridRegistryProvider.class);
        if (a != null) {
            return (IHybridRegistryProvider) a;
        }
        return new HybridRegistryProvider();
    }

    public C48373l createJsMessageHandler(Context context) {
        return new C48271c(context);
    }
}
