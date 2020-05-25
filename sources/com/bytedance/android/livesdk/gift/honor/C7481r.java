package com.bytedance.android.livesdk.gift.honor;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.user.C4282a;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdkapi.C8830k;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.HashMap;

/* renamed from: com.bytedance.android.livesdk.gift.honor.r */
final /* synthetic */ class C7481r implements OnClickListener {

    /* renamed from: a */
    private final LiveGiftHonorLevelWidget f20496a;

    C7481r(LiveGiftHonorLevelWidget liveGiftHonorLevelWidget) {
        this.f20496a = liveGiftHonorLevelWidget;
    }

    public final void onClick(View view) {
        LiveGiftHonorLevelWidget liveGiftHonorLevelWidget = this.f20496a;
        Room room = (Room) liveGiftHonorLevelWidget.dataCenter.get("data_room", null);
        if (room != null) {
            Bundle bundle = new Bundle();
            String valueOf = ((C4282a) C4116c.m10249a(C4282a.class)).user() != null ? String.valueOf(((C4282a) C4116c.m10249a(C4282a.class)).user().mo14529b()) : "";
            if (room != null) {
                bundle.putString("com.ss.android.ugc.live.intent.extra.ROOM_ID", String.valueOf(room.getId()));
                bundle.putString("com.ss.android.ugc.live.intent.extra.REQUEST_ID", room.getRequestId());
                bundle.putString("com.ss.android.ugc.live.intent.extra.LOG_PB", room.getLog_pb());
                bundle.putString("user_id", valueOf);
                bundle.putString("request_page", "privilege_click");
            }
            HashMap hashMap = new HashMap();
            hashMap.put("user_id", valueOf);
            C8049c.m15979a().mo14202a("privilege_click", hashMap, new C8059j(), Room.class);
            if (liveGiftHonorLevelWidget.f20442f != null) {
                C8830k.m17331e().mo13047i().handleSchema(liveGiftHonorLevelWidget.context, liveGiftHonorLevelWidget.f20442f.f24082b, bundle);
            }
        }
    }
}
