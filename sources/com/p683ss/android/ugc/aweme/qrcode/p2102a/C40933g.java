package com.p683ss.android.ugc.aweme.qrcode.p2102a;

import com.p683ss.android.ugc.aweme.qrcode.p2102a.C40922a.C40923a;

/* renamed from: com.ss.android.ugc.aweme.qrcode.a.g */
public final class C40933g extends C40922a {
    public C40933g(C40923a aVar) {
        super(aVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x00b6 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00b7 A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo83412a(java.lang.String r6, int r7) {
        /*
            r5 = this;
            r7 = r6
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            r0 = 0
            r1 = 1
            if (r7 != 0) goto L_0x00b3
            if (r6 != 0) goto L_0x000f
            goto L_0x00b3
        L_0x000f:
            boolean r6 = com.p683ss.android.ugc.aweme.antiaddic.lock.ParentalPlatformManager.m55916a(r6)
            if (r6 == 0) goto L_0x00b3
            com.ss.android.ugc.aweme.IAccountUserService r6 = com.p683ss.android.ugc.aweme.account.C20902b.m53242a()
            java.lang.String r7 = "AccountUserProxyService.get()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r7)
            boolean r6 = r6.isLogin()
            if (r6 != 0) goto L_0x0067
            android.app.Activity r6 = com.bytedance.ies.ugc.p694a.C11016e.m22312g()
            if (r6 == 0) goto L_0x002d
            android.content.Context r6 = (android.content.Context) r6
            goto L_0x0031
        L_0x002d:
            android.content.Context r6 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
        L_0x0031:
            java.lang.String r7 = "qr_code_detail"
            java.lang.String r2 = "auto"
            java.lang.String r3 = "context"
            p2628d.p2639f.p2641b.C52711k.m112240b(r6, r3)
            java.lang.String r3 = "enterForm"
            p2628d.p2639f.p2641b.C52711k.m112240b(r7, r3)
            java.lang.String r3 = "enterMethod"
            p2628d.p2639f.p2641b.C52711k.m112240b(r2, r3)
            android.content.Intent r3 = new android.content.Intent
            java.lang.Class<com.ss.android.ugc.aweme.account.ui.FullScreenLoginActivity> r4 = com.p683ss.android.ugc.aweme.account.p1307ui.FullScreenLoginActivity.class
            r3.<init>(r6, r4)
            java.lang.String r4 = "enter_method"
            r3.putExtra(r4, r2)
            java.lang.String r2 = "enter_from"
            r3.putExtra(r2, r7)
            r6.startActivity(r3)
            android.content.Context r6 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            r7 = 2132546329(0x7f1c1319, float:2.0745873E38)
            com.bytedance.ies.dmt.ui.d.a r6 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21542b(r6, r7)
            r6.mo19066a()
            goto L_0x007f
        L_0x0067:
            com.ss.android.ugc.aweme.antiaddic.lock.d r6 = com.p683ss.android.ugc.aweme.antiaddic.lock.C22714d.f60914a
            com.ss.android.ugc.aweme.antiaddic.IParentalPlatformService$a r6 = r6.mo47119b()
            com.ss.android.ugc.aweme.antiaddic.IParentalPlatformService$a r7 = com.p683ss.android.ugc.aweme.antiaddic.IParentalPlatformService.C22687a.CLOSE
            if (r6 != r7) goto L_0x0081
            android.content.Context r6 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            r7 = 2132545875(0x7f1c1153, float:2.0744952E38)
            com.bytedance.ies.dmt.ui.d.a r6 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21542b(r6, r7)
            r6.mo19066a()
        L_0x007f:
            r6 = 1
            goto L_0x00b4
        L_0x0081:
            com.ss.android.ugc.aweme.app.v r6 = com.p683ss.android.ugc.aweme.app.C23183v.m56778a()
            java.lang.String r7 = "CommonSharePrefCache.inst()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r7)
            com.ss.android.ugc.aweme.app.bf r6 = r6.mo47912h()
            java.lang.String r7 = "CommonSharePrefCache.inst().isForceMinor"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r7)
            java.lang.Object r6 = r6.mo47782d()
            java.lang.String r7 = "CommonSharePrefCache.inst().isForceMinor.cache"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r7)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L_0x00b3
            android.content.Context r6 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            r7 = 2132544839(0x7f1c0d47, float:2.074285E38)
            com.bytedance.ies.dmt.ui.d.a r6 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21542b(r6, r7)
            r6.mo19066a()
            goto L_0x007f
        L_0x00b3:
            r6 = 0
        L_0x00b4:
            if (r6 == 0) goto L_0x00b7
            return r1
        L_0x00b7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.qrcode.p2102a.C40933g.mo83412a(java.lang.String, int):boolean");
    }
}
