package com.p683ss.android.ugc.aweme.comment.adapter;

import android.animation.ObjectAnimator;
import com.p683ss.android.ugc.aweme.comment.abtest.MTCommentUsernamePromptExperiment;
import com.p683ss.android.ugc.aweme.common.C26890h;

/* renamed from: com.ss.android.ugc.aweme.comment.adapter.p */
final /* synthetic */ class C25127p implements Runnable {

    /* renamed from: a */
    private final CommentViewHolder f66568a;

    C25127p(CommentViewHolder commentViewHolder) {
        this.f66568a = commentViewHolder;
    }

    public final void run() {
        CommentViewHolder commentViewHolder = this.f66568a;
        ObjectAnimator.ofFloat(commentViewHolder.mInvalidUsernamePrompt, "alpha", new float[]{0.0f, 1.0f}).start();
        commentViewHolder.mInvalidUsernamePrompt.setVisibility(0);
        MTCommentUsernamePromptExperiment.m60921b();
        commentViewHolder.f66445a.setNeedShowPrompt(false);
        C26890h.onEventV3("modify_username_comment_modify");
    }
}
