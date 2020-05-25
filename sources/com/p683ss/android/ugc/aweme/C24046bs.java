package com.p683ss.android.ugc.aweme;

import android.content.Context;
import com.p683ss.android.ugc.aweme.account.login.C22042y;
import com.p683ss.android.ugc.aweme.base.p1404a.p1405a.C23399m;

/* renamed from: com.ss.android.ugc.aweme.bs */
public final class C24046bs {
    /* renamed from: a */
    public static <T> T m58875a(Context context, Class<T> cls) {
        T t = null;
        if (context == null || cls == null || !cls.isInterface()) {
            return null;
        }
        if (C22042y.class.equals(cls)) {
            t = new C23399m(context);
        }
        return t;
    }
}
