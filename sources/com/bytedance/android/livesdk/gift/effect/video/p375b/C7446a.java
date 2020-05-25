package com.bytedance.android.livesdk.gift.effect.video.p375b;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.support.p030v4.view.p042b.C1027f;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.bytedance.android.livesdk.p279af.C4577ap;

/* renamed from: com.bytedance.android.livesdk.gift.effect.video.b.a */
public final class C7446a {
    /* renamed from: a */
    public static AnimatorSet m15381a(View view) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(view, "alpha", new float[]{0.0f, 1.0f}).setDuration(160);
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(view, "translationY", new float[]{C4577ap.m10990a(view.getContext(), 45.0f), 0.0f}).setDuration(160);
        duration.setInterpolator(new LinearInterpolator());
        duration2.setInterpolator(C1027f.m2954a(0.33f, 0.0f, 0.2f, 1.0f));
        duration.addUpdateListener(new C7447b(view));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{duration, duration2});
        return animatorSet;
    }
}
