package com.p683ss.android.ugc.aweme.music.p1977e;

import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.music.e.g */
public final class C37382g {

    /* renamed from: a */
    public static final C37382g f95374a = new C37382g();

    /* renamed from: com.ss.android.ugc.aweme.music.e.g$a */
    public static final class C37383a {

        /* renamed from: a */
        private final HashMap<String, String> f95375a;

        /* renamed from: b */
        private final Builder f95376b;

        /* renamed from: a */
        public final Uri mo76658a() {
            for (Entry entry : this.f95375a.entrySet()) {
                this.f95376b.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
            }
            Uri build = this.f95376b.build();
            C52711k.m112236a((Object) build, "uriBuilder.build()");
            return build;
        }

        public C37383a(HashMap<String, String> hashMap, Builder builder) {
            C52711k.m112240b(hashMap, "paramsMap");
            C52711k.m112240b(builder, "uriBuilder");
            this.f95375a = hashMap;
            this.f95376b = builder;
        }

        /* renamed from: a */
        public final C37383a mo76659a(String str, String str2) {
            C52711k.m112240b(str, "key");
            C52711k.m112240b(str2, "value");
            if (!TextUtils.isEmpty((CharSequence) this.f95375a.get("rn_schema"))) {
                String uri = Uri.parse((String) this.f95375a.get("rn_schema")).buildUpon().appendQueryParameter(str, str2).build().toString();
                C52711k.m112236a((Object) uri, "Uri.parse(rnScheme).buil…              .toString()");
                this.f95375a.put("rn_schema", uri);
            }
            if (!TextUtils.isEmpty((CharSequence) this.f95375a.get("url"))) {
                String uri2 = Uri.parse((String) this.f95375a.get("url")).buildUpon().appendQueryParameter(str, str2).build().toString();
                C52711k.m112236a((Object) uri2, "Uri.parse(urlParam).buil…              .toString()");
                this.f95375a.put("url", uri2);
            }
            return this;
        }
    }

    private C37382g() {
    }

    /* renamed from: a */
    public static final C37383a m83707a(String str) {
        C52711k.m112240b(str, "uriString");
        HashMap b = m83708b(str);
        Builder clearQuery = Uri.parse(str).buildUpon().clearQuery();
        C52711k.m112236a((Object) clearQuery, "uriBuilder");
        return new C37383a(b, clearQuery);
    }

    /* renamed from: b */
    private static HashMap<String, String> m83708b(String str) {
        if (TextUtils.isEmpty(str)) {
            return new HashMap<>();
        }
        Uri parse = Uri.parse(str);
        HashMap<String, String> hashMap = new HashMap<>();
        C52711k.m112236a((Object) parse, "uri");
        for (String str2 : parse.getQueryParameterNames()) {
            String queryParameter = parse.getQueryParameter(str2);
            if (!TextUtils.isEmpty(queryParameter)) {
                Map map = hashMap;
                C52711k.m112236a((Object) str2, "queryName");
                if (queryParameter == null) {
                    C52711k.m112234a();
                }
                map.put(str2, queryParameter);
            }
        }
        return hashMap;
    }
}
