package com.krypton.autogen.daggerproxy;

import com.p683ss.android.ugc.aweme.share.ShareService;
import dagger.p2651a.C52867d;
import dagger.p2651a.C52869f;

public final class _Share_apiModule_ProvideShareServiceFactory implements C52867d<ShareService> {

    /* renamed from: a */
    private final _Share_apiModule f50203a;

    public final ShareService get() {
        return provideInstance(this.f50203a);
    }

    public _Share_apiModule_ProvideShareServiceFactory(_Share_apiModule _share_apimodule) {
        this.f50203a = _share_apimodule;
    }

    public static _Share_apiModule_ProvideShareServiceFactory create(_Share_apiModule _share_apimodule) {
        return new _Share_apiModule_ProvideShareServiceFactory(_share_apimodule);
    }

    public static ShareService provideInstance(_Share_apiModule _share_apimodule) {
        return proxyProvideShareService(_share_apimodule);
    }

    public static ShareService proxyProvideShareService(_Share_apiModule _share_apimodule) {
        return (ShareService) C52869f.m112471a(_share_apimodule.provideShareService(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
