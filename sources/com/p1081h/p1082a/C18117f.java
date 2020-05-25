package com.p1081h.p1082a;

import com.C2240a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.h.a.f */
final class C18117f implements C18118g {

    /* renamed from: a */
    private final ThreadLocal<String> f50155a = new ThreadLocal<>();

    /* renamed from: b */
    private final List<C18113b> f50156b = new ArrayList();

    C18117f() {
    }

    /* renamed from: a */
    public final void mo35499a(C18113b bVar) {
        this.f50156b.add(C18119h.m44335a(bVar));
    }

    /* renamed from: a */
    public final void mo35500a(String str, Object... objArr) {
        m44330a(3, (Throwable) null, str, objArr);
    }

    /* renamed from: a */
    private synchronized void m44330a(int i, Throwable th, String str, Object... objArr) {
        C18119h.m44335a(str);
        String str2 = (String) this.f50155a.get();
        if (str2 != null) {
            this.f50155a.remove();
        } else {
            str2 = null;
        }
        if (objArr != null) {
            if (objArr.length != 0) {
                str = C2240a.m6772a(str, objArr);
            }
        }
        m44329a(3, str2, str, (Throwable) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0036 A[Catch:{ all -> 0x001e }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0044 A[Catch:{ all -> 0x001e }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void m44329a(int r3, java.lang.String r4, java.lang.String r5, java.lang.Throwable r6) {
        /*
            r2 = this;
            monitor-enter(r2)
            if (r6 == 0) goto L_0x0020
            if (r5 == 0) goto L_0x0020
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x001e }
            r0.<init>()     // Catch:{ all -> 0x001e }
            r0.append(r5)     // Catch:{ all -> 0x001e }
            java.lang.String r5 = " : "
            r0.append(r5)     // Catch:{ all -> 0x001e }
            java.lang.String r5 = com.p1081h.p1082a.C18119h.m44336a(r6)     // Catch:{ all -> 0x001e }
            r0.append(r5)     // Catch:{ all -> 0x001e }
            java.lang.String r5 = r0.toString()     // Catch:{ all -> 0x001e }
            goto L_0x0020
        L_0x001e:
            r3 = move-exception
            goto L_0x0056
        L_0x0020:
            if (r6 == 0) goto L_0x0028
            if (r5 != 0) goto L_0x0028
            java.lang.String r5 = com.p1081h.p1082a.C18119h.m44336a(r6)     // Catch:{ all -> 0x001e }
        L_0x0028:
            if (r5 == 0) goto L_0x0033
            int r6 = r5.length()     // Catch:{ all -> 0x001e }
            if (r6 != 0) goto L_0x0031
            goto L_0x0033
        L_0x0031:
            r6 = 0
            goto L_0x0034
        L_0x0033:
            r6 = 1
        L_0x0034:
            if (r6 == 0) goto L_0x0038
            java.lang.String r5 = "Empty/NULL log message"
        L_0x0038:
            java.util.List<com.h.a.b> r6 = r2.f50156b     // Catch:{ all -> 0x001e }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x001e }
        L_0x003e:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x001e }
            if (r0 == 0) goto L_0x0054
            java.lang.Object r0 = r6.next()     // Catch:{ all -> 0x001e }
            com.h.a.b r0 = (com.p1081h.p1082a.C18113b) r0     // Catch:{ all -> 0x001e }
            boolean r1 = r0.mo22518a(r3, r4)     // Catch:{ all -> 0x001e }
            if (r1 == 0) goto L_0x003e
            r0.mo22517a(r3, r4, r5)     // Catch:{ all -> 0x001e }
            goto L_0x003e
        L_0x0054:
            monitor-exit(r2)
            return
        L_0x0056:
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p1081h.p1082a.C18117f.m44329a(int, java.lang.String, java.lang.String, java.lang.Throwable):void");
    }
}
