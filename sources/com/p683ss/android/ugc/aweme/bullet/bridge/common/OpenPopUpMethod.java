package com.p683ss.android.ugc.aweme.bullet.bridge.common;

import android.app.Activity;
import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0200t;
import android.content.Context;
import com.p683ss.android.ugc.aweme.bullet.api.IBulletService;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod.C24112a;
import com.p683ss.android.ugc.aweme.bullet.impl.BulletService;
import com.p683ss.android.ugc.aweme.bullet.views.C24363c;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.OpenPopUpMethod */
public final class OpenPopUpMethod extends BaseBridgeMethod {

    /* renamed from: b */
    public static final C24166a f64099b = new C24166a(null);

    /* renamed from: c */
    private final String f64100c;

    /* renamed from: d */
    private C24363c f64101d;

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.OpenPopUpMethod$a */
    public static final class C24166a {
        private C24166a() {
        }

        public /* synthetic */ C24166a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: d */
    public final String mo18313d() {
        return this.f64100c;
    }

    @C0200t(mo345a = C0177a.ON_DESTROY)
    public final void onDestroy() {
        C24363c cVar = this.f64101d;
        if (cVar != null) {
            cVar.dismiss();
        }
        this.f64101d = null;
    }

    /* renamed from: a */
    public final void mo49906a(JSONObject jSONObject, C24112a aVar) {
        C52711k.m112240b(jSONObject, "params");
        C52711k.m112240b(aVar, "iReturn");
        String optString = jSONObject.optString("url", "");
        String optString2 = jSONObject.optString("data", null);
        Context e = mo18743e();
        if (!(e instanceof Activity)) {
            e = null;
        }
        Activity activity = (Activity) e;
        if (activity != null) {
            if (this.f64101d == null) {
                IBulletService provideBulletService_Monster = BulletService.provideBulletService_Monster();
                Context context = activity;
                C52711k.m112236a((Object) optString, "url");
                this.f64101d = provideBulletService_Monster.showBulletBottomDialog(context, optString, optString2, 0, 0);
            } else {
                C24363c cVar = this.f64101d;
                if (cVar != null) {
                    cVar.mo50160a(activity);
                }
            }
        }
        aVar.mo49911a((Object) "");
    }
}
