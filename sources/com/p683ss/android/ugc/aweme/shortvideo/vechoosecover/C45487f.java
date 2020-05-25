package com.p683ss.android.ugc.aweme.shortvideo.vechoosecover;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.vechoosecover.f */
final /* synthetic */ class C45487f implements AnimatorUpdateListener {

    /* renamed from: a */
    private final C45480a f114936a;

    /* renamed from: b */
    private final float f114937b;

    /* renamed from: c */
    private final int f114938c;

    /* renamed from: d */
    private final int f114939d;

    /* renamed from: e */
    private final int f114940e;

    /* renamed from: f */
    private final int f114941f;

    /* renamed from: g */
    private final int f114942g;

    C45487f(C45480a aVar, float f, int i, int i2, int i3, int i4, int i5) {
        this.f114936a = aVar;
        this.f114937b = f;
        this.f114938c = i;
        this.f114939d = i2;
        this.f114940e = i3;
        this.f114941f = i4;
        this.f114942g = i5;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C45480a aVar = this.f114936a;
        float f = this.f114937b;
        int i = this.f114938c;
        int i2 = this.f114939d;
        int i3 = this.f114940e;
        int i4 = this.f114941f;
        int i5 = this.f114942g;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        int i6 = (int) (((((((float) i) - (((float) (i2 - i3)) * animatedFraction)) - floatValue) / 2.0f) + ((float) i4)) - ((float) i5));
        int i7 = (int) (f * floatValue);
        int i8 = (int) floatValue;
        ChooseCoverActivity.this.f114909b.f131275u.mo43015a(0, i6, i7, i8);
        aVar.mo91760a(0, i6, i7, i8);
        ChooseCoverActivity.this.mo91757a(0, i6, i7, i8);
    }
}
