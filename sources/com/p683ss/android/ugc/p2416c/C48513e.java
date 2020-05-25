package com.p683ss.android.ugc.p2416c;

import com.p683ss.android.ugc.p2416c.C48514f.C48518c;
import java.lang.reflect.Method;
import java.util.Map;

/* renamed from: com.ss.android.ugc.c.e */
public final class C48513e implements C48518c {

    /* renamed from: a */
    private Map<Class, Method> f121956a;

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0038, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void m104948a(java.lang.Object r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            java.util.Map<java.lang.Class, java.lang.reflect.Method> r0 = r5.f121956a     // Catch:{ all -> 0x003b }
            if (r0 == 0) goto L_0x000f
            java.util.Map<java.lang.Class, java.lang.reflect.Method> r0 = r5.f121956a     // Catch:{ all -> 0x003b }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x003b }
            if (r0 != 0) goto L_0x000f
            monitor-exit(r5)
            return
        L_0x000f:
            java.lang.Class r6 = r6.getClass()     // Catch:{ Exception -> 0x0039 }
            java.lang.reflect.Method[] r6 = r6.getDeclaredMethods()     // Catch:{ Exception -> 0x0039 }
            if (r6 == 0) goto L_0x0037
            int r0 = r6.length     // Catch:{ Exception -> 0x0039 }
            if (r0 != 0) goto L_0x001d
            goto L_0x0037
        L_0x001d:
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ Exception -> 0x0039 }
            int r1 = r6.length     // Catch:{ Exception -> 0x0039 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0039 }
            int r1 = r6.length     // Catch:{ Exception -> 0x0039 }
            r2 = 0
        L_0x0025:
            if (r2 >= r1) goto L_0x0033
            r3 = r6[r2]     // Catch:{ Exception -> 0x0039 }
            java.lang.Class r4 = r3.getReturnType()     // Catch:{ Exception -> 0x0039 }
            r0.put(r4, r3)     // Catch:{ Exception -> 0x0039 }
            int r2 = r2 + 1
            goto L_0x0025
        L_0x0033:
            r5.f121956a = r0     // Catch:{ Exception -> 0x0039 }
            monitor-exit(r5)
            return
        L_0x0037:
            monitor-exit(r5)
            return
        L_0x0039:
            monitor-exit(r5)
            return
        L_0x003b:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.p2416c.C48513e.m104948a(java.lang.Object):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> T mo96007a(java.lang.Object r4, java.lang.Class<T> r5) {
        /*
            r3 = this;
            java.lang.Class r0 = r4.getClass()
            boolean r0 = r5.isAssignableFrom(r0)
            if (r0 == 0) goto L_0x000b
            return r4
        L_0x000b:
            com.ss.android.ugc.c.d$a r0 = com.p683ss.android.ugc.p2416c.C48510d.C48512a.INSTANCE
            com.ss.android.ugc.c.d r1 = r0.f121954b
            r2 = 0
            if (r1 != 0) goto L_0x0019
            com.ss.android.ugc.c.d r1 = new com.ss.android.ugc.c.d
            r1.<init>()
            r0.f121954b = r1
        L_0x0019:
            com.ss.android.ugc.c.d r0 = r0.f121954b
            if (r4 == 0) goto L_0x0038
            if (r5 != 0) goto L_0x0020
            goto L_0x0038
        L_0x0020:
            java.lang.Class r1 = r4.getClass()
            java.lang.String r1 = com.p683ss.android.ugc.p2416c.C48507a.m104944a(r1)
            java.util.Map<java.lang.String, com.ss.android.ugc.c.f$c> r0 = r0.f121951a
            java.lang.Object r0 = r0.get(r1)
            com.ss.android.ugc.c.f$c r0 = (com.p683ss.android.ugc.p2416c.C48514f.C48518c) r0
            if (r0 != 0) goto L_0x0033
            goto L_0x0038
        L_0x0033:
            java.lang.Object r0 = r0.mo96007a(r4, r5)
            goto L_0x0039
        L_0x0038:
            r0 = r2
        L_0x0039:
            if (r0 == 0) goto L_0x003c
            return r0
        L_0x003c:
            java.util.Map<java.lang.Class, java.lang.reflect.Method> r0 = r3.f121956a
            if (r0 == 0) goto L_0x0048
            java.util.Map<java.lang.Class, java.lang.reflect.Method> r0 = r3.f121956a
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x004b
        L_0x0048:
            r3.m104948a(r4)
        L_0x004b:
            java.util.Map<java.lang.Class, java.lang.reflect.Method> r0 = r3.f121956a
            if (r0 == 0) goto L_0x006c
            java.util.Map<java.lang.Class, java.lang.reflect.Method> r0 = r3.f121956a
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0058
            goto L_0x006c
        L_0x0058:
            java.util.Map<java.lang.Class, java.lang.reflect.Method> r0 = r3.f121956a     // Catch:{ Throwable -> 0x006b }
            java.lang.Object r5 = r0.get(r5)     // Catch:{ Throwable -> 0x006b }
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5     // Catch:{ Throwable -> 0x006b }
            if (r5 != 0) goto L_0x0063
            return r2
        L_0x0063:
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ Throwable -> 0x006b }
            java.lang.Object r4 = r5.invoke(r4, r0)     // Catch:{ Throwable -> 0x006b }
            return r4
        L_0x006b:
            return r2
        L_0x006c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.p2416c.C48513e.mo96007a(java.lang.Object, java.lang.Class):java.lang.Object");
    }
}
