package com.p683ss.android.ugc.aweme.bullet.bridge.framework;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import com.bytedance.ies.bullet.p628b.p637g.p638a.C10326b;
import com.google.gson.C18082l;
import com.google.gson.C18085o;
import com.google.gson.C18087q;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod.C24112a;
import com.p683ss.android.ugc.aweme.commerce.p1531c.C25508a;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.OpenHalfDialogMethod */
public final class OpenHalfDialogMethod extends BaseBridgeMethod {

    /* renamed from: b */
    public static final C24198a f64201b = new C24198a(null);

    /* renamed from: c */
    private final String f64202c = "openHalfDialog";

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.OpenHalfDialogMethod$a */
    public static final class C24198a {
        private C24198a() {
        }

        public /* synthetic */ C24198a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: d */
    public final String mo18313d() {
        return this.f64202c;
    }

    public OpenHalfDialogMethod(C10326b bVar) {
        C52711k.m112240b(bVar, "contextProviderFactory");
        super(bVar);
    }

    /* renamed from: a */
    public final void mo49906a(JSONObject jSONObject, C24112a aVar) {
        float f;
        int i;
        C52711k.m112240b(jSONObject, "params");
        C52711k.m112240b(aVar, "iReturn");
        Context e = mo18743e();
        if (!(e instanceof Activity)) {
            e = null;
        }
        Activity activity = (Activity) e;
        if (activity == null) {
            aVar.mo49910a(0, "activity is null");
            return;
        }
        C18082l a = new C18087q().mo35029a(jSONObject.toString());
        C52711k.m112236a((Object) a, "JsonParser().parse(params.toString())");
        C18085o m = a.mo35009m();
        Context context = activity;
        C18082l b = m.mo35022b("height");
        C52711k.m112236a((Object) b, "jsonObject.get(\"height\")");
        int a2 = C23728o.m58242a(context, b.mo34910g());
        C18082l b2 = m.mo35022b("schema");
        C52711k.m112236a((Object) b2, "jsonObject.get(\"schema\")");
        String c = b2.mo34905c();
        C52711k.m112236a((Object) c, "jsonObject.get(\"schema\").asString");
        C18082l b3 = m.mo35022b("borderRadius");
        if (b3 == null || b3.mo35008l()) {
            f = (float) C23728o.m58241a(8.0d);
        } else {
            f = (float) C23728o.m58242a(context, b3.mo34910g());
        }
        float f2 = f;
        C18082l b4 = m.mo35022b("bgColor");
        if (b4 == null || b4.mo35008l()) {
            i = -1;
        } else {
            i = Color.parseColor(b4.mo34905c());
        }
        C25508a aVar2 = new C25508a(activity, a2, c, f2, true, i);
        aVar2.show();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("code", 1);
        aVar.mo49913a(jSONObject2);
    }
}
