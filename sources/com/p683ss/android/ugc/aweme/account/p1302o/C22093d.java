package com.p683ss.android.ugc.aweme.account.p1302o;

import android.os.Bundle;
import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.account.o.d */
public final class C22093d {

    /* renamed from: a */
    public static long f59606a;

    /* renamed from: b */
    public static final C22094a f59607b = new C22094a(null);

    /* renamed from: com.ss.android.ugc.aweme.account.o.d$a */
    public static final class C22094a {
        private C22094a() {
        }

        /* renamed from: a */
        private static long m54880a() {
            return C22093d.f59606a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
            if (r0.equals("one_login_half_screen") != false) goto L_0x003a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0038, code lost:
            if (r0.equals("one_login") != false) goto L_0x003a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x003a, code lost:
            m54886a((int) r2, r9, r10, r5, "type_normal");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0044, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
            if (r0 == null) goto L_0x000d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x0078, code lost:
            if (r11 == null) goto L_0x007a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x009e, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
            if (r0 == null) goto L_0x001e;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo46197a(boolean r8, int r9, java.lang.String r10, android.os.Bundle r11) {
            /*
                r7 = this;
                if (r11 == 0) goto L_0x000d
                java.lang.String r0 = "carrier_type"
                java.lang.String r0 = r11.getString(r0)
                if (r0 != 0) goto L_0x000b
                goto L_0x000d
            L_0x000b:
                r5 = r0
                goto L_0x0010
            L_0x000d:
                java.lang.String r0 = ""
                goto L_0x000b
            L_0x0010:
                r2 = r8 ^ 1
                if (r11 == 0) goto L_0x001e
                java.lang.String r0 = "login_path"
                java.lang.String r1 = ""
                java.lang.String r0 = r11.getString(r0, r1)
                if (r0 != 0) goto L_0x0020
            L_0x001e:
                java.lang.String r0 = ""
            L_0x0020:
                int r1 = r0.hashCode()
                switch(r1) {
                    case -1250497972: goto L_0x008f;
                    case -1028668664: goto L_0x0080;
                    case -262499015: goto L_0x0063;
                    case 1440398223: goto L_0x0054;
                    case 1778733764: goto L_0x0045;
                    case 1938103376: goto L_0x0032;
                    case 1967288457: goto L_0x0029;
                    default: goto L_0x0027;
                }
            L_0x0027:
                goto L_0x009e
            L_0x0029:
                java.lang.String r8 = "one_login_half_screen"
                boolean r8 = r0.equals(r8)
                if (r8 == 0) goto L_0x009e
                goto L_0x003a
            L_0x0032:
                java.lang.String r8 = "one_login"
                boolean r8 = r0.equals(r8)
                if (r8 == 0) goto L_0x009e
            L_0x003a:
                r1 = r7
                com.ss.android.ugc.aweme.account.o.d$a r1 = (com.p683ss.android.ugc.aweme.account.p1302o.C22093d.C22094a) r1
                java.lang.String r6 = "type_normal"
                r3 = r9
                r4 = r10
                r1.m54886a(r2, r3, r4, r5, r6)
                return
            L_0x0045:
                java.lang.String r8 = "reset_password_for_phone"
                boolean r8 = r0.equals(r8)
                if (r8 == 0) goto L_0x009e
                r8 = r7
                com.ss.android.ugc.aweme.account.o.d$a r8 = (com.p683ss.android.ugc.aweme.account.p1302o.C22093d.C22094a) r8
                r8.m54888b(r2, r9, r10)
                goto L_0x009e
            L_0x0054:
                java.lang.String r8 = "email_or_username"
                boolean r8 = r0.equals(r8)
                if (r8 == 0) goto L_0x009e
                r8 = r7
                com.ss.android.ugc.aweme.account.o.d$a r8 = (com.p683ss.android.ugc.aweme.account.p1302o.C22093d.C22094a) r8
                r8.mo46194a(r2, r9, r10)
                return
            L_0x0063:
                java.lang.String r8 = "third_party_auth"
                boolean r8 = r0.equals(r8)
                if (r8 == 0) goto L_0x009e
                r8 = r7
                com.ss.android.ugc.aweme.account.o.d$a r8 = (com.p683ss.android.ugc.aweme.account.p1302o.C22093d.C22094a) r8
                if (r11 == 0) goto L_0x007a
                java.lang.String r0 = "platform"
                java.lang.String r1 = ""
                java.lang.String r11 = r11.getString(r0, r1)
                if (r11 != 0) goto L_0x007c
            L_0x007a:
                java.lang.String r11 = ""
            L_0x007c:
                r8.mo46195a(r2, r11, r9, r10)
                return
            L_0x0080:
                java.lang.String r11 = "phone_sms"
                boolean r11 = r0.equals(r11)
                if (r11 == 0) goto L_0x009e
                r11 = r7
                com.ss.android.ugc.aweme.account.o.d$a r11 = (com.p683ss.android.ugc.aweme.account.p1302o.C22093d.C22094a) r11
                r11.mo46198b(r8, r9, r10)
                return
            L_0x008f:
                java.lang.String r11 = "phone_password"
                boolean r11 = r0.equals(r11)
                if (r11 == 0) goto L_0x009e
                r11 = r7
                com.ss.android.ugc.aweme.account.o.d$a r11 = (com.p683ss.android.ugc.aweme.account.p1302o.C22093d.C22094a) r11
                r11.mo46196a(r8, r9, r10)
                return
            L_0x009e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.account.p1302o.C22093d.C22094a.mo46197a(boolean, int, java.lang.String, android.os.Bundle):void");
        }

        /* renamed from: a */
        public final void mo46196a(boolean z, int i, String str) {
            boolean z2 = !z;
            C22089b.m54868a("monitor_login_phone_passport", z2 ? 1 : 0, m54883a(i, str, "", ""));
        }

        public /* synthetic */ C22094a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        private static void m54887a(long j) {
            C22093d.f59606a = 0;
        }

        /* renamed from: a */
        private static String m54881a(String str) {
            C52711k.m112240b(str, "platform");
            switch (str.hashCode()) {
                case -1530308138:
                    if (str.equals("qzone_sns")) {
                        return "qq";
                    }
                    break;
                case -1134307907:
                    if (str.equals("toutiao")) {
                        return "toutiao";
                    }
                    break;
                case -791575966:
                    if (str.equals("weixin")) {
                        return "weixin";
                    }
                    break;
                case -471473230:
                    if (str.equals("sina_weibo")) {
                        return "weibo";
                    }
                    break;
                case 635922494:
                    if (str.equals("toutiao_v2")) {
                        return "toutiao";
                    }
                    break;
            }
            return str;
        }

        /* renamed from: b */
        private void m54888b(int i, int i2, String str) {
            C22089b.m54868a("reset_password_for_phone", i, m54883a(i2, str, "", ""));
        }

        /* renamed from: a */
        public final void mo46194a(int i, int i2, String str) {
            C22089b.m54868a("monitor_login_email", i, m54883a(i2, str, "", ""));
        }

        /* renamed from: b */
        public final void mo46198b(boolean z, int i, String str) {
            boolean z2 = !z;
            C22089b.m54868a("monitor_login_phone_sms", z2 ? 1 : 0, m54883a(i, str, "", ""));
        }

        /* renamed from: a */
        private JSONObject m54882a(int i, String str, String str2) {
            C23088c a = C23088c.m56631a();
            long currentTimeMillis = System.currentTimeMillis() - m54880a();
            m54887a(0);
            if (i != 0) {
                a.mo47822a("error_code", Integer.valueOf(i)).mo47824a("error_desc", str);
            }
            if (!TextUtils.isEmpty(str2)) {
                a.mo47824a("platform", str2);
            }
            a.mo47823a("time", Long.valueOf(currentTimeMillis));
            JSONObject b = a.mo47825b();
            C52711k.m112236a((Object) b, "eventJsonBuilder.build()");
            return b;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public static JSONObject m54883a(int i, String str, String str2, String str3) {
            C52711k.m112240b(str2, "platform");
            C52711k.m112240b(str3, "carrierType");
            C23088c a = C23088c.m56631a();
            if (i != 0) {
                a.mo47822a("error_code", Integer.valueOf(i)).mo47824a("error_desc", str);
            }
            if (!TextUtils.isEmpty(str2)) {
                a.mo47824a("platform", str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                a.mo47824a("carrier_type", str3);
            }
            JSONObject b = a.mo47825b();
            C52711k.m112236a((Object) b, "eventJsonBuilder.build()");
            return b;
        }

        /* renamed from: a */
        public final void mo46195a(int i, String str, int i2, String str2) {
            C52711k.m112240b(str, "platform");
            C22089b.m54868a("monitor_login_thirdparty", i, m54882a(i2, str2, m54881a(str)));
        }

        /* renamed from: a */
        private void m54886a(int i, int i2, String str, String str2, String str3) {
            C52711k.m112240b(str2, "carrierType");
            C52711k.m112240b(str3, "errorType");
            C22089b.m54868a("monitor_login_quick", i, m54884a(i2, str, "", str2, str3));
        }

        /* renamed from: a */
        private static JSONObject m54884a(int i, String str, String str2, String str3, String str4) {
            C52711k.m112240b(str2, "platform");
            C52711k.m112240b(str3, "carrierType");
            C52711k.m112240b(str4, "errorType");
            C23088c a = C23088c.m56631a();
            if (i != 0) {
                a.mo47822a("error_code", Integer.valueOf(i)).mo47824a("error_desc", str);
            }
            if (!TextUtils.isEmpty(str2)) {
                a.mo47824a("platform", str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                a.mo47824a("carrier_type", str3);
            }
            a.mo47824a("type", str4);
            JSONObject b = a.mo47825b();
            C52711k.m112236a((Object) b, "eventJsonBuilder.build()");
            return b;
        }
    }

    /* renamed from: a */
    public static final void m54876a(int i, int i2, String str) {
        f59607b.mo46194a(i, i2, str);
    }

    /* renamed from: a */
    public static final void m54877a(boolean z, int i, String str) {
        f59607b.mo46196a(false, i, str);
    }

    /* renamed from: a */
    public static final void m54878a(boolean z, int i, String str, Bundle bundle) {
        f59607b.mo46197a(z, i, str, bundle);
    }

    /* renamed from: b */
    public static final void m54879b(boolean z, int i, String str) {
        f59607b.mo46198b(false, i, str);
    }
}
