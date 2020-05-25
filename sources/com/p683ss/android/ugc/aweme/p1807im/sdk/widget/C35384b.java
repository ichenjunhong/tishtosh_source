package com.p683ss.android.ugc.aweme.p1807im.sdk.widget;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import com.bytedance.ies.uikit.p697a.C11065a;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.widget.b */
final /* synthetic */ class C35384b implements AnimatorUpdateListener {

    /* renamed from: a */
    private final DragView f90915a;

    /* renamed from: b */
    private final float f90916b;

    /* renamed from: c */
    private final float f90917c;

    /* renamed from: d */
    private final float f90918d;

    /* renamed from: e */
    private final float f90919e;

    /* renamed from: f */
    private final float f90920f;

    C35384b(DragView dragView, float f, float f2, float f3, float f4, float f5) {
        this.f90915a = dragView;
        this.f90916b = f;
        this.f90917c = f2;
        this.f90918d = f3;
        this.f90919e = f4;
        this.f90920f = f5;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        DragView dragView = this.f90915a;
        float f = this.f90916b;
        float f2 = this.f90917c;
        float f3 = this.f90918d;
        float f4 = this.f90919e;
        float f5 = this.f90920f;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        dragView.f90755d = (f * floatValue) + dragView.f90758g;
        dragView.f90756e = (f2 * floatValue) + dragView.f90759h;
        dragView.f90760i = (int) (f3 * floatValue);
        int i = (int) ((f4 * floatValue) + ((float) dragView.f90770s));
        int i2 = (int) ((f5 * floatValue) + ((float) dragView.f90769r));
        if (!dragView.f90762k) {
            i2 = (int) (((float) i2) - ((1.0f - floatValue) * ((float) C11065a.m22390a(dragView.f90752a.getContext()))));
        }
        dragView.f90757f = dragView.f90754c.f90787e * (1.0f - floatValue);
        dragView.mo73535a(i, i2);
        if (dragView.f90764m != null) {
            dragView.f90764m.mo71092a(valueAnimator);
        }
    }
}
