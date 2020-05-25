package com.krypton.autogen.daggerproxy;

import com.p683ss.android.ugc.aweme.friends.service.IFriendsService;
import dagger.p2651a.C52867d;
import dagger.p2651a.C52869f;

public final class _Friends_apiModule_ProvideIFriendsServiceFactory implements C52867d<IFriendsService> {

    /* renamed from: a */
    private final _Friends_apiModule f50195a;

    public final IFriendsService get() {
        return provideInstance(this.f50195a);
    }

    public _Friends_apiModule_ProvideIFriendsServiceFactory(_Friends_apiModule _friends_apimodule) {
        this.f50195a = _friends_apimodule;
    }

    public static _Friends_apiModule_ProvideIFriendsServiceFactory create(_Friends_apiModule _friends_apimodule) {
        return new _Friends_apiModule_ProvideIFriendsServiceFactory(_friends_apimodule);
    }

    public static IFriendsService provideInstance(_Friends_apiModule _friends_apimodule) {
        return proxyProvideIFriendsService(_friends_apimodule);
    }

    public static IFriendsService proxyProvideIFriendsService(_Friends_apiModule _friends_apimodule) {
        return (IFriendsService) C52869f.m112471a(_friends_apimodule.provideIFriendsService(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
