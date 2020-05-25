package com.krypton.autogen.daggerproxy;

import com.p683ss.android.ugc.aweme.share.ShareExtService;
import dagger.p2651a.C52867d;
import dagger.p2651a.C52869f;

public final class _Share_apiModule_ProvideShareExtServiceFactory implements C52867d<ShareExtService> {

    /* renamed from: a */
    private final _Share_apiModule f50202a;

    public final ShareExtService get() {
        return provideInstance(this.f50202a);
    }

    public _Share_apiModule_ProvideShareExtServiceFactory(_Share_apiModule _share_apimodule) {
        this.f50202a = _share_apimodule;
    }

    public static _Share_apiModule_ProvideShareExtServiceFactory create(_Share_apiModule _share_apimodule) {
        return new _Share_apiModule_ProvideShareExtServiceFactory(_share_apimodule);
    }

    public static ShareExtService provideInstance(_Share_apiModule _share_apimodule) {
        return proxyProvideShareExtService(_share_apimodule);
    }

    public static ShareExtService proxyProvideShareExtService(_Share_apiModule _share_apimodule) {
        return (ShareExtService) C52869f.m112471a(_share_apimodule.provideShareExtService(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
