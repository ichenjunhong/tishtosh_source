package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Stack;

public final class bpu implements bok, bor {

    /* renamed from: a */
    private static final bon f43484a = new bpv();

    /* renamed from: b */
    private static final int f43485b = btw.m36765b("qt  ");

    /* renamed from: c */
    private final btr f43486c = new btr(bto.f43849a);

    /* renamed from: d */
    private final btr f43487d = new btr(4);

    /* renamed from: e */
    private final btr f43488e = new btr(16);

    /* renamed from: f */
    private final Stack<bpi> f43489f = new Stack<>();

    /* renamed from: g */
    private int f43490g;

    /* renamed from: h */
    private int f43491h;

    /* renamed from: i */
    private long f43492i;

    /* renamed from: j */
    private int f43493j;

    /* renamed from: k */
    private btr f43494k;

    /* renamed from: l */
    private int f43495l;

    /* renamed from: m */
    private int f43496m;

    /* renamed from: n */
    private bom f43497n;

    /* renamed from: o */
    private bpw[] f43498o;

    /* renamed from: p */
    private long f43499p;

    /* renamed from: q */
    private boolean f43500q;

    /* renamed from: a */
    public final boolean mo30494a() {
        return true;
    }

    /* renamed from: a */
    public final void mo30508a(bom bom) {
        this.f43497n = bom;
    }

