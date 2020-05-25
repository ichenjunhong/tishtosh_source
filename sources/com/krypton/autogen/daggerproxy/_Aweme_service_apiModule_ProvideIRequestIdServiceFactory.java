package com.krypton.autogen.daggerproxy;

import com.p683ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import dagger.p2651a.C52867d;
import dagger.p2651a.C52869f;

public final class _Aweme_service_apiModule_ProvideIRequestIdServiceFactory implements C52867d<IRequestIdService> {

    /* renamed from: a */
    private final _Aweme_service_apiModule f50166a;

    public final IRequestIdService get() {
        return provideInstance(this.f50166a);
    }

    public _Aweme_service_apiModule_ProvideIRequestIdServiceFactory(_Aweme_service_apiModule _aweme_service_apimodule) {
        this.f50166a = _aweme_service_apimodule;
    }

    public static _Aweme_service_apiModule_ProvideIRequestIdServiceFactory create(_Aweme_service_apiModule _aweme_service_apimodule) {
        return new _Aweme_service_apiModule_ProvideIRequestIdServiceFactory(_aweme_service_apimodule);
    }

    public static IRequestIdService provideInstance(_Aweme_service_apiModule _aweme_service_apimodule) {
        return proxyProvideIRequestIdService(_aweme_service_apimodule);
    }

    public static IRequestIdService proxyProvideIRequestIdService(_Aweme_service_apiModule _aweme_service_apimodule) {
        return (IRequestIdService) C52869f.m112471a(_aweme_service_apimodule.provideIRequestIdService(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
