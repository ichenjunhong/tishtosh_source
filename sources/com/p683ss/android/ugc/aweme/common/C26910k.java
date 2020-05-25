package com.p683ss.android.ugc.aweme.common;

import com.bytedance.common.utility.p526f.C9409b;
import java.lang.reflect.Constructor;

/* renamed from: com.ss.android.ugc.aweme.common.k */
public final class C26910k {
    /* renamed from: a */
    public static <T> T m65032a(String str, Class cls) {
        T t;
        try {
            t = C9409b.m18610a(str).mo17053a(new Object[0]).f25654a;
        } catch (Throwable unused) {
            t = null;
        }
        if (t == null) {
            Constructor[] declaredConstructors = cls.getDeclaredConstructors();
            int length = declaredConstructors.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                Constructor constructor = declaredConstructors[i];
                try {
                    constructor.setAccessible(true);
                    t = constructor.newInstance(new Object[0]);
                    break;
                } catch (Throwable unused2) {
                    i++;
                }
            }
        }
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("cannot find service in ");
        sb.append(str);
        sb.append("  or cannot create service through ");
        sb.append(cls.getSimpleName());
        throw new RuntimeException(sb.toString());
    }
}
