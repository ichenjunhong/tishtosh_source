package com.p683ss.android.ugc.aweme.web.jsbridge;

import com.bytedance.ies.p675g.p676a.C10762d;
import com.bytedance.ies.p675g.p676a.C10766h;
import com.p683ss.android.ugc.aweme.poi.p2059b.C39044d;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.ab */
public final class C48328ab implements C10762d {
    public final void call(C10766h hVar, JSONObject jSONObject) throws Exception {
        if (hVar != null && hVar.f28947d != null) {
            try {
                C47718bf.m103288a(new C39044d(hVar.f28947d.optString("type"), hVar.f28947d.optInt("result")));
            } catch (Exception unused) {
            }
        }
    }
}
