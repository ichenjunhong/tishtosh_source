package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.bw */
final /* synthetic */ class C6488bw implements OnClickListener {

    /* renamed from: a */
    private final LinkInRoomAudioWidget f17788a;

    /* renamed from: b */
    private final Runnable f17789b;

    C6488bw(LinkInRoomAudioWidget linkInRoomAudioWidget, Runnable runnable) {
        this.f17788a = linkInRoomAudioWidget;
        this.f17789b = runnable;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        LinkInRoomAudioWidget linkInRoomAudioWidget = this.f17788a;
        Runnable runnable = this.f17789b;
        dialogInterface.dismiss();
        linkInRoomAudioWidget.f17162h = runnable;
        linkInRoomAudioWidget.f17156b.mo11377j();
    }
}