    /* renamed from: a */
    public final void mo30507a(long j, long j2) {
        bpw[] bpwArr;
        this.f43489f.clear();
        this.f43493j = 0;
        this.f43495l = 0;
        this.f43496m = 0;
        if (j == 0) {
            m36419c();
            return;
        }
        if (this.f43498o != null) {
            for (bpw bpw : this.f43498o) {
                bqb bqb = bpw.f43502b;
                int a = bqb.mo30546a(j2);
                if (a == -1) {
                    a = bqb.mo30547b(j2);
                }
                bpw.f43504d = a;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:149:0x01a0 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x02b5 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0006 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0006 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo30506a(com.google.android.gms.internal.ads.bol r25, com.google.android.gms.internal.ads.boq r26) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            r2 = r26
        L_0x0006:
            int r3 = r0.f43490g
            r5 = 262144(0x40000, double:1.295163E-318)
            r8 = -1
            r9 = 8
            r10 = 1
            switch(r3) {
                case 0: goto L_0x01a2;
                case 1: goto L_0x0119;
                case 2: goto L_0x0018;
                default: goto L_0x0012;
            }
        L_0x0012:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x0018:
            r12 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r3 = 0
            r9 = -1
        L_0x001f:
            com.google.android.gms.internal.ads.bpw[] r14 = r0.f43498o
            int r14 = r14.length
            if (r3 >= r14) goto L_0x003f
            com.google.android.gms.internal.ads.bpw[] r14 = r0.f43498o
            r14 = r14[r3]
            int r15 = r14.f43504d
            com.google.android.gms.internal.ads.bqb r7 = r14.f43502b
            int r7 = r7.f43526a
            if (r15 == r7) goto L_0x003c
            com.google.android.gms.internal.ads.bqb r7 = r14.f43502b
            long[] r7 = r7.f43527b
            r14 = r7[r15]
            int r7 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r7 >= 0) goto L_0x003c
            r9 = r3
            r12 = r14
        L_0x003c:
            int r3 = r3 + 1
            goto L_0x001f
        L_0x003f:
            if (r9 != r8) goto L_0x0042
            return r8
        L_0x0042:
            com.google.android.gms.internal.ads.bpw[] r3 = r0.f43498o
            r3 = r3[r9]
            com.google.android.gms.internal.ads.bot r7 = r3.f43503c
            int r8 = r3.f43504d
            com.google.android.gms.internal.ads.bqb r9 = r3.f43502b
            long[] r9 = r9.f43527b
            r12 = r9[r8]
            com.google.android.gms.internal.ads.bqb r9 = r3.f43502b
            int[] r9 = r9.f43528c
            r9 = r9[r8]
            com.google.android.gms.internal.ads.bpy r14 = r3.f43501a
            int r14 = r14.f43512g
            if (r14 != r10) goto L_0x0061
            r14 = 8
            long r12 = r12 + r14
            int r9 = r9 + -8
        L_0x0061:
            long r14 = r25.mo30500b()
            long r14 = r12 - r14
            int r4 = r0.f43495l
            long r10 = (long) r4
            long r14 = r14 + r10
            r10 = 0
            int r4 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r4 < 0) goto L_0x0115
            int r4 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r4 < 0) goto L_0x0077
            goto L_0x0115
        L_0x0077:
            int r2 = (int) r14
            r1.mo30501b(r2)
            com.google.android.gms.internal.ads.bpy r2 = r3.f43501a
            int r2 = r2.f43515j
            if (r2 == 0) goto L_0x00da
            com.google.android.gms.internal.ads.btr r2 = r0.f43487d
            byte[] r2 = r2.f43867a
            r4 = 0
            r2[r4] = r4
            r5 = 1
            r2[r5] = r4
            r5 = 2
            r2[r5] = r4
            com.google.android.gms.internal.ads.bpy r2 = r3.f43501a
            int r2 = r2.f43515j
            com.google.android.gms.internal.ads.bpy r4 = r3.f43501a
            int r4 = r4.f43515j
            r5 = 4
            int r4 = 4 - r4
        L_0x0099:
            int r5 = r0.f43495l
            if (r5 >= r9) goto L_0x00f2
            int r5 = r0.f43496m
            if (r5 != 0) goto L_0x00c8
            com.google.android.gms.internal.ads.btr r5 = r0.f43487d
            byte[] r5 = r5.f43867a
            r1.mo30502b(r5, r4, r2)
            com.google.android.gms.internal.ads.btr r5 = r0.f43487d
            r6 = 0
            r5.mo30697c(r6)
            com.google.android.gms.internal.ads.btr r5 = r0.f43487d
            int r5 = r5.mo30705i()
            r0.f43496m = r5
            com.google.android.gms.internal.ads.btr r5 = r0.f43486c
            r5.mo30697c(r6)
            com.google.android.gms.internal.ads.btr r5 = r0.f43486c
            r10 = 4
            r7.mo30517a(r5, r10)
            int r5 = r0.f43495l
            int r5 = r5 + r10
            r0.f43495l = r5
            int r9 = r9 + r4
            goto L_0x0099
        L_0x00c8:
            r6 = 0
            int r5 = r0.f43496m
            int r5 = r7.mo30515a(r1, r5, r6)
            int r6 = r0.f43495l
            int r6 = r6 + r5
            r0.f43495l = r6
            int r6 = r0.f43496m
            int r6 = r6 - r5
            r0.f43496m = r6
            goto L_0x0099
        L_0x00da:
            int r2 = r0.f43495l
            if (r2 >= r9) goto L_0x00f2
            int r2 = r0.f43495l
            int r2 = r9 - r2
            r4 = 0
            int r2 = r7.mo30515a(r1, r2, r4)
            int r4 = r0.f43495l
            int r4 = r4 + r2
            r0.f43495l = r4
            int r4 = r0.f43496m
            int r4 = r4 - r2
            r0.f43496m = r4
            goto L_0x00da
        L_0x00f2:
            r20 = r9
            com.google.android.gms.internal.ads.bqb r1 = r3.f43502b
            long[] r1 = r1.f43530e
            r17 = r1[r8]
            com.google.android.gms.internal.ads.bqb r1 = r3.f43502b
            int[] r1 = r1.f43531f
            r19 = r1[r8]
            r21 = 0
            r22 = 0
            r16 = r7
            r16.mo30516a(r17, r19, r20, r21, r22)
            int r1 = r3.f43504d
            r4 = 1
            int r1 = r1 + r4
            r3.f43504d = r1
            r1 = 0
            r0.f43495l = r1
            r0.f43496m = r1
            return r1
        L_0x0115:
            r4 = 1
            r2.f43202a = r12
            return r4
        L_0x0119:
            long r3 = r0.f43492i
            int r7 = r0.f43493j
            long r7 = (long) r7
            long r3 = r3 - r7
            long r7 = r25.mo30500b()
            long r7 = r7 + r3
            com.google.android.gms.internal.ads.btr r10 = r0.f43494k
            if (r10 == 0) goto L_0x017d
            com.google.android.gms.internal.ads.btr r5 = r0.f43494k
            byte[] r5 = r5.f43867a
            int r6 = r0.f43493j
            int r3 = (int) r3
            r1.mo30502b(r5, r6, r3)
            int r3 = r0.f43491h
            int r4 = com.google.android.gms.internal.ads.bph.f43345a
            if (r3 != r4) goto L_0x015e
            com.google.android.gms.internal.ads.btr r3 = r0.f43494k
            r3.mo30697c(r9)
            int r4 = r3.mo30703g()
            int r5 = f43485b
            if (r4 != r5) goto L_0x0147
        L_0x0145:
            r3 = 1
            goto L_0x015b
        L_0x0147:
            r4 = 4
            r3.mo30699d(r4)
        L_0x014b:
            int r4 = r3.mo30694b()
            if (r4 <= 0) goto L_0x015a
            int r4 = r3.mo30703g()
            int r5 = f43485b
            if (r4 != r5) goto L_0x014b
            goto L_0x0145
        L_0x015a:
            r3 = 0
        L_0x015b:
            r0.f43500q = r3
            goto L_0x0185
        L_0x015e:
            java.util.Stack<com.google.android.gms.internal.ads.bpi> r3 = r0.f43489f
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x0185
            java.util.Stack<com.google.android.gms.internal.ads.bpi> r3 = r0.f43489f
            java.lang.Object r3 = r3.peek()
            com.google.android.gms.internal.ads.bpi r3 = (com.google.android.gms.internal.ads.bpi) r3
            com.google.android.gms.internal.ads.bpj r4 = new com.google.android.gms.internal.ads.bpj
            int r5 = r0.f43491h
            com.google.android.gms.internal.ads.btr r6 = r0.f43494k
            r4.<init>(r5, r6)
            java.util.List<com.google.android.gms.internal.ads.bpj> r3 = r3.f43413aA
            r3.add(r4)
            goto L_0x0185
        L_0x017d:
            int r9 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r9 >= 0) goto L_0x0187
            int r3 = (int) r3
            r1.mo30501b(r3)
        L_0x0185:
            r3 = 0
            goto L_0x018f
        L_0x0187:
            long r5 = r25.mo30500b()
            long r5 = r5 + r3
            r2.f43202a = r5
            r3 = 1
        L_0x018f:
            r0.m36418b(r7)
            if (r3 == 0) goto L_0x019c
            int r3 = r0.f43490g
            r4 = 2
            if (r3 == r4) goto L_0x019c
            r23 = 1
            goto L_0x019e
        L_0x019c:
            r23 = 0
        L_0x019e:
            if (r23 == 0) goto L_0x0006
            r3 = 1
            return r3
        L_0x01a2:
            r3 = 1
            int r4 = r0.f43493j
            if (r4 != 0) goto L_0x01cc
            com.google.android.gms.internal.ads.btr r4 = r0.f43488e
            byte[] r4 = r4.f43867a
            r5 = 0
            boolean r4 = r1.mo30499a(r4, r5, r9, r3)
            if (r4 != 0) goto L_0x01b5
            r3 = 0
            goto L_0x02b3
        L_0x01b5:
            r0.f43493j = r9
            com.google.android.gms.internal.ads.btr r3 = r0.f43488e
            r3.mo30697c(r5)
            com.google.android.gms.internal.ads.btr r3 = r0.f43488e
            long r3 = r3.mo30702f()
            r0.f43492i = r3
            com.google.android.gms.internal.ads.btr r3 = r0.f43488e
            int r3 = r3.mo30703g()
            r0.f43491h = r3
        L_0x01cc:
            long r3 = r0.f43492i
            r5 = 1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x01e8
            com.google.android.gms.internal.ads.btr r3 = r0.f43488e
            byte[] r3 = r3.f43867a
            r1.mo30502b(r3, r9, r9)
            int r3 = r0.f43493j
            int r3 = r3 + r9
            r0.f43493j = r3
            com.google.android.gms.internal.ads.btr r3 = r0.f43488e
            long r3 = r3.mo30706j()
            r0.f43492i = r3
        L_0x01e8:
            int r3 = r0.f43491h
            int r4 = com.google.android.gms.internal.ads.bph.f43407v
            if (r3 == r4) goto L_0x0205
            int r4 = com.google.android.gms.internal.ads.bph.f43409x
            if (r3 == r4) goto L_0x0205
            int r4 = com.google.android.gms.internal.ads.bph.f43410y
            if (r3 == r4) goto L_0x0205
            int r4 = com.google.android.gms.internal.ads.bph.f43411z
            if (r3 == r4) goto L_0x0205
            int r4 = com.google.android.gms.internal.ads.bph.f43319A
            if (r3 == r4) goto L_0x0205
            int r4 = com.google.android.gms.internal.ads.bph.f43326H
            if (r3 != r4) goto L_0x0203
            goto L_0x0205
        L_0x0203:
            r3 = 0
            goto L_0x0206
        L_0x0205:
            r3 = 1
        L_0x0206:
            if (r3 == 0) goto L_0x0232
            long r3 = r25.mo30500b()
            long r5 = r0.f43492i
            long r3 = r3 + r5
            int r5 = r0.f43493j
            long r5 = (long) r5
            long r3 = r3 - r5
            java.util.Stack<com.google.android.gms.internal.ads.bpi> r5 = r0.f43489f
            com.google.android.gms.internal.ads.bpi r6 = new com.google.android.gms.internal.ads.bpi
            int r7 = r0.f43491h
            r6.<init>(r7, r3)
            r5.add(r6)
            long r5 = r0.f43492i
            int r7 = r0.f43493j
            long r9 = (long) r7
            int r7 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r7 != 0) goto L_0x022e
            r0.m36418b(r3)
        L_0x022b:
            r3 = 1
            goto L_0x02b3
        L_0x022e:
            r24.m36419c()
            goto L_0x022b
        L_0x0232:
            int r3 = r0.f43491h
            int r4 = com.google.android.gms.internal.ads.bph.f43328J
            if (r3 == r4) goto L_0x0277
            int r4 = com.google.android.gms.internal.ads.bph.f43408w
            if (r3 == r4) goto L_0x0277
            int r4 = com.google.android.gms.internal.ads.bph.f43329K
            if (r3 == r4) goto L_0x0277
            int r4 = com.google.android.gms.internal.ads.bph.f43330L
            if (r3 == r4) goto L_0x0277
            int r4 = com.google.android.gms.internal.ads.bph.f43341W
            if (r3 == r4) goto L_0x0277
            int r4 = com.google.android.gms.internal.ads.bph.f43342X
            if (r3 == r4) goto L_0x0277
            int r4 = com.google.android.gms.internal.ads.bph.f43343Y
            if (r3 == r4) goto L_0x0277
            int r4 = com.google.android.gms.internal.ads.bph.f43327I
            if (r3 == r4) goto L_0x0277
            int r4 = com.google.android.gms.internal.ads.bph.f43344Z
            if (r3 == r4) goto L_0x0277
            int r4 = com.google.android.gms.internal.ads.bph.f43362aa
            if (r3 == r4) goto L_0x0277
            int r4 = com.google.android.gms.internal.ads.bph.f43363ab
            if (r3 == r4) goto L_0x0277
            int r4 = com.google.android.gms.internal.ads.bph.f43364ac
            if (r3 == r4) goto L_0x0277
            int r4 = com.google.android.gms.internal.ads.bph.f43365ad
            if (r3 == r4) goto L_0x0277
            int r4 = com.google.android.gms.internal.ads.bph.f43325G
            if (r3 == r4) goto L_0x0277
            int r4 = com.google.android.gms.internal.ads.bph.f43345a
            if (r3 == r4) goto L_0x0277
            int r4 = com.google.android.gms.internal.ads.bph.f43372ak
            if (r3 != r4) goto L_0x0275
            goto L_0x0277
        L_0x0275:
            r3 = 0
            goto L_0x0278
        L_0x0277:
            r3 = 1
        L_0x0278:
            if (r3 == 0) goto L_0x02ad
            int r3 = r0.f43493j
            if (r3 != r9) goto L_0x0280
            r3 = 1
            goto L_0x0281
        L_0x0280:
            r3 = 0
        L_0x0281:
            com.google.android.gms.internal.ads.bti.m36701b(r3)
            long r3 = r0.f43492i
            r5 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 > 0) goto L_0x028f
            r3 = 1
            goto L_0x0290
        L_0x028f:
            r3 = 0
        L_0x0290:
            com.google.android.gms.internal.ads.bti.m36701b(r3)
            com.google.android.gms.internal.ads.btr r3 = new com.google.android.gms.internal.ads.btr
            long r4 = r0.f43492i
            int r4 = (int) r4
            r3.<init>(r4)
            r0.f43494k = r3
            com.google.android.gms.internal.ads.btr r3 = r0.f43488e
            byte[] r3 = r3.f43867a
            com.google.android.gms.internal.ads.btr r4 = r0.f43494k
            byte[] r4 = r4.f43867a
            r5 = 0
            java.lang.System.arraycopy(r3, r5, r4, r5, r9)
            r3 = 1
            r0.f43490g = r3
            goto L_0x02b3
        L_0x02ad:
            r3 = 1
            r4 = 0
            r0.f43494k = r4
            r0.f43490g = r3
        L_0x02b3:
            if (r3 != 0) goto L_0x0006
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bpu.mo30506a(com.google.android.gms.internal.ads.bol, com.google.android.gms.internal.ads.boq):int");
    }

    /* renamed from: b */
    public final long mo30495b() {
        return this.f43499p;
    }

    /* renamed from: a */
    public final long mo30493a(long j) {
        long j2 = Long.MAX_VALUE;
        for (bpw bpw : this.f43498o) {
            bqb bqb = bpw.f43502b;
            int a = bqb.mo30546a(j);
            if (a == -1) {
                a = bqb.mo30547b(j);
            }
            long j3 = bqb.f43527b[a];
            if (j3 < j2) {
                j2 = j3;
            }
        }
        return j2;
    }

    /* renamed from: c */
    private final void m36419c() {
        this.f43490g = 0;
        this.f43493j = 0;
    }

    /* renamed from: b */
    private final void m36418b(long j) throws bmk {
        while (!this.f43489f.isEmpty() && ((bpi) this.f43489f.peek()).f43415az == j) {
            bpi bpi = (bpi) this.f43489f.pop();
            if (bpi.f43412ay == bph.f43407v) {
                long j2 = -9223372036854775807L;
                ArrayList arrayList = new ArrayList();
                zzpn zzpn = null;
                boo boo = new boo();
                bpj c = bpi.mo30540c(bph.f43372ak);
                if (c != null) {
                    zzpn = bpk.m36401a(c, this.f43500q);
                    if (zzpn != null) {
                        boo.mo30514a(zzpn);
                    }
                }
                for (int i = 0; i < bpi.f43414aB.size(); i++) {
                    bpi bpi2 = (bpi) bpi.f43414aB.get(i);
                    if (bpi2.f43412ay == bph.f43409x) {
                        bpy a = bpk.m36399a(bpi2, bpi.mo30540c(bph.f43408w), -9223372036854775807L, (zznd) null, this.f43500q);
                        if (a != null) {
                            bqb a2 = bpk.m36400a(a, bpi2.mo30541d(bph.f43410y).mo30541d(bph.f43411z).mo30541d(bph.f43319A), boo);
                            if (a2.f43526a != 0) {
                                bpw bpw = new bpw(a, a2, this.f43497n.mo30510a(i, a.f43507b));
                                zzlg a3 = a.f43511f.mo31599a(a2.f43529d + 30);
                                if (a.f43507b == 1) {
                                    if (boo.mo30513a()) {
                                        a3 = a3.mo31600a(boo.f43200a, boo.f43201b);
                                    }
                                    if (zzpn != null) {
                                        a3 = a3.mo31602a(zzpn);
                                    }
                                }
                                bpw.f43503c.mo30518a(a3);
                                j2 = Math.max(j2, a.f43510e);
                                arrayList.add(bpw);
                            }
                        }
                    }
                }
                this.f43499p = j2;
                this.f43498o = (bpw[]) arrayList.toArray(new bpw[arrayList.size()]);
                this.f43497n.mo30511a();
                this.f43497n.mo30512a(this);
                this.f43489f.clear();
                this.f43490g = 2;
            } else if (!this.f43489f.isEmpty()) {
                ((bpi) this.f43489f.peek()).f43414aB.add(bpi);
            }
        }
        if (this.f43490g != 2) {
            m36419c();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b7, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00b8, code lost:
        if (r5 == false) goto L_0x00be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00ba, code lost:
        if (r0 != false) goto L_0x00be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00bd, code lost:
        return true;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo30509a(com.google.android.gms.internal.ads.bol r17) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r16 = this;
            r0 = r17
            long r1 = r17.mo30503c()
            r3 = 4096(0x1000, double:2.0237E-320)
            r5 = -1
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0012
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x0013
        L_0x0012:
            r1 = r3
        L_0x0013:
            int r1 = (int) r1
            com.google.android.gms.internal.ads.btr r2 = new com.google.android.gms.internal.ads.btr
            r3 = 64
            r2.<init>(r3)
            r3 = 0
            r4 = 0
            r5 = 0
        L_0x001e:
            if (r4 >= r1) goto L_0x00b7
            r7 = 8
            r2.mo30691a(r7)
            byte[] r8 = r2.f43867a
            r0.mo30505c(r8, r3, r7)
            long r8 = r2.mo30702f()
            int r10 = r2.mo30703g()
            r11 = 1
            r13 = 16
            int r14 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r14 != 0) goto L_0x0047
            byte[] r8 = r2.f43867a
            r0.mo30505c(r8, r7, r7)
            r2.mo30695b(r13)
            long r8 = r2.mo30706j()
            goto L_0x0049
        L_0x0047:
            r13 = 8
        L_0x0049:
            long r11 = (long) r13
            int r14 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r14 < 0) goto L_0x00be
            int r4 = r4 + r13
            int r13 = com.google.android.gms.internal.ads.bph.f43407v
            if (r10 == r13) goto L_0x001e
            int r13 = com.google.android.gms.internal.ads.bph.f43323E
            if (r10 == r13) goto L_0x00b5
            int r13 = com.google.android.gms.internal.ads.bph.f43324F
            if (r10 != r13) goto L_0x005c
            goto L_0x00b5
        L_0x005c:
            long r13 = (long) r4
            long r13 = r13 + r8
            long r13 = r13 - r11
            long r6 = (long) r1
            int r15 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r15 >= 0) goto L_0x00b7
            long r8 = r8 - r11
            int r6 = (int) r8
            int r4 = r4 + r6
            int r7 = com.google.android.gms.internal.ads.bph.f43345a
            if (r10 != r7) goto L_0x00ae
            r7 = 8
            if (r6 < r7) goto L_0x00be
            r2.mo30691a(r6)
            byte[] r7 = r2.f43867a
            r0.mo30505c(r7, r3, r6)
            int r6 = r6 / 4
            r7 = 0
        L_0x007a:
            if (r7 >= r6) goto L_0x00aa
            r8 = 1
            if (r7 != r8) goto L_0x0084
            r8 = 4
            r2.mo30699d(r8)
            goto L_0x00a7
        L_0x0084:
            int r8 = r2.mo30703g()
            int r9 = r8 >>> 8
            java.lang.String r10 = "3gp"
            int r10 = com.google.android.gms.internal.ads.btw.m36765b(r10)
            if (r9 != r10) goto L_0x0094
        L_0x0092:
            r8 = 1
            goto L_0x00a3
        L_0x0094:
            int[] r9 = com.google.android.gms.internal.ads.bpx.f43505a
            int r10 = r9.length
            r11 = 0
        L_0x0098:
            if (r11 >= r10) goto L_0x00a2
            r12 = r9[r11]
            if (r12 != r8) goto L_0x009f
            goto L_0x0092
        L_0x009f:
            int r11 = r11 + 1
            goto L_0x0098
        L_0x00a2:
            r8 = 0
        L_0x00a3:
            if (r8 == 0) goto L_0x00a7
            r5 = 1
            goto L_0x00aa
        L_0x00a7:
            int r7 = r7 + 1
            goto L_0x007a
        L_0x00aa:
            if (r5 == 0) goto L_0x00be
            goto L_0x001e
        L_0x00ae:
            if (r6 == 0) goto L_0x001e
            r0.mo30504c(r6)
            goto L_0x001e
        L_0x00b5:
            r0 = 1
            goto L_0x00b8
        L_0x00b7:
            r0 = 0
        L_0x00b8:
            if (r5 == 0) goto L_0x00be
            if (r0 != 0) goto L_0x00be
            r0 = 1
            return r0
        L_0x00be:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bpu.mo30509a(com.google.android.gms.internal.ads.bol):boolean");
    }
}
