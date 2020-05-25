package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.support.p030v4.view.p042b.C1027f;
import android.view.View;
import android.view.animation.Interpolator;
import com.bytedance.android.livesdk.p279af.C4577ap;
import com.ss.android.ugc.trill.R;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.eh */
public final class C6555eh {

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.eh$a */
    static final class C6556a implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ View f17887a;

        C6556a(View view) {
            this.f17887a = view;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            View view = this.f17887a;
            C52711k.m112236a((Object) valueAnimator, "it");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                view.setScaleX(((Float) animatedValue).floatValue());
                View view2 = this.f17887a;
                Object animatedValue2 = valueAnimator.getAnimatedValue();
                if (animatedValue2 != null) {
                    view2.setScaleY(((Float) animatedValue2).floatValue());
                    return;
                }
                throw new C52857u("null cannot be cast to non-null type kotlin.Float");
            }
            throw new C52857u("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.eh$b */
    static final class C6557b implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ View f17888a;

        C6557b(View view) {
            this.f17888a = view;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            View view = this.f17888a;
            C52711k.m112236a((Object) valueAnimator, "it");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                view.setScaleX(((Float) animatedValue).floatValue());
                View view2 = this.f17888a;
                Object animatedValue2 = valueAnimator.getAnimatedValue();
                if (animatedValue2 != null) {
                    view2.setScaleY(((Float) animatedValue2).floatValue());
                    return;
                }
                throw new C52857u("null cannot be cast to non-null type kotlin.Float");
            }
            throw new C52857u("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* renamed from: a */
    public static final AnimatorSet m13938a(View view, boolean z, long j) {
        view.setTranslationX(-C4577ap.m10990a(view.getContext(), 137.0f));
        view.setTranslationY(C4577ap.m10990a(view.getContext(), 104.0f));
        view.setScaleX(2.5f);
        view.setScaleY(2.5f);
        ObjectAnimator duration = ObjectAnimator.ofFloat(view, "translationX", new float[]{C4577ap.m10990a(view.getContext(), 20.0f)}).setDuration(333);
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(view, "translationX", new float[]{0.0f}).setDuration(333);
        ObjectAnimator duration3 = ObjectAnimator.ofFloat(view, "translationY", new float[]{0.0f}).setDuration(333);
        C52711k.m112236a((Object) duration, "translation1");
        duration.setInterpolator(C1027f.m2954a(0.03f, 0.0f, 0.07f, 1.0f));
        Interpolator a = C1027f.m2954a(0.17f, 0.0f, 0.39f, 1.0f);
        C52711k.m112236a((Object) duration2, "translation2X");
        TimeInterpolator timeInterpolator = a;
        duration2.setInterpolator(timeInterpolator);
        C52711k.m112236a((Object) duration3, "translation2Y");
        duration3.setInterpolator(timeInterpolator);
        ValueAnimator duration4 = ValueAnimator.ofFloat(new float[]{view.getScaleX(), 1.0f}).setDuration(333);
        C52711k.m112236a((Object) duration4, "scale");
        duration4.setInterpolator(C1027f.m2954a(0.22f, 0.0f, 0.49f, 1.0f));
        duration4.addUpdateListener(new C6556a(view));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setStartDelay(j);
        animatorSet.play(duration2).with(duration3);
        animatorSet.play(duration4);
        if (z) {
            View findViewById = view.findViewById(R.id.ezn);
            C52711k.m112236a((Object) findViewById, "view.findViewById(R.id.text_container)");
            findViewById.setVisibility(0);
            ObjectAnimator duration5 = ObjectAnimator.ofFloat(findViewById, "alpha", new float[]{1.0f, 0.0f}).setDuration(167);
            View findViewById2 = view.findViewById(R.id.a14);
            C52711k.m112236a((Object) findViewById2, "view.findViewById(R.id.count_down_background)");
            findViewById2.setScaleX(0.0f);
            findViewById2.setScaleY(0.0f);
            ValueAnimator duration6 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}).setDuration(333);
            duration6.addUpdateListener(new C6557b(findViewById2));
            C52711k.m112236a((Object) duration6, "countDownBgScale");
            duration6.setInterpolator(C1027f.m2954a(0.33f, 0.0f, 0.67f, 1.0f));
            View findViewById3 = view.findViewById(R.id.a13);
            C52711k.m112236a((Object) findViewById3, "view.findViewById(R.id.count_down)");
            findViewById3.setAlpha(0.0f);
            ObjectAnimator duration7 = ObjectAnimator.ofFloat(findViewById3, "alpha", new float[]{0.0f, 1.0f}).setDuration(167);
            animatorSet.play(duration5);
            animatorSet.play(duration7).before(duration6);
        } else {
            View findViewById4 = view.findViewById(R.id.zn);
            C52711k.m112236a((Object) findViewById4, "view.findViewById(R.id.content_container)");
            animatorSet.play(ObjectAnimator.ofFloat(findViewById4, "alpha", new float[]{1.0f, 0.0f}).setDuration(167));
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.play(animatorSet).after(duration);
        return animatorSet2;
    }
}
