package com.krypton.autogen.daggerproxy;

import com.p683ss.android.ugc.aweme.notice.api.helper.WSHelper;
import dagger.p2651a.C52867d;
import dagger.p2651a.C52869f;

public final class _Awemenotice_apiModule_ProvideWSHelperFactory implements C52867d<WSHelper> {

    /* renamed from: a */
    private final _Awemenotice_apiModule f50187a;

    public final WSHelper get() {
        return provideInstance(this.f50187a);
    }

    public _Awemenotice_apiModule_ProvideWSHelperFactory(_Awemenotice_apiModule _awemenotice_apimodule) {
        this.f50187a = _awemenotice_apimodule;
    }

    public static _Awemenotice_apiModule_ProvideWSHelperFactory create(_Awemenotice_apiModule _awemenotice_apimodule) {
        return new _Awemenotice_apiModule_ProvideWSHelperFactory(_awemenotice_apimodule);
    }

    public static WSHelper provideInstance(_Awemenotice_apiModule _awemenotice_apimodule) {
        return proxyProvideWSHelper(_awemenotice_apimodule);
    }

    public static WSHelper proxyProvideWSHelper(_Awemenotice_apiModule _awemenotice_apimodule) {
        return (WSHelper) C52869f.m112471a(_awemenotice_apimodule.provideWSHelper(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
