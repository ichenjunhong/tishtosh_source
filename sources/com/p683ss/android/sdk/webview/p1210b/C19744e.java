package com.p683ss.android.sdk.webview.p1210b;

import android.net.Uri;
import com.bytedance.ies.p675g.p677b.C10782e;
import com.bytedance.ies.p675g.p677b.C10783f;
import com.p683ss.android.sdk.webview.C19766m;
import com.p683ss.android.sdk.webview.C19773r;
import com.p683ss.android.sdk.webview.C19773r.C19775b;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.sdk.webview.b.e */
public final class C19744e extends C10782e<JSONObject, JSONObject> {

    /* renamed from: a */
    public static final C19745a f54409a = new C19745a(null);

    /* renamed from: b */
    private final C19773r f54410b;

    /* renamed from: com.ss.android.sdk.webview.b.e$a */
    public static final class C19745a {
        private C19745a() {
        }

        public /* synthetic */ C19745a(C52707g gVar) {
            this();
        }
    }

    public C19744e(C19773r rVar) {
        this.f54410b = rVar;
    }

    public final /* synthetic */ Object invoke(Object obj, C10783f fVar) {
        JSONObject jSONObject = (JSONObject) obj;
        C52711k.m112240b(jSONObject, "params");
        C52711k.m112240b(fVar, "context");
        C19773r rVar = this.f54410b;
        if (rVar != null) {
            String str = fVar.f28973b;
            C52711k.m112240b(jSONObject, "params");
            if (str != null) {
                Uri parse = Uri.parse(str);
                C19766m mVar = rVar.f54464a;
                if (mVar != null) {
                    mVar.mo41205a(jSONObject, new C19775b(rVar, parse));
                }
            }
        }
        return null;
    }
}
