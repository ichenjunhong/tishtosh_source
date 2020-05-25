package com.krypton.autogen.daggerproxy;

import com.p683ss.android.ugc.aweme.notice.api.utils.NoticeChallengePropertyUtil;
import dagger.p2651a.C52867d;
import dagger.p2651a.C52869f;

public final class _Awemenotice_apiModule_ProvideNoticeChallengePropertyUtilFactory implements C52867d<NoticeChallengePropertyUtil> {

    /* renamed from: a */
    private final _Awemenotice_apiModule f50176a;

    public final NoticeChallengePropertyUtil get() {
        return provideInstance(this.f50176a);
    }

    public _Awemenotice_apiModule_ProvideNoticeChallengePropertyUtilFactory(_Awemenotice_apiModule _awemenotice_apimodule) {
        this.f50176a = _awemenotice_apimodule;
    }

    public static _Awemenotice_apiModule_ProvideNoticeChallengePropertyUtilFactory create(_Awemenotice_apiModule _awemenotice_apimodule) {
        return new _Awemenotice_apiModule_ProvideNoticeChallengePropertyUtilFactory(_awemenotice_apimodule);
    }

    public static NoticeChallengePropertyUtil provideInstance(_Awemenotice_apiModule _awemenotice_apimodule) {
        return proxyProvideNoticeChallengePropertyUtil(_awemenotice_apimodule);
    }

    public static NoticeChallengePropertyUtil proxyProvideNoticeChallengePropertyUtil(_Awemenotice_apiModule _awemenotice_apimodule) {
        return (NoticeChallengePropertyUtil) C52869f.m112471a(_awemenotice_apimodule.provideNoticeChallengePropertyUtil(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
