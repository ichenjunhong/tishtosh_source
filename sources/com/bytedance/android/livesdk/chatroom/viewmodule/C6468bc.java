package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdkapi.depend.model.live.Room;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.bc */
final /* synthetic */ class C6468bc implements OnClickListener {

    /* renamed from: a */
    private final LinkControlWidget f17769a;

    C6468bc(LinkControlWidget linkControlWidget) {
        this.f17769a = linkControlWidget;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        LinkControlWidget linkControlWidget = this.f17769a;
        C8049c.m15979a().mo14202a("guest_connection_open", null, Room.class);
        dialogInterface.dismiss();
        if (linkControlWidget.isViewValid()) {
            linkControlWidget.f17092e.mo11315a(0);
            linkControlWidget.mo12415j();
        }
    }
}
