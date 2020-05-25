package com.bytedance.android.livesdk.chatroom.interact.p319h;

import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.livesdk.chatroom.model.p323a.C5698g;
import com.bytedance.android.livesdk.message.model.C7829bd;
import com.bytedance.android.livesdk.p399o.C8064d;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import java.util.HashMap;
import java.util.Map;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.h.cc */
final /* synthetic */ class C5446cc implements C1710e {

    /* renamed from: a */
    private final int f14436a;

    /* renamed from: b */
    private final C7829bd f14437b;

    C5446cc(int i, C7829bd bdVar) {
        this.f14436a = i;
        this.f14437b = bdVar;
    }

    public final void accept(Object obj) {
        int i = this.f14436a;
        C7829bd bdVar = this.f14437b;
        C4177d dVar = (C4177d) obj;
        HashMap hashMap = new HashMap();
        hashMap.put("event_name", "REPLY_SUCCEED");
        hashMap.put(C42311c.f106865i, Integer.valueOf(i));
        hashMap.put("accesskey", ((C5698g) dVar.data).f14969a);
        hashMap.put("link_mic_id", Integer.valueOf(((C5698g) dVar.data).f14970b));
        hashMap.put("confluence_type", Integer.valueOf(((C5698g) dVar.data).f14972d));
        hashMap.put("channel_id", Long.valueOf(bdVar.f21572j));
        C8064d.m16005b().mo9197a("ttlive_pk", (Map<String, ?>) hashMap);
    }
}
