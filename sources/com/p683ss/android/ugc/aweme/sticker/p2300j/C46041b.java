package com.p683ss.android.ugc.aweme.sticker.p2300j;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.os.Handler;
import android.os.Looper;
import android.support.p030v4.view.C1056u;
import android.view.View;
import android.widget.FrameLayout;
import com.p683ss.android.ugc.aweme.anim.C22679a;
import com.p683ss.android.ugc.aweme.p1484bx.C24454d;
import com.p683ss.android.ugc.aweme.p1484bx.C24456f;
import com.p683ss.android.ugc.aweme.p1484bx.C24458h;
import com.p683ss.android.ugc.aweme.p1484bx.C24458h.C24459a;

/* renamed from: com.ss.android.ugc.aweme.sticker.j.b */
public class C46041b implements C24454d, C24456f {

    /* renamed from: a */
    protected C24458h f116172a = new C24459a();

    /* renamed from: b */
    public FrameLayout f116173b;

    /* renamed from: c */
    public View f116174c;

    /* renamed from: d */
    public View f116175d;

    /* renamed from: e */
    private Handler f116176e = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    public final void mo50221b() {
    }

    /* renamed from: c */
    public final void mo50224c() {
    }

    /* renamed from: a */
    public final void mo50217a() {
        this.f116174c.setVisibility(0);
    }

    /* renamed from: d */
    public final void mo50225d() {
        this.f116176e.post(new C46047c(this));
    }

    /* renamed from: a */
    public final void mo50220a(C24458h hVar) {
        this.f116172a = hVar;
    }

    /* renamed from: a */
    public final void mo50219a(final C24454d dVar) {
        this.f116173b.removeAllViews();
        this.f116173b.addView(this.f116175d);
        this.f116173b.post(new Runnable() {
            public final void run() {
                if (C46041b.this.f116173b.indexOfChild(C46041b.this.f116175d) != -1 && C1056u.m3018B(C46041b.this.f116175d)) {
                    C46041b.this.f116172a.mo50217a();
                    C46041b.this.mo50217a();
                    dVar.mo50217a();
                    ValueAnimator duration = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}).setDuration(490);
                    duration.setInterpolator(new C22679a());
                    final int measuredHeight = C46041b.this.f116174c.getMeasuredHeight();
                    duration.addUpdateListener(new AnimatorUpdateListener() {
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            C46041b.this.f116172a.mo50218a(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
                            C46041b.this.mo50218a(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
                            dVar.mo50218a(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
                        }
                    });
                    duration.addListener(new AnimatorListenerAdapter() {
                        public final void onAnimationEnd(Animator animator) {
                            super.onAnimationEnd(animator);
                            if (C1056u.m3018B(C46041b.this.f116175d)) {
                                C46041b.this.f116172a.mo50221b();
                                C46041b.this.mo50221b();
                                dVar.mo50221b();
                            }
                        }
                    });
                    duration.start();
                }
            }
        });
    }

    /* renamed from: b */
    public final void mo50223b(final C24454d dVar) {
        this.f116172a.mo50224c();
        mo50224c();
        dVar.mo50224c();
        ValueAnimator duration = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}).setDuration(250);
        final int measuredHeight = this.f116174c.getMeasuredHeight();
        duration.addUpdateListener(new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C46041b.this.f116172a.mo50222b(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
                C46041b.this.mo50222b(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
                dVar.mo50222b(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
            }
        });
        duration.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                if (C1056u.m3018B(C46041b.this.f116175d)) {
                    C46041b.this.f116172a.mo50225d();
                    C46041b.this.mo50225d();
                    dVar.mo50225d();
                }
            }
        });
        duration.start();
    }

    /* renamed from: a */
    public final void mo50218a(float f, int i, int i2) {
        this.f116174c.setTranslationY(((float) i2) + (((float) (i - i2)) * f));
    }

    /* renamed from: b */
    public final void mo50222b(float f, int i, int i2) {
        this.f116174c.setTranslationY(((float) (i2 - i)) * f);
    }

    public C46041b(FrameLayout frameLayout, View view, View view2) {
        this.f116173b = frameLayout;
        this.f116175d = view;
        this.f116174c = view2;
    }
}
