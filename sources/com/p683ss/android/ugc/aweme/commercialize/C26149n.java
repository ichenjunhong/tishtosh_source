package com.p683ss.android.ugc.aweme.commercialize;

import com.google.p1057b.p1065h.p1066a.C17832m;

/* renamed from: com.ss.android.ugc.aweme.commercialize.n */
final /* synthetic */ class C26149n implements Runnable {

    /* renamed from: a */
    private final PoiCouponInputActivity f69050a;

    /* renamed from: b */
    private final C17832m f69051b;

    /* renamed from: c */
    private final String f69052c;

    C26149n(PoiCouponInputActivity poiCouponInputActivity, C17832m mVar, String str) {
        this.f69050a = poiCouponInputActivity;
        this.f69051b = mVar;
        this.f69052c = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003a, code lost:
        if (r0.f67703c != null) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003c, code lost:
        r0.f67703c.cancel();
        r0.f67703c = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0043, code lost:
        r0.confirm.setImageResource(r0.f67702b);
        r0.confirm.setEnabled(r0.mo52716a());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0053, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0062, code lost:
        if (r0.f67703c == null) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0084, code lost:
        if (r0.f67703c == null) goto L_0x0043;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r6 = this;
            com.ss.android.ugc.aweme.commercialize.PoiCouponInputActivity r0 = r6.f69050a
            com.google.b.h.a.m r1 = r6.f69051b
            java.lang.String r2 = r6.f69052c
            r3 = 0
            java.lang.Object r1 = r1.get()     // Catch:{ InterruptedException -> 0x0081, ExecutionException -> 0x0056 }
            com.ss.android.ugc.aweme.commercialize.api.CouponRedeemApi$b r1 = (com.p683ss.android.ugc.aweme.commercialize.api.CouponRedeemApi.C25639b) r1     // Catch:{ InterruptedException -> 0x0081, ExecutionException -> 0x0056 }
            if (r1 == 0) goto L_0x0021
            int r4 = r1.statusCode     // Catch:{ InterruptedException -> 0x0081, ExecutionException -> 0x0056 }
            if (r4 == 0) goto L_0x0021
            android.content.Context r2 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()     // Catch:{ InterruptedException -> 0x0081, ExecutionException -> 0x0056 }
            java.lang.String r1 = r1.statusMsg     // Catch:{ InterruptedException -> 0x0081, ExecutionException -> 0x0056 }
            com.bytedance.ies.dmt.ui.d.a r1 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21551c(r2, r1)     // Catch:{ InterruptedException -> 0x0081, ExecutionException -> 0x0056 }
            r1.mo19066a()     // Catch:{ InterruptedException -> 0x0081, ExecutionException -> 0x0056 }
            goto L_0x0038
        L_0x0021:
            if (r1 == 0) goto L_0x0033
            com.ss.android.ugc.aweme.commercialize.api.CouponRedeemApi$a r4 = r1.coupon     // Catch:{ InterruptedException -> 0x0081, ExecutionException -> 0x0056 }
            if (r4 == 0) goto L_0x0033
            com.ss.android.ugc.aweme.commercialize.api.CouponRedeemApi$a r4 = r1.coupon     // Catch:{ InterruptedException -> 0x0081, ExecutionException -> 0x0056 }
            int r4 = r4.couponType     // Catch:{ InterruptedException -> 0x0081, ExecutionException -> 0x0056 }
            r5 = 10
            if (r4 != r5) goto L_0x0033
            com.p683ss.android.ugc.aweme.commercialize.CouponVerifyConsumptionSuccessActivity.m62097a(r0, r2)     // Catch:{ InterruptedException -> 0x0081, ExecutionException -> 0x0056 }
            goto L_0x0038
        L_0x0033:
            java.lang.String r4 = "input"
            com.p683ss.android.ugc.aweme.commercialize.PoiCouponRedeemActivity.m62123a(r0, r2, r1, r4)     // Catch:{ InterruptedException -> 0x0081, ExecutionException -> 0x0056 }
        L_0x0038:
            android.animation.ObjectAnimator r1 = r0.f67703c
            if (r1 == 0) goto L_0x0043
        L_0x003c:
            android.animation.ObjectAnimator r1 = r0.f67703c
            r1.cancel()
            r0.f67703c = r3
        L_0x0043:
            android.widget.ImageView r1 = r0.confirm
            int r2 = r0.f67702b
            r1.setImageResource(r2)
            android.widget.ImageView r1 = r0.confirm
            boolean r0 = r0.mo52716a()
            r1.setEnabled(r0)
            return
        L_0x0054:
            r1 = move-exception
            goto L_0x0065
        L_0x0056:
            r1 = 2132546915(0x7f1c1563, float:2.0747061E38)
            com.bytedance.ies.dmt.ui.d.a r1 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21542b(r0, r1)     // Catch:{ all -> 0x0054 }
            r1.mo19066a()     // Catch:{ all -> 0x0054 }
            android.animation.ObjectAnimator r1 = r0.f67703c
            if (r1 == 0) goto L_0x0043
            goto L_0x003c
        L_0x0065:
            android.animation.ObjectAnimator r2 = r0.f67703c
            if (r2 == 0) goto L_0x0070
            android.animation.ObjectAnimator r2 = r0.f67703c
            r2.cancel()
            r0.f67703c = r3
        L_0x0070:
            android.widget.ImageView r2 = r0.confirm
            int r3 = r0.f67702b
            r2.setImageResource(r3)
            android.widget.ImageView r2 = r0.confirm
            boolean r0 = r0.mo52716a()
            r2.setEnabled(r0)
            throw r1
        L_0x0081:
            android.animation.ObjectAnimator r1 = r0.f67703c
            if (r1 == 0) goto L_0x0043
            goto L_0x003c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.commercialize.C26149n.run():void");
    }
}
