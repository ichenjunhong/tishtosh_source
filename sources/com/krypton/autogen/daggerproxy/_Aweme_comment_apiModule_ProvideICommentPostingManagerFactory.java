package com.krypton.autogen.daggerproxy;

import com.p683ss.android.ugc.aweme.comment.list.C25260i;
import dagger.p2651a.C52867d;
import dagger.p2651a.C52869f;

public final class _Aweme_comment_apiModule_ProvideICommentPostingManagerFactory implements C52867d<C25260i> {

    /* renamed from: a */
    private final _Aweme_comment_apiModule f50164a;

    public final C25260i get() {
        return provideInstance(this.f50164a);
    }

    public _Aweme_comment_apiModule_ProvideICommentPostingManagerFactory(_Aweme_comment_apiModule _aweme_comment_apimodule) {
        this.f50164a = _aweme_comment_apimodule;
    }

    public static _Aweme_comment_apiModule_ProvideICommentPostingManagerFactory create(_Aweme_comment_apiModule _aweme_comment_apimodule) {
        return new _Aweme_comment_apiModule_ProvideICommentPostingManagerFactory(_aweme_comment_apimodule);
    }

    public static C25260i provideInstance(_Aweme_comment_apiModule _aweme_comment_apimodule) {
        return proxyProvideICommentPostingManager(_aweme_comment_apimodule);
    }

    public static C25260i proxyProvideICommentPostingManager(_Aweme_comment_apiModule _aweme_comment_apimodule) {
        return (C25260i) C52869f.m112471a(_aweme_comment_apimodule.provideICommentPostingManager(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
