package com.p683ss.android.ugc.aweme.notification;

import com.google.gson.C17971f;
import com.google.gson.p1077b.C17956a;
import com.p683ss.android.ugc.aweme.notification.p2019h.p2020a.C38212a;
import java.lang.reflect.Type;
import java.util.Map;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.notification.i */
public final class C38213i {

    /* renamed from: a */
    public static final C38213i f97280a = new C38213i();

    /* renamed from: com.ss.android.ugc.aweme.notification.i$a */
    public static final class C38214a {

        /* renamed from: a */
        public static String f97281a;

        /* renamed from: b */
        public static final C17971f f97282b = new C17971f();

        /* renamed from: c */
        public static final Type f97283c = new C38215a().f49843c;

        /* renamed from: d */
        public static Map<Integer, Long> f97284d;

        /* renamed from: e */
        public static final C38214a f97285e = new C38214a();

        /* renamed from: com.ss.android.ugc.aweme.notification.i$a$a */
        public static final class C38215a extends C17956a<Map<Integer, Long>> {
            C38215a() {
            }
        }

        private C38214a() {
        }

        /* renamed from: a */
        public final C38212a<String> mo78200a() {
            StringBuilder sb = new StringBuilder("robot_last_delete_timestamp");
            String str = f97281a;
            if (str == null) {
                C52711k.m112237a("mUserId");
            }
            sb.append(str);
            return new C38212a<>(sb.toString(), "");
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x001b A[Catch:{ Exception -> 0x0033 }] */
        /* JADX WARNING: Removed duplicated region for block: B:11:0x0023 A[Catch:{ Exception -> 0x0033 }] */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo78201b() {
            /*
                r3 = this;
                com.ss.android.ugc.aweme.notification.h.a.a r0 = r3.mo78200a()
                java.lang.Object r0 = r0.mo78198a()
                java.lang.String r0 = (java.lang.String) r0
                r1 = r0
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch:{ Exception -> 0x0033 }
                if (r1 == 0) goto L_0x0018
                int r1 = r1.length()     // Catch:{ Exception -> 0x0033 }
                if (r1 != 0) goto L_0x0016
                goto L_0x0018
            L_0x0016:
                r1 = 0
                goto L_0x0019
            L_0x0018:
                r1 = 1
            L_0x0019:
                if (r1 == 0) goto L_0x0023
                java.util.LinkedHashMap r0 = new java.util.LinkedHashMap     // Catch:{ Exception -> 0x0033 }
                r0.<init>()     // Catch:{ Exception -> 0x0033 }
                java.util.Map r0 = (java.util.Map) r0     // Catch:{ Exception -> 0x0033 }
                goto L_0x003a
            L_0x0023:
                com.google.gson.f r1 = f97282b     // Catch:{ Exception -> 0x0033 }
                java.lang.reflect.Type r2 = f97283c     // Catch:{ Exception -> 0x0033 }
                java.lang.Object r0 = r1.mo34885a(r0, r2)     // Catch:{ Exception -> 0x0033 }
                java.lang.String r1 = "mGson.fromJson(string, mDataType)"
                p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)     // Catch:{ Exception -> 0x0033 }
                java.util.Map r0 = (java.util.Map) r0     // Catch:{ Exception -> 0x0033 }
                goto L_0x003a
            L_0x0033:
                java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
                r0.<init>()
                java.util.Map r0 = (java.util.Map) r0
            L_0x003a:
                f97284d = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.notification.C38213i.C38214a.mo78201b():void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
            if ((!p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r0, (java.lang.Object) r2.getCurUserId())) != false) goto L_0x0026;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static final boolean m85384a(int r5, long r6) {
            /*
                java.util.Map<java.lang.Integer, java.lang.Long> r0 = f97284d
                r1 = 1
                if (r0 == 0) goto L_0x0026
                java.lang.String r0 = f97281a
                if (r0 == 0) goto L_0x0026
                java.lang.String r0 = f97281a
                if (r0 != 0) goto L_0x0012
                java.lang.String r2 = "mUserId"
                p2628d.p2639f.p2641b.C52711k.m112237a(r2)
            L_0x0012:
                com.ss.android.ugc.aweme.IAccountUserService r2 = com.p683ss.android.ugc.aweme.account.C20854a.m53167g()
                java.lang.String r3 = "AccountProxyService.userService()"
                p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
                java.lang.String r2 = r2.getCurUserId()
                boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r2)
                r0 = r0 ^ r1
                if (r0 == 0) goto L_0x003f
            L_0x0026:
                com.ss.android.ugc.aweme.IAccountUserService r0 = com.p683ss.android.ugc.aweme.account.C20854a.m53167g()
                java.lang.String r2 = "AccountProxyService.userService()"
                p2628d.p2639f.p2641b.C52711k.m112236a(r0, r2)
                java.lang.String r0 = r0.getCurUserId()
                java.lang.String r2 = "AccountProxyService.userService().curUserId"
                p2628d.p2639f.p2641b.C52711k.m112236a(r0, r2)
                f97281a = r0
                com.ss.android.ugc.aweme.notification.i$a r0 = f97285e
                r0.mo78201b()
            L_0x003f:
                java.util.Map<java.lang.Integer, java.lang.Long> r0 = f97284d
                if (r0 != 0) goto L_0x0048
                java.lang.String r2 = "mCurrentNoticeMap"
                p2628d.p2639f.p2641b.C52711k.m112237a(r2)
            L_0x0048:
                java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
                java.lang.Object r0 = r0.get(r2)
                java.lang.Long r0 = (java.lang.Long) r0
                r2 = 0
                if (r0 != 0) goto L_0x0059
                com.p683ss.android.ugc.aweme.notification.C38208h.C38209a.m85378a(r5, r2)
                return r2
            L_0x0059:
                long r3 = r0.longValue()
                int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
                if (r0 < 0) goto L_0x0062
                goto L_0x0063
            L_0x0062:
                r1 = 0
            L_0x0063:
                com.p683ss.android.ugc.aweme.notification.C38208h.C38209a.m85378a(r5, r1)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.notification.C38213i.C38214a.m85384a(int, long):boolean");
        }
    }

    private C38213i() {
    }
}
