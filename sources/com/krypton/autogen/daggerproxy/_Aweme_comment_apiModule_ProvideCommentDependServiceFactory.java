package com.krypton.autogen.daggerproxy;

import com.p683ss.android.ugc.aweme.comment.services.C25281a;
import dagger.p2651a.C52867d;
import dagger.p2651a.C52869f;

public final class _Aweme_comment_apiModule_ProvideCommentDependServiceFactory implements C52867d<C25281a> {

    /* renamed from: a */
    private final _Aweme_comment_apiModule f50162a;

    public final C25281a get() {
        return provideInstance(this.f50162a);
    }

    public _Aweme_comment_apiModule_ProvideCommentDependServiceFactory(_Aweme_comment_apiModule _aweme_comment_apimodule) {
        this.f50162a = _aweme_comment_apimodule;
    }

    public static _Aweme_comment_apiModule_ProvideCommentDependServiceFactory create(_Aweme_comment_apiModule _aweme_comment_apimodule) {
        return new _Aweme_comment_apiModule_ProvideCommentDependServiceFactory(_aweme_comment_apimodule);
    }

    public static C25281a provideInstance(_Aweme_comment_apiModule _aweme_comment_apimodule) {
        return proxyProvideCommentDependService(_aweme_comment_apimodule);
    }

    public static C25281a proxyProvideCommentDependService(_Aweme_comment_apiModule _aweme_comment_apimodule) {
        return (C25281a) C52869f.m112471a(_aweme_comment_apimodule.provideCommentDependService(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
