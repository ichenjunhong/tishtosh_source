package com.bytedance.android.livesdk.gift;

import android.view.View;
import android.view.View.OnLayoutChangeListener;
import com.bytedance.android.livesdk.chatroom.event.C5191k;

/* renamed from: com.bytedance.android.livesdk.gift.b */
final /* synthetic */ class C7215b implements OnLayoutChangeListener {

    /* renamed from: a */
    private final GiftEndWidget f19592a;

    C7215b(GiftEndWidget giftEndWidget) {
        this.f19592a = giftEndWidget;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        GiftEndWidget giftEndWidget = this.f19592a;
        if (i4 - i2 != i8 - i6) {
            giftEndWidget.f19549a.lambda$put$1$DataCenter("cmd_gift_dialog_switch", new C5191k(giftEndWidget.contentView.getMeasuredHeight(), true));
        }
    }
}
