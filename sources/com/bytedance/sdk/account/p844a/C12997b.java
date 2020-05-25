package com.bytedance.sdk.account.p844a;

import com.bytedance.sdk.account.p878m.C13209b;
import com.p683ss.android.account.C18495c;

/* renamed from: com.bytedance.sdk.account.a.b */
public final class C12997b {

    /* renamed from: com.bytedance.sdk.account.a.b$a */
    public static class C12998a {

        /* renamed from: a */
        public static String f34022a = "https://";

        /* renamed from: b */
        public static String f34023b = "http://";

        /* renamed from: a */
        public static String m26117a() {
            return m26118a("/passport/mobile/send_code/v1/");
        }

        /* renamed from: b */
        public static String m26119b() {
            return m26118a("/passport/mobile/sms_login/");
        }

        /* renamed from: c */
        public static String m26120c() {
            return m26118a("/passport/password/reset/");
        }

        /* renamed from: d */
        public static String m26121d() {
            return m26118a("/passport/mobile/check_code/");
        }

        /* renamed from: e */
        public static String m26122e() {
            return m26118a("/passport/password/reset_by_ticket/");
        }

        /* renamed from: f */
        public static String m26123f() {
            return m26118a("/passport/password/reset_by_email_ticket/");
        }

        /* renamed from: g */
        public static String m26124g() {
            return m26118a("/passport/password/change/");
        }

        /* renamed from: h */
        public static String m26125h() {
            return m26118a("/passport/mobile/bind/v2/");
        }

        /* renamed from: i */
        public static String m26126i() {
            return m26118a("/passport/mobile/bind/v1/");
        }

        /* renamed from: j */
        public static String m26127j() {
            return m26118a("/passport/mobile/change/v1/");
        }

        /* renamed from: k */
        public static String m26128k() {
            return m26118a("/passport/password/set/");
        }

        /* renamed from: l */
        public static String m26129l() {
            return m26118a("/passport/mobile/validate_code/v1/");
        }

        /* renamed from: m */
        public static String m26130m() {
            return m26118a("/passport/user/login/");
        }

        /* renamed from: n */
        public static String m26131n() {
            return m26118a("/passport/mobile/send_voice_code/");
        }

        /* renamed from: o */
        public static String m26132o() {
            return m26118a("/passport/account/logout_others/");
        }

        /* renamed from: p */
        private static String m26133p() {
            return C18495c.m44742a().mo38461a();
        }

        /* renamed from: a */
        public static String m26118a(String str) {
            C13209b d = C18495c.m44745d();
            if (d == null || !d.mo24804a()) {
                StringBuilder sb = new StringBuilder();
                sb.append(f34022a);
                sb.append(m26133p());
                sb.append(str);
                return sb.toString();
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(f34023b);
            sb2.append(m26133p());
            sb2.append(str);
            return sb2.toString();
        }
    }

    /* renamed from: com.bytedance.sdk.account.a.b$b */
    public static class C12999b {
        /* renamed from: a */
        public static String m26134a() {
            return m26135a("/passport/auth/login/");
        }

        /* renamed from: b */
        public static String m26136b() {
            return m26135a("/passport/auth/login_only/");
        }

        /* renamed from: c */
        public static String m26137c() {
            return m26135a("/passport/auth/bind/");
        }

        /* renamed from: d */
        public static String m26138d() {
            return m26135a("/passport/user/logout/");
        }

        /* renamed from: e */
        private static String m26139e() {
            return C18495c.m44742a().mo38461a();
        }

        /* renamed from: a */
        public static String m26135a(String str) {
            C13209b d = C18495c.m44745d();
            if (d == null || !d.mo24804a()) {
                StringBuilder sb = new StringBuilder("https://");
                sb.append(m26139e());
                sb.append(str);
                return sb.toString();
            }
            StringBuilder sb2 = new StringBuilder("http://");
            sb2.append(m26139e());
            sb2.append(str);
            return sb2.toString();
        }
    }
}
