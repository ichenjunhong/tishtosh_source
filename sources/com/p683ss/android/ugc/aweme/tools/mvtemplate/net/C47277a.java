package com.p683ss.android.ugc.aweme.tools.mvtemplate.net;

import com.bytedance.common.utility.C9395d;
import com.p683ss.android.ugc.aweme.p1388at.C23290c;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import leakcanary.internal.LeakCanaryFileProvider;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.net.a */
public final class C47277a {

    /* renamed from: a */
    public static final C47278a f119363a = new C47278a(null);

    /* renamed from: b */
    private final Map<String, C23290c> f119364b = new LinkedHashMap();

    /* renamed from: c */
    private final Map<String, String> f119365c = new LinkedHashMap();

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.net.a$a */
    public static final class C47278a {
        private C47278a() {
        }

        public /* synthetic */ C47278a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: a */
    public final String mo94567a(String str) {
        C52711k.m112240b(str, LeakCanaryFileProvider.f132050j);
        String a = C9395d.m18571a(str);
        Map<String, String> map = this.f119365c;
        C52711k.m112236a((Object) a, "key");
        map.put(a, str);
        return a;
    }

    /* renamed from: b */
    public final String mo94569b(String str) {
        C52711k.m112240b(str, "key");
        String str2 = "";
        if (!this.f119365c.containsKey(str)) {
            return str2;
        }
        for (Entry entry : this.f119365c.entrySet()) {
            String str3 = (String) entry.getKey();
            String str4 = (String) entry.getValue();
            if (C52711k.m112239a((Object) str, (Object) str3)) {
                return str4;
            }
        }
        return str2;
    }

    /* renamed from: a */
    public final C23290c mo94566a(String str, String str2) {
        C52711k.m112240b(str, "key");
        C52711k.m112240b(str2, "algorithmName");
        Map<String, C23290c> map = this.f119364b;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return (C23290c) map.get(sb.toString());
    }

    /* renamed from: a */
    public final void mo94568a(String str, String str2, C23290c cVar) {
        C52711k.m112240b(str, "key");
        C52711k.m112240b(str2, "algorithmName");
        C52711k.m112240b(cVar, "value");
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        String sb2 = sb.toString();
        if (!this.f119364b.containsKey(sb2)) {
            this.f119364b.put(sb2, cVar);
        }
    }
}
