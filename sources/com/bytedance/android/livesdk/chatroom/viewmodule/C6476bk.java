package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.bk */
final /* synthetic */ class C6476bk implements OnClickListener {

    /* renamed from: a */
    private final LinkCrossRoomWidget f17776a;

    C6476bk(LinkCrossRoomWidget linkCrossRoomWidget) {
        this.f17776a = linkCrossRoomWidget;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        LinkCrossRoomWidget linkCrossRoomWidget = this.f17776a;
        if (linkCrossRoomWidget.isViewValid()) {
            linkCrossRoomWidget.f17131d.mo11348d();
            dialogInterface.dismiss();
        }
    }
}
