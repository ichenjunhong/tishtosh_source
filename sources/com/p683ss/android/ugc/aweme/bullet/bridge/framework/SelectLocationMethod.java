package com.p683ss.android.ugc.aweme.bullet.bridge.framework;

import com.bytedance.ies.bullet.p628b.p637g.p638a.C10326b;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod.C24112a;
import com.p683ss.android.ugc.aweme.profile.p2090ui.C40351dt;
import com.p683ss.android.ugc.aweme.profile.p2090ui.C40351dt.C40353a;
import org.json.JSONException;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.SelectLocationMethod */
public final class SelectLocationMethod extends BaseBridgeMethod {

    /* renamed from: b */
    public static final C24209a f64238b = new C24209a(null);

    /* renamed from: c */
    private final String f64239c = "showLocationSelect";

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.SelectLocationMethod$a */
    public static final class C24209a {
        private C24209a() {
        }

        public /* synthetic */ C24209a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.SelectLocationMethod$b */
    static final class C24210b implements C40353a {

        /* renamed from: a */
        final /* synthetic */ SelectLocationMethod f64240a;

        C24210b(SelectLocationMethod selectLocationMethod) {
            this.f64240a = selectLocationMethod;
        }

        /* renamed from: a */
        public final void mo49946a(boolean z, String str) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("eventName", "locationSelected");
                if (!z) {
                    jSONObject.put("code", 0);
                } else {
                    jSONObject.put("code", 1);
                    jSONObject.put("location", str);
                }
                this.f64240a.mo49905a("notification", jSONObject);
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: d */
    public final String mo18313d() {
        return this.f64239c;
    }

    public SelectLocationMethod(C10326b bVar) {
        C52711k.m112240b(bVar, "contextProviderFactory");
        super(bVar);
    }

    /* renamed from: a */
    public final void mo49906a(JSONObject jSONObject, C24112a aVar) {
        C52711k.m112240b(jSONObject, "params");
        C52711k.m112240b(aVar, "iReturn");
        C40351dt dtVar = new C40351dt(C11016e.m22312g());
        dtVar.mo82599a();
        dtVar.f103011f = new C24210b(this);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("code", 1);
        aVar.mo49913a(jSONObject2);
    }
}
