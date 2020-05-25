package com.p683ss.android.ugc.aweme.discover.helper;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.experiment.ProfileUiInitOptimizeEnterThreshold;

/* renamed from: com.ss.android.ugc.aweme.discover.helper.l */
public final class C28204l extends C28189b {

    /* renamed from: d */
    private View f74046d;

    /* renamed from: e */
    private int f74047e = C23728o.m58241a(-5.0d);

    /* renamed from: d */
    private void m67112d() {
        this.f74013b = 160;
        this.f74047e = C23728o.m58241a((double) ProfileUiInitOptimizeEnterThreshold.DEFAULT);
    }

    /* renamed from: c */
    public final C28204l mo56618c() {
        this.f74013b = 0;
        this.f74047e = C23728o.m58241a((double) ProfileUiInitOptimizeEnterThreshold.DEFAULT);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo56604d(Animator animator) {
        m67112d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo56597a(Animator animator) {
        this.f74046d.setTranslationY(0.0f);
        this.f74046d.setAlpha(1.0f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo56601b(Animator animator) {
        this.f74046d.setVisibility(8);
        m67112d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo56598a(ValueAnimator valueAnimator) {
        this.f74046d.setTranslationY(((float) this.f74047e) * valueAnimator.getAnimatedFraction());
        this.f74046d.setAlpha(1.0f - valueAnimator.getAnimatedFraction());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo56602b(ValueAnimator valueAnimator) {
        this.f74046d.setTranslationY(((float) this.f74047e) * (1.0f - valueAnimator.getAnimatedFraction()));
        this.f74046d.setAlpha(valueAnimator.getAnimatedFraction());
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo56603c(Animator animator) {
        this.f74046d.setVisibility(0);
        this.f74046d.setTranslationY((float) this.f74047e);
        this.f74046d.setAlpha(0.0f);
    }

    public C28204l(Context context, View view) {
        super(context);
        this.f74046d = view;
        m67112d();
        this.f74014c = 1;
    }
}
