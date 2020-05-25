package com.p683ss.android.ugc.aweme.base.p1404a.p1405a;

import android.content.Context;
import com.p683ss.android.ugc.aweme.profile.C39938k;
import com.p683ss.android.ugc.aweme.profile.C40732y;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.ugc.aweme.base.a.a.j */
public final class C23396j {

    /* renamed from: a */
    public static Map<Class, Object> f62421a = new ConcurrentHashMap();

    /* renamed from: a */
    public static <T> T m57478a(Context context, Class<T> cls) {
        if (context == null) {
            return null;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null || !cls.isInterface()) {
            return null;
        }
        if (C39938k.class.equals(cls)) {
            T t = f62421a.get(cls);
            if (t == null || !(t instanceof C23377ae)) {
                t = new C23377ae(applicationContext);
                f62421a.put(cls, t);
            }
            return t;
        } else if (!C40732y.class.equals(cls)) {
            return null;
        } else {
            T t2 = f62421a.get(cls);
            if (t2 == null || !(t2 instanceof C23378af)) {
                t2 = new C23378af(applicationContext);
                f62421a.put(cls, t2);
            }
            return t2;
        }
    }
}
