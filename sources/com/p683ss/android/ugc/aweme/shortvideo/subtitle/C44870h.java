package com.p683ss.android.ugc.aweme.shortvideo.subtitle;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.dmt.p664ui.p667c.C10673c;
import com.p683ss.android.ugc.aweme.p1484bx.C24454d;
import com.p683ss.android.ugc.aweme.p1484bx.C24456f;
import com.p683ss.android.ugc.aweme.p1484bx.C24458h;
import com.p683ss.android.ugc.aweme.p1484bx.C24458h.C24459a;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.h */
public final class C44870h implements C24454d, C24456f {

    /* renamed from: a */
    public C24458h f113560a = new C24459a();

    /* renamed from: b */
    public View f113561b;

    /* renamed from: c */
    private ViewGroup f113562c;

    /* renamed from: d */
    private View f113563d;

    /* renamed from: b */
    public final void mo50221b() {
    }

    /* renamed from: c */
    public final void mo50224c() {
        this.f113563d.setVisibility(0);
    }

    /* renamed from: d */
    public final void mo50225d() {
        this.f113562c.removeView(this.f113561b);
    }

    /* renamed from: a */
    public final void mo50217a() {
        this.f113563d.setVisibility(4);
        this.f113561b.setVisibility(0);
    }

    /* renamed from: a */
    public final void mo50220a(C24458h hVar) {
        this.f113560a = hVar;
    }

    /* renamed from: a */
    public final void mo50219a(C24454d dVar) {
        mo90985a(dVar, -1);
    }

    /* renamed from: b */
    public final void mo50223b(final C24454d dVar) {
        this.f113560a.mo50224c();
        mo50224c();
        dVar.mo50224c();
        ValueAnimator duration = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}).setDuration(200);
        duration.setInterpolator(new C10673c());
        final int measuredHeight = this.f113561b.getMeasuredHeight();
        duration.addUpdateListener(new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C44870h.this.f113560a.mo50222b(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
                C44870h.this.mo50222b(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
                dVar.mo50222b(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
            }
        });
        duration.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                C44870h.this.f113560a.mo50225d();
                C44870h.this.mo50225d();
                dVar.mo50225d();
            }
        });
        duration.start();
    }

    /* renamed from: a */
    public final void mo90985a(final C24454d dVar, final int i) {
        this.f113561b.setAlpha(0.0f);
        if (this.f113561b.getParent() != null) {
            ((ViewGroup) this.f113561b.getParent()).removeView(this.f113561b);
        }
        this.f113562c.addView(this.f113561b);
        this.f113562c.post(new Runnable() {
            public final void run() {
                final int i;
                C44870h.this.f113560a.mo50217a();
                C44870h.this.mo50217a();
                dVar.mo50217a();
                ValueAnimator duration = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}).setDuration(200);
                duration.setInterpolator(new C10673c());
                if (i == -1) {
                    i = C44870h.this.f113561b.getMeasuredHeight();
                } else {
                    i = i;
                }
                duration.addUpdateListener(new AnimatorUpdateListener() {
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        C44870h.this.f113560a.mo50218a(valueAnimator.getAnimatedFraction(), 0, i);
                        C44870h.this.mo50218a(valueAnimator.getAnimatedFraction(), 0, i);
                        dVar.mo50218a(valueAnimator.getAnimatedFraction(), 0, i);
                    }
                });
                duration.addListener(new AnimatorListenerAdapter() {
                    public final void onAnimationEnd(Animator animator) {
                        super.onAnimationEnd(animator);
                        C44870h.this.f113560a.mo50221b();
                        C44870h.this.mo50221b();
                        dVar.mo50221b();
                    }
                });
                duration.start();
            }
        });
    }

    public C44870h(ViewGroup viewGroup, View view, View view2) {
        this.f113562c = viewGroup;
        this.f113563d = view;
        this.f113561b = view2;
    }

    /* renamed from: a */
    public final void mo50218a(float f, int i, int i2) {
        this.f113561b.setTranslationY(((float) i2) + (((float) (i - i2)) * f));
        this.f113561b.setAlpha(f);
    }

    /* renamed from: b */
    public final void mo50222b(float f, int i, int i2) {
        this.f113561b.setTranslationY(((float) (i2 - i)) * f);
        this.f113561b.setAlpha(1.0f - f);
    }
}
