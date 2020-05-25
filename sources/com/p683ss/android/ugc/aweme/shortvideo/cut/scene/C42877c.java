package com.p683ss.android.ugc.aweme.shortvideo.cut.scene;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.bytedance.common.utility.C9432q;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.c */
public final class C42877c {

    /* renamed from: a */
    public static final C42877c f108356a = new C42877c();

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.c$a */
    public static final class C42878a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ View f108357a;

        /* renamed from: b */
        final /* synthetic */ C52671b f108358b;

        public final void onAnimationEnd(Animator animator) {
            C52711k.m112240b(animator, "animation");
            super.onAnimationEnd(animator);
            this.f108357a.setVisibility(8);
            this.f108358b.invoke(Boolean.valueOf(false));
        }

        C42878a(View view, C52671b bVar) {
            this.f108357a = view;
            this.f108358b = bVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.c$b */
    public static final class C42879b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C52671b f108359a;

        C42879b(C52671b bVar) {
            this.f108359a = bVar;
        }

        public final void onAnimationEnd(Animator animator) {
            C52711k.m112240b(animator, "animation");
            super.onAnimationEnd(animator);
            this.f108359a.invoke(Boolean.valueOf(true));
        }
    }

    private C42877c() {
    }

    /* renamed from: a */
    public static void m94095a(View view, boolean z, C52671b<? super Boolean, C52860x> bVar) {
        C52711k.m112240b(bVar, "animationFinish");
        if (view != null) {
            float b = C9432q.m18687b(view.getContext(), 16.0f);
            view.setVisibility(0);
            if (z) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", new float[]{0.0f, 1.0f});
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "translationY", new float[]{b, 0.0f});
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
                animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
                animatorSet.setDuration(200);
                animatorSet.addListener(new C42879b(bVar));
                animatorSet.start();
            }
        }
    }

    /* renamed from: b */
    public static void m94096b(View view, boolean z, C52671b<? super Boolean, C52860x> bVar) {
        C52711k.m112240b(bVar, "animationFinish");
        if (view != null) {
            float b = C9432q.m18687b(view.getContext(), 16.0f);
            if (z) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", new float[]{1.0f, 0.0f});
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "translationY", new float[]{0.0f, b});
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
                animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
                animatorSet.setDuration(200);
                animatorSet.addListener(new C42878a(view, bVar));
                animatorSet.start();
                return;
            }
            view.setVisibility(8);
        }
    }
}
