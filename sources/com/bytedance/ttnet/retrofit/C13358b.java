package com.bytedance.ttnet.retrofit;

import com.bytedance.frameworks.baselib.network.http.C9858c;
import com.bytedance.retrofit2.p830a.C12683a;
import com.bytedance.retrofit2.p830a.C12686c;
import com.bytedance.retrofit2.p830a.C12689e;
import com.bytedance.ttnet.C13281b;
import java.io.IOException;

/* renamed from: com.bytedance.ttnet.retrofit.b */
public final class C13358b implements C12683a {
    /* renamed from: a */
    public final C12689e mo9561a(C12686c cVar) throws IOException {
        C9858c cVar2;
        String str = cVar.f33321b;
        if (C13281b.m26758a()) {
            cVar2 = C13281b.f34661b.mo24891a();
        } else {
            cVar2 = C13281b.f34660a.mo24891a();
        }
        if (cVar2 != null) {
            return cVar2.mo9561a(cVar);
        }
        return null;
    }
}
