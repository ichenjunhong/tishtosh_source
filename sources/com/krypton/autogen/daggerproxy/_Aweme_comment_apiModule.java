package com.krypton.autogen.daggerproxy;

import com.p683ss.android.ugc.aweme.comment.list.C25260i;
import com.p683ss.android.ugc.aweme.comment.services.C25281a;
import com.p683ss.android.ugc.aweme.comment.services.CommentService;
import com.p683ss.android.ugc.p2416c.C48514f;

public class _Aweme_comment_apiModule {
    public C25281a provideCommentDependService() {
        return ((Aweme_comment_apiService) C48514f.m104950a(Aweme_comment_apiService.class)).provideCommentDependService();
    }

    public CommentService provideCommentService() {
        return ((Aweme_comment_apiService) C48514f.m104950a(Aweme_comment_apiService.class)).provideCommentService();
    }

    public C25260i provideICommentPostingManager() {
        return ((Aweme_comment_apiService) C48514f.m104950a(Aweme_comment_apiService.class)).provideICommentPostingManager();
    }
}
