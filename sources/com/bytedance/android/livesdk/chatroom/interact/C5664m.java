package com.bytedance.android.livesdk.chatroom.interact;

import com.bytedance.android.live.base.model.user.User;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.m */
final /* synthetic */ class C5664m implements C1710e {

    /* renamed from: a */
    private final LinkInRoomVideoAnchorWidget f14847a;

    /* renamed from: b */
    private final long f14848b;

    C5664m(LinkInRoomVideoAnchorWidget linkInRoomVideoAnchorWidget, long j) {
        this.f14847a = linkInRoomVideoAnchorWidget;
        this.f14848b = j;
    }

    public final void accept(Object obj) {
        LinkInRoomVideoAnchorWidget linkInRoomVideoAnchorWidget = this.f14847a;
        long j = this.f14848b;
        Long l = (Long) obj;
        if (linkInRoomVideoAnchorWidget.f13988b != null) {
            User user = new User();
            user.setId(j);
            linkInRoomVideoAnchorWidget.f13988b.mo11416b(user.getId(), user.getSecUid());
            linkInRoomVideoAnchorWidget.f13993g.remove(Long.valueOf(j));
        }
    }
}
