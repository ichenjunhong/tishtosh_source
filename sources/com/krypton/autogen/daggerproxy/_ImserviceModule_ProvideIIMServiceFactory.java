package com.krypton.autogen.daggerproxy;

import com.p683ss.android.ugc.aweme.p1807im.service.IIMService;
import dagger.p2651a.C52867d;
import dagger.p2651a.C52869f;

public final class _ImserviceModule_ProvideIIMServiceFactory implements C52867d<IIMService> {

    /* renamed from: a */
    private final _ImserviceModule f50197a;

    public final IIMService get() {
        return provideInstance(this.f50197a);
    }

    public _ImserviceModule_ProvideIIMServiceFactory(_ImserviceModule _imservicemodule) {
        this.f50197a = _imservicemodule;
    }

    public static _ImserviceModule_ProvideIIMServiceFactory create(_ImserviceModule _imservicemodule) {
        return new _ImserviceModule_ProvideIIMServiceFactory(_imservicemodule);
    }

    public static IIMService provideInstance(_ImserviceModule _imservicemodule) {
        return proxyProvideIIMService(_imservicemodule);
    }

    public static IIMService proxyProvideIIMService(_ImserviceModule _imservicemodule) {
        return (IIMService) C52869f.m112471a(_imservicemodule.provideIIMService(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
