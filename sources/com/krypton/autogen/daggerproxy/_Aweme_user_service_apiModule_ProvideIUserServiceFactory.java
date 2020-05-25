package com.krypton.autogen.daggerproxy;

import com.p683ss.android.ugc.aweme.userservice.api.C47590b;
import dagger.p2651a.C52867d;
import dagger.p2651a.C52869f;

public final class _Aweme_user_service_apiModule_ProvideIUserServiceFactory implements C52867d<C47590b> {

    /* renamed from: a */
    private final _Aweme_user_service_apiModule f50167a;

    public final C47590b get() {
        return provideInstance(this.f50167a);
    }

    public _Aweme_user_service_apiModule_ProvideIUserServiceFactory(_Aweme_user_service_apiModule _aweme_user_service_apimodule) {
        this.f50167a = _aweme_user_service_apimodule;
    }

    public static _Aweme_user_service_apiModule_ProvideIUserServiceFactory create(_Aweme_user_service_apiModule _aweme_user_service_apimodule) {
        return new _Aweme_user_service_apiModule_ProvideIUserServiceFactory(_aweme_user_service_apimodule);
    }

    public static C47590b provideInstance(_Aweme_user_service_apiModule _aweme_user_service_apimodule) {
        return proxyProvideIUserService(_aweme_user_service_apimodule);
    }

    public static C47590b proxyProvideIUserService(_Aweme_user_service_apiModule _aweme_user_service_apimodule) {
        return (C47590b) C52869f.m112471a(_aweme_user_service_apimodule.provideIUserService(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
