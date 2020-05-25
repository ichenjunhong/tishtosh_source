package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.android.live.core.p225d.C3837e;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.chatroom.interact.C5278al;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import java.util.HashMap;
import java.util.Map;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.bh */
final /* synthetic */ class C6473bh implements C1710e {

    /* renamed from: a */
    private final LinkCrossRoomWidget f17773a;

    C6473bh(LinkCrossRoomWidget linkCrossRoomWidget) {
        this.f17773a = linkCrossRoomWidget;
    }

    public final void accept(Object obj) {
        LinkCrossRoomWidget linkCrossRoomWidget = this.f17773a;
        Integer num = (Integer) obj;
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = linkCrossRoomWidget.f17132e;
        String idStr = linkCrossRoomWidget.f17130c.getIdStr();
        HashMap hashMap = new HashMap();
        hashMap.put("channel_id", String.valueOf(linkCrossRoomDataHolder.f12612c));
        hashMap.put("match_type", Integer.valueOf(linkCrossRoomDataHolder.f12627r));
        hashMap.put("room_id", String.valueOf(idStr));
        hashMap.put("guest_id", Long.valueOf(linkCrossRoomDataHolder.f12614e));
        hashMap.put("vendor", ((Integer) LiveConfigSettingKeys.INTERACT_VENDOR.mo9431a()).intValue() == 0 ? Integer.valueOf(linkCrossRoomDataHolder.f12622m) : LiveConfigSettingKeys.INTERACT_VENDOR.mo9431a());
        hashMap.put("startTimeMs", Long.valueOf(linkCrossRoomDataHolder.f12621l));
        C3837e.m9743a(C5278al.f14124b, 1, (Map<String, Object>) hashMap);
        C3837e.m9743a(C5278al.f14123a, 1, (Map<String, Object>) hashMap);
    }
}
