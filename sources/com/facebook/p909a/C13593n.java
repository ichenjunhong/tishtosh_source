package com.facebook.p909a;

import com.facebook.internal.C14295b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.a.n */
final class C13593n {

    /* renamed from: a */
    private List<C13568c> f35454a = new ArrayList();

    /* renamed from: b */
    private List<C13568c> f35455b = new ArrayList();

    /* renamed from: c */
    private int f35456c;

    /* renamed from: d */
    private C14295b f35457d;

    /* renamed from: e */
    private String f35458e;

    /* renamed from: f */
    private final int f35459f = 1000;

    /* renamed from: a */
    public final synchronized List<C13568c> mo25415a() {
        List<C13568c> list;
        list = this.f35454a;
        this.f35454a = new ArrayList();
        return list;
    }

    /* renamed from: a */
    public final synchronized void mo25417a(boolean z) {
        if (z) {
            try {
                this.f35454a.addAll(this.f35455b);
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f35455b.clear();
        this.f35456c = 0;
    }

    /* renamed from: a */
    public final synchronized void mo25416a(C13568c cVar) {
        if (this.f35454a.size() + this.f35455b.size() >= 1000) {
            this.f35456c++;
        } else {
            this.f35454a.add(cVar);
        }
    }

    public C13593n(C14295b bVar, String str) {
        this.f35457d = bVar;
        this.f35458e = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r7 = com.facebook.p909a.p912b.C13552c.m27372a(com.facebook.p909a.p912b.C13552c.C13554a.CUSTOM_APP_EVENTS, r5.f35457d, r5.f35458e, r9, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0078, code lost:
        if (r5.f35456c <= 0) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007a, code lost:
        r7.put("num_skipped_events", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0080, code lost:
        r7 = new org.json.JSONObject();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo25414a(com.facebook.GraphRequest r6, android.content.Context r7, boolean r8, boolean r9) {
        /*
            r5 = this;
            monitor-enter(r5)
            int r0 = r5.f35456c     // Catch:{ all -> 0x00a4 }
            java.util.List<com.facebook.a.c> r1 = r5.f35455b     // Catch:{ all -> 0x00a4 }
            boolean r2 = com.facebook.p909a.p912b.C13563g.f35391a     // Catch:{ all -> 0x00a4 }
            if (r2 == 0) goto L_0x0029
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x00a4 }
        L_0x000d:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x00a4 }
            if (r2 == 0) goto L_0x0029
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x00a4 }
            com.facebook.a.c r2 = (com.facebook.p909a.C13568c) r2     // Catch:{ all -> 0x00a4 }
            java.lang.String r2 = r2.getName()     // Catch:{ all -> 0x00a4 }
            java.util.Set<java.lang.String> r3 = com.facebook.p909a.p912b.C13563g.f35392b     // Catch:{ all -> 0x00a4 }
            boolean r2 = r3.contains(r2)     // Catch:{ all -> 0x00a4 }
            if (r2 == 0) goto L_0x000d
            r1.remove()     // Catch:{ all -> 0x00a4 }
            goto L_0x000d
        L_0x0029:
            java.util.List<com.facebook.a.c> r1 = r5.f35455b     // Catch:{ all -> 0x00a4 }
            java.util.List<com.facebook.a.c> r2 = r5.f35454a     // Catch:{ all -> 0x00a4 }
            r1.addAll(r2)     // Catch:{ all -> 0x00a4 }
            java.util.List<com.facebook.a.c> r1 = r5.f35454a     // Catch:{ all -> 0x00a4 }
            r1.clear()     // Catch:{ all -> 0x00a4 }
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch:{ all -> 0x00a4 }
            r1.<init>()     // Catch:{ all -> 0x00a4 }
            java.util.List<com.facebook.a.c> r2 = r5.f35455b     // Catch:{ all -> 0x00a4 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x00a4 }
        L_0x0040:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x00a4 }
            if (r3 == 0) goto L_0x0062
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x00a4 }
            com.facebook.a.c r3 = (com.facebook.p909a.C13568c) r3     // Catch:{ all -> 0x00a4 }
            boolean r4 = r3.isChecksumValid()     // Catch:{ all -> 0x00a4 }
            if (r4 == 0) goto L_0x0040
            if (r8 != 0) goto L_0x005a
            boolean r4 = r3.getIsImplicit()     // Catch:{ all -> 0x00a4 }
            if (r4 != 0) goto L_0x0040
        L_0x005a:
            org.json.JSONObject r3 = r3.getJSONObject()     // Catch:{ all -> 0x00a4 }
            r1.put(r3)     // Catch:{ all -> 0x00a4 }
            goto L_0x0040
        L_0x0062:
            int r8 = r1.length()     // Catch:{ all -> 0x00a4 }
            if (r8 != 0) goto L_0x006b
            r6 = 0
            monitor-exit(r5)     // Catch:{ all -> 0x00a4 }
            return r6
        L_0x006b:
            monitor-exit(r5)     // Catch:{ all -> 0x00a4 }
            com.facebook.a.b.c$a r8 = com.facebook.p909a.p912b.C13552c.C13554a.CUSTOM_APP_EVENTS     // Catch:{ JSONException -> 0x0080 }
            com.facebook.internal.b r2 = r5.f35457d     // Catch:{ JSONException -> 0x0080 }
            java.lang.String r3 = r5.f35458e     // Catch:{ JSONException -> 0x0080 }
            org.json.JSONObject r7 = com.facebook.p909a.p912b.C13552c.m27372a(r8, r2, r3, r9, r7)     // Catch:{ JSONException -> 0x0080 }
            int r8 = r5.f35456c     // Catch:{ JSONException -> 0x0080 }
            if (r8 <= 0) goto L_0x0085
            java.lang.String r8 = "num_skipped_events"
            r7.put(r8, r0)     // Catch:{ JSONException -> 0x0080 }
            goto L_0x0085
        L_0x0080:
            org.json.JSONObject r7 = new org.json.JSONObject
            r7.<init>()
        L_0x0085:
            r6.f35224f = r7
            android.os.Bundle r7 = r6.f35228j
            if (r7 != 0) goto L_0x0090
            android.os.Bundle r7 = new android.os.Bundle
            r7.<init>()
        L_0x0090:
            java.lang.String r8 = r1.toString()
            if (r8 == 0) goto L_0x009d
            java.lang.String r9 = "custom_events"
            r7.putString(r9, r8)
            r6.f35230l = r8
        L_0x009d:
            r6.f35228j = r7
            int r6 = r1.length()
            return r6
        L_0x00a4:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x00a4 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.p909a.C13593n.mo25414a(com.facebook.GraphRequest, android.content.Context, boolean, boolean):int");
    }
}
