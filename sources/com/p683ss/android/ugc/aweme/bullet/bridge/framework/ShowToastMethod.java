package com.p683ss.android.ugc.aweme.bullet.bridge.framework;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.ies.bullet.p628b.p637g.p638a.C10326b;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod.C24112a;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.ShowToastMethod */
public final class ShowToastMethod extends BaseBridgeMethod {

    /* renamed from: b */
    public static final C24220a f64260b = new C24220a(null);

    /* renamed from: c */
    private final String f64261c = "showToast";

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.ShowToastMethod$a */
    public static final class C24220a {
        private C24220a() {
        }

        public /* synthetic */ C24220a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.ShowToastMethod$b */
    static final class C24221b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f64262a;

        /* renamed from: b */
        final /* synthetic */ String f64263b;

        /* renamed from: c */
        final /* synthetic */ C24112a f64264c;

        C24221b(Context context, String str, C24112a aVar) {
            this.f64262a = context;
            this.f64263b = str;
            this.f64264c = aVar;
        }

        public final void run() {
            C10691a.m21537a(this.f64262a, this.f64263b).mo19066a();
            C24112a aVar = this.f64264c;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", 1);
            aVar.mo49913a(jSONObject);
        }
    }

    /* renamed from: d */
    public final String mo18313d() {
        return this.f64261c;
    }

    public ShowToastMethod(C10326b bVar) {
        C52711k.m112240b(bVar, "contextProviderFactory");
        super(bVar);
    }

    /* renamed from: a */
    public final void mo49906a(JSONObject jSONObject, C24112a aVar) {
        C52711k.m112240b(jSONObject, "params");
        C52711k.m112240b(aVar, "iReturn");
        Context e = mo18743e();
        String optString = jSONObject.optString("message");
        if (e != null) {
            new Handler(Looper.getMainLooper()).post(new C24221b(e, optString, aVar));
        } else {
            aVar.mo49910a(0, "");
        }
    }
}
