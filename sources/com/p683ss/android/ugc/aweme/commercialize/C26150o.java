package com.p683ss.android.ugc.aweme.commercialize;

import android.content.Intent;
import com.p683ss.android.ugc.aweme.qrcode.QRCodePermissionActivity;

/* renamed from: com.ss.android.ugc.aweme.commercialize.o */
final /* synthetic */ class C26150o implements Runnable {

    /* renamed from: a */
    private final PoiCouponRedeemActivity f69053a;

    C26150o(PoiCouponRedeemActivity poiCouponRedeemActivity) {
        this.f69053a = poiCouponRedeemActivity;
    }

    public final void run() {
        PoiCouponRedeemActivity poiCouponRedeemActivity = this.f69053a;
        poiCouponRedeemActivity.startActivity(new Intent(poiCouponRedeemActivity, QRCodePermissionActivity.class));
    }
}
