package com.bytedance.android.livesdk.gift.dialog.view;

import android.arch.lifecycle.C0199s;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.user.C4282a;
import com.bytedance.android.livesdk.chatroom.event.C5171aq;
import com.bytedance.android.livesdk.gift.dialog.viewmodel.C7290b;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.HashMap;

/* renamed from: com.bytedance.android.livesdk.gift.dialog.view.a */
final /* synthetic */ class C7259a implements C0199s {

    /* renamed from: a */
    private final LiveBaseGiftPanelWidget f19747a;

    C7259a(LiveBaseGiftPanelWidget liveBaseGiftPanelWidget) {
        this.f19747a = liveBaseGiftPanelWidget;
    }

    public final void onChanged(Object obj) {
        LiveBaseGiftPanelWidget liveBaseGiftPanelWidget = this.f19747a;
        C7290b bVar = (C7290b) obj;
        if (bVar != null) {
            boolean z = bVar.f19861k;
            boolean z2 = bVar.f19851a == 2;
            liveBaseGiftPanelWidget.f19680c = z;
            if (z) {
                if (z2) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("user_id", String.valueOf(((C4282a) C4116c.m10249a(C4282a.class)).user().mo14529b()));
                    C8049c.m15979a().mo14202a("livesdk_doodling_gift_canvas_show", hashMap, Room.class, new C8059j());
                }
                liveBaseGiftPanelWidget.f19679b.setVisibility(0);
                C4495a.m10823a().mo10301a((Object) new C5171aq(true));
                return;
            }
            liveBaseGiftPanelWidget.f19679b.setVisibility(8);
            C4495a.m10823a().mo10301a((Object) new C5171aq(false));
        }
    }
}
