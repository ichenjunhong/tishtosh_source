package com.p683ss.android.ugc.aweme.comment.adapter;

import android.animation.ObjectAnimator;
import com.p683ss.android.ugc.aweme.comment.abtest.MTCommentUsernamePromptExperiment;
import com.p683ss.android.ugc.aweme.common.C26890h;

/* renamed from: com.ss.android.ugc.aweme.comment.adapter.l */
final /* synthetic */ class C25121l implements Runnable {

    /* renamed from: a */
    private final CommentReplyViewHolder f66548a;

    C25121l(CommentReplyViewHolder commentReplyViewHolder) {
        this.f66548a = commentReplyViewHolder;
    }

    public final void run() {
        CommentReplyViewHolder commentReplyViewHolder = this.f66548a;
        ObjectAnimator.ofFloat(commentReplyViewHolder.mInvalidUsernamePrompt, "alpha", new float[]{0.0f, 1.0f}).start();
        commentReplyViewHolder.mInvalidUsernamePrompt.setVisibility(0);
        MTCommentUsernamePromptExperiment.m60921b();
        commentReplyViewHolder.f66410b.setNeedShowPrompt(false);
        C26890h.onEventV3("modify_username_comment_modify");
    }
}
