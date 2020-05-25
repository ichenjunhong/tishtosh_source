package com.bytedance.android.livesdk.chatroom.interact;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.r */
public final /* synthetic */ class C5669r implements OnClickListener {

    /* renamed from: a */
    private final LinkInRoomVideoGuestWidget f14859a;

    /* renamed from: b */
    private final Runnable f14860b;

    public C5669r(LinkInRoomVideoGuestWidget linkInRoomVideoGuestWidget, Runnable runnable) {
        this.f14859a = linkInRoomVideoGuestWidget;
        this.f14860b = runnable;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        LinkInRoomVideoGuestWidget linkInRoomVideoGuestWidget = this.f14859a;
        Runnable runnable = this.f14860b;
        dialogInterface.dismiss();
        linkInRoomVideoGuestWidget.f14010g = runnable;
        linkInRoomVideoGuestWidget.f14005b.mo11442i();
    }
}
