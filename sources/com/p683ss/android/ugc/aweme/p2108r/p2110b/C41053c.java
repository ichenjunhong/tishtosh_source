package com.p683ss.android.ugc.aweme.p2108r.p2110b;

import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.r.b.c */
public final class C41053c {

    /* renamed from: a */
    public static final C41053c f104382a = new C41053c();

    /* renamed from: com.ss.android.ugc.aweme.r.b.c$a */
    public static final class C41054a {

        /* renamed from: a */
        private final HashMap<String, String> f104383a;

        /* renamed from: b */
        private final Builder f104384b;

        /* renamed from: a */
        public final Uri mo83572a() {
            for (Entry entry : this.f104383a.entrySet()) {
                this.f104384b.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
            }
            Uri build = this.f104384b.build();
            C52711k.m112236a((Object) build, "uriBuilder.build()");
            return build;
        }

        public C41054a(HashMap<String, String> hashMap, Builder builder) {
            C52711k.m112240b(hashMap, "paramsMap");
            C52711k.m112240b(builder, "uriBuilder");
            this.f104383a = hashMap;
            this.f104384b = builder;
        }
    }

    private C41053c() {
    }

    /* renamed from: a */
    public static final C41054a m90724a(String str) {
        HashMap hashMap;
        C52711k.m112240b(str, "uriString");
        if (TextUtils.isEmpty(str)) {
            hashMap = new HashMap();
        } else {
            Uri parse = Uri.parse(str);
            HashMap hashMap2 = new HashMap();
            C52711k.m112236a((Object) parse, "uri");
            for (String str2 : parse.getQueryParameterNames()) {
                String queryParameter = parse.getQueryParameter(str2);
                if (!TextUtils.isEmpty(queryParameter)) {
                    Map map = hashMap2;
                    C52711k.m112236a((Object) str2, "queryName");
                    if (queryParameter == null) {
                        C52711k.m112234a();
                    }
                    map.put(str2, queryParameter);
                }
            }
            hashMap = hashMap2;
        }
        Builder clearQuery = Uri.parse(str).buildUpon().clearQuery();
        C52711k.m112236a((Object) clearQuery, "uriBuilder");
        return new C41054a(hashMap, clearQuery);
    }
}
