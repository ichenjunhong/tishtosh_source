package com.bytedance.android.livesdk.chatroom.widget;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.setting.C4085g;
import com.bytedance.android.live.p221c.C3807a;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.rank.p410c.C8142b;
import com.bytedance.android.livesdk.user.C8335g;
import com.bytedance.android.livesdk.user.C8337i;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import p064c.p065a.C1674ab;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.widget.an */
final /* synthetic */ class C6656an implements C1710e {

    /* renamed from: a */
    private final LiveRoomWatchUserWidget f18162a;

    C6656an(LiveRoomWatchUserWidget liveRoomWatchUserWidget) {
        this.f18162a = liveRoomWatchUserWidget;
    }

    public final void accept(Object obj) {
        LiveRoomWatchUserWidget liveRoomWatchUserWidget = this.f18162a;
        C8142b bVar = (C8142b) obj;
        if (liveRoomWatchUserWidget.dataCenter != null) {
            boolean z = true;
            if (!TTLiveSDKContext.getHostService().mo10315h().mo14532c()) {
                TTLiveSDKContext.getHostService().mo10315h().mo14516a(liveRoomWatchUserWidget.context, C8337i.m16520a().mo14540a(C4085g.m10200a()).mo14542b(C4085g.m10201b()).mo14544d("live_detail").mo14543c(CustomActionPushReceiver.f104061f).mo14539a(1).mo14541a()).mo6314a((C1674ab<? super T>) new C8335g<Object>());
                return;
            }
            User user = (User) liveRoomWatchUserWidget.dataCenter.get("data_user_in_room");
            if (!(liveRoomWatchUserWidget.f18106b == null || user == null)) {
                if (user.getFansClub() == null || user.getFansClub().getData() == null || user.getFansClub().getData().anchorId != liveRoomWatchUserWidget.f18106b.getOwnerUserId()) {
                    z = false;
                }
                ((C3807a) C4116c.m10249a(C3807a.class)).showFansEntranceDialog(liveRoomWatchUserWidget.getContext(), liveRoomWatchUserWidget.f18106b, z, liveRoomWatchUserWidget.f18109e);
            }
        }
    }
}
