package com.p683ss.android.ugc.aweme.bullet.bridge.framework;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.Window;
import com.bytedance.ies.bullet.p628b.p637g.p638a.C10326b;
import com.google.gson.C18085o;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod.C24112a;
import com.p683ss.android.ugc.aweme.utils.C47887fi;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.DarkModeMethod */
public final class DarkModeMethod extends BaseBridgeMethod {

    /* renamed from: b */
    public static final C24184a f64164b = new C24184a(null);

    /* renamed from: c */
    private final String f64165c = "darkMode";

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.DarkModeMethod$a */
    public static final class C24184a {
        private C24184a() {
        }

        public /* synthetic */ C24184a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: d */
    public final String mo18313d() {
        return this.f64165c;
    }

    public DarkModeMethod(C10326b bVar) {
        C52711k.m112240b(bVar, "contextProviderFactory");
        super(bVar);
    }

    /* renamed from: a */
    public final void mo49906a(JSONObject jSONObject, C24112a aVar) {
        C52711k.m112240b(jSONObject, "params");
        C52711k.m112240b(aVar, "iReturn");
        String optString = jSONObject.optString("enable");
        try {
            Context e = mo18743e();
            Window window = null;
            if (!(e instanceof Activity)) {
                e = null;
            }
            Activity activity = (Activity) e;
            C47887fi fiVar = C47887fi.f120483a;
            if (activity != null) {
                window = activity.getWindow();
            }
            fiVar.mo95098a(activity, window, TextUtils.equals(optString, "true"));
            aVar.mo49911a((Object) new C18085o());
        } catch (Exception unused) {
            aVar.mo49910a(0, "");
        }
    }
}
