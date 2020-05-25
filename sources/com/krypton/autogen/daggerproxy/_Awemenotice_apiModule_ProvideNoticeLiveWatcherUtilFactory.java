package com.krypton.autogen.daggerproxy;

import com.p683ss.android.ugc.aweme.notice.api.utils.NoticeLiveWatcherUtil;
import dagger.p2651a.C52867d;
import dagger.p2651a.C52869f;

public final class _Awemenotice_apiModule_ProvideNoticeLiveWatcherUtilFactory implements C52867d<NoticeLiveWatcherUtil> {

    /* renamed from: a */
    private final _Awemenotice_apiModule f50182a;

    public final NoticeLiveWatcherUtil get() {
        return provideInstance(this.f50182a);
    }

    public _Awemenotice_apiModule_ProvideNoticeLiveWatcherUtilFactory(_Awemenotice_apiModule _awemenotice_apimodule) {
        this.f50182a = _awemenotice_apimodule;
    }

    public static _Awemenotice_apiModule_ProvideNoticeLiveWatcherUtilFactory create(_Awemenotice_apiModule _awemenotice_apimodule) {
        return new _Awemenotice_apiModule_ProvideNoticeLiveWatcherUtilFactory(_awemenotice_apimodule);
    }

    public static NoticeLiveWatcherUtil provideInstance(_Awemenotice_apiModule _awemenotice_apimodule) {
        return proxyProvideNoticeLiveWatcherUtil(_awemenotice_apimodule);
    }

    public static NoticeLiveWatcherUtil proxyProvideNoticeLiveWatcherUtil(_Awemenotice_apiModule _awemenotice_apimodule) {
        return (NoticeLiveWatcherUtil) C52869f.m112471a(_awemenotice_apimodule.provideNoticeLiveWatcherUtil(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
