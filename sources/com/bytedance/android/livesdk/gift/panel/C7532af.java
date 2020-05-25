package com.bytedance.android.livesdk.gift.panel;

import android.os.SystemClock;
import com.bytedance.android.live.core.p225d.C3837e;
import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.room.C4193l;
import com.bytedance.android.livesdk.gift.C7647s;
import com.bytedance.android.livesdk.gift.model.C7515n;
import com.bytedance.android.livesdk.gift.panel.C7547n.C7549a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.HashMap;
import java.util.Map;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.gift.panel.af */
final /* synthetic */ class C7532af implements C1710e {

    /* renamed from: a */
    private final C7547n f20688a;

    /* renamed from: b */
    private final long f20689b;

    /* renamed from: c */
    private final long f20690c;

    C7532af(C7547n nVar, long j, long j2) {
        this.f20688a = nVar;
        this.f20689b = j;
        this.f20690c = j2;
    }

    public final void accept(Object obj) {
        C7547n nVar = this.f20688a;
        long j = this.f20689b;
        long j2 = this.f20690c;
        C4177d dVar = (C4177d) obj;
        if (nVar.mo8518c() != null) {
            ((C7549a) nVar.mo8518c()).mo13930a((C7515n) dVar.data);
        }
        long id = nVar.f20706a.getId();
        long uptimeMillis = SystemClock.uptimeMillis() - j2;
        HashMap hashMap = new HashMap();
        hashMap.put("room_id", Long.valueOf(id));
        hashMap.put("gift_id", Long.valueOf(j));
        Room currentRoom = ((C4193l) C4116c.m10249a(C4193l.class)).getCurrentRoom();
        if (currentRoom != null) {
            hashMap.put("anchor_id", Long.valueOf(currentRoom.getOwnerUserId()));
        }
        C3837e.m9741a(C7647s.m15643a("ttlive_xg_gift_send"), 0, uptimeMillis, (Map<String, Object>) hashMap);
    }
}
