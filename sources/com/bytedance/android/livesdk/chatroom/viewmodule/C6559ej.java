package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.ej */
final /* synthetic */ class C6559ej implements OnClickListener {

    /* renamed from: a */
    private final PromotionStatusWidget f17891a;

    /* renamed from: b */
    private final long f17892b;

    C6559ej(PromotionStatusWidget promotionStatusWidget, long j) {
        this.f17891a = promotionStatusWidget;
        this.f17892b = j;
    }

    public final void onClick(View view) {
        PromotionStatusWidget promotionStatusWidget = this.f17891a;
        long j = this.f17892b;
        promotionStatusWidget.mo12518a(true);
        promotionStatusWidget.mo12517a(view, j);
    }
}
