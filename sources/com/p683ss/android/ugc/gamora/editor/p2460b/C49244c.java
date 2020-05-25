package com.p683ss.android.ugc.gamora.editor.p2460b;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import com.p683ss.android.ugc.aweme.adaptation.C22452a;
import com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.data.C43739b;

/* renamed from: com.ss.android.ugc.gamora.editor.b.c */
final /* synthetic */ class C49244c implements AnimatorUpdateListener {

    /* renamed from: a */
    private final C49231a f123695a;

    /* renamed from: b */
    private final boolean f123696b;

    /* renamed from: c */
    private final int f123697c;

    /* renamed from: d */
    private final int f123698d;

    /* renamed from: e */
    private final float f123699e;

    /* renamed from: f */
    private final int f123700f;

    /* renamed from: g */
    private final int f123701g;

    C49244c(C49231a aVar, boolean z, int i, int i2, float f, int i3, int i4) {
        this.f123695a = aVar;
        this.f123696b = z;
        this.f123697c = i;
        this.f123698d = i2;
        this.f123699e = f;
        this.f123700f = i3;
        this.f123701g = i4;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float[] fArr;
        C49231a aVar = this.f123695a;
        boolean z = this.f123696b;
        int i = this.f123697c;
        int i2 = this.f123698d;
        float f = this.f123699e;
        int i3 = this.f123700f;
        int i4 = this.f123701g;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        if (z) {
            animatedFraction = 1.0f - animatedFraction;
        }
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (C49231a.m106233a(i, i2)) {
            float f2 = f * floatValue;
            fArr = new float[]{f2, (((float) i3) - f2) / 2.0f, ((float) (i4 - C22452a.m55498d())) * animatedFraction};
        } else {
            float f3 = f * floatValue;
            fArr = new float[]{f3, (((float) i3) - f3) / 2.0f, 0.0f};
        }
        float f4 = fArr[0];
        float f5 = fArr[1];
        int i5 = (int) f5;
        int i6 = (int) fArr[2];
        int i7 = (int) f4;
        int i8 = (int) floatValue;
        aVar.f123645k.f131275u.mo43015a(i5, i6, i7, i8);
        aVar.mo97205a(i5, i6, i7, i8);
        aVar.mo97204a((floatValue * 1.0f) / ((float) i), i5, i6);
        C43739b.f110731a = i5;
        C43739b.f110732b = i6;
        C43739b.f110733c = i7;
        C43739b.f110734d = i8;
    }
}
