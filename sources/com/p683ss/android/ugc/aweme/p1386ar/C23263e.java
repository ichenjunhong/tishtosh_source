package com.p683ss.android.ugc.aweme.p1386ar;

import com.bytedance.apm.C8936b;
import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.ar.e */
public class C23263e {

    /* renamed from: b */
    private static C23263e f62209b;

    /* renamed from: a */
    public Map<String, Float> f62210a = new ConcurrentHashMap();

    /* renamed from: a */
    public static C23263e m57211a() {
        if (f62209b == null) {
            synchronized (C23263e.class) {
                if (f62209b == null) {
                    C23263e eVar = new C23263e();
                    f62209b = eVar;
                    C24076h.m58905f().scheduleAtFixedRate(new Runnable() {
                        public final void run() {
                            C23263e eVar = C23263e.this;
                            JSONObject jSONObject = new JSONObject();
                            JSONObject jSONObject2 = new JSONObject();
                            try {
                                for (Entry entry : eVar.f62210a.entrySet()) {
                                    jSONObject2.put((String) entry.getKey(), entry.getValue());
                                }
                            } catch (JSONException unused) {
                            }
                            eVar.f62210a.clear();
                            C8936b.m17657a("report_battery_i", jSONObject, jSONObject2, (JSONObject) null);
                        }
                    }, 2, 2, TimeUnit.MINUTES);
                }
            }
        }
        return f62209b;
    }
}
