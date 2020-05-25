package com.p683ss.android.ugc.aweme.crossplatform.p1613b;

import com.p683ss.android.ugc.aweme.crossplatform.p1613b.C27131c.C27132a;
import com.p683ss.android.ugc.aweme.p1328af.p1329a.C22530t;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.b.g */
public final class C27144g {

    /* renamed from: a */
    public static final C27144g f71608a = new C27144g();

    /* renamed from: b */
    private static final List<String> f71609b = C52575l.m112101c("error_code", "loading_status_code", "loadso");

    private C27144g() {
    }

    /* renamed from: a */
    private static String m65477a(JSONObject jSONObject) {
        boolean z;
        String str = "none";
        Iterator keys = jSONObject.keys();
        C52711k.m112236a((Object) keys, "keys()");
        long j = 0;
        while (keys.hasNext()) {
            String str2 = (String) keys.next();
            Long valueOf = Long.valueOf(jSONObject.optLong(str2));
            if (valueOf.longValue() > j) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                valueOf = null;
            }
            if (valueOf != null) {
                j = valueOf.longValue();
                C52711k.m112236a((Object) str2, "key");
                str = str2;
            }
        }
        return str;
    }

    /* renamed from: a */
    public final void mo55461a(JSONObject jSONObject, C22530t tVar) {
        try {
            m65478b(jSONObject, tVar);
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    private final void m65478b(JSONObject jSONObject, C22530t tVar) {
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        Iterator keys = jSONObject.keys();
        C52711k.m112236a((Object) keys, "keys()");
        while (keys.hasNext()) {
            String str = (String) keys.next();
            C52711k.m112236a((Object) str, "key");
            if (C52830p.m112411b(str, "tick_", false, 2, null)) {
                jSONObject4.put(str, jSONObject.opt(str));
            } else if (C52830p.m112411b(str, "dur_", false, 2, null)) {
                jSONObject3.put(str, jSONObject.opt(str));
            } else if (f71609b.contains(str)) {
                jSONObject2.put(str, jSONObject.opt(str).toString());
            }
        }
        C27132a.m65458a();
        C27131c.m65448a(tVar, "hybrid_monitor_ttwebview_full_log", m65477a(jSONObject4), jSONObject2, jSONObject3, jSONObject4);
    }
}
