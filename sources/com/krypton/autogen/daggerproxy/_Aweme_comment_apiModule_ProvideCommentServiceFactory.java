package com.krypton.autogen.daggerproxy;

import com.p683ss.android.ugc.aweme.comment.services.CommentService;
import dagger.p2651a.C52867d;
import dagger.p2651a.C52869f;

public final class _Aweme_comment_apiModule_ProvideCommentServiceFactory implements C52867d<CommentService> {

    /* renamed from: a */
    private final _Aweme_comment_apiModule f50163a;

    public final CommentService get() {
        return provideInstance(this.f50163a);
    }

    public _Aweme_comment_apiModule_ProvideCommentServiceFactory(_Aweme_comment_apiModule _aweme_comment_apimodule) {
        this.f50163a = _aweme_comment_apimodule;
    }

    public static _Aweme_comment_apiModule_ProvideCommentServiceFactory create(_Aweme_comment_apiModule _aweme_comment_apimodule) {
        return new _Aweme_comment_apiModule_ProvideCommentServiceFactory(_aweme_comment_apimodule);
    }

    public static CommentService provideInstance(_Aweme_comment_apiModule _aweme_comment_apimodule) {
        return proxyProvideCommentService(_aweme_comment_apimodule);
    }

    public static CommentService proxyProvideCommentService(_Aweme_comment_apiModule _aweme_comment_apimodule) {
        return (CommentService) C52869f.m112471a(_aweme_comment_apimodule.provideCommentService(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
