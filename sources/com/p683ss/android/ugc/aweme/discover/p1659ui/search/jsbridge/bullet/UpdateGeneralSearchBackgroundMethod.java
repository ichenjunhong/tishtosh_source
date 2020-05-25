package com.p683ss.android.ugc.aweme.discover.p1659ui.search.jsbridge.bullet;

import com.bytedance.ies.bullet.p628b.p637g.p638a.C10326b;
import com.bytedance.ies.bullet.p628b.p637g.p638a.C10327c;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod.C24112a;
import com.p683ss.android.ugc.aweme.discover.helper.C28196e;
import com.p683ss.android.ugc.aweme.discover.p1659ui.search.C28668d;
import org.json.JSONArray;
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

/* renamed from: com.ss.android.ugc.aweme.discover.ui.search.jsbridge.bullet.UpdateGeneralSearchBackgroundMethod */
public final class UpdateGeneralSearchBackgroundMethod extends BaseBridgeMethod {

    /* renamed from: b */
    static final /* synthetic */ C52767h[] f75303b = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(UpdateGeneralSearchBackgroundMethod.class), "mBridgeHandler", "getMBridgeHandler()Lcom/bytedance/ies/bullet/core/model/context/IContextProvider;"))};

    /* renamed from: c */
    public static final C28693a f75304c = new C28693a(null);

    /* renamed from: d */
    private final C52668f f75305d;

    /* renamed from: e */
    private final String f75306e = "updateGeneralSearchBackground";

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.search.jsbridge.bullet.UpdateGeneralSearchBackgroundMethod$a */
    public static final class C28693a {
        private C28693a() {
        }

        public /* synthetic */ C28693a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.search.jsbridge.bullet.UpdateGeneralSearchBackgroundMethod$b */
    static final class C28694b extends C52712l implements C52670a<C10327c<? extends C28196e>> {

        /* renamed from: a */
        final /* synthetic */ C10326b f75307a;

        C28694b(C10326b bVar) {
            this.f75307a = bVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.f75307a.mo18399b(C28196e.class);
        }
    }

    /* renamed from: d */
    public final String mo18313d() {
        return this.f75306e;
    }

    public UpdateGeneralSearchBackgroundMethod(C10326b bVar) {
        C52711k.m112240b(bVar, "contextProviderFactory");
        super(bVar);
        this.f75305d = C52732g.m112285a(new C28694b(bVar));
    }

    /* renamed from: a */
    public final void mo49906a(JSONObject jSONObject, C24112a aVar) {
        C52711k.m112240b(jSONObject, "params");
        C52711k.m112240b(aVar, "iReturn");
        try {
            C10327c cVar = (C10327c) this.f75305d.getValue();
            if (cVar != null) {
                cVar.mo18392b();
            }
            aVar.mo49911a((Object) new JSONArray());
        } catch (Exception e) {
            C28668d.m67931a(e, "UpdateGeneralSearchBackgroundMethod");
            aVar.mo49910a(0, e.getMessage());
        }
    }
}
