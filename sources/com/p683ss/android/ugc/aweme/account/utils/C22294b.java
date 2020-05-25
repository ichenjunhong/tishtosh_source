package com.p683ss.android.ugc.aweme.account.utils;

/* renamed from: com.ss.android.ugc.aweme.account.utils.b */
public final class C22294b {

    /* renamed from: a */
    public static final C22294b f60062a = new C22294b();

    private C22294b() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0040 A[Catch:{ Exception -> 0x00ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0090 A[ADDED_TO_REGION, Catch:{ Exception -> 0x00ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0096 A[Catch:{ Exception -> 0x00ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0098 A[Catch:{ Exception -> 0x00ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a1 A[ADDED_TO_REGION, Catch:{ Exception -> 0x00ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a7 A[Catch:{ Exception -> 0x00ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a9 A[Catch:{ Exception -> 0x00ef }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m55179a(int r11) {
        /*
            android.webkit.CookieManager r0 = android.webkit.CookieManager.getInstance()     // Catch:{ Exception -> 0x00ef }
            java.lang.String r1 = "tiktokv.com"
            java.lang.String r0 = r0.getCookie(r1)     // Catch:{ Exception -> 0x00ef }
            android.webkit.CookieManager r1 = android.webkit.CookieManager.getInstance()     // Catch:{ Exception -> 0x00ef }
            java.lang.String r2 = "musical.ly"
            java.lang.String r1 = r1.getCookie(r2)     // Catch:{ Exception -> 0x00ef }
            r2 = r0
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2     // Catch:{ Exception -> 0x00ef }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x00ef }
            r3 = 0
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 != 0) goto L_0x0036
            java.lang.String r2 = "cookie"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r2)     // Catch:{ Exception -> 0x00ef }
            r2 = r0
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2     // Catch:{ Exception -> 0x00ef }
            java.lang.String r7 = "sessionid"
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7     // Catch:{ Exception -> 0x00ef }
            boolean r2 = p2628d.p2650m.C52830p.m112456b(r2, r7, r6, r4, r3)     // Catch:{ Exception -> 0x00ef }
            if (r2 != 0) goto L_0x0034
            goto L_0x0036
        L_0x0034:
            r2 = 0
            goto L_0x0037
        L_0x0036:
            r2 = 1
        L_0x0037:
            r7 = r1
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7     // Catch:{ Exception -> 0x00ef }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ Exception -> 0x00ef }
            if (r7 != 0) goto L_0x0055
            java.lang.String r7 = "cookie2"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r7)     // Catch:{ Exception -> 0x00ef }
            r7 = r1
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7     // Catch:{ Exception -> 0x00ef }
            java.lang.String r8 = "sessionid"
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8     // Catch:{ Exception -> 0x00ef }
            boolean r3 = p2628d.p2650m.C52830p.m112456b(r7, r8, r6, r4, r3)     // Catch:{ Exception -> 0x00ef }
            if (r3 != 0) goto L_0x0053
            goto L_0x0055
        L_0x0053:
            r3 = 0
            goto L_0x0056
        L_0x0055:
            r3 = 1
        L_0x0056:
            if (r3 != 0) goto L_0x005a
            if (r2 == 0) goto L_0x00ef
        L_0x005a:
            android.content.Context r7 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()     // Catch:{ Exception -> 0x00ef }
            com.bytedance.ttnet.a.a r7 = com.bytedance.ttnet.p883a.C13258a.m26660a(r7)     // Catch:{ Exception -> 0x00ef }
            java.lang.String r8 = "musical.ly"
            java.util.List r8 = r7.mo17830d(r8)     // Catch:{ Exception -> 0x00ef }
            java.util.Collection r8 = (java.util.Collection) r8     // Catch:{ Exception -> 0x00ef }
            boolean r8 = com.p683ss.android.ugc.aweme.base.utils.C23715d.m58202a(r8)     // Catch:{ Exception -> 0x00ef }
            r8 = r8 ^ r5
            java.lang.String r9 = "tiktokv.com"
            java.util.List r7 = r7.mo17830d(r9)     // Catch:{ Exception -> 0x00ef }
            java.util.Collection r7 = (java.util.Collection) r7     // Catch:{ Exception -> 0x00ef }
            boolean r7 = com.p683ss.android.ugc.aweme.base.utils.C23715d.m58202a(r7)     // Catch:{ Exception -> 0x00ef }
            r7 = r7 ^ r5
            com.ss.android.ugc.aweme.app.f.d r9 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()     // Catch:{ Exception -> 0x00ef }
            java.lang.String r10 = "cookie1"
            com.ss.android.ugc.aweme.app.f.d r0 = r9.mo47829a(r10, r0)     // Catch:{ Exception -> 0x00ef }
            java.lang.String r9 = "cookie2"
            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r9, r1)     // Catch:{ Exception -> 0x00ef }
            java.lang.String r1 = "empty"
            if (r3 == 0) goto L_0x0094
            if (r2 == 0) goto L_0x0094
            r2 = 0
            goto L_0x0099
        L_0x0094:
            if (r3 == 0) goto L_0x0098
            r2 = 1
            goto L_0x0099
        L_0x0098:
            r2 = 2
        L_0x0099:
            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47826a(r1, r2)     // Catch:{ Exception -> 0x00ef }
            java.lang.String r1 = "in_share_cookie"
            if (r8 == 0) goto L_0x00a5
            if (r7 == 0) goto L_0x00a5
            r4 = 0
            goto L_0x00ad
        L_0x00a5:
            if (r8 == 0) goto L_0x00a9
            r4 = 1
            goto L_0x00ad
        L_0x00a9:
            if (r7 == 0) goto L_0x00ac
            goto L_0x00ad
        L_0x00ac:
            r4 = 3
        L_0x00ad:
            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47826a(r1, r4)     // Catch:{ Exception -> 0x00ef }
            if (r8 != 0) goto L_0x00e2
            if (r7 != 0) goto L_0x00e2
            java.lang.String r1 = "share_cookie"
            android.content.Context r2 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()     // Catch:{ Exception -> 0x00ef }
            java.lang.String r3 = "ss_app_config"
            android.content.SharedPreferences r2 = com.p683ss.android.ugc.aweme.keva.C35807d.m80935a(r2, r3, r6)     // Catch:{ Exception -> 0x00ef }
            java.lang.String r3 = "share_cookie_host_list"
            java.lang.String r4 = ""
            java.lang.String r2 = r2.getString(r3, r4)     // Catch:{ Exception -> 0x00ef }
            r0.mo47829a(r1, r2)     // Catch:{ Exception -> 0x00ef }
            java.lang.String r1 = "native_config"
            java.lang.StringBuilder r2 = com.p683ss.android.ugc.aweme.net.C37768e.f96232c     // Catch:{ Exception -> 0x00ef }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x00ef }
            r0.mo47829a(r1, r2)     // Catch:{ Exception -> 0x00ef }
            java.lang.String r1 = "app_config"
            java.lang.StringBuilder r2 = com.p683ss.android.ugc.aweme.net.corenet.IESNetDepend.f96207a     // Catch:{ Exception -> 0x00ef }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x00ef }
            r0.mo47829a(r1, r2)     // Catch:{ Exception -> 0x00ef }
        L_0x00e2:
            java.lang.String r1 = "enter_from"
            r0.mo47826a(r1, r11)     // Catch:{ Exception -> 0x00ef }
            java.lang.String r11 = "cookie_status"
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f61491a     // Catch:{ Exception -> 0x00ef }
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r11, r0)     // Catch:{ Exception -> 0x00ef }
            return
        L_0x00ef:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.account.utils.C22294b.m55179a(int):void");
    }
}
