package android.support.p030v4.app;

/* renamed from: android.support.v4.app.t */
final class C0686t {
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00a2  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m1973a(android.support.p030v4.app.C0658m r6, android.support.p030v4.app.Fragment r7, int r8, int r9, int r10, boolean r11) {
        /*
            r2 = 1
            r3 = 0
            r4 = 0
            r5 = 0
            r0 = r6
            r1 = r7
            r0.mo2256a(r1, r2, r3, r4, r5)     // Catch:{ Exception -> 0x000a }
            return
        L_0x000a:
            r6 = move-exception
            r8 = 1
            r9 = 0
            if (r7 == 0) goto L_0x0018
            java.lang.Class r10 = r7.getClass()     // Catch:{ Exception -> 0x0090 }
            java.lang.String r10 = r10.getName()     // Catch:{ Exception -> 0x0090 }
            goto L_0x001a
        L_0x0018:
            java.lang.String r10 = ""
        L_0x001a:
            android.app.Activity r11 = com.bytedance.ies.ugc.p694a.C11016e.m22312g()     // Catch:{ Exception -> 0x0090 }
            if (r11 == 0) goto L_0x0029
            java.lang.Class r11 = r11.getClass()     // Catch:{ Exception -> 0x0090 }
            java.lang.String r11 = r11.getName()     // Catch:{ Exception -> 0x0090 }
            goto L_0x002b
        L_0x0029:
            java.lang.String r11 = ""
        L_0x002b:
            com.ss.android.ugc.aweme.app.f.c r0 = com.p683ss.android.ugc.aweme.app.p1376f.C23088c.m56631a()     // Catch:{ Exception -> 0x0090 }
            java.lang.String r1 = "fragmentname"
            com.ss.android.ugc.aweme.app.f.c r0 = r0.mo47824a(r1, r10)     // Catch:{ Exception -> 0x0090 }
            java.lang.String r1 = "newState"
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x0090 }
            com.ss.android.ugc.aweme.app.f.c r0 = r0.mo47822a(r1, r2)     // Catch:{ Exception -> 0x0090 }
            java.lang.String r1 = "transit"
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)     // Catch:{ Exception -> 0x0090 }
            com.ss.android.ugc.aweme.app.f.c r0 = r0.mo47822a(r1, r2)     // Catch:{ Exception -> 0x0090 }
            java.lang.String r1 = "transitionStyle"
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)     // Catch:{ Exception -> 0x0090 }
            com.ss.android.ugc.aweme.app.f.c r0 = r0.mo47822a(r1, r2)     // Catch:{ Exception -> 0x0090 }
            java.lang.String r1 = "keepActive"
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r9)     // Catch:{ Exception -> 0x0090 }
            com.ss.android.ugc.aweme.app.f.c r0 = r0.mo47819a(r1, r2)     // Catch:{ Exception -> 0x0090 }
            java.lang.String r1 = "currentActivity"
            com.ss.android.ugc.aweme.app.f.c r11 = r0.mo47824a(r1, r11)     // Catch:{ Exception -> 0x0090 }
            java.lang.String r0 = "errorMsg"
            java.lang.String r1 = android.util.Log.getStackTraceString(r6)     // Catch:{ Exception -> 0x0090 }
            com.ss.android.ugc.aweme.app.f.c r11 = r11.mo47824a(r0, r1)     // Catch:{ Exception -> 0x0090 }
            org.json.JSONObject r11 = r11.mo47825b()     // Catch:{ Exception -> 0x0090 }
            java.lang.String r0 = "fragment_crash_log"
            java.lang.String r1 = ""
            com.ss.android.ugc.aweme.app.f.c r2 = com.p683ss.android.ugc.aweme.app.p1376f.C23088c.m56631a()     // Catch:{ Exception -> 0x0090 }
            java.lang.String r3 = "errorDesc"
            java.lang.String r11 = r11.toString()     // Catch:{ Exception -> 0x0090 }
            com.ss.android.ugc.aweme.app.f.c r11 = r2.mo47824a(r3, r11)     // Catch:{ Exception -> 0x0090 }
            java.lang.String r2 = "fragment_name"
            com.ss.android.ugc.aweme.app.f.c r10 = r11.mo47824a(r2, r10)     // Catch:{ Exception -> 0x0090 }
            org.json.JSONObject r10 = r10.mo47825b()     // Catch:{ Exception -> 0x0090 }
            com.p683ss.android.ugc.aweme.app.C23131p.m56692a(r0, r1, r10)     // Catch:{ Exception -> 0x0090 }
        L_0x0090:
            r10 = 3
            java.lang.Class[] r11 = new java.lang.Class[r10]
            java.lang.Class<com.ss.android.ugc.aweme.commercialize.views.d> r0 = com.p683ss.android.ugc.aweme.commercialize.views.C26722d.class
            r11[r9] = r0
            java.lang.Class<com.ss.android.ugc.aweme.commercialize.views.cards.o> r0 = com.p683ss.android.ugc.aweme.commercialize.views.cards.C26709o.class
            r11[r8] = r0
            r8 = 2
            java.lang.Class<com.ss.android.ugc.aweme.commercialize.views.form.a> r0 = com.p683ss.android.ugc.aweme.commercialize.views.form.C26731a.class
            r11[r8] = r0
        L_0x00a0:
            if (r9 >= r10) goto L_0x00ae
            r8 = r11[r9]
            boolean r8 = r8.isInstance(r7)
            if (r8 == 0) goto L_0x00ab
            return
        L_0x00ab:
            int r9 = r9 + 1
            goto L_0x00a0
        L_0x00ae:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p030v4.app.C0686t.m1973a(android.support.v4.app.m, android.support.v4.app.Fragment, int, int, int, boolean):void");
    }
}
