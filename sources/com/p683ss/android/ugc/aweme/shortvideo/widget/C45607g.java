package com.p683ss.android.ugc.aweme.shortvideo.widget;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.g */
final /* synthetic */ class C45607g implements AnimatorUpdateListener {

    /* renamed from: a */
    private final ProgressSegmentView f115353a;

    C45607g(ProgressSegmentView progressSegmentView) {
        this.f115353a = progressSegmentView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ProgressSegmentView progressSegmentView = this.f115353a;
        progressSegmentView.f115185a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        progressSegmentView.invalidate();
    }
}
