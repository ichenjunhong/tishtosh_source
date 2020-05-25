package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.bytedance.android.livesdk.TTLiveSDKContext;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.bz */
final /* synthetic */ class C6491bz implements OnClickListener {

    /* renamed from: a */
    private final LinkInRoomAudioWidget f17794a;

    C6491bz(LinkInRoomAudioWidget linkInRoomAudioWidget) {
        this.f17794a = linkInRoomAudioWidget;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        LinkInRoomAudioWidget linkInRoomAudioWidget = this.f17794a;
        TTLiveSDKContext.getHostService().mo10318k();
        linkInRoomAudioWidget.startActivity(null);
        dialogInterface.dismiss();
    }
}
