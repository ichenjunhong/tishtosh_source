package com.p683ss.android.ugc.aweme.base.p1420ui;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.util.AttributeSet;
import com.airbnb.lottie.LottieAnimationView;

/* renamed from: com.ss.android.ugc.aweme.base.ui.AnimationImageView */
public class AnimationImageView extends LottieAnimationView {
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo6661f();
    }

    /* renamed from: h */
    private void m57882h() {
        setImageFolder("images");
        mo6652a((AnimatorListener) new AnimatorListenerAdapter() {
            public final void onAnimationCancel(Animator animator) {
                super.onAnimationCancel(animator);
                AnimationImageView.this.setLayerType(0, null);
            }

            public final void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                AnimationImageView.this.setLayerType(0, null);
            }
        });
    }

    private void setImageFolder(String str) {
        setImageAssetsFolder(str);
    }

    public AnimationImageView(Context context) {
        super(context);
        m57882h();
    }

    public AnimationImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m57882h();
    }

    public AnimationImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m57882h();
    }
}
