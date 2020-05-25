package com.bytedance.android.livesdk.p399o.p401b;

import android.text.TextUtils;
import com.bytedance.android.livesdk.p399o.p402c.C8052c;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.o.b.d */
public final class C8035d extends C8032a<C8052c> {
    /* renamed from: a */
    public final /* synthetic */ void mo14196a(Map map, Object obj) {
        C8052c cVar = (C8052c) obj;
        super.mo14196a(map, cVar);
        if (cVar != null) {
            if (!TextUtils.isEmpty(cVar.f21990a)) {
                map.put("request_page", cVar.f21990a);
            }
            if (cVar.f21991b > 0) {
                map.put("to_user_id", String.valueOf(cVar.f21991b));
            }
            if (!TextUtils.isEmpty(cVar.f21992c)) {
                map.put("type", cVar.f21992c);
            }
            if (!TextUtils.isEmpty(cVar.f21993d)) {
                map.put("preview_source", cVar.f21993d);
            }
        }
    }
}
