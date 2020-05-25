package com.p683ss.android.ugc.aweme.tools.mvtemplate.view.circleanimate;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.graphics.drawable.GradientDrawable;
import android.widget.TextView;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.view.circleanimate.a */
public final class C47318a {

    /* renamed from: a */
    public C47321b f119442a;

    /* renamed from: b */
    public int f119443b;

    /* renamed from: c */
    public int f119444c;

    /* renamed from: d */
    public int f119445d;

    /* renamed from: e */
    public int f119446e;

    /* renamed from: f */
    public int f119447f;

    /* renamed from: g */
    public int f119448g;

    /* renamed from: h */
    public int f119449h;

    /* renamed from: i */
    public float f119450i;

    /* renamed from: j */
    public float f119451j;

    /* renamed from: k */
    public float f119452k;

    /* renamed from: l */
    public TextView f119453l;

    /* renamed from: m */
    private C47322c f119454m;

    /* renamed from: a */
    public final void mo94603a() {
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{this.f119444c, this.f119445d});
        final GradientDrawable gradientDrawable = this.f119454m.f119460c;
        ofInt.addUpdateListener(new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i;
                int i2;
                int i3;
                Integer num = (Integer) valueAnimator.getAnimatedValue();
                if (C47318a.this.f119444c > C47318a.this.f119445d) {
                    i2 = (C47318a.this.f119444c - num.intValue()) / 2;
                    i3 = C47318a.this.f119444c - i2;
                    i = (int) (C47318a.this.f119452k * valueAnimator.getAnimatedFraction());
                } else {
                    i2 = (C47318a.this.f119445d - num.intValue()) / 2;
                    i3 = C47318a.this.f119445d - i2;
                    i = (int) (C47318a.this.f119452k - (C47318a.this.f119452k * valueAnimator.getAnimatedFraction()));
                }
                gradientDrawable.setBounds(i2 + i, i, i3 - i, C47318a.this.f119453l.getHeight() - i);
            }
        });
        ObjectAnimator ofInt2 = ObjectAnimator.ofInt(gradientDrawable, "color", new int[]{this.f119446e, this.f119447f});
        ofInt2.setEvaluator(new ArgbEvaluator());
        ObjectAnimator ofInt3 = ObjectAnimator.ofInt(this.f119454m, "strokeColor", new int[]{this.f119448g, this.f119449h});
        ofInt3.setEvaluator(new ArgbEvaluator());
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(gradientDrawable, "cornerRadius", new float[]{this.f119450i, this.f119451j});
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration((long) this.f119443b);
        animatorSet.playTogether(new Animator[]{ofInt, ofInt2, ofInt3, ofFloat});
        animatorSet.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                if (C47318a.this.f119442a != null) {
                    C47318a.this.f119442a.mo94578a();
                }
            }
        });
        animatorSet.start();
    }

    C47318a(TextView textView, C47322c cVar) {
        this.f119453l = textView;
        this.f119454m = cVar;
    }
}
