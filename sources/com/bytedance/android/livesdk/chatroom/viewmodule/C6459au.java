package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.bytedance.android.livesdk.p399o.C8068g;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.au */
final /* synthetic */ class C6459au implements OnClickListener {

    /* renamed from: a */
    private final GiftWidget f17764a;

    C6459au(GiftWidget giftWidget) {
        this.f17764a = giftWidget;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C8068g.m16014a(this.f17764a.context);
        dialogInterface.dismiss();
    }
}
