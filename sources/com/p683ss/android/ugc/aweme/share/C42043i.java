package com.p683ss.android.ugc.aweme.share;

/* renamed from: com.ss.android.ugc.aweme.share.i */
public final class C42043i {

    /* renamed from: a */
    public static final C42043i f106430a = new C42043i();

    private C42043i() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x007f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m92008a(com.p683ss.android.ugc.aweme.feed.model.Aweme r5, java.lang.String r6, java.lang.String r7) {
        /*
            java.lang.String r0 = "aweme"
            p2628d.p2639f.p2641b.C52711k.m112240b(r5, r0)
            java.lang.String r0 = "downloadMethod"
            p2628d.p2639f.p2641b.C52711k.m112240b(r7, r0)
            com.ss.android.ugc.aweme.app.f.d r0 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r1 = "group_id"
            java.lang.String r2 = r5.getAid()
            com.ss.android.ugc.aweme.app.f.d r1 = r0.mo47829a(r1, r2)
            java.lang.String r2 = "author_id"
            java.lang.String r3 = r5.getAuthorUid()
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
            java.lang.String r2 = "enter_from"
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r6)
            java.lang.String r2 = "download_type"
            com.ss.android.ugc.aweme.profile.model.User r3 = r5.getAuthor()
            if (r3 == 0) goto L_0x005a
            com.ss.android.ugc.aweme.IAccountService r3 = com.p683ss.android.ugc.aweme.account.C20854a.m53161a()
            com.ss.android.ugc.aweme.IAccountUserService r3 = r3.userService()
            java.lang.String r4 = "AccountProxyService.get().userService()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
            java.lang.String r3 = r3.getCurUserId()
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            com.ss.android.ugc.aweme.profile.model.User r4 = r5.getAuthor()
            if (r4 == 0) goto L_0x004e
            java.lang.String r4 = r4.getUid()
            goto L_0x004f
        L_0x004e:
            r4 = 0
        L_0x004f:
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r3 = android.text.TextUtils.equals(r3, r4)
            if (r3 == 0) goto L_0x005a
            java.lang.String r3 = "self"
            goto L_0x005c
        L_0x005a:
            java.lang.String r3 = "other"
        L_0x005c:
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
            java.lang.String r2 = "download_method"
            com.ss.android.ugc.aweme.app.f.d r7 = r1.mo47829a(r2, r7)
            java.lang.String r1 = "compilation_id"
            java.lang.String r2 = r5.getMixId()
            com.ss.android.ugc.aweme.app.f.d r7 = r7.mo47829a(r1, r2)
            java.lang.String r1 = "impr_type"
            java.lang.String r2 = com.p683ss.android.ugc.aweme.p1382aq.C23198ae.m56883s(r5)
            r7.mo47829a(r1, r2)
            boolean r7 = com.p683ss.android.ugc.aweme.p1382aq.C23198ae.m56860d(r6)
            if (r7 == 0) goto L_0x00b9
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            java.lang.String r7 = "homepage_fresh"
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            boolean r7 = android.text.TextUtils.equals(r6, r7)
            if (r7 != 0) goto L_0x0095
            java.lang.String r7 = "homepage_channel"
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            boolean r6 = android.text.TextUtils.equals(r6, r7)
            if (r6 == 0) goto L_0x00a8
        L_0x0095:
            boolean r6 = com.p683ss.android.ugc.aweme.p1912k.C35802a.m80931b()
            if (r6 == 0) goto L_0x00a8
            java.lang.String r6 = "tab_name"
            com.ss.android.ugc.aweme.share.ShareDependService r7 = com.p683ss.android.ugc.aweme.share.ShareDependService.C41922a.m91868a()
            java.lang.String r7 = r7.getLastTabIdI18n()
            r0.mo47829a(r6, r7)
        L_0x00a8:
            java.lang.String r6 = "log_pb"
            com.ss.android.ugc.aweme.feed.aa r7 = com.p683ss.android.ugc.aweme.feed.C29981aa.m70153a()
            java.lang.String r1 = com.p683ss.android.ugc.aweme.p1382aq.C23198ae.m56857c(r5)
            java.lang.String r7 = r7.mo60161a(r1)
            r0.mo47829a(r6, r7)
        L_0x00b9:
            com.ss.android.ugc.aweme.share.ShareDependService r6 = com.p683ss.android.ugc.aweme.share.ShareDependService.C41922a.m91868a()
            java.lang.String r7 = "download"
            java.lang.String r1 = "builder"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            r6.onEventV3IncludingPoiParams(r5, r7, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.share.C42043i.m92008a(com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, java.lang.String):void");
    }
}
