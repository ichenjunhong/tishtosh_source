package com.bytedance.android.livesdk.gift.honor;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.ViewGroup.LayoutParams;
import com.bytedance.common.utility.C9432q;

/* renamed from: com.bytedance.android.livesdk.gift.honor.f */
final /* synthetic */ class C7469f implements AnimatorUpdateListener {

    /* renamed from: a */
    private final LiveGiftHonorLevelWidget f20477a;

    /* renamed from: b */
    private final float f20478b;

    /* renamed from: c */
    private final float f20479c;

    C7469f(LiveGiftHonorLevelWidget liveGiftHonorLevelWidget, float f, float f2) {
        this.f20477a = liveGiftHonorLevelWidget;
        this.f20478b = f;
        this.f20479c = f2;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        LiveGiftHonorLevelWidget liveGiftHonorLevelWidget = this.f20477a;
        float f = this.f20478b;
        float f2 = this.f20479c;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        LayoutParams layoutParams = liveGiftHonorLevelWidget.f20440d.getLayoutParams();
        layoutParams.height = (int) ((((float) ((int) C9432q.m18687b(liveGiftHonorLevelWidget.context, 10.0f))) * floatValue) + C9432q.m18687b(liveGiftHonorLevelWidget.context, 4.0f));
        float f3 = 1.0f - floatValue;
        layoutParams.width = (int) (((((float) ((int) (f - C9432q.m18687b(liveGiftHonorLevelWidget.context, 12.0f)))) - f2) * f3) + f2);
        liveGiftHonorLevelWidget.f20440d.setLayoutParams(layoutParams);
        liveGiftHonorLevelWidget.f20439c.setAlpha(floatValue);
        liveGiftHonorLevelWidget.f20440d.setAlpha(floatValue);
        liveGiftHonorLevelWidget.f20438b.setAlpha(f3);
    }
}
