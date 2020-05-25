package com.p683ss.android.ttvecamera.p1228c;

import com.p683ss.android.ttvecamera.C20296p;
import java.lang.reflect.Method;

/* renamed from: com.ss.android.ttvecamera.c.c */
public final class C20182c {
    /* renamed from: a */
    public static <T> T m49820a(String str, String str2, Object[] objArr) {
        try {
            Method a = m49821a(Class.forName(str), str2, objArr);
            a.setAccessible(true);
            return a.invoke(null, objArr);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("couldn't invoke ");
            sb.append(str2);
            sb.append(", ");
            sb.append(e);
            C20296p.m50062c("TEReflectUtil", sb.toString());
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0046, code lost:
        if (r12.length != 0) goto L_0x0041;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x004a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x004b A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.reflect.Method m49821a(java.lang.Class<? extends java.lang.Object> r10, java.lang.String r11, java.lang.Object[] r12) {
        /*
        L_0x0000:
            java.lang.reflect.Method[] r0 = r10.getDeclaredMethods()
            int r1 = r0.length
            r2 = 0
            r3 = 0
        L_0x0007:
            if (r3 >= r1) goto L_0x004e
            r4 = r0[r3]
            java.lang.String r5 = r4.getName()
            boolean r5 = r5.equals(r11)
            if (r5 == 0) goto L_0x004b
            java.lang.Class[] r5 = r4.getParameterTypes()
            r6 = 1
            if (r5 == 0) goto L_0x0043
            int r7 = r5.length
            if (r7 != 0) goto L_0x0020
            goto L_0x0043
        L_0x0020:
            if (r12 == 0) goto L_0x0041
            int r7 = r5.length
            int r8 = r12.length
            if (r7 == r8) goto L_0x0027
            goto L_0x0041
        L_0x0027:
            r7 = 0
        L_0x0028:
            int r8 = r5.length
            if (r7 >= r8) goto L_0x0048
            r8 = r12[r7]
            if (r8 == 0) goto L_0x003e
            r8 = r5[r7]
            r9 = r12[r7]
            java.lang.Class r9 = r9.getClass()
            boolean r8 = r8.isAssignableFrom(r9)
            if (r8 != 0) goto L_0x003e
            goto L_0x0041
        L_0x003e:
            int r7 = r7 + 1
            goto L_0x0028
        L_0x0041:
            r6 = 0
            goto L_0x0048
        L_0x0043:
            if (r12 == 0) goto L_0x0048
            int r5 = r12.length
            if (r5 != 0) goto L_0x0041
        L_0x0048:
            if (r6 == 0) goto L_0x004b
            return r4
        L_0x004b:
            int r3 = r3 + 1
            goto L_0x0007
        L_0x004e:
            java.lang.Class r10 = r10.getSuperclass()
            if (r10 == 0) goto L_0x0055
            goto L_0x0000
        L_0x0055:
            r10 = 0
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ttvecamera.p1228c.C20182c.m49821a(java.lang.Class, java.lang.String, java.lang.Object[]):java.lang.reflect.Method");
    }
}
