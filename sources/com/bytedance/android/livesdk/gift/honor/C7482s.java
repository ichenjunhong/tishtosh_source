package com.bytedance.android.livesdk.gift.honor;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.ViewGroup.LayoutParams;
import com.bytedance.common.utility.C9432q;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.gift.honor.s */
final /* synthetic */ class C7482s implements C1710e {

    /* renamed from: a */
    private final C74601 f20497a;

    C7482s(C74601 r1) {
        this.f20497a = r1;
    }

    public final void accept(Object obj) {
        Integer num = (Integer) obj;
        LiveGiftHonorLevelWidget liveGiftHonorLevelWidget = LiveGiftHonorLevelWidget.this;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        liveGiftHonorLevelWidget.f20444h = ofFloat;
        ofFloat.addUpdateListener(new C7469f(liveGiftHonorLevelWidget, ((float) liveGiftHonorLevelWidget.f20438b.getWidth()) + liveGiftHonorLevelWidget.f20438b.getX(), (float) liveGiftHonorLevelWidget.f20440d.getWidth()));
        ofFloat.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                LiveGiftHonorLevelWidget liveGiftHonorLevelWidget = LiveGiftHonorLevelWidget.this;
                LayoutParams layoutParams = liveGiftHonorLevelWidget.f20440d.getLayoutParams();
                layoutParams.width = 0;
                layoutParams.height = (int) C9432q.m18687b(liveGiftHonorLevelWidget.context, 14.0f);
                liveGiftHonorLevelWidget.f20440d.setLayoutParams(layoutParams);
                liveGiftHonorLevelWidget.f20439c.setAlpha(1.0f);
                liveGiftHonorLevelWidget.mo13871a(liveGiftHonorLevelWidget.f20437a, false);
                if (liveGiftHonorLevelWidget.f20437a != null) {
                    liveGiftHonorLevelWidget.mo13873a(liveGiftHonorLevelWidget.f20437a.mo8162q());
                }
            }
        });
        ofFloat.setDuration(200).start();
    }
}
