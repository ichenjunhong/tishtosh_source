package com.p683ss.android.ugc.aweme.p1807im.sdk.widget;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.widget.e */
final /* synthetic */ class C35399e implements AnimatorUpdateListener {

    /* renamed from: a */
    private final DragView f90978a;

    /* renamed from: b */
    private final float f90979b;

    /* renamed from: c */
    private final float f90980c;

    /* renamed from: d */
    private final float f90981d;

    /* renamed from: e */
    private final float f90982e;

    /* renamed from: f */
    private final float f90983f;

    /* renamed from: g */
    private final float f90984g;

    /* renamed from: h */
    private final float f90985h;

    /* renamed from: i */
    private final float f90986i;

    /* renamed from: j */
    private final float f90987j;

    C35399e(DragView dragView, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.f90978a = dragView;
        this.f90979b = f;
        this.f90980c = f2;
        this.f90981d = f3;
        this.f90982e = f4;
        this.f90983f = f5;
        this.f90984g = f6;
        this.f90985h = f7;
        this.f90986i = f8;
        this.f90987j = f9;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        DragView dragView = this.f90978a;
        float f = this.f90979b;
        float f2 = this.f90980c;
        float f3 = this.f90981d;
        float f4 = this.f90982e;
        float f5 = this.f90983f;
        float f6 = this.f90984g;
        float f7 = this.f90985h;
        float f8 = this.f90986i;
        float f9 = this.f90987j;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        dragView.f90755d = (f * floatValue) + f2;
        dragView.f90756e = (f3 * floatValue) + f4;
        dragView.f90760i = (int) (f5 * floatValue);
        dragView.mo73535a((int) ((f6 * floatValue) + f7), (int) ((f8 * floatValue) + f9));
    }
}
