package com.p683ss.android.ugc.aweme.util;

import android.os.Bundle;
import android.text.TextUtils;
import com.appsflyer.AppsFlyerLib;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p683ss.android.ugc.aweme.util.p2386a.C47612a;

/* renamed from: com.ss.android.ugc.aweme.util.a */
public final class C47611a {
    /* renamed from: a */
    private static void m103063a() {
        if (C47612a.m103082c()) {
            C47612a.m103083d();
        }
    }

    /* renamed from: b */
    private static void m103068b() {
        int e = C47612a.m103084e() + 1;
        if (e == 5) {
            e = 0;
        }
        C47612a.m103078a(e);
    }

    /* renamed from: d */
    private static void m103073d(String str) {
        m103070b("fb_mobile_add_to_wishlist", "product", str);
    }

    /* renamed from: f */
    private static void m103075f(String str) {
        m103070b("fb_mobile_rate", "product", str);
    }

    /* renamed from: e */
    private static void m103074e(String str) {
        m103066a("like", "product", str);
        m103070b("fb_mobile_add_to_cart", "product", str);
    }

    /* renamed from: g */
    private static void m103076g(String str) {
        m103066a("follow", "product", str);
        m103070b("Subscribe", "product", str);
    }

    /* renamed from: a */
    public static void m103064a(String str) {
        AppsFlyerLib.getInstance().trackEvent(C11010c.m22280a(), str, null);
    }

    /* renamed from: b */
    private static void m103069b(String str) {
        m103066a("Video_content", "product", str);
        m103070b("fb_mobile_content_view", "product", str);
    }

    /* renamed from: c */
    private static void m103072c(String str) {
        Bundle bundle = new Bundle();
        bundle.putInt("fb_success", 1);
        m103071b("fb_mobile_search", "product", str, bundle);
        m103067a("search", "product", str, bundle);
    }

    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m103065a(java.lang.String r1, java.lang.String r2) {
        /*
            int r0 = r1.hashCode()
            switch(r0) {
                case -2090153577: goto L_0x0059;
                case -1617792023: goto L_0x004f;
                case -1101213402: goto L_0x0045;
                case -906336856: goto L_0x003b;
                case 70775934: goto L_0x0030;
                case 109413407: goto L_0x0026;
                case 1263148345: goto L_0x001c;
                case 2026292779: goto L_0x0012;
                case 2026292783: goto L_0x0008;
                default: goto L_0x0007;
            }
        L_0x0007:
            goto L_0x0063
        L_0x0008:
            java.lang.String r0 = "mus_af_like_video_5"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0063
            r1 = 3
            goto L_0x0064
        L_0x0012:
            java.lang.String r0 = "mus_af_like_video_1"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0063
            r1 = 2
            goto L_0x0064
        L_0x001c:
            java.lang.String r0 = "mus_af_comment"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0063
            r1 = 0
            goto L_0x0064
        L_0x0026:
            java.lang.String r0 = "shoot"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0063
            r1 = 7
            goto L_0x0064
        L_0x0030:
            java.lang.String r0 = "start_upload"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0063
            r1 = 8
            goto L_0x0064
        L_0x003b:
            java.lang.String r0 = "search"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0063
            r1 = 5
            goto L_0x0064
        L_0x0045:
            java.lang.String r0 = "collect_video"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0063
            r1 = 4
            goto L_0x0064
        L_0x004f:
            java.lang.String r0 = "video_view"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0063
            r1 = 6
            goto L_0x0064
        L_0x0059:
            java.lang.String r0 = "mus_af_follow"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0063
            r1 = 1
            goto L_0x0064
        L_0x0063:
            r1 = -1
        L_0x0064:
            r0 = 0
            switch(r1) {
                case 0: goto L_0x0090;
                case 1: goto L_0x008c;
                case 2: goto L_0x0085;
                case 3: goto L_0x0081;
                case 4: goto L_0x007d;
                case 5: goto L_0x0079;
                case 6: goto L_0x0075;
                case 7: goto L_0x006f;
                case 8: goto L_0x0069;
                default: goto L_0x0068;
            }
        L_0x0068:
            goto L_0x0094
        L_0x0069:
            java.lang.String r1 = "fb_mobile_initiated_checkout"
            m103070b(r1, r0, r0)
            goto L_0x0094
        L_0x006f:
            java.lang.String r1 = "fb_mobile_add_payment_info"
            m103070b(r1, r0, r0)
            return
        L_0x0075:
            m103069b(r2)
            return
        L_0x0079:
            m103072c(r2)
            return
        L_0x007d:
            m103073d(r2)
            return
        L_0x0081:
            m103068b()
            return
        L_0x0085:
            m103063a()
            m103074e(r2)
            return
        L_0x008c:
            m103076g(r2)
            return
        L_0x0090:
            m103075f(r2)
            return
        L_0x0094:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.util.C47611a.m103065a(java.lang.String, java.lang.String):void");
    }

    /* renamed from: a */
    public static void m103066a(String str, String str2, String str3) {
        m103067a(str, str2, str3, new Bundle());
    }

    /* renamed from: b */
    public static void m103070b(String str, String str2, String str3) {
        m103071b(str, str2, str3, new Bundle());
    }

    /* renamed from: a */
    private static void m103067a(String str, String str2, String str3, Bundle bundle) {
        if (!TextUtils.isEmpty(str2)) {
            bundle.putString("content_type", str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            if (TextUtils.equals(str, "search")) {
                bundle.putString("search_term", str3);
            } else {
                bundle.putString("item_id", str3);
            }
        }
        FirebaseAnalytics.getInstance(C11010c.m22280a()).mo34671a(str, bundle);
    }

    /* renamed from: b */
    private static void m103071b(String str, String str2, String str3, Bundle bundle) {
        if (!TextUtils.isEmpty(str2)) {
            bundle.putString("fb_content_type", str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            if (TextUtils.equals(str, "fb_mobile_search")) {
                bundle.putString("fb_search_string", str3);
                return;
            }
            bundle.putString("fb_content_id", str3);
        }
    }
}
