package com.p683ss.android.ugc.aweme.bullet;

import com.bytedance.ies.bullet.p628b.p641h.C10357d;
import com.p683ss.android.ugc.aweme.crossplatform.p1613b.C27131c.C27132a;
import com.p683ss.android.ugc.aweme.p1328af.p1329a.C22482ab;
import java.util.Map;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bullet.b */
public final class C24108b implements C10357d {

    /* renamed from: a */
    public static final C24108b f63984a = new C24108b();

    private C24108b() {
    }

    /* renamed from: a */
    public final void mo18423a(String str, JSONObject jSONObject) {
        C52711k.m112240b(str, "service");
        C52711k.m112240b(jSONObject, "data");
        C27132a.m65458a().f71582f.mo46810a(str, jSONObject);
    }

    /* renamed from: a */
    public final void mo18421a(Exception exc, String str, Map<String, String> map) {
        C52711k.m112240b(exc, "e");
        C52711k.m112240b(str, "message");
        C52711k.m112240b(map, "data");
        C27132a.m65458a().f71582f.mo46808a(exc, str, map);
    }

    /* renamed from: a */
    public final void mo18422a(String str, Integer num, JSONObject jSONObject, JSONObject jSONObject2) {
        C22482ab abVar = C27132a.m65458a().f71582f;
        if (num == null) {
            num = Integer.valueOf(1);
        }
        abVar.mo46809a(str, num, jSONObject, jSONObject2, true);
    }
}
