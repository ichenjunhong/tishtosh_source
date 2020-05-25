package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.common.utility.C9432q;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.fd */
final /* synthetic */ class C6582fd implements AnimatorUpdateListener {

    /* renamed from: a */
    private final VoteWidget f17920a;

    /* renamed from: b */
    private final HSImageView f17921b;

    C6582fd(VoteWidget voteWidget, HSImageView hSImageView) {
        this.f17920a = voteWidget;
        this.f17921b = hSImageView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        VoteWidget voteWidget = this.f17920a;
        C9432q.m18680a((View) this.f17921b, -3, -3, -3, (int) C9432q.m18687b(voteWidget.getContext(), (float) ((Integer) valueAnimator.getAnimatedValue()).intValue()));
    }
}
