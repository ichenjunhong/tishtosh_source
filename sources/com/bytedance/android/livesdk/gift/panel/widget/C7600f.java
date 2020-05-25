package com.bytedance.android.livesdk.gift.panel.widget;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.android.livesdk.gift.C7649u;
import com.bytedance.android.livesdk.gift.model.GiftPage;

/* renamed from: com.bytedance.android.livesdk.gift.panel.widget.f */
final /* synthetic */ class C7600f implements OnClickListener {

    /* renamed from: a */
    private final GiftConfigurablePanelTabWidget f20933a;

    /* renamed from: b */
    private final View f20934b;

    /* renamed from: c */
    private final GiftPage f20935c;

    C7600f(GiftConfigurablePanelTabWidget giftConfigurablePanelTabWidget, View view, GiftPage giftPage) {
        this.f20933a = giftConfigurablePanelTabWidget;
        this.f20934b = view;
        this.f20935c = giftPage;
    }

    public final void onClick(View view) {
        GiftConfigurablePanelTabWidget giftConfigurablePanelTabWidget = this.f20933a;
        View view2 = this.f20934b;
        GiftPage giftPage = this.f20935c;
        giftConfigurablePanelTabWidget.mo13942a(view2, true, giftPage);
        if (giftPage.pageType == 5) {
            giftConfigurablePanelTabWidget.mo13944a(false);
            C7649u.m15656a().mo14017d();
        }
    }
}
