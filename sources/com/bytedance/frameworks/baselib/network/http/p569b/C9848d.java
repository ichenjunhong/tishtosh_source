package com.bytedance.frameworks.baselib.network.http.p569b;

import com.bytedance.ies.bullet.kit.web.WebKitApi;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.bytedance.frameworks.baselib.network.http.b.d */
public final class C9848d implements C9847c {

    /* renamed from: a */
    private final Map<URI, List<C9849e>> f26795a = new HashMap();

    /* renamed from: b */
    private static URI m19684b(URI uri) {
        if (uri == null) {
            return null;
        }
        try {
            return new URI(WebKitApi.SCHEME_HTTP, uri.getHost(), null, null);
        } catch (URISyntaxException unused) {
            return uri;
        }
    }

    /* renamed from: a */
    public final synchronized List<C9849e> mo17682a(URI uri) {
        ArrayList arrayList;
        if (uri != null) {
            arrayList = new ArrayList();
            List list = (List) this.f26795a.get(uri);
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C9849e eVar = (C9849e) it.next();
                    if (eVar.mo17686a()) {
                        it.remove();
                    } else {
                        arrayList.add(eVar);
                    }
                }
            }
            for (Entry entry : this.f26795a.entrySet()) {
                if (!uri.equals(entry.getKey())) {
                    Iterator it2 = ((List) entry.getValue()).iterator();
                    while (it2.hasNext()) {
                        C9849e eVar2 = (C9849e) it2.next();
                        if (C9849e.m19690a(eVar2.f26804d, uri.getHost())) {
                            if (eVar2.mo17686a()) {
                                it2.remove();
                            } else if (!arrayList.contains(eVar2)) {
                                arrayList.add(eVar2);
                            }
                        }
                    }
                }
            }
        } else {
            throw new NullPointerException("uri == null");
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: a */
    public final synchronized void mo17683a(URI uri, C9849e eVar) {
        if (eVar != null) {
            URI b = m19684b(uri);
            List list = (List) this.f26795a.get(b);
            if (list == null) {
                list = new ArrayList();
                this.f26795a.put(b, list);
            } else {
                list.remove(eVar);
            }
            list.add(eVar);
        } else {
            throw new NullPointerException("cookie == null");
        }
    }
}
