package com.p683ss.android.ugc.aweme.bullet.bridge.common;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.bytedance.ies.bullet.p628b.p633e.p634a.C10268e.C10269a;
import com.bytedance.ies.bullet.p628b.p637g.p638a.C10326b;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod.C24112a;
import com.p683ss.android.ugc.aweme.proaccount.ProWelcomeActivity;
import com.p683ss.android.ugc.aweme.web.C48374m;
import org.json.JSONObject;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.OpenPorAccountMethod */
public final class OpenPorAccountMethod extends BaseBridgeMethod {

    /* renamed from: b */
    private final String f64103b = "switchToProAccount";

    /* renamed from: c */
    private C10269a f64104c = C10269a.PRIVATE;

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.OpenPorAccountMethod$a */
    public static final class C24167a implements C48374m {

        /* renamed from: a */
        final /* synthetic */ C24112a f64105a;

        C24167a(C24112a aVar) {
            this.f64105a = aVar;
        }

        public final void status(int i, boolean z) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", 1);
            jSONObject.put("isProAccount", z);
            C24112a aVar = this.f64105a;
            if (aVar != null) {
                aVar.mo49913a(jSONObject);
            }
        }
    }

    /* renamed from: b */
    public final C10269a mo18297b() {
        return this.f64104c;
    }

    /* renamed from: d */
    public final String mo18313d() {
        return this.f64103b;
    }

    /* renamed from: a */
    public final void mo18296a(C10269a aVar) {
        C52711k.m112240b(aVar, "<set-?>");
        this.f64104c = aVar;
    }

    public OpenPorAccountMethod(C10326b bVar) {
        C52711k.m112240b(bVar, "contextProviderFactory");
        super(bVar);
    }

    /* renamed from: a */
    public final void mo49906a(JSONObject jSONObject, C24112a aVar) {
        C52711k.m112240b(jSONObject, "params");
        C52711k.m112240b(aVar, "iReturn");
        C48374m aVar2 = new C24167a(aVar);
        if (mo18743e() != null) {
            Context e = mo18743e();
            if (e != null) {
                Activity activity = (Activity) e;
                Intent intent = new Intent(activity, ProWelcomeActivity.class);
                ProWelcomeActivity.f101249d.mo80758a(aVar2);
                activity.startActivity(intent);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type android.app.Activity");
        }
    }
}
