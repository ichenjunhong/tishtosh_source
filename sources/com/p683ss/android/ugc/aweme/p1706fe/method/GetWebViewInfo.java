package com.p683ss.android.ugc.aweme.p1706fe.method;

import android.webkit.WebView;
import com.bytedance.ies.p675g.p676a.C10757a;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod.C29789a;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.fe.method.GetWebViewInfo */
public final class GetWebViewInfo extends BaseCommonJavaMethod {

    /* renamed from: a */
    public static final C29802a f77822a = new C29802a(null);

    /* renamed from: com.ss.android.ugc.aweme.fe.method.GetWebViewInfo$a */
    public static final class C29802a {
        private C29802a() {
        }

        public /* synthetic */ C29802a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.GetWebViewInfo$b */
    public static final class C29803b {

        /* renamed from: a */
        public final int f77823a;

        /* renamed from: b */
        public final C29789a f77824b;

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C29803b) {
                    C29803b bVar = (C29803b) obj;
                    if (!(this.f77823a == bVar.f77823a) || !C52711k.m112239a((Object) this.f77824b, (Object) bVar.f77824b)) {
                        return false;
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            int hashCode = Integer.hashCode(this.f77823a) * 31;
            C29789a aVar = this.f77824b;
            return hashCode + (aVar != null ? aVar.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("GetStatusEvent(webViewHash=");
            sb.append(this.f77823a);
            sb.append(", iReturn=");
            sb.append(this.f77824b);
            sb.append(")");
            return sb.toString();
        }

        public C29803b(int i, C29789a aVar) {
            this.f77823a = i;
            this.f77824b = aVar;
        }
    }

    public GetWebViewInfo() {
        this(null, 1, null);
    }

    public GetWebViewInfo(C10757a aVar) {
        super(aVar);
    }

    /* renamed from: a */
    public final void mo49914a(JSONObject jSONObject, C29789a aVar) {
        int i;
        C10757a aVar2 = this.f77795g;
        if (aVar2 != null) {
            WebView webView = aVar2.f28930d;
            if (webView != null) {
                i = webView.hashCode();
                C47718bf.m103288a(new C29803b(i, aVar));
            }
        }
        i = 0;
        C47718bf.m103288a(new C29803b(i, aVar));
    }

    private /* synthetic */ GetWebViewInfo(C10757a aVar, int i, C52707g gVar) {
        this(null);
    }
}
