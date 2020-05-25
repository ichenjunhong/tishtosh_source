package com.krypton.autogen.daggerproxy;

import com.p683ss.android.ugc.aweme.notice.api.C38027b;
import dagger.p2651a.C52867d;
import dagger.p2651a.C52869f;

public final class _Awemenotice_apiModule_ProvideLivePushServiceFactory implements C52867d<C38027b> {

    /* renamed from: a */
    private final _Awemenotice_apiModule f50172a;

    public final C38027b get() {
        return provideInstance(this.f50172a);
    }

    public _Awemenotice_apiModule_ProvideLivePushServiceFactory(_Awemenotice_apiModule _awemenotice_apimodule) {
        this.f50172a = _awemenotice_apimodule;
    }

    public static _Awemenotice_apiModule_ProvideLivePushServiceFactory create(_Awemenotice_apiModule _awemenotice_apimodule) {
        return new _Awemenotice_apiModule_ProvideLivePushServiceFactory(_awemenotice_apimodule);
    }

    public static C38027b provideInstance(_Awemenotice_apiModule _awemenotice_apimodule) {
        return proxyProvideLivePushService(_awemenotice_apimodule);
    }

    public static C38027b proxyProvideLivePushService(_Awemenotice_apiModule _awemenotice_apimodule) {
        return (C38027b) C52869f.m112471a(_awemenotice_apimodule.provideLivePushService(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
