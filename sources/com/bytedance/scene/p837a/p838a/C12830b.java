package com.bytedance.scene.p837a.p838a;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.bytedance.scene.p837a.C12828a;
import com.bytedance.scene.p837a.C12847d;

/* renamed from: com.bytedance.scene.a.a.b */
public class C12830b extends C12847d {
    /* renamed from: a */
    public final boolean mo24300a() {
        return true;
    }

    /* renamed from: a */
    public final Animator mo24299a(C12828a aVar, C12828a aVar2) {
        final View view = aVar2.f33605b;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, view.getAlpha()});
        ofFloat.addUpdateListener(new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.setDuration(150);
        return ofFloat;
    }

    /* renamed from: b */
    public Animator mo24301b(final C12828a aVar, C12828a aVar2) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{aVar.f33605b.getAlpha(), 0.0f});
        ofFloat.addUpdateListener(new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                aVar.f33605b.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.setDuration(150);
        return ofFloat;
    }
}
