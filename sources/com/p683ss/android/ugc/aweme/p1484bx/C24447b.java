package com.p683ss.android.ugc.aweme.p1484bx;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.p1484bx.C24458h.C24459a;

/* renamed from: com.ss.android.ugc.aweme.bx.b */
public final class C24447b implements C24454d, C24456f {

    /* renamed from: a */
    public C24458h f64824a = new C24459a();

    /* renamed from: b */
    public View f64825b;

    /* renamed from: c */
    public int f64826c;

    /* renamed from: d */
    private FrameLayout f64827d;

    /* renamed from: b */
    public final void mo50221b() {
    }

    /* renamed from: c */
    public final void mo50224c() {
    }

    /* renamed from: a */
    public final void mo50217a() {
        this.f64825b.setVisibility(0);
    }

    /* renamed from: d */
    public final void mo50225d() {
        this.f64827d.removeView(this.f64825b);
    }

    /* renamed from: a */
    public final void mo50220a(C24458h hVar) {
        this.f64824a = hVar;
    }

    /* renamed from: a */
    public final void mo50219a(final C24454d dVar) {
        this.f64827d.removeAllViews();
        this.f64827d.addView(this.f64825b);
        this.f64827d.post(new Runnable() {
            public final void run() {
                C24447b.this.f64824a.mo50217a();
                C24447b.this.mo50217a();
                dVar.mo50217a();
                ValueAnimator duration = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}).setDuration(400);
                final int measuredHeight = C24447b.this.f64825b.getMeasuredHeight() + C24447b.this.f64826c;
                duration.addUpdateListener(new AnimatorUpdateListener() {
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        C24447b.this.f64824a.mo50218a(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
                        C24447b.this.mo50218a(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
                        dVar.mo50218a(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
                    }
                });
                duration.addListener(new AnimatorListenerAdapter() {
                    public final void onAnimationEnd(Animator animator) {
                        super.onAnimationEnd(animator);
                        C24447b.this.f64824a.mo50221b();
                        C24447b.this.mo50221b();
                        dVar.mo50221b();
                    }
                });
                duration.start();
            }
        });
    }

    /* renamed from: b */
    public final void mo50223b(final C24454d dVar) {
        mo50224c();
        dVar.mo50224c();
        ValueAnimator duration = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}).setDuration(400);
        final int measuredHeight = this.f64825b.getMeasuredHeight() + this.f64826c;
        duration.addUpdateListener(new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C24447b.this.f64824a.mo50222b(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
                C24447b.this.mo50222b(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
                dVar.mo50222b(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
            }
        });
        duration.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                C24447b.this.f64824a.mo50225d();
                C24447b.this.mo50225d();
                dVar.mo50225d();
            }
        });
        duration.start();
    }

    public C24447b(FrameLayout frameLayout, View view) {
        this.f64827d = frameLayout;
        this.f64825b = view;
        this.f64826c = (int) C9432q.m18687b(frameLayout.getContext(), 0.0f);
    }

    /* renamed from: a */
    public final void mo50218a(float f, int i, int i2) {
        this.f64825b.setTranslationY(((float) i2) + (((float) (i - i2)) * f));
    }

    /* renamed from: b */
    public final void mo50222b(float f, int i, int i2) {
        this.f64825b.setTranslationY(((float) (i2 - i)) * f);
    }
}
