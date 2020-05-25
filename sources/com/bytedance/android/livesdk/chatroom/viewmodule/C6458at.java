package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.livesdk.p399o.C8068g;
import com.bytedance.android.livesdkapi.host.IHostApp;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.at */
final /* synthetic */ class C6458at implements OnClickListener {

    /* renamed from: a */
    private final GiftWidget f17763a;

    C6458at(GiftWidget giftWidget) {
        this.f17763a = giftWidget;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        GiftWidget giftWidget = this.f17763a;
        C8068g.m16014a(giftWidget.context);
        C8068g.m16014a(giftWidget.context);
        ((IHostApp) C4116c.m10249a(IHostApp.class)).openWallet((Activity) giftWidget.context);
        dialogInterface.dismiss();
    }
}
