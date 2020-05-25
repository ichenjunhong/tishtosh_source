package com.bytedance.android.livesdk.gift.panel;

import com.bytedance.android.live.core.p225d.C3837e;
import com.bytedance.android.live.p180b.p181a.C2944a;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.room.C4193l;
import com.bytedance.android.livesdk.gift.C7647s;
import com.bytedance.android.livesdk.gift.panel.C7547n.C7549a;
import com.bytedance.android.livesdk.p399o.p400a.C8029a;
import com.bytedance.android.livesdk.p399o.p400a.C8030b;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.HashMap;
import java.util.Map;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.gift.panel.q */
final /* synthetic */ class C7552q implements C1710e {

    /* renamed from: a */
    private final C7547n f20721a;

    /* renamed from: b */
    private final long f20722b;

    C7552q(C7547n nVar, long j) {
        this.f20721a = nVar;
        this.f20722b = j;
    }

    public final void accept(Object obj) {
        C7547n nVar = this.f20721a;
        long j = this.f20722b;
        Throwable th = (Throwable) obj;
        nVar.f20707b = false;
        if (nVar.mo8518c() != null) {
            ((C7549a) nVar.mo8518c()).mo13934c((Exception) th);
        }
        long id = nVar.f20706a.getId();
        HashMap hashMap = new HashMap();
        hashMap.put("room_id", Long.valueOf(id));
        hashMap.put("gift_id", Long.valueOf(j));
        Room currentRoom = ((C4193l) C4116c.m10249a(C4193l.class)).getCurrentRoom();
        if (currentRoom != null) {
            hashMap.put("anchor_id", Long.valueOf(currentRoom.getOwnerUserId()));
        }
        if (th instanceof C2944a) {
            hashMap.put("error_code", Integer.valueOf(((C2944a) th).getErrorCode()));
        } else {
            hashMap.put("error_code", Integer.valueOf(0));
        }
        hashMap.put("error_msg", th.getMessage());
        C3837e.m9741a(C7647s.m15643a("ttlive_xg_gift_send"), 1, 0, (Map<String, Object>) hashMap);
        C3837e.m9743a(C7647s.m15652b("ttlive_xg_gift_send"), 1, (Map<String, Object>) hashMap);
        C8029a.m15933a().mo14189a(C8030b.Gift.info, "ttlive_xg_gift_send", 1, (Map) hashMap);
    }
}
