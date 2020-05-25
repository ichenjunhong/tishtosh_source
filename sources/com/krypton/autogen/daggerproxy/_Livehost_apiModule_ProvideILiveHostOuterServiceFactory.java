package com.krypton.autogen.daggerproxy;

import com.p683ss.android.ugc.aweme.live.ILiveHostOuterService;
import dagger.p2651a.C52867d;
import dagger.p2651a.C52869f;

public final class _Livehost_apiModule_ProvideILiveHostOuterServiceFactory implements C52867d<ILiveHostOuterService> {

    /* renamed from: a */
    private final _Livehost_apiModule f50199a;

    public final ILiveHostOuterService get() {
        return provideInstance(this.f50199a);
    }

    public _Livehost_apiModule_ProvideILiveHostOuterServiceFactory(_Livehost_apiModule _livehost_apimodule) {
        this.f50199a = _livehost_apimodule;
    }

    public static _Livehost_apiModule_ProvideILiveHostOuterServiceFactory create(_Livehost_apiModule _livehost_apimodule) {
        return new _Livehost_apiModule_ProvideILiveHostOuterServiceFactory(_livehost_apimodule);
    }

    public static ILiveHostOuterService provideInstance(_Livehost_apiModule _livehost_apimodule) {
        return proxyProvideILiveHostOuterService(_livehost_apimodule);
    }

    public static ILiveHostOuterService proxyProvideILiveHostOuterService(_Livehost_apiModule _livehost_apimodule) {
        return (ILiveHostOuterService) C52869f.m112471a(_livehost_apimodule.provideILiveHostOuterService(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
