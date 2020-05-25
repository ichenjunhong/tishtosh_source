package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.cb */
final /* synthetic */ class C6494cb implements OnDismissListener {

    /* renamed from: a */
    private final LinkInRoomAudioWidget f17797a;

    C6494cb(LinkInRoomAudioWidget linkInRoomAudioWidget) {
        this.f17797a = linkInRoomAudioWidget;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        this.f17797a.f17155a = null;
    }
}
