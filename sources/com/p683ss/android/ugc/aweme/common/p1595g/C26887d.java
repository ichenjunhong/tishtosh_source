package com.p683ss.android.ugc.aweme.common.p1595g;

import android.content.Context;
import com.p683ss.android.ugc.aweme.base.p1404a.p1405a.C23383ak;
import com.p683ss.android.ugc.aweme.base.p1404a.p1405a.C23390d;
import com.p683ss.android.ugc.aweme.common.p1595g.C26888e.C26889a;
import com.p683ss.android.ugc.aweme.shortvideo.C43857fz;

/* renamed from: com.ss.android.ugc.aweme.common.g.d */
public final class C26887d implements C26889a {
    /* renamed from: a */
    public final <T> T mo54841a(Context context, Class<T> cls) {
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null && cls != null && cls.isInterface() && C43857fz.class.equals(cls)) {
                T t = C23390d.f62416a.get(cls);
                if (t == null || !(t instanceof C23383ak)) {
                    t = new C23383ak(applicationContext);
                    C23390d.f62416a.put(cls, t);
                }
                return t;
            }
        }
        return null;
    }
}
