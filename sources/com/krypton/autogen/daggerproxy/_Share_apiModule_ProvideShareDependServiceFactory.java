package com.krypton.autogen.daggerproxy;

import com.p683ss.android.ugc.aweme.share.ShareDependService;
import dagger.p2651a.C52867d;
import dagger.p2651a.C52869f;

public final class _Share_apiModule_ProvideShareDependServiceFactory implements C52867d<ShareDependService> {

    /* renamed from: a */
    private final _Share_apiModule f50201a;

    public final ShareDependService get() {
        return provideInstance(this.f50201a);
    }

    public _Share_apiModule_ProvideShareDependServiceFactory(_Share_apiModule _share_apimodule) {
        this.f50201a = _share_apimodule;
    }

    public static _Share_apiModule_ProvideShareDependServiceFactory create(_Share_apiModule _share_apimodule) {
        return new _Share_apiModule_ProvideShareDependServiceFactory(_share_apimodule);
    }

    public static ShareDependService provideInstance(_Share_apiModule _share_apimodule) {
        return proxyProvideShareDependService(_share_apimodule);
    }

    public static ShareDependService proxyProvideShareDependService(_Share_apiModule _share_apimodule) {
        return (ShareDependService) C52869f.m112471a(_share_apimodule.provideShareDependService(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
