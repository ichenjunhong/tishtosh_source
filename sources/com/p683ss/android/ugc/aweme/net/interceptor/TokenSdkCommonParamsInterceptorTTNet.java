package com.p683ss.android.ugc.aweme.net.interceptor;

import android.os.SystemClock;
import com.bytedance.retrofit2.C12799u;
import com.bytedance.retrofit2.p830a.C12686c;
import com.bytedance.retrofit2.p833c.C12727a;
import com.bytedance.retrofit2.p833c.C12727a.C12728a;
import com.p683ss.android.common.applog.NetUtil;
import com.p683ss.android.common.util.NetworkUtils;
import com.p683ss.android.ugc.aweme.p1386ar.C23259b;
import java.util.HashMap;
import java.util.Map.Entry;
import okhttp3.C53673t;
import okhttp3.C53673t.C53674a;

/* renamed from: com.ss.android.ugc.aweme.net.interceptor.TokenSdkCommonParamsInterceptorTTNet */
public class TokenSdkCommonParamsInterceptorTTNet implements C12727a {

    /* renamed from: a */
    String f96253a;

    public TokenSdkCommonParamsInterceptorTTNet(String str) {
        this.f96253a = str;
    }

    /* renamed from: a */
    public final C12799u mo9544a(C12728a aVar) throws Exception {
        if (!(aVar.mo23901b() instanceof C23259b)) {
            return mo77256b(aVar);
        }
        C23259b bVar = (C23259b) aVar.mo23901b();
        if (bVar.f62194F > 0) {
            long uptimeMillis = SystemClock.uptimeMillis() - bVar.f62194F;
            bVar.mo48196a(bVar.f62196H, uptimeMillis);
            bVar.mo48197b(bVar.f62196H, uptimeMillis);
        }
        bVar.mo48195a(getClass().getSimpleName());
        bVar.f62194F = SystemClock.uptimeMillis();
        C12799u b = mo77256b(aVar);
        if (bVar.f62195G > 0) {
            long uptimeMillis2 = SystemClock.uptimeMillis() - bVar.f62195G;
            String simpleName = getClass().getSimpleName();
            bVar.mo48196a(simpleName, uptimeMillis2);
            bVar.mo48198c(simpleName, uptimeMillis2);
        }
        bVar.f62195G = SystemClock.uptimeMillis();
        return b;
    }

    /* renamed from: b */
    public final C12799u mo77256b(C12728a aVar) throws Exception {
        int serverTime = NetworkUtils.getServerTime();
        C12686c a = aVar.mo23899a();
        String str = a.f33321b;
        if (str != null && (str.contains("/passport/token/beat/") || str.contains("/passport/token/change/") || str.contains("/passport/user/logout/"))) {
            C53674a a2 = C53673t.m114180f(a.f33321b).mo111624j().mo111629a("ts", String.valueOf(serverTime)).mo111629a("app_type", this.f96253a);
            HashMap hashMap = new HashMap();
            NetUtil.putCommonParams(hashMap, true);
            for (Entry entry : hashMap.entrySet()) {
                a2.mo111629a((String) entry.getKey(), (String) entry.getValue());
            }
            a = a.mo23858b().mo23861a(a2.mo111632b().toString()).mo23864a();
        }
        return aVar.mo23900a(a);
    }
}
