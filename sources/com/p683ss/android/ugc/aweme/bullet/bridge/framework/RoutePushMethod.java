package com.p683ss.android.ugc.aweme.bullet.bridge.framework;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.ies.bullet.p628b.p629a.C10241d;
import com.bytedance.ies.bullet.p628b.p637g.p638a.C10326b;
import com.bytedance.ies.bullet.p653ui.common.C10560a;
import com.bytedance.ies.bullet.p653ui.common.C10577d;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod.C24112a;
import com.p683ss.android.ugc.aweme.p1328af.p1329a.C22507e;
import com.p683ss.android.ugc.aweme.router.C41302w;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2647j.C52751c;
import p2628d.p2647j.C52753d;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.RoutePushMethod */
public final class RoutePushMethod extends BaseBridgeMethod {

    /* renamed from: c */
    public static final C52751c f64229c = C52753d.m112320b(50000, 60000);

    /* renamed from: d */
    public static final C24207a f64230d = new C24207a(null);

    /* renamed from: b */
    public final Map<Integer, C24112a> f64231b = new LinkedHashMap();

    /* renamed from: e */
    private final String f64232e = "routePush";

    /* renamed from: f */
    private int f64233f = f64229c.f130995a;

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.RoutePushMethod$a */
    public static final class C24207a {
        private C24207a() {
        }

        public /* synthetic */ C24207a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.RoutePushMethod$b */
    public static final class C24208b extends C10560a {

        /* renamed from: a */
        final /* synthetic */ C10577d f64234a;

        /* renamed from: b */
        final /* synthetic */ String f64235b;

        /* renamed from: c */
        final /* synthetic */ RoutePushMethod f64236c;

        /* renamed from: d */
        final /* synthetic */ C24112a f64237d;

        C24208b(C10577d dVar, String str, RoutePushMethod routePushMethod, C24112a aVar) {
            this.f64234a = dVar;
            this.f64235b = str;
            this.f64236c = routePushMethod;
            this.f64237d = aVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public Void mo18710a(Activity activity, int i, int i2, Intent intent) {
            JSONObject jSONObject;
            C52711k.m112240b(activity, "activity");
            if (i2 == 50000) {
                C24112a aVar = (C24112a) this.f64236c.f64231b.remove(Integer.valueOf(i));
                if (aVar != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    if (intent != null) {
                        Bundle extras = intent.getExtras();
                        if (extras != null) {
                            String string = extras.getString("serialized_data");
                            if (string != null) {
                                try {
                                    jSONObject = new JSONObject(string).optJSONObject("data");
                                } catch (JSONException unused) {
                                    jSONObject = null;
                                }
                                if (jSONObject != null) {
                                    C22507e.m55596a(jSONObject2, jSONObject);
                                }
                            }
                        }
                    }
                    aVar.mo49912a(jSONObject2, 1, "push callback succeed");
                }
            }
            this.f64234a.mo18718b(this);
            throw new C10241d("An operation is not implemented");
        }
    }

    /* renamed from: d */
    public final String mo18313d() {
        return this.f64232e;
    }

    public RoutePushMethod(C10326b bVar) {
        C52711k.m112240b(bVar, "contextProviderFactory");
        super(bVar);
    }

    /* renamed from: a */
    public final void mo49906a(JSONObject jSONObject, C24112a aVar) {
        C52711k.m112240b(jSONObject, "params");
        C52711k.m112240b(aVar, "iReturn");
        String optString = jSONObject.optString("schema");
        if (optString != null) {
            if (!(!TextUtils.isEmpty(optString))) {
                optString = null;
            }
            if (optString != null) {
                C10577d f = mo18744f();
                if (f != null) {
                    f.mo18715a(new C24208b(f, optString, this, aVar));
                    C10577d f2 = mo18744f();
                    if (f2 != null) {
                        Activity a = f2.mo18708a();
                        if (a != null) {
                            if (C41302w.m91042a().mo83859a(a, optString, this.f64233f)) {
                                this.f64231b.put(Integer.valueOf(this.f64233f), aVar);
                                this.f64233f++;
                                if (this.f64233f > f64229c.f130996b) {
                                    this.f64233f = f64229c.f130995a;
                                    return;
                                }
                                return;
                            }
                        }
                    }
                    aVar.mo49910a(-1, "router not supported");
                    return;
                }
            }
        }
        aVar.mo49910a(-1, "params not valid");
    }
}
