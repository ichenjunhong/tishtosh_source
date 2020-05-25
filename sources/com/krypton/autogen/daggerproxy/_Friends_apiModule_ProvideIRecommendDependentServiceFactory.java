package com.krypton.autogen.daggerproxy;

import com.p683ss.android.ugc.aweme.friends.service.IRecommendDependentService;
import dagger.p2651a.C52867d;
import dagger.p2651a.C52869f;

public final class _Friends_apiModule_ProvideIRecommendDependentServiceFactory implements C52867d<IRecommendDependentService> {

    /* renamed from: a */
    private final _Friends_apiModule f50196a;

    public final IRecommendDependentService get() {
        return provideInstance(this.f50196a);
    }

    public _Friends_apiModule_ProvideIRecommendDependentServiceFactory(_Friends_apiModule _friends_apimodule) {
        this.f50196a = _friends_apimodule;
    }

    public static _Friends_apiModule_ProvideIRecommendDependentServiceFactory create(_Friends_apiModule _friends_apimodule) {
        return new _Friends_apiModule_ProvideIRecommendDependentServiceFactory(_friends_apimodule);
    }

    public static IRecommendDependentService provideInstance(_Friends_apiModule _friends_apimodule) {
        return proxyProvideIRecommendDependentService(_friends_apimodule);
    }

    public static IRecommendDependentService proxyProvideIRecommendDependentService(_Friends_apiModule _friends_apimodule) {
        return (IRecommendDependentService) C52869f.m112471a(_friends_apimodule.provideIRecommendDependentService(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
