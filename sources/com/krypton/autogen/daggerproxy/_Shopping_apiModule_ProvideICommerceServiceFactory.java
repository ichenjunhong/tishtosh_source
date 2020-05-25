package com.krypton.autogen.daggerproxy;

import com.p683ss.android.ugc.aweme.commerce.service.ICommerceService;
import dagger.p2651a.C52867d;
import dagger.p2651a.C52869f;

public final class _Shopping_apiModule_ProvideICommerceServiceFactory implements C52867d<ICommerceService> {

    /* renamed from: a */
    private final _Shopping_apiModule f50204a;

    public final ICommerceService get() {
        return provideInstance(this.f50204a);
    }

    public _Shopping_apiModule_ProvideICommerceServiceFactory(_Shopping_apiModule _shopping_apimodule) {
        this.f50204a = _shopping_apimodule;
    }

    public static _Shopping_apiModule_ProvideICommerceServiceFactory create(_Shopping_apiModule _shopping_apimodule) {
        return new _Shopping_apiModule_ProvideICommerceServiceFactory(_shopping_apimodule);
    }

    public static ICommerceService provideInstance(_Shopping_apiModule _shopping_apimodule) {
        return proxyProvideICommerceService(_shopping_apimodule);
    }

    public static ICommerceService proxyProvideICommerceService(_Shopping_apiModule _shopping_apimodule) {
        return (ICommerceService) C52869f.m112471a(_shopping_apimodule.provideICommerceService(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
