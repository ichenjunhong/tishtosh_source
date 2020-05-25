package com.bytedance.android.livesdk.gift.dialog.view;

import android.arch.lifecycle.C0199s;
import android.text.TextUtils;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.user.C4282a;
import com.bytedance.android.livesdk.gift.dialog.viewmodel.C7290b;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.C9414h;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.gift.dialog.view.d */
final /* synthetic */ class C7262d implements C0199s {

    /* renamed from: a */
    private final LiveGiftBottomWidget f19750a;

    C7262d(LiveGiftBottomWidget liveGiftBottomWidget) {
        this.f19750a = liveGiftBottomWidget;
    }

    public final void onChanged(Object obj) {
        LiveGiftBottomWidget liveGiftBottomWidget = this.f19750a;
        C7290b bVar = (C7290b) obj;
        if (bVar != null) {
            if (bVar.f19851a == 1) {
                List<GiftPage> list = bVar.f19853c;
                GiftPage a = bVar.mo13540a();
                if (a != null && !TextUtils.isEmpty(a.eventName)) {
                    String str = a.eventName;
                    Room room = (Room) liveGiftBottomWidget.dataCenter.get("data_room", null);
                    String valueOf = ((C4282a) C4116c.m10249a(C4282a.class)).user() != null ? String.valueOf(((C4282a) C4116c.m10249a(C4282a.class)).user().mo14529b()) : "";
                    HashMap hashMap = new HashMap();
                    if (room != null) {
                        hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
                        hashMap.put("room_id", String.valueOf(room.getId()));
                        hashMap.put("orientation", String.valueOf(room.getOrientation()));
                    }
                    hashMap.put("user_id", valueOf);
                    C8049c.m15979a().mo14202a(str, hashMap, new C8059j(), Room.class);
                }
                liveGiftBottomWidget.mo13482a(list, a);
                liveGiftBottomWidget.f19687c.notifyDataSetChanged();
                liveGiftBottomWidget.mo13481a(bVar);
            }
            liveGiftBottomWidget.mo13481a(bVar);
            liveGiftBottomWidget.mo13483a(!C9414h.m18630a(bVar.f19854d));
        }
    }
}
