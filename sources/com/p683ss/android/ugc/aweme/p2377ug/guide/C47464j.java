package com.p683ss.android.ugc.aweme.p2377ug.guide;

import com.p683ss.android.ugc.aweme.journey.C35781s;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.ug.guide.j */
public final class C47464j {

    /* renamed from: a */
    public static final C52668f f119725a = C52732g.m112285a(C47466b.f119728a);

    /* renamed from: b */
    public static final C47465a f119726b = new C47465a(null);

    /* renamed from: com.ss.android.ugc.aweme.ug.guide.j$a */
    public static final class C47465a {

        /* renamed from: a */
        static final /* synthetic */ C52767h[] f119727a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C47465a.class), "optType", "getOptType()I"))};

        private C47465a() {
        }

        /* renamed from: d */
        private static int m102827d() {
            return ((Number) C47464j.f119725a.getValue()).intValue();
        }

        /* renamed from: e */
        private final int m102828e() {
            return m102827d();
        }

        /* renamed from: b */
        public final boolean mo94744b() {
            if (m102828e() != 2) {
                return true;
            }
            return false;
        }

        /* renamed from: c */
        public final boolean mo94745c() {
            if (m102828e() != 0) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public static boolean m102826a() {
            if (!C35781s.f91909n.mo74441e() || C35781s.f91909n.mo74446j() != 3) {
                return true;
            }
            return false;
        }

        public /* synthetic */ C47465a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ug.guide.j$b */
    static final class C47466b extends C52712l implements C52670a<Integer> {

        /* renamed from: a */
        public static final C47466b f119728a = new C47466b();

        C47466b() {
            super(0);
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x0084  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object invoke() {
            /*
                r16 = this;
                com.ss.android.ugc.aweme.ug.b r0 = com.p683ss.android.ugc.aweme.p2377ug.C47443b.f119682b
                java.lang.String r1 = "1587052800"
                java.lang.String r2 = "expectimeStamp"
                p2628d.p2639f.p2641b.C52711k.m112240b(r1, r2)
                int r2 = r1.length()
                r3 = 10
                if (r2 != r3) goto L_0x0022
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r1)
                java.lang.String r1 = "000"
                r2.append(r1)
                java.lang.String r1 = r2.toString()
            L_0x0022:
                int r2 = r1.length()
                r3 = 13
                r4 = 1
                r5 = 0
                if (r2 != r3) goto L_0x0081
                java.lang.Long r1 = p2628d.p2650m.C52830p.m112396d(r1)
                r2 = 0
                if (r1 == 0) goto L_0x0039
                long r6 = r1.longValue()
                goto L_0x003a
            L_0x0039:
                r6 = r2
            L_0x003a:
                r8 = 1590(0x636, double:7.856E-321)
                java.lang.Boolean r1 = com.p683ss.android.ugc.aweme.feed.C30578o.m71565a()
                java.lang.String r10 = "Feed0VVManagerUtils.isFirstInstallAndFirstLaunch()"
                p2628d.p2639f.p2641b.C52711k.m112236a(r1, r10)
                boolean r1 = r1.booleanValue()
                if (r1 == 0) goto L_0x0065
                java.lang.String r10 = com.bytedance.ies.ugc.p694a.C11010c.m22294o()
                java.lang.String r11 = "."
                java.lang.String r12 = ""
                r13 = 0
                r14 = 4
                r15 = 0
                java.lang.String r1 = p2628d.p2650m.C52830p.m112401a(r10, r11, r12, r13, r14, r15)
                long r10 = java.lang.Long.parseLong(r1)
                com.bytedance.keva.Keva r1 = r0.f119684a
                java.lang.String r12 = "version_code"
                r1.storeLong(r12, r10)
            L_0x0065:
                com.bytedance.keva.Keva r1 = r0.f119684a
                java.lang.String r10 = "version_code"
                r11 = -1
                long r10 = r1.getLong(r10, r11)
                long r0 = r0.mo94716a()
                int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r12 <= 0) goto L_0x0081
                int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
                if (r2 <= 0) goto L_0x0081
                int r0 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
                if (r0 < 0) goto L_0x0081
                r0 = 1
                goto L_0x0082
            L_0x0081:
                r0 = 0
            L_0x0082:
                if (r0 == 0) goto L_0x0094
                com.bytedance.ies.abmock.b r0 = com.bytedance.ies.abmock.C10181b.m20511a()
                java.lang.Class<com.ss.android.ugc.aweme.ug.guide.SwipeUpGuideOptExperiment> r1 = com.p683ss.android.ugc.aweme.p2377ug.guide.SwipeUpGuideOptExperiment.class
                java.lang.String r2 = "swipe_up_opt_experiment"
                int r3 = com.bytedance.ies.abmock.ClientExpManager.swipe_up_opt_experiment()
                int r5 = r0.mo18167a(r1, r4, r2, r3)
            L_0x0094:
                java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p2377ug.guide.C47464j.C47466b.invoke():java.lang.Object");
        }
    }
}
