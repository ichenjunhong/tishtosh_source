package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.message.model.C7865cf;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.dh */
final /* synthetic */ class C6527dh implements OnClickListener {

    /* renamed from: a */
    private final LiveRoomNotifyWidget f17840a;

    /* renamed from: b */
    private final String f17841b;

    /* renamed from: c */
    private final User f17842c;

    /* renamed from: d */
    private final long f17843d;

    /* renamed from: e */
    private final int f17844e;

    /* renamed from: f */
    private final C7865cf f17845f;

    C6527dh(LiveRoomNotifyWidget liveRoomNotifyWidget, String str, User user, long j, int i, C7865cf cfVar) {
        this.f17840a = liveRoomNotifyWidget;
        this.f17841b = str;
        this.f17842c = user;
        this.f17843d = j;
        this.f17844e = i;
        this.f17845f = cfVar;
    }

    public final void onClick(View view) {
        LiveRoomNotifyWidget liveRoomNotifyWidget = this.f17840a;
        String str = this.f17841b;
        User user = this.f17842c;
        long j = this.f17843d;
        int i = this.f17844e;
        C7865cf cfVar = this.f17845f;
        liveRoomNotifyWidget.mo12447a(str, user, j, i);
        liveRoomNotifyWidget.mo12446a(cfVar, "click");
    }
}
