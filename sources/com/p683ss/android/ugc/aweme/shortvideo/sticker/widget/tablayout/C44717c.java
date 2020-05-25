package com.p683ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.C44711h;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.c */
final /* synthetic */ class C44717c implements AnimatorUpdateListener {

    /* renamed from: a */
    private final C44711h f113200a;

    /* renamed from: b */
    private final int f113201b;

    /* renamed from: c */
    private final int f113202c;

    /* renamed from: d */
    private final TabLayout f113203d;

    /* renamed from: e */
    private final boolean f113204e;

    /* renamed from: f */
    private final boolean f113205f;

    C44717c(C44711h hVar, int i, int i2, TabLayout tabLayout, boolean z, boolean z2) {
        this.f113200a = hVar;
        this.f113201b = i;
        this.f113202c = i2;
        this.f113203d = tabLayout;
        this.f113204e = z;
        this.f113205f = z2;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C44711h hVar = this.f113200a;
        int i = this.f113201b;
        int i2 = this.f113202c;
        TabLayout tabLayout = this.f113203d;
        boolean z = this.f113204e;
        boolean z2 = this.f113205f;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (i >= i2 || hVar.f113173a) {
            floatValue = 1.0f - floatValue;
        } else {
            i2--;
        }
        tabLayout.mo90680a(i2, floatValue, z, z2);
    }
}
