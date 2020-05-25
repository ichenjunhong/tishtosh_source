package com.bytedance.android.livesdk.p399o.p401b;

import com.bytedance.android.livesdk.p399o.p402c.C8058i;
import com.bytedance.android.livesdk.p399o.p402c.C8062m;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.o.b.o */
public final class C8046o extends C8032a<C8062m> {
    /* renamed from: a */
    public final /* synthetic */ void mo14196a(Map map, Object obj) {
        C8062m mVar = (C8062m) obj;
        super.mo14196a(map, mVar);
        if (mVar != null) {
            map.put("gift_type", mVar.f22029a);
            map.put("gift_id", mVar.f22030b);
            map.put("money", String.valueOf(mVar.f22031c));
            if (C8058i.f22019b == mVar.f22032d) {
                map.put("guest_id", String.valueOf(mVar.f22033e));
            }
        }
    }
}
