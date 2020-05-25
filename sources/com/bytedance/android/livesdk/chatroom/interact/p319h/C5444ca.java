package com.bytedance.android.livesdk.chatroom.interact.p319h;

import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.livesdk.chatroom.model.p323a.C5698g;
import com.bytedance.android.livesdk.message.model.C7829bd;
import com.bytedance.android.livesdk.p399o.C8064d;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import java.util.HashMap;
import java.util.Map;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.h.ca */
final /* synthetic */ class C5444ca implements C1710e {

    /* renamed from: a */
    private final C7829bd f14434a;

    C5444ca(C7829bd bdVar) {
        this.f14434a = bdVar;
    }

    public final void accept(Object obj) {
        C7829bd bdVar = this.f14434a;
        C4177d dVar = (C4177d) obj;
        HashMap hashMap = new HashMap();
        hashMap.put("event_name", "REPLY_SUCCEED");
        hashMap.put(C42311c.f106865i, Integer.valueOf(6));
        hashMap.put("accesskey", ((C5698g) dVar.data).f14969a);
        hashMap.put("link_mic_id", Integer.valueOf(((C5698g) dVar.data).f14970b));
        hashMap.put("channel_id", Long.valueOf(bdVar.f21572j));
        C8064d.m16005b().mo9197a("ttlive_pk", (Map<String, ?>) hashMap);
    }
}
