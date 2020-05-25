package com.krypton.autogen.daggerproxy;

import com.p683ss.android.ugc.aweme.notice.api.p2006b.C38029b;
import dagger.p2651a.C52867d;
import dagger.p2651a.C52869f;

public final class _Awemenotice_apiModule_ProvideNoticeCountServiceFactory implements C52867d<C38029b> {

    /* renamed from: a */
    private final _Awemenotice_apiModule f50178a;

    public final C38029b get() {
        return provideInstance(this.f50178a);
    }

    public _Awemenotice_apiModule_ProvideNoticeCountServiceFactory(_Awemenotice_apiModule _awemenotice_apimodule) {
        this.f50178a = _awemenotice_apimodule;
    }

    public static _Awemenotice_apiModule_ProvideNoticeCountServiceFactory create(_Awemenotice_apiModule _awemenotice_apimodule) {
        return new _Awemenotice_apiModule_ProvideNoticeCountServiceFactory(_awemenotice_apimodule);
    }

    public static C38029b provideInstance(_Awemenotice_apiModule _awemenotice_apimodule) {
        return proxyProvideNoticeCountService(_awemenotice_apimodule);
    }

    public static C38029b proxyProvideNoticeCountService(_Awemenotice_apiModule _awemenotice_apimodule) {
        return (C38029b) C52869f.m112471a(_awemenotice_apimodule.provideNoticeCountService(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
