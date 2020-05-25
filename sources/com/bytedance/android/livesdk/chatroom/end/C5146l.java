package com.bytedance.android.livesdk.chatroom.end;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import com.bytedance.common.utility.C9432q;

/* renamed from: com.bytedance.android.livesdk.chatroom.end.l */
final /* synthetic */ class C5146l implements AnimatorUpdateListener {

    /* renamed from: a */
    private final C5116a f13800a;

    C5146l(C5116a aVar) {
        this.f13800a = aVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C5116a aVar = this.f13800a;
        C9432q.m18679a((View) LiveRecommendBar.this, (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * ((float) LiveRecommendBar.this.f13665a)), -3);
    }
}
