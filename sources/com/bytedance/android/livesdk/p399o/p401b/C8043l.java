package com.bytedance.android.livesdk.p399o.p401b;

import com.bytedance.android.livesdk.p399o.p402c.C8060k;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.o.b.l */
public final class C8043l extends C8032a<C8060k> {
    /* renamed from: a */
    public final /* synthetic */ void mo14196a(Map map, Object obj) {
        C8060k kVar = (C8060k) obj;
        super.mo14196a(map, kVar);
        if (kVar != null && map.containsKey("_staging_flag")) {
            map.remove("_staging_flag");
        }
    }
}
