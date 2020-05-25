package com.p683ss.android.ugc.aweme.utils;

import com.bytedance.retrofit2.p833c.C12727a;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.lancet.ssretrofitchain.VerifyInterceptor;
import com.p683ss.android.ugc.aweme.net.InterceptorProvider;
import com.p683ss.android.ugc.aweme.net.interceptor.FeedRetryInterceptorTTNet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.utils.InterceptorHolder */
public class InterceptorHolder implements InterceptorProvider {
    public List<C12727a> getInterceptors() {
        return Arrays.asList(new C12727a[]{new VerifyInterceptor()});
    }

    public static InterceptorProvider createInterceptorProviderbyMonsterPlugin() {
        Object a = C27991b.m66756a(InterceptorProvider.class);
        if (a != null) {
            return (InterceptorProvider) a;
        }
        if (C27991b.f73457aN == null) {
            synchronized (InterceptorProvider.class) {
                if (C27991b.f73457aN == null) {
                    C27991b.f73457aN = new InterceptorHolder();
                }
            }
        }
        return (InterceptorHolder) C27991b.f73457aN;
    }

    public List<C12727a> getSpecialNetworkInterceptor(int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new FeedRetryInterceptorTTNet());
        return arrayList;
    }
}
