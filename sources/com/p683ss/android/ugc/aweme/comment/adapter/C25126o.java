package com.p683ss.android.ugc.aweme.comment.adapter;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.comment.adapter.o */
final /* synthetic */ class C25126o implements Runnable {

    /* renamed from: a */
    private final CommentViewHolder f66567a;

    C25126o(CommentViewHolder commentViewHolder) {
        this.f66567a = commentViewHolder;
    }

    public final void run() {
        CommentViewHolder commentViewHolder = this.f66567a;
        ObjectAnimator ofInt = ObjectAnimator.ofInt(commentViewHolder.mBgView, "backgroundColor", new int[]{commentViewHolder.mBgView.getResources().getColor(R.color.io), commentViewHolder.mBgView.getResources().getColor(R.color.a8w)});
        ofInt.setDuration(3000);
        ofInt.setEvaluator(new ArgbEvaluator());
        ofInt.start();
        commentViewHolder.f66445a.setNeedHint(false);
    }
}
