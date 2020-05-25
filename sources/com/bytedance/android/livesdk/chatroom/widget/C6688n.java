package com.bytedance.android.livesdk.chatroom.widget;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdk.rank.C8221n;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import java.util.HashMap;

/* renamed from: com.bytedance.android.livesdk.chatroom.widget.n */
final /* synthetic */ class C6688n implements OnClickListener {

    /* renamed from: a */
    private final LiveRoomOnlineUserWidget f18258a;

    C6688n(LiveRoomOnlineUserWidget liveRoomOnlineUserWidget) {
        this.f18258a = liveRoomOnlineUserWidget;
    }

    public final void onClick(View view) {
        LiveRoomOnlineUserWidget liveRoomOnlineUserWidget = this.f18258a;
        if (liveRoomOnlineUserWidget.f18018b != null) {
            liveRoomOnlineUserWidget.f18018b.dismiss();
        }
        liveRoomOnlineUserWidget.f18018b = C8221n.m16298a(liveRoomOnlineUserWidget.f18022f, liveRoomOnlineUserWidget.f18017a, liveRoomOnlineUserWidget.f18021e, liveRoomOnlineUserWidget.f18019c, liveRoomOnlineUserWidget.f18020d, liveRoomOnlineUserWidget.dataCenter);
        liveRoomOnlineUserWidget.f18018b.f22457d = true;
        liveRoomOnlineUserWidget.f18018b.show(liveRoomOnlineUserWidget.f18022f.getSupportFragmentManager(), "dialog2");
        HashMap hashMap = new HashMap();
        hashMap.put("event_belong", CustomActionPushReceiver.f104061f);
        hashMap.put("event_type", "click");
        hashMap.put("event_page", "live_detail");
        hashMap.put("event_module", "top_tab");
        C8049c.m15979a().mo14203a("audience_list_click", new C8059j().mo14214b(CustomActionPushReceiver.f104061f).mo14218f("click").mo14213a("live_detail").mo14215c("top_tab"));
    }
}
