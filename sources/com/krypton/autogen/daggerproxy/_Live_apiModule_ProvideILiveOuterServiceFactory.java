package com.krypton.autogen.daggerproxy;

import com.p683ss.android.ugc.aweme.live.ILiveOuterService;
import dagger.p2651a.C52867d;
import dagger.p2651a.C52869f;

public final class _Live_apiModule_ProvideILiveOuterServiceFactory implements C52867d<ILiveOuterService> {

    /* renamed from: a */
    private final _Live_apiModule f50198a;

    public final ILiveOuterService get() {
        return provideInstance(this.f50198a);
    }

    public _Live_apiModule_ProvideILiveOuterServiceFactory(_Live_apiModule _live_apimodule) {
        this.f50198a = _live_apimodule;
    }

    public static _Live_apiModule_ProvideILiveOuterServiceFactory create(_Live_apiModule _live_apimodule) {
        return new _Live_apiModule_ProvideILiveOuterServiceFactory(_live_apimodule);
    }

    public static ILiveOuterService provideInstance(_Live_apiModule _live_apimodule) {
        return proxyProvideILiveOuterService(_live_apimodule);
    }

    public static ILiveOuterService proxyProvideILiveOuterService(_Live_apiModule _live_apimodule) {
        return (ILiveOuterService) C52869f.m112471a(_live_apimodule.provideILiveOuterService(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
