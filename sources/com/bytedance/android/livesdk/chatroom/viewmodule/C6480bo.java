package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.view.View;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.p307c.C5038d.C5042b;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.bo */
final /* synthetic */ class C6480bo implements C5042b {

    /* renamed from: a */
    private final LinkCrossRoomWidget f17780a;

    C6480bo(LinkCrossRoomWidget linkCrossRoomWidget) {
        this.f17780a = linkCrossRoomWidget;
    }

    /* renamed from: a */
    public final void mo10903a(View view, Object obj) {
        LinkCrossRoomWidget linkCrossRoomWidget = this.f17780a;
        TextView textView = (TextView) view;
        textView.setText(((User) obj).getNickName());
        if (linkCrossRoomWidget.f17129b) {
            textView.setVisibility(0);
        }
    }
}
