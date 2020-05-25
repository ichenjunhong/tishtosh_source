package com.p683ss.android.ugc.aweme.crossplatform.p1613b;

import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import java.util.Iterator;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.b.b */
public final class C27130b {

    /* renamed from: a */
    public static final C27130b f71574a = new C27130b();

    private C27130b() {
    }

    /* renamed from: a */
    public final void mo55447a(JSONObject jSONObject) {
        boolean z;
        String str;
        if (jSONObject != null) {
            JSONObject optJSONObject = jSONObject.optJSONObject("extra");
            if (optJSONObject != null) {
                JSONObject optJSONObject2 = optJSONObject.optJSONObject("client_category");
                if (optJSONObject2 != null) {
                    z = C52711k.m112239a((Object) optJSONObject2.optString("type"), (Object) "lynx");
                } else {
                    z = false;
                }
                if (z) {
                    try {
                        JSONObject optJSONObject3 = optJSONObject.optJSONObject("client_metric");
                        JSONObject optJSONObject4 = optJSONObject.optJSONObject("client_extra");
                        if (optJSONObject4 != null) {
                            str = optJSONObject4.optString("event_name");
                        } else {
                            str = null;
                        }
                        C23089d dVar = new C23089d();
                        if (optJSONObject2 != null) {
                            Iterator keys = optJSONObject2.keys();
                            C52711k.m112236a((Object) keys, "keys()");
                            while (keys.hasNext()) {
                                String str2 = (String) keys.next();
                                if (C52711k.m112239a((Object) str2, (Object) "trigger")) {
                                    dVar.mo47829a("trigger_v2", optJSONObject2.optString(str2));
                                } else {
                                    dVar.mo47829a(str2, optJSONObject2.optString(str2));
                                }
                            }
                        }
                        if (optJSONObject3 != null) {
                            Iterator keys2 = optJSONObject3.keys();
                            C52711k.m112236a((Object) keys2, "keys()");
                            while (keys2.hasNext()) {
                                String str3 = (String) keys2.next();
                                if (C52711k.m112239a((Object) str3, (Object) "trigger")) {
                                    dVar.mo47827a("trigger_v2", optJSONObject3.optLong(str3));
                                } else {
                                    dVar.mo47827a(str3, optJSONObject3.optLong(str3));
                                }
                            }
                        }
                        C26890h.m65011a(str, dVar.f61491a);
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }
}
