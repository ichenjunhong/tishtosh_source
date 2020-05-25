package com.krypton.autogen.daggerproxy;

import com.p683ss.android.ugc.aweme.notice.api.helper.FollowFeedLogHelper;
import dagger.p2651a.C52867d;
import dagger.p2651a.C52869f;

public final class _Awemenotice_apiModule_ProvideFollowFeedLogHelperFactory implements C52867d<FollowFeedLogHelper> {

    /* renamed from: a */
    private final _Awemenotice_apiModule f50169a;

    public final FollowFeedLogHelper get() {
        return provideInstance(this.f50169a);
    }

    public _Awemenotice_apiModule_ProvideFollowFeedLogHelperFactory(_Awemenotice_apiModule _awemenotice_apimodule) {
        this.f50169a = _awemenotice_apimodule;
    }

    public static _Awemenotice_apiModule_ProvideFollowFeedLogHelperFactory create(_Awemenotice_apiModule _awemenotice_apimodule) {
        return new _Awemenotice_apiModule_ProvideFollowFeedLogHelperFactory(_awemenotice_apimodule);
    }

    public static FollowFeedLogHelper provideInstance(_Awemenotice_apiModule _awemenotice_apimodule) {
        return proxyProvideFollowFeedLogHelper(_awemenotice_apimodule);
    }

    public static FollowFeedLogHelper proxyProvideFollowFeedLogHelper(_Awemenotice_apiModule _awemenotice_apimodule) {
        return (FollowFeedLogHelper) C52869f.m112471a(_awemenotice_apimodule.provideFollowFeedLogHelper(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
