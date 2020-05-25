package com.p683ss.android.ugc.aweme.feed.guide;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;

/* renamed from: com.ss.android.ugc.aweme.feed.guide.l */
final /* synthetic */ class C30302l implements AnimatorUpdateListener {

    /* renamed from: a */
    private final C30290k f79175a;

    /* renamed from: b */
    private final C1352v f79176b;

    /* renamed from: c */
    private final float f79177c;

    C30302l(C30290k kVar, C1352v vVar, float f) {
        this.f79175a = kVar;
        this.f79176b = vVar;
        this.f79177c = f;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C30290k kVar = this.f79175a;
        C1352v vVar = this.f79176b;
        float f = this.f79177c;
        View view = vVar.itemView;
        Float f2 = (Float) valueAnimator.getAnimatedValue();
        view.setTranslationX((1.0f - f2.floatValue()) * f);
        view.setAlpha((f2.floatValue() * 0.65999997f) + 0.34f);
        view.setScaleX((f2.floatValue() * 0.100000024f) + 0.9f);
        view.setScaleY((f2.floatValue() * 0.100000024f) + 0.9f);
        view.setTranslationY(C30290k.m71210a(vVar, (1.0f - f2.floatValue()) * 12.0f));
    }
}
