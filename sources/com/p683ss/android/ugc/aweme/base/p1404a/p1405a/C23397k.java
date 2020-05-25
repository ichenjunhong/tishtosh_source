package com.p683ss.android.ugc.aweme.base.p1404a.p1405a;

import android.content.Context;
import com.p683ss.android.ugc.aweme.shortvideo.model.IPublishPermissionCache;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.ugc.aweme.base.a.a.k */
public final class C23397k {

    /* renamed from: a */
    public static Map<Class, Object> f62422a = new ConcurrentHashMap();

    /* renamed from: a */
    public static <T> T m57479a(Context context, Class<T> cls) {
        if (context == null) {
            return null;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null || cls == null || !cls.isInterface() || !IPublishPermissionCache.class.equals(cls)) {
            return null;
        }
        T t = f62422a.get(cls);
        if (t == null || !(t instanceof C23385am)) {
            t = new C23385am(applicationContext);
            f62422a.put(cls, t);
        }
        return t;
    }
}
