package com.p683ss.android.ugc.p2419d.p2420a.p2421a.p2422a.p2424b;

import com.p683ss.android.ugc.p2419d.p2420a.p2421a.p2422a.C48543c;
import com.p683ss.android.ugc.p2419d.p2420a.p2421a.p2422a.p2423a.C48526d;
import com.p683ss.android.ugc.p2419d.p2420a.p2421a.p2422a.p2423a.C48527e;
import com.p683ss.android.ugc.p2419d.p2420a.p2421a.p2422a.p2424b.C48530a.C48531a;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.d.a.a.a.b.d */
public final class C48538d extends C48530a {

    /* renamed from: e */
    C48543c[] f121986e;

    /* renamed from: com.ss.android.ugc.d.a.a.a.b.d$a */
    public static class C48540a extends C48531a {
        /* renamed from: a */
        public final C48542e mo96023a() {
            C48538d dVar = new C48538d(this.f121978a);
            dVar.mo96017a(this.f121979b);
            dVar.mo96018b(this.f121980c);
            dVar.mo96016a(this.f121981d);
            List list = this.f121979b;
            if (list != null && !list.isEmpty()) {
                dVar.f121986e = new C48543c[list.size()];
                for (int i = 0; i < list.size(); i++) {
                    C48527e eVar = (C48527e) list.get(i);
                    double bitRate = (double) eVar.getBitRate();
                    double networkLower = (double) eVar.getNetworkLower();
                    Double.isNaN(networkLower);
                    double d = networkLower * 8000.0d;
                    double networkUpper = (double) eVar.getNetworkUpper();
                    Double.isNaN(networkUpper);
                    C48543c cVar = new C48543c(bitRate, d, 8000.0d * networkUpper);
                    dVar.f121986e[i] = cVar;
                }
            }
            return dVar;
        }

        public C48540a(C48526d dVar) {
            super(dVar);
        }
    }

    /* renamed from: com.ss.android.ugc.d.a.a.a.b.d$b */
    public static class C48541b {

        /* renamed from: a */
        public Map<String, Object> f121987a = new HashMap();

        /* renamed from: a */
        public static C48541b m105007a() {
            return new C48541b();
        }

        private C48541b() {
        }

        /* renamed from: a */
        public final C48541b mo96037a(int i) {
            this.f121987a.put("internet_speed", Integer.valueOf(i));
            return this;
        }
    }

    private C48538d(C48526d dVar) {
        super(dVar);
    }

