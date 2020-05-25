package com.bytedance.common.utility.p526f;

import com.bytedance.common.utility.C9431p;
import java.lang.reflect.Method;

/* renamed from: com.bytedance.common.utility.f.d */
public final class C9412d {
    /* renamed from: a */
    public static Object m18627a(Class<?> cls, String str, Object... objArr) {
        return m18626a(cls, str, null, null, objArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        r2 = r2.getDeclaredMethod(r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        r2 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0010 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.reflect.Method m18628a(java.lang.Class<?> r2, java.lang.String r3, java.lang.Class<?>[] r4) {
        /*
            r0 = 0
            if (r2 == 0) goto L_0x0017
            boolean r1 = com.bytedance.common.utility.C9431p.m18664a(r3)
            if (r1 == 0) goto L_0x000a
            goto L_0x0017
        L_0x000a:
            java.lang.reflect.Method r1 = r2.getMethod(r3, r4)     // Catch:{ Throwable -> 0x0010 }
            r2 = r1
            goto L_0x0016
        L_0x0010:
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r3, r4)     // Catch:{ Throwable -> 0x0015 }
            goto L_0x0016
        L_0x0015:
            r2 = r0
        L_0x0016:
            return r2
        L_0x0017:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.utility.p526f.C9412d.m18628a(java.lang.Class, java.lang.String, java.lang.Class[]):java.lang.reflect.Method");
    }

    /* renamed from: a */
    private static Object m18626a(Class<?> cls, String str, Class<?>[] clsArr, Object[] objArr, Object... objArr2) {
        if (cls == null || C9431p.m18664a(str)) {
            return null;
        }
        Object[] objArr3 = new Object[0];
        try {
            Method a = m18628a(cls, str, (Class<?>[]) new Class[0]);
            if (a == null) {
                return null;
            }
            a.setAccessible(true);
            if (objArr2 == null || objArr2.length <= 0) {
                return a.invoke(null, objArr3);
            }
            return a.invoke(objArr2[0], objArr3);
        } catch (Throwable unused) {
            return null;
        }
    }
}
