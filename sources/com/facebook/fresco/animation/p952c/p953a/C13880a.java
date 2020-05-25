package com.facebook.fresco.animation.p952c.p953a;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import com.facebook.fresco.animation.p952c.C13877a;

/* renamed from: com.facebook.fresco.animation.c.a.a */
public final class C13880a {
    /* renamed from: a */
    public static ValueAnimator m28276a(final C13877a aVar) {
        int i;
        if (aVar.f36201b) {
            i = aVar.f36200a;
        } else if (aVar.f36202d == null) {
            i = 0;
        } else {
            i = aVar.f36202d.mo26006e();
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(new int[]{0, (int) aVar.mo26026b()});
        valueAnimator.setDuration(aVar.mo26026b());
        if (i == 0) {
            i = -1;
        }
        valueAnimator.setRepeatCount(i);
        valueAnimator.setRepeatMode(1);
        valueAnimator.setInterpolator(null);
        valueAnimator.addUpdateListener(new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                aVar.setLevel(((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        });
        return valueAnimator;
    }
}
