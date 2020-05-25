package com.p683ss.android.ugc.aweme.base.p1404a.p1405a;

import android.content.Context;
import com.p683ss.android.ugc.aweme.friends.C32502a;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.ugc.aweme.base.a.a.f */
public final class C23392f {

    /* renamed from: a */
    public static Map<Class, Object> f62418a = new ConcurrentHashMap();

    /* renamed from: a */
    public static <T> T m57473a(Context context, Class<T> cls) {
        if (context == null) {
            return null;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null || !cls.isInterface() || !C32502a.class.equals(cls)) {
            return null;
        }
        T t = f62418a.get(cls);
        if (t == null || !(t instanceof C23406t)) {
            t = new C23406t(applicationContext);
            f62418a.put(cls, t);
        }
        return t;
    }
}
