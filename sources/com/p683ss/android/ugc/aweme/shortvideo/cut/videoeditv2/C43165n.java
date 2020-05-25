package com.p683ss.android.ugc.aweme.shortvideo.cut.videoeditv2;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.n */
final /* synthetic */ class C43165n implements AnimatorUpdateListener {

    /* renamed from: a */
    private final VideoEditViewV2 f109111a;

    /* renamed from: b */
    private final boolean f109112b;

    C43165n(VideoEditViewV2 videoEditViewV2, boolean z) {
        this.f109111a = videoEditViewV2;
        this.f109112b = z;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f109111a.mo87702a(this.f109112b, valueAnimator);
    }
}
