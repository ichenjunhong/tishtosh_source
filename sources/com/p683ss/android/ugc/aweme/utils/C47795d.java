package com.p683ss.android.ugc.aweme.utils;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.support.p030v4.graphics.drawable.C0809a;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;

/* renamed from: com.ss.android.ugc.aweme.utils.d */
public final class C47795d {
    /* renamed from: a */
    public static void m103429a(View view) {
        m103430a(view, 0.75f);
    }

    /* renamed from: a */
    public static Drawable m103428a(Drawable drawable, int i) {
        if (drawable instanceof GradientDrawable) {
            ((GradientDrawable) drawable).setColor(i);
        }
        C0809a.m2325a(drawable, i);
        return drawable;
    }

    /* renamed from: a */
    public static void m103430a(View view, float f) {
        if (view != null) {
            view.setOnTouchListener(new C47838e(view, 0.75f, view.getAlpha()));
        }
    }

    /* renamed from: a */
    public static ValueAnimator m103427a(final View view, int i, int i2, int i3) {
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

    /* renamed from: a */
    public static void m103431a(final View view, Drawable drawable, int i, int i2, long j) {
        if (i != i2) {
            ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), new Object[]{Integer.valueOf(i), Integer.valueOf(i2)});
            final Drawable mutate = C0809a.m2337f(drawable).mutate();
            if (mutate instanceof GradientDrawable) {
                ((GradientDrawable) mutate).setColor(i2);
            }
            ofObject.addUpdateListener(new AnimatorUpdateListener() {
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    if (view != null) {
                        view.setBackground(C47795d.m103428a(mutate, intValue));
                    }
                }
            });
            ofObject.setDuration(j);
            ofObject.start();
        }
    }
}
