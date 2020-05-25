package com.p683ss.android.ugc.aweme.search.performance;

import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.discover.api.SearchApiNew;
import com.p683ss.android.ugc.aweme.discover.api.SearchApiNew.RealApi;
import com.p683ss.android.ugc.aweme.framework.services.IRetrofit;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.search.performance.d */
public class C41447d {

    /* renamed from: a */
    private static volatile boolean f105068a;

    /* renamed from: a */
    public static void m91261a() {
        if (!f105068a) {
            synchronized (C41447d.class) {
                if (!f105068a) {
                    C0013i.m16a(C41448e.f105069a).mo19a(C41449f.f105070a);
                    f105068a = true;
                }
            }
        }
    }

    /* renamed from: b */
    static final /* synthetic */ Object m91262b() throws Exception {
        try {
            IRetrofit a = SearchApiNew.m66834a();
            Object obj = m91263b(a.getClass(), "retrofit").get(a);
            Object invoke = m91260a(obj.getClass(), "getRetrofit").invoke(obj, new Object[0]);
            Method a2 = m91260a(RealApi.class, "searchMTMixFeedList");
            m91260a(invoke.getClass(), "loadServiceMethod").invoke(invoke, new Object[]{a2});
        } catch (Exception e) {
            if ("local_test".equals(C11010c.m22295p())) {
                throw e;
            }
        }
        return null;
    }

    /* renamed from: b */
    private static Field m91263b(Class cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField;
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static Method m91260a(Class cls, String str) {
        Method[] declaredMethods;
        for (Method method : cls.getDeclaredMethods()) {
            if (str.equals(method.getName())) {
                method.setAccessible(true);
                return method;
            }
        }
        return null;
    }
}
