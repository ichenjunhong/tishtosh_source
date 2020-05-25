package com.p683ss.android.ugc.aweme.sticker;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.ViewGroup.LayoutParams;
import com.p683ss.android.ugc.aweme.sticker.IFavoriteSticker.FavoriteSticker;

/* renamed from: com.ss.android.ugc.aweme.sticker.c */
final /* synthetic */ class C45845c implements AnimatorUpdateListener {

    /* renamed from: a */
    private final C458011 f115861a;

    /* renamed from: b */
    private final LayoutParams f115862b;

    C45845c(C458011 r1, LayoutParams layoutParams) {
        this.f115861a = r1;
        this.f115862b = layoutParams;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C458011 r0 = this.f115861a;
        LayoutParams layoutParams = this.f115862b;
        layoutParams.width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        FavoriteSticker.this.f115760b.setLayoutParams(layoutParams);
    }
}
