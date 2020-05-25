package com.bytedance.android.livesdk.chatroom.interact;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.v */
final /* synthetic */ class C5684v implements OnDismissListener {

    /* renamed from: a */
    private final LinkInRoomVideoGuestWidget f14906a;

    C5684v(LinkInRoomVideoGuestWidget linkInRoomVideoGuestWidget) {
        this.f14906a = linkInRoomVideoGuestWidget;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        this.f14906a.f14004a = null;
    }
}
