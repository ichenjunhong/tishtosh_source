package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.bytedance.android.livesdk.p279af.C4563ad;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.ba */
final /* synthetic */ class C6466ba implements OnClickListener {

    /* renamed from: a */
    private final LinkControlWidget f17767a;

    C6466ba(LinkControlWidget linkControlWidget) {
        this.f17767a = linkControlWidget;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        LinkControlWidget linkControlWidget = this.f17767a;
        dialogInterface.dismiss();
        if (linkControlWidget.isViewValid()) {
            linkControlWidget.f17092e.mo11315a(0);
            linkControlWidget.mo12415j();
            C4563ad.m10956a(linkControlWidget.f17093f, "click_connection_button", "anchor_connection", true);
        }
    }
}
