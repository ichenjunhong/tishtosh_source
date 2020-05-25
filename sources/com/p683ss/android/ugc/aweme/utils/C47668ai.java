package com.p683ss.android.ugc.aweme.utils;

import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.common.utility.C9432q;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.utils.ai */
public final class C47668ai {
    /* renamed from: a */
    public static void m103180a(ViewGroup viewGroup, ImageView imageView, TextView textView, int i, int i2, boolean z, boolean z2, AnimatorListenerAdapter animatorListenerAdapter) {
        int i3;
        int i4;
        int i5;
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        if (z2) {
            i3 = (int) C9432q.m18687b(imageView.getContext(), 20.0f);
        } else {
            i3 = (int) imageView.getResources().getDimension(R.dimen.hl);
        }
        if (z2) {
            i4 = (int) C9432q.m18687b(imageView.getContext(), 12.0f);
        } else {
            i4 = (int) C9432q.m18687b(imageView.getContext(), 0.0f);
        }
        int i6 = -180;
        if (z) {
            i5 = 0;
        } else {
            i5 = -180;
        }
        if (!z) {
            i6 = 0;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, "rotation", new float[]{(float) i5, (float) i6});
        if (z) {
            valueAnimator = ValueAnimator.ofInt(new int[]{i3, i4});
        } else {
            valueAnimator = ValueAnimator.ofInt(new int[]{i4, i3});
        }
        if (z) {
            valueAnimator2 = ValueAnimator.ofInt(new int[]{i2, i});
        } else {
            valueAnimator2 = ValueAnimator.ofInt(new int[]{i, i2});
        }
        valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimator.addUpdateListener(new C47669aj(viewGroup, z2));
        valueAnimator2.addUpdateListener(new C47670ak(textView));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat).with(valueAnimator).with(valueAnimator2);
        if (animatorListenerAdapter != null) {
            animatorSet.addListener(animatorListenerAdapter);
        }
        animatorSet.setDuration(400);
        animatorSet.start();
    }
}
