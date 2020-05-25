package com.bytedance.p582g.p583a.p592d;

import android.text.TextUtils;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.g.a.d.k */
public class C10020k {

    /* renamed from: a */
    private static ConcurrentHashMap<String, C10009j> f27222a = new ConcurrentHashMap<>();

    /* renamed from: b */
    private static ConcurrentHashMap<String, List<String>> f27223b = new ConcurrentHashMap<>();

    /* renamed from: c */
    private static ConcurrentHashMap<String, List<String>> f27224c = new ConcurrentHashMap<>();

    /* renamed from: a */
    public static C10009j m20166a(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (f27222a.get(str) == null) {
                synchronized (C10020k.class) {
                    if (f27222a.get(str) == null) {
                        f27222a.put(str, new C10009j(str));
                    }
                }
            }
            return (C10009j) f27222a.get(str);
        }
        throw new IllegalArgumentException("param 'aid' is not allowed to assigned empty string");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0018, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void m20168a(java.lang.String r2, java.util.List<java.lang.String> r3) {
        /*
            java.lang.Class<com.bytedance.g.a.d.k> r0 = com.bytedance.p582g.p583a.p592d.C10020k.class
            monitor-enter(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0019 }
            if (r1 != 0) goto L_0x0017
            boolean r1 = com.bytedance.p582g.p583a.p592d.C10002f.m20113a(r3)     // Catch:{ all -> 0x0019 }
            if (r1 == 0) goto L_0x0010
            goto L_0x0017
        L_0x0010:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.List<java.lang.String>> r1 = f27224c     // Catch:{ all -> 0x0019 }
            r1.put(r2, r3)     // Catch:{ all -> 0x0019 }
            monitor-exit(r0)
            return
        L_0x0017:
            monitor-exit(r0)
            return
        L_0x0019:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p582g.p583a.p592d.C10020k.m20168a(java.lang.String, java.util.List):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0018, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void m20169b(java.lang.String r2, java.util.List<java.lang.String> r3) {
        /*
            java.lang.Class<com.bytedance.g.a.d.k> r0 = com.bytedance.p582g.p583a.p592d.C10020k.class
            monitor-enter(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0019 }
            if (r1 != 0) goto L_0x0017
            boolean r1 = com.bytedance.p582g.p583a.p592d.C10002f.m20113a(r3)     // Catch:{ all -> 0x0019 }
            if (r1 == 0) goto L_0x0010
            goto L_0x0017
        L_0x0010:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.List<java.lang.String>> r1 = f27223b     // Catch:{ all -> 0x0019 }
            r1.put(r2, r3)     // Catch:{ all -> 0x0019 }
            monitor-exit(r0)
            return
        L_0x0017:
            monitor-exit(r0)
            return
        L_0x0019:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p582g.p583a.p592d.C10020k.m20169b(java.lang.String, java.util.List):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0081, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void m20167a(android.content.Context r4, java.lang.String r5, org.json.JSONObject r6, com.bytedance.p582g.p583a.p592d.C10009j.C10018a r7) {
        /*
            java.lang.Class<com.bytedance.g.a.d.k> r0 = com.bytedance.p582g.p583a.p592d.C10020k.class
            monitor-enter(r0)
            if (r4 != 0) goto L_0x0007
            monitor-exit(r0)
            return
        L_0x0007:
            boolean r1 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0092 }
            if (r1 != 0) goto L_0x008a
            if (r6 == 0) goto L_0x0082
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.bytedance.g.a.d.j> r1 = f27222a     // Catch:{ all -> 0x0092 }
            java.lang.Object r1 = r1.get(r5)     // Catch:{ all -> 0x0092 }
            if (r1 == 0) goto L_0x0025
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.bytedance.g.a.d.j> r1 = f27222a     // Catch:{ all -> 0x0092 }
            java.lang.Object r1 = r1.get(r5)     // Catch:{ all -> 0x0092 }
            com.bytedance.g.a.d.j r1 = (com.bytedance.p582g.p583a.p592d.C10009j) r1     // Catch:{ all -> 0x0092 }
            boolean r1 = r1.f27184k     // Catch:{ all -> 0x0092 }
            if (r1 == 0) goto L_0x0025
            monitor-exit(r0)
            return
        L_0x0025:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.bytedance.g.a.d.j> r1 = f27222a     // Catch:{ all -> 0x0092 }
            java.lang.Object r1 = r1.get(r5)     // Catch:{ all -> 0x0092 }
            com.bytedance.g.a.d.j r1 = (com.bytedance.p582g.p583a.p592d.C10009j) r1     // Catch:{ all -> 0x0092 }
            if (r1 != 0) goto L_0x0039
            com.bytedance.g.a.d.j r1 = new com.bytedance.g.a.d.j     // Catch:{ all -> 0x0092 }
            r1.<init>(r5)     // Catch:{ all -> 0x0092 }
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.bytedance.g.a.d.j> r2 = f27222a     // Catch:{ all -> 0x0092 }
            r2.put(r5, r1)     // Catch:{ all -> 0x0092 }
        L_0x0039:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.List<java.lang.String>> r2 = f27224c     // Catch:{ all -> 0x0092 }
            java.lang.Object r2 = r2.remove(r5)     // Catch:{ all -> 0x0092 }
            java.util.List r2 = (java.util.List) r2     // Catch:{ all -> 0x0092 }
            if (r2 == 0) goto L_0x0053
            boolean r3 = com.bytedance.p582g.p583a.p592d.C10002f.m20113a(r2)     // Catch:{ all -> 0x0092 }
            if (r3 != 0) goto L_0x0053
            java.util.List<java.lang.String> r3 = r1.f27182i     // Catch:{ all -> 0x0092 }
            r3.clear()     // Catch:{ all -> 0x0092 }
            java.util.List<java.lang.String> r3 = r1.f27182i     // Catch:{ all -> 0x0092 }
            r3.addAll(r2)     // Catch:{ all -> 0x0092 }
        L_0x0053:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.List<java.lang.String>> r2 = f27223b     // Catch:{ all -> 0x0092 }
            java.lang.Object r5 = r2.remove(r5)     // Catch:{ all -> 0x0092 }
            java.util.List r5 = (java.util.List) r5     // Catch:{ all -> 0x0092 }
            if (r5 == 0) goto L_0x006d
            boolean r2 = com.bytedance.p582g.p583a.p592d.C10002f.m20113a(r5)     // Catch:{ all -> 0x0092 }
            if (r2 != 0) goto L_0x006d
            java.util.List<java.lang.String> r2 = r1.f27186m     // Catch:{ all -> 0x0092 }
            r2.clear()     // Catch:{ all -> 0x0092 }
            java.util.List<java.lang.String> r2 = r1.f27186m     // Catch:{ all -> 0x0092 }
            r2.addAll(r5)     // Catch:{ all -> 0x0092 }
        L_0x006d:
            if (r7 != 0) goto L_0x0078
            com.bytedance.g.a.d.j$1 r5 = new com.bytedance.g.a.d.j$1     // Catch:{ all -> 0x0092 }
            r5.<init>()     // Catch:{ all -> 0x0092 }
            r1.mo17986a(r4, r6, r5)     // Catch:{ all -> 0x0092 }
            goto L_0x0080
        L_0x0078:
            com.bytedance.g.a.d.j$3 r5 = new com.bytedance.g.a.d.j$3     // Catch:{ all -> 0x0092 }
            r5.<init>(r7)     // Catch:{ all -> 0x0092 }
            r1.mo17986a(r4, r6, r5)     // Catch:{ all -> 0x0092 }
        L_0x0080:
            monitor-exit(r0)
            return
        L_0x0082:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0092 }
            java.lang.String r5 = "param 'headerInfo' is not allowed to be null"
            r4.<init>(r5)     // Catch:{ all -> 0x0092 }
            throw r4     // Catch:{ all -> 0x0092 }
        L_0x008a:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0092 }
            java.lang.String r5 = "param 'aid' is not allowed to assigned empty string"
            r4.<init>(r5)     // Catch:{ all -> 0x0092 }
            throw r4     // Catch:{ all -> 0x0092 }
        L_0x0092:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p582g.p583a.p592d.C10020k.m20167a(android.content.Context, java.lang.String, org.json.JSONObject, com.bytedance.g.a.d.j$a):void");
    }
}
