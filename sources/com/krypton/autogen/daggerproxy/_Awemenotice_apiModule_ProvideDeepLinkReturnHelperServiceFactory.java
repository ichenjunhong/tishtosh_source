package com.krypton.autogen.daggerproxy;

import com.p683ss.android.ugc.aweme.notice.api.helper.DeepLinkReturnHelperService;
import dagger.p2651a.C52867d;
import dagger.p2651a.C52869f;

public final class _Awemenotice_apiModule_ProvideDeepLinkReturnHelperServiceFactory implements C52867d<DeepLinkReturnHelperService> {

    /* renamed from: a */
    private final _Awemenotice_apiModule f50168a;

    public final DeepLinkReturnHelperService get() {
        return provideInstance(this.f50168a);
    }

    public _Awemenotice_apiModule_ProvideDeepLinkReturnHelperServiceFactory(_Awemenotice_apiModule _awemenotice_apimodule) {
        this.f50168a = _awemenotice_apimodule;
    }

    public static _Awemenotice_apiModule_ProvideDeepLinkReturnHelperServiceFactory create(_Awemenotice_apiModule _awemenotice_apimodule) {
        return new _Awemenotice_apiModule_ProvideDeepLinkReturnHelperServiceFactory(_awemenotice_apimodule);
    }

    public static DeepLinkReturnHelperService provideInstance(_Awemenotice_apiModule _awemenotice_apimodule) {
        return proxyProvideDeepLinkReturnHelperService(_awemenotice_apimodule);
    }

    public static DeepLinkReturnHelperService proxyProvideDeepLinkReturnHelperService(_Awemenotice_apiModule _awemenotice_apimodule) {
        return (DeepLinkReturnHelperService) C52869f.m112471a(_awemenotice_apimodule.provideDeepLinkReturnHelperService(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
