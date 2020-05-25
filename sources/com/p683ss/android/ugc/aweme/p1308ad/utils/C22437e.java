package com.p683ss.android.ugc.aweme.p1308ad.utils;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;

/* renamed from: com.ss.android.ugc.aweme.ad.utils.e */
public final class C22437e {
    /* renamed from: a */
    public static void m55470a(View view) {
        if (view != null) {
            view.setOnTouchListener(new C22439f(view, 0.75f));
        }
    }

    /* renamed from: a */
    public static ValueAnimator m55469a(final View view, int i, int i2, int i3) {
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{i, i2});
        ofInt.addUpdateListener(new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
                marginLayoutParams.bottomMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                view.setLayoutParams(marginLayoutParams);
            }
        });
        ofInt.setDuration((long) i3);
        ofInt.setTarget(view);
        return ofInt;
    }
}
