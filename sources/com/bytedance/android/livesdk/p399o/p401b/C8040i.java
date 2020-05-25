package com.bytedance.android.livesdk.p399o.p401b;

import com.bytedance.android.livesdk.p399o.p402c.C8056g;
import com.bytedance.common.utility.C9431p;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.o.b.i */
public final class C8040i extends C8032a<C8056g> {
    /* renamed from: a */
    public final /* synthetic */ void mo14196a(Map map, Object obj) {
        C8056g gVar = (C8056g) obj;
        super.mo14196a(map, gVar);
        if (gVar != null) {
            if (gVar.f22012g > 0) {
                map.put("channel_id", String.valueOf(gVar.f22012g));
            }
            if (gVar.f22007b > 0) {
                map.put("invitee_id", String.valueOf(gVar.f22007b));
            }
            if (gVar.f22006a > 0) {
                map.put("inviter_id", String.valueOf(gVar.f22006a));
            }
            if (!C9431p.m18664a(gVar.f22016k)) {
                map.put("match_type", gVar.f22016k);
            }
            if (!C9431p.m18664a(gVar.f22008c)) {
                map.put("end_type", gVar.f22008c);
            }
            if (!C9431p.m18664a(gVar.f22009d)) {
                map.put("connection_time", gVar.f22009d);
            }
            if (!C9431p.m18664a(gVar.f22010e)) {
                map.put("invitee_list", gVar.f22010e);
            }
            if (!C9431p.m18664a(gVar.f22011f)) {
                map.put("is_rematch", gVar.f22011f);
            }
            map.put("pk_time", String.valueOf(gVar.f22015j));
            if (!C9431p.m18664a(gVar.f22013h)) {
                map.put("connection_type", gVar.f22013h);
                if (gVar.f22013h.equals("pk")) {
                    if (!C9431p.m18664a(gVar.f22014i)) {
                        map.put("title", gVar.f22014i);
                    }
                    if (gVar.f22015j > 0) {
                        map.put("pk_time", String.valueOf(gVar.f22015j));
                    }
                }
            }
        }
    }
}
