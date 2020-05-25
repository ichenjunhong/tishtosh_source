package com.krypton.autogen.daggerproxy;

import com.p683ss.android.ugc.aweme.notice.api.p2007c.C38045b;
import dagger.p2651a.C52867d;
import dagger.p2651a.C52869f;

public final class _Awemenotice_apiModule_ProvideNoticeListServiceFactory implements C52867d<C38045b> {

    /* renamed from: a */
    private final _Awemenotice_apiModule f50180a;

    public final C38045b get() {
        return provideInstance(this.f50180a);
    }

    public _Awemenotice_apiModule_ProvideNoticeListServiceFactory(_Awemenotice_apiModule _awemenotice_apimodule) {
        this.f50180a = _awemenotice_apimodule;
    }

    public static _Awemenotice_apiModule_ProvideNoticeListServiceFactory create(_Awemenotice_apiModule _awemenotice_apimodule) {
        return new _Awemenotice_apiModule_ProvideNoticeListServiceFactory(_awemenotice_apimodule);
    }

    public static C38045b provideInstance(_Awemenotice_apiModule _awemenotice_apimodule) {
        return proxyProvideNoticeListService(_awemenotice_apimodule);
    }

    public static C38045b proxyProvideNoticeListService(_Awemenotice_apiModule _awemenotice_apimodule) {
        return (C38045b) C52869f.m112471a(_awemenotice_apimodule.provideNoticeListService(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
