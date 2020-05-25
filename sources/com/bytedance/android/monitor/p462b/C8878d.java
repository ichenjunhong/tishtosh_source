package com.bytedance.android.monitor.p462b;

import com.bytedance.android.monitor.p461a.C8872c;
import com.bytedance.android.monitor.p463c.C8880a;
import com.bytedance.android.monitor.p463c.C8881b;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import leakcanary.internal.LeakCanaryFileProvider;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.monitor.b.d */
public class C8878d extends C8875a implements C8872c {

    /* renamed from: a */
    private static volatile C8872c f24185a;

    /* renamed from: b */
    private Map<String, JSONObject> f24186b = new HashMap();

    private C8878d() {
    }

    /* renamed from: b */
    public static C8872c m17456b() {
        if (f24185a == null) {
            synchronized (C8878d.class) {
                if (f24185a == null) {
                    f24185a = new C8878d();
                }
            }
        }
        return f24185a;
    }

    /* renamed from: a */
    public final void mo15867a(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        String str3 = str;
        JSONObject jSONObject4 = jSONObject;
        if (mo15872a()) {
            if (str3 == null || str.length() == 0) {
                return;
            }
            String[] a = C8881b.m17465a(str);
            C8880a.m17463a(jSONObject, "url", (Object) str);
            C8880a.m17463a(jSONObject, "host", (Object) a[0]);
            C8880a.m17463a(jSONObject, LeakCanaryFileProvider.f132050j, (Object) a[1]);
            mo15873b("custom", 0, null, m17455a(str, a[0], a[1], str2, null, jSONObject, jSONObject2, jSONObject3, 0));
        }
    }

    /* renamed from: a */
    public final void mo15868a(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, int i) {
        String str3 = str;
        JSONObject jSONObject5 = jSONObject2;
        if (mo15872a()) {
            if (str3 == null || str.length() == 0) {
                return;
            }
            String[] a = C8881b.m17465a(str);
            C8880a.m17463a(jSONObject5, "url", (Object) str);
            C8880a.m17463a(jSONObject5, "host", (Object) a[0]);
            C8880a.m17463a(jSONObject5, LeakCanaryFileProvider.f132050j, (Object) a[1]);
            mo15873b("newcustom", 0, null, m17455a(str, a[0], a[1], str2, jSONObject, jSONObject2, jSONObject3, jSONObject4, i));
        }
    }

    /* renamed from: a */
    private static JSONObject m17455a(String str, String str2, String str3, String str4, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, int i) {
        C8880a.m17464a(jSONObject4, "event_name", str4);
        JSONObject jSONObject5 = new JSONObject();
        C8880a.m17463a(jSONObject5, "client_category", (Object) jSONObject2);
        C8880a.m17463a(jSONObject5, "client_metric", (Object) jSONObject3);
        C8880a.m17463a(jSONObject5, "client_extra", (Object) jSONObject4);
        C8880a.m17464a(jSONObject5, "ev_type", "custom");
        C8880a.m17464a(jSONObject5, "url", str);
        C8880a.m17464a(jSONObject5, "host", str2);
        C8880a.m17464a(jSONObject5, LeakCanaryFileProvider.f132050j, str3);
        if (jSONObject != null) {
            Iterator keys = jSONObject.keys();
            while (keys.hasNext()) {
                String str5 = (String) keys.next();
                C8880a.m17463a(jSONObject5, str5, C8880a.m17462a(jSONObject, str5));
            }
        }
        C8880a.m17463a(jSONObject5, "platform", (Object) Integer.valueOf(i));
        return jSONObject5;
    }
}
