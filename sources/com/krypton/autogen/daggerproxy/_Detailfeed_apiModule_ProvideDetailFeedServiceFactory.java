package com.krypton.autogen.daggerproxy;

import com.p683ss.android.ugc.aweme.C20845aa;
import dagger.p2651a.C52867d;
import dagger.p2651a.C52869f;

public final class _Detailfeed_apiModule_ProvideDetailFeedServiceFactory implements C52867d<C20845aa> {

    /* renamed from: a */
    private final _Detailfeed_apiModule f50191a;

    public final C20845aa get() {
        return provideInstance(this.f50191a);
    }

    public _Detailfeed_apiModule_ProvideDetailFeedServiceFactory(_Detailfeed_apiModule _detailfeed_apimodule) {
        this.f50191a = _detailfeed_apimodule;
    }

    public static _Detailfeed_apiModule_ProvideDetailFeedServiceFactory create(_Detailfeed_apiModule _detailfeed_apimodule) {
        return new _Detailfeed_apiModule_ProvideDetailFeedServiceFactory(_detailfeed_apimodule);
    }

    public static C20845aa provideInstance(_Detailfeed_apiModule _detailfeed_apimodule) {
        return proxyProvideDetailFeedService(_detailfeed_apimodule);
    }

    public static C20845aa proxyProvideDetailFeedService(_Detailfeed_apiModule _detailfeed_apimodule) {
        return (C20845aa) C52869f.m112471a(_detailfeed_apimodule.provideDetailFeedService(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
