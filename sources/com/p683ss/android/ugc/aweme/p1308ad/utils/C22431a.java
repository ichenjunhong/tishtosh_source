package com.p683ss.android.ugc.aweme.p1308ad.utils;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.support.p030v4.graphics.drawable.C0809a;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* renamed from: com.ss.android.ugc.aweme.ad.utils.a */
public final class C22431a {
    /* renamed from: a */
    public static void m55458a(final View view) {
        if (view != null) {
            view.setOnTouchListener(new OnTouchListener() {
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    int action = motionEvent.getAction();
                    if (action != 3) {
                        switch (action) {
                            case 0:
                                view.animate().alpha(0.75f).setDuration(150).start();
                                break;
                            case 1:
                                break;
                        }
                    }
                    view.animate().alpha(1.0f).setDuration(150).start();
                    return false;
                }
            });
        }
    }

    /* renamed from: a */
    public static Drawable m55457a(Drawable drawable, int i) {
        if (drawable instanceof GradientDrawable) {
            ((GradientDrawable) drawable).setColor(i);
        }
        C0809a.m2325a(drawable, i);
        return drawable;
    }

    /* renamed from: a */
    public static void m55459a(final View view, Drawable drawable, int i, int i2, long j) {
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
                        view.setBackground(C22431a.m55457a(mutate, intValue));
                    }
                }
            });
            ofObject.setDuration(j);
            ofObject.start();
        }
    }
}
