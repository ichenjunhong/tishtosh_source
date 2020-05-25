package com.p683ss.android.ugc.aweme.tools.music.p2366e;

import com.google.gson.C17971f;
import com.p683ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.p683ss.android.ugc.aweme.services.IAVServiceProxy;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.tools.music.e.e */
public final class C47202e {

    /* renamed from: a */
    private static final C17971f f119158a;

    /* renamed from: a */
    public static final C17971f m102460a() {
        return f119158a;
    }

    static {
        IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin();
        C52711k.m112236a((Object) createIAVServiceProxybyMonsterPlugin, "ServiceManager.get().get…ServiceProxy::class.java)");
        f119158a = createIAVServiceProxybyMonsterPlugin.getNetworkService().getRetrofitFactoryGson();
    }
}
