package com.p683ss.android.ugc.aweme.base.p1404a.p1405a;

import android.content.Context;
import com.p683ss.android.ugc.aweme.effect.C29162c;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.ugc.aweme.base.a.a.l */
public final class C23398l {

    /* renamed from: a */
    public static Map<Class, Object> f62423a = new ConcurrentHashMap();

    /* renamed from: a */
    public static <T> T m57480a(Context context, Class<T> cls) {
        if (context == null) {
            return null;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null || cls == null || !cls.isInterface() || !C29162c.class.equals(cls)) {
            return null;
        }
        T t = f62423a.get(cls);
        if (t == null || !(t instanceof C23404r)) {
            t = new C23404r(applicationContext);
            f62423a.put(cls, t);
        }
        return t;
    }
}
