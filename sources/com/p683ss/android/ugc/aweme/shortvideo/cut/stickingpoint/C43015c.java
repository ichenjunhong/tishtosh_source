package com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c */
public final class C43015c {

    /* renamed from: a */
    public static final C43015c f108612a = new C43015c();

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c$a */
    public static final class C43016a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ View f108613a;

        /* renamed from: b */
        final /* synthetic */ boolean f108614b;

        public final void onAnimationEnd(Animator animator) {
            int i;
            C52711k.m112240b(animator, "animation");
            super.onAnimationEnd(animator);
            View view = this.f108613a;
            if (this.f108614b) {
                i = 8;
            } else {
                i = 0;
            }
            view.setVisibility(i);
        }

        C43016a(View view, boolean z) {
            this.f108613a = view;
            this.f108614b = z;
        }
    }

    private C43015c() {
    }

    /* renamed from: a */
    public static void m94256a(View view) {
        if (view != null) {
            view.setVisibility(0);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", new float[]{0.0f, 1.0f});
            ofFloat.setDuration(200);
            ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
            ofFloat.start();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static void m94257a(View view, boolean z) {
        if (view != null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", new float[]{1.0f, 0.0f});
            ofFloat.setDuration(200);
            ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
            ofFloat.addListener(new C43016a(view, z));
            ofFloat.start();
        }
    }
}
