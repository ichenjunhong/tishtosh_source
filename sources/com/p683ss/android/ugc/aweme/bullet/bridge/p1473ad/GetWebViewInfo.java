package com.p683ss.android.ugc.aweme.bullet.bridge.p1473ad;

import android.webkit.WebView;
import com.bytedance.ies.bullet.p628b.p637g.p638a.C10326b;
import com.bytedance.ies.p675g.p676a.C10757a;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod.C24112a;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.ad.GetWebViewInfo */
public final class GetWebViewInfo extends BaseBridgeMethod {

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.ad.GetWebViewInfo$a */
    public static final class C24121a {

        /* renamed from: a */
        public final int f64003a;

        /* renamed from: b */
        public final C24112a f64004b;

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C24121a) {
                    C24121a aVar = (C24121a) obj;
                    if (!(this.f64003a == aVar.f64003a) || !C52711k.m112239a((Object) this.f64004b, (Object) aVar.f64004b)) {
                        return false;
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            int hashCode = Integer.hashCode(this.f64003a) * 31;
            C24112a aVar = this.f64004b;
            return hashCode + (aVar != null ? aVar.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("GetStatusEvent(webViewHash=");
            sb.append(this.f64003a);
            sb.append(", iReturn=");
            sb.append(this.f64004b);
            sb.append(")");
            return sb.toString();
        }

        public C24121a(int i, C24112a aVar) {
            this.f64003a = i;
            this.f64004b = aVar;
        }
    }

    /* renamed from: d */
    public final String mo18313d() {
        return "getWebViewInfo";
    }

    public GetWebViewInfo(C10326b bVar) {
        C52711k.m112240b(bVar, "contextProviderFactory");
        super(bVar);
    }

    /* renamed from: a */
    public final void mo49906a(JSONObject jSONObject, C24112a aVar) {
        int i;
        C52711k.m112240b(jSONObject, "params");
        C52711k.m112240b(aVar, "iReturn");
        C10757a aVar2 = (C10757a) this.f27647a.mo18401c(C10757a.class);
        if (aVar2 != null) {
            WebView webView = aVar2.f28930d;
            if (webView != null) {
                i = webView.hashCode();
                C47718bf.m103288a(new C24121a(i, aVar));
            }
        }
        i = 0;
        C47718bf.m103288a(new C24121a(i, aVar));
    }
}
