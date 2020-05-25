package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.view.View;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.chatroom.p307c.C5038d.C5043c;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.br */
final /* synthetic */ class C6483br implements C5043c {

    /* renamed from: a */
    private final LinkCrossRoomWidget f17783a;

    C6483br(LinkCrossRoomWidget linkCrossRoomWidget) {
        this.f17783a = linkCrossRoomWidget;
    }

    /* renamed from: a */
    public final void mo10904a(View view) {
        HSImageView hSImageView = (HSImageView) view;
        if (!this.f17783a.f17129b) {
            hSImageView.setVisibility(8);
        }
    }
}
