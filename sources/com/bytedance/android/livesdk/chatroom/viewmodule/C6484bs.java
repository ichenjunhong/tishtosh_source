package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.view.View;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.chatroom.p307c.C5038d.C5042b;
import com.bytedance.android.livesdk.chatroom.p310f.C5213c;
import com.bytedance.android.livesdk.p279af.C4620v;
import com.bytedance.common.utility.C9414h;
import com.facebook.imagepipeline.p975o.C14234d;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.bs */
final /* synthetic */ class C6484bs implements C5042b {

    /* renamed from: a */
    private final LinkCrossRoomWidget f17784a;

    C6484bs(LinkCrossRoomWidget linkCrossRoomWidget) {
        this.f17784a = linkCrossRoomWidget;
    }

    /* renamed from: a */
    public final void mo10903a(View view, Object obj) {
        LinkCrossRoomWidget linkCrossRoomWidget = this.f17784a;
        HSImageView hSImageView = (HSImageView) view;
        User user = (User) obj;
        if (C9414h.m18630a(linkCrossRoomWidget.f17130c.getCover().getUrls())) {
            C5213c.m11821a(hSImageView, user.getAvatarLarge(), (C14234d) new C4620v(8));
        } else {
            C5213c.m11821a(hSImageView, linkCrossRoomWidget.f17130c.getCover(), (C14234d) new C4620v(8));
        }
    }
}
