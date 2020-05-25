package com.bytedance.android.livesdk.chatroom.widget;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.p272ad.C4525b;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.C9432q;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.widget.q */
final /* synthetic */ class C6691q implements C1710e {

    /* renamed from: a */
    private final LiveRoomUserInfoWidget f18262a;

    C6691q(LiveRoomUserInfoWidget liveRoomUserInfoWidget) {
        this.f18262a = liveRoomUserInfoWidget;
    }

    public final void accept(Object obj) {
        LiveRoomUserInfoWidget liveRoomUserInfoWidget = this.f18262a;
        User user = (User) obj;
        if (liveRoomUserInfoWidget.isViewValid()) {
            User from = User.from(user);
            ((Room) liveRoomUserInfoWidget.dataCenter.get("data_room")).getOwner().setFollowInfo(from.getFollowInfo());
            liveRoomUserInfoWidget.dataCenter.lambda$put$1$DataCenter("data_is_followed", Boolean.valueOf(from.isFollowing()));
            if (from.isFollowing()) {
                liveRoomUserInfoWidget.f18084h.setVisibility(8);
                if (liveRoomUserInfoWidget.f18091o) {
                    liveRoomUserInfoWidget.mo12738a((int) C9432q.m18687b(liveRoomUserInfoWidget.getContext(), 6.0f));
                    liveRoomUserInfoWidget.f18085i.setVisibility(0);
                    if (liveRoomUserInfoWidget.f18092p && from.getFansClub() != null && !((Boolean) C4525b.f12369al.mo10345a()).booleanValue()) {
                        liveRoomUserInfoWidget.contentView.postDelayed(new C6647ae(liveRoomUserInfoWidget), 1000);
                    }
                } else {
                    liveRoomUserInfoWidget.mo12738a((int) C9432q.m18687b(liveRoomUserInfoWidget.getContext(), 12.0f));
                }
            } else if (liveRoomUserInfoWidget.f18090n) {
                liveRoomUserInfoWidget.mo12737a();
            } else {
                liveRoomUserInfoWidget.mo12738a((int) C9432q.m18687b(liveRoomUserInfoWidget.getContext(), 6.0f));
                liveRoomUserInfoWidget.mo12741b(0);
                liveRoomUserInfoWidget.f18086j.setVisibility(8);
                liveRoomUserInfoWidget.f18087k.setVisibility(0);
                liveRoomUserInfoWidget.f18084h.setVisibility(0);
                liveRoomUserInfoWidget.f18085i.setVisibility(8);
            }
        }
    }
}
