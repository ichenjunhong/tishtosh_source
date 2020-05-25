package com.bytedance.android.livesdk.p399o.p401b;

import com.bytedance.android.livesdk.p399o.p402c.C8055f;
import com.bytedance.common.utility.C9431p;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.o.b.h */
public final class C8039h extends C8032a<C8055f> {
    /* renamed from: a */
    public final /* synthetic */ void mo14196a(Map map, Object obj) {
        C8055f fVar = (C8055f) obj;
        if (fVar != null) {
            if (fVar.f21997a > 0) {
                map.put("channel_id", String.valueOf(fVar.f21997a));
            }
            if (fVar.f21998b > 0) {
                map.put("right_user_id", String.valueOf(fVar.f21998b));
            }
            map.put("is_oncemore", String.valueOf(fVar.f22005i));
            if (fVar.f21999c > 0) {
                map.put("pk_time", String.valueOf(fVar.f21999c));
                map.put("connection_type", fVar.f22000d);
                map.put("match_type", fVar.f22001e);
                if (fVar.f22002f > 0) {
                    map.put("pk_id", String.valueOf(fVar.f22002f));
                }
                if (C9431p.m18664a(fVar.f22003g)) {
                    map.put("title", fVar.f22003g);
                }
                if (fVar.f22004h > 0) {
                    map.put("backdoor_time", String.valueOf(fVar.f22004h));
                }
            } else {
                map.put("connection_type", fVar.f22000d);
            }
        }
    }
}
