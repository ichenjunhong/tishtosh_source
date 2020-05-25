package com.p683ss.android.ugc.aweme.shortvideo.widget;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.h */
final /* synthetic */ class C45608h implements AnimatorUpdateListener {

    /* renamed from: a */
    private final ProgressSegmentView f115354a;

    C45608h(ProgressSegmentView progressSegmentView) {
        this.f115354a = progressSegmentView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ProgressSegmentView progressSegmentView = this.f115354a;
        progressSegmentView.f115186b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        progressSegmentView.invalidate();
    }
}
