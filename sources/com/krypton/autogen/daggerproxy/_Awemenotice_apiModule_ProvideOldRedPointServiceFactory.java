package com.krypton.autogen.daggerproxy;

import com.p683ss.android.ugc.aweme.notice.api.p2006b.C38030c;
import dagger.p2651a.C52867d;
import dagger.p2651a.C52869f;

public final class _Awemenotice_apiModule_ProvideOldRedPointServiceFactory implements C52867d<C38030c> {

    /* renamed from: a */
    private final _Awemenotice_apiModule f50184a;

    public final C38030c get() {
        return provideInstance(this.f50184a);
    }

    public _Awemenotice_apiModule_ProvideOldRedPointServiceFactory(_Awemenotice_apiModule _awemenotice_apimodule) {
        this.f50184a = _awemenotice_apimodule;
    }

    public static _Awemenotice_apiModule_ProvideOldRedPointServiceFactory create(_Awemenotice_apiModule _awemenotice_apimodule) {
        return new _Awemenotice_apiModule_ProvideOldRedPointServiceFactory(_awemenotice_apimodule);
    }

    public static C38030c provideInstance(_Awemenotice_apiModule _awemenotice_apimodule) {
        return proxyProvideOldRedPointService(_awemenotice_apimodule);
    }

    public static C38030c proxyProvideOldRedPointService(_Awemenotice_apiModule _awemenotice_apimodule) {
        return (C38030c) C52869f.m112471a(_awemenotice_apimodule.provideOldRedPointService(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
