package com.p683ss.android.ugc.aweme.bullet.bridge.commerce;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.ies.bullet.p628b.p633e.C10254a;
import com.bytedance.ies.bullet.p628b.p633e.C10290i;
import com.bytedance.ies.bullet.p628b.p637g.p638a.C10326b;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod.C24112a;
import java.util.Iterator;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.commerce.AdInfoMethod */
public final class AdInfoMethod extends BaseBridgeMethod {

    /* renamed from: b */
    public static final C24127a f64015b = new C24127a(null);

    /* renamed from: c */
    private final String f64016c = "adInfo";

    /* renamed from: d */
    private long f64017d;

    /* renamed from: e */
    private String f64018e;

    /* renamed from: f */
    private String f64019f;

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.commerce.AdInfoMethod$a */
    public static final class C24127a {
        private C24127a() {
        }

        public /* synthetic */ C24127a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: d */
    public final String mo18313d() {
        return this.f64016c;
    }

    public AdInfoMethod(C10326b bVar) {
        C52711k.m112240b(bVar, "contextProviderFactory");
        super(bVar);
    }

    /* renamed from: a */
    public final void mo49906a(JSONObject jSONObject, C24112a aVar) {
        boolean z;
        C52711k.m112240b(jSONObject, "params");
        C52711k.m112240b(aVar, "iReturn");
        C10290i g = mo49907g();
        int i = 0;
        if (g != null) {
            if (g.mo18345c() == C10254a.WEB) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                g = null;
            }
            if (g != null) {
                Uri h = g.mo18350h();
                if (h != null) {
                    this.f64019f = h.getQueryParameter("adinfojson");
                    this.f64018e = h.getQueryParameter("has_adinfojson");
                }
            }
        }
        C52711k.m112240b(aVar, "iReturn");
        JSONObject jSONObject2 = new JSONObject();
        if (!TextUtils.equals(this.f64018e, "1") || TextUtils.isEmpty(this.f64019f)) {
            String str = "code";
            if (this.f64017d != 0) {
                i = 1;
            }
            jSONObject2.put(str, i);
        } else {
            JSONObject jSONObject3 = new JSONObject(this.f64019f);
            Iterator keys = jSONObject3.keys();
            C52711k.m112236a((Object) keys, "adInfo.keys()");
            while (keys.hasNext()) {
                try {
                    String str2 = (String) keys.next();
                    jSONObject2.put(str2, jSONObject3.opt(str2));
                } catch (Exception unused) {
                }
            }
        }
        aVar.mo49913a(jSONObject2);
    }
}
