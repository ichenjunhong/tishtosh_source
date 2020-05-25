package com.p683ss.android.ugc.aweme.services;

import android.content.Context;
import com.bytedance.retrofit2.C12799u;
import com.bytedance.retrofit2.p830a.C12686c;
import com.p683ss.android.ugc.aweme.C23285as;
import com.p683ss.android.ugc.aweme.account.util.C22281s;
import java.util.Collections;
import java.util.Map;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.services.BaseInterceptorService */
public class BaseInterceptorService implements C23285as {
    public boolean shouldIntercept(C12686c cVar) {
        C52711k.m112240b(cVar, "request");
        return false;
    }

    public Map<String, String> interceptAndGetNewParams(int i, C12686c cVar, C12799u<Object> uVar) {
        return Collections.emptyMap();
    }

    public Map<String, String> interceptAndGetNewParams(int i, String str, String str2) {
        return Collections.emptyMap();
    }

    public void promptIfNeededOrToast(Context context, String str, int i) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(str, "errorMsg");
        C22281s.m55136a(context, str, i);
    }
}
