package com.p683ss.android.ugc.aweme.discover.p1659ui.search.jsbridge;

import android.content.Context;
import com.bytedance.ies.p675g.p676a.C10757a;
import com.google.gson.p1077b.C17956a;
import com.p683ss.android.ugc.aweme.commercialize.C25930g;
import com.p683ss.android.ugc.aweme.commercialize.model.C26136q;
import com.p683ss.android.ugc.aweme.discover.p1659ui.search.C28668d;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod.C29789a;
import com.p683ss.android.ugc.aweme.search.C41428h;
import com.p683ss.android.ugc.aweme.utils.C47759cc;
import java.lang.ref.WeakReference;
import org.json.JSONArray;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.search.jsbridge.ShowEasterEggMethod */
public final class ShowEasterEggMethod extends BaseCommonJavaMethod {

    /* renamed from: a */
    private WeakReference<Context> f75278a;

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.search.jsbridge.ShowEasterEggMethod$a */
    public static final class C28680a extends C17956a<C26136q> {
        C28680a() {
        }
    }

    public ShowEasterEggMethod(WeakReference<Context> weakReference, C10757a aVar) {
        C52711k.m112240b(weakReference, "contextRef");
        C52711k.m112240b(aVar, "jsBridge");
        super(aVar);
        this.f75278a = weakReference;
    }

    /* renamed from: a */
    public final void mo49914a(JSONObject jSONObject, C29789a aVar) {
        Context context;
        if (jSONObject != null) {
            try {
                C25930g gVar = new C25930g();
                String string = jSONObject.getString("easterEggInfo");
                C52711k.m112236a((Object) string, "params.getString(\"easterEggInfo\")");
                C52711k.m112240b(string, "result");
                C26136q qVar = (C26136q) C47759cc.m103382a().getGson().mo34885a(string, new C28680a().f49843c);
                C52711k.m112236a((Object) qVar, "list");
                gVar.setEasterEggInfo(qVar);
                gVar.setKeyWords(jSONObject.getString("keyWords"));
                gVar.setEnterFrom(jSONObject.getString("enterFrom"));
                gVar.setEnterMethod(jSONObject.getString("enterMethod"));
                C41428h hVar = C41428h.f105000a;
                WeakReference<Context> weakReference = this.f75278a;
                if (weakReference != null) {
                    context = (Context) weakReference.get();
                } else {
                    context = null;
                }
                hVar.launchEasterEggActivity(context, gVar);
            } catch (Exception e) {
                C28668d.m67931a(e, "ShowEasterEggMethod");
                aVar.mo60038a(0, e.getMessage());
                return;
            }
        }
        aVar.mo60039a((Object) new JSONArray());
    }
}
