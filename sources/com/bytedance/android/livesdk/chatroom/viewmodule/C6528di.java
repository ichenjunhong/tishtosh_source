package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.message.model.C7865cf;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.di */
final /* synthetic */ class C6528di implements OnClickListener {

    /* renamed from: a */
    private final LiveRoomNotifyWidget f17846a;

    /* renamed from: b */
    private final String f17847b;

    /* renamed from: c */
    private final User f17848c;

    /* renamed from: d */
    private final long f17849d;

    /* renamed from: e */
    private final int f17850e;

    /* renamed from: f */
    private final C7865cf f17851f;

    C6528di(LiveRoomNotifyWidget liveRoomNotifyWidget, String str, User user, long j, int i, C7865cf cfVar) {
        this.f17846a = liveRoomNotifyWidget;
        this.f17847b = str;
        this.f17848c = user;
        this.f17849d = j;
        this.f17850e = i;
        this.f17851f = cfVar;
    }

    public final void onClick(View view) {
        LiveRoomNotifyWidget liveRoomNotifyWidget = this.f17846a;
        String str = this.f17847b;
        User user = this.f17848c;
        long j = this.f17849d;
        int i = this.f17850e;
        C7865cf cfVar = this.f17851f;
        liveRoomNotifyWidget.mo12447a(str, user, j, i);
        liveRoomNotifyWidget.mo12446a(cfVar, "click");
    }
}
