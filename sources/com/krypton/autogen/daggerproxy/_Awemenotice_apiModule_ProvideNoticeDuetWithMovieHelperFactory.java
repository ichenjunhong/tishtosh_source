package com.krypton.autogen.daggerproxy;

import com.p683ss.android.ugc.aweme.notice.api.helper.NoticeDuetWithMovieHelper;
import dagger.p2651a.C52867d;
import dagger.p2651a.C52869f;

public final class _Awemenotice_apiModule_ProvideNoticeDuetWithMovieHelperFactory implements C52867d<NoticeDuetWithMovieHelper> {

    /* renamed from: a */
    private final _Awemenotice_apiModule f50179a;

    public final NoticeDuetWithMovieHelper get() {
        return provideInstance(this.f50179a);
    }

    public _Awemenotice_apiModule_ProvideNoticeDuetWithMovieHelperFactory(_Awemenotice_apiModule _awemenotice_apimodule) {
        this.f50179a = _awemenotice_apimodule;
    }

    public static _Awemenotice_apiModule_ProvideNoticeDuetWithMovieHelperFactory create(_Awemenotice_apiModule _awemenotice_apimodule) {
        return new _Awemenotice_apiModule_ProvideNoticeDuetWithMovieHelperFactory(_awemenotice_apimodule);
    }

    public static NoticeDuetWithMovieHelper provideInstance(_Awemenotice_apiModule _awemenotice_apimodule) {
        return proxyProvideNoticeDuetWithMovieHelper(_awemenotice_apimodule);
    }

    public static NoticeDuetWithMovieHelper proxyProvideNoticeDuetWithMovieHelper(_Awemenotice_apiModule _awemenotice_apimodule) {
        return (NoticeDuetWithMovieHelper) C52869f.m112471a(_awemenotice_apimodule.provideNoticeDuetWithMovieHelper(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
