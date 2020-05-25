package com.krypton.autogen.daggerproxy;

import com.p683ss.android.ugc.aweme.conan.IConanService;
import dagger.p2651a.C52867d;
import dagger.p2651a.C52869f;

public final class _Conan_baseModule_ProvideIConanServiceFactory implements C52867d<IConanService> {

    /* renamed from: a */
    private final _Conan_baseModule f50189a;

    public final IConanService get() {
        return provideInstance(this.f50189a);
    }

    public _Conan_baseModule_ProvideIConanServiceFactory(_Conan_baseModule _conan_basemodule) {
        this.f50189a = _conan_basemodule;
    }

    public static _Conan_baseModule_ProvideIConanServiceFactory create(_Conan_baseModule _conan_basemodule) {
        return new _Conan_baseModule_ProvideIConanServiceFactory(_conan_basemodule);
    }

    public static IConanService provideInstance(_Conan_baseModule _conan_basemodule) {
        return proxyProvideIConanService(_conan_basemodule);
    }

    public static IConanService proxyProvideIConanService(_Conan_baseModule _conan_basemodule) {
        return (IConanService) C52869f.m112471a(_conan_basemodule.provideIConanService(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
