package com.bytedance.android.livesdk.cov19;

import android.animation.ObjectAnimator;

/* renamed from: com.bytedance.android.livesdk.cov19.h */
final /* synthetic */ class C6734h implements Runnable {

    /* renamed from: a */
    private final DonationLuckyWidget f18411a;

    C6734h(DonationLuckyWidget donationLuckyWidget) {
        this.f18411a = donationLuckyWidget;
    }

    public final void run() {
        DonationLuckyWidget donationLuckyWidget = this.f18411a;
        donationLuckyWidget.f18368a.mo6661f();
        donationLuckyWidget.f18369b.setAlpha(0.0f);
        donationLuckyWidget.f18369b.setVisibility(0);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(donationLuckyWidget.f18369b, "alpha", new float[]{0.0f, 255.0f});
        ofFloat.setDuration(5000);
        ofFloat.start();
        donationLuckyWidget.f18368a.setVisibility(8);
    }
}
