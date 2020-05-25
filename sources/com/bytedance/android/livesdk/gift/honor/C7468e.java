package com.bytedance.android.livesdk.gift.honor;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.ViewGroup.LayoutParams;

/* renamed from: com.bytedance.android.livesdk.gift.honor.e */
final /* synthetic */ class C7468e implements AnimatorUpdateListener {

    /* renamed from: a */
    private final LiveGiftHonorLevelWidget f20475a;

    /* renamed from: b */
    private final float f20476b;

    C7468e(LiveGiftHonorLevelWidget liveGiftHonorLevelWidget, float f) {
        this.f20475a = liveGiftHonorLevelWidget;
        this.f20476b = f;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        LiveGiftHonorLevelWidget liveGiftHonorLevelWidget = this.f20475a;
        float f = this.f20476b;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        LayoutParams layoutParams = liveGiftHonorLevelWidget.f20440d.getLayoutParams();
        layoutParams.width = (int) (f * floatValue);
        liveGiftHonorLevelWidget.f20440d.setLayoutParams(layoutParams);
        liveGiftHonorLevelWidget.f20440d.setAlpha(floatValue);
    }
}
