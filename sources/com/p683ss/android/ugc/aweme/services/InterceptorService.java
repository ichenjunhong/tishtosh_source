package com.p683ss.android.ugc.aweme.services;

import com.bytedance.retrofit2.C12799u;
import com.bytedance.retrofit2.p830a.C12686c;
import com.p683ss.android.ugc.aweme.account.network.C22082c;
import java.util.Map;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.services.InterceptorService */
public final class InterceptorService extends BaseInterceptorService {
    public final boolean shouldIntercept(C12686c cVar) {
        C52711k.m112240b(cVar, "request");
        return false;
    }

    public final Map<String, String> interceptAndGetNewParams(int i, String str, String str2) {
        Map<String, String> a = C22082c.m54856a(i, str, str2);
        C52711k.m112236a((Object) a, "InterceptorHelper.interc…errorCode, url, response)");
        return a;
    }

    public final Map<String, String> interceptAndGetNewParams(int i, C12686c cVar, C12799u<Object> uVar) {
        String str;
        T t = null;
        if (cVar != null) {
            str = cVar.f33321b;
        } else {
            str = null;
        }
        if (uVar != null) {
            t = uVar.f33552b;
        }
        return interceptAndGetNewParams(i, str, String.valueOf(t));
    }
}
