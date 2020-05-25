package com.krypton.autogen.daggerproxy;

import com.p683ss.android.ugc.aweme.notice.api.p2006b.C38031d;
import dagger.p2651a.C52867d;
import dagger.p2651a.C52869f;

public final class _Awemenotice_apiModule_ProvideRedPointServiceFactory implements C52867d<C38031d> {

    /* renamed from: a */
    private final _Awemenotice_apiModule f50185a;

    public final C38031d get() {
        return provideInstance(this.f50185a);
    }

    public _Awemenotice_apiModule_ProvideRedPointServiceFactory(_Awemenotice_apiModule _awemenotice_apimodule) {
        this.f50185a = _awemenotice_apimodule;
    }

    public static _Awemenotice_apiModule_ProvideRedPointServiceFactory create(_Awemenotice_apiModule _awemenotice_apimodule) {
        return new _Awemenotice_apiModule_ProvideRedPointServiceFactory(_awemenotice_apimodule);
    }

    public static C38031d provideInstance(_Awemenotice_apiModule _awemenotice_apimodule) {
        return proxyProvideRedPointService(_awemenotice_apimodule);
    }

    public static C38031d proxyProvideRedPointService(_Awemenotice_apiModule _awemenotice_apimodule) {
        return (C38031d) C52869f.m112471a(_awemenotice_apimodule.provideRedPointService(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
