package com.p683ss.android.ugc.aweme.web.jsbridge;

import com.bytedance.ies.p675g.p676a.C10757a;
import com.bytedance.ies.p675g.p676a.C10762d;
import com.bytedance.ies.p675g.p676a.C10766h;
import com.p683ss.android.ugc.aweme.commercialize.p1553d.C25720j;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.b */
public final class C48339b implements C10762d {

    /* renamed from: b */
    public static final C48340a f121622b = new C48340a(null);

    /* renamed from: a */
    public final C10757a f121623a;

    /* renamed from: com.ss.android.ugc.aweme.web.jsbridge.b$a */
    public static final class C48340a {
        private C48340a() {
        }

        public /* synthetic */ C48340a(C52707g gVar) {
            this();
        }
    }

    public C48339b(C10757a aVar) {
        this.f121623a = aVar;
    }

    public final void call(C10766h hVar, JSONObject jSONObject) {
        if (hVar != null) {
            hVar.f28951h = false;
            String str = hVar.f28946c;
            C52711k.m112236a((Object) str, "msg.func");
            C47718bf.m103288a(new C25720j(str, hVar.f28947d, hVar.f28945b, this.f121623a));
        }
    }
}
