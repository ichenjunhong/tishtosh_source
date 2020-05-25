package com.krypton.autogen.daggerproxy;

import com.p683ss.android.ugc.aweme.notice.api.helper.I18nLogHelper;
import dagger.p2651a.C52867d;
import dagger.p2651a.C52869f;

public final class _Awemenotice_apiModule_ProvideI18nLogHelperFactory implements C52867d<I18nLogHelper> {

    /* renamed from: a */
    private final _Awemenotice_apiModule f50170a;

    public final I18nLogHelper get() {
        return provideInstance(this.f50170a);
    }

    public _Awemenotice_apiModule_ProvideI18nLogHelperFactory(_Awemenotice_apiModule _awemenotice_apimodule) {
        this.f50170a = _awemenotice_apimodule;
    }

    public static _Awemenotice_apiModule_ProvideI18nLogHelperFactory create(_Awemenotice_apiModule _awemenotice_apimodule) {
        return new _Awemenotice_apiModule_ProvideI18nLogHelperFactory(_awemenotice_apimodule);
    }

    public static I18nLogHelper provideInstance(_Awemenotice_apiModule _awemenotice_apimodule) {
        return proxyProvideI18nLogHelper(_awemenotice_apimodule);
    }

    public static I18nLogHelper proxyProvideI18nLogHelper(_Awemenotice_apiModule _awemenotice_apimodule) {
        return (I18nLogHelper) C52869f.m112471a(_awemenotice_apimodule.provideI18nLogHelper(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
