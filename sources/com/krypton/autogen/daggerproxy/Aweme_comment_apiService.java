package com.krypton.autogen.daggerproxy;

import com.p683ss.android.ugc.aweme.comment.list.C25260i;
import com.p683ss.android.ugc.aweme.comment.services.C25281a;
import com.p683ss.android.ugc.aweme.comment.services.CommentService;

public interface Aweme_comment_apiService {
    C25281a provideCommentDependService();

    CommentService provideCommentService();

    C25260i provideICommentPostingManager();
}
