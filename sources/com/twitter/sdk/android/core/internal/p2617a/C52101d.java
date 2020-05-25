package com.twitter.sdk.android.core.internal.p2617a;

import com.twitter.sdk.android.core.C52188j;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterAuthToken;
import com.twitter.sdk.android.core.internal.oauth.C52131b;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import okhttp3.C53498ab;
import okhttp3.C53498ab.C53499a;
import okhttp3.C53500ac;
import okhttp3.C53504ad;
import okhttp3.C53668q;
import okhttp3.C53673t;
import okhttp3.C53673t.C53674a;
import okhttp3.C53676u;
import okhttp3.C53676u.C53677a;

/* renamed from: com.twitter.sdk.android.core.internal.a.d */
public final class C52101d implements C53676u {

    /* renamed from: a */
    final C52188j<? extends TwitterAuthToken> f129706a;

    /* renamed from: b */
    final TwitterAuthConfig f129707b;

    /* renamed from: a */
    private static Map<String, String> m111435a(C53498ab abVar) throws IOException {
        HashMap hashMap = new HashMap();
        if ("POST".equals(abVar.f132379b.toUpperCase(Locale.US))) {
            C53500ac acVar = abVar.f132381d;
            if (acVar instanceof C53668q) {
                C53668q qVar = (C53668q) acVar;
                for (int i = 0; i < qVar.mo111582a(); i++) {
                    hashMap.put(qVar.mo111583a(i), qVar.mo111585c(i));
                }
            }
        }
        return hashMap;
    }

    public final C53504ad intercept(C53677a aVar) throws IOException {
        int i;
        C53498ab a = aVar.mo111416a();
        C53499a a2 = a.mo111256a();
        C53673t tVar = a.f132378a;
        C53674a j = tVar.mo111624j();
        j.f133155g = null;
        int i2 = 0;
        if (tVar.f133146g != null) {
            i = tVar.f133146g.size() / 2;
        } else {
            i = 0;
        }
        while (i2 < i) {
            if (tVar.f133146g != null) {
                int i3 = i2 * 2;
                String b = C52103f.m111440b((String) tVar.f133146g.get(i3));
                if (tVar.f133146g != null) {
                    j.mo111631b(b, C52103f.m111440b((String) tVar.f133146g.get(i3 + 1)));
                    i2++;
                } else {
                    throw new IndexOutOfBoundsException();
                }
            } else {
                throw new IndexOutOfBoundsException();
            }
        }
        C53498ab c = a2.mo111268a(j.mo111632b()).mo111272c();
        return aVar.mo111417a(c.mo111256a().mo111263a("Authorization", new C52131b().mo108846a(this.f129707b, (TwitterAuthToken) this.f129706a.f129901a, null, c.f132379b, c.f132378a.toString(), m111435a(c))).mo111272c());
    }

    public C52101d(C52188j<? extends TwitterAuthToken> jVar, TwitterAuthConfig twitterAuthConfig) {
        this.f129706a = jVar;
        this.f129707b = twitterAuthConfig;
    }
}
