package com.krypton.autogen.daggerproxy;

import com.p683ss.android.ugc.aweme.notice.api.p2005ab.NoticeABService;
import dagger.p2651a.C52867d;
import dagger.p2651a.C52869f;

public final class _Awemenotice_apiModule_ProvideNoticeABServiceFactory implements C52867d<NoticeABService> {

    /* renamed from: a */
    private final _Awemenotice_apiModule f50174a;

    public final NoticeABService get() {
        return provideInstance(this.f50174a);
    }

    public _Awemenotice_apiModule_ProvideNoticeABServiceFactory(_Awemenotice_apiModule _awemenotice_apimodule) {
        this.f50174a = _awemenotice_apimodule;
    }

    public static _Awemenotice_apiModule_ProvideNoticeABServiceFactory create(_Awemenotice_apiModule _awemenotice_apimodule) {
        return new _Awemenotice_apiModule_ProvideNoticeABServiceFactory(_awemenotice_apimodule);
    }

    public static NoticeABService provideInstance(_Awemenotice_apiModule _awemenotice_apimodule) {
        return proxyProvideNoticeABService(_awemenotice_apimodule);
    }

    public static NoticeABService proxyProvideNoticeABService(_Awemenotice_apiModule _awemenotice_apimodule) {
        return (NoticeABService) C52869f.m112471a(_awemenotice_apimodule.provideNoticeABService(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
