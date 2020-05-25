package com.p683ss.android.ugc.aweme.bullet.bridge.framework;

import android.app.Activity;
import android.content.Context;
import android.webkit.WebView;
import com.bytedance.ies.bullet.p628b.p633e.C10254a;
import com.bytedance.ies.bullet.p628b.p633e.C10290i;
import com.bytedance.ies.bullet.p628b.p633e.p634a.C10268e.C10269a;
import com.bytedance.ies.bullet.p628b.p637g.p638a.C10326b;
import com.bytedance.ies.p675g.p676a.C10757a;
import com.bytedance.ies.ugc.p694a.C11016e.C11018b;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod.C24112a;
import com.p683ss.android.ugc.aweme.live.p1920c.C36062a;
import com.p683ss.android.ugc.aweme.p1706fe.method.CloseMethod.C29793b;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.CloseMethod */
public final class CloseMethod extends BaseBridgeMethod {

    /* renamed from: b */
    public static final C24182a f64159b = new C24182a(null);

    /* renamed from: c */
    private final String f64160c = "close";

    /* renamed from: d */
    private C10269a f64161d = C10269a.PUBLIC;

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.CloseMethod$a */
    public static final class C24182a {
        private C24182a() {
        }

        public /* synthetic */ C24182a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: b */
    public final C10269a mo18297b() {
        return this.f64161d;
    }

    /* renamed from: d */
    public final String mo18313d() {
        return this.f64160c;
    }

    /* renamed from: a */
    public final void mo18296a(C10269a aVar) {
        C52711k.m112240b(aVar, "<set-?>");
        this.f64161d = aVar;
    }

    public CloseMethod(C10326b bVar) {
        C52711k.m112240b(bVar, "contextProviderFactory");
        super(bVar);
    }

    /* renamed from: a */
    public final void mo49906a(JSONObject jSONObject, C24112a aVar) {
        boolean z;
        C52711k.m112240b(jSONObject, "params");
        C52711k.m112240b(aVar, "iReturn");
        if (mo49908h() == C10254a.WEB || mo49908h() == C10254a.LYNX) {
            String optString = jSONObject.optString("reactId");
            CharSequence charSequence = optString;
            int i = 0;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!(!z)) {
                optString = null;
            }
            if (optString != null) {
                Activity a = mo49904a(optString);
                if (a != null) {
                    a.finish();
                }
            }
            Context e = mo18743e();
            if (e instanceof Activity) {
                Activity activity = (Activity) e;
                if (!activity.isFinishing()) {
                    if (e instanceof C11018b) {
                        if (mo49908h() == C10254a.LYNX) {
                            C10290i g = mo49907g();
                            if (g != null) {
                                i = g.hashCode();
                            }
                        } else {
                            C10757a i2 = mo49909i();
                            if (i2 != null) {
                                WebView webView = i2.f28930d;
                                if (webView != null) {
                                    i = webView.hashCode();
                                }
                            }
                        }
                        C47718bf.m103288a(new C29793b(i));
                    } else {
                        activity.finish();
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("code", 1);
                    aVar.mo49913a(jSONObject2);
                    return;
                }
            }
            C47718bf.m103288a(new C36062a(C36062a.f92417b));
            JSONObject jSONObject22 = new JSONObject();
            jSONObject22.put("code", 1);
            aVar.mo49913a(jSONObject22);
            return;
        }
        Activity a2 = mo49904a(jSONObject.optString("reactId"));
        if (a2 != null) {
            a2.finish();
            aVar.mo49911a((Object) null);
            return;
        }
        aVar.mo49910a(-1, "the target activity doesn't exist");
    }
}
