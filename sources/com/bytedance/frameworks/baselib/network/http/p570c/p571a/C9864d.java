package com.bytedance.frameworks.baselib.network.http.p570c.p571a;

import com.bytedance.frameworks.baselib.network.http.C9894e;
import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;
import okhttp3.C53498ab;
import okhttp3.C53498ab.C53499a;
import okhttp3.C53504ad;
import okhttp3.C53671s.C53672a;
import okhttp3.C53676u;
import okhttp3.C53676u.C53677a;

/* renamed from: com.bytedance.frameworks.baselib.network.http.c.a.d */
public final class C9864d implements C53676u {
    public final C53504ad intercept(C53677a aVar) throws IOException {
        C53498ab a = aVar.mo111416a();
        Map a2 = C9894e.m19816a(a.f132378a.toString(), a.f132380c.mo111599e());
        if (a2 == null) {
            return aVar.mo111417a(a);
        }
        C53499a aVar2 = new C53499a();
        aVar2.mo111268a(a.f132378a);
        aVar2.mo111264a(a.f132379b, a.f132381d);
        aVar2.mo111261a(a.f132382e);
        C53672a d = a.f132380c.mo111598d();
        for (Entry entry : a2.entrySet()) {
            d.mo111604a((String) entry.getKey(), (String) entry.getValue());
        }
        aVar2.mo111267a(d.mo111605a());
        return aVar.mo111417a(aVar2.mo111272c());
    }
}
