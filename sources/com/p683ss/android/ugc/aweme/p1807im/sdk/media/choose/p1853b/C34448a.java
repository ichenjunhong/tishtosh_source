package com.p683ss.android.ugc.aweme.p1807im.sdk.media.choose.p1853b;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.utils.C47764ch;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.b.a */
public final class C34448a {

    /* renamed from: a */
    public static final C34448a f88859a = new C34448a();

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.b.a$a */
    public static final class C34449a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ View f88860a;

        /* renamed from: b */
        final /* synthetic */ ImageView f88861b;

        /* renamed from: c */
        final /* synthetic */ DmtTextView f88862c;

        /* renamed from: d */
        final /* synthetic */ int f88863d;

        /* renamed from: e */
        final /* synthetic */ View f88864e;

        /* renamed from: f */
        final /* synthetic */ View f88865f;

        public final void onAnimationCancel(Animator animator) {
            C34448a.m78386a(this.f88864e, this.f88860a, this.f88861b, this.f88862c, this.f88863d);
        }

        public final void onAnimationEnd(Animator animator) {
            boolean z;
            Animator animator2;
            Animator animator3;
            ObjectAnimator objectAnimator = null;
            C34448a.m78386a(null, this.f88860a, this.f88861b, this.f88862c, this.f88863d);
            View view = this.f88864e;
            View view2 = this.f88860a;
            View view3 = this.f88865f;
            if (this.f88863d > 0) {
                z = true;
            } else {
                z = false;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view3, "alpha", new float[]{0.0f, 1.0f});
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view3, "scaleX", new float[]{0.3f, 1.0f});
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view3, "scaleY", new float[]{0.3f, 1.0f});
            if (view == null || view2 == null) {
                animator2 = null;
                animator3 = null;
            } else {
                view.clearAnimation();
                view2.clearAnimation();
                if (z) {
                    objectAnimator = ObjectAnimator.ofFloat(view, "scaleX", new float[]{1.0f, 1.1f});
                    animator2 = ObjectAnimator.ofFloat(view, "scaleY", new float[]{1.0f, 1.1f});
                    animator3 = ObjectAnimator.ofFloat(view2, "alpha", new float[]{0.0f, 1.0f});
                } else {
                    objectAnimator = ObjectAnimator.ofFloat(view, "scaleX", new float[]{1.1f, 1.0f});
                    animator2 = ObjectAnimator.ofFloat(view, "scaleY", new float[]{1.1f, 1.0f});
                    animator3 = ObjectAnimator.ofFloat(view2, "alpha", new float[]{1.0f, 0.0f});
                }
            }
            AnimatorSet animatorSet = new AnimatorSet();
            if (objectAnimator == null || animator2 == null || animator3 == null) {
                animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2, ofFloat3});
            } else {
                animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2, ofFloat3, objectAnimator, animator2, animator3});
            }
            animatorSet.setInterpolator(C47764ch.m103394a(2, 0.32f, 0.94f, 0.6f, 1.0f));
            animatorSet.setDuration(300);
            animatorSet.start();
        }

        C34449a(View view, ImageView imageView, DmtTextView dmtTextView, int i, View view2, View view3) {
            this.f88860a = view;
            this.f88861b = imageView;
            this.f88862c = dmtTextView;
            this.f88863d = i;
            this.f88864e = view2;
            this.f88865f = view3;
        }
    }

    private C34448a() {
    }

    /* renamed from: a */
    public static void m78386a(View view, View view2, ImageView imageView, DmtTextView dmtTextView, int i) {
        C52711k.m112240b(imageView, "ivSelect");
        C52711k.m112240b(dmtTextView, "tvSelect");
        if (i > 0) {
            dmtTextView.setText(String.valueOf(i));
            imageView.setSelected(true);
            imageView.setImageResource(R.drawable.da6);
            if (view2 != null) {
                view2.setBackgroundResource(R.color.rr);
            }
            if (view2 != null) {
                view2.setVisibility(0);
            }
            if (view2 != null) {
                view2.setAlpha(1.0f);
            }
            if (view != null) {
                view.setScaleX(1.1f);
                view.setScaleY(1.1f);
            }
        } else {
            dmtTextView.setText("");
            imageView.setSelected(false);
            imageView.setImageResource(R.drawable.az9);
            if (view2 != null) {
                view2.setVisibility(8);
            }
            if (view != null) {
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
            }
        }
    }

    /* renamed from: a */
    public static void m78385a(View view, View view2, View view3, ImageView imageView, DmtTextView dmtTextView, int i) {
        C52711k.m112240b(view3, "layoutSelect");
        C52711k.m112240b(imageView, "ivSelect");
        C52711k.m112240b(dmtTextView, "tvSelect");
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view3, "alpha", new float[]{1.0f, 0.0f});
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view3, "scaleX", new float[]{1.0f, 0.3f});
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view3, "scaleY", new float[]{1.0f, 0.3f});
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2, ofFloat3});
        animatorSet.setDuration(50);
        C34449a aVar = new C34449a(view2, imageView, dmtTextView, i, view, view3);
        animatorSet.addListener(aVar);
        animatorSet.start();
    }
}
