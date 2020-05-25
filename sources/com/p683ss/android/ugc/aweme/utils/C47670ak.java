package com.p683ss.android.ugc.aweme.utils;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;

/* renamed from: com.ss.android.ugc.aweme.utils.ak */
final /* synthetic */ class C47670ak implements AnimatorUpdateListener {

    /* renamed from: a */
    private final TextView f120148a;

    C47670ak(TextView textView) {
        this.f120148a = textView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        TextView textView = this.f120148a;
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        LayoutParams layoutParams = textView.getLayoutParams();
        layoutParams.height = intValue;
        textView.setLayoutParams(layoutParams);
    }
}
