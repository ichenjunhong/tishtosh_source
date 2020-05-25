package com.p683ss.android.ugc.aweme.tools.beauty.views;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.anim.C22679a;
import com.p683ss.android.ugc.aweme.p1484bx.C24454d;
import com.p683ss.android.ugc.aweme.p1484bx.C24456f;
import com.p683ss.android.ugc.aweme.p1484bx.C24458h;
import com.p683ss.android.ugc.aweme.p1484bx.C24458h.C24459a;

/* renamed from: com.ss.android.ugc.aweme.tools.beauty.views.a */
public final class C46923a implements C24454d, C24456f {

    /* renamed from: a */
    public C24458h f118543a = new C24459a();

    /* renamed from: b */
    public View f118544b;

    /* renamed from: c */
    private ViewGroup f118545c;

    /* renamed from: d */
    private View f118546d;

    /* renamed from: b */
    public final void mo50221b() {
    }

    /* renamed from: c */
    public final void mo50224c() {
    }

    /* renamed from: d */
    public final void mo50225d() {
        this.f118545c.removeView(this.f118546d);
    }

    /* renamed from: a */
    public final void mo50217a() {
        this.f118546d.setVisibility(0);
        this.f118544b.setVisibility(0);
    }

    /* renamed from: a */
    public final void mo50220a(C24458h hVar) {
        this.f118543a = hVar;
    }

    /* renamed from: a */
    public final void mo50219a(final C24454d dVar) {
        this.f118545c.removeAllViews();
        ViewGroup viewGroup = (ViewGroup) this.f118546d.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(this.f118546d);
        }
        this.f118545c.addView(this.f118546d);
        this.f118545c.post(new Runnable() {
            public final void run() {
                C46923a.this.f118543a.mo50217a();
                C46923a.this.mo50217a();
                dVar.mo50217a();
                ValueAnimator duration = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}).setDuration(490);
                duration.setInterpolator(new C22679a());
                final int measuredHeight = C46923a.this.f118544b.getMeasuredHeight();
                duration.addUpdateListener(new AnimatorUpdateListener() {
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        C46923a.this.f118543a.mo50218a(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
                        C46923a.this.mo50218a(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
                        dVar.mo50218a(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
                    }
                });
                duration.addListener(new AnimatorListenerAdapter() {
                    public final void onAnimationEnd(Animator animator) {
                        super.onAnimationEnd(animator);
                        C46923a.this.f118543a.mo50221b();
                        C46923a.this.mo50221b();
                        dVar.mo50221b();
                    }
                });
                duration.start();
            }
        });
    }

    /* renamed from: b */
    public final void mo50223b(final C24454d dVar) {
        this.f118543a.mo50224c();
        mo50224c();
        dVar.mo50224c();
        ValueAnimator duration = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}).setDuration(250);
        final int measuredHeight = this.f118544b.getMeasuredHeight();
        duration.addUpdateListener(new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C46923a.this.f118543a.mo50222b(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
                C46923a.this.mo50222b(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
                dVar.mo50222b(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
            }
        });
        duration.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                C46923a.this.f118543a.mo50225d();
                C46923a.this.mo50225d();
                dVar.mo50225d();
            }
        });
        duration.start();
    }

    /* renamed from: b */
    public final void mo50222b(float f, int i, int i2) {
        this.f118544b.setTranslationY(((float) (i2 - i)) * f);
    }

    public C46923a(ViewGroup viewGroup, View view, View view2) {
        this.f118545c = viewGroup;
        this.f118546d = view;
        this.f118544b = view2;
    }

    /* renamed from: a */
    public final void mo50218a(float f, int i, int i2) {
        this.f118544b.setTranslationY(((float) i2) + (((float) (i - i2)) * f));
    }
}
