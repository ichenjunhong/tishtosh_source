package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Stack;

public final class bjr implements biz, bjk {

    /* renamed from: a */
    private final bll f42682a = new bll(bli.f42847a);

    /* renamed from: b */
    private final bll f42683b = new bll(4);

    /* renamed from: c */
    private final bll f42684c = new bll(16);

    /* renamed from: d */
    private final Stack<bjn> f42685d = new Stack<>();

    /* renamed from: e */
    private int f42686e = 0;

    /* renamed from: f */
    private long f42687f;

    /* renamed from: g */
    private int f42688g;

    /* renamed from: h */
    private long f42689h;

    /* renamed from: i */
    private int f42690i;

    /* renamed from: j */
    private bll f42691j;

    /* renamed from: k */
    private int f42692k;

    /* renamed from: l */
    private int f42693l;

    /* renamed from: m */
    private int f42694m;

    /* renamed from: n */
    private bjb f42695n;

    /* renamed from: o */
    private bjs[] f42696o;

    /* renamed from: a */
    public final void mo30269a(bjb bjb) {
        this.f42695n = bjb;
    }

    /* renamed from: a */
    public final void mo30268a() {
        this.f42687f = 0;
        this.f42693l = 0;
        this.f42694m = 0;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Regions count limit reached
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeEndlessLoop(RegionMaker.java:368)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:172)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeEndlessLoop(RegionMaker.java:368)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:172)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:30)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
        	at jadx.core.ProcessClass.process(ProcessClass.java:35)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
        */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x037f  */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x0012 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x001e A[SYNTHETIC] */
    /* renamed from: a */
    public final int mo30267a(com.google.android.gms.internal.ads.bja r44, com.google.android.gms.internal.ads.bjf r45) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r43 = this;
            r0 = r43
        L_0x0002:
            r1 = r44
        L_0x0004:
            r2 = r45
            int r3 = r0.f42686e
            r7 = 2147483647(0x7fffffff, double:1.060997895E-314)
            r9 = 262144(0x40000, double:1.295163E-318)
            r15 = 0
            switch(r3) {
                case 0: goto L_0x037f;
                case 1: goto L_0x001e;
                default: goto L_0x0012;
            }
        L_0x0012:
            r3 = r0
            r4 = r1
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r5 = r0
            r0 = 0
            r1 = -1
            goto L_0x04ab
        L_0x001e:
            r0.f42686e = r15
            long r5 = r0.f42687f
            long r11 = r0.f42689h
            int r3 = r0.f42690i
            long r13 = (long) r3
            long r11 = r11 - r13
            long r5 = r5 + r11
            r0.f42687f = r5
            long r5 = r0.f42689h
            int r3 = r0.f42690i
            long r11 = (long) r3
            long r5 = r5 - r11
            com.google.android.gms.internal.ads.bll r3 = r0.f42691j
            if (r3 != 0) goto L_0x0043
            long r11 = r0.f42689h
            int r3 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r3 >= 0) goto L_0x0041
            long r9 = r0.f42689h
            int r3 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r3 <= 0) goto L_0x0043
        L_0x0041:
            r3 = 1
            goto L_0x0044
        L_0x0043:
            r3 = 0
        L_0x0044:
            if (r3 == 0) goto L_0x004b
            long r5 = r0.f42687f
            r2.f42599a = r5
            goto L_0x007c
        L_0x004b:
            com.google.android.gms.internal.ads.bll r7 = r0.f42691j
            if (r7 == 0) goto L_0x0078
            com.google.android.gms.internal.ads.bll r7 = r0.f42691j
            byte[] r7 = r7.f42850a
            int r8 = r0.f42690i
            int r5 = (int) r5
            r1.mo30257a(r7, r8, r5)
            java.util.Stack<com.google.android.gms.internal.ads.bjn> r5 = r0.f42685d
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x007c
            java.util.Stack<com.google.android.gms.internal.ads.bjn> r5 = r0.f42685d
            java.lang.Object r5 = r5.peek()
            com.google.android.gms.internal.ads.bjn r5 = (com.google.android.gms.internal.ads.bjn) r5
            com.google.android.gms.internal.ads.bjo r6 = new com.google.android.gms.internal.ads.bjo
            int r7 = r0.f42688g
            com.google.android.gms.internal.ads.bll r8 = r0.f42691j
            r6.<init>(r7, r8)
            java.util.List<com.google.android.gms.internal.ads.bjo> r5 = r5.f42676O
            r5.add(r6)
            goto L_0x007c
        L_0x0078:
            int r5 = (int) r5
            r1.mo30256a(r5)
        L_0x007c:
            java.util.Stack<com.google.android.gms.internal.ads.bjn> r5 = r0.f42685d
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x0375
            java.util.Stack<com.google.android.gms.internal.ads.bjn> r5 = r0.f42685d
            java.lang.Object r5 = r5.peek()
            com.google.android.gms.internal.ads.bjn r5 = (com.google.android.gms.internal.ads.bjn) r5
            long r5 = r5.f42675N
            long r7 = r0.f42687f
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto L_0x0375
            java.util.Stack<com.google.android.gms.internal.ads.bjn> r5 = r0.f42685d
            java.lang.Object r5 = r5.pop()
            com.google.android.gms.internal.ads.bjn r5 = (com.google.android.gms.internal.ads.bjn) r5
            int r6 = r5.f42674M
            int r7 = com.google.android.gms.internal.ads.bjm.f42656i
            if (r6 != r7) goto L_0x034f
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r7 = 0
        L_0x00a8:
            java.util.List<com.google.android.gms.internal.ads.bjn> r8 = r5.f42677P
            int r8 = r8.size()
            if (r7 >= r8) goto L_0x0332
            java.util.List<com.google.android.gms.internal.ads.bjn> r8 = r5.f42677P
            java.lang.Object r8 = r8.get(r7)
            com.google.android.gms.internal.ads.bjn r8 = (com.google.android.gms.internal.ads.bjn) r8
            int r9 = r8.f42674M
            int r10 = com.google.android.gms.internal.ads.bjm.f42658k
            if (r9 != r10) goto L_0x031c
            int r9 = com.google.android.gms.internal.ads.bjm.f42657j
            com.google.android.gms.internal.ads.bjo r9 = r5.mo30291c(r9)
            com.google.android.gms.internal.ads.bjt r9 = com.google.android.gms.internal.ads.bjp.m35908a(r8, r9)
            if (r9 == 0) goto L_0x031c
            int r10 = r9.f42701a
            r11 = 1936684398(0x736f756e, float:1.8971874E31)
            if (r10 == r11) goto L_0x00d8
            int r10 = r9.f42701a
            r11 = 1986618469(0x76696465, float:1.1834389E33)
            if (r10 != r11) goto L_0x031c
        L_0x00d8:
            int r10 = com.google.android.gms.internal.ads.bjm.f42659l
            com.google.android.gms.internal.ads.bjn r8 = r8.mo30292d(r10)
            int r10 = com.google.android.gms.internal.ads.bjm.f42660m
            com.google.android.gms.internal.ads.bjn r8 = r8.mo30292d(r10)
            int r10 = com.google.android.gms.internal.ads.bjm.f42661n
            com.google.android.gms.internal.ads.bjn r8 = r8.mo30292d(r10)
            int r10 = com.google.android.gms.internal.ads.bjm.f42631J
            com.google.android.gms.internal.ads.bjo r10 = r8.mo30291c(r10)
            com.google.android.gms.internal.ads.bll r10 = r10.f42678N
            int r11 = com.google.android.gms.internal.ads.bjm.f42632K
            com.google.android.gms.internal.ads.bjo r11 = r8.mo30291c(r11)
            if (r11 != 0) goto L_0x0100
            int r11 = com.google.android.gms.internal.ads.bjm.f42633L
            com.google.android.gms.internal.ads.bjo r11 = r8.mo30291c(r11)
        L_0x0100:
            com.google.android.gms.internal.ads.bll r12 = r11.f42678N
            int r13 = com.google.android.gms.internal.ads.bjm.f42630I
            com.google.android.gms.internal.ads.bjo r13 = r8.mo30291c(r13)
            com.google.android.gms.internal.ads.bll r13 = r13.f42678N
            int r14 = com.google.android.gms.internal.ads.bjm.f42627F
            com.google.android.gms.internal.ads.bjo r14 = r8.mo30291c(r14)
            com.google.android.gms.internal.ads.bll r14 = r14.f42678N
            int r4 = com.google.android.gms.internal.ads.bjm.f42628G
            com.google.android.gms.internal.ads.bjo r4 = r8.mo30291c(r4)
            if (r4 == 0) goto L_0x011d
            com.google.android.gms.internal.ads.bll r4 = r4.f42678N
            goto L_0x011e
        L_0x011d:
            r4 = 0
        L_0x011e:
            int r15 = com.google.android.gms.internal.ads.bjm.f42629H
            com.google.android.gms.internal.ads.bjo r8 = r8.mo30291c(r15)
            if (r8 == 0) goto L_0x0129
            com.google.android.gms.internal.ads.bll r8 = r8.f42678N
            goto L_0x012a
        L_0x0129:
            r8 = 0
        L_0x012a:
            r15 = 12
            r10.mo30328a(r15)
            int r17 = r10.mo30335f()
            int r15 = r10.mo30335f()
            int[] r2 = new int[r15]
            long[] r1 = new long[r15]
            r19 = r3
            long[] r3 = new long[r15]
            r20 = r5
            int[] r5 = new int[r15]
            r21 = r6
            r6 = 12
            r12.mo30328a(r6)
            r22 = r7
            int r7 = r12.mo30335f()
            r13.mo30328a(r6)
            int r6 = r13.mo30335f()
            r0 = 1
            int r6 = r6 - r0
            r23 = r9
            int r9 = r13.mo30333d()
            if (r9 != r0) goto L_0x0163
            r9 = 1
            goto L_0x0164
        L_0x0163:
            r9 = 0
        L_0x0164:
            if (r9 == 0) goto L_0x030e
            int r9 = r13.mo30335f()
            r0 = 4
            r13.mo30331b(r0)
            if (r6 <= 0) goto L_0x017d
            int r0 = r13.mo30335f()
            r16 = 1
            int r0 = r0 + -1
            r25 = r0
            r0 = 12
            goto L_0x0183
        L_0x017d:
            r16 = 1
            r0 = 12
            r25 = -1
        L_0x0183:
            r14.mo30328a(r0)
            int r18 = r14.mo30335f()
            int r18 = r18 + -1
            int r24 = r14.mo30335f()
            int r26 = r14.mo30335f()
            if (r8 == 0) goto L_0x01a8
            r8.mo30328a(r0)
            int r27 = r8.mo30335f()
            int r27 = r27 + -1
            int r28 = r8.mo30335f()
            int r29 = r8.mo30333d()
            goto L_0x01ae
        L_0x01a8:
            r27 = 0
            r28 = 0
            r29 = 0
        L_0x01ae:
            if (r4 == 0) goto L_0x01c0
            r4.mo30328a(r0)
            int r0 = r4.mo30335f()
            int r30 = r4.mo30335f()
            int r30 = r30 + -1
            r31 = r0
            goto L_0x01c4
        L_0x01c0:
            r30 = -1
            r31 = 0
        L_0x01c4:
            int r0 = r11.f42674M
            r32 = r6
            int r6 = com.google.android.gms.internal.ads.bjm.f42632K
            if (r0 != r6) goto L_0x01d1
            long r33 = r12.mo30332c()
            goto L_0x01d5
        L_0x01d1:
            long r33 = r12.mo30336g()
        L_0x01d5:
            r36 = r12
            r35 = r13
            r37 = r25
            r12 = r26
            r6 = r29
            r13 = r30
            r0 = 0
            r29 = 0
            r30 = r9
            r26 = r18
            r18 = r30
            r9 = r24
            r24 = 0
        L_0x01ee:
            if (r0 >= r15) goto L_0x02a8
            r3[r0] = r33
            if (r17 != 0) goto L_0x01f9
            int r38 = r10.mo30335f()
            goto L_0x01fb
        L_0x01f9:
            r38 = r17
        L_0x01fb:
            r2[r0] = r38
            r39 = r2
            r40 = r3
            long r2 = (long) r6
            long r2 = r24 + r2
            r1[r0] = r2
            if (r4 != 0) goto L_0x020a
            r2 = 1
            goto L_0x020b
        L_0x020a:
            r2 = 0
        L_0x020b:
            r5[r0] = r2
            if (r0 != r13) goto L_0x021c
            r2 = 1
            r5[r0] = r2
            int r31 = r31 + -1
            if (r31 <= 0) goto L_0x021c
            int r3 = r4.mo30335f()
            int r3 = r3 - r2
            r13 = r3
        L_0x021c:
            long r2 = (long) r12
            long r24 = r24 + r2
            int r9 = r9 + -1
            if (r9 != 0) goto L_0x0231
            if (r26 <= 0) goto L_0x0231
            int r2 = r14.mo30335f()
            int r3 = r14.mo30335f()
            int r26 = r26 + -1
            r9 = r2
            r12 = r3
        L_0x0231:
            if (r8 == 0) goto L_0x0246
            int r28 = r28 + -1
            if (r28 != 0) goto L_0x0246
            if (r27 <= 0) goto L_0x0246
            int r2 = r8.mo30335f()
            int r3 = r8.mo30333d()
            int r27 = r27 + -1
            r28 = r2
            r6 = r3
        L_0x0246:
            int r18 = r18 + -1
            if (r18 != 0) goto L_0x0291
            int r2 = r29 + 1
            if (r2 >= r7) goto L_0x0260
            int r3 = r11.f42674M
            r41 = r4
            int r4 = com.google.android.gms.internal.ads.bjm.f42632K
            if (r3 != r4) goto L_0x025b
            long r33 = r36.mo30332c()
            goto L_0x0262
        L_0x025b:
            long r33 = r36.mo30336g()
            goto L_0x0262
        L_0x0260:
            r41 = r4
        L_0x0262:
            r3 = r37
            if (r2 != r3) goto L_0x0281
            int r30 = r35.mo30335f()
            r42 = r3
            r4 = r35
            r3 = 4
            r4.mo30331b(r3)
            int r32 = r32 + -1
            if (r32 <= 0) goto L_0x0285
            int r3 = r4.mo30335f()
            r16 = 1
            int r37 = r3 + -1
            r42 = r37
            goto L_0x0285
        L_0x0281:
            r42 = r3
            r4 = r35
        L_0x0285:
            if (r2 >= r7) goto L_0x028c
            r29 = r2
            r18 = r30
            goto L_0x028e
        L_0x028c:
            r29 = r2
        L_0x028e:
            r37 = r42
            goto L_0x029c
        L_0x0291:
            r41 = r4
            r4 = r35
            r42 = r37
            r2 = r39[r0]
            long r2 = (long) r2
            long r33 = r33 + r2
        L_0x029c:
            int r0 = r0 + 1
            r35 = r4
            r2 = r39
            r3 = r40
            r4 = r41
            goto L_0x01ee
        L_0x02a8:
            r39 = r2
            r40 = r3
            r2 = 1000000(0xf4240, double:4.940656E-318)
            r0 = r23
            long r6 = r0.f42702b
            com.google.android.gms.internal.ads.blp.m36023a(r1, r2, r6)
            if (r31 != 0) goto L_0x02ba
            r2 = 1
            goto L_0x02bb
        L_0x02ba:
            r2 = 0
        L_0x02bb:
            com.google.android.gms.internal.ads.blg.m35999a(r2)
            if (r9 != 0) goto L_0x02c2
            r2 = 1
            goto L_0x02c3
        L_0x02c2:
            r2 = 0
        L_0x02c3:
            com.google.android.gms.internal.ads.blg.m35999a(r2)
            if (r18 != 0) goto L_0x02ca
            r2 = 1
            goto L_0x02cb
        L_0x02ca:
            r2 = 0
        L_0x02cb:
            com.google.android.gms.internal.ads.blg.m35999a(r2)
            if (r26 != 0) goto L_0x02d2
            r2 = 1
            goto L_0x02d3
        L_0x02d2:
            r2 = 0
        L_0x02d3:
            com.google.android.gms.internal.ads.blg.m35999a(r2)
            if (r27 != 0) goto L_0x02da
            r2 = 1
            goto L_0x02db
        L_0x02da:
            r2 = 0
        L_0x02db:
            com.google.android.gms.internal.ads.blg.m35999a(r2)
            com.google.android.gms.internal.ads.bjv r2 = new com.google.android.gms.internal.ads.bjv
            r3 = r39
            r4 = r40
            r2.<init>(r4, r3, r1, r5)
            int r1 = r2.f42711a
            if (r1 == 0) goto L_0x0307
            com.google.android.gms.internal.ads.bjs r1 = new com.google.android.gms.internal.ads.bjs
            r3 = r43
            com.google.android.gms.internal.ads.bjb r4 = r3.f42695n
            r15 = r22
            com.google.android.gms.internal.ads.bjl r4 = r4.mo30273c(r15)
            r1.<init>(r0, r2, r4)
            com.google.android.gms.internal.ads.bjl r2 = r1.f42699c
            com.google.android.gms.internal.ads.bie r0 = r0.f42703c
            r2.mo30262a(r0)
            r0 = r21
            r0.add(r1)
            goto L_0x0323
        L_0x0307:
            r0 = r21
            r15 = r22
            r3 = r43
            goto L_0x0323
        L_0x030e:
            r3 = r43
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "stsc first chunk must be 1"
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.<init>(r1)
            throw r0
        L_0x031c:
            r19 = r3
            r20 = r5
            r15 = r7
            r3 = r0
            r0 = r6
        L_0x0323:
            int r7 = r15 + 1
            r6 = r0
            r0 = r3
            r3 = r19
            r5 = r20
            r1 = r44
            r2 = r45
            r15 = 0
            goto L_0x00a8
        L_0x0332:
            r19 = r3
            r1 = 0
            r3 = r0
            r0 = r6
            com.google.android.gms.internal.ads.bjs[] r2 = new com.google.android.gms.internal.ads.bjs[r1]
            java.lang.Object[] r0 = r0.toArray(r2)
            com.google.android.gms.internal.ads.bjs[] r0 = (com.google.android.gms.internal.ads.bjs[]) r0
            r3.f42696o = r0
            com.google.android.gms.internal.ads.bjb r0 = r3.f42695n
            r0.mo30274d()
            com.google.android.gms.internal.ads.bjb r0 = r3.f42695n
            r0.mo30272a(r3)
            r0 = 2
            r3.f42686e = r0
            goto L_0x036b
        L_0x034f:
            r19 = r3
            r20 = r5
            r3 = r0
            java.util.Stack<com.google.android.gms.internal.ads.bjn> r0 = r3.f42685d
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x036b
            java.util.Stack<com.google.android.gms.internal.ads.bjn> r0 = r3.f42685d
            java.lang.Object r0 = r0.peek()
            com.google.android.gms.internal.ads.bjn r0 = (com.google.android.gms.internal.ads.bjn) r0
            java.util.List<com.google.android.gms.internal.ads.bjn> r0 = r0.f42677P
            r5 = r20
            r0.add(r5)
        L_0x036b:
            r0 = r3
            r3 = r19
            r1 = r44
            r2 = r45
            r15 = 0
            goto L_0x007c
        L_0x0375:
            r19 = r3
            r3 = r0
            if (r19 == 0) goto L_0x037c
            r0 = 1
            return r0
        L_0x037c:
            r0 = r3
            goto L_0x0002
        L_0x037f:
            r3 = r0
            r0 = 1
            com.google.android.gms.internal.ads.bll r1 = r3.f42684c
            byte[] r1 = r1.f42850a
            r2 = 8
            r4 = r44
            r5 = 0
            boolean r1 = r4.mo30258a(r1, r5, r2, r0)
            if (r1 != 0) goto L_0x0392
            goto L_0x04a3
        L_0x0392:
            com.google.android.gms.internal.ads.bll r0 = r3.f42684c
            r0.mo30328a(r5)
            com.google.android.gms.internal.ads.bll r0 = r3.f42684c
            long r0 = r0.mo30332c()
            r3.f42689h = r0
            com.google.android.gms.internal.ads.bll r0 = r3.f42684c
            int r0 = r0.mo30333d()
            r3.f42688g = r0
            long r0 = r3.f42689h
            r5 = 1
            int r9 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r9 != 0) goto L_0x03ca
            com.google.android.gms.internal.ads.bll r0 = r3.f42684c
            byte[] r0 = r0.f42850a
            r4.mo30257a(r0, r2, r2)
            com.google.android.gms.internal.ads.bll r0 = r3.f42684c
            long r0 = r0.mo30334e()
            r3.f42689h = r0
            long r0 = r3.f42687f
            r9 = 16
            long r0 = r0 + r9
            r3.f42687f = r0
            r0 = 16
            r3.f42690i = r0
            goto L_0x03d3
        L_0x03ca:
            long r0 = r3.f42687f
            r9 = 8
            long r0 = r0 + r9
            r3.f42687f = r0
            r3.f42690i = r2
        L_0x03d3:
            int r0 = r3.f42688g
            int r1 = com.google.android.gms.internal.ads.bjm.f42656i
            if (r0 == r1) goto L_0x03ec
            int r1 = com.google.android.gms.internal.ads.bjm.f42658k
            if (r0 == r1) goto L_0x03ec
            int r1 = com.google.android.gms.internal.ads.bjm.f42659l
            if (r0 == r1) goto L_0x03ec
            int r1 = com.google.android.gms.internal.ads.bjm.f42660m
            if (r0 == r1) goto L_0x03ec
            int r1 = com.google.android.gms.internal.ads.bjm.f42661n
            if (r0 != r1) goto L_0x03ea
            goto L_0x03ec
        L_0x03ea:
            r0 = 0
            goto L_0x03ed
        L_0x03ec:
            r0 = 1
        L_0x03ed:
            if (r0 == 0) goto L_0x0426
            long r0 = r3.f42689h
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x040c
            java.util.Stack<com.google.android.gms.internal.ads.bjn> r0 = r3.f42685d
            com.google.android.gms.internal.ads.bjn r1 = new com.google.android.gms.internal.ads.bjn
            int r2 = r3.f42688g
            long r5 = r3.f42687f
            long r7 = r3.f42689h
            long r5 = r5 + r7
            int r7 = r3.f42690i
            long r7 = (long) r7
            long r5 = r5 - r7
            r1.<init>(r2, r5)
            r0.add(r1)
        L_0x040a:
            r0 = 0
            goto L_0x0422
        L_0x040c:
            java.util.Stack<com.google.android.gms.internal.ads.bjn> r0 = r3.f42685d
            com.google.android.gms.internal.ads.bjn r1 = new com.google.android.gms.internal.ads.bjn
            int r2 = r3.f42688g
            long r5 = r3.f42687f
            long r7 = r3.f42689h
            long r5 = r5 + r7
            int r7 = r3.f42690i
            long r7 = (long) r7
            long r5 = r5 - r7
            r1.<init>(r2, r5)
            r0.add(r1)
            goto L_0x040a
        L_0x0422:
            r3.f42686e = r0
            goto L_0x04a2
        L_0x0426:
            int r0 = r3.f42688g
            int r1 = com.google.android.gms.internal.ads.bjm.f42664q
            if (r0 == r1) goto L_0x0473
            int r1 = com.google.android.gms.internal.ads.bjm.f42657j
            if (r0 == r1) goto L_0x0473
            int r1 = com.google.android.gms.internal.ads.bjm.f42665r
            if (r0 == r1) goto L_0x0473
            int r1 = com.google.android.gms.internal.ads.bjm.f42624C
            if (r0 == r1) goto L_0x0473
            int r1 = com.google.android.gms.internal.ads.bjm.f42625D
            if (r0 == r1) goto L_0x0473
            int r1 = com.google.android.gms.internal.ads.bjm.f42666s
            if (r0 == r1) goto L_0x0473
            int r1 = com.google.android.gms.internal.ads.bjm.f42647a
            if (r0 == r1) goto L_0x0473
            int r1 = com.google.android.gms.internal.ads.bjm.f42662o
            if (r0 == r1) goto L_0x0473
            int r1 = com.google.android.gms.internal.ads.bjm.f42651d
            if (r0 == r1) goto L_0x0473
            int r1 = com.google.android.gms.internal.ads.bjm.f42650c
            if (r0 == r1) goto L_0x0473
            int r1 = com.google.android.gms.internal.ads.bjm.f42627F
            if (r0 == r1) goto L_0x0473
            int r1 = com.google.android.gms.internal.ads.bjm.f42628G
            if (r0 == r1) goto L_0x0473
            int r1 = com.google.android.gms.internal.ads.bjm.f42629H
            if (r0 == r1) goto L_0x0473
            int r1 = com.google.android.gms.internal.ads.bjm.f42630I
            if (r0 == r1) goto L_0x0473
            int r1 = com.google.android.gms.internal.ads.bjm.f42631J
            if (r0 == r1) goto L_0x0473
            int r1 = com.google.android.gms.internal.ads.bjm.f42632K
            if (r0 == r1) goto L_0x0473
            int r1 = com.google.android.gms.internal.ads.bjm.f42633L
            if (r0 == r1) goto L_0x0473
            int r1 = com.google.android.gms.internal.ads.bjm.f42663p
            if (r0 != r1) goto L_0x0471
            goto L_0x0473
        L_0x0471:
            r0 = 0
            goto L_0x0474
        L_0x0473:
            r0 = 1
        L_0x0474:
            if (r0 == 0) goto L_0x049c
            long r0 = r3.f42689h
            int r5 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r5 >= 0) goto L_0x047e
            r0 = 1
            goto L_0x047f
        L_0x047e:
            r0 = 0
        L_0x047f:
            com.google.android.gms.internal.ads.blg.m36001b(r0)
            com.google.android.gms.internal.ads.bll r0 = new com.google.android.gms.internal.ads.bll
            long r5 = r3.f42689h
            int r1 = (int) r5
            r0.<init>(r1)
            r3.f42691j = r0
            com.google.android.gms.internal.ads.bll r0 = r3.f42684c
            byte[] r0 = r0.f42850a
            com.google.android.gms.internal.ads.bll r1 = r3.f42691j
            byte[] r1 = r1.f42850a
            r5 = 0
            java.lang.System.arraycopy(r0, r5, r1, r5, r2)
            r0 = 1
            r3.f42686e = r0
            goto L_0x04a2
        L_0x049c:
            r0 = 1
            r1 = 0
            r3.f42691j = r1
            r3.f42686e = r0
        L_0x04a2:
            r5 = 1
        L_0x04a3:
            if (r5 != 0) goto L_0x04a7
            r0 = -1
            return r0
        L_0x04a7:
            r0 = r3
            r1 = r4
            goto L_0x0004
        L_0x04ab:
            com.google.android.gms.internal.ads.bjs[] r2 = r3.f42696o
            int r2 = r2.length
            if (r0 >= r2) goto L_0x04cb
            com.google.android.gms.internal.ads.bjs[] r2 = r3.f42696o
            r2 = r2[r0]
            int r7 = r2.f42700d
            com.google.android.gms.internal.ads.bjv r8 = r2.f42698b
            int r8 = r8.f42711a
            if (r7 == r8) goto L_0x04c8
            com.google.android.gms.internal.ads.bjv r2 = r2.f42698b
            long[] r2 = r2.f42712b
            r7 = r2[r7]
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 >= 0) goto L_0x04c8
            r1 = r0
            r5 = r7
        L_0x04c8:
            int r0 = r0 + 1
            goto L_0x04ab
        L_0x04cb:
            r0 = -1
            if (r1 != r0) goto L_0x04cf
            return r0
        L_0x04cf:
            com.google.android.gms.internal.ads.bjs[] r0 = r3.f42696o
            r0 = r0[r1]
            int r1 = r0.f42700d
            com.google.android.gms.internal.ads.bjv r2 = r0.f42698b
            long[] r2 = r2.f42712b
            r5 = r2[r1]
            long r7 = r44.mo30255a()
            long r7 = r5 - r7
            int r2 = r3.f42693l
            long r11 = (long) r2
            long r7 = r7 + r11
            r11 = 0
            int r2 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r2 < 0) goto L_0x05a7
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 < 0) goto L_0x04f4
            r0 = r45
            r2 = 1
            goto L_0x05aa
        L_0x04f4:
            int r2 = (int) r7
            r4.mo30256a(r2)
            com.google.android.gms.internal.ads.bjv r2 = r0.f42698b
            int[] r2 = r2.f42713c
            r2 = r2[r1]
            r3.f42692k = r2
            com.google.android.gms.internal.ads.bjt r2 = r0.f42697a
            int r2 = r2.f42704d
            r5 = -1
            if (r2 == r5) goto L_0x056a
            com.google.android.gms.internal.ads.bll r2 = r3.f42683b
            byte[] r2 = r2.f42850a
            r5 = 0
            r2[r5] = r5
            r6 = 1
            r2[r6] = r5
            r6 = 2
            r2[r6] = r5
            com.google.android.gms.internal.ads.bjt r2 = r0.f42697a
            int r2 = r2.f42704d
            com.google.android.gms.internal.ads.bjt r5 = r0.f42697a
            int r5 = r5.f42704d
            r6 = 4
            int r12 = 4 - r5
        L_0x051f:
            int r5 = r3.f42693l
            int r6 = r3.f42692k
            if (r5 >= r6) goto L_0x0586
            int r5 = r3.f42694m
            if (r5 != 0) goto L_0x0556
            com.google.android.gms.internal.ads.bll r5 = r3.f42683b
            byte[] r5 = r5.f42850a
            r4.mo30257a(r5, r12, r2)
            com.google.android.gms.internal.ads.bll r5 = r3.f42683b
            r6 = 0
            r5.mo30328a(r6)
            com.google.android.gms.internal.ads.bll r5 = r3.f42683b
            int r5 = r5.mo30335f()
            r3.f42694m = r5
            com.google.android.gms.internal.ads.bll r5 = r3.f42682a
            r5.mo30328a(r6)
            com.google.android.gms.internal.ads.bjl r5 = r0.f42699c
            com.google.android.gms.internal.ads.bll r6 = r3.f42682a
            r7 = 4
            r5.mo30263a(r6, r7)
            int r5 = r3.f42693l
            int r5 = r5 + r7
            r3.f42693l = r5
            int r5 = r3.f42692k
            int r5 = r5 + r12
            r3.f42692k = r5
            goto L_0x051f
        L_0x0556:
            r7 = 4
            com.google.android.gms.internal.ads.bjl r5 = r0.f42699c
            int r6 = r3.f42694m
            int r5 = r5.mo30259a(r4, r6)
            int r6 = r3.f42693l
            int r6 = r6 + r5
            r3.f42693l = r6
            int r6 = r3.f42694m
            int r6 = r6 - r5
            r3.f42694m = r6
            goto L_0x051f
        L_0x056a:
            int r2 = r3.f42693l
            int r5 = r3.f42692k
            if (r2 >= r5) goto L_0x0586
            com.google.android.gms.internal.ads.bjl r2 = r0.f42699c
            int r5 = r3.f42692k
            int r6 = r3.f42693l
            int r5 = r5 - r6
            int r2 = r2.mo30259a(r4, r5)
            int r5 = r3.f42693l
            int r5 = r5 + r2
            r3.f42693l = r5
            int r5 = r3.f42694m
            int r5 = r5 - r2
            r3.f42694m = r5
            goto L_0x056a
        L_0x0586:
            com.google.android.gms.internal.ads.bjl r6 = r0.f42699c
            com.google.android.gms.internal.ads.bjv r2 = r0.f42698b
            long[] r2 = r2.f42714d
            r7 = r2[r1]
            com.google.android.gms.internal.ads.bjv r2 = r0.f42698b
            int[] r2 = r2.f42715e
            r9 = r2[r1]
            int r10 = r3.f42692k
            r11 = 0
            r12 = 0
            r6.mo30261a(r7, r9, r10, r11, r12)
            int r1 = r0.f42700d
            r2 = 1
            int r1 = r1 + r2
            r0.f42700d = r1
            r0 = 0
            r3.f42693l = r0
            r3.f42694m = r0
            return r0
        L_0x05a7:
            r2 = 1
            r0 = r45
        L_0x05aa:
            r0.f42599a = r5
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bjr.mo30267a(com.google.android.gms.internal.ads.bja, com.google.android.gms.internal.ads.bjf):int");
    }

    /* renamed from: a */
    public final long mo30254a(long j) {
        int i;
        long j2 = Long.MAX_VALUE;
        for (int i2 = 0; i2 < this.f42696o.length; i2++) {
            bjv bjv = this.f42696o[i2].f42698b;
            int a = blp.m36022a(bjv.f42714d, j, true, false);
            while (true) {
                if (a >= 0) {
                    if (bjv.f42714d[a] <= j && (bjv.f42715e[a] & 1) != 0) {
                        break;
                    }
                    a--;
                } else {
                    a = -1;
                    break;
                }
            }
            if (i == -1) {
                i = Arrays.binarySearch(bjv.f42714d, j);
                if (i < 0) {
                    i ^= -1;
                }
                while (true) {
                    if (i < bjv.f42714d.length) {
                        if (bjv.f42714d[i] >= j && (bjv.f42715e[i] & 1) != 0) {
                            break;
                        }
                        i++;
                    } else {
                        i = -1;
                        break;
                    }
                }
            }
            this.f42696o[i2].f42700d = i;
            long j3 = bjv.f42712b[this.f42696o[i2].f42700d];
            if (j3 < j2) {
                j2 = j3;
            }
        }
        return j2;
    }
}
