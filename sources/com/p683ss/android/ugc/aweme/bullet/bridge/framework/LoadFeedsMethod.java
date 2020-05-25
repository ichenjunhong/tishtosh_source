package com.p683ss.android.ugc.aweme.bullet.bridge.framework;

import android.app.Activity;
import android.arch.lifecycle.C0176h;
import android.arch.lifecycle.C0184k;
import android.content.Context;
import com.bytedance.ies.bullet.p628b.p637g.p638a.C10326b;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod.C24112a;
import com.p683ss.android.ugc.aweme.p1706fe.method.feeds.C29885a;
import com.p683ss.android.ugc.aweme.p1706fe.method.feeds.C29885a.C29886a;
import com.p683ss.android.ugc.aweme.p1706fe.method.feeds.api.C29895a;
import com.p683ss.android.ugc.aweme.p1706fe.method.feeds.p1710b.C29898a;
import com.ss.android.ugc.trill.R;
import leakcanary.internal.LeakCanaryFileProvider;
import org.json.JSONObject;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.LoadFeedsMethod */
public final class LoadFeedsMethod extends BaseBridgeMethod implements C29895a {

    /* renamed from: b */
    static final /* synthetic */ C52767h[] f64177b = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(LoadFeedsMethod.class), "bridgeModel", "getBridgeModel()Lcom/ss/android/ugc/aweme/fe/method/feeds/FeedsFEBridgeModel;"))};

    /* renamed from: d */
    public static final C24189a f64178d = new C24189a(null);

    /* renamed from: c */
    public String f64179c = "";

    /* renamed from: e */
    private final String f64180e = "loadFeeds";

    /* renamed from: f */
    private final C52668f f64181f = C52732g.m112285a(new C24190b(this));

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.LoadFeedsMethod$a */
    public static final class C24189a {
        private C24189a() {
        }

        public /* synthetic */ C24189a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.LoadFeedsMethod$b */
    static final class C24190b extends C52712l implements C52670a<C29885a> {

        /* renamed from: a */
        final /* synthetic */ LoadFeedsMethod f64182a;

        C24190b(LoadFeedsMethod loadFeedsMethod) {
            this.f64182a = loadFeedsMethod;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return C29886a.m70049a(new C29898a(), this.f64182a.f64179c, this.f64182a);
        }
    }

    /* renamed from: j */
    private final C29885a m59177j() {
        return (C29885a) this.f64181f.getValue();
    }

    /* renamed from: d */
    public final String mo18313d() {
        return this.f64180e;
    }

    /* renamed from: a */
    public final void mo18295a() {
        super.mo18295a();
        m59177j().mo60100a();
        Context e = mo18743e();
        if (!(e instanceof Activity)) {
            e = null;
        }
        Activity activity = (Activity) e;
        if (activity != null) {
            activity.findViewById(16908290).setTag(R.id.ms, null);
        }
    }

    public LoadFeedsMethod(C10326b bVar) {
        C52711k.m112240b(bVar, "contextProviderFactory");
        super(bVar);
        Context e = mo18743e();
        if (!(e instanceof C0184k)) {
            e = null;
        }
        C0184k kVar = (C0184k) e;
        if (kVar != null) {
            C0176h lifecycle = kVar.getLifecycle();
            if (lifecycle != null) {
                lifecycle.mo324a(this);
            }
        }
    }

    /* renamed from: a */
    public final void mo49906a(JSONObject jSONObject, C24112a aVar) {
        boolean z;
        C52711k.m112240b(jSONObject, "params");
        C52711k.m112240b(aVar, "iReturn");
        int i = 1;
        boolean z2 = false;
        if (!jSONObject.has("base_url") || !jSONObject.has("react_id") || !jSONObject.has("page") || !jSONObject.has("size") || jSONObject.optBoolean("clear", false)) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            jSONObject = null;
        }
        if (jSONObject != null) {
            String optString = jSONObject.optString("react_id");
            C52711k.m112236a((Object) optString, "optString(FIELD_REACT_ID)");
            this.f64179c = optString;
            String optString2 = jSONObject.optString("base_url");
            int optInt = jSONObject.optInt("page");
            int optInt2 = jSONObject.optInt("size");
            C29885a j = m59177j();
            C52711k.m112236a((Object) optString2, "baseUrl");
            j.mo60102a(optString2, optInt, optInt2);
            z2 = true;
        }
        Context e = mo18743e();
        if (!(e instanceof Activity)) {
            e = null;
        }
        Activity activity = (Activity) e;
        if (activity != null) {
            activity.findViewById(16908290).setTag(R.id.ms, m59177j());
        }
        JSONObject jSONObject2 = new JSONObject();
        String str = "code";
        if (!z2) {
            i = -1;
        }
        jSONObject2.put(str, i);
        aVar.mo49913a(jSONObject2);
    }

    /* renamed from: a */
    public final void mo49935a(String str, JSONObject jSONObject, int i) {
        C52711k.m112240b(str, LeakCanaryFileProvider.f132049i);
        C52711k.m112240b(jSONObject, "params");
        mo49905a(str, jSONObject);
    }
}
