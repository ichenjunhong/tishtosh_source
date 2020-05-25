package com.p683ss.android.ugc.aweme;

import android.app.Application;
import com.p683ss.android.common.applog.GlobalContext;
import com.p683ss.android.ugc.aweme.IAccountService.C20835b;
import com.p683ss.android.ugc.aweme.IAccountService.C20838e;
import com.p683ss.android.ugc.aweme.IAccountUserService.C20841a;
import com.p683ss.android.ugc.aweme.framework.services.ServiceProvider;
import java.util.concurrent.ConcurrentHashMap;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.a */
public final class C20842a {

    /* renamed from: a */
    public static Application f56783a;

    /* renamed from: b */
    public static C23297av f56784b;

    /* renamed from: c */
    public static C20835b f56785c;

    /* renamed from: d */
    public static C23767bc f56786d;

    /* renamed from: e */
    public static C20841a f56787e;

    /* renamed from: f */
    public static C20838e f56788f;

    /* renamed from: g */
    public static String f56789g;

    /* renamed from: h */
    public static String f56790h;

    /* renamed from: i */
    public static final C20842a f56791i = new C20842a();

    /* renamed from: j */
    private static ConcurrentHashMap<Class<?>, ServiceProvider<?>> f56792j;

    /* renamed from: k */
    private static C23342b f56793k;

    private C20842a() {
    }

    /* renamed from: a */
    public static C23297av m53147a() {
        C23297av avVar = f56784b;
        if (avVar == null) {
            C52711k.m112237a("sNetworkApi");
        }
        return avVar;
    }

    /* renamed from: a */
    public static final <T> T m53148a(Class<T> cls) {
        C52711k.m112240b(cls, "clazz");
        ConcurrentHashMap<Class<?>, ServiceProvider<?>> concurrentHashMap = f56792j;
        if (concurrentHashMap == null) {
            C52711k.m112237a("sNeedServices");
        }
        if (concurrentHashMap.contains(cls)) {
            ConcurrentHashMap<Class<?>, ServiceProvider<?>> concurrentHashMap2 = f56792j;
            if (concurrentHashMap2 == null) {
                C52711k.m112237a("sNeedServices");
            }
            Object obj = concurrentHashMap2.get(cls);
            if (obj == null) {
                C52711k.m112234a();
            }
            return ((ServiceProvider) obj).get();
        }
        C23342b bVar = f56793k;
        if (bVar == null) {
            C52711k.m112237a("sServiceProvider");
        }
        ServiceProvider a = bVar.mo47683a(cls);
        if (a != null) {
            ConcurrentHashMap<Class<?>, ServiceProvider<?>> concurrentHashMap3 = f56792j;
            if (concurrentHashMap3 == null) {
                C52711k.m112237a("sNeedServices");
            }
            concurrentHashMap3.put(cls, a);
            return a.get();
        }
        StringBuilder sb = new StringBuilder("你没有在AccountSdkInitializer初始化中注册");
        sb.append(cls.getCanonicalName());
        throw new RuntimeException(sb.toString());
    }

    /* renamed from: a */
    public static final void m53149a(Application application, C23297av avVar, C20835b bVar, C23767bc bcVar, String str, C20841a aVar, C20838e eVar, String str2, C23342b bVar2) {
        C52711k.m112240b(application, "appContext");
        C52711k.m112240b(avVar, "networkApi");
        C52711k.m112240b(bVar, "userOperator");
        C52711k.m112240b(bcVar, "authorize");
        C52711k.m112240b(str, "liveDomain");
        C52711k.m112240b(aVar, "accountUserChangeListener");
        C52711k.m112240b(eVar, "interceptor");
        C52711k.m112240b(str2, "accountShareHost");
        C52711k.m112240b(bVar2, "serviceProvider");
        f56783a = application;
        f56784b = avVar;
        f56785c = bVar;
        f56786d = bcVar;
        f56788f = eVar;
        f56787e = aVar;
        f56792j = new ConcurrentHashMap<>();
        f56793k = bVar2;
        f56789g = str;
        f56790h = str2;
        GlobalContext.setContext(application);
    }
}
