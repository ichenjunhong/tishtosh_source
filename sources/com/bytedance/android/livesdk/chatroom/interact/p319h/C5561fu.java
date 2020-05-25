package com.bytedance.android.livesdk.chatroom.interact.p319h;

import android.os.SystemClock;
import com.bytedance.android.live.C2942b;
import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder.C4632d;
import com.bytedance.android.livesdk.chatroom.interact.C5278al;
import com.bytedance.android.livesdkapi.depend.model.live.C8722v;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.h.fu */
final /* synthetic */ class C5561fu implements C1710e {

    /* renamed from: a */
    private final C5556fq f14623a;

    /* renamed from: b */
    private final long f14624b;

    /* renamed from: c */
    private final boolean f14625c;

    C5561fu(C5556fq fqVar, long j, boolean z) {
        this.f14623a = fqVar;
        this.f14624b = j;
        this.f14625c = z;
    }

    public final void accept(Object obj) {
        C5556fq fqVar = this.f14623a;
        long j = this.f14624b;
        boolean z = this.f14625c;
        C4177d dVar = (C4177d) obj;
        C5278al.m11941c(SystemClock.uptimeMillis() - j);
        StringBuilder sb = new StringBuilder("battle_states");
        sb.append(C2942b.m8369a().mo34889b(dVar));
        fqVar.f14614c.lambda$put$1$DataCenter("cmd_log_link", sb.toString());
        if (dVar.statusCode == 0) {
            fqVar.f14614c.mo10410a((C8722v) dVar.data, fqVar.f14612a).lambda$put$1$DataCenter("data_pk_current_room_interact_info", dVar);
            C8722v vVar = (C8722v) dVar.data;
            fqVar.mo11460a(vVar.f23958d);
            if (vVar.f23959e == null || vVar.f23959e.f23813b == null || !vVar.f23959e.f23813b.f23820g || vVar.f23959e.f23813b.f23821h == 0) {
                C4632d dVar2 = (C4632d) fqVar.f14614c.get("data_pk_state");
                if (!z) {
                    fqVar.mo11455a(dVar.extra.now);
                } else if (C4632d.PENAL.compareTo(dVar2) > 0) {
                    fqVar.mo11464b((long) (fqVar.f14614c.f12629t * 1000));
                }
                return;
            }
            fqVar.mo11464b((long) ((int) (((long) (fqVar.f14614c.f12629t * 1000)) - (dVar.extra.now - vVar.f23959e.f23813b.f23815b))));
        } else if (z) {
            fqVar.mo11464b((long) (fqVar.f14614c.f12629t * 1000));
        } else {
            fqVar.mo11455a(dVar.extra.now);
        }
    }
}
