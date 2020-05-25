package com.krypton.autogen.daggerproxy;

import com.p683ss.android.ugc.aweme.notice.api.helper.IMainServiceHelper;
import dagger.p2651a.C52867d;
import dagger.p2651a.C52869f;

public final class _Awemenotice_apiModule_ProvideIMainServiceHelperFactory implements C52867d<IMainServiceHelper> {

    /* renamed from: a */
    private final _Awemenotice_apiModule f50171a;

    public final IMainServiceHelper get() {
        return provideInstance(this.f50171a);
    }

    public _Awemenotice_apiModule_ProvideIMainServiceHelperFactory(_Awemenotice_apiModule _awemenotice_apimodule) {
        this.f50171a = _awemenotice_apimodule;
    }

    public static _Awemenotice_apiModule_ProvideIMainServiceHelperFactory create(_Awemenotice_apiModule _awemenotice_apimodule) {
        return new _Awemenotice_apiModule_ProvideIMainServiceHelperFactory(_awemenotice_apimodule);
    }

    public static IMainServiceHelper provideInstance(_Awemenotice_apiModule _awemenotice_apimodule) {
        return proxyProvideIMainServiceHelper(_awemenotice_apimodule);
    }

    public static IMainServiceHelper proxyProvideIMainServiceHelper(_Awemenotice_apiModule _awemenotice_apimodule) {
        return (IMainServiceHelper) C52869f.m112471a(_awemenotice_apimodule.provideIMainServiceHelper(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
