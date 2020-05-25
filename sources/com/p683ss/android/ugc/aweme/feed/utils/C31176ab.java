package com.p683ss.android.ugc.aweme.feed.utils;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import java.util.Collection;
import java.util.WeakHashMap;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.utils.ab */
public final class C31176ab {

    /* renamed from: a */
    private static final WeakHashMap<View, Animator> f81595a = new WeakHashMap<>();

    /* renamed from: com.ss.android.ugc.aweme.feed.utils.ab$a */
    public static final class C31177a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ AnimatorSet f81596a;

        C31177a(AnimatorSet animatorSet) {
            this.f81596a = animatorSet;
        }

        public final void onAnimationEnd(Animator animator) {
            this.f81596a.start();
        }
    }

    /* renamed from: a */
    public static final void m72805a() {
        Collection<Animator> values = f81595a.values();
        C52711k.m112236a((Object) values, "animatorMap.values");
        for (Animator animator : values) {
            animator.removeAllListeners();
            animator.end();
        }
        f81595a.clear();
    }

    /* renamed from: a */
    public static final void m72806a(View view) {
        if (view != null) {
            AnimatorSet animatorSet = new AnimatorSet();
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.ROTATION, new float[]{0.0f, 35.0f});
            ofFloat.setDuration(300);
            ofFloat.setInterpolator(new DecelerateInterpolator());
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, View.ROTATION, new float[]{35.0f, 0.0f});
            C52711k.m112236a((Object) ofFloat2, "it");
            ofFloat2.setDuration(1000);
            ofFloat2.setInterpolator(new C31179ad());
            animatorSet.playSequentially(new Animator[]{ofFloat, ofFloat2});
            animatorSet.start();
            animatorSet.addListener(new C31177a(animatorSet));
            f81595a.put(view, animatorSet);
        }
    }
}
