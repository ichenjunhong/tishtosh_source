package com.p683ss.android.ugc.aweme.donation;

import com.bytedance.router.interceptor.IInterceptor;

/* renamed from: com.ss.android.ugc.aweme.donation.e */
public final class C29039e implements IInterceptor {
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0011  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean matchInterceptRules(com.bytedance.router.RouteIntent r5) {
        /*
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L_0x000e
            android.net.Uri r1 = r5.getUri()
            if (r1 == 0) goto L_0x000e
            java.lang.String r1 = r1.getHost()
            goto L_0x000f
        L_0x000e:
            r1 = r0
        L_0x000f:
            if (r5 == 0) goto L_0x001c
            android.net.Uri r5 = r5.getUri()
            if (r5 == 0) goto L_0x001c
            java.lang.String r5 = r5.getPath()
            goto L_0x001d
        L_0x001c:
            r5 = r0
        L_0x001d:
            java.lang.String r5 = p2628d.p2639f.p2641b.C52711k.m112231a(r1, r5)
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            java.lang.String r1 = "donation/pannel"
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r2 = 0
            r3 = 2
            boolean r5 = p2628d.p2650m.C52830p.m112456b(r5, r1, r2, r3, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.donation.C29039e.matchInterceptRules(com.bytedance.router.RouteIntent):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0041, code lost:
        if (r1 == null) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0053, code lost:
        if (r2 == null) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0065, code lost:
        if (r3 == null) goto L_0x0067;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0011  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onInterceptRoute(android.content.Context r9, com.bytedance.router.RouteIntent r10) {
        /*
            r8 = this;
            r0 = 0
            if (r10 == 0) goto L_0x000e
            android.net.Uri r1 = r10.getUri()
            if (r1 == 0) goto L_0x000e
            java.lang.String r1 = r1.getHost()
            goto L_0x000f
        L_0x000e:
            r1 = r0
        L_0x000f:
            if (r10 == 0) goto L_0x001c
            android.net.Uri r2 = r10.getUri()
            if (r2 == 0) goto L_0x001c
            java.lang.String r2 = r2.getPath()
            goto L_0x001d
        L_0x001c:
            r2 = r0
        L_0x001d:
            java.lang.String r1 = p2628d.p2639f.p2641b.C52711k.m112231a(r1, r2)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.String r2 = "donation/pannel"
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r3 = 2
            r4 = 0
            boolean r1 = p2628d.p2650m.C52830p.m112456b(r1, r2, r4, r3, r0)
            if (r1 == 0) goto L_0x00e3
            boolean r1 = r9 instanceof android.support.p030v4.app.FragmentActivity
            if (r1 == 0) goto L_0x00e3
            if (r10 == 0) goto L_0x0043
            android.content.Intent r1 = r10.getExtra()
            if (r1 == 0) goto L_0x0043
            java.lang.String r2 = "aweme_id"
            java.lang.String r1 = r1.getStringExtra(r2)
            if (r1 != 0) goto L_0x0045
        L_0x0043:
            java.lang.String r1 = ""
        L_0x0045:
            if (r10 == 0) goto L_0x0055
            android.content.Intent r2 = r10.getExtra()
            if (r2 == 0) goto L_0x0055
            java.lang.String r3 = "enter_from"
            java.lang.String r2 = r2.getStringExtra(r3)
            if (r2 != 0) goto L_0x0057
        L_0x0055:
            java.lang.String r2 = ""
        L_0x0057:
            if (r10 == 0) goto L_0x0067
            android.content.Intent r3 = r10.getExtra()
            if (r3 == 0) goto L_0x0067
            java.lang.String r4 = "enter_method"
            java.lang.String r3 = r3.getStringExtra(r4)
            if (r3 != 0) goto L_0x0069
        L_0x0067:
            java.lang.String r3 = ""
        L_0x0069:
            r4 = -1
            if (r10 == 0) goto L_0x0079
            android.content.Intent r5 = r10.getExtra()
            if (r5 == 0) goto L_0x0079
            java.lang.String r6 = "height"
            int r5 = r5.getIntExtra(r6, r4)
            goto L_0x007a
        L_0x0079:
            r5 = -1
        L_0x007a:
            if (r10 == 0) goto L_0x0088
            android.content.Intent r6 = r10.getExtra()
            if (r6 == 0) goto L_0x0088
            java.lang.String r0 = "log_pb"
            java.lang.String r0 = r6.getStringExtra(r0)
        L_0x0088:
            if (r10 == 0) goto L_0x0096
            android.content.Intent r10 = r10.getExtra()
            if (r10 == 0) goto L_0x0096
            java.lang.String r6 = "page_type"
            int r4 = r10.getIntExtra(r6, r4)
        L_0x0096:
            java.lang.String r10 = "aid"
            p2628d.p2639f.p2641b.C52711k.m112240b(r1, r10)
            java.lang.String r10 = "enterFrom"
            p2628d.p2639f.p2641b.C52711k.m112240b(r2, r10)
            java.lang.String r10 = "enterMethod"
            p2628d.p2639f.p2641b.C52711k.m112240b(r3, r10)
            com.ss.android.ugc.aweme.donation.b r10 = new com.ss.android.ugc.aweme.donation.b
            r10.<init>()
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            java.lang.String r7 = "aid"
            r6.putString(r7, r1)
            java.lang.String r1 = "enter_method"
            r6.putString(r1, r3)
            java.lang.String r1 = "enter_from"
            r6.putString(r1, r2)
            java.lang.String r1 = "height"
            r6.putInt(r1, r5)
            java.lang.String r1 = "log_pb"
            r6.putString(r1, r0)
            java.lang.String r0 = "page_type"
            r6.putInt(r0, r4)
            r10.setArguments(r6)
            if (r5 <= 0) goto L_0x00d4
            com.p683ss.android.ugc.aweme.donation.C29020b.f75943h = r5
        L_0x00d4:
            android.support.design.widget.c r10 = (android.support.design.widget.C0540c) r10
            android.support.v4.app.FragmentActivity r9 = (android.support.p030v4.app.FragmentActivity) r9
            android.support.v4.app.k r9 = r9.getSupportFragmentManager()
            java.lang.String r0 = "Covid19DonationFragment"
            r10.show(r9, r0)
            r9 = 1
            return r9
        L_0x00e3:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.donation.C29039e.onInterceptRoute(android.content.Context, com.bytedance.router.RouteIntent):boolean");
    }
}
