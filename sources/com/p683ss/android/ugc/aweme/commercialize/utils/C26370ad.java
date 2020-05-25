package com.p683ss.android.ugc.aweme.commercialize.utils;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.utils.C47795d;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.ad */
public final class C26370ad implements C26420be {
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0088, code lost:
        if (android.text.TextUtils.isEmpty(r0.getConsultUrl()) == false) goto L_0x00d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0093, code lost:
        if (android.text.TextUtils.isEmpty(r0.getRedUrl()) == false) goto L_0x00d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a4, code lost:
        if (com.p683ss.android.ugc.aweme.commercialize.utils.C26512f.m64111M(r8) == null) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00af, code lost:
        if (android.text.TextUtils.isEmpty(r0.getPhoneNumber()) == false) goto L_0x00d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00c7, code lost:
        if (android.text.TextUtils.isEmpty(r0) == false) goto L_0x00d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00d4, code lost:
        if (android.text.TextUtils.isEmpty(r4) != false) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00d6, code lost:
        r8 = true;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo54096a(com.p683ss.android.ugc.aweme.feed.model.Aweme r8, boolean r9) {
        /*
            r7 = this;
            r9 = 0
            if (r8 == 0) goto L_0x00dc
            boolean r0 = r8.isAd()
            if (r0 == 0) goto L_0x00dc
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r8.getAwemeRawAd()
            r1 = 1
            if (r0 == 0) goto L_0x00d8
            boolean r2 = r0.isDisableUserprofileAdLabel()
            if (r2 != 0) goto L_0x00d8
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r2 = r8.getAwemeRawAd()
            java.lang.String r2 = r2.getType()
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L_0x00d8
            java.lang.String r3 = r0.getOpenUrl()
            java.lang.String r4 = r0.getWebUrl()
            r5 = -1
            int r6 = r2.hashCode()
            switch(r6) {
                case -1354573786: goto L_0x0071;
                case 96801: goto L_0x0067;
                case 117588: goto L_0x005d;
                case 3083120: goto L_0x0053;
                case 3148996: goto L_0x0049;
                case 957829685: goto L_0x003f;
                case 1893962841: goto L_0x0035;
                default: goto L_0x0034;
            }
        L_0x0034:
            goto L_0x007b
        L_0x0035:
            java.lang.String r6 = "redpacket"
            boolean r2 = r2.equals(r6)
            if (r2 == 0) goto L_0x007b
            r2 = 5
            goto L_0x007c
        L_0x003f:
            java.lang.String r6 = "counsel"
            boolean r2 = r2.equals(r6)
            if (r2 == 0) goto L_0x007b
            r2 = 6
            goto L_0x007c
        L_0x0049:
            java.lang.String r6 = "form"
            boolean r2 = r2.equals(r6)
            if (r2 == 0) goto L_0x007b
            r2 = 4
            goto L_0x007c
        L_0x0053:
            java.lang.String r6 = "dial"
            boolean r2 = r2.equals(r6)
            if (r2 == 0) goto L_0x007b
            r2 = 3
            goto L_0x007c
        L_0x005d:
            java.lang.String r6 = "web"
            boolean r2 = r2.equals(r6)
            if (r2 == 0) goto L_0x007b
            r2 = 0
            goto L_0x007c
        L_0x0067:
            java.lang.String r6 = "app"
            boolean r2 = r2.equals(r6)
            if (r2 == 0) goto L_0x007b
            r2 = 2
            goto L_0x007c
        L_0x0071:
            java.lang.String r6 = "coupon"
            boolean r2 = r2.equals(r6)
            if (r2 == 0) goto L_0x007b
            r2 = 1
            goto L_0x007c
        L_0x007b:
            r2 = -1
        L_0x007c:
            switch(r2) {
                case 0: goto L_0x00ca;
                case 1: goto L_0x00ca;
                case 2: goto L_0x00b2;
                case 3: goto L_0x00a7;
                case 4: goto L_0x0096;
                case 5: goto L_0x008b;
                case 6: goto L_0x0080;
                default: goto L_0x007f;
            }
        L_0x007f:
            goto L_0x00d8
        L_0x0080:
            java.lang.String r8 = r0.getConsultUrl()
            boolean r8 = android.text.TextUtils.isEmpty(r8)
            if (r8 != 0) goto L_0x00d8
            goto L_0x00d6
        L_0x008b:
            java.lang.String r8 = r0.getRedUrl()
            boolean r8 = android.text.TextUtils.isEmpty(r8)
            if (r8 != 0) goto L_0x00d8
            goto L_0x00d6
        L_0x0096:
            java.lang.String r0 = r0.getFormUrl()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x00d6
            com.ss.android.ugc.aweme.feed.model.CardStruct r8 = com.p683ss.android.ugc.aweme.commercialize.utils.C26512f.m64111M(r8)
            if (r8 == 0) goto L_0x00d8
            goto L_0x00d6
        L_0x00a7:
            java.lang.String r8 = r0.getPhoneNumber()
            boolean r8 = android.text.TextUtils.isEmpty(r8)
            if (r8 != 0) goto L_0x00d8
            goto L_0x00d6
        L_0x00b2:
            if (r0 == 0) goto L_0x00d8
            java.lang.String r8 = r0.getOpenUrl()
            java.lang.String r0 = r0.getPackageName()
            boolean r8 = com.p683ss.android.ugc.aweme.commercialize.utils.C26540w.m64242c(r8)
            if (r8 == 0) goto L_0x00c3
            goto L_0x00d6
        L_0x00c3:
            boolean r8 = android.text.TextUtils.isEmpty(r0)
            if (r8 != 0) goto L_0x00d8
            goto L_0x00d6
        L_0x00ca:
            boolean r8 = com.p683ss.android.ugc.aweme.commercialize.utils.C26540w.m64242c(r3)
            if (r8 != 0) goto L_0x00d6
            boolean r8 = android.text.TextUtils.isEmpty(r4)
            if (r8 != 0) goto L_0x00d8
        L_0x00d6:
            r8 = 1
            goto L_0x00d9
        L_0x00d8:
            r8 = 0
        L_0x00d9:
            if (r8 == 0) goto L_0x00dc
            return r1
        L_0x00dc:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.commercialize.utils.C26370ad.mo54096a(com.ss.android.ugc.aweme.feed.model.Aweme, boolean):boolean");
    }

    /* renamed from: a */
    public final String mo54094a(Context context, Aweme aweme, boolean z) {
        return C26369ac.m63810a(context, aweme, false);
    }

    /* renamed from: a */
    public final void mo54095a(View view, int i, int i2, boolean z) {
        if (view != null) {
            int i3 = ((LayoutParams) view.getLayoutParams()).bottomMargin;
            if (z) {
                if (i3 < 0) {
                    C47795d.m103427a(view, i3, i, i2).start();
                }
            } else if (i3 >= 0) {
                C47795d.m103427a(view, i3, i, i2).start();
            }
        }
    }
}
