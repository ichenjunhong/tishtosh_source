package com.krypton.autogen.daggerproxy;

import com.bytedance.debugbox.base.IDebugBoxService;
import dagger.p2651a.C52867d;
import dagger.p2651a.C52869f;

public final class _Debugbox_baseModule_ProvideIDebugBoxServiceFactory implements C52867d<IDebugBoxService> {

    /* renamed from: a */
    private final _Debugbox_baseModule f50190a;

    public final IDebugBoxService get() {
        return provideInstance(this.f50190a);
    }

    public _Debugbox_baseModule_ProvideIDebugBoxServiceFactory(_Debugbox_baseModule _debugbox_basemodule) {
        this.f50190a = _debugbox_basemodule;
    }

    public static _Debugbox_baseModule_ProvideIDebugBoxServiceFactory create(_Debugbox_baseModule _debugbox_basemodule) {
        return new _Debugbox_baseModule_ProvideIDebugBoxServiceFactory(_debugbox_basemodule);
    }

    public static IDebugBoxService provideInstance(_Debugbox_baseModule _debugbox_basemodule) {
        return proxyProvideIDebugBoxService(_debugbox_basemodule);
    }

    public static IDebugBoxService proxyProvideIDebugBoxService(_Debugbox_baseModule _debugbox_basemodule) {
        return (IDebugBoxService) C52869f.m112471a(_debugbox_basemodule.provideIDebugBoxService(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
