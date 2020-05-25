package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.ei */
final /* synthetic */ class C6558ei implements OnClickListener {

    /* renamed from: a */
    private final PromotionStatusWidget f17889a;

    /* renamed from: b */
    private final long f17890b;

    C6558ei(PromotionStatusWidget promotionStatusWidget, long j) {
        this.f17889a = promotionStatusWidget;
        this.f17890b = j;
    }

    public final void onClick(View view) {
        this.f17889a.mo12517a(view, this.f17890b);
    }
}
