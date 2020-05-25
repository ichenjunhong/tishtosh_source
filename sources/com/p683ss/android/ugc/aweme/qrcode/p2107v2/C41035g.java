package com.p683ss.android.ugc.aweme.qrcode.p2107v2;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: com.ss.android.ugc.aweme.qrcode.v2.g */
final /* synthetic */ class C41035g implements AnimatorUpdateListener {

    /* renamed from: a */
    private final ScanQRCodeActivityV2 f104350a;

    C41035g(ScanQRCodeActivityV2 scanQRCodeActivityV2) {
        this.f104350a = scanQRCodeActivityV2;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ScanQRCodeActivityV2 scanQRCodeActivityV2 = this.f104350a;
        if (scanQRCodeActivityV2.f104319z != null) {
            scanQRCodeActivityV2.f104319z.mo83569a(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }
}
