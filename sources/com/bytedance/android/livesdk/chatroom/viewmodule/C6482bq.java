package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.view.View;
import android.widget.ImageView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.p307c.C5038d.C5042b;
import com.bytedance.android.livesdk.chatroom.p310f.C5213c;
import com.bytedance.android.livesdk.widget.VHeadView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.bq */
final /* synthetic */ class C6482bq implements C5042b {

    /* renamed from: a */
    private final LinkCrossRoomWidget f17782a;

    C6482bq(LinkCrossRoomWidget linkCrossRoomWidget) {
        this.f17782a = linkCrossRoomWidget;
    }

    /* renamed from: a */
    public final void mo10903a(View view, Object obj) {
        LinkCrossRoomWidget linkCrossRoomWidget = this.f17782a;
        VHeadView vHeadView = (VHeadView) view;
        C5213c.m11815a((ImageView) vHeadView, ((User) obj).getAvatarThumb(), (int) R.drawable.bt6);
        if (linkCrossRoomWidget.f17129b) {
            vHeadView.setVisibility(0);
        }
    }
}
