package com.p683ss.android.ugc.aweme.dmt_integration;

import com.p683ss.android.ugc.aweme.framework.services.ServiceProvider;
import com.p683ss.android.ugc.aweme.initializer.AVServiceProxyImpl;

/* renamed from: com.ss.android.ugc.aweme.dmt_integration.c */
final /* synthetic */ class C29006c implements ServiceProvider {

    /* renamed from: a */
    static final ServiceProvider f75919a = new C29006c();

    private C29006c() {
    }

    public final Object get() {
        return AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin();
    }
}
