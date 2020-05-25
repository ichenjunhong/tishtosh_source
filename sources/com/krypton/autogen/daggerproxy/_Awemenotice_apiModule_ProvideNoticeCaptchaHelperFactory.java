package com.krypton.autogen.daggerproxy;

import com.p683ss.android.ugc.aweme.notice.api.helper.NoticeCaptchaHelper;
import dagger.p2651a.C52867d;
import dagger.p2651a.C52869f;

public final class _Awemenotice_apiModule_ProvideNoticeCaptchaHelperFactory implements C52867d<NoticeCaptchaHelper> {

    /* renamed from: a */
    private final _Awemenotice_apiModule f50175a;

    public final NoticeCaptchaHelper get() {
        return provideInstance(this.f50175a);
    }

    public _Awemenotice_apiModule_ProvideNoticeCaptchaHelperFactory(_Awemenotice_apiModule _awemenotice_apimodule) {
        this.f50175a = _awemenotice_apimodule;
    }

    public static _Awemenotice_apiModule_ProvideNoticeCaptchaHelperFactory create(_Awemenotice_apiModule _awemenotice_apimodule) {
        return new _Awemenotice_apiModule_ProvideNoticeCaptchaHelperFactory(_awemenotice_apimodule);
    }

    public static NoticeCaptchaHelper provideInstance(_Awemenotice_apiModule _awemenotice_apimodule) {
        return proxyProvideNoticeCaptchaHelper(_awemenotice_apimodule);
    }

    public static NoticeCaptchaHelper proxyProvideNoticeCaptchaHelper(_Awemenotice_apiModule _awemenotice_apimodule) {
        return (NoticeCaptchaHelper) C52869f.m112471a(_awemenotice_apimodule.provideNoticeCaptchaHelper(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
