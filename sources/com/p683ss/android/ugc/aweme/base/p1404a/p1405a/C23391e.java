package com.p683ss.android.ugc.aweme.base.p1404a.p1405a;

import android.content.Context;
import com.p683ss.android.ugc.aweme.shortvideo.edit.audioeffect.C43367d;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.ugc.aweme.base.a.a.e */
public final class C23391e {

    /* renamed from: a */
    public static Map<Class, Object> f62417a = new ConcurrentHashMap();

    /* renamed from: a */
    public static <T> T m57472a(Context context, Class<T> cls) {
        if (context == null) {
            return null;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null || cls == null || !cls.isInterface() || !C43367d.class.equals(cls)) {
            return null;
        }
        T t = f62417a.get(cls);
        if (t == null || !(t instanceof C23384al)) {
            t = new C23384al(applicationContext);
            f62417a.put(cls, t);
        }
        return t;
    }
}
