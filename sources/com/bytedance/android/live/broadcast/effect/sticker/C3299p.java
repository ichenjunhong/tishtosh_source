package com.bytedance.android.live.broadcast.effect.sticker;

import com.bytedance.android.live.core.p225d.C3836d;
import com.bytedance.android.live.core.p225d.C3837e;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.HashMap;
import java.util.Map;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.live.broadcast.effect.sticker.p */
final /* synthetic */ class C3299p implements C1710e {

    /* renamed from: a */
    private final long f9494a;

    /* renamed from: b */
    private final Room f9495b;

    C3299p(long j, Room room) {
        this.f9494a = j;
        this.f9495b = room;
    }

    public final void accept(Object obj) {
        long j = this.f9494a;
        Room room = this.f9495b;
        Throwable th = (Throwable) obj;
        HashMap hashMap = new HashMap();
        hashMap.put("room_id", Long.valueOf(j));
        if (room != null) {
            hashMap.put("anchor_id", Long.valueOf(room.getOwnerUserId()));
            hashMap.put("live_type", Integer.valueOf(room.getOrientation()));
        }
        C3837e.m9743a(C3836d.m9734a("service_sticker_report_status"), 1, (Map<String, Object>) hashMap);
    }
}
