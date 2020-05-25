package com.p683ss.android.ugc.aweme.filter;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import android.widget.FrameLayout;
import com.p683ss.android.ugc.aweme.anim.C22679a;
import com.p683ss.android.ugc.aweme.p1484bx.C24454d;
import com.p683ss.android.ugc.aweme.p1484bx.C24456f;
import com.p683ss.android.ugc.aweme.p1484bx.C24458h;
import com.p683ss.android.ugc.aweme.p1484bx.C24458h.C24459a;
import com.p683ss.android.ugc.tools.view.p2510c.C50221d;

/* renamed from: com.ss.android.ugc.aweme.filter.a */
public final class C31384a implements C24454d, C24456f {

    /* renamed from: a */
    public C24458h f82213a = new C24459a();

    /* renamed from: b */
    public View f82214b;

    /* renamed from: c */
    private FrameLayout f82215c;

    /* renamed from: d */
    private View f82216d;

    /* renamed from: b */
    public final void mo50221b() {
    }

    /* renamed from: c */
    public final void mo50224c() {
    }

    /* renamed from: a */
    public final void mo50217a() {
        this.f82214b.setVisibility(0);
    }

    /* renamed from: d */
    public final void mo50225d() {
        this.f82215c.removeView(this.f82216d);
    }

    /* renamed from: a */
    public final void mo50220a(C24458h hVar) {
        this.f82213a = hVar;
    }

    /* renamed from: a */
    public final void mo50219a(final C24454d dVar) {
        this.f82215c.removeAllViews();
        this.f82215c.addView(this.f82216d);
        this.f82215c.post(new Runnable() {
            public final void run() {
                C31384a.this.f82213a.mo50217a();
                C31384a.this.mo50217a();
                dVar.mo50217a();
                ValueAnimator duration = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}).setDuration(490);
                duration.setInterpolator(new C22679a());
                final int measuredHeight = C31384a.this.f82214b.getMeasuredHeight();
                duration.addUpdateListener(new AnimatorUpdateListener() {
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        C31384a.this.f82213a.mo50218a(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
                        C31384a.this.mo50218a(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
                        dVar.mo50218a(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
                    }
                });
                duration.addListener(new AnimatorListenerAdapter() {
                    public final void onAnimationEnd(Animator animator) {
                        super.onAnimationEnd(animator);
                        C31384a.this.f82213a.mo50221b();
                        C31384a.this.mo50221b();
                        dVar.mo50221b();
                    }
                });
                duration.start();
            }
        });
    }

    /* renamed from: b */
    public final void mo50223b(final C24454d dVar) {
        this.f82213a.mo50224c();
        mo50224c();
        dVar.mo50224c();
        ValueAnimator duration = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}).setDuration(250);
        duration.setInterpolator(new C50221d());
        final int measuredHeight = this.f82214b.getMeasuredHeight();
        duration.addUpdateListener(new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C31384a.this.f82213a.mo50222b(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
                C31384a.this.mo50222b(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
                dVar.mo50222b(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
            }
        });
        duration.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                C31384a.this.f82213a.mo50225d();
                C31384a.this.mo50225d();
                dVar.mo50225d();
            }
        });
        duration.start();
    }

    public C31384a(FrameLayout frameLayout, View view, View view2) {
        this.f82215c = frameLayout;
        this.f82216d = view;
        this.f82214b = view2;
    }

    /* renamed from: a */
    public final void mo50218a(float f, int i, int i2) {
        this.f82214b.setTranslationY(((float) i2) + (((float) (i - i2)) * f));
        this.f82214b.setAlpha(f);
    }

    /* renamed from: b */
    public final void mo50222b(float f, int i, int i2) {
        this.f82214b.setTranslationY(((float) (i2 - i)) * f);
        this.f82214b.setAlpha(1.0f - f);
    }
}
