package com.p683ss.android.ugc.aweme.p1807im.sdk.widget;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.widget.c */
final /* synthetic */ class C35394c implements AnimatorUpdateListener {

    /* renamed from: a */
    private final DragView f90956a;

    /* renamed from: b */
    private final float f90957b;

    /* renamed from: c */
    private final float f90958c;

    /* renamed from: d */
    private final float f90959d;

    /* renamed from: e */
    private final float f90960e;

    /* renamed from: f */
    private final int f90961f;

    /* renamed from: g */
    private final int f90962g;

    /* renamed from: h */
    private final float f90963h;

    /* renamed from: i */
    private final float f90964i;

    C35394c(DragView dragView, float f, float f2, float f3, float f4, int i, int i2, float f5, float f6) {
        this.f90956a = dragView;
        this.f90957b = f;
        this.f90958c = f2;
        this.f90959d = f3;
        this.f90960e = f4;
        this.f90961f = i;
        this.f90962g = i2;
        this.f90963h = f5;
        this.f90964i = f6;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        DragView dragView = this.f90956a;
        float f = this.f90957b;
        float f2 = this.f90958c;
        float f3 = this.f90959d;
        float f4 = this.f90960e;
        int i = this.f90961f;
        int i2 = this.f90962g;
        float f5 = this.f90963h;
        float f6 = this.f90964i;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        float f7 = 1.0f - floatValue;
        dragView.f90755d = (f * f7) + f2;
        dragView.f90756e = (f3 * f7) + f4;
        dragView.f90760i = ((int) (f7 * ((float) i))) + i2;
        dragView.mo73535a((int) ((f5 * floatValue) + ((float) dragView.f90767p)), (int) ((floatValue * f6) + ((float) dragView.f90768q)));
    }
}
