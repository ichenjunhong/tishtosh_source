package com.krypton.autogen.daggerproxy;

import com.p683ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import dagger.p2651a.C52867d;
import dagger.p2651a.C52869f;

public final class _Aweme_service_apiModule_ProvideIAwemeServiceFactory implements C52867d<IAwemeService> {

    /* renamed from: a */
    private final _Aweme_service_apiModule f50165a;

    public final IAwemeService get() {
        return provideInstance(this.f50165a);
    }

    public _Aweme_service_apiModule_ProvideIAwemeServiceFactory(_Aweme_service_apiModule _aweme_service_apimodule) {
        this.f50165a = _aweme_service_apimodule;
    }

    public static _Aweme_service_apiModule_ProvideIAwemeServiceFactory create(_Aweme_service_apiModule _aweme_service_apimodule) {
        return new _Aweme_service_apiModule_ProvideIAwemeServiceFactory(_aweme_service_apimodule);
    }

    public static IAwemeService provideInstance(_Aweme_service_apiModule _aweme_service_apimodule) {
        return proxyProvideIAwemeService(_aweme_service_apimodule);
    }

    public static IAwemeService proxyProvideIAwemeService(_Aweme_service_apiModule _aweme_service_apimodule) {
        return (IAwemeService) C52869f.m112471a(_aweme_service_apimodule.provideIAwemeService(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
