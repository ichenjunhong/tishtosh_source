package com.p683ss.android.ugc.aweme.commercialize.utils;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.commercialize.feed.C25908e;
import com.p683ss.android.ugc.aweme.commercialize.log.C26088l;
import com.p683ss.android.ugc.aweme.commercialize.p1555e.C25735b;
import com.p683ss.android.ugc.aweme.commercialize.utils.p1582c.C26456b;
import com.p683ss.android.ugc.aweme.commercialize.utils.p1582c.p1583a.C26455c;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.miniapp.utils.C36917d;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.w */
public final class C26540w extends C26533q {
    /* renamed from: g */
    public static boolean m64257g(Context context, Aweme aweme) {
        if (aweme == null || aweme.getAwemeRawAd() == null) {
            return false;
        }
        return m64255c(context, aweme.getAwemeRawAd().getPackageName());
    }

    /* renamed from: d */
    public static boolean m64256d(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return false;
        }
        String path = Uri.parse(str).getPath();
        if (TextUtils.isEmpty(path) || !path.endsWith(".apk")) {
            return false;
        }
        if (!m64236b(context, str)) {
            C10691a.m21545b(context, context.getString(R.string.cfw)).mo19066a();
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m64255c(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return false;
        }
        if (!C26456b.m63968a(context)) {
            return C26455c.m63967a(context, str);
        }
        StringBuilder sb = new StringBuilder("market://details?id=");
        sb.append(str);
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(sb.toString()));
        intent.setPackage("com.android.vending");
        intent.addFlags(268435456);
        return m64210a(context, intent);
    }

    /* renamed from: b */
    private static void m64254b(Context context, Aweme aweme, C25908e eVar, int i, C25735b bVar) {
        eVar.mo53245a(i);
        if (eVar.mo53247c() && m64211a(context, aweme)) {
            if (i == 24 && aweme.isAppAd()) {
                C26088l.m63335c(context, aweme.getAwemeRawAd());
            }
        } else if (!C36917d.m83053a(context, aweme)) {
            if (!C26503d.m64053E(aweme) || !m64212a(context, aweme, i)) {
                m64257g(context, aweme);
            }
        }
    }

    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m64253a(android.content.Context r7, com.p683ss.android.ugc.aweme.feed.model.Aweme r8, com.p683ss.android.ugc.aweme.commercialize.feed.C25908e r9, int r10, com.p683ss.android.ugc.aweme.commercialize.p1555e.C25735b r11) {
        /*
            r0 = 0
            if (r7 != 0) goto L_0x0004
            return r0
        L_0x0004:
            if (r8 != 0) goto L_0x0007
            return r0
        L_0x0007:
            boolean r1 = r8.isAd()
            if (r1 != 0) goto L_0x000e
            return r0
        L_0x000e:
            if (r9 != 0) goto L_0x0015
            com.ss.android.ugc.aweme.commercialize.feed.e r9 = new com.ss.android.ugc.aweme.commercialize.feed.e
            r9.<init>()
        L_0x0015:
            r9.mo53240a(r7, r8)
            boolean r1 = r9.mo53244a()
            if (r1 != 0) goto L_0x001f
            return r0
        L_0x001f:
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r1 = r8.getAwemeRawAd()
            java.lang.String r1 = r1.getType()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L_0x002e
            return r0
        L_0x002e:
            java.lang.String r2 = "app"
            boolean r2 = android.text.TextUtils.equals(r1, r2)
            r3 = 5
            r4 = 4
            r5 = 1
            if (r2 != 0) goto L_0x0067
            if (r10 == r5) goto L_0x0062
            r2 = 34
            if (r10 == r2) goto L_0x0062
            r2 = 18
            if (r10 == r2) goto L_0x0062
            if (r10 == r4) goto L_0x0062
            r2 = 35
            if (r10 == r2) goto L_0x0062
            r2 = 22
            if (r10 == r2) goto L_0x0062
            if (r10 == r3) goto L_0x0062
            r2 = 36
            if (r10 == r2) goto L_0x0062
            r2 = 23
            if (r10 == r2) goto L_0x0062
            r2 = 7
            if (r10 == r2) goto L_0x0062
            r2 = 37
            if (r10 == r2) goto L_0x0062
            r2 = 38
            if (r10 != r2) goto L_0x0067
        L_0x0062:
            boolean r7 = m64234b(r7, r8, r9, r10)
            return r7
        L_0x0067:
            r2 = 11
            if (r10 == r2) goto L_0x0112
            r2 = 14
            if (r10 == r2) goto L_0x0112
            r2 = 12
            if (r10 == r2) goto L_0x0112
            r2 = 13
            if (r10 == r2) goto L_0x0112
            r2 = 15
            if (r10 == r2) goto L_0x0112
            r2 = 27
            if (r10 == r2) goto L_0x0112
            r2 = 30
            if (r10 == r2) goto L_0x0112
            r2 = 28
            if (r10 == r2) goto L_0x0112
            r2 = 29
            if (r10 == r2) goto L_0x0112
            r2 = 31
            if (r10 == r2) goto L_0x0112
            r2 = 20
            if (r10 == r2) goto L_0x0112
            r2 = 19
            if (r10 == r2) goto L_0x0112
            r2 = 21
            if (r10 != r2) goto L_0x009d
            goto L_0x0112
        L_0x009d:
            r2 = -1
            int r6 = r1.hashCode()
            switch(r6) {
                case -1354573786: goto L_0x00e2;
                case 96801: goto L_0x00d8;
                case 117588: goto L_0x00ce;
                case 3083120: goto L_0x00c4;
                case 3148996: goto L_0x00ba;
                case 957829685: goto L_0x00b0;
                case 1893962841: goto L_0x00a6;
                default: goto L_0x00a5;
            }
        L_0x00a5:
            goto L_0x00ec
        L_0x00a6:
            java.lang.String r3 = "redpacket"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00ec
            r1 = 4
            goto L_0x00ed
        L_0x00b0:
            java.lang.String r4 = "counsel"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x00ec
            r1 = 5
            goto L_0x00ed
        L_0x00ba:
            java.lang.String r3 = "form"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00ec
            r1 = 3
            goto L_0x00ed
        L_0x00c4:
            java.lang.String r3 = "dial"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00ec
            r1 = 2
            goto L_0x00ed
        L_0x00ce:
            java.lang.String r3 = "web"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00ec
            r1 = 0
            goto L_0x00ed
        L_0x00d8:
            java.lang.String r3 = "app"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00ec
            r1 = 1
            goto L_0x00ed
        L_0x00e2:
            java.lang.String r3 = "coupon"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00ec
            r1 = 6
            goto L_0x00ed
        L_0x00ec:
            r1 = -1
        L_0x00ed:
            switch(r1) {
                case 0: goto L_0x010d;
                case 1: goto L_0x0109;
                case 2: goto L_0x0105;
                case 3: goto L_0x0100;
                case 4: goto L_0x00fb;
                case 5: goto L_0x00f6;
                case 6: goto L_0x00f1;
                default: goto L_0x00f0;
            }
        L_0x00f0:
            return r0
        L_0x00f1:
            boolean r7 = m64240c(r7, r8, r9, r10)
            return r7
        L_0x00f6:
            boolean r7 = m64213a(r7, r8, r9, r10)
            return r7
        L_0x00fb:
            boolean r7 = m64250f(r7, r8, r9, r10)
            return r7
        L_0x0100:
            boolean r7 = m64247e(r7, r8, r9, r10)
            return r7
        L_0x0105:
            m64243d(r7, r8, r9, r10)
            return r0
        L_0x0109:
            m64254b(r7, r8, r9, r10, r11)
            return r0
        L_0x010d:
            boolean r7 = m64234b(r7, r8, r9, r10)
            return r7
        L_0x0112:
            boolean r7 = m64234b(r7, r8, r9, r10)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.commercialize.utils.C26540w.m64253a(android.content.Context, com.ss.android.ugc.aweme.feed.model.Aweme, com.ss.android.ugc.aweme.commercialize.feed.e, int, com.ss.android.ugc.aweme.commercialize.e.b):boolean");
    }
}
