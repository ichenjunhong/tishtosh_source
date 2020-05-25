package com.p683ss.android.ugc.aweme.shortvideo.duet;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import com.p683ss.android.ugc.aweme.p1484bx.C24454d;
import com.p683ss.android.ugc.aweme.p1484bx.C24456f;
import com.p683ss.android.ugc.aweme.p1484bx.C24458h;
import com.p683ss.android.ugc.aweme.p1484bx.C24458h.C24459a;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.c */
public final class C43238c implements C24454d, C24456f {

    /* renamed from: a */
    public C24458h f109343a = new C24459a();

    /* renamed from: b */
    public View f109344b;

    /* renamed from: b */
    public final void mo50221b() {
    }

    /* renamed from: c */
    public final void mo50224c() {
    }

    /* renamed from: d */
    public final void mo50225d() {
    }

    /* renamed from: a */
    public final void mo50217a() {
        this.f109344b.setVisibility(0);
    }

    /* renamed from: a */
    public final void mo50220a(C24458h hVar) {
        this.f109343a = hVar;
    }

    C43238c(View view) {
        this.f109344b = view;
    }

    /* renamed from: a */
    public final void mo50219a(final C24454d dVar) {
        this.f109344b.post(new Runnable() {
            public final void run() {
                C43238c.this.f109343a.mo50217a();
                C43238c.this.mo50217a();
                dVar.mo50217a();
                ValueAnimator duration = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}).setDuration(200);
                final int measuredHeight = C43238c.this.f109344b.getMeasuredHeight();
                duration.addUpdateListener(new AnimatorUpdateListener() {
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        C43238c.this.f109343a.mo50218a(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
                        C43238c.this.mo50218a(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
                        dVar.mo50218a(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
                    }
                });
                duration.addListener(new AnimatorListenerAdapter() {
                    public final void onAnimationEnd(Animator animator) {
                        super.onAnimationEnd(animator);
                        C43238c.this.f109343a.mo50221b();
                        C43238c.this.mo50221b();
                        dVar.mo50221b();
                    }
                });
                duration.start();
            }
        });
    }

    /* renamed from: b */
    public final void mo50223b(final C24454d dVar) {
        this.f109343a.mo50224c();
        mo50224c();
        dVar.mo50224c();
        ValueAnimator duration = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}).setDuration(200);
        final int measuredHeight = this.f109344b.getMeasuredHeight();
        duration.addUpdateListener(new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C43238c.this.f109343a.mo50222b(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
                C43238c.this.mo50222b(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
                dVar.mo50222b(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
            }
        });
        duration.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                C43238c.this.f109343a.mo50225d();
                C43238c.this.mo50225d();
                dVar.mo50225d();
            }
        });
        duration.start();
    }

    /* renamed from: a */
    public final void mo50218a(float f, int i, int i2) {
        this.f109344b.setTranslationY(((float) i2) + (((float) (i - i2)) * f));
    }

    /* renamed from: b */
    public final void mo50222b(float f, int i, int i2) {
        this.f109344b.setTranslationY(((float) (i2 - i)) * f);
    }
}
