package com.p683ss.android.ugc.aweme.bullet.bridge.framework;

import com.bytedance.ies.bullet.p628b.p637g.p638a.C10326b;
import com.google.gson.p1077b.C17956a;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod.C24112a;
import com.p683ss.android.ugc.aweme.commercialize.C25930g;
import com.p683ss.android.ugc.aweme.commercialize.model.C26136q;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26386al;
import com.p683ss.android.ugc.aweme.discover.p1659ui.search.C28668d;
import com.p683ss.android.ugc.aweme.discover.p1659ui.search.jsbridge.C28695c;
import com.p683ss.android.ugc.aweme.utils.C47759cc;
import com.p683ss.android.ugc.aweme.utils.GsonProvider;
import java.lang.reflect.Type;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.ShowEasterEggMethod */
public final class ShowEasterEggMethod extends BaseBridgeMethod {

    /* renamed from: b */
    public static final C24218a f64258b = new C24218a(null);

    /* renamed from: c */
    private final String f64259c = C28695c.f75313f;

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.ShowEasterEggMethod$a */
    public static final class C24218a {
        private C24218a() {
        }

        public /* synthetic */ C24218a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.ShowEasterEggMethod$b */
    public static final class C24219b extends C17956a<C26136q> {
        C24219b() {
        }
    }

    /* renamed from: d */
    public final String mo18313d() {
        return this.f64259c;
    }

    public ShowEasterEggMethod(C10326b bVar) {
        C52711k.m112240b(bVar, "contextProviderFactory");
        super(bVar);
    }

    /* renamed from: a */
    public final void mo49906a(JSONObject jSONObject, C24112a aVar) {
        C52711k.m112240b(jSONObject, "params");
        C52711k.m112240b(aVar, "iReturn");
        try {
            C25930g gVar = new C25930g();
            String string = jSONObject.getString("easterEggInfo");
            C52711k.m112236a((Object) string, "params.getString(\"easterEggInfo\")");
            C52711k.m112240b(string, "result");
            Type type = new C24219b().f49843c;
            GsonProvider a = C47759cc.m103382a();
            C52711k.m112236a((Object) a, "GsonProvider.get()");
            C26136q qVar = (C26136q) a.getGson().mo34885a(string, type);
            C52711k.m112236a((Object) qVar, "list");
            gVar.setEasterEggInfo(qVar);
            gVar.setKeyWords(jSONObject.getString("keyWords"));
            gVar.setEnterFrom(jSONObject.getString("enterFrom"));
            gVar.setEnterMethod(jSONObject.getString("enterMethod"));
            C26386al.m63838a(mo18743e(), gVar, -1);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("code", 1);
            aVar.mo49913a(jSONObject2);
        } catch (Exception e) {
            C28668d.m67931a(e, "ShowEasterEggMethod");
            aVar.mo49910a(0, e.getMessage());
        }
    }
}
