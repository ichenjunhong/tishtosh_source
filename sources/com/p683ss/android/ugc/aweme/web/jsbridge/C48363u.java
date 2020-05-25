package com.p683ss.android.ugc.aweme.web.jsbridge;

import com.bytedance.ies.p675g.p676a.C10762d;
import com.bytedance.ies.p675g.p676a.C10766h;
import com.p683ss.android.ugc.aweme.p1706fe.method.C29906l;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.u */
public final class C48363u implements C10762d {

    /* renamed from: a */
    public static final C48364a f121658a = new C48364a(null);

    /* renamed from: b */
    private static final boolean f121659b = false;

    /* renamed from: com.ss.android.ugc.aweme.web.jsbridge.u$a */
    public static final class C48364a {
        private C48364a() {
        }

        public /* synthetic */ C48364a(C52707g gVar) {
            this();
        }
    }

    public final void call(C10766h hVar, JSONObject jSONObject) {
        JSONObject jSONObject2;
        String str = "link_email_event";
        if (hVar != null) {
            jSONObject2 = hVar.f28947d;
        } else {
            jSONObject2 = null;
        }
        C47718bf.m103288a(new C29906l(str, jSONObject2));
    }
}
