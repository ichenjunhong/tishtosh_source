package com.p683ss.android.ugc.aweme.p1807im.sdk.widget;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.widget.d */
final /* synthetic */ class C35398d implements AnimatorUpdateListener {

    /* renamed from: a */
    private final DragView f90973a;

    /* renamed from: b */
    private final float f90974b;

    /* renamed from: c */
    private final float f90975c;

    /* renamed from: d */
    private final float f90976d;

    /* renamed from: e */
    private final float f90977e;

    C35398d(DragView dragView, float f, float f2, float f3, float f4) {
        this.f90973a = dragView;
        this.f90974b = f;
        this.f90975c = f2;
        this.f90976d = f3;
        this.f90977e = f4;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        DragView dragView = this.f90973a;
        float f = this.f90974b;
        float f2 = this.f90975c;
        float f3 = this.f90976d;
        float f4 = this.f90977e;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        dragView.f90755d = (f * floatValue) + dragView.f90758g;
        dragView.f90756e = (f2 * floatValue) + dragView.f90759h;
        dragView.f90760i = (int) (255.0f * floatValue);
        dragView.f90757f = dragView.f90754c.f90787e * (1.0f - floatValue);
        dragView.mo73535a(dragView.f90770s + ((int) (f3 * floatValue)), dragView.f90769r + ((int) (floatValue * f4)));
    }
}
