package com.p683ss.android.ugc.aweme.sticker;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.ViewGroup.LayoutParams;
import com.p683ss.android.ugc.aweme.sticker.IFavoriteSticker.FavoriteSticker;

/* renamed from: com.ss.android.ugc.aweme.sticker.b */
final /* synthetic */ class C45820b implements AnimatorUpdateListener {

    /* renamed from: a */
    private final C458011 f115818a;

    /* renamed from: b */
    private final LayoutParams f115819b;

    C45820b(C458011 r1, LayoutParams layoutParams) {
        this.f115818a = r1;
        this.f115819b = layoutParams;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C458011 r0 = this.f115818a;
        LayoutParams layoutParams = this.f115819b;
        layoutParams.width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        FavoriteSticker.this.f115760b.setLayoutParams(layoutParams);
    }
}
