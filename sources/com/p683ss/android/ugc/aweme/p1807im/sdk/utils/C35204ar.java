package com.p683ss.android.ugc.aweme.p1807im.sdk.utils;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.ar */
public final class C35204ar {

    /* renamed from: a */
    public static final C35204ar f90493a = new C35204ar();

    private C35204ar() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003c A[Catch:{ Throwable -> 0x00e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005b A[Catch:{ Throwable -> 0x00e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0067 A[Catch:{ Throwable -> 0x00e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0103 A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m79584a(android.content.Context r9, java.lang.String r10) {
        /*
            java.lang.String r0 = "context"
            p2628d.p2639f.p2641b.C52711k.m112240b(r9, r0)
            r0 = r10
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0015
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0013
            goto L_0x0015
        L_0x0013:
            r0 = 0
            goto L_0x0016
        L_0x0015:
            r0 = 1
        L_0x0016:
            if (r0 == 0) goto L_0x0020
            java.lang.String r9 = "SafeUrlOpenHelper"
            java.lang.String r10 = "openUrl url empty"
            com.p683ss.android.ugc.aweme.p1807im.service.p1907i.C35459a.m80150b(r9, r10)
            return
        L_0x0020:
            com.ss.android.ugc.aweme.im.sdk.d.b r0 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34004b.m77717a()     // Catch:{ Throwable -> 0x00e5 }
            java.lang.String r3 = "AwemeImManager.instance()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r3)     // Catch:{ Throwable -> 0x00e5 }
            com.ss.android.ugc.aweme.im.service.j r0 = r0.mo71949f()     // Catch:{ Throwable -> 0x00e5 }
            r3 = 0
            if (r0 == 0) goto L_0x0039
            com.ss.android.ugc.aweme.im.service.model.e r0 = r0.getIMSetting()     // Catch:{ Throwable -> 0x00e5 }
            if (r0 == 0) goto L_0x0039
            java.lang.String r0 = r0.f91144b     // Catch:{ Throwable -> 0x00e5 }
            goto L_0x003a
        L_0x0039:
            r0 = r3
        L_0x003a:
            if (r0 == 0) goto L_0x0049
            android.net.Uri r3 = android.net.Uri.parse(r0)     // Catch:{ Throwable -> 0x00e5 }
            java.lang.String r4 = "Uri.parse(it)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)     // Catch:{ Throwable -> 0x00e5 }
            java.lang.String r3 = r3.getHost()     // Catch:{ Throwable -> 0x00e5 }
        L_0x0049:
            android.net.Uri r4 = android.net.Uri.parse(r10)     // Catch:{ Throwable -> 0x00e5 }
            java.lang.String r5 = "Uri.parse(url)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r5)     // Catch:{ Throwable -> 0x00e5 }
            java.lang.String r4 = r4.getHost()     // Catch:{ Throwable -> 0x00e5 }
            r5 = r3
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5     // Catch:{ Throwable -> 0x00e5 }
            if (r5 == 0) goto L_0x0064
            int r5 = r5.length()     // Catch:{ Throwable -> 0x00e5 }
            if (r5 != 0) goto L_0x0062
            goto L_0x0064
        L_0x0062:
            r5 = 0
            goto L_0x0065
        L_0x0064:
            r5 = 1
        L_0x0065:
            if (r5 != 0) goto L_0x00ae
            boolean r5 = p2628d.p2639f.p2641b.C52711k.m112239a(r3, r4)     // Catch:{ Throwable -> 0x00e5 }
            r5 = r5 ^ r2
            if (r5 == 0) goto L_0x00ae
            com.ss.android.ugc.aweme.router.y r5 = com.p683ss.android.ugc.aweme.router.C41311y.m91065a(r0)     // Catch:{ Throwable -> 0x00e5 }
            java.lang.String r6 = "target"
            com.ss.android.ugc.aweme.router.y r5 = r5.mo83870a(r6, r10)     // Catch:{ Throwable -> 0x00e5 }
            java.lang.String r6 = "aid"
            int r7 = com.bytedance.ies.ugc.p694a.C11010c.m22289j()     // Catch:{ Throwable -> 0x00e5 }
            com.ss.android.ugc.aweme.router.y r5 = r5.mo83868a(r6, r7)     // Catch:{ Throwable -> 0x00e5 }
            java.lang.String r6 = "lang"
            com.ss.android.ugc.aweme.im.sdk.d.b r7 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34004b.m77717a()     // Catch:{ Throwable -> 0x00e5 }
            java.lang.String r8 = "AwemeImManager.instance()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r7, r8)     // Catch:{ Throwable -> 0x00e5 }
            com.ss.android.ugc.aweme.im.service.j r7 = r7.mo71949f()     // Catch:{ Throwable -> 0x00e5 }
            java.lang.String r8 = "AwemeImManager.instance().proxy"
            p2628d.p2639f.p2641b.C52711k.m112236a(r7, r8)     // Catch:{ Throwable -> 0x00e5 }
            java.lang.String r7 = r7.getAppLanguage()     // Catch:{ Throwable -> 0x00e5 }
            com.ss.android.ugc.aweme.router.y r5 = r5.mo83870a(r6, r7)     // Catch:{ Throwable -> 0x00e5 }
            java.lang.String r6 = "version"
            long r7 = com.bytedance.ies.ugc.p694a.C11010c.m22293n()     // Catch:{ Throwable -> 0x00e5 }
            com.ss.android.ugc.aweme.router.y r5 = r5.mo83869a(r6, r7)     // Catch:{ Throwable -> 0x00e5 }
            java.lang.String r5 = r5.mo83871a()     // Catch:{ Throwable -> 0x00e5 }
            r1 = 1
            goto L_0x00af
        L_0x00ae:
            r5 = r10
        L_0x00af:
            java.lang.String r2 = "SafeUrlOpenHelper"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x00e3 }
            java.lang.String r7 = "openUrl url="
            r6.<init>(r7)     // Catch:{ Throwable -> 0x00e3 }
            r6.append(r10)     // Catch:{ Throwable -> 0x00e3 }
            java.lang.String r10 = ", urlHost="
            r6.append(r10)     // Catch:{ Throwable -> 0x00e3 }
            r6.append(r4)     // Catch:{ Throwable -> 0x00e3 }
            java.lang.String r10 = ", template="
            r6.append(r10)     // Catch:{ Throwable -> 0x00e3 }
            r6.append(r0)     // Catch:{ Throwable -> 0x00e3 }
            java.lang.String r10 = ", templateHost="
            r6.append(r10)     // Catch:{ Throwable -> 0x00e3 }
            r6.append(r3)     // Catch:{ Throwable -> 0x00e3 }
            java.lang.String r10 = ", jumpUrl="
            r6.append(r10)     // Catch:{ Throwable -> 0x00e3 }
            r6.append(r5)     // Catch:{ Throwable -> 0x00e3 }
            java.lang.String r10 = r6.toString()     // Catch:{ Throwable -> 0x00e3 }
            com.p683ss.android.ugc.aweme.p1807im.service.p1907i.C35459a.m80150b(r2, r10)     // Catch:{ Throwable -> 0x00e3 }
            goto L_0x00ec
        L_0x00e3:
            r0 = move-exception
            goto L_0x00e7
        L_0x00e5:
            r0 = move-exception
            r5 = r10
        L_0x00e7:
            java.lang.String r10 = "SafeUrlOpenHelper"
            com.p683ss.android.ugc.aweme.p1807im.service.p1907i.C35459a.m80149a(r10, r0)
        L_0x00ec:
            com.ss.android.ugc.aweme.im.sdk.d.b r10 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34004b.m77717a()
            java.lang.String r0 = "AwemeImManager.instance()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r10, r0)
            com.ss.android.ugc.aweme.im.service.j r10 = r10.mo71949f()
            if (r10 == 0) goto L_0x0103
            android.net.Uri r0 = android.net.Uri.parse(r5)
            r10.openUrl(r9, r0, r1)
            return
        L_0x0103:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35204ar.m79584a(android.content.Context, java.lang.String):void");
    }
}
