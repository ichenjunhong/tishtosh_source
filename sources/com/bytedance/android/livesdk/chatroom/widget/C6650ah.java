package com.bytedance.android.livesdk.chatroom.widget;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.android.livesdk.chatroom.event.UserProfileEvent;
import com.bytedance.android.livesdk.p269aa.C4495a;

/* renamed from: com.bytedance.android.livesdk.chatroom.widget.ah */
final /* synthetic */ class C6650ah implements OnClickListener {

    /* renamed from: a */
    private final LiveRoomUserInfoWidget f18156a;

    C6650ah(LiveRoomUserInfoWidget liveRoomUserInfoWidget) {
        this.f18156a = liveRoomUserInfoWidget;
    }

    public final void onClick(View view) {
        C4495a.m10823a().mo10301a((Object) new UserProfileEvent(this.f18156a.f18080d.getOwner().getId()));
    }
}
