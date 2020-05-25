package com.p683ss.android.ugc.aweme.comment.adapter;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.comment.adapter.k */
final /* synthetic */ class C25120k implements Runnable {

    /* renamed from: a */
    private final CommentReplyViewHolder f66547a;

    C25120k(CommentReplyViewHolder commentReplyViewHolder) {
        this.f66547a = commentReplyViewHolder;
    }

    public final void run() {
        CommentReplyViewHolder commentReplyViewHolder = this.f66547a;
        ObjectAnimator ofInt = ObjectAnimator.ofInt(commentReplyViewHolder.mBgView, "backgroundColor", new int[]{commentReplyViewHolder.mBgView.getResources().getColor(R.color.io), commentReplyViewHolder.mBgView.getResources().getColor(R.color.a8w)});
        ofInt.setDuration(3000);
        ofInt.setEvaluator(new ArgbEvaluator());
        ofInt.start();
        commentReplyViewHolder.f66410b.setNeedHint(false);
    }
}
