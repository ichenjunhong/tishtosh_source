package com.p683ss.android.sdk.webview;

import android.net.Uri;
import com.bytedance.ies.p675g.p677b.C10805r;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52686q;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.sdk.webview.r */
public final class C19773r {

    /* renamed from: c */
    public static final HashMap<String, HashMap<String, String>> f54462c = new HashMap<>();

    /* renamed from: d */
    public static final C19774a f54463d = new C19774a(null);

    /* renamed from: a */
    public C19766m f54464a;

    /* renamed from: b */
    public final C10805r f54465b;

    /* renamed from: com.ss.android.sdk.webview.r$a */
    public static final class C19774a {
        private C19774a() {
        }

        public /* synthetic */ C19774a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.sdk.webview.r$b */
    public static final class C19775b extends C52712l implements C52686q<HashMap<String, String>, Boolean, JSONObject, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C19773r f54466a;

        /* renamed from: b */
        final /* synthetic */ Uri f54467b;

        public C19775b(C19773r rVar, Uri uri) {
            this.f54466a = rVar;
            this.f54467b = uri;
            super(3);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            String str;
            HashMap hashMap = (HashMap) obj;
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            JSONObject jSONObject = (JSONObject) obj3;
            C19773r rVar = this.f54466a;
            if (hashMap != null) {
                Map map = C19773r.f54462c;
                Uri uri = this.f54467b;
                C52711k.m112236a((Object) uri, "uri");
                String host = uri.getHost();
                C52711k.m112236a((Object) host, "uri.host");
                map.put(host, hashMap);
            }
            C10805r rVar2 = rVar.f54465b;
            if (rVar2 != null) {
                if (rVar2.f29033e) {
                    rVar2 = null;
                }
                if (rVar2 != null) {
                    if (booleanValue) {
                        str = "openConfigSuccess";
                    } else {
                        str = "openConfigError";
                    }
                    rVar2.mo19581a(str, jSONObject);
                }
            }
            return C52860x.f131107a;
        }
    }

    public C19773r(C10805r rVar) {
        this.f54465b = rVar;
    }
}
