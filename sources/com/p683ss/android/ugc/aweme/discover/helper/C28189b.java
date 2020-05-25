package com.p683ss.android.ugc.aweme.discover.helper;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import com.p683ss.android.ugc.aweme.shortvideo.C42422am;

/* renamed from: com.ss.android.ugc.aweme.discover.helper.b */
public abstract class C28189b {

    /* renamed from: a */
    public Context f74012a;

    /* renamed from: b */
    public int f74013b;

    /* renamed from: c */
    protected int f74014c;

    /* renamed from: d */
    private ValueAnimator f74015d;

    /* renamed from: e */
    private ValueAnimator f74016e;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo56597a(Animator animator);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo56598a(ValueAnimator valueAnimator);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo56601b(Animator animator);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo56602b(ValueAnimator valueAnimator);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo56603c(Animator animator);

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo56604d(Animator animator);

    /* renamed from: a */
    public void mo56596a() {
        mo56599a(true);
    }

    /* renamed from: c */
    private boolean mo56618c() {
        if (this.f74016e != null && this.f74016e.isRunning()) {
            return true;
        }
        if (this.f74015d == null || !this.f74015d.isRunning()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public void mo56600b() {
        long j;
        if (this.f74014c != 0 && !mo56618c()) {
            if (this.f74016e == null) {
                this.f74016e = new ValueAnimator();
                this.f74016e.setFloatValues(new float[]{0.0f, 1.0f});
                ValueAnimator valueAnimator = this.f74016e;
                if (this.f74013b == 0) {
                    j = 200;
                } else {
                    j = (long) this.f74013b;
                }
                valueAnimator.setDuration(j);
                this.f74016e.setInterpolator(new C42422am(0.32f, 0.94f, 0.6f, 1.0f));
                this.f74016e.addUpdateListener(new AnimatorUpdateListener() {
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        C28189b.this.mo56602b(valueAnimator);
                    }
                });
                this.f74016e.addListener(new AnimatorListenerAdapter() {
                    public final void onAnimationEnd(Animator animator) {
                        super.onAnimationEnd(animator);
                        C28189b.this.mo56604d(animator);
                        C28189b.this.f74014c = 0;
                    }

                    public final void onAnimationStart(Animator animator) {
                        super.onAnimationStart(animator);
                        C28189b.this.mo56603c(animator);
                    }
                });
            }
            this.f74016e.start();
        }
    }

    public C28189b(Context context) {
        this.f74012a = context;
    }

    /* renamed from: a */
    public final void mo56599a(boolean z) {
        long j;
        if (this.f74014c != 1 && !mo56618c()) {
            if (this.f74015d == null) {
                this.f74015d = new ValueAnimator();
                this.f74015d.setFloatValues(new float[]{0.0f, 1.0f});
                if (this.f74013b == 0) {
                    j = 200;
                } else {
                    j = (long) this.f74013b;
                }
                if (!z) {
                    j = 0;
                }
                this.f74015d.setDuration(j);
                this.f74015d.setInterpolator(new C42422am(0.32f, 0.94f, 0.6f, 1.0f));
                this.f74015d.addUpdateListener(new AnimatorUpdateListener() {
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        C28189b.this.mo56598a(valueAnimator);
                    }
                });
                this.f74015d.addListener(new AnimatorListenerAdapter() {
                    public final void onAnimationEnd(Animator animator) {
                        super.onAnimationEnd(animator);
                        C28189b.this.mo56601b(animator);
                        C28189b.this.f74014c = 1;
                    }

                    public final void onAnimationStart(Animator animator) {
                        super.onAnimationStart(animator);
                        C28189b.this.mo56597a(animator);
                    }
                });
            }
            this.f74015d.start();
        }
    }
}
