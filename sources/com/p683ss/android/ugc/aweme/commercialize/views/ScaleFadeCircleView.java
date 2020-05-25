package com.p683ss.android.ugc.aweme.commercialize.views;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.support.p030v4.content.C0726c;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.ScaleFadeCircleView */
public class ScaleFadeCircleView extends View {
    /* renamed from: a */
    public final void mo54455a() {
        m64456a(this, 0.7f, 0.0f, 1500);
        m64455a(this, 1.0f, 1.0f, 1.5f, 1.5f, 1500);
    }

    public ScaleFadeCircleView(Context context) {
        this(context, null);
    }

    public ScaleFadeCircleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ScaleFadeCircleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setBackground(C0726c.m2091a(context, (int) R.drawable.cvf));
    }

    /* renamed from: a */
    private static void m64456a(View view, float f, float f2, long j) {
        view.setAlpha(0.7f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", new float[]{0.7f, 0.0f});
        ofFloat.setDuration(1500);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setRepeatCount(-1);
        ofFloat.start();
    }

    /* renamed from: a */
    private static void m64455a(View view, float f, float f2, float f3, float f4, long j) {
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", new float[]{1.0f, 1.5f});
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "scaleY", new float[]{1.0f, 1.5f});
        ofFloat.setRepeatCount(-1);
        ofFloat2.setRepeatCount(-1);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat).with(ofFloat2);
        animatorSet.setDuration(1500);
        animatorSet.start();
    }
}
