package com.bytedance.android.livesdk.gift.panel.widget;

import android.animation.ObjectAnimator;
import android.arch.lifecycle.C0199s;
import com.bytedance.android.livesdk.gift.model.p379a.C7490a;

/* renamed from: com.bytedance.android.livesdk.gift.panel.widget.j */
final /* synthetic */ class C7604j implements C0199s {

    /* renamed from: a */
    private final GiftPanelBottomWidget f20941a;

    C7604j(GiftPanelBottomWidget giftPanelBottomWidget) {
        this.f20941a = giftPanelBottomWidget;
    }

    public final void onChanged(Object obj) {
        GiftPanelBottomWidget giftPanelBottomWidget = this.f20941a;
        if (((Boolean) obj).booleanValue()) {
            C7490a aVar = giftPanelBottomWidget.f20804g;
            if (aVar != null && aVar.mo13905b()) {
                giftPanelBottomWidget.f20799b.setVisibility(8);
                giftPanelBottomWidget.f20800c.setVisibility(8);
                giftPanelBottomWidget.f20801d.setVisibility(0);
                if (giftPanelBottomWidget.f20806i != null && giftPanelBottomWidget.f20806i.isRunning()) {
                    giftPanelBottomWidget.f20806i.cancel();
                }
                giftPanelBottomWidget.f20806i = ObjectAnimator.ofFloat(giftPanelBottomWidget.f20801d, "progress", new float[]{360.0f, 0.0f}).setDuration(((long) giftPanelBottomWidget.f20805h) * 1000);
                giftPanelBottomWidget.f20806i.start();
                giftPanelBottomWidget.f20801d.startScaleAnim(((long) giftPanelBottomWidget.f20805h) * 1000, null);
                if (giftPanelBottomWidget.f20807j.hasMessages(1001)) {
                    giftPanelBottomWidget.f20807j.removeMessages(1001);
                }
                giftPanelBottomWidget.f20807j.sendEmptyMessageDelayed(1001, ((long) giftPanelBottomWidget.f20805h) * 1000);
            }
        } else {
            if (giftPanelBottomWidget.f20806i != null && giftPanelBottomWidget.f20806i.isRunning()) {
                giftPanelBottomWidget.f20806i.cancel();
            }
            if (giftPanelBottomWidget.f20807j.hasMessages(1001)) {
                giftPanelBottomWidget.f20807j.removeMessages(1001);
            }
            giftPanelBottomWidget.f20799b.setVisibility(0);
            giftPanelBottomWidget.f20801d.setVisibility(8);
            giftPanelBottomWidget.mo13955a(giftPanelBottomWidget.f20804g, true);
        }
    }
}
