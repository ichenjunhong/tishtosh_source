package com.bytedance.android.livesdk.gift.honor;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: com.bytedance.android.livesdk.gift.honor.t */
final /* synthetic */ class C7483t implements AnimatorUpdateListener {

    /* renamed from: a */
    private final LiveGiftHonorProgressView f20498a;

    C7483t(LiveGiftHonorProgressView liveGiftHonorProgressView) {
        this.f20498a = liveGiftHonorProgressView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        LiveGiftHonorProgressView liveGiftHonorProgressView = this.f20498a;
        liveGiftHonorProgressView.f20463f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (liveGiftHonorProgressView.f20459b > 0.0f) {
            float f = 1.0f;
            if (liveGiftHonorProgressView.f20463f + liveGiftHonorProgressView.f20459b <= 1.0f) {
                f = liveGiftHonorProgressView.f20459b + liveGiftHonorProgressView.f20463f;
            }
            liveGiftHonorProgressView.f20460c = f;
        }
        liveGiftHonorProgressView.invalidate();
    }
}
