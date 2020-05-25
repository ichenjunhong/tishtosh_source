package com.p683ss.android.ugc.aweme.bullet.bridge.framework;

import android.text.TextUtils;
import com.bytedance.ies.bullet.p628b.p637g.p638a.C10326b;
import com.p683ss.android.ugc.aweme.app.C23131p;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod.C24112a;
import org.json.JSONException;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.MonitorLogMethod */
public final class MonitorLogMethod extends BaseBridgeMethod {

    /* renamed from: b */
    public static final C24191a f64183b = new C24191a(null);

    /* renamed from: c */
    private final String f64184c = "monitorLog";

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.MonitorLogMethod$a */
    public static final class C24191a {
        private C24191a() {
        }

        public /* synthetic */ C24191a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: d */
    public final String mo18313d() {
        return this.f64184c;
    }

    public MonitorLogMethod(C10326b bVar) {
        C52711k.m112240b(bVar, "contextProviderFactory");
        super(bVar);
    }

    /* renamed from: a */
    public final void mo49906a(JSONObject jSONObject, C24112a aVar) {
        C52711k.m112240b(jSONObject, "params");
        C52711k.m112240b(aVar, "iReturn");
        if (jSONObject.length() == 0) {
            aVar.mo49910a(0, "params is empty");
            return;
        }
        String optString = jSONObject.optString("log_type");
        CharSequence charSequence = optString;
        if (TextUtils.isEmpty(charSequence)) {
            aVar.mo49910a(0, "log_type is empty");
            return;
        }
        String optString2 = jSONObject.optString("service");
        if (!TextUtils.equals(charSequence, "service_monitor") || !TextUtils.isEmpty(optString2)) {
            JSONObject jSONObject2 = new JSONObject();
            m59182a(jSONObject, jSONObject2, "status");
            m59182a(jSONObject, jSONObject2, "value");
            C23131p.m56692a(optString, optString2, jSONObject2);
            aVar.mo49911a((Object) null);
            return;
        }
        StringBuilder sb = new StringBuilder("service is required while log_type=");
        sb.append(optString);
        aVar.mo49910a(0, sb.toString());
    }

    /* renamed from: a */
    private static void m59182a(JSONObject jSONObject, JSONObject jSONObject2, String str) {
        try {
            Object opt = jSONObject.opt(str);
            if (opt != null) {
                jSONObject2.put(str, opt);
            }
        } catch (JSONException unused) {
        }
    }
}
