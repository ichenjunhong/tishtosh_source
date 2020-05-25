package com.p683ss.android.ugc.aweme.commercialize.playfun;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.os.Build.VERSION;
import android.view.View;
import leakcanary.internal.LeakCanaryFileProvider;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.playfun.a */
public final class C26155a {

    /* renamed from: a */
    public static final C26155a f69072a = new C26155a();

    /* renamed from: com.ss.android.ugc.aweme.commercialize.playfun.a$a */
    static final class C26156a implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ PathMeasure f69073a;

        /* renamed from: b */
        final /* synthetic */ float[] f69074b;

        /* renamed from: c */
        final /* synthetic */ View f69075c;

        C26156a(PathMeasure pathMeasure, float[] fArr, View view) {
            this.f69073a = pathMeasure;
            this.f69074b = fArr;
            this.f69075c = view;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (valueAnimator != null) {
                this.f69073a.getPosTan(this.f69073a.getLength() * valueAnimator.getAnimatedFraction(), this.f69074b, null);
                this.f69075c.setTranslationX(this.f69074b[0]);
                this.f69075c.setTranslationY(this.f69074b[1]);
            }
        }
    }

    private C26155a() {
    }

    /* renamed from: a */
    public static Animator m63418a(View view, float f) {
        C52711k.m112240b(view, "target");
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationY", new float[]{view.getTranslationY(), f});
        C52711k.m112236a((Object) ofFloat, "transAnim");
        ofFloat.setDuration(300);
        return ofFloat;
    }

    /* renamed from: a */
    public static Animator m63419a(View view, Path path) {
        C52711k.m112240b(view, "target");
        C52711k.m112240b(path, LeakCanaryFileProvider.f132050j);
        if (VERSION.SDK_INT >= 21) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationX", "translationY", path);
            C52711k.m112236a((Object) ofFloat, "ObjectAnimator.ofFloat(t…N_X, TRANSLATION_Y, path)");
            return ofFloat;
        }
        AnimatorUpdateListener aVar = new C26156a(new PathMeasure(path, false), new float[2], view);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat2.addUpdateListener(aVar);
        C52711k.m112236a((Object) ofFloat2, "anim");
        return ofFloat2;
    }
}
