package com.p683ss.android.ugc.aweme.base.p1404a.p1405a;

import android.content.Context;
import com.p683ss.android.ugc.aweme.main.C36606dx;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.ugc.aweme.base.a.a.g */
public final class C23393g {

    /* renamed from: a */
    public static Map<Class, Object> f62419a = new ConcurrentHashMap();

    /* renamed from: a */
    public static <T> T m57474a(Context context, Class<T> cls) {
        if (context == null) {
            return null;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null || !cls.isInterface() || !C36606dx.class.equals(cls)) {
            return null;
        }
        T t = f62419a.get(cls);
        if (t == null || !(t instanceof C23409w)) {
            t = new C23409w(applicationContext);
            f62419a.put(cls, t);
        }
        return t;
    }
}
