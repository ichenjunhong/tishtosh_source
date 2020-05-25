package com.google.android.gms.internal.ads;

import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;

final class bjp {
    /* JADX WARNING: type inference failed for: r22v2, types: [int] */
    /* JADX WARNING: type inference failed for: r22v3 */
    /* JADX WARNING: type inference failed for: r22v4, types: [int] */
    /* JADX WARNING: type inference failed for: r22v8 */
    /* JADX WARNING: type inference failed for: r22v9 */
    /* JADX WARNING: type inference failed for: r22v10 */
    /* JADX WARNING: type inference failed for: r22v11 */
    /* JADX WARNING: type inference failed for: r22v12 */
    /* JADX WARNING: type inference failed for: r22v13 */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x034e, code lost:
        r22 = r22;
     */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r22v3
      assigns: []
      uses: []
      mth insns count: 423
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.ads.bjt m35908a(com.google.android.gms.internal.ads.bjn r39, com.google.android.gms.internal.ads.bjo r40) {
        /*
            r0 = r39
            int r1 = com.google.android.gms.internal.ads.bjm.f42659l
            com.google.android.gms.internal.ads.bjn r1 = r0.mo30292d(r1)
            int r2 = com.google.android.gms.internal.ads.bjm.f42665r
            com.google.android.gms.internal.ads.bjo r2 = r1.mo30291c(r2)
            com.google.android.gms.internal.ads.bll r2 = r2.f42678N
            r3 = 16
            r2.mo30328a(r3)
            int r6 = r2.mo30333d()
            r2 = 0
            r4 = 1936684398(0x736f756e, float:1.8971874E31)
            if (r6 == r4) goto L_0x002f
            r4 = 1986618469(0x76696465, float:1.1834389E33)
            if (r6 == r4) goto L_0x002f
            r4 = 1952807028(0x74657874, float:7.272211E31)
            if (r6 == r4) goto L_0x002f
            r4 = 1953325924(0x746d6364, float:7.523134E31)
            if (r6 == r4) goto L_0x002f
            return r2
        L_0x002f:
            int r4 = com.google.android.gms.internal.ads.bjm.f42663p
            com.google.android.gms.internal.ads.bjo r0 = r0.mo30291c(r4)
            com.google.android.gms.internal.ads.bll r0 = r0.f42678N
            r4 = 8
            r0.mo30328a(r4)
            int r5 = r0.mo30333d()
            int r5 = com.google.android.gms.internal.ads.bjm.m35904a(r5)
            if (r5 != 0) goto L_0x0049
            r7 = 8
            goto L_0x004b
        L_0x0049:
            r7 = 16
        L_0x004b:
            r0.mo30331b(r7)
            int r7 = r0.mo30333d()
            r8 = 4
            r0.mo30331b(r8)
            int r9 = r0.f42851b
            if (r5 != 0) goto L_0x005c
            r10 = 4
            goto L_0x005e
        L_0x005c:
            r10 = 8
        L_0x005e:
            r12 = 0
        L_0x005f:
            if (r12 >= r10) goto L_0x006f
            byte[] r14 = r0.f42850a
            int r15 = r9 + r12
            byte r14 = r14[r15]
            r15 = -1
            if (r14 == r15) goto L_0x006c
            r9 = 0
            goto L_0x0070
        L_0x006c:
            int r12 = r12 + 1
            goto L_0x005f
        L_0x006f:
            r9 = 1
        L_0x0070:
            r14 = -1
            if (r9 == 0) goto L_0x0079
            r0.mo30331b(r10)
            r9 = r14
            goto L_0x0084
        L_0x0079:
            if (r5 != 0) goto L_0x0080
            long r9 = r0.mo30332c()
            goto L_0x0084
        L_0x0080:
            long r9 = r0.mo30336g()
        L_0x0084:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            java.lang.Long r5 = java.lang.Long.valueOf(r9)
            android.util.Pair r0 = android.util.Pair.create(r0, r5)
            java.lang.Object r5 = r0.first
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r9 = r0.longValue()
            r0 = r40
            com.google.android.gms.internal.ads.bll r0 = r0.f42678N
            r0.mo30328a(r4)
            int r7 = r0.mo30333d()
            int r7 = com.google.android.gms.internal.ads.bjm.m35904a(r7)
            if (r7 != 0) goto L_0x00b4
            r7 = 8
            goto L_0x00b6
        L_0x00b4:
            r7 = 16
        L_0x00b6:
            r0.mo30331b(r7)
            long r11 = r0.mo30332c()
            int r0 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            if (r0 != 0) goto L_0x00c3
            r9 = r14
            goto L_0x00f6
        L_0x00c3:
            r14 = 0
            r17 = 1000000(0xf4240, double:4.940656E-318)
            int r0 = (r11 > r17 ? 1 : (r11 == r17 ? 0 : -1))
            if (r0 < 0) goto L_0x00d6
            long r19 = r11 % r17
            int r0 = (r19 > r14 ? 1 : (r19 == r14 ? 0 : -1))
            if (r0 != 0) goto L_0x00d6
            long r11 = r11 / r17
            long r9 = r9 / r11
            goto L_0x00f6
        L_0x00d6:
            int r0 = (r11 > r17 ? 1 : (r11 == r17 ? 0 : -1))
            if (r0 >= 0) goto L_0x00e5
            long r19 = r17 % r11
            int r0 = (r19 > r14 ? 1 : (r19 == r14 ? 0 : -1))
            if (r0 != 0) goto L_0x00e5
            long r17 = r17 / r11
            long r9 = r9 * r17
            goto L_0x00f6
        L_0x00e5:
            r14 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r11 = (double) r11
            java.lang.Double.isNaN(r11)
            double r14 = r14 / r11
            double r9 = (double) r9
            java.lang.Double.isNaN(r9)
            double r9 = r9 * r14
            long r9 = (long) r9
        L_0x00f6:
            int r0 = com.google.android.gms.internal.ads.bjm.f42660m
            com.google.android.gms.internal.ads.bjn r0 = r1.mo30292d(r0)
            int r7 = com.google.android.gms.internal.ads.bjm.f42661n
            com.google.android.gms.internal.ads.bjn r0 = r0.mo30292d(r7)
            int r7 = com.google.android.gms.internal.ads.bjm.f42664q
            com.google.android.gms.internal.ads.bjo r1 = r1.mo30291c(r7)
            com.google.android.gms.internal.ads.bll r1 = r1.f42678N
            r1.mo30328a(r4)
            int r7 = r1.mo30333d()
            int r7 = com.google.android.gms.internal.ads.bjm.m35904a(r7)
            if (r7 != 0) goto L_0x011a
            r7 = 8
            goto L_0x011c
        L_0x011a:
            r7 = 16
        L_0x011c:
            r1.mo30331b(r7)
            long r11 = r1.mo30332c()
            int r1 = com.google.android.gms.internal.ads.bjm.f42666s
            com.google.android.gms.internal.ads.bjo r0 = r0.mo30291c(r1)
            com.google.android.gms.internal.ads.bll r0 = r0.f42678N
            r1 = 12
            r0.mo30328a(r1)
            int r1 = r0.mo30333d()
            com.google.android.gms.internal.ads.bjq r7 = new com.google.android.gms.internal.ads.bjq
            r7.<init>(r1)
            r14 = 0
        L_0x013a:
            if (r14 >= r1) goto L_0x045e
            int r15 = r0.f42851b
            int r2 = r0.mo30333d()
            if (r2 <= 0) goto L_0x0146
            r4 = 1
            goto L_0x0147
        L_0x0146:
            r4 = 0
        L_0x0147:
            java.lang.String r8 = "childAtomSize should be positive"
            com.google.android.gms.internal.ads.blg.m36000a(r4, r8)
            int r4 = r0.mo30333d()
            int r8 = com.google.android.gms.internal.ads.bjm.f42647a
            r13 = 24
            if (r4 == r8) goto L_0x037a
            int r8 = com.google.android.gms.internal.ads.bjm.f42649b
            if (r4 == r8) goto L_0x037a
            int r8 = com.google.android.gms.internal.ads.bjm.f42671x
            if (r4 != r8) goto L_0x0160
            goto L_0x037a
        L_0x0160:
            int r8 = com.google.android.gms.internal.ads.bjm.f42651d
            if (r4 == r8) goto L_0x01fc
            int r8 = com.google.android.gms.internal.ads.bjm.f42672y
            if (r4 == r8) goto L_0x01fc
            int r8 = com.google.android.gms.internal.ads.bjm.f42652e
            if (r4 != r8) goto L_0x016e
            goto L_0x01fc
        L_0x016e:
            int r3 = com.google.android.gms.internal.ads.bjm.f42623B
            if (r4 != r3) goto L_0x0193
            java.lang.String r26 = "application/ttml+xml"
            com.google.android.gms.internal.ads.bie r3 = new com.google.android.gms.internal.ads.bie
            r27 = -1
            r28 = -1
            r30 = -1
            r31 = -1
            r32 = -1082130432(0xffffffffbf800000, float:-1.0)
            r33 = -1
            r34 = -1
            r35 = 0
            r25 = r3
            r25.<init>(r26, r27, r28, r30, r31, r32, r33, r34, r35)
            r7.f42680b = r3
        L_0x018d:
            r36 = r1
            r37 = r11
            goto L_0x044c
        L_0x0193:
            int r3 = com.google.android.gms.internal.ads.bjm.f42626E
            if (r4 != r3) goto L_0x018d
            int r3 = r15 + 8
            r0.mo30328a(r3)
            r0.mo30331b(r13)
            int r21 = r0.mo30330b()
            int r22 = r0.mo30330b()
            r3 = 50
            r0.mo30331b(r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 1
            r3.<init>(r4)
            int r4 = r0.f42851b
        L_0x01b4:
            int r8 = r4 - r15
            if (r8 >= r2) goto L_0x01e8
            r0.mo30328a(r4)
            int r8 = r0.f42851b
            int r13 = r0.mo30333d()
            if (r13 <= 0) goto L_0x01c9
            r36 = r1
            r37 = r11
            r1 = 1
            goto L_0x01ce
        L_0x01c9:
            r36 = r1
            r37 = r11
            r1 = 0
        L_0x01ce:
            java.lang.String r11 = "childAtomSize should be positive"
            com.google.android.gms.internal.ads.blg.m36000a(r1, r11)
            int r1 = r0.mo30333d()
            int r11 = com.google.android.gms.internal.ads.bjm.f42650c
            if (r1 != r11) goto L_0x01e2
            byte[] r1 = m35910a(r0, r8)
            r3.add(r1)
        L_0x01e2:
            int r4 = r4 + r13
            r1 = r36
            r11 = r37
            goto L_0x01b4
        L_0x01e8:
            r36 = r1
            r37 = r11
            java.lang.String r17 = "video/mp4v-es"
            r18 = -1
            r19 = r9
            r23 = r3
            com.google.android.gms.internal.ads.bie r1 = com.google.android.gms.internal.ads.bie.m35769a(r17, r18, r19, r21, r22, r23)
            r7.f42680b = r1
            goto L_0x044c
        L_0x01fc:
            r36 = r1
            r37 = r11
            int r1 = r15 + 8
            r0.mo30328a(r1)
            r1 = 16
            r0.mo30331b(r1)
            int r8 = r0.mo30330b()
            int r18 = r0.mo30330b()
            r11 = 4
            r0.mo30331b(r11)
            byte[] r11 = r0.f42850a
            int r12 = r0.f42851b
            int r13 = r12 + 1
            r0.f42851b = r13
            byte r11 = r11[r12]
            r11 = r11 & 255(0xff, float:3.57E-43)
            r12 = 8
            int r11 = r11 << r12
            byte[] r13 = r0.f42850a
            int r1 = r0.f42851b
            int r12 = r1 + 1
            r0.f42851b = r12
            byte r1 = r13[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r1 = r1 | r11
            int r11 = r0.f42851b
            r12 = 2
            int r11 = r11 + r12
            r0.f42851b = r11
            int r11 = r0.f42851b
            r22 = r1
            r21 = r8
            r1 = 0
        L_0x023f:
            int r8 = r11 - r15
            if (r8 >= r2) goto L_0x0352
            r0.mo30328a(r11)
            int r8 = r0.f42851b
            int r13 = r0.mo30333d()
            if (r13 <= 0) goto L_0x0250
            r12 = 1
            goto L_0x0251
        L_0x0250:
            r12 = 0
        L_0x0251:
            java.lang.String r3 = "childAtomSize should be positive"
            com.google.android.gms.internal.ads.blg.m36000a(r12, r3)
            int r3 = r0.mo30333d()
            int r12 = com.google.android.gms.internal.ads.bjm.f42651d
            if (r4 == r12) goto L_0x02e5
            int r12 = com.google.android.gms.internal.ads.bjm.f42672y
            if (r4 != r12) goto L_0x0264
            goto L_0x02e5
        L_0x0264:
            int r12 = com.google.android.gms.internal.ads.bjm.f42652e
            if (r4 != r12) goto L_0x02a3
            int r12 = com.google.android.gms.internal.ads.bjm.f42653f
            if (r3 != r12) goto L_0x02a3
            int r8 = r8 + 8
            r0.mo30328a(r8)
            int r1 = r0.mo30327a()
            r1 = r1 & 192(0xc0, float:2.69E-43)
            int r1 = r1 >> 6
            int[] r3 = com.google.android.gms.internal.ads.blf.f42840a
            r22 = r3[r1]
            int r1 = r0.mo30327a()
            int[] r3 = com.google.android.gms.internal.ads.blf.f42841b
            r4 = r1 & 56
            r8 = 3
            int r4 = r4 >> r8
            r3 = r3[r4]
            r4 = 4
            r1 = r1 & r4
            if (r1 == 0) goto L_0x028f
            int r3 = r3 + 1
        L_0x028f:
            r21 = r3
            java.lang.String r17 = "audio/ac3"
            r18 = -1
            r19 = -1
            java.util.List r23 = java.util.Collections.emptyList()
            com.google.android.gms.internal.ads.bie r1 = com.google.android.gms.internal.ads.bie.m35771b(r17, r18, r19, r21, r22, r23)
            r7.f42680b = r1
            goto L_0x044c
        L_0x02a3:
            int r12 = com.google.android.gms.internal.ads.bjm.f42654g
            if (r4 != r12) goto L_0x034e
            int r12 = com.google.android.gms.internal.ads.bjm.f42655h
            if (r3 != r12) goto L_0x034e
            int r8 = r8 + 8
            r0.mo30328a(r8)
            r12 = 2
            r0.mo30331b(r12)
            int r1 = r0.mo30327a()
            r1 = r1 & 192(0xc0, float:2.69E-43)
            int r1 = r1 >> 6
            int[] r3 = com.google.android.gms.internal.ads.blf.f42840a
            r22 = r3[r1]
            int r1 = r0.mo30327a()
            int[] r3 = com.google.android.gms.internal.ads.blf.f42841b
            r4 = r1 & 14
            r8 = 1
            int r4 = r4 >> r8
            r3 = r3[r4]
            r1 = r1 & r8
            if (r1 == 0) goto L_0x02d1
            int r3 = r3 + 1
        L_0x02d1:
            r21 = r3
            java.lang.String r17 = "audio/eac3"
            java.util.List r23 = java.util.Collections.emptyList()
            r18 = -1
            r19 = -1
            com.google.android.gms.internal.ads.bie r1 = com.google.android.gms.internal.ads.bie.m35771b(r17, r18, r19, r21, r22, r23)
            r7.f42680b = r1
            goto L_0x044c
        L_0x02e5:
            int r12 = com.google.android.gms.internal.ads.bjm.f42650c
            if (r3 != r12) goto L_0x0342
            byte[] r1 = m35910a(r0, r8)
            r12 = 0
            byte r3 = r1[r12]
            r8 = 3
            int r3 = r3 >> r8
            r3 = r3 & 31
            r8 = 5
            if (r3 == r8) goto L_0x02fe
            r8 = 29
            if (r3 != r8) goto L_0x02fc
            goto L_0x02fe
        L_0x02fc:
            r3 = 0
            goto L_0x02ff
        L_0x02fe:
            r3 = 1
        L_0x02ff:
            byte r8 = r1[r3]
            r8 = r8 & 7
            r16 = 1
            int r8 = r8 << 1
            int r3 = r3 + 1
            byte r17 = r1[r3]
            int r17 = r17 >> 7
            r17 = r17 & 1
            r8 = r8 | r17
            r12 = 13
            if (r8 >= r12) goto L_0x0317
            r12 = 1
            goto L_0x0318
        L_0x0317:
            r12 = 0
        L_0x0318:
            com.google.android.gms.internal.ads.blg.m36001b(r12)
            int[] r12 = com.google.android.gms.internal.ads.blh.f42844a
            r8 = r12[r8]
            byte r3 = r1[r3]
            r12 = 3
            int r3 = r3 >> r12
            r3 = r3 & 15
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            android.util.Pair r3 = android.util.Pair.create(r8, r3)
            java.lang.Object r8 = r3.first
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r22 = r8.intValue()
            java.lang.Object r3 = r3.second
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r21 = r3.intValue()
            goto L_0x034e
        L_0x0342:
            int r12 = com.google.android.gms.internal.ads.bjm.f42667t
            if (r3 != r12) goto L_0x034e
            com.google.android.gms.internal.ads.bju[] r3 = r7.f42679a
            com.google.android.gms.internal.ads.bju r8 = m35909a(r0, r8, r13)
            r3[r14] = r8
        L_0x034e:
            int r11 = r11 + r13
            r12 = 2
            goto L_0x023f
        L_0x0352:
            int r3 = com.google.android.gms.internal.ads.bjm.f42652e
            if (r4 != r3) goto L_0x035b
            java.lang.String r3 = "audio/ac3"
        L_0x0358:
            r17 = r3
            goto L_0x0365
        L_0x035b:
            int r3 = com.google.android.gms.internal.ads.bjm.f42654g
            if (r4 != r3) goto L_0x0362
            java.lang.String r3 = "audio/eac3"
            goto L_0x0358
        L_0x0362:
            java.lang.String r3 = "audio/mp4a-latm"
            goto L_0x0358
        L_0x0365:
            if (r1 != 0) goto L_0x036a
            r23 = 0
            goto L_0x0370
        L_0x036a:
            java.util.List r1 = java.util.Collections.singletonList(r1)
            r23 = r1
        L_0x0370:
            r19 = r9
            com.google.android.gms.internal.ads.bie r1 = com.google.android.gms.internal.ads.bie.m35771b(r17, r18, r19, r21, r22, r23)
            r7.f42680b = r1
            goto L_0x044c
        L_0x037a:
            r36 = r1
            r37 = r11
            int r1 = r15 + 8
            r0.mo30328a(r1)
            r0.mo30331b(r13)
            int r21 = r0.mo30330b()
            int r22 = r0.mo30330b()
            r1 = 1065353216(0x3f800000, float:1.0)
            r3 = 50
            r0.mo30331b(r3)
            int r3 = r0.f42851b
            r23 = 1065353216(0x3f800000, float:1.0)
            r24 = 0
        L_0x039b:
            int r1 = r3 - r15
            if (r1 >= r2) goto L_0x0440
            r0.mo30328a(r3)
            int r1 = r0.f42851b
            int r4 = r0.mo30333d()
            if (r4 != 0) goto L_0x03af
            int r8 = r0.f42851b
            int r8 = r8 - r15
            if (r8 == r2) goto L_0x0440
        L_0x03af:
            if (r4 <= 0) goto L_0x03b3
            r8 = 1
            goto L_0x03b4
        L_0x03b3:
            r8 = 0
        L_0x03b4:
            java.lang.String r11 = "childAtomSize should be positive"
            com.google.android.gms.internal.ads.blg.m36000a(r8, r11)
            int r8 = r0.mo30333d()
            int r11 = com.google.android.gms.internal.ads.bjm.f42662o
            if (r8 != r11) goto L_0x041b
            int r1 = r1 + 8
            r11 = 4
            int r1 = r1 + r11
            r0.mo30328a(r1)
            int r1 = r0.mo30327a()
            r12 = 3
            r1 = r1 & r12
            r13 = 1
            int r1 = r1 + r13
            if (r1 == r12) goto L_0x0415
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            int r16 = r0.mo30327a()
            r11 = r16 & 31
            r12 = 0
        L_0x03de:
            if (r12 >= r11) goto L_0x03eb
            byte[] r13 = com.google.android.gms.internal.ads.bli.m36003a(r0)
            r8.add(r13)
            int r12 = r12 + 1
            r13 = 1
            goto L_0x03de
        L_0x03eb:
            int r11 = r0.mo30327a()
            r12 = 0
        L_0x03f0:
            if (r12 >= r11) goto L_0x03fc
            byte[] r13 = com.google.android.gms.internal.ads.bli.m36003a(r0)
            r8.add(r13)
            int r12 = r12 + 1
            goto L_0x03f0
        L_0x03fc:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            android.util.Pair r1 = android.util.Pair.create(r8, r1)
            java.lang.Object r8 = r1.first
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r1 = r1.second
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r7.f42681c = r1
            r24 = r8
            goto L_0x043d
        L_0x0415:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x041b:
            int r11 = com.google.android.gms.internal.ads.bjm.f42667t
            if (r8 != r11) goto L_0x0428
            com.google.android.gms.internal.ads.bju[] r8 = r7.f42679a
            com.google.android.gms.internal.ads.bju r1 = m35909a(r0, r1, r4)
            r8[r14] = r1
            goto L_0x043d
        L_0x0428:
            int r11 = com.google.android.gms.internal.ads.bjm.f42622A
            if (r8 != r11) goto L_0x043d
            int r1 = r1 + 8
            r0.mo30328a(r1)
            int r1 = r0.mo30335f()
            int r8 = r0.mo30335f()
            float r1 = (float) r1
            float r8 = (float) r8
            float r23 = r1 / r8
        L_0x043d:
            int r3 = r3 + r4
            goto L_0x039b
        L_0x0440:
            java.lang.String r17 = "video/avc"
            r18 = -1
            r19 = r9
            com.google.android.gms.internal.ads.bie r1 = com.google.android.gms.internal.ads.bie.m35768a(r17, r18, r19, r21, r22, r23, r24)
            r7.f42680b = r1
        L_0x044c:
            int r15 = r15 + r2
            r0.mo30328a(r15)
            int r14 = r14 + 1
            r1 = r36
            r11 = r37
            r2 = 0
            r3 = 16
            r4 = 8
            r8 = 4
            goto L_0x013a
        L_0x045e:
            r37 = r11
            com.google.android.gms.internal.ads.bjt r0 = new com.google.android.gms.internal.ads.bjt
            com.google.android.gms.internal.ads.bie r11 = r7.f42680b
            com.google.android.gms.internal.ads.bju[] r12 = r7.f42679a
            int r13 = r7.f42681c
            r4 = r0
            r7 = r37
            r4.<init>(r5, r6, r7, r9, r11, r12, r13)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bjp.m35908a(com.google.android.gms.internal.ads.bjn, com.google.android.gms.internal.ads.bjo):com.google.android.gms.internal.ads.bjt");
    }

    /* renamed from: a */
    private static bju m35909a(bll bll, int i, int i2) {
        bju bju;
        int i3 = i + 8;
        bju bju2 = null;
        while (i3 - i < i2) {
            bll.mo30328a(i3);
            int d = bll.mo30333d();
            int d2 = bll.mo30333d();
            if (d2 == bjm.f42673z) {
                bll.mo30333d();
            } else if (d2 == bjm.f42668u) {
                bll.mo30331b(4);
                bll.mo30333d();
                bll.mo30333d();
            } else if (d2 == bjm.f42669v) {
                int i4 = i3 + 8;
                while (true) {
                    if (i4 - i3 >= d) {
                        bju = null;
                        break;
                    }
                    bll.mo30328a(i4);
                    int d3 = bll.mo30333d();
                    if (bll.mo30333d() == bjm.f42670w) {
                        bll.mo30331b(4);
                        int d4 = bll.mo30333d();
                        boolean z = true;
                        if ((d4 >> 8) != 1) {
                            z = false;
                        }
                        int i5 = d4 & NormalGiftView.ALPHA_255;
                        byte[] bArr = new byte[16];
                        bll.mo30329a(bArr, 0, 16);
                        bju = new bju(z, i5, bArr);
                    } else {
                        i4 += d3;
                    }
                }
                bju2 = bju;
            }
            i3 += d;
        }
        return bju2;
    }

    /* renamed from: a */
    private static byte[] m35910a(bll bll, int i) {
        bll.mo30328a(i + 8 + 4);
        bll.mo30331b(1);
        int a = bll.mo30327a();
        while (a > 127) {
            a = bll.mo30327a();
        }
        bll.mo30331b(2);
        int a2 = bll.mo30327a();
        if ((a2 & 128) != 0) {
            bll.mo30331b(2);
        }
        if ((a2 & 64) != 0) {
            bll.mo30331b(bll.mo30330b());
        }
        if ((a2 & 32) != 0) {
            bll.mo30331b(2);
        }
        bll.mo30331b(1);
        int a3 = bll.mo30327a();
        while (a3 > 127) {
            a3 = bll.mo30327a();
        }
        bll.mo30331b(13);
        bll.mo30331b(1);
        int a4 = bll.mo30327a();
        int i2 = a4 & 127;
        while (a4 > 127) {
            a4 = bll.mo30327a();
            i2 = (i2 << 8) | (a4 & 127);
        }
        byte[] bArr = new byte[i2];
        bll.mo30329a(bArr, 0, i2);
        return bArr;
    }
}
