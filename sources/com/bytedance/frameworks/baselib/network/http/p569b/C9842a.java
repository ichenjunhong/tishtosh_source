package com.bytedance.frameworks.baselib.network.http.p569b;

import com.bytedance.ies.bullet.kit.web.WebKitApi;
import java.io.IOException;
import java.net.CookieManager;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.bytedance.frameworks.baselib.network.http.b.a */
public final class C9842a extends CookieManager {

    /* renamed from: a */
    private C9847c f26790a;

    /* renamed from: b */
    private C9843b f26791b;

    public C9842a() {
        this(null, null);
    }

    /* renamed from: a */
    private static List<C9849e> m19676a(Map<String, List<String>> map) {
        ArrayList arrayList = new ArrayList();
        for (Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (str != null && (str.equalsIgnoreCase("Set-cookie") || str.equalsIgnoreCase("Set-cookie2"))) {
                for (String aVar : (List) entry.getValue()) {
                    try {
                        for (C9849e add : new C9851a(aVar).mo17692a()) {
                            arrayList.add(add);
                        }
                    } catch (IllegalArgumentException unused) {
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private static Map<String, List<String>> m19677a(List<C9849e> list) {
        if (list.isEmpty()) {
            return Collections.emptyMap();
        }
        StringBuilder sb = new StringBuilder();
        int i = 1;
        for (C9849e eVar : list) {
            i = Math.min(i, eVar.f26812l);
        }
        if (i == 1) {
            sb.append("$Version=\"1\"; ");
        }
        sb.append(((C9849e) list.get(0)).toString());
        for (int i2 = 1; i2 < list.size(); i2++) {
            sb.append("; ");
            sb.append(((C9849e) list.get(i2)).toString());
        }
        return Collections.singletonMap("Cookie", Collections.singletonList(sb.toString()));
    }

    public C9842a(C9847c cVar, C9843b bVar) {
        if (cVar == null) {
            cVar = new C9848d();
        }
        this.f26790a = cVar;
        if (bVar == null) {
            bVar = C9843b.f26794c;
        }
        this.f26791b = bVar;
    }

    public final Map<String, List<String>> get(URI uri, Map<String, List<String>> map) throws IOException {
        boolean z;
        if (uri == null || map == null) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList();
        for (C9849e eVar : this.f26790a.mo17682a(uri)) {
            if (C9849e.m19688a(eVar, uri)) {
                if (!eVar.f26809i || WebKitApi.SCHEME_HTTPS.equalsIgnoreCase(uri.getScheme())) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && C9849e.m19692b(eVar, uri)) {
                    arrayList.add(eVar);
                }
            }
        }
        return m19677a((List<C9849e>) arrayList);
    }

    public final void put(URI uri, Map<String, List<String>> map) throws IOException {
        String str;
        if (uri == null || map == null) {
            throw new IllegalArgumentException();
        }
        for (C9849e eVar : m19676a(map)) {
            if (eVar.f26804d == null) {
                eVar.mo17684a(uri.getHost());
            }
            if (eVar.f26807g == null) {
                String path = uri.getPath();
                if (path == null) {
                    str = "/";
                } else {
                    str = path.substring(0, path.lastIndexOf(47) + 1);
                }
                eVar.f26807g = str;
            } else if (!C9849e.m19688a(eVar, uri)) {
            }
            if ("".equals(eVar.f26808h)) {
                eVar.f26808h = Integer.toString(C9857h.getEffectivePort(uri.getScheme(), uri.getPort()));
            } else if (eVar.f26808h != null && !C9849e.m19692b(eVar, uri)) {
            }
            if (this.f26791b.mo17681a(uri, eVar)) {
                this.f26790a.mo17683a(uri, eVar);
            }
        }
    }
}
