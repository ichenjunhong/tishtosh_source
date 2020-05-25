package com.p683ss.android.ugc.aweme.profile.api;

/* renamed from: com.ss.android.ugc.aweme.profile.api.h */
public final class C39795h {

    /* renamed from: a */
    public static final C39795h f101569a = new C39795h();

    private C39795h() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0021 A[Catch:{ Exception -> 0x0058 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0022 A[Catch:{ Exception -> 0x0058 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m88517a(java.lang.String r4) {
        /*
            if (r4 != 0) goto L_0x0003
            return
        L_0x0003:
            android.net.Uri r4 = android.net.Uri.parse(r4)     // Catch:{ Exception -> 0x0058 }
            java.lang.String r0 = "uri"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r0)     // Catch:{ Exception -> 0x0058 }
            java.util.Set r0 = r4.getQueryParameterNames()     // Catch:{ Exception -> 0x0058 }
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1     // Catch:{ Exception -> 0x0058 }
            if (r1 == 0) goto L_0x001e
            boolean r1 = r1.isEmpty()     // Catch:{ Exception -> 0x0058 }
            if (r1 == 0) goto L_0x001c
            goto L_0x001e
        L_0x001c:
            r1 = 0
            goto L_0x001f
        L_0x001e:
            r1 = 1
        L_0x001f:
            if (r1 == 0) goto L_0x0022
            return
        L_0x0022:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x0058 }
            r1.<init>()     // Catch:{ Exception -> 0x0058 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x0058 }
        L_0x002b:
            boolean r2 = r0.hasNext()     // Catch:{ Exception -> 0x0058 }
            if (r2 == 0) goto L_0x0045
            java.lang.Object r2 = r0.next()     // Catch:{ Exception -> 0x0058 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x0058 }
            if (r2 != 0) goto L_0x003a
            goto L_0x002b
        L_0x003a:
            java.lang.String r3 = r4.getQueryParameter(r2)     // Catch:{ Exception -> 0x0058 }
            if (r3 != 0) goto L_0x0041
            goto L_0x002b
        L_0x0041:
            r1.put(r2, r3)     // Catch:{ Exception -> 0x0058 }
            goto L_0x002b
        L_0x0045:
            int r0 = r1.length()     // Catch:{ Exception -> 0x0058 }
            if (r0 > 0) goto L_0x004c
            return
        L_0x004c:
            com.ss.android.ugc.aweme.utils.ew r0 = com.p683ss.android.ugc.aweme.utils.C47865ew.m103536a()     // Catch:{ Exception -> 0x0058 }
            java.lang.String r4 = r4.getPath()     // Catch:{ Exception -> 0x0058 }
            r0.mo95080a(r4, r1)     // Catch:{ Exception -> 0x0058 }
            return
        L_0x0058:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.profile.api.C39795h.m88517a(java.lang.String):void");
    }
}
