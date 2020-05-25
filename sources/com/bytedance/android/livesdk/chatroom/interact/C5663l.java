package com.bytedance.android.livesdk.chatroom.interact;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.l */
final /* synthetic */ class C5663l implements OnDismissListener {

    /* renamed from: a */
    private final LinkInRoomVideoAnchorWidget f14846a;

    C5663l(LinkInRoomVideoAnchorWidget linkInRoomVideoAnchorWidget) {
        this.f14846a = linkInRoomVideoAnchorWidget;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        this.f14846a.f13990d = null;
    }
}
