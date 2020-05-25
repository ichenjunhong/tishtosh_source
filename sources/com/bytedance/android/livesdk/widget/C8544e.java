package com.bytedance.android.livesdk.widget;

import android.animation.ObjectAnimator;
import android.view.animation.LinearInterpolator;
import com.bytedance.android.live.uikit.p257c.C4206c;

/* renamed from: com.bytedance.android.livesdk.widget.e */
final /* synthetic */ class C8544e implements Runnable {

    /* renamed from: a */
    private final GiftUserInfoView f23428a;

    /* renamed from: b */
    private final int f23429b;

    C8544e(GiftUserInfoView giftUserInfoView, int i) {
        this.f23428a = giftUserInfoView;
        this.f23429b = i;
    }

    public final void run() {
        GiftUserInfoView giftUserInfoView = this.f23428a;
        int i = this.f23429b;
        if (giftUserInfoView.f23007h.getScrollX() != 0 && C4206c.m10426a(giftUserInfoView.getContext())) {
            i = giftUserInfoView.f23007h.getScrollX() - i;
        }
        giftUserInfoView.f23008i = ObjectAnimator.ofInt(giftUserInfoView.f23007h, "scrollX", new int[]{i}).setDuration(2000);
        giftUserInfoView.f23008i.setInterpolator(new LinearInterpolator());
        giftUserInfoView.f23008i.start();
    }
}