    /* renamed from: a */
    private static int m105004a(Map<String, Object> map) {
        Object obj = map.get("internet_speed");
        if (obj != null) {
            return ((Integer) obj).intValue();
        }
        return -1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0120 A[SYNTHETIC, Splitter:B:52:0x0120] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0136 A[Catch:{ b -> 0x0133 }] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x01b0  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.p683ss.android.ugc.p2419d.p2420a.p2421a.p2422a.p2423a.C48528f mo96025a(java.util.List<? extends com.p683ss.android.ugc.p2419d.p2420a.p2421a.p2422a.p2423a.C48525c> r18, java.util.Map<java.lang.String, java.lang.Object> r19) {
        /*
            r17 = this;
            r1 = r17
            r2 = r18
            com.ss.android.ugc.d.a.a.a.a.f r3 = new com.ss.android.ugc.d.a.a.a.a.f
            r3.<init>()
            r0 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0015
            boolean r5 = r18.isEmpty()
            if (r5 != 0) goto L_0x0015
            r5 = 1
            goto L_0x0016
        L_0x0015:
            r5 = 0
        L_0x0016:
            if (r5 != 0) goto L_0x0022
            com.ss.android.ugc.d.a.a.a.b r0 = new com.ss.android.ugc.d.a.a.a.b
            java.lang.String r2 = "bitrate list is empty..."
            r0.<init>(r4, r2)
            r3.f121969b = r0
            return r3
        L_0x0022:
            com.ss.android.ugc.d.a.a.a.a.a r5 = r1.f121977d
            r6 = 0
            r8 = 0
            if (r5 == 0) goto L_0x0084
            int r5 = m105004a(r19)
            double r9 = (double) r5
            int r5 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r5 <= 0) goto L_0x0081
            com.ss.android.ugc.d.a.a.a.a.a r5 = r1.f121977d
            if (r5 != 0) goto L_0x0037
            goto L_0x0081
        L_0x0037:
            com.ss.android.ugc.d.a.a.a.a.a r5 = r1.f121977d
            double r5 = r5.mo95181a()
            java.lang.Double.isNaN(r9)
            double r5 = r5 * r9
            java.lang.Double.isNaN(r9)
            double r5 = r5 * r9
            java.lang.Double.isNaN(r9)
            double r5 = r5 * r9
            com.ss.android.ugc.d.a.a.a.a.a r7 = r1.f121977d
            double r11 = r7.mo95182b()
            java.lang.Double.isNaN(r9)
            double r11 = r11 * r9
            java.lang.Double.isNaN(r9)
            double r11 = r11 * r9
            double r5 = r5 + r11
            com.ss.android.ugc.d.a.a.a.a.a r7 = r1.f121977d
            double r11 = r7.mo95183c()
            java.lang.Double.isNaN(r9)
            double r11 = r11 * r9
            double r5 = r5 + r11
            com.ss.android.ugc.d.a.a.a.a.a r7 = r1.f121977d
            double r9 = r7.mo95184d()
            double r5 = r5 + r9
            com.ss.android.ugc.d.a.a.a.a.a r7 = r1.f121977d
            double r9 = r7.mo95185e()
            double r5 = java.lang.Math.max(r5, r9)
            com.ss.android.ugc.d.a.a.a.a r7 = new com.ss.android.ugc.d.a.a.a.a
            r7.<init>(r5, r0)
            goto L_0x0118
        L_0x0081:
            r7 = r8
            goto L_0x0118
        L_0x0084:
            java.util.List r5 = r1.f121976c
            if (r5 == 0) goto L_0x00dc
            int r5 = m105004a(r19)
            double r9 = (double) r5
            int r5 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r5 <= 0) goto L_0x0081
            java.util.List r5 = r1.f121976c
            if (r5 == 0) goto L_0x0081
            java.util.List r5 = r1.f121976c
            int r5 = r5.size()
            if (r5 != 0) goto L_0x009e
            goto L_0x0081
        L_0x009e:
            java.util.List r5 = r1.f121976c
            java.util.Iterator r5 = r5.iterator()
        L_0x00a4:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x00bb
            java.lang.Object r6 = r5.next()
            com.ss.android.ugc.d.a.a.a.a.b r6 = (com.p683ss.android.ugc.p2419d.p2420a.p2421a.p2422a.p2423a.C48524b) r6
            if (r6 == 0) goto L_0x00a4
            double r11 = r6.getSpeed()
            int r7 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r7 > 0) goto L_0x00a4
            goto L_0x00bc
        L_0x00bb:
            r6 = r8
        L_0x00bc:
            if (r6 != 0) goto L_0x00ce
            java.util.List r5 = r1.f121976c
            java.util.List r6 = r1.f121976c
            int r6 = r6.size()
            int r6 = r6 - r0
            java.lang.Object r5 = r5.get(r6)
            r6 = r5
            com.ss.android.ugc.d.a.a.a.a.b r6 = (com.p683ss.android.ugc.p2419d.p2420a.p2421a.p2422a.p2423a.C48524b) r6
        L_0x00ce:
            if (r6 != 0) goto L_0x00d1
            goto L_0x0081
        L_0x00d1:
            com.ss.android.ugc.d.a.a.a.a r5 = new com.ss.android.ugc.d.a.a.a.a
            double r6 = r6.getBitrate()
            r5.<init>(r6, r0)
            r7 = r5
            goto L_0x0118
        L_0x00dc:
            int r0 = m105004a(r19)
            double r9 = (double) r0
            int r0 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x0081
            com.ss.android.ugc.d.a.a.a.c[] r0 = r1.f121986e
            if (r0 != 0) goto L_0x00ea
            goto L_0x0081
        L_0x00ea:
            r5 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
            com.ss.android.ugc.d.a.a.a.c[] r0 = r1.f121986e
            int r7 = r0.length
            r11 = r5
            r6 = r8
            r5 = 0
        L_0x00f5:
            if (r5 >= r7) goto L_0x010e
            r13 = r0[r5]
            double r14 = r13.getMedianThreshold()
            java.lang.Double.isNaN(r9)
            double r14 = r14 - r9
            double r14 = java.lang.Math.abs(r14)
            int r16 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r16 >= 0) goto L_0x010b
            r6 = r13
            r11 = r14
        L_0x010b:
            int r5 = r5 + 1
            goto L_0x00f5
        L_0x010e:
            if (r6 == 0) goto L_0x0081
            com.ss.android.ugc.d.a.a.a.a r0 = new com.ss.android.ugc.d.a.a.a.a
            double r5 = r6.mRate
            r0.<init>(r5, r4)
            r7 = r0
        L_0x0118:
            if (r7 == 0) goto L_0x011e
            double r5 = r7.f121966a
            r3.f121971d = r5
        L_0x011e:
            if (r7 != 0) goto L_0x0136
            com.ss.android.ugc.d.a.a.a.a.d r0 = r1.f121974a     // Catch:{ b -> 0x0133 }
            if (r0 == 0) goto L_0x012a
            com.ss.android.ugc.d.a.a.a.a.c r0 = r17.mo96020d(r18)     // Catch:{ b -> 0x0133 }
            goto L_0x019e
        L_0x012a:
            com.ss.android.ugc.d.a.a.a.b r0 = new com.ss.android.ugc.d.a.a.a.b     // Catch:{ b -> 0x0133 }
            r5 = 6
            java.lang.String r6 = "gear config is null"
            r0.<init>(r5, r6)     // Catch:{ b -> 0x0133 }
            throw r0     // Catch:{ b -> 0x0133 }
        L_0x0133:
            r0 = move-exception
            goto L_0x01aa
        L_0x0136:
            java.util.List r0 = r17.mo96019c(r18)     // Catch:{ b -> 0x0133 }
            boolean r5 = r0.isEmpty()     // Catch:{ b -> 0x0133 }
            if (r5 != 0) goto L_0x01a1
            boolean r5 = r7.f121967b     // Catch:{ b -> 0x0133 }
            if (r5 == 0) goto L_0x0165
            double r5 = r7.f121966a     // Catch:{ b -> 0x0133 }
            if (r0 == 0) goto L_0x0163
            java.util.Iterator r0 = r0.iterator()     // Catch:{ b -> 0x0133 }
        L_0x014c:
            boolean r7 = r0.hasNext()     // Catch:{ b -> 0x0133 }
            if (r7 == 0) goto L_0x0163
            java.lang.Object r7 = r0.next()     // Catch:{ b -> 0x0133 }
            r8 = r7
            com.ss.android.ugc.d.a.a.a.a.c r8 = (com.p683ss.android.ugc.p2419d.p2420a.p2421a.p2422a.p2423a.C48525c) r8     // Catch:{ b -> 0x0133 }
            int r7 = r8.getBitRate()     // Catch:{ b -> 0x0133 }
            double r9 = (double) r7     // Catch:{ b -> 0x0133 }
            int r7 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r7 >= 0) goto L_0x0163
            goto L_0x014c
        L_0x0163:
            r0 = r8
            goto L_0x019e
        L_0x0165:
            double r5 = r7.f121966a     // Catch:{ b -> 0x0133 }
            if (r0 == 0) goto L_0x0163
            java.util.Iterator r0 = r0.iterator()     // Catch:{ b -> 0x0133 }
        L_0x016d:
            boolean r7 = r0.hasNext()     // Catch:{ b -> 0x0133 }
            if (r7 == 0) goto L_0x0163
            java.lang.Object r7 = r0.next()     // Catch:{ b -> 0x0133 }
            com.ss.android.ugc.d.a.a.a.a.c r7 = (com.p683ss.android.ugc.p2419d.p2420a.p2421a.p2422a.p2423a.C48525c) r7     // Catch:{ b -> 0x0133 }
            if (r8 != 0) goto L_0x017d
        L_0x017b:
            r8 = r7
            goto L_0x016d
        L_0x017d:
            int r9 = r7.getBitRate()     // Catch:{ b -> 0x0133 }
            double r9 = (double) r9
            java.lang.Double.isNaN(r9)
            r11 = 0
            double r9 = r9 - r5
            double r9 = java.lang.Math.abs(r9)     // Catch:{ b -> 0x0133 }
            int r11 = r8.getBitRate()     // Catch:{ b -> 0x0133 }
            double r11 = (double) r11
            java.lang.Double.isNaN(r11)
            r13 = 0
            double r11 = r11 - r5
            double r11 = java.lang.Math.abs(r11)     // Catch:{ b -> 0x0133 }
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 >= 0) goto L_0x016d
            goto L_0x017b
        L_0x019e:
            r3.f121968a = r0     // Catch:{ b -> 0x0133 }
            goto L_0x01ac
        L_0x01a1:
            com.ss.android.ugc.d.a.a.a.b r0 = new com.ss.android.ugc.d.a.a.a.b     // Catch:{ b -> 0x0133 }
            r5 = 5
            java.lang.String r6 = "Intersection bitrate list is empty."
            r0.<init>(r5, r6)     // Catch:{ b -> 0x0133 }
            throw r0     // Catch:{ b -> 0x0133 }
        L_0x01aa:
            r3.f121969b = r0
        L_0x01ac:
            com.ss.android.ugc.d.a.a.a.a.c r0 = r3.f121968a
            if (r0 != 0) goto L_0x01b8
            java.lang.Object r0 = r2.get(r4)
            com.ss.android.ugc.d.a.a.a.a.c r0 = (com.p683ss.android.ugc.p2419d.p2420a.p2421a.p2422a.p2423a.C48525c) r0
            r3.f121968a = r0
        L_0x01b8:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.p2419d.p2420a.p2421a.p2422a.p2424b.C48538d.mo96025a(java.util.List, java.util.Map):com.ss.android.ugc.d.a.a.a.a.f");
    }
}
