package com.p683ss.android.ugc.aweme.p1706fe.method.commerce;

import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod.C29789a;
import com.p683ss.android.ugc.aweme.web.C48279i;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.fe.method.commerce.RefreshNavTitleMethod */
public final class RefreshNavTitleMethod extends BaseCommonJavaMethod {

    /* renamed from: a */
    public static final C29874a f77975a = new C29874a(null);

    /* renamed from: b */
    private final C48279i f77976b;

    /* renamed from: com.ss.android.ugc.aweme.fe.method.commerce.RefreshNavTitleMethod$a */
    public static final class C29874a {
        private C29874a() {
        }

        public /* synthetic */ C29874a(C52707g gVar) {
            this();
        }
    }

    public RefreshNavTitleMethod(C48279i iVar) {
        C52711k.m112240b(iVar, "eventObserver");
        this.f77976b = iVar;
    }

    /* renamed from: a */
    public final void mo49914a(JSONObject jSONObject, C29789a aVar) {
        if (jSONObject != null) {
            String optString = jSONObject.optString("title");
            if (optString != null) {
                this.f77976b.mo95779c(optString);
            }
        }
    }
}
