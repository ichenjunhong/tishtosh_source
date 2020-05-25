package com.p683ss.android.ugc.aweme.app.api;

import android.content.Context;
import com.bytedance.frameworks.baselib.network.http.p570c.p571a.C9859a;
import com.bytedance.frameworks.baselib.network.http.p570c.p571a.C9865e;
import com.bytedance.frameworks.baselib.network.http.p574e.C9912g;
import com.bytedance.retrofit2.p830a.C12683a;
import com.bytedance.retrofit2.p830a.C12683a.C12684a;
import com.bytedance.retrofit2.p830a.C12686c;
import com.bytedance.retrofit2.p830a.C12689e;
import com.bytedance.ttnet.C13303d;
import com.bytedance.ttnet.p886d.C13314c;
import java.io.IOException;

/* renamed from: com.ss.android.ugc.aweme.app.api.d */
public final class C22979d implements C12684a {

    /* renamed from: com.ss.android.ugc.aweme.app.api.d$a */
    static class C22981a implements C12683a {
        private C22981a() {
        }

        /* renamed from: a */
        public final C12689e mo9561a(C12686c cVar) throws IOException {
            Context a = C13303d.m26799b().mo24896a();
            C9865e a2 = C9865e.m19730a(a);
            if (C9912g.m19864a(a)) {
                C9865e.m19739a((C9859a) C13314c.m26812a());
            }
            return a2.mo9561a(cVar);
        }
    }

    /* renamed from: a */
    public final C12683a mo9562a() {
        return new C22981a();
    }
}
