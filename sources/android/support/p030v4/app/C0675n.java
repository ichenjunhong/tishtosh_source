package android.support.p030v4.app;

/* renamed from: android.support.v4.app.n */
final class C0675n {
    /* JADX WARNING: Removed duplicated region for block: B:16:0x009c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m1929a(android.support.p030v4.app.C0658m r4, android.support.p030v4.app.Fragment r5, int r6, int r7, int r8, boolean r9) {
        /*
            r4.mo2256a(r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x0004 }
            return
        L_0x0004:
            r4 = move-exception
            if (r5 == 0) goto L_0x0010
            java.lang.Class r0 = r5.getClass()     // Catch:{ Exception -> 0x0088 }
            java.lang.String r0 = r0.getName()     // Catch:{ Exception -> 0x0088 }
            goto L_0x0012
        L_0x0010:
            java.lang.String r0 = ""
        L_0x0012:
            android.app.Activity r1 = com.bytedance.ies.ugc.p694a.C11016e.m22312g()     // Catch:{ Exception -> 0x0088 }
            if (r1 == 0) goto L_0x0021
            java.lang.Class r1 = r1.getClass()     // Catch:{ Exception -> 0x0088 }
            java.lang.String r1 = r1.getName()     // Catch:{ Exception -> 0x0088 }
            goto L_0x0023
        L_0x0021:
            java.lang.String r1 = ""
        L_0x0023:
            com.ss.android.ugc.aweme.app.f.c r2 = com.p683ss.android.ugc.aweme.app.p1376f.C23088c.m56631a()     // Catch:{ Exception -> 0x0088 }
            java.lang.String r3 = "fragmentname"
            com.ss.android.ugc.aweme.app.f.c r2 = r2.mo47824a(r3, r0)     // Catch:{ Exception -> 0x0088 }
            java.lang.String r3 = "newState"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x0088 }
            com.ss.android.ugc.aweme.app.f.c r6 = r2.mo47822a(r3, r6)     // Catch:{ Exception -> 0x0088 }
            java.lang.String r2 = "transit"
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x0088 }
            com.ss.android.ugc.aweme.app.f.c r6 = r6.mo47822a(r2, r7)     // Catch:{ Exception -> 0x0088 }
            java.lang.String r7 = "transitionStyle"
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x0088 }
            com.ss.android.ugc.aweme.app.f.c r6 = r6.mo47822a(r7, r8)     // Catch:{ Exception -> 0x0088 }
            java.lang.String r7 = "keepActive"
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r9)     // Catch:{ Exception -> 0x0088 }
            com.ss.android.ugc.aweme.app.f.c r6 = r6.mo47819a(r7, r8)     // Catch:{ Exception -> 0x0088 }
            java.lang.String r7 = "currentActivity"
            com.ss.android.ugc.aweme.app.f.c r6 = r6.mo47824a(r7, r1)     // Catch:{ Exception -> 0x0088 }
            java.lang.String r7 = "errorMsg"
            java.lang.String r8 = android.util.Log.getStackTraceString(r4)     // Catch:{ Exception -> 0x0088 }
            com.ss.android.ugc.aweme.app.f.c r6 = r6.mo47824a(r7, r8)     // Catch:{ Exception -> 0x0088 }
            org.json.JSONObject r6 = r6.mo47825b()     // Catch:{ Exception -> 0x0088 }
            java.lang.String r7 = "fragment_crash_log"
            java.lang.String r8 = ""
            com.ss.android.ugc.aweme.app.f.c r9 = com.p683ss.android.ugc.aweme.app.p1376f.C23088c.m56631a()     // Catch:{ Exception -> 0x0088 }
            java.lang.String r1 = "errorDesc"
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x0088 }
            com.ss.android.ugc.aweme.app.f.c r6 = r9.mo47824a(r1, r6)     // Catch:{ Exception -> 0x0088 }
            java.lang.String r9 = "fragment_name"
            com.ss.android.ugc.aweme.app.f.c r6 = r6.mo47824a(r9, r0)     // Catch:{ Exception -> 0x0088 }
            org.json.JSONObject r6 = r6.mo47825b()     // Catch:{ Exception -> 0x0088 }
            com.p683ss.android.ugc.aweme.app.C23131p.m56692a(r7, r8, r6)     // Catch:{ Exception -> 0x0088 }
        L_0x0088:
            r6 = 3
            java.lang.Class[] r7 = new java.lang.Class[r6]
            java.lang.Class<com.ss.android.ugc.aweme.commercialize.views.d> r8 = com.p683ss.android.ugc.aweme.commercialize.views.C26722d.class
            r9 = 0
            r7[r9] = r8
            java.lang.Class<com.ss.android.ugc.aweme.commercialize.views.cards.o> r8 = com.p683ss.android.ugc.aweme.commercialize.views.cards.C26709o.class
            r0 = 1
            r7[r0] = r8
            r8 = 2
            java.lang.Class<com.ss.android.ugc.aweme.commercialize.views.form.a> r0 = com.p683ss.android.ugc.aweme.commercialize.views.form.C26731a.class
            r7[r8] = r0
        L_0x009a:
            if (r9 >= r6) goto L_0x00a8
            r8 = r7[r9]
            boolean r8 = r8.isInstance(r5)
            if (r8 == 0) goto L_0x00a5
            return
        L_0x00a5:
            int r9 = r9 + 1
            goto L_0x009a
        L_0x00a8:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p030v4.app.C0675n.m1929a(android.support.v4.app.m, android.support.v4.app.Fragment, int, int, int, boolean):void");
    }
}
