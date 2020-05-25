package com.krypton.autogen.daggerproxy;

import com.p683ss.android.ugc.aweme.notice.api.helper.LogHelper;
import dagger.p2651a.C52867d;
import dagger.p2651a.C52869f;

public final class _Awemenotice_apiModule_ProvideLogHelperFactory implements C52867d<LogHelper> {

    /* renamed from: a */
    private final _Awemenotice_apiModule f50173a;

    public final LogHelper get() {
        return provideInstance(this.f50173a);
    }

    public _Awemenotice_apiModule_ProvideLogHelperFactory(_Awemenotice_apiModule _awemenotice_apimodule) {
        this.f50173a = _awemenotice_apimodule;
    }

    public static _Awemenotice_apiModule_ProvideLogHelperFactory create(_Awemenotice_apiModule _awemenotice_apimodule) {
        return new _Awemenotice_apiModule_ProvideLogHelperFactory(_awemenotice_apimodule);
    }

    public static LogHelper provideInstance(_Awemenotice_apiModule _awemenotice_apimodule) {
        return proxyProvideLogHelper(_awemenotice_apimodule);
    }

    public static LogHelper proxyProvideLogHelper(_Awemenotice_apiModule _awemenotice_apimodule) {
        return (LogHelper) C52869f.m112471a(_awemenotice_apimodule.provideLogHelper(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
