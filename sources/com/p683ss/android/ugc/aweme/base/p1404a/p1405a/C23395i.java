package com.p683ss.android.ugc.aweme.base.p1404a.p1405a;

import android.content.Context;
import com.p683ss.android.ugc.aweme.notice.api.p2008sp.C38050a;
import com.p683ss.android.ugc.aweme.notice.api.p2008sp.C38051b;
import com.p683ss.android.ugc.aweme.notice.api.p2008sp.C38052c;
import com.p683ss.android.ugc.aweme.notice.api.p2008sp.C38055e;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.ugc.aweme.base.a.a.i */
public final class C23395i {

    /* renamed from: a */
    public static Map<Class, Object> f62420a = new ConcurrentHashMap();

    /* renamed from: a */
    public static <T> T m57477a(Context context, Class<T> cls) {
        if (context == null) {
            return null;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null || cls == null || !cls.isInterface()) {
            return null;
        }
        if (C38050a.class.equals(cls)) {
            T t = f62420a.get(cls);
            if (t == null || !(t instanceof C23412z)) {
                t = new C23412z(applicationContext);
                f62420a.put(cls, t);
            }
            return t;
        } else if (C38051b.class.equals(cls)) {
            T t2 = f62420a.get(cls);
            if (t2 == null || !(t2 instanceof C23373aa)) {
                t2 = new C23373aa(applicationContext);
                f62420a.put(cls, t2);
            }
            return t2;
        } else if (C38055e.class.equals(cls)) {
            T t3 = f62420a.get(cls);
            if (t3 == null || !(t3 instanceof C23375ac)) {
                t3 = new C23375ac(applicationContext);
                f62420a.put(cls, t3);
            }
            return t3;
        } else if (!C38052c.class.equals(cls)) {
            return null;
        } else {
            T t4 = f62420a.get(cls);
            if (t4 == null || !(t4 instanceof C23374ab)) {
                t4 = new C23374ab(applicationContext);
                f62420a.put(cls, t4);
            }
            return t4;
        }
    }
}
