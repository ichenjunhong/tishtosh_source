package com.google.android.gms.internal.ads;

import com.bef.effectsdk.message.MessageCenter;
import com.p683ss.android.ugc.aweme.experiment.ProfileUiInitOptimizeEnterThreshold;
import com.p683ss.android.ugc.aweme.experiment.UnReadVideoExperiment;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import sun.misc.Unsafe;

final class azo<T> implements bab<T> {

    /* renamed from: a */
    private static final int[] f41664a = new int[0];

    /* renamed from: b */
    private static final Unsafe f41665b = bba.m35164c();

    /* renamed from: c */
    private final int[] f41666c;

    /* renamed from: d */
    private final Object[] f41667d;

    /* renamed from: e */
    private final int f41668e;

    /* renamed from: f */
    private final int f41669f;

    /* renamed from: g */
    private final azj f41670g;

    /* renamed from: h */
    private final boolean f41671h;

    /* renamed from: i */
    private final boolean f41672i;

    /* renamed from: j */
    private final boolean f41673j;

    /* renamed from: k */
    private final boolean f41674k;

    /* renamed from: l */
    private final int[] f41675l;

    /* renamed from: m */
    private final int f41676m;

    /* renamed from: n */
    private final int f41677n;

    /* renamed from: o */
    private final azs f41678o;

    /* renamed from: p */
    private final ayt f41679p;

    /* renamed from: q */
    private final bau<?, ?> f41680q;

    /* renamed from: r */
    private final axn<?> f41681r;

    /* renamed from: s */
    private final aze f41682s;

    private azo(int[] iArr, Object[] objArr, int i, int i2, azj azj, boolean z, boolean z2, int[] iArr2, int i3, int i4, azs azs, ayt ayt, bau<?, ?> bau, axn<?> axn, aze aze) {
        this.f41666c = iArr;
        this.f41667d = objArr;
        this.f41668e = i;
        this.f41669f = i2;
        this.f41672i = azj instanceof axz;
        this.f41673j = z;
        this.f41671h = axn != null && axn.mo29794a(azj);
        this.f41674k = false;
        this.f41675l = iArr2;
        this.f41676m = i3;
        this.f41677n = i4;
        this.f41678o = azs;
        this.f41679p = ayt;
        this.f41680q = bau;
        this.f41681r = axn;
        this.f41670g = azj;
        this.f41682s = aze;
    }

    /* renamed from: f */
    private static boolean m34911f(int i) {
        return (i & 536870912) != 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:170:0x0383  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x03de  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static <T> com.google.android.gms.internal.ads.azo<T> m34881a(java.lang.Class<T> r40, com.google.android.gms.internal.ads.azh r41, com.google.android.gms.internal.ads.azs r42, com.google.android.gms.internal.ads.ayt r43, com.google.android.gms.internal.ads.bau<?, ?> r44, com.google.android.gms.internal.ads.axn<?> r45, com.google.android.gms.internal.ads.aze r46) {
        /*
            r0 = r41
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.azz
            if (r1 == 0) goto L_0x0463
            com.google.android.gms.internal.ads.azz r0 = (com.google.android.gms.internal.ads.azz) r0
            int r1 = r0.mo29889a()
            int r2 = com.google.android.gms.internal.ads.axz.C15675e.f41617i
            r3 = 0
            if (r1 != r2) goto L_0x0013
            r11 = 1
            goto L_0x0014
        L_0x0013:
            r11 = 0
        L_0x0014:
            java.lang.String r1 = r0.f41695a
            int r2 = r1.length()
            char r5 = r1.charAt(r3)
            r7 = 55296(0xd800, float:7.7486E-41)
            if (r5 < r7) goto L_0x003c
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            r8 = r5
            r5 = 1
            r9 = 13
        L_0x0029:
            int r10 = r5 + 1
            char r5 = r1.charAt(r5)
            if (r5 < r7) goto L_0x0039
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            int r5 = r5 << r9
            r8 = r8 | r5
            int r9 = r9 + 13
            r5 = r10
            goto L_0x0029
        L_0x0039:
            int r5 = r5 << r9
            r5 = r5 | r8
            goto L_0x003d
        L_0x003c:
            r10 = 1
        L_0x003d:
            int r8 = r10 + 1
            char r9 = r1.charAt(r10)
            if (r9 < r7) goto L_0x005c
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r10 = 13
        L_0x0049:
            int r12 = r8 + 1
            char r8 = r1.charAt(r8)
            if (r8 < r7) goto L_0x0059
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r10
            r9 = r9 | r8
            int r10 = r10 + 13
            r8 = r12
            goto L_0x0049
        L_0x0059:
            int r8 = r8 << r10
            r9 = r9 | r8
            goto L_0x005d
        L_0x005c:
            r12 = r8
        L_0x005d:
            if (r9 != 0) goto L_0x006b
            int[] r8 = f41664a
            r16 = r8
            r8 = 0
            r9 = 0
            r10 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            goto L_0x019e
        L_0x006b:
            int r8 = r12 + 1
            char r9 = r1.charAt(r12)
            if (r9 < r7) goto L_0x008b
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r10 = 13
        L_0x0077:
            int r12 = r8 + 1
            char r8 = r1.charAt(r8)
            if (r8 < r7) goto L_0x0087
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r10
            r9 = r9 | r8
            int r10 = r10 + 13
            r8 = r12
            goto L_0x0077
        L_0x0087:
            int r8 = r8 << r10
            r8 = r8 | r9
            r9 = r8
            goto L_0x008c
        L_0x008b:
            r12 = r8
        L_0x008c:
            int r8 = r12 + 1
            char r10 = r1.charAt(r12)
            if (r10 < r7) goto L_0x00ab
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            r12 = 13
        L_0x0098:
            int r13 = r8 + 1
            char r8 = r1.charAt(r8)
            if (r8 < r7) goto L_0x00a8
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r12
            r10 = r10 | r8
            int r12 = r12 + 13
            r8 = r13
            goto L_0x0098
        L_0x00a8:
            int r8 = r8 << r12
            r10 = r10 | r8
            goto L_0x00ac
        L_0x00ab:
            r13 = r8
        L_0x00ac:
            int r8 = r13 + 1
            char r12 = r1.charAt(r13)
            if (r12 < r7) goto L_0x00cc
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r13 = 13
        L_0x00b8:
            int r14 = r8 + 1
            char r8 = r1.charAt(r8)
            if (r8 < r7) goto L_0x00c8
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r13
            r12 = r12 | r8
            int r13 = r13 + 13
            r8 = r14
            goto L_0x00b8
        L_0x00c8:
            int r8 = r8 << r13
            r8 = r8 | r12
            r12 = r8
            goto L_0x00cd
        L_0x00cc:
            r14 = r8
        L_0x00cd:
            int r8 = r14 + 1
            char r13 = r1.charAt(r14)
            if (r13 < r7) goto L_0x00ed
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x00d9:
            int r15 = r8 + 1
            char r8 = r1.charAt(r8)
            if (r8 < r7) goto L_0x00e9
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r14
            r13 = r13 | r8
            int r14 = r14 + 13
            r8 = r15
            goto L_0x00d9
        L_0x00e9:
            int r8 = r8 << r14
            r8 = r8 | r13
            r13 = r8
            goto L_0x00ee
        L_0x00ed:
            r15 = r8
        L_0x00ee:
            int r8 = r15 + 1
            char r14 = r1.charAt(r15)
            if (r14 < r7) goto L_0x0110
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L_0x00fa:
            int r16 = r8 + 1
            char r8 = r1.charAt(r8)
            if (r8 < r7) goto L_0x010b
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r15
            r14 = r14 | r8
            int r15 = r15 + 13
            r8 = r16
            goto L_0x00fa
        L_0x010b:
            int r8 = r8 << r15
            r8 = r8 | r14
            r14 = r8
            r8 = r16
        L_0x0110:
            int r15 = r8 + 1
            char r8 = r1.charAt(r8)
            if (r8 < r7) goto L_0x0133
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        L_0x011c:
            int r17 = r15 + 1
            char r15 = r1.charAt(r15)
            if (r15 < r7) goto L_0x012e
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r16
            r8 = r8 | r15
            int r16 = r16 + 13
            r15 = r17
            goto L_0x011c
        L_0x012e:
            int r15 = r15 << r16
            r8 = r8 | r15
            r15 = r17
        L_0x0133:
            int r16 = r15 + 1
            char r15 = r1.charAt(r15)
            if (r15 < r7) goto L_0x015f
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            r17 = 13
            r39 = r16
            r16 = r15
            r15 = r39
        L_0x0145:
            int r18 = r15 + 1
            char r15 = r1.charAt(r15)
            if (r15 < r7) goto L_0x0158
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r17
            r16 = r16 | r15
            int r17 = r17 + 13
            r15 = r18
            goto L_0x0145
        L_0x0158:
            int r15 = r15 << r17
            r15 = r16 | r15
            r3 = r18
            goto L_0x0161
        L_0x015f:
            r3 = r16
        L_0x0161:
            int r16 = r3 + 1
            char r3 = r1.charAt(r3)
            if (r3 < r7) goto L_0x018c
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r17 = 13
            r39 = r16
            r16 = r3
            r3 = r39
        L_0x0173:
            int r18 = r3 + 1
            char r3 = r1.charAt(r3)
            if (r3 < r7) goto L_0x0186
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            int r3 = r3 << r17
            r16 = r16 | r3
            int r17 = r17 + 13
            r3 = r18
            goto L_0x0173
        L_0x0186:
            int r3 = r3 << r17
            r3 = r16 | r3
            r16 = r18
        L_0x018c:
            int r17 = r3 + r8
            int r15 = r17 + r15
            int[] r15 = new int[r15]
            int r17 = r9 << 1
            int r10 = r17 + r10
            r39 = r15
            r15 = r10
            r10 = r12
            r12 = r16
            r16 = r39
        L_0x019e:
            sun.misc.Unsafe r6 = f41665b
            java.lang.Object[] r7 = r0.f41696b
            com.google.android.gms.internal.ads.azj r17 = r0.mo29891c()
            java.lang.Class r4 = r17.getClass()
            r23 = r12
            int r12 = r14 * 3
            int[] r12 = new int[r12]
            r17 = 1
            int r14 = r14 << 1
            java.lang.Object[] r14 = new java.lang.Object[r14]
            int r17 = r3 + r8
            r20 = r3
            r19 = r15
            r8 = r23
            r15 = 0
            r18 = 0
            r23 = r17
        L_0x01c3:
            if (r8 >= r2) goto L_0x0436
            int r24 = r8 + 1
            char r8 = r1.charAt(r8)
            r25 = r2
            r2 = 55296(0xd800, float:7.7486E-41)
            if (r8 < r2) goto L_0x01f9
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r26 = 13
            r39 = r24
            r24 = r8
            r8 = r39
        L_0x01dc:
            int r27 = r8 + 1
            char r8 = r1.charAt(r8)
            if (r8 < r2) goto L_0x01f2
            r2 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r2 = r2 << r26
            r24 = r24 | r2
            int r26 = r26 + 13
            r8 = r27
            r2 = 55296(0xd800, float:7.7486E-41)
            goto L_0x01dc
        L_0x01f2:
            int r2 = r8 << r26
            r8 = r24 | r2
            r2 = r27
            goto L_0x01fb
        L_0x01f9:
            r2 = r24
        L_0x01fb:
            int r24 = r2 + 1
            char r2 = r1.charAt(r2)
            r28 = r3
            r3 = 55296(0xd800, float:7.7486E-41)
            if (r2 < r3) goto L_0x022f
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            r26 = 13
            r39 = r24
            r24 = r2
            r2 = r39
        L_0x0212:
            int r27 = r2 + 1
            char r2 = r1.charAt(r2)
            if (r2 < r3) goto L_0x0228
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            int r2 = r2 << r26
            r24 = r24 | r2
            int r26 = r26 + 13
            r2 = r27
            r3 = 55296(0xd800, float:7.7486E-41)
            goto L_0x0212
        L_0x0228:
            int r2 = r2 << r26
            r2 = r24 | r2
            r3 = r27
            goto L_0x0231
        L_0x022f:
            r3 = r24
        L_0x0231:
            r29 = r11
            r11 = r2 & 255(0xff, float:3.57E-43)
            r30 = r13
            r13 = r2 & 1024(0x400, float:1.435E-42)
            if (r13 == 0) goto L_0x0240
            int r13 = r15 + 1
            r16[r15] = r18
            r15 = r13
        L_0x0240:
            r13 = 51
            r31 = r15
            if (r11 < r13) goto L_0x02e8
            int r13 = r3 + 1
            char r3 = r1.charAt(r3)
            r15 = 55296(0xd800, float:7.7486E-41)
            if (r3 < r15) goto L_0x026e
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r24 = 13
        L_0x0255:
            int r26 = r13 + 1
            char r13 = r1.charAt(r13)
            if (r13 < r15) goto L_0x026a
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r24
            r3 = r3 | r13
            int r24 = r24 + 13
            r13 = r26
            r15 = 55296(0xd800, float:7.7486E-41)
            goto L_0x0255
        L_0x026a:
            int r13 = r13 << r24
            r3 = r3 | r13
            goto L_0x0270
        L_0x026e:
            r26 = r13
        L_0x0270:
            int r13 = r11 + -51
            r15 = 9
            if (r13 == r15) goto L_0x0292
            r15 = 17
            if (r13 != r15) goto L_0x027b
            goto L_0x0292
        L_0x027b:
            r15 = 12
            if (r13 != r15) goto L_0x0290
            r13 = r5 & 1
            r15 = 1
            if (r13 != r15) goto L_0x0290
            int r13 = r18 / 3
            int r13 = r13 << r15
            int r13 = r13 + r15
            int r15 = r19 + 1
            r19 = r7[r19]
            r14[r13] = r19
            r19 = r15
        L_0x0290:
            r15 = 1
            goto L_0x029f
        L_0x0292:
            int r13 = r18 / 3
            r15 = 1
            int r13 = r13 << r15
            int r13 = r13 + r15
            int r22 = r19 + 1
            r19 = r7[r19]
            r14[r13] = r19
            r19 = r22
        L_0x029f:
            int r3 = r3 << r15
            r13 = r7[r3]
            boolean r15 = r13 instanceof java.lang.reflect.Field
            if (r15 == 0) goto L_0x02ab
            java.lang.reflect.Field r13 = (java.lang.reflect.Field) r13
        L_0x02a8:
            r32 = r12
            goto L_0x02b4
        L_0x02ab:
            java.lang.String r13 = (java.lang.String) r13
            java.lang.reflect.Field r13 = m34885a(r4, r13)
            r7[r3] = r13
            goto L_0x02a8
        L_0x02b4:
            long r12 = r6.objectFieldOffset(r13)
            int r12 = (int) r12
            int r3 = r3 + 1
            r13 = r7[r3]
            boolean r15 = r13 instanceof java.lang.reflect.Field
            if (r15 == 0) goto L_0x02c6
            java.lang.reflect.Field r13 = (java.lang.reflect.Field) r13
        L_0x02c3:
            r33 = r12
            goto L_0x02cf
        L_0x02c6:
            java.lang.String r13 = (java.lang.String) r13
            java.lang.reflect.Field r13 = m34885a(r4, r13)
            r7[r3] = r13
            goto L_0x02c3
        L_0x02cf:
            long r12 = r6.objectFieldOffset(r13)
            int r3 = (int) r12
            r36 = r1
            r1 = r3
            r38 = r4
            r37 = r5
            r34 = r10
            r12 = r19
            r13 = r26
            r10 = r33
            r3 = 0
            r19 = 1
            goto L_0x03f9
        L_0x02e8:
            r32 = r12
            int r12 = r19 + 1
            r13 = r7[r19]
            java.lang.String r13 = (java.lang.String) r13
            java.lang.reflect.Field r13 = m34885a(r4, r13)
            r15 = 9
            if (r11 == r15) goto L_0x036a
            r15 = 17
            if (r11 != r15) goto L_0x02fe
            goto L_0x036a
        L_0x02fe:
            r15 = 27
            if (r11 == r15) goto L_0x0358
            r15 = 49
            if (r11 != r15) goto L_0x0307
            goto L_0x0358
        L_0x0307:
            r15 = 12
            if (r11 == r15) goto L_0x0346
            r15 = 30
            if (r11 == r15) goto L_0x0346
            r15 = 44
            if (r11 != r15) goto L_0x0314
            goto L_0x0346
        L_0x0314:
            r15 = 50
            if (r11 != r15) goto L_0x0342
            int r15 = r20 + 1
            r16[r20] = r18
            int r19 = r18 / 3
            r20 = 1
            int r19 = r19 << 1
            int r20 = r12 + 1
            r12 = r7[r12]
            r14[r19] = r12
            r12 = r2 & 2048(0x800, float:2.87E-42)
            if (r12 == 0) goto L_0x0339
            int r19 = r19 + 1
            int r12 = r20 + 1
            r20 = r7[r20]
            r14[r19] = r20
            r34 = r10
            r35 = r11
            goto L_0x033f
        L_0x0339:
            r34 = r10
            r35 = r11
            r12 = r20
        L_0x033f:
            r20 = r15
            goto L_0x0379
        L_0x0342:
            r34 = r10
            r10 = 1
            goto L_0x0377
        L_0x0346:
            r15 = r5 & 1
            r34 = r10
            r10 = 1
            if (r15 != r10) goto L_0x0377
            int r15 = r18 / 3
            int r15 = r15 << r10
            int r15 = r15 + r10
            int r19 = r12 + 1
            r12 = r7[r12]
            r14[r15] = r12
            goto L_0x0365
        L_0x0358:
            r34 = r10
            r10 = 1
            int r15 = r18 / 3
            int r15 = r15 << r10
            int r15 = r15 + r10
            int r19 = r12 + 1
            r12 = r7[r12]
            r14[r15] = r12
        L_0x0365:
            r35 = r11
            r12 = r19
            goto L_0x0379
        L_0x036a:
            r34 = r10
            r10 = 1
            int r15 = r18 / 3
            int r15 = r15 << r10
            int r15 = r15 + r10
            java.lang.Class r19 = r13.getType()
            r14[r15] = r19
        L_0x0377:
            r35 = r11
        L_0x0379:
            long r10 = r6.objectFieldOffset(r13)
            int r10 = (int) r10
            r11 = r5 & 1
            r13 = 1
            if (r11 != r13) goto L_0x03de
            r11 = r35
            r13 = 17
            if (r11 > r13) goto L_0x03d7
            int r13 = r3 + 1
            char r3 = r1.charAt(r3)
            r15 = 55296(0xd800, float:7.7486E-41)
            if (r3 < r15) goto L_0x03af
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r19 = 13
        L_0x0398:
            int r21 = r13 + 1
            char r13 = r1.charAt(r13)
            if (r13 < r15) goto L_0x03aa
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r19
            r3 = r3 | r13
            int r19 = r19 + 13
            r13 = r21
            goto L_0x0398
        L_0x03aa:
            int r13 = r13 << r19
            r3 = r3 | r13
            r13 = r21
        L_0x03af:
            r19 = 1
            int r21 = r9 << 1
            int r22 = r3 / 32
            int r21 = r21 + r22
            r15 = r7[r21]
            r36 = r1
            boolean r1 = r15 instanceof java.lang.reflect.Field
            if (r1 == 0) goto L_0x03c6
            java.lang.reflect.Field r15 = (java.lang.reflect.Field) r15
        L_0x03c1:
            r38 = r4
            r37 = r5
            goto L_0x03cf
        L_0x03c6:
            java.lang.String r15 = (java.lang.String) r15
            java.lang.reflect.Field r15 = m34885a(r4, r15)
            r7[r21] = r15
            goto L_0x03c1
        L_0x03cf:
            long r4 = r6.objectFieldOffset(r15)
            int r1 = (int) r4
            int r3 = r3 % 32
            goto L_0x03eb
        L_0x03d7:
            r36 = r1
            r38 = r4
            r37 = r5
            goto L_0x03e6
        L_0x03de:
            r36 = r1
            r38 = r4
            r37 = r5
            r11 = r35
        L_0x03e6:
            r19 = 1
            r13 = r3
            r1 = 0
            r3 = 0
        L_0x03eb:
            r4 = 18
            if (r11 < r4) goto L_0x03f9
            r4 = 49
            if (r11 > r4) goto L_0x03f9
            int r4 = r23 + 1
            r16[r23] = r10
            r23 = r4
        L_0x03f9:
            int r4 = r18 + 1
            r32[r18] = r8
            int r5 = r4 + 1
            r8 = r2 & 512(0x200, float:7.175E-43)
            if (r8 == 0) goto L_0x0406
            r8 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0407
        L_0x0406:
            r8 = 0
        L_0x0407:
            r2 = r2 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x040e
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x040f
        L_0x040e:
            r2 = 0
        L_0x040f:
            r2 = r2 | r8
            int r8 = r11 << 20
            r2 = r2 | r8
            r2 = r2 | r10
            r32[r4] = r2
            int r18 = r5 + 1
            int r2 = r3 << 20
            r1 = r1 | r2
            r32[r5] = r1
            r19 = r12
            r8 = r13
            r2 = r25
            r3 = r28
            r11 = r29
            r13 = r30
            r15 = r31
            r12 = r32
            r10 = r34
            r1 = r36
            r5 = r37
            r4 = r38
            goto L_0x01c3
        L_0x0436:
            r28 = r3
            r34 = r10
            r29 = r11
            r32 = r12
            r30 = r13
            com.google.android.gms.internal.ads.azo r1 = new com.google.android.gms.internal.ads.azo
            com.google.android.gms.internal.ads.azj r10 = r0.mo29891c()
            r12 = 0
            r5 = r1
            r6 = r32
            r7 = r14
            r8 = r34
            r9 = r30
            r13 = r16
            r14 = r28
            r15 = r17
            r16 = r42
            r17 = r43
            r18 = r44
            r19 = r45
            r20 = r46
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r1
        L_0x0463:
            com.google.android.gms.internal.ads.bap r0 = (com.google.android.gms.internal.ads.bap) r0
            r0.mo29889a()
            java.lang.NoSuchMethodError r0 = new java.lang.NoSuchMethodError
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.azo.m34881a(java.lang.Class, com.google.android.gms.internal.ads.azh, com.google.android.gms.internal.ads.azs, com.google.android.gms.internal.ads.ayt, com.google.android.gms.internal.ads.bau, com.google.android.gms.internal.ads.axn, com.google.android.gms.internal.ads.aze):com.google.android.gms.internal.ads.azo");
    }

    /* renamed from: a */
    private static Field m34885a(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(name).length() + String.valueOf(arrays).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            sb.append(" not found. Known fields are ");
            sb.append(arrays);
            throw new RuntimeException(sb.toString());
        }
    }

    /* renamed from: a */
    public final T mo29894a() {
        return this.f41678o.mo29904a(this.f41670g);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006a, code lost:
        if (com.google.android.gms.internal.ads.bad.m35025a(com.google.android.gms.internal.ads.bba.m35174f(r10, r6), com.google.android.gms.internal.ads.bba.m35174f(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007e, code lost:
        if (com.google.android.gms.internal.ads.bba.m35159b(r10, r6) == com.google.android.gms.internal.ads.bba.m35159b(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0090, code lost:
        if (com.google.android.gms.internal.ads.bba.m35144a((java.lang.Object) r10, r6) == com.google.android.gms.internal.ads.bba.m35144a((java.lang.Object) r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a4, code lost:
        if (com.google.android.gms.internal.ads.bba.m35159b(r10, r6) == com.google.android.gms.internal.ads.bba.m35159b(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b6, code lost:
        if (com.google.android.gms.internal.ads.bba.m35144a((java.lang.Object) r10, r6) == com.google.android.gms.internal.ads.bba.m35144a((java.lang.Object) r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c8, code lost:
        if (com.google.android.gms.internal.ads.bba.m35144a((java.lang.Object) r10, r6) == com.google.android.gms.internal.ads.bba.m35144a((java.lang.Object) r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00da, code lost:
        if (com.google.android.gms.internal.ads.bba.m35144a((java.lang.Object) r10, r6) == com.google.android.gms.internal.ads.bba.m35144a((java.lang.Object) r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f0, code lost:
        if (com.google.android.gms.internal.ads.bad.m35025a(com.google.android.gms.internal.ads.bba.m35174f(r10, r6), com.google.android.gms.internal.ads.bba.m35174f(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0106, code lost:
        if (com.google.android.gms.internal.ads.bad.m35025a(com.google.android.gms.internal.ads.bba.m35174f(r10, r6), com.google.android.gms.internal.ads.bba.m35174f(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x011c, code lost:
        if (com.google.android.gms.internal.ads.bad.m35025a(com.google.android.gms.internal.ads.bba.m35174f(r10, r6), com.google.android.gms.internal.ads.bba.m35174f(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x012e, code lost:
        if (com.google.android.gms.internal.ads.bba.m35167c(r10, r6) == com.google.android.gms.internal.ads.bba.m35167c(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0140, code lost:
        if (com.google.android.gms.internal.ads.bba.m35144a((java.lang.Object) r10, r6) == com.google.android.gms.internal.ads.bba.m35144a((java.lang.Object) r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0154, code lost:
        if (com.google.android.gms.internal.ads.bba.m35159b(r10, r6) == com.google.android.gms.internal.ads.bba.m35159b(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0165, code lost:
        if (com.google.android.gms.internal.ads.bba.m35144a((java.lang.Object) r10, r6) == com.google.android.gms.internal.ads.bba.m35144a((java.lang.Object) r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0178, code lost:
        if (com.google.android.gms.internal.ads.bba.m35159b(r10, r6) == com.google.android.gms.internal.ads.bba.m35159b(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x018b, code lost:
        if (com.google.android.gms.internal.ads.bba.m35159b(r10, r6) == com.google.android.gms.internal.ads.bba.m35159b(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01a4, code lost:
        if (java.lang.Float.floatToIntBits(com.google.android.gms.internal.ads.bba.m35168d(r10, r6)) == java.lang.Float.floatToIntBits(com.google.android.gms.internal.ads.bba.m35168d(r11, r6))) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01bf, code lost:
        if (java.lang.Double.doubleToLongBits(com.google.android.gms.internal.ads.bba.m35172e(r10, r6)) == java.lang.Double.doubleToLongBits(com.google.android.gms.internal.ads.bba.m35172e(r11, r6))) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01c1, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0038, code lost:
        if (com.google.android.gms.internal.ads.bad.m35025a(com.google.android.gms.internal.ads.bba.m35174f(r10, r6), com.google.android.gms.internal.ads.bba.m35174f(r11, r6)) != false) goto L_0x01c2;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo29898a(T r10, T r11) {
        /*
            r9 = this;
            int[] r0 = r9.f41666c
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L_0x0005:
            r3 = 1
            if (r2 >= r0) goto L_0x01c9
            int r4 = r9.m34906d(r2)
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r4 & r5
            long r6 = (long) r6
            r8 = 267386880(0xff00000, float:2.3665827E-29)
            r4 = r4 & r8
            int r4 = r4 >>> 20
            switch(r4) {
                case 0: goto L_0x01a7;
                case 1: goto L_0x018e;
                case 2: goto L_0x017b;
                case 3: goto L_0x0168;
                case 4: goto L_0x0157;
                case 5: goto L_0x0144;
                case 6: goto L_0x0132;
                case 7: goto L_0x0120;
                case 8: goto L_0x010a;
                case 9: goto L_0x00f4;
                case 10: goto L_0x00de;
                case 11: goto L_0x00cc;
                case 12: goto L_0x00ba;
                case 13: goto L_0x00a8;
                case 14: goto L_0x0094;
                case 15: goto L_0x0082;
                case 16: goto L_0x006e;
                case 17: goto L_0x0058;
                case 18: goto L_0x004a;
                case 19: goto L_0x004a;
                case 20: goto L_0x004a;
                case 21: goto L_0x004a;
                case 22: goto L_0x004a;
                case 23: goto L_0x004a;
                case 24: goto L_0x004a;
                case 25: goto L_0x004a;
                case 26: goto L_0x004a;
                case 27: goto L_0x004a;
                case 28: goto L_0x004a;
                case 29: goto L_0x004a;
                case 30: goto L_0x004a;
                case 31: goto L_0x004a;
                case 32: goto L_0x004a;
                case 33: goto L_0x004a;
                case 34: goto L_0x004a;
                case 35: goto L_0x004a;
                case 36: goto L_0x004a;
                case 37: goto L_0x004a;
                case 38: goto L_0x004a;
                case 39: goto L_0x004a;
                case 40: goto L_0x004a;
                case 41: goto L_0x004a;
                case 42: goto L_0x004a;
                case 43: goto L_0x004a;
                case 44: goto L_0x004a;
                case 45: goto L_0x004a;
                case 46: goto L_0x004a;
                case 47: goto L_0x004a;
                case 48: goto L_0x004a;
                case 49: goto L_0x004a;
                case 50: goto L_0x003c;
                case 51: goto L_0x001c;
                case 52: goto L_0x001c;
                case 53: goto L_0x001c;
                case 54: goto L_0x001c;
                case 55: goto L_0x001c;
                case 56: goto L_0x001c;
                case 57: goto L_0x001c;
                case 58: goto L_0x001c;
                case 59: goto L_0x001c;
                case 60: goto L_0x001c;
                case 61: goto L_0x001c;
                case 62: goto L_0x001c;
                case 63: goto L_0x001c;
                case 64: goto L_0x001c;
                case 65: goto L_0x001c;
                case 66: goto L_0x001c;
                case 67: goto L_0x001c;
                case 68: goto L_0x001c;
                default: goto L_0x001a;
            }
        L_0x001a:
            goto L_0x01c2
        L_0x001c:
            int r4 = r9.m34908e(r2)
            r4 = r4 & r5
            long r4 = (long) r4
            int r8 = com.google.android.gms.internal.ads.bba.m35144a(r10, r4)
            int r4 = com.google.android.gms.internal.ads.bba.m35144a(r11, r4)
            if (r8 != r4) goto L_0x01c1
            java.lang.Object r4 = com.google.android.gms.internal.ads.bba.m35174f(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.ads.bba.m35174f(r11, r6)
            boolean r4 = com.google.android.gms.internal.ads.bad.m35025a(r4, r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x003c:
            java.lang.Object r3 = com.google.android.gms.internal.ads.bba.m35174f(r10, r6)
            java.lang.Object r4 = com.google.android.gms.internal.ads.bba.m35174f(r11, r6)
            boolean r3 = com.google.android.gms.internal.ads.bad.m35025a(r3, r4)
            goto L_0x01c2
        L_0x004a:
            java.lang.Object r3 = com.google.android.gms.internal.ads.bba.m35174f(r10, r6)
            java.lang.Object r4 = com.google.android.gms.internal.ads.bba.m35174f(r11, r6)
            boolean r3 = com.google.android.gms.internal.ads.bad.m35025a(r3, r4)
            goto L_0x01c2
        L_0x0058:
            boolean r4 = r9.m34905c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            java.lang.Object r4 = com.google.android.gms.internal.ads.bba.m35174f(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.ads.bba.m35174f(r11, r6)
            boolean r4 = com.google.android.gms.internal.ads.bad.m35025a(r4, r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x006e:
            boolean r4 = r9.m34905c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = com.google.android.gms.internal.ads.bba.m35159b(r10, r6)
            long r6 = com.google.android.gms.internal.ads.bba.m35159b(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x0082:
            boolean r4 = r9.m34905c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = com.google.android.gms.internal.ads.bba.m35144a(r10, r6)
            int r5 = com.google.android.gms.internal.ads.bba.m35144a(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x0094:
            boolean r4 = r9.m34905c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = com.google.android.gms.internal.ads.bba.m35159b(r10, r6)
            long r6 = com.google.android.gms.internal.ads.bba.m35159b(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x00a8:
            boolean r4 = r9.m34905c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = com.google.android.gms.internal.ads.bba.m35144a(r10, r6)
            int r5 = com.google.android.gms.internal.ads.bba.m35144a(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x00ba:
            boolean r4 = r9.m34905c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = com.google.android.gms.internal.ads.bba.m35144a(r10, r6)
            int r5 = com.google.android.gms.internal.ads.bba.m35144a(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x00cc:
            boolean r4 = r9.m34905c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = com.google.android.gms.internal.ads.bba.m35144a(r10, r6)
            int r5 = com.google.android.gms.internal.ads.bba.m35144a(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x00de:
            boolean r4 = r9.m34905c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            java.lang.Object r4 = com.google.android.gms.internal.ads.bba.m35174f(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.ads.bba.m35174f(r11, r6)
            boolean r4 = com.google.android.gms.internal.ads.bad.m35025a(r4, r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x00f4:
            boolean r4 = r9.m34905c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            java.lang.Object r4 = com.google.android.gms.internal.ads.bba.m35174f(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.ads.bba.m35174f(r11, r6)
            boolean r4 = com.google.android.gms.internal.ads.bad.m35025a(r4, r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x010a:
            boolean r4 = r9.m34905c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            java.lang.Object r4 = com.google.android.gms.internal.ads.bba.m35174f(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.ads.bba.m35174f(r11, r6)
            boolean r4 = com.google.android.gms.internal.ads.bad.m35025a(r4, r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x0120:
            boolean r4 = r9.m34905c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            boolean r4 = com.google.android.gms.internal.ads.bba.m35167c(r10, r6)
            boolean r5 = com.google.android.gms.internal.ads.bba.m35167c(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x0132:
            boolean r4 = r9.m34905c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = com.google.android.gms.internal.ads.bba.m35144a(r10, r6)
            int r5 = com.google.android.gms.internal.ads.bba.m35144a(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x0144:
            boolean r4 = r9.m34905c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = com.google.android.gms.internal.ads.bba.m35159b(r10, r6)
            long r6 = com.google.android.gms.internal.ads.bba.m35159b(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x0157:
            boolean r4 = r9.m34905c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = com.google.android.gms.internal.ads.bba.m35144a(r10, r6)
            int r5 = com.google.android.gms.internal.ads.bba.m35144a(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x0168:
            boolean r4 = r9.m34905c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = com.google.android.gms.internal.ads.bba.m35159b(r10, r6)
            long r6 = com.google.android.gms.internal.ads.bba.m35159b(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x017b:
            boolean r4 = r9.m34905c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = com.google.android.gms.internal.ads.bba.m35159b(r10, r6)
            long r6 = com.google.android.gms.internal.ads.bba.m35159b(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x018e:
            boolean r4 = r9.m34905c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            float r4 = com.google.android.gms.internal.ads.bba.m35168d(r10, r6)
            int r4 = java.lang.Float.floatToIntBits(r4)
            float r5 = com.google.android.gms.internal.ads.bba.m35168d(r11, r6)
            int r5 = java.lang.Float.floatToIntBits(r5)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x01a7:
            boolean r4 = r9.m34905c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            double r4 = com.google.android.gms.internal.ads.bba.m35172e(r10, r6)
            long r4 = java.lang.Double.doubleToLongBits(r4)
            double r6 = com.google.android.gms.internal.ads.bba.m35172e(r11, r6)
            long r6 = java.lang.Double.doubleToLongBits(r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
        L_0x01c1:
            r3 = 0
        L_0x01c2:
            if (r3 != 0) goto L_0x01c5
            return r1
        L_0x01c5:
            int r2 = r2 + 3
            goto L_0x0005
        L_0x01c9:
            com.google.android.gms.internal.ads.bau<?, ?> r0 = r9.f41680q
            java.lang.Object r0 = r0.mo29963b(r10)
            com.google.android.gms.internal.ads.bau<?, ?> r2 = r9.f41680q
            java.lang.Object r2 = r2.mo29963b(r11)
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x01dc
            return r1
        L_0x01dc:
            boolean r0 = r9.f41671h
            if (r0 == 0) goto L_0x01f1
            com.google.android.gms.internal.ads.axn<?> r0 = r9.f41681r
            com.google.android.gms.internal.ads.axq r10 = r0.mo29788a(r10)
            com.google.android.gms.internal.ads.axn<?> r0 = r9.f41681r
            com.google.android.gms.internal.ads.axq r11 = r0.mo29788a(r11)
            boolean r10 = r10.equals(r11)
            return r10
        L_0x01f1:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.azo.mo29898a(java.lang.Object, java.lang.Object):boolean");
    }

    /* renamed from: a */
    public final int mo29892a(T t) {
        int length = this.f41666c.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2 += 3) {
            int d = m34906d(i2);
            int i3 = this.f41666c[i2];
            long j = (long) (1048575 & d);
            int i4 = 37;
            switch ((d & 267386880) >>> 20) {
                case 0:
                    i = (i * 53) + ayb.m34766a(Double.doubleToLongBits(bba.m35172e(t, j)));
                    break;
                case 1:
                    i = (i * 53) + Float.floatToIntBits(bba.m35168d(t, j));
                    break;
                case 2:
                    i = (i * 53) + ayb.m34766a(bba.m35159b(t, j));
                    break;
                case 3:
                    i = (i * 53) + ayb.m34766a(bba.m35159b(t, j));
                    break;
                case 4:
                    i = (i * 53) + bba.m35144a((Object) t, j);
                    break;
                case 5:
                    i = (i * 53) + ayb.m34766a(bba.m35159b(t, j));
                    break;
                case 6:
                    i = (i * 53) + bba.m35144a((Object) t, j);
                    break;
                case 7:
                    i = (i * 53) + ayb.m34767a(bba.m35167c(t, j));
                    break;
                case 8:
                    i = (i * 53) + ((String) bba.m35174f(t, j)).hashCode();
                    break;
                case 9:
                    Object f = bba.m35174f(t, j);
                    if (f != null) {
                        i4 = f.hashCode();
                    }
                    i = (i * 53) + i4;
                    break;
                case 10:
                    i = (i * 53) + bba.m35174f(t, j).hashCode();
                    break;
                case 11:
                    i = (i * 53) + bba.m35144a((Object) t, j);
                    break;
                case 12:
                    i = (i * 53) + bba.m35144a((Object) t, j);
                    break;
                case 13:
                    i = (i * 53) + bba.m35144a((Object) t, j);
                    break;
                case 14:
                    i = (i * 53) + ayb.m34766a(bba.m35159b(t, j));
                    break;
                case 15:
                    i = (i * 53) + bba.m35144a((Object) t, j);
                    break;
                case 16:
                    i = (i * 53) + ayb.m34766a(bba.m35159b(t, j));
                    break;
                case 17:
                    Object f2 = bba.m35174f(t, j);
                    if (f2 != null) {
                        i4 = f2.hashCode();
                    }
                    i = (i * 53) + i4;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case BaseNotice.STORY_NOTICE_COMMENT /*26*/:
                case BaseNotice.STORY_NOTICE_UPDATE /*27*/:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case MessageCenter.MSG_TYPE_FACE_VERIFY /*35*/:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case BaseNotice.LIKE /*41*/:
                case 42:
                case 43:
                case 44:
                case BaseNotice.f96882AT /*45*/:
                case 46:
                case 47:
                case 48:
                case 49:
                    i = (i * 53) + bba.m35174f(t, j).hashCode();
                    break;
                case 50:
                    i = (i * 53) + bba.m35174f(t, j).hashCode();
                    break;
                case 51:
                    if (!m34893a(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + ayb.m34766a(Double.doubleToLongBits(m34896b(t, j)));
                        break;
                    }
                case 52:
                    if (!m34893a(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + Float.floatToIntBits(m34903c(t, j));
                        break;
                    }
                case 53:
                    if (!m34893a(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + ayb.m34766a(m34909e(t, j));
                        break;
                    }
                case 54:
                    if (!m34893a(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + ayb.m34766a(m34909e(t, j));
                        break;
                    }
                case 55:
                    if (!m34893a(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + m34907d(t, j);
                        break;
                    }
                case 56:
                    if (!m34893a(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + ayb.m34766a(m34909e(t, j));
                        break;
                    }
                case 57:
                    if (!m34893a(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + m34907d(t, j);
                        break;
                    }
                case 58:
                    if (!m34893a(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + ayb.m34767a(m34912f(t, j));
                        break;
                    }
                case 59:
                    if (!m34893a(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + ((String) bba.m35174f(t, j)).hashCode();
                        break;
                    }
                case 60:
                    if (!m34893a(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + bba.m35174f(t, j).hashCode();
                        break;
                    }
                case BaseNotice.TCM /*61*/:
                    if (!m34893a(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + bba.m35174f(t, j).hashCode();
                        break;
                    }
                case BaseNotice.CREATOR /*62*/:
                    if (!m34893a(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + m34907d(t, j);
                        break;
                    }
                case 63:
                    if (!m34893a(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + m34907d(t, j);
                        break;
                    }
                case UnReadVideoExperiment.RELATION_LIST /*64*/:
                    if (!m34893a(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + m34907d(t, j);
                        break;
                    }
                case 65:
                    if (!m34893a(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + ayb.m34766a(m34909e(t, j));
                        break;
                    }
                case 66:
                    if (!m34893a(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + m34907d(t, j);
                        break;
                    }
                case 67:
                    if (!m34893a(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + ayb.m34766a(m34909e(t, j));
                        break;
                    }
                case 68:
                    if (!m34893a(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + bba.m35174f(t, j).hashCode();
                        break;
                    }
            }
        }
        int hashCode = (i * 53) + this.f41680q.mo29963b(t).hashCode();
        return this.f41671h ? (hashCode * 53) + this.f41681r.mo29788a((Object) t).hashCode() : hashCode;
    }

    /* renamed from: b */
    public final void mo29900b(T t, T t2) {
        if (t2 != null) {
            for (int i = 0; i < this.f41666c.length; i += 3) {
                int d = m34906d(i);
                long j = (long) (1048575 & d);
                int i2 = this.f41666c[i];
                switch ((d & 267386880) >>> 20) {
                    case 0:
                        if (!m34892a(t2, i)) {
                            break;
                        } else {
                            bba.m35150a((Object) t, j, bba.m35172e(t2, j));
                            m34899b(t, i);
                            break;
                        }
                    case 1:
                        if (!m34892a(t2, i)) {
                            break;
                        } else {
                            bba.m35151a((Object) t, j, bba.m35168d(t2, j));
                            m34899b(t, i);
                            break;
                        }
                    case 2:
                        if (!m34892a(t2, i)) {
                            break;
                        } else {
                            bba.m35153a((Object) t, j, bba.m35159b(t2, j));
                            m34899b(t, i);
                            break;
                        }
                    case 3:
                        if (!m34892a(t2, i)) {
                            break;
                        } else {
                            bba.m35153a((Object) t, j, bba.m35159b(t2, j));
                            m34899b(t, i);
                            break;
                        }
                    case 4:
                        if (!m34892a(t2, i)) {
                            break;
                        } else {
                            bba.m35152a((Object) t, j, bba.m35144a((Object) t2, j));
                            m34899b(t, i);
                            break;
                        }
                    case 5:
                        if (!m34892a(t2, i)) {
                            break;
                        } else {
                            bba.m35153a((Object) t, j, bba.m35159b(t2, j));
                            m34899b(t, i);
                            break;
                        }
                    case 6:
                        if (!m34892a(t2, i)) {
                            break;
                        } else {
                            bba.m35152a((Object) t, j, bba.m35144a((Object) t2, j));
                            m34899b(t, i);
                            break;
                        }
                    case 7:
                        if (!m34892a(t2, i)) {
                            break;
                        } else {
                            bba.m35155a((Object) t, j, bba.m35167c(t2, j));
                            m34899b(t, i);
                            break;
                        }
                    case 8:
                        if (!m34892a(t2, i)) {
                            break;
                        } else {
                            bba.m35154a((Object) t, j, bba.m35174f(t2, j));
                            m34899b(t, i);
                            break;
                        }
                    case 9:
                        m34891a(t, t2, i);
                        break;
                    case 10:
                        if (!m34892a(t2, i)) {
                            break;
                        } else {
                            bba.m35154a((Object) t, j, bba.m35174f(t2, j));
                            m34899b(t, i);
                            break;
                        }
                    case 11:
                        if (!m34892a(t2, i)) {
                            break;
                        } else {
                            bba.m35152a((Object) t, j, bba.m35144a((Object) t2, j));
                            m34899b(t, i);
                            break;
                        }
                    case 12:
                        if (!m34892a(t2, i)) {
                            break;
                        } else {
                            bba.m35152a((Object) t, j, bba.m35144a((Object) t2, j));
                            m34899b(t, i);
                            break;
                        }
                    case 13:
                        if (!m34892a(t2, i)) {
                            break;
                        } else {
                            bba.m35152a((Object) t, j, bba.m35144a((Object) t2, j));
                            m34899b(t, i);
                            break;
                        }
                    case 14:
                        if (!m34892a(t2, i)) {
                            break;
                        } else {
                            bba.m35153a((Object) t, j, bba.m35159b(t2, j));
                            m34899b(t, i);
                            break;
                        }
                    case 15:
                        if (!m34892a(t2, i)) {
                            break;
                        } else {
                            bba.m35152a((Object) t, j, bba.m35144a((Object) t2, j));
                            m34899b(t, i);
                            break;
                        }
                    case 16:
                        if (!m34892a(t2, i)) {
                            break;
                        } else {
                            bba.m35153a((Object) t, j, bba.m35159b(t2, j));
                            m34899b(t, i);
                            break;
                        }
                    case 17:
                        m34891a(t, t2, i);
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case BaseNotice.STORY_NOTICE_COMMENT /*26*/:
                    case BaseNotice.STORY_NOTICE_UPDATE /*27*/:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case MessageCenter.MSG_TYPE_FACE_VERIFY /*35*/:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case BaseNotice.LIKE /*41*/:
                    case 42:
                    case 43:
                    case 44:
                    case BaseNotice.f96882AT /*45*/:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        this.f41679p.mo29862a(t, t2, j);
                        break;
                    case 50:
                        bba.m35154a((Object) t, j, this.f41682s.mo29882a(bba.m35174f(t, j), bba.m35174f(t2, j)));
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                        if (!m34893a(t2, i2, i)) {
                            break;
                        } else {
                            bba.m35154a((Object) t, j, bba.m35174f(t2, j));
                            m34900b(t, i2, i);
                            break;
                        }
                    case 60:
                        m34902b(t, t2, i);
                        break;
                    case BaseNotice.TCM /*61*/:
                    case BaseNotice.CREATOR /*62*/:
                    case 63:
                    case UnReadVideoExperiment.RELATION_LIST /*64*/:
                    case 65:
                    case 66:
                    case 67:
                        if (!m34893a(t2, i2, i)) {
                            break;
                        } else {
                            bba.m35154a((Object) t, j, bba.m35174f(t2, j));
                            m34900b(t, i2, i);
                            break;
                        }
                    case 68:
                        m34902b(t, t2, i);
                        break;
                }
            }
            if (!this.f41673j) {
                bad.m35024a(this.f41680q, t, t2);
                if (this.f41671h) {
                    bad.m35023a(this.f41681r, t, t2);
                    return;
                }
                return;
            }
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: a */
    private final void m34891a(T t, T t2, int i) {
        long d = (long) (m34906d(i) & 1048575);
        if (m34892a(t2, i)) {
            Object f = bba.m35174f(t, d);
            Object f2 = bba.m35174f(t2, d);
            if (f == null || f2 == null) {
                if (f2 != null) {
                    bba.m35154a((Object) t, d, f2);
                    m34899b(t, i);
                }
                return;
            }
            bba.m35154a((Object) t, d, ayb.m34769a(f, f2));
            m34899b(t, i);
        }
    }

    /* renamed from: b */
    private final void m34902b(T t, T t2, int i) {
        int d = m34906d(i);
        int i2 = this.f41666c[i];
        long j = (long) (d & 1048575);
        if (m34893a(t2, i2, i)) {
            Object f = bba.m35174f(t, j);
            Object f2 = bba.m35174f(t2, j);
            if (f == null || f2 == null) {
                if (f2 != null) {
                    bba.m35154a((Object) t, j, f2);
                    m34900b(t, i2, i);
                }
                return;
            }
            bba.m35154a((Object) t, j, ayb.m34769a(f, f2));
            m34900b(t, i2, i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:415:0x09d2, code lost:
        r18 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:475:0x0afd, code lost:
        r3 = r3 + 3;
        r9 = r18;
        r7 = 1048575;
        r8 = 1;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo29899b(T r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            boolean r2 = r0.f41673j
            r3 = 267386880(0xff00000, float:2.3665827E-29)
            r4 = 0
            r7 = 1048575(0xfffff, float:1.469367E-39)
            r8 = 1
            r9 = 0
            r11 = 0
            if (r2 == 0) goto L_0x055f
            sun.misc.Unsafe r2 = f41665b
            r12 = 0
            r13 = 0
        L_0x0016:
            int[] r14 = r0.f41666c
            int r14 = r14.length
            if (r12 >= r14) goto L_0x0557
            int r14 = r0.m34906d(r12)
            r15 = r14 & r3
            int r15 = r15 >>> 20
            int[] r3 = r0.f41666c
            r3 = r3[r12]
            r14 = r14 & r7
            long r5 = (long) r14
            com.google.android.gms.internal.ads.axt r14 = com.google.android.gms.internal.ads.axt.DOUBLE_LIST_PACKED
            int r14 = r14.mo29812id()
            if (r15 < r14) goto L_0x0041
            com.google.android.gms.internal.ads.axt r14 = com.google.android.gms.internal.ads.axt.SINT64_LIST_PACKED
            int r14 = r14.mo29812id()
            if (r15 > r14) goto L_0x0041
            int[] r14 = r0.f41666c
            int r17 = r12 + 2
            r14 = r14[r17]
            r14 = r14 & r7
            goto L_0x0042
        L_0x0041:
            r14 = 0
        L_0x0042:
            switch(r15) {
                case 0: goto L_0x0544;
                case 1: goto L_0x0538;
                case 2: goto L_0x0528;
                case 3: goto L_0x0518;
                case 4: goto L_0x0508;
                case 5: goto L_0x04fc;
                case 6: goto L_0x04f0;
                case 7: goto L_0x04e4;
                case 8: goto L_0x04c4;
                case 9: goto L_0x04af;
                case 10: goto L_0x049c;
                case 11: goto L_0x048b;
                case 12: goto L_0x047a;
                case 13: goto L_0x046d;
                case 14: goto L_0x0460;
                case 15: goto L_0x044f;
                case 16: goto L_0x043e;
                case 17: goto L_0x0427;
                case 18: goto L_0x041c;
                case 19: goto L_0x0411;
                case 20: goto L_0x0406;
                case 21: goto L_0x03fb;
                case 22: goto L_0x03f0;
                case 23: goto L_0x03e5;
                case 24: goto L_0x03da;
                case 25: goto L_0x03cf;
                case 26: goto L_0x03c4;
                case 27: goto L_0x03b5;
                case 28: goto L_0x03aa;
                case 29: goto L_0x039f;
                case 30: goto L_0x0394;
                case 31: goto L_0x0389;
                case 32: goto L_0x037e;
                case 33: goto L_0x0373;
                case 34: goto L_0x0368;
                case 35: goto L_0x0347;
                case 36: goto L_0x0326;
                case 37: goto L_0x0305;
                case 38: goto L_0x02e4;
                case 39: goto L_0x02c3;
                case 40: goto L_0x02a2;
                case 41: goto L_0x0281;
                case 42: goto L_0x0260;
                case 43: goto L_0x023f;
                case 44: goto L_0x021e;
                case 45: goto L_0x01fd;
                case 46: goto L_0x01dc;
                case 47: goto L_0x01bb;
                case 48: goto L_0x019a;
                case 49: goto L_0x018b;
                case 50: goto L_0x017a;
                case 51: goto L_0x016b;
                case 52: goto L_0x015e;
                case 53: goto L_0x014d;
                case 54: goto L_0x013c;
                case 55: goto L_0x012b;
                case 56: goto L_0x011e;
                case 57: goto L_0x0111;
                case 58: goto L_0x0104;
                case 59: goto L_0x00e4;
                case 60: goto L_0x00cf;
                case 61: goto L_0x00bc;
                case 62: goto L_0x00ab;
                case 63: goto L_0x009a;
                case 64: goto L_0x008d;
                case 65: goto L_0x0080;
                case 66: goto L_0x006f;
                case 67: goto L_0x005e;
                case 68: goto L_0x0047;
                default: goto L_0x0045;
            }
        L_0x0045:
            goto L_0x0551
        L_0x0047:
            boolean r14 = r0.m34893a((T) r1, r3, r12)
            if (r14 == 0) goto L_0x0551
            java.lang.Object r5 = com.google.android.gms.internal.ads.bba.m35174f(r1, r5)
            com.google.android.gms.internal.ads.azj r5 = (com.google.android.gms.internal.ads.azj) r5
            com.google.android.gms.internal.ads.bab r6 = r0.m34882a(r12)
            int r3 = com.google.android.gms.internal.ads.axf.m34444c(r3, r5, r6)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x005e:
            boolean r14 = r0.m34893a((T) r1, r3, r12)
            if (r14 == 0) goto L_0x0551
            long r5 = m34909e(r1, r5)
            int r3 = com.google.android.gms.internal.ads.axf.m34455f(r3, r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x006f:
            boolean r14 = r0.m34893a((T) r1, r3, r12)
            if (r14 == 0) goto L_0x0551
            int r5 = m34907d(r1, r5)
            int r3 = com.google.android.gms.internal.ads.axf.m34462h(r3, r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0080:
            boolean r5 = r0.m34893a((T) r1, r3, r12)
            if (r5 == 0) goto L_0x0551
            int r3 = com.google.android.gms.internal.ads.axf.m34463h(r3, r9)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x008d:
            boolean r5 = r0.m34893a((T) r1, r3, r12)
            if (r5 == 0) goto L_0x0551
            int r3 = com.google.android.gms.internal.ads.axf.m34467j(r3, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x009a:
            boolean r14 = r0.m34893a((T) r1, r3, r12)
            if (r14 == 0) goto L_0x0551
            int r5 = m34907d(r1, r5)
            int r3 = com.google.android.gms.internal.ads.axf.m34469k(r3, r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x00ab:
            boolean r14 = r0.m34893a((T) r1, r3, r12)
            if (r14 == 0) goto L_0x0551
            int r5 = m34907d(r1, r5)
            int r3 = com.google.android.gms.internal.ads.axf.m34458g(r3, r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x00bc:
            boolean r14 = r0.m34893a((T) r1, r3, r12)
            if (r14 == 0) goto L_0x0551
            java.lang.Object r5 = com.google.android.gms.internal.ads.bba.m35174f(r1, r5)
            com.google.android.gms.internal.ads.awo r5 = (com.google.android.gms.internal.ads.awo) r5
            int r3 = com.google.android.gms.internal.ads.axf.m34442c(r3, r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x00cf:
            boolean r14 = r0.m34893a((T) r1, r3, r12)
            if (r14 == 0) goto L_0x0551
            java.lang.Object r5 = com.google.android.gms.internal.ads.bba.m35174f(r1, r5)
            com.google.android.gms.internal.ads.bab r6 = r0.m34882a(r12)
            int r3 = com.google.android.gms.internal.ads.bad.m35011a(r3, r5, r6)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x00e4:
            boolean r14 = r0.m34893a((T) r1, r3, r12)
            if (r14 == 0) goto L_0x0551
            java.lang.Object r5 = com.google.android.gms.internal.ads.bba.m35174f(r1, r5)
            boolean r6 = r5 instanceof com.google.android.gms.internal.ads.awo
            if (r6 == 0) goto L_0x00fb
            com.google.android.gms.internal.ads.awo r5 = (com.google.android.gms.internal.ads.awo) r5
            int r3 = com.google.android.gms.internal.ads.axf.m34442c(r3, r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x00fb:
            java.lang.String r5 = (java.lang.String) r5
            int r3 = com.google.android.gms.internal.ads.axf.m34435b(r3, r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0104:
            boolean r5 = r0.m34893a((T) r1, r3, r12)
            if (r5 == 0) goto L_0x0551
            int r3 = com.google.android.gms.internal.ads.axf.m34436b(r3, r8)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0111:
            boolean r5 = r0.m34893a((T) r1, r3, r12)
            if (r5 == 0) goto L_0x0551
            int r3 = com.google.android.gms.internal.ads.axf.m34465i(r3, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x011e:
            boolean r5 = r0.m34893a((T) r1, r3, r12)
            if (r5 == 0) goto L_0x0551
            int r3 = com.google.android.gms.internal.ads.axf.m34459g(r3, r9)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x012b:
            boolean r14 = r0.m34893a((T) r1, r3, r12)
            if (r14 == 0) goto L_0x0551
            int r5 = m34907d(r1, r5)
            int r3 = com.google.android.gms.internal.ads.axf.m34454f(r3, r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x013c:
            boolean r14 = r0.m34893a((T) r1, r3, r12)
            if (r14 == 0) goto L_0x0551
            long r5 = m34909e(r1, r5)
            int r3 = com.google.android.gms.internal.ads.axf.m34451e(r3, r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x014d:
            boolean r14 = r0.m34893a((T) r1, r3, r12)
            if (r14 == 0) goto L_0x0551
            long r5 = m34909e(r1, r5)
            int r3 = com.google.android.gms.internal.ads.axf.m34446d(r3, r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x015e:
            boolean r5 = r0.m34893a((T) r1, r3, r12)
            if (r5 == 0) goto L_0x0551
            int r3 = com.google.android.gms.internal.ads.axf.m34432b(r3, r4)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x016b:
            boolean r5 = r0.m34893a((T) r1, r3, r12)
            if (r5 == 0) goto L_0x0551
            r5 = 0
            int r3 = com.google.android.gms.internal.ads.axf.m34431b(r3, r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x017a:
            com.google.android.gms.internal.ads.aze r14 = r0.f41682s
            java.lang.Object r5 = com.google.android.gms.internal.ads.bba.m35174f(r1, r5)
            java.lang.Object r6 = r0.m34898b(r12)
            int r3 = r14.mo29881a(r3, r5, r6)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x018b:
            java.util.List r5 = m34886a(r1, r5)
            com.google.android.gms.internal.ads.bab r6 = r0.m34882a(r12)
            int r3 = com.google.android.gms.internal.ads.bad.m35027b(r3, r5, r6)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x019a:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.bad.m35035c(r5)
            if (r5 <= 0) goto L_0x0551
            boolean r6 = r0.f41674k
            if (r6 == 0) goto L_0x01ae
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x01ae:
            int r3 = com.google.android.gms.internal.ads.axf.m34450e(r3)
            int r6 = com.google.android.gms.internal.ads.axf.m34457g(r5)
            int r3 = r3 + r6
            int r3 = r3 + r5
            int r13 = r13 + r3
            goto L_0x0551
        L_0x01bb:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.bad.m35049g(r5)
            if (r5 <= 0) goto L_0x0551
            boolean r6 = r0.f41674k
            if (r6 == 0) goto L_0x01cf
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x01cf:
            int r3 = com.google.android.gms.internal.ads.axf.m34450e(r3)
            int r6 = com.google.android.gms.internal.ads.axf.m34457g(r5)
            int r3 = r3 + r6
            int r3 = r3 + r5
            int r13 = r13 + r3
            goto L_0x0551
        L_0x01dc:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.bad.m35055i(r5)
            if (r5 <= 0) goto L_0x0551
            boolean r6 = r0.f41674k
            if (r6 == 0) goto L_0x01f0
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x01f0:
            int r3 = com.google.android.gms.internal.ads.axf.m34450e(r3)
            int r6 = com.google.android.gms.internal.ads.axf.m34457g(r5)
            int r3 = r3 + r6
            int r3 = r3 + r5
            int r13 = r13 + r3
            goto L_0x0551
        L_0x01fd:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.bad.m35052h(r5)
            if (r5 <= 0) goto L_0x0551
            boolean r6 = r0.f41674k
            if (r6 == 0) goto L_0x0211
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x0211:
            int r3 = com.google.android.gms.internal.ads.axf.m34450e(r3)
            int r6 = com.google.android.gms.internal.ads.axf.m34457g(r5)
            int r3 = r3 + r6
            int r3 = r3 + r5
            int r13 = r13 + r3
            goto L_0x0551
        L_0x021e:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.bad.m35039d(r5)
            if (r5 <= 0) goto L_0x0551
            boolean r6 = r0.f41674k
            if (r6 == 0) goto L_0x0232
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x0232:
            int r3 = com.google.android.gms.internal.ads.axf.m34450e(r3)
            int r6 = com.google.android.gms.internal.ads.axf.m34457g(r5)
            int r3 = r3 + r6
            int r3 = r3 + r5
            int r13 = r13 + r3
            goto L_0x0551
        L_0x023f:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.bad.m35046f(r5)
            if (r5 <= 0) goto L_0x0551
            boolean r6 = r0.f41674k
            if (r6 == 0) goto L_0x0253
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x0253:
            int r3 = com.google.android.gms.internal.ads.axf.m34450e(r3)
            int r6 = com.google.android.gms.internal.ads.axf.m34457g(r5)
            int r3 = r3 + r6
            int r3 = r3 + r5
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0260:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.bad.m35058j(r5)
            if (r5 <= 0) goto L_0x0551
            boolean r6 = r0.f41674k
            if (r6 == 0) goto L_0x0274
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x0274:
            int r3 = com.google.android.gms.internal.ads.axf.m34450e(r3)
            int r6 = com.google.android.gms.internal.ads.axf.m34457g(r5)
            int r3 = r3 + r6
            int r3 = r3 + r5
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0281:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.bad.m35052h(r5)
            if (r5 <= 0) goto L_0x0551
            boolean r6 = r0.f41674k
            if (r6 == 0) goto L_0x0295
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x0295:
            int r3 = com.google.android.gms.internal.ads.axf.m34450e(r3)
            int r6 = com.google.android.gms.internal.ads.axf.m34457g(r5)
            int r3 = r3 + r6
            int r3 = r3 + r5
            int r13 = r13 + r3
            goto L_0x0551
        L_0x02a2:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.bad.m35055i(r5)
            if (r5 <= 0) goto L_0x0551
            boolean r6 = r0.f41674k
            if (r6 == 0) goto L_0x02b6
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x02b6:
            int r3 = com.google.android.gms.internal.ads.axf.m34450e(r3)
            int r6 = com.google.android.gms.internal.ads.axf.m34457g(r5)
            int r3 = r3 + r6
            int r3 = r3 + r5
            int r13 = r13 + r3
            goto L_0x0551
        L_0x02c3:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.bad.m35043e(r5)
            if (r5 <= 0) goto L_0x0551
            boolean r6 = r0.f41674k
            if (r6 == 0) goto L_0x02d7
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x02d7:
            int r3 = com.google.android.gms.internal.ads.axf.m34450e(r3)
            int r6 = com.google.android.gms.internal.ads.axf.m34457g(r5)
            int r3 = r3 + r6
            int r3 = r3 + r5
            int r13 = r13 + r3
            goto L_0x0551
        L_0x02e4:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.bad.m35029b(r5)
            if (r5 <= 0) goto L_0x0551
            boolean r6 = r0.f41674k
            if (r6 == 0) goto L_0x02f8
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x02f8:
            int r3 = com.google.android.gms.internal.ads.axf.m34450e(r3)
            int r6 = com.google.android.gms.internal.ads.axf.m34457g(r5)
            int r3 = r3 + r6
            int r3 = r3 + r5
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0305:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.bad.m35015a(r5)
            if (r5 <= 0) goto L_0x0551
            boolean r6 = r0.f41674k
            if (r6 == 0) goto L_0x0319
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x0319:
            int r3 = com.google.android.gms.internal.ads.axf.m34450e(r3)
            int r6 = com.google.android.gms.internal.ads.axf.m34457g(r5)
            int r3 = r3 + r6
            int r3 = r3 + r5
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0326:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.bad.m35052h(r5)
            if (r5 <= 0) goto L_0x0551
            boolean r6 = r0.f41674k
            if (r6 == 0) goto L_0x033a
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x033a:
            int r3 = com.google.android.gms.internal.ads.axf.m34450e(r3)
            int r6 = com.google.android.gms.internal.ads.axf.m34457g(r5)
            int r3 = r3 + r6
            int r3 = r3 + r5
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0347:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.bad.m35055i(r5)
            if (r5 <= 0) goto L_0x0551
            boolean r6 = r0.f41674k
            if (r6 == 0) goto L_0x035b
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x035b:
            int r3 = com.google.android.gms.internal.ads.axf.m34450e(r3)
            int r6 = com.google.android.gms.internal.ads.axf.m34457g(r5)
            int r3 = r3 + r6
            int r3 = r3 + r5
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0368:
            java.util.List r5 = m34886a(r1, r5)
            int r3 = com.google.android.gms.internal.ads.bad.m35034c(r3, r5, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0373:
            java.util.List r5 = m34886a(r1, r5)
            int r3 = com.google.android.gms.internal.ads.bad.m35048g(r3, r5, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x037e:
            java.util.List r5 = m34886a(r1, r5)
            int r3 = com.google.android.gms.internal.ads.bad.m35054i(r3, r5, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0389:
            java.util.List r5 = m34886a(r1, r5)
            int r3 = com.google.android.gms.internal.ads.bad.m35051h(r3, r5, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0394:
            java.util.List r5 = m34886a(r1, r5)
            int r3 = com.google.android.gms.internal.ads.bad.m35038d(r3, r5, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x039f:
            java.util.List r5 = m34886a(r1, r5)
            int r3 = com.google.android.gms.internal.ads.bad.m35045f(r3, r5, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x03aa:
            java.util.List r5 = m34886a(r1, r5)
            int r3 = com.google.android.gms.internal.ads.bad.m35026b(r3, r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x03b5:
            java.util.List r5 = m34886a(r1, r5)
            com.google.android.gms.internal.ads.bab r6 = r0.m34882a(r12)
            int r3 = com.google.android.gms.internal.ads.bad.m35013a(r3, r5, r6)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x03c4:
            java.util.List r5 = m34886a(r1, r5)
            int r3 = com.google.android.gms.internal.ads.bad.m35012a(r3, r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x03cf:
            java.util.List r5 = m34886a(r1, r5)
            int r3 = com.google.android.gms.internal.ads.bad.m35057j(r3, r5, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x03da:
            java.util.List r5 = m34886a(r1, r5)
            int r3 = com.google.android.gms.internal.ads.bad.m35051h(r3, r5, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x03e5:
            java.util.List r5 = m34886a(r1, r5)
            int r3 = com.google.android.gms.internal.ads.bad.m35054i(r3, r5, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x03f0:
            java.util.List r5 = m34886a(r1, r5)
            int r3 = com.google.android.gms.internal.ads.bad.m35042e(r3, r5, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x03fb:
            java.util.List r5 = m34886a(r1, r5)
            int r3 = com.google.android.gms.internal.ads.bad.m35028b(r3, r5, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0406:
            java.util.List r5 = m34886a(r1, r5)
            int r3 = com.google.android.gms.internal.ads.bad.m35014a(r3, r5, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0411:
            java.util.List r5 = m34886a(r1, r5)
            int r3 = com.google.android.gms.internal.ads.bad.m35051h(r3, r5, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x041c:
            java.util.List r5 = m34886a(r1, r5)
            int r3 = com.google.android.gms.internal.ads.bad.m35054i(r3, r5, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0427:
            boolean r14 = r0.m34892a((T) r1, r12)
            if (r14 == 0) goto L_0x0551
            java.lang.Object r5 = com.google.android.gms.internal.ads.bba.m35174f(r1, r5)
            com.google.android.gms.internal.ads.azj r5 = (com.google.android.gms.internal.ads.azj) r5
            com.google.android.gms.internal.ads.bab r6 = r0.m34882a(r12)
            int r3 = com.google.android.gms.internal.ads.axf.m34444c(r3, r5, r6)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x043e:
            boolean r14 = r0.m34892a((T) r1, r12)
            if (r14 == 0) goto L_0x0551
            long r5 = com.google.android.gms.internal.ads.bba.m35159b(r1, r5)
            int r3 = com.google.android.gms.internal.ads.axf.m34455f(r3, r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x044f:
            boolean r14 = r0.m34892a((T) r1, r12)
            if (r14 == 0) goto L_0x0551
            int r5 = com.google.android.gms.internal.ads.bba.m35144a(r1, r5)
            int r3 = com.google.android.gms.internal.ads.axf.m34462h(r3, r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0460:
            boolean r5 = r0.m34892a((T) r1, r12)
            if (r5 == 0) goto L_0x0551
            int r3 = com.google.android.gms.internal.ads.axf.m34463h(r3, r9)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x046d:
            boolean r5 = r0.m34892a((T) r1, r12)
            if (r5 == 0) goto L_0x0551
            int r3 = com.google.android.gms.internal.ads.axf.m34467j(r3, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x047a:
            boolean r14 = r0.m34892a((T) r1, r12)
            if (r14 == 0) goto L_0x0551
            int r5 = com.google.android.gms.internal.ads.bba.m35144a(r1, r5)
            int r3 = com.google.android.gms.internal.ads.axf.m34469k(r3, r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x048b:
            boolean r14 = r0.m34892a((T) r1, r12)
            if (r14 == 0) goto L_0x0551
            int r5 = com.google.android.gms.internal.ads.bba.m35144a(r1, r5)
            int r3 = com.google.android.gms.internal.ads.axf.m34458g(r3, r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x049c:
            boolean r14 = r0.m34892a((T) r1, r12)
            if (r14 == 0) goto L_0x0551
            java.lang.Object r5 = com.google.android.gms.internal.ads.bba.m35174f(r1, r5)
            com.google.android.gms.internal.ads.awo r5 = (com.google.android.gms.internal.ads.awo) r5
            int r3 = com.google.android.gms.internal.ads.axf.m34442c(r3, r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x04af:
            boolean r14 = r0.m34892a((T) r1, r12)
            if (r14 == 0) goto L_0x0551
            java.lang.Object r5 = com.google.android.gms.internal.ads.bba.m35174f(r1, r5)
            com.google.android.gms.internal.ads.bab r6 = r0.m34882a(r12)
            int r3 = com.google.android.gms.internal.ads.bad.m35011a(r3, r5, r6)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x04c4:
            boolean r14 = r0.m34892a((T) r1, r12)
            if (r14 == 0) goto L_0x0551
            java.lang.Object r5 = com.google.android.gms.internal.ads.bba.m35174f(r1, r5)
            boolean r6 = r5 instanceof com.google.android.gms.internal.ads.awo
            if (r6 == 0) goto L_0x04db
            com.google.android.gms.internal.ads.awo r5 = (com.google.android.gms.internal.ads.awo) r5
            int r3 = com.google.android.gms.internal.ads.axf.m34442c(r3, r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x04db:
            java.lang.String r5 = (java.lang.String) r5
            int r3 = com.google.android.gms.internal.ads.axf.m34435b(r3, r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x04e4:
            boolean r5 = r0.m34892a((T) r1, r12)
            if (r5 == 0) goto L_0x0551
            int r3 = com.google.android.gms.internal.ads.axf.m34436b(r3, r8)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x04f0:
            boolean r5 = r0.m34892a((T) r1, r12)
            if (r5 == 0) goto L_0x0551
            int r3 = com.google.android.gms.internal.ads.axf.m34465i(r3, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x04fc:
            boolean r5 = r0.m34892a((T) r1, r12)
            if (r5 == 0) goto L_0x0551
            int r3 = com.google.android.gms.internal.ads.axf.m34459g(r3, r9)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0508:
            boolean r14 = r0.m34892a((T) r1, r12)
            if (r14 == 0) goto L_0x0551
            int r5 = com.google.android.gms.internal.ads.bba.m35144a(r1, r5)
            int r3 = com.google.android.gms.internal.ads.axf.m34454f(r3, r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0518:
            boolean r14 = r0.m34892a((T) r1, r12)
            if (r14 == 0) goto L_0x0551
            long r5 = com.google.android.gms.internal.ads.bba.m35159b(r1, r5)
            int r3 = com.google.android.gms.internal.ads.axf.m34451e(r3, r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0528:
            boolean r14 = r0.m34892a((T) r1, r12)
            if (r14 == 0) goto L_0x0551
            long r5 = com.google.android.gms.internal.ads.bba.m35159b(r1, r5)
            int r3 = com.google.android.gms.internal.ads.axf.m34446d(r3, r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0538:
            boolean r5 = r0.m34892a((T) r1, r12)
            if (r5 == 0) goto L_0x0551
            int r3 = com.google.android.gms.internal.ads.axf.m34432b(r3, r4)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0544:
            boolean r5 = r0.m34892a((T) r1, r12)
            if (r5 == 0) goto L_0x0551
            r5 = 0
            int r3 = com.google.android.gms.internal.ads.axf.m34431b(r3, r5)
            int r13 = r13 + r3
        L_0x0551:
            int r12 = r12 + 3
            r3 = 267386880(0xff00000, float:2.3665827E-29)
            goto L_0x0016
        L_0x0557:
            com.google.android.gms.internal.ads.bau<?, ?> r2 = r0.f41680q
            int r1 = m34876a(r2, (T) r1)
            int r13 = r13 + r1
            return r13
        L_0x055f:
            sun.misc.Unsafe r2 = f41665b
            r3 = -1
            r3 = 0
            r5 = 0
            r6 = -1
            r12 = 0
        L_0x0566:
            int[] r13 = r0.f41666c
            int r13 = r13.length
            if (r3 >= r13) goto L_0x0b09
            int r13 = r0.m34906d(r3)
            int[] r14 = r0.f41666c
            r14 = r14[r3]
            r15 = 267386880(0xff00000, float:2.3665827E-29)
            r16 = r13 & r15
            int r15 = r16 >>> 20
            r4 = 17
            if (r15 > r4) goto L_0x0592
            int[] r4 = r0.f41666c
            int r16 = r3 + 2
            r4 = r4[r16]
            r11 = r4 & r7
            int r16 = r4 >>> 20
            int r16 = r8 << r16
            if (r11 == r6) goto L_0x05b3
            long r8 = (long) r11
            int r12 = r2.getInt(r1, r8)
            r6 = r11
            goto L_0x05b3
        L_0x0592:
            boolean r4 = r0.f41674k
            if (r4 == 0) goto L_0x05b0
            com.google.android.gms.internal.ads.axt r4 = com.google.android.gms.internal.ads.axt.DOUBLE_LIST_PACKED
            int r4 = r4.mo29812id()
            if (r15 < r4) goto L_0x05b0
            com.google.android.gms.internal.ads.axt r4 = com.google.android.gms.internal.ads.axt.SINT64_LIST_PACKED
            int r4 = r4.mo29812id()
            if (r15 > r4) goto L_0x05b0
            int[] r4 = r0.f41666c
            int r8 = r3 + 2
            r4 = r4[r8]
            r11 = r4 & r7
            r4 = r11
            goto L_0x05b1
        L_0x05b0:
            r4 = 0
        L_0x05b1:
            r16 = 0
        L_0x05b3:
            r8 = r13 & r7
            long r8 = (long) r8
            switch(r15) {
                case 0: goto L_0x0aed;
                case 1: goto L_0x0adc;
                case 2: goto L_0x0aca;
                case 3: goto L_0x0ab8;
                case 4: goto L_0x0aa6;
                case 5: goto L_0x0a96;
                case 6: goto L_0x0a86;
                case 7: goto L_0x0a7a;
                case 8: goto L_0x0a5c;
                case 9: goto L_0x0a49;
                case 10: goto L_0x0a39;
                case 11: goto L_0x0a2b;
                case 12: goto L_0x0a1d;
                case 13: goto L_0x0a12;
                case 14: goto L_0x0a06;
                case 15: goto L_0x09f8;
                case 16: goto L_0x09ea;
                case 17: goto L_0x09d6;
                case 18: goto L_0x09c2;
                case 19: goto L_0x09b2;
                case 20: goto L_0x09a5;
                case 21: goto L_0x0998;
                case 22: goto L_0x098b;
                case 23: goto L_0x097e;
                case 24: goto L_0x0971;
                case 25: goto L_0x0964;
                case 26: goto L_0x0958;
                case 27: goto L_0x0947;
                case 28: goto L_0x093a;
                case 29: goto L_0x092c;
                case 30: goto L_0x091e;
                case 31: goto L_0x0910;
                case 32: goto L_0x0902;
                case 33: goto L_0x08f4;
                case 34: goto L_0x08e6;
                case 35: goto L_0x08c5;
                case 36: goto L_0x08a4;
                case 37: goto L_0x0883;
                case 38: goto L_0x0862;
                case 39: goto L_0x0841;
                case 40: goto L_0x0820;
                case 41: goto L_0x07ff;
                case 42: goto L_0x07de;
                case 43: goto L_0x07bd;
                case 44: goto L_0x079c;
                case 45: goto L_0x077b;
                case 46: goto L_0x075a;
                case 47: goto L_0x0739;
                case 48: goto L_0x0718;
                case 49: goto L_0x0707;
                case 50: goto L_0x06f6;
                case 51: goto L_0x06e7;
                case 52: goto L_0x06d9;
                case 53: goto L_0x06c8;
                case 54: goto L_0x06b7;
                case 55: goto L_0x06a6;
                case 56: goto L_0x0697;
                case 57: goto L_0x0689;
                case 58: goto L_0x067b;
                case 59: goto L_0x065b;
                case 60: goto L_0x0646;
                case 61: goto L_0x0633;
                case 62: goto L_0x0622;
                case 63: goto L_0x0611;
                case 64: goto L_0x0603;
                case 65: goto L_0x05f4;
                case 66: goto L_0x05e3;
                case 67: goto L_0x05d2;
                case 68: goto L_0x05bb;
                default: goto L_0x05b9;
            }
        L_0x05b9:
            goto L_0x09ce
        L_0x05bb:
            boolean r4 = r0.m34893a((T) r1, r14, r3)
            if (r4 == 0) goto L_0x09ce
            java.lang.Object r4 = r2.getObject(r1, r8)
            com.google.android.gms.internal.ads.azj r4 = (com.google.android.gms.internal.ads.azj) r4
            com.google.android.gms.internal.ads.bab r8 = r0.m34882a(r3)
            int r4 = com.google.android.gms.internal.ads.axf.m34444c(r14, r4, r8)
            int r5 = r5 + r4
            goto L_0x09ce
        L_0x05d2:
            boolean r4 = r0.m34893a((T) r1, r14, r3)
            if (r4 == 0) goto L_0x09ce
            long r8 = m34909e(r1, r8)
            int r4 = com.google.android.gms.internal.ads.axf.m34455f(r14, r8)
            int r5 = r5 + r4
            goto L_0x09ce
        L_0x05e3:
            boolean r4 = r0.m34893a((T) r1, r14, r3)
            if (r4 == 0) goto L_0x09ce
            int r4 = m34907d(r1, r8)
            int r4 = com.google.android.gms.internal.ads.axf.m34462h(r14, r4)
            int r5 = r5 + r4
            goto L_0x09ce
        L_0x05f4:
            boolean r4 = r0.m34893a((T) r1, r14, r3)
            if (r4 == 0) goto L_0x09ce
            r8 = 0
            int r4 = com.google.android.gms.internal.ads.axf.m34463h(r14, r8)
            int r5 = r5 + r4
            goto L_0x09ce
        L_0x0603:
            boolean r4 = r0.m34893a((T) r1, r14, r3)
            if (r4 == 0) goto L_0x09ce
            r4 = 0
            int r8 = com.google.android.gms.internal.ads.axf.m34467j(r14, r4)
            int r5 = r5 + r8
            goto L_0x09ce
        L_0x0611:
            boolean r4 = r0.m34893a((T) r1, r14, r3)
            if (r4 == 0) goto L_0x09ce
            int r4 = m34907d(r1, r8)
            int r4 = com.google.android.gms.internal.ads.axf.m34469k(r14, r4)
            int r5 = r5 + r4
            goto L_0x09ce
        L_0x0622:
            boolean r4 = r0.m34893a((T) r1, r14, r3)
            if (r4 == 0) goto L_0x09ce
            int r4 = m34907d(r1, r8)
            int r4 = com.google.android.gms.internal.ads.axf.m34458g(r14, r4)
            int r5 = r5 + r4
            goto L_0x09ce
        L_0x0633:
            boolean r4 = r0.m34893a((T) r1, r14, r3)
            if (r4 == 0) goto L_0x09ce
            java.lang.Object r4 = r2.getObject(r1, r8)
            com.google.android.gms.internal.ads.awo r4 = (com.google.android.gms.internal.ads.awo) r4
            int r4 = com.google.android.gms.internal.ads.axf.m34442c(r14, r4)
            int r5 = r5 + r4
            goto L_0x09ce
        L_0x0646:
            boolean r4 = r0.m34893a((T) r1, r14, r3)
            if (r4 == 0) goto L_0x09ce
            java.lang.Object r4 = r2.getObject(r1, r8)
            com.google.android.gms.internal.ads.bab r8 = r0.m34882a(r3)
            int r4 = com.google.android.gms.internal.ads.bad.m35011a(r14, r4, r8)
            int r5 = r5 + r4
            goto L_0x09ce
        L_0x065b:
            boolean r4 = r0.m34893a((T) r1, r14, r3)
            if (r4 == 0) goto L_0x09ce
            java.lang.Object r4 = r2.getObject(r1, r8)
            boolean r8 = r4 instanceof com.google.android.gms.internal.ads.awo
            if (r8 == 0) goto L_0x0672
            com.google.android.gms.internal.ads.awo r4 = (com.google.android.gms.internal.ads.awo) r4
            int r4 = com.google.android.gms.internal.ads.axf.m34442c(r14, r4)
            int r5 = r5 + r4
            goto L_0x09ce
        L_0x0672:
            java.lang.String r4 = (java.lang.String) r4
            int r4 = com.google.android.gms.internal.ads.axf.m34435b(r14, r4)
            int r5 = r5 + r4
            goto L_0x09ce
        L_0x067b:
            boolean r4 = r0.m34893a((T) r1, r14, r3)
            if (r4 == 0) goto L_0x09ce
            r4 = 1
            int r8 = com.google.android.gms.internal.ads.axf.m34436b(r14, r4)
            int r5 = r5 + r8
            goto L_0x09ce
        L_0x0689:
            boolean r4 = r0.m34893a((T) r1, r14, r3)
            if (r4 == 0) goto L_0x09ce
            r4 = 0
            int r8 = com.google.android.gms.internal.ads.axf.m34465i(r14, r4)
            int r5 = r5 + r8
            goto L_0x09ce
        L_0x0697:
            boolean r4 = r0.m34893a((T) r1, r14, r3)
            if (r4 == 0) goto L_0x09ce
            r8 = 0
            int r4 = com.google.android.gms.internal.ads.axf.m34459g(r14, r8)
            int r5 = r5 + r4
            goto L_0x09ce
        L_0x06a6:
            boolean r4 = r0.m34893a((T) r1, r14, r3)
            if (r4 == 0) goto L_0x09ce
            int r4 = m34907d(r1, r8)
            int r4 = com.google.android.gms.internal.ads.axf.m34454f(r14, r4)
            int r5 = r5 + r4
            goto L_0x09ce
        L_0x06b7:
            boolean r4 = r0.m34893a((T) r1, r14, r3)
            if (r4 == 0) goto L_0x09ce
            long r8 = m34909e(r1, r8)
            int r4 = com.google.android.gms.internal.ads.axf.m34451e(r14, r8)
            int r5 = r5 + r4
            goto L_0x09ce
        L_0x06c8:
            boolean r4 = r0.m34893a((T) r1, r14, r3)
            if (r4 == 0) goto L_0x09ce
            long r8 = m34909e(r1, r8)
            int r4 = com.google.android.gms.internal.ads.axf.m34446d(r14, r8)
            int r5 = r5 + r4
            goto L_0x09ce
        L_0x06d9:
            boolean r4 = r0.m34893a((T) r1, r14, r3)
            if (r4 == 0) goto L_0x09ce
            r4 = 0
            int r8 = com.google.android.gms.internal.ads.axf.m34432b(r14, r4)
            int r5 = r5 + r8
            goto L_0x09ce
        L_0x06e7:
            boolean r4 = r0.m34893a((T) r1, r14, r3)
            if (r4 == 0) goto L_0x09ce
            r8 = 0
            int r4 = com.google.android.gms.internal.ads.axf.m34431b(r14, r8)
            int r5 = r5 + r4
            goto L_0x09ce
        L_0x06f6:
            com.google.android.gms.internal.ads.aze r4 = r0.f41682s
            java.lang.Object r8 = r2.getObject(r1, r8)
            java.lang.Object r9 = r0.m34898b(r3)
            int r4 = r4.mo29881a(r14, r8, r9)
            int r5 = r5 + r4
            goto L_0x09ce
        L_0x0707:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.bab r8 = r0.m34882a(r3)
            int r4 = com.google.android.gms.internal.ads.bad.m35027b(r14, r4, r8)
            int r5 = r5 + r4
            goto L_0x09ce
        L_0x0718:
            java.lang.Object r8 = r2.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            int r8 = com.google.android.gms.internal.ads.bad.m35035c(r8)
            if (r8 <= 0) goto L_0x09ce
            boolean r9 = r0.f41674k
            if (r9 == 0) goto L_0x072c
            long r9 = (long) r4
            r2.putInt(r1, r9, r8)
        L_0x072c:
            int r4 = com.google.android.gms.internal.ads.axf.m34450e(r14)
            int r9 = com.google.android.gms.internal.ads.axf.m34457g(r8)
            int r4 = r4 + r9
            int r4 = r4 + r8
            int r5 = r5 + r4
            goto L_0x09ce
        L_0x0739:
            java.lang.Object r8 = r2.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            int r8 = com.google.android.gms.internal.ads.bad.m35049g(r8)
            if (r8 <= 0) goto L_0x09ce
            boolean r9 = r0.f41674k
            if (r9 == 0) goto L_0x074d
            long r9 = (long) r4
            r2.putInt(r1, r9, r8)
        L_0x074d:
            int r4 = com.google.android.gms.internal.ads.axf.m34450e(r14)
            int r9 = com.google.android.gms.internal.ads.axf.m34457g(r8)
            int r4 = r4 + r9
            int r4 = r4 + r8
            int r5 = r5 + r4
            goto L_0x09ce
        L_0x075a:
            java.lang.Object r8 = r2.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            int r8 = com.google.android.gms.internal.ads.bad.m35055i(r8)
            if (r8 <= 0) goto L_0x09ce
            boolean r9 = r0.f41674k
            if (r9 == 0) goto L_0x076e
            long r9 = (long) r4
            r2.putInt(r1, r9, r8)
        L_0x076e:
            int r4 = com.google.android.gms.internal.ads.axf.m34450e(r14)
            int r9 = com.google.android.gms.internal.ads.axf.m34457g(r8)
            int r4 = r4 + r9
            int r4 = r4 + r8
            int r5 = r5 + r4
            goto L_0x09ce
        L_0x077b:
            java.lang.Object r8 = r2.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            int r8 = com.google.android.gms.internal.ads.bad.m35052h(r8)
            if (r8 <= 0) goto L_0x09ce
            boolean r9 = r0.f41674k
            if (r9 == 0) goto L_0x078f
            long r9 = (long) r4
            r2.putInt(r1, r9, r8)
        L_0x078f:
            int r4 = com.google.android.gms.internal.ads.axf.m34450e(r14)
            int r9 = com.google.android.gms.internal.ads.axf.m34457g(r8)
            int r4 = r4 + r9
            int r4 = r4 + r8
            int r5 = r5 + r4
            goto L_0x09ce
        L_0x079c:
            java.lang.Object r8 = r2.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            int r8 = com.google.android.gms.internal.ads.bad.m35039d(r8)
            if (r8 <= 0) goto L_0x09ce
            boolean r9 = r0.f41674k
            if (r9 == 0) goto L_0x07b0
            long r9 = (long) r4
            r2.putInt(r1, r9, r8)
        L_0x07b0:
            int r4 = com.google.android.gms.internal.ads.axf.m34450e(r14)
            int r9 = com.google.android.gms.internal.ads.axf.m34457g(r8)
            int r4 = r4 + r9
            int r4 = r4 + r8
            int r5 = r5 + r4
            goto L_0x09ce
        L_0x07bd:
            java.lang.Object r8 = r2.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            int r8 = com.google.android.gms.internal.ads.bad.m35046f(r8)
            if (r8 <= 0) goto L_0x09ce
            boolean r9 = r0.f41674k
            if (r9 == 0) goto L_0x07d1
            long r9 = (long) r4
            r2.putInt(r1, r9, r8)
        L_0x07d1:
            int r4 = com.google.android.gms.internal.ads.axf.m34450e(r14)
            int r9 = com.google.android.gms.internal.ads.axf.m34457g(r8)
            int r4 = r4 + r9
            int r4 = r4 + r8
            int r5 = r5 + r4
            goto L_0x09ce
        L_0x07de:
            java.lang.Object r8 = r2.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            int r8 = com.google.android.gms.internal.ads.bad.m35058j(r8)
            if (r8 <= 0) goto L_0x09ce
            boolean r9 = r0.f41674k
            if (r9 == 0) goto L_0x07f2
            long r9 = (long) r4
            r2.putInt(r1, r9, r8)
        L_0x07f2:
            int r4 = com.google.android.gms.internal.ads.axf.m34450e(r14)
            int r9 = com.google.android.gms.internal.ads.axf.m34457g(r8)
            int r4 = r4 + r9
            int r4 = r4 + r8
            int r5 = r5 + r4
            goto L_0x09ce
        L_0x07ff:
            java.lang.Object r8 = r2.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            int r8 = com.google.android.gms.internal.ads.bad.m35052h(r8)
            if (r8 <= 0) goto L_0x09ce
            boolean r9 = r0.f41674k
            if (r9 == 0) goto L_0x0813
            long r9 = (long) r4
            r2.putInt(r1, r9, r8)
        L_0x0813:
            int r4 = com.google.android.gms.internal.ads.axf.m34450e(r14)
            int r9 = com.google.android.gms.internal.ads.axf.m34457g(r8)
            int r4 = r4 + r9
            int r4 = r4 + r8
            int r5 = r5 + r4
            goto L_0x09ce
        L_0x0820:
            java.lang.Object r8 = r2.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            int r8 = com.google.android.gms.internal.ads.bad.m35055i(r8)
            if (r8 <= 0) goto L_0x09ce
            boolean r9 = r0.f41674k
            if (r9 == 0) goto L_0x0834
            long r9 = (long) r4
            r2.putInt(r1, r9, r8)
        L_0x0834:
            int r4 = com.google.android.gms.internal.ads.axf.m34450e(r14)
            int r9 = com.google.android.gms.internal.ads.axf.m34457g(r8)
            int r4 = r4 + r9
            int r4 = r4 + r8
            int r5 = r5 + r4
            goto L_0x09ce
        L_0x0841:
            java.lang.Object r8 = r2.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            int r8 = com.google.android.gms.internal.ads.bad.m35043e(r8)
            if (r8 <= 0) goto L_0x09ce
            boolean r9 = r0.f41674k
            if (r9 == 0) goto L_0x0855
            long r9 = (long) r4
            r2.putInt(r1, r9, r8)
        L_0x0855:
            int r4 = com.google.android.gms.internal.ads.axf.m34450e(r14)
            int r9 = com.google.android.gms.internal.ads.axf.m34457g(r8)
            int r4 = r4 + r9
            int r4 = r4 + r8
            int r5 = r5 + r4
            goto L_0x09ce
        L_0x0862:
            java.lang.Object r8 = r2.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            int r8 = com.google.android.gms.internal.ads.bad.m35029b(r8)
            if (r8 <= 0) goto L_0x09ce
            boolean r9 = r0.f41674k
            if (r9 == 0) goto L_0x0876
            long r9 = (long) r4
            r2.putInt(r1, r9, r8)
        L_0x0876:
            int r4 = com.google.android.gms.internal.ads.axf.m34450e(r14)
            int r9 = com.google.android.gms.internal.ads.axf.m34457g(r8)
            int r4 = r4 + r9
            int r4 = r4 + r8
            int r5 = r5 + r4
            goto L_0x09ce
        L_0x0883:
            java.lang.Object r8 = r2.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            int r8 = com.google.android.gms.internal.ads.bad.m35015a(r8)
            if (r8 <= 0) goto L_0x09ce
            boolean r9 = r0.f41674k
            if (r9 == 0) goto L_0x0897
            long r9 = (long) r4
            r2.putInt(r1, r9, r8)
        L_0x0897:
            int r4 = com.google.android.gms.internal.ads.axf.m34450e(r14)
            int r9 = com.google.android.gms.internal.ads.axf.m34457g(r8)
            int r4 = r4 + r9
            int r4 = r4 + r8
            int r5 = r5 + r4
            goto L_0x09ce
        L_0x08a4:
            java.lang.Object r8 = r2.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            int r8 = com.google.android.gms.internal.ads.bad.m35052h(r8)
            if (r8 <= 0) goto L_0x09ce
            boolean r9 = r0.f41674k
            if (r9 == 0) goto L_0x08b8
            long r9 = (long) r4
            r2.putInt(r1, r9, r8)
        L_0x08b8:
            int r4 = com.google.android.gms.internal.ads.axf.m34450e(r14)
            int r9 = com.google.android.gms.internal.ads.axf.m34457g(r8)
            int r4 = r4 + r9
            int r4 = r4 + r8
            int r5 = r5 + r4
            goto L_0x09ce
        L_0x08c5:
            java.lang.Object r8 = r2.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            int r8 = com.google.android.gms.internal.ads.bad.m35055i(r8)
            if (r8 <= 0) goto L_0x09ce
            boolean r9 = r0.f41674k
            if (r9 == 0) goto L_0x08d9
            long r9 = (long) r4
            r2.putInt(r1, r9, r8)
        L_0x08d9:
            int r4 = com.google.android.gms.internal.ads.axf.m34450e(r14)
            int r9 = com.google.android.gms.internal.ads.axf.m34457g(r8)
            int r4 = r4 + r9
            int r4 = r4 + r8
            int r5 = r5 + r4
            goto L_0x09ce
        L_0x08e6:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            r10 = 0
            int r4 = com.google.android.gms.internal.ads.bad.m35034c(r14, r4, r10)
            int r5 = r5 + r4
            goto L_0x09be
        L_0x08f4:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.bad.m35048g(r14, r4, r10)
            int r5 = r5 + r4
            goto L_0x09be
        L_0x0902:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.bad.m35054i(r14, r4, r10)
            int r5 = r5 + r4
            goto L_0x09be
        L_0x0910:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.bad.m35051h(r14, r4, r10)
            int r5 = r5 + r4
            goto L_0x09be
        L_0x091e:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.bad.m35038d(r14, r4, r10)
            int r5 = r5 + r4
            goto L_0x09be
        L_0x092c:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.bad.m35045f(r14, r4, r10)
            int r5 = r5 + r4
            goto L_0x09ce
        L_0x093a:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.bad.m35026b(r14, r4)
            int r5 = r5 + r4
            goto L_0x09ce
        L_0x0947:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.bab r8 = r0.m34882a(r3)
            int r4 = com.google.android.gms.internal.ads.bad.m35013a(r14, r4, r8)
            int r5 = r5 + r4
            goto L_0x09ce
        L_0x0958:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.bad.m35012a(r14, r4)
            int r5 = r5 + r4
            goto L_0x09ce
        L_0x0964:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            r10 = 0
            int r4 = com.google.android.gms.internal.ads.bad.m35057j(r14, r4, r10)
            int r5 = r5 + r4
            goto L_0x09be
        L_0x0971:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.bad.m35051h(r14, r4, r10)
            int r5 = r5 + r4
            goto L_0x09be
        L_0x097e:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.bad.m35054i(r14, r4, r10)
            int r5 = r5 + r4
            goto L_0x09be
        L_0x098b:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.bad.m35042e(r14, r4, r10)
            int r5 = r5 + r4
            goto L_0x09be
        L_0x0998:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.bad.m35028b(r14, r4, r10)
            int r5 = r5 + r4
            goto L_0x09be
        L_0x09a5:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.bad.m35014a(r14, r4, r10)
            int r5 = r5 + r4
            goto L_0x09be
        L_0x09b2:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.bad.m35051h(r14, r4, r10)
            int r5 = r5 + r4
        L_0x09be:
            r4 = 1
        L_0x09bf:
            r7 = 0
            goto L_0x09d2
        L_0x09c2:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.bad.m35054i(r14, r4, r10)
            int r5 = r5 + r4
        L_0x09ce:
            r4 = 1
        L_0x09cf:
            r7 = 0
            r10 = 0
        L_0x09d2:
            r18 = 0
            goto L_0x0afd
        L_0x09d6:
            r4 = r12 & r16
            if (r4 == 0) goto L_0x09ce
            java.lang.Object r4 = r2.getObject(r1, r8)
            com.google.android.gms.internal.ads.azj r4 = (com.google.android.gms.internal.ads.azj) r4
            com.google.android.gms.internal.ads.bab r8 = r0.m34882a(r3)
            int r4 = com.google.android.gms.internal.ads.axf.m34444c(r14, r4, r8)
            int r5 = r5 + r4
            goto L_0x09ce
        L_0x09ea:
            r4 = r12 & r16
            if (r4 == 0) goto L_0x09ce
            long r8 = r2.getLong(r1, r8)
            int r4 = com.google.android.gms.internal.ads.axf.m34455f(r14, r8)
            int r5 = r5 + r4
            goto L_0x09ce
        L_0x09f8:
            r4 = r12 & r16
            if (r4 == 0) goto L_0x09ce
            int r4 = r2.getInt(r1, r8)
            int r4 = com.google.android.gms.internal.ads.axf.m34462h(r14, r4)
            int r5 = r5 + r4
            goto L_0x09ce
        L_0x0a06:
            r4 = r12 & r16
            if (r4 == 0) goto L_0x09ce
            r8 = 0
            int r4 = com.google.android.gms.internal.ads.axf.m34463h(r14, r8)
            int r5 = r5 + r4
            goto L_0x09ce
        L_0x0a12:
            r4 = r12 & r16
            if (r4 == 0) goto L_0x09ce
            r4 = 0
            int r8 = com.google.android.gms.internal.ads.axf.m34467j(r14, r4)
            int r5 = r5 + r8
            goto L_0x09ce
        L_0x0a1d:
            r4 = r12 & r16
            if (r4 == 0) goto L_0x09ce
            int r4 = r2.getInt(r1, r8)
            int r4 = com.google.android.gms.internal.ads.axf.m34469k(r14, r4)
            int r5 = r5 + r4
            goto L_0x09ce
        L_0x0a2b:
            r4 = r12 & r16
            if (r4 == 0) goto L_0x09ce
            int r4 = r2.getInt(r1, r8)
            int r4 = com.google.android.gms.internal.ads.axf.m34458g(r14, r4)
            int r5 = r5 + r4
            goto L_0x09ce
        L_0x0a39:
            r4 = r12 & r16
            if (r4 == 0) goto L_0x09ce
            java.lang.Object r4 = r2.getObject(r1, r8)
            com.google.android.gms.internal.ads.awo r4 = (com.google.android.gms.internal.ads.awo) r4
            int r4 = com.google.android.gms.internal.ads.axf.m34442c(r14, r4)
            int r5 = r5 + r4
            goto L_0x09ce
        L_0x0a49:
            r4 = r12 & r16
            if (r4 == 0) goto L_0x09ce
            java.lang.Object r4 = r2.getObject(r1, r8)
            com.google.android.gms.internal.ads.bab r8 = r0.m34882a(r3)
            int r4 = com.google.android.gms.internal.ads.bad.m35011a(r14, r4, r8)
            int r5 = r5 + r4
            goto L_0x09ce
        L_0x0a5c:
            r4 = r12 & r16
            if (r4 == 0) goto L_0x09ce
            java.lang.Object r4 = r2.getObject(r1, r8)
            boolean r8 = r4 instanceof com.google.android.gms.internal.ads.awo
            if (r8 == 0) goto L_0x0a71
            com.google.android.gms.internal.ads.awo r4 = (com.google.android.gms.internal.ads.awo) r4
            int r4 = com.google.android.gms.internal.ads.axf.m34442c(r14, r4)
            int r5 = r5 + r4
            goto L_0x09ce
        L_0x0a71:
            java.lang.String r4 = (java.lang.String) r4
            int r4 = com.google.android.gms.internal.ads.axf.m34435b(r14, r4)
            int r5 = r5 + r4
            goto L_0x09ce
        L_0x0a7a:
            r4 = r12 & r16
            if (r4 == 0) goto L_0x09ce
            r4 = 1
            int r8 = com.google.android.gms.internal.ads.axf.m34436b(r14, r4)
            int r5 = r5 + r8
            goto L_0x09cf
        L_0x0a86:
            r4 = 1
            r8 = r12 & r16
            if (r8 == 0) goto L_0x0a93
            r10 = 0
            int r8 = com.google.android.gms.internal.ads.axf.m34465i(r14, r10)
            int r5 = r5 + r8
            goto L_0x09bf
        L_0x0a93:
            r10 = 0
            goto L_0x09bf
        L_0x0a96:
            r4 = 1
            r10 = 0
            r8 = r12 & r16
            if (r8 == 0) goto L_0x09bf
            r8 = 0
            int r11 = com.google.android.gms.internal.ads.axf.m34459g(r14, r8)
            int r5 = r5 + r11
            r18 = r8
            goto L_0x0aea
        L_0x0aa6:
            r4 = 1
            r10 = 0
            r18 = 0
            r11 = r12 & r16
            if (r11 == 0) goto L_0x0aea
            int r8 = r2.getInt(r1, r8)
            int r8 = com.google.android.gms.internal.ads.axf.m34454f(r14, r8)
            int r5 = r5 + r8
            goto L_0x0aea
        L_0x0ab8:
            r4 = 1
            r10 = 0
            r18 = 0
            r11 = r12 & r16
            if (r11 == 0) goto L_0x0aea
            long r8 = r2.getLong(r1, r8)
            int r8 = com.google.android.gms.internal.ads.axf.m34451e(r14, r8)
            int r5 = r5 + r8
            goto L_0x0aea
        L_0x0aca:
            r4 = 1
            r10 = 0
            r18 = 0
            r11 = r12 & r16
            if (r11 == 0) goto L_0x0aea
            long r8 = r2.getLong(r1, r8)
            int r8 = com.google.android.gms.internal.ads.axf.m34446d(r14, r8)
            int r5 = r5 + r8
            goto L_0x0aea
        L_0x0adc:
            r4 = 1
            r10 = 0
            r18 = 0
            r8 = r12 & r16
            if (r8 == 0) goto L_0x0aea
            r8 = 0
            int r9 = com.google.android.gms.internal.ads.axf.m34432b(r14, r8)
            int r5 = r5 + r9
        L_0x0aea:
            r7 = 0
            goto L_0x0afd
        L_0x0aed:
            r4 = 1
            r8 = 0
            r10 = 0
            r18 = 0
            r9 = r12 & r16
            if (r9 == 0) goto L_0x0aea
            r7 = 0
            int r9 = com.google.android.gms.internal.ads.axf.m34431b(r14, r7)
            int r5 = r5 + r9
        L_0x0afd:
            int r3 = r3 + 3
            r9 = r18
            r4 = 0
            r7 = 1048575(0xfffff, float:1.469367E-39)
            r8 = 1
            r11 = 0
            goto L_0x0566
        L_0x0b09:
            r10 = 0
            com.google.android.gms.internal.ads.bau<?, ?> r2 = r0.f41680q
            int r2 = m34876a(r2, (T) r1)
            int r5 = r5 + r2
            boolean r2 = r0.f41671h
            if (r2 == 0) goto L_0x0b63
            com.google.android.gms.internal.ads.axn<?> r2 = r0.f41681r
            com.google.android.gms.internal.ads.axq r1 = r2.mo29788a(r1)
            r2 = 0
        L_0x0b1c:
            com.google.android.gms.internal.ads.bae<FieldDescriptorType, java.lang.Object> r3 = r1.f41529a
            int r3 = r3.mo29914b()
            if (r10 >= r3) goto L_0x0b3c
            com.google.android.gms.internal.ads.bae<FieldDescriptorType, java.lang.Object> r3 = r1.f41529a
            java.util.Map$Entry r3 = r3.mo29915b(r10)
            java.lang.Object r4 = r3.getKey()
            com.google.android.gms.internal.ads.axs r4 = (com.google.android.gms.internal.ads.axs) r4
            java.lang.Object r3 = r3.getValue()
            int r3 = com.google.android.gms.internal.ads.axq.m34673a(r4, r3)
            int r2 = r2 + r3
            int r10 = r10 + 1
            goto L_0x0b1c
        L_0x0b3c:
            com.google.android.gms.internal.ads.bae<FieldDescriptorType, java.lang.Object> r1 = r1.f41529a
            java.lang.Iterable r1 = r1.mo29916c()
            java.util.Iterator r1 = r1.iterator()
        L_0x0b46:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0b62
            java.lang.Object r3 = r1.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            com.google.android.gms.internal.ads.axs r4 = (com.google.android.gms.internal.ads.axs) r4
            java.lang.Object r3 = r3.getValue()
            int r3 = com.google.android.gms.internal.ads.axq.m34673a(r4, r3)
            int r2 = r2 + r3
            goto L_0x0b46
        L_0x0b62:
            int r5 = r5 + r2
        L_0x0b63:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.azo.mo29899b(java.lang.Object):int");
    }

    /* renamed from: a */
    private static <UT, UB> int m34876a(bau<UT, UB> bau, T t) {
        return bau.mo29971f(bau.mo29963b(t));
    }

    /* renamed from: a */
    private static <E> List<E> m34886a(Object obj, long j) {
        return (List) bba.m35174f(obj, j);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x052c  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x056a  */
    /* JADX WARNING: Removed duplicated region for block: B:335:0x0a42  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo29896a(T r14, com.google.android.gms.internal.ads.bbq r15) throws java.io.IOException {
        /*
            r13 = this;
            int r0 = r15.mo29739a()
            int r1 = com.google.android.gms.internal.ads.axz.C15675e.f41619k
            r2 = 267386880(0xff00000, float:2.3665827E-29)
            r3 = 0
            r4 = 1
            r5 = 0
            r6 = 1048575(0xfffff, float:1.469367E-39)
            if (r0 != r1) goto L_0x0542
            com.google.android.gms.internal.ads.bau<?, ?> r0 = r13.f41680q
            m34888a(r0, (T) r14, r15)
            boolean r0 = r13.f41671h
            if (r0 == 0) goto L_0x004b
            com.google.android.gms.internal.ads.axn<?> r0 = r13.f41681r
            com.google.android.gms.internal.ads.axq r0 = r0.mo29788a(r14)
            boolean r1 = r0.mo29798a()
            if (r1 != 0) goto L_0x004b
            boolean r1 = r0.f41531c
            if (r1 == 0) goto L_0x003a
            com.google.android.gms.internal.ads.ayp r1 = new com.google.android.gms.internal.ads.ayp
            com.google.android.gms.internal.ads.bae<FieldDescriptorType, java.lang.Object> r0 = r0.f41529a
            java.util.Set r0 = r0.mo29920d()
            java.util.Iterator r0 = r0.iterator()
            r1.<init>(r0)
            r0 = r1
            goto L_0x0044
        L_0x003a:
            com.google.android.gms.internal.ads.bae<FieldDescriptorType, java.lang.Object> r0 = r0.f41529a
            java.util.Set r0 = r0.mo29920d()
            java.util.Iterator r0 = r0.iterator()
        L_0x0044:
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x004d
        L_0x004b:
            r0 = r3
            r1 = r0
        L_0x004d:
            int[] r7 = r13.f41666c
            int r7 = r7.length
            int r7 = r7 + -3
        L_0x0052:
            if (r7 < 0) goto L_0x052a
            int r8 = r13.m34906d(r7)
            int[] r9 = r13.f41666c
            r9 = r9[r7]
        L_0x005c:
            if (r1 == 0) goto L_0x007a
            com.google.android.gms.internal.ads.axn<?> r10 = r13.f41681r
            int r10 = r10.mo29787a(r1)
            if (r10 <= r9) goto L_0x007a
            com.google.android.gms.internal.ads.axn<?> r10 = r13.f41681r
            r10.mo29793a(r15, r1)
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0078
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x005c
        L_0x0078:
            r1 = r3
            goto L_0x005c
        L_0x007a:
            r10 = r8 & r2
            int r10 = r10 >>> 20
            switch(r10) {
                case 0: goto L_0x0517;
                case 1: goto L_0x0507;
                case 2: goto L_0x04f7;
                case 3: goto L_0x04e7;
                case 4: goto L_0x04d7;
                case 5: goto L_0x04c7;
                case 6: goto L_0x04b7;
                case 7: goto L_0x04a6;
                case 8: goto L_0x0495;
                case 9: goto L_0x0480;
                case 10: goto L_0x046d;
                case 11: goto L_0x045c;
                case 12: goto L_0x044b;
                case 13: goto L_0x043a;
                case 14: goto L_0x0429;
                case 15: goto L_0x0418;
                case 16: goto L_0x0407;
                case 17: goto L_0x03f2;
                case 18: goto L_0x03e1;
                case 19: goto L_0x03d0;
                case 20: goto L_0x03bf;
                case 21: goto L_0x03ae;
                case 22: goto L_0x039d;
                case 23: goto L_0x038c;
                case 24: goto L_0x037b;
                case 25: goto L_0x036a;
                case 26: goto L_0x0359;
                case 27: goto L_0x0344;
                case 28: goto L_0x0333;
                case 29: goto L_0x0322;
                case 30: goto L_0x0311;
                case 31: goto L_0x0300;
                case 32: goto L_0x02ef;
                case 33: goto L_0x02de;
                case 34: goto L_0x02cd;
                case 35: goto L_0x02bc;
                case 36: goto L_0x02ab;
                case 37: goto L_0x029a;
                case 38: goto L_0x0289;
                case 39: goto L_0x0278;
                case 40: goto L_0x0267;
                case 41: goto L_0x0256;
                case 42: goto L_0x0245;
                case 43: goto L_0x0234;
                case 44: goto L_0x0223;
                case 45: goto L_0x0212;
                case 46: goto L_0x0201;
                case 47: goto L_0x01f0;
                case 48: goto L_0x01df;
                case 49: goto L_0x01ca;
                case 50: goto L_0x01bf;
                case 51: goto L_0x01ae;
                case 52: goto L_0x019d;
                case 53: goto L_0x018c;
                case 54: goto L_0x017b;
                case 55: goto L_0x016a;
                case 56: goto L_0x0159;
                case 57: goto L_0x0148;
                case 58: goto L_0x0137;
                case 59: goto L_0x0126;
                case 60: goto L_0x0111;
                case 61: goto L_0x00fe;
                case 62: goto L_0x00ed;
                case 63: goto L_0x00dc;
                case 64: goto L_0x00cb;
                case 65: goto L_0x00ba;
                case 66: goto L_0x00a9;
                case 67: goto L_0x0098;
                case 68: goto L_0x0083;
                default: goto L_0x0081;
            }
        L_0x0081:
            goto L_0x0526
        L_0x0083:
            boolean r10 = r13.m34893a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x0526
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.bba.m35174f(r14, r10)
            com.google.android.gms.internal.ads.bab r10 = r13.m34882a(r7)
            r15.mo29757b(r9, r8, r10)
            goto L_0x0526
        L_0x0098:
            boolean r10 = r13.m34893a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x0526
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = m34909e(r14, r10)
            r15.mo29768e(r9, r10)
            goto L_0x0526
        L_0x00a9:
            boolean r10 = r13.m34893a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x0526
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = m34907d(r14, r10)
            r15.mo29770f(r9, r8)
            goto L_0x0526
        L_0x00ba:
            boolean r10 = r13.m34893a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x0526
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = m34909e(r14, r10)
            r15.mo29756b(r9, r10)
            goto L_0x0526
        L_0x00cb:
            boolean r10 = r13.m34893a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x0526
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = m34907d(r14, r10)
            r15.mo29743a(r9, r8)
            goto L_0x0526
        L_0x00dc:
            boolean r10 = r13.m34893a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x0526
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = m34907d(r14, r10)
            r15.mo29755b(r9, r8)
            goto L_0x0526
        L_0x00ed:
            boolean r10 = r13.m34893a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x0526
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = m34907d(r14, r10)
            r15.mo29767e(r9, r8)
            goto L_0x0526
        L_0x00fe:
            boolean r10 = r13.m34893a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x0526
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.bba.m35174f(r14, r10)
            com.google.android.gms.internal.ads.awo r8 = (com.google.android.gms.internal.ads.awo) r8
            r15.mo29745a(r9, r8)
            goto L_0x0526
        L_0x0111:
            boolean r10 = r13.m34893a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x0526
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.bba.m35174f(r14, r10)
            com.google.android.gms.internal.ads.bab r10 = r13.m34882a(r7)
            r15.mo29748a(r9, r8, r10)
            goto L_0x0526
        L_0x0126:
            boolean r10 = r13.m34893a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x0526
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.bba.m35174f(r14, r10)
            m34887a(r9, r8, r15)
            goto L_0x0526
        L_0x0137:
            boolean r10 = r13.m34893a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x0526
            r8 = r8 & r6
            long r10 = (long) r8
            boolean r8 = m34912f(r14, r10)
            r15.mo29753a(r9, r8)
            goto L_0x0526
        L_0x0148:
            boolean r10 = r13.m34893a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x0526
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = m34907d(r14, r10)
            r15.mo29764d(r9, r8)
            goto L_0x0526
        L_0x0159:
            boolean r10 = r13.m34893a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x0526
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = m34909e(r14, r10)
            r15.mo29765d(r9, r10)
            goto L_0x0526
        L_0x016a:
            boolean r10 = r13.m34893a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x0526
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = m34907d(r14, r10)
            r15.mo29761c(r9, r8)
            goto L_0x0526
        L_0x017b:
            boolean r10 = r13.m34893a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x0526
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = m34909e(r14, r10)
            r15.mo29762c(r9, r10)
            goto L_0x0526
        L_0x018c:
            boolean r10 = r13.m34893a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x0526
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = m34909e(r14, r10)
            r15.mo29744a(r9, r10)
            goto L_0x0526
        L_0x019d:
            boolean r10 = r13.m34893a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x0526
            r8 = r8 & r6
            long r10 = (long) r8
            float r8 = m34903c(r14, r10)
            r15.mo29742a(r9, r8)
            goto L_0x0526
        L_0x01ae:
            boolean r10 = r13.m34893a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x0526
            r8 = r8 & r6
            long r10 = (long) r8
            double r10 = m34896b((T) r14, r10)
            r15.mo29741a(r9, r10)
            goto L_0x0526
        L_0x01bf:
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.bba.m35174f(r14, r10)
            r13.m34889a(r15, r9, r8, r7)
            goto L_0x0526
        L_0x01ca:
            int[] r9 = r13.f41666c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.bba.m35174f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.bab r10 = r13.m34882a(r7)
            com.google.android.gms.internal.ads.bad.m35032b(r9, r8, r15, r10)
            goto L_0x0526
        L_0x01df:
            int[] r9 = r13.f41666c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.bba.m35174f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.bad.m35044e(r9, r8, r15, r4)
            goto L_0x0526
        L_0x01f0:
            int[] r9 = r13.f41666c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.bba.m35174f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.bad.m35059j(r9, r8, r15, r4)
            goto L_0x0526
        L_0x0201:
            int[] r9 = r13.f41666c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.bba.m35174f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.bad.m35050g(r9, r8, r15, r4)
            goto L_0x0526
        L_0x0212:
            int[] r9 = r13.f41666c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.bba.m35174f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.bad.m35061l(r9, r8, r15, r4)
            goto L_0x0526
        L_0x0223:
            int[] r9 = r13.f41666c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.bba.m35174f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.bad.m35062m(r9, r8, r15, r4)
            goto L_0x0526
        L_0x0234:
            int[] r9 = r13.f41666c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.bba.m35174f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.bad.m35056i(r9, r8, r15, r4)
            goto L_0x0526
        L_0x0245:
            int[] r9 = r13.f41666c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.bba.m35174f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.bad.m35063n(r9, r8, r15, r4)
            goto L_0x0526
        L_0x0256:
            int[] r9 = r13.f41666c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.bba.m35174f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.bad.m35060k(r9, r8, r15, r4)
            goto L_0x0526
        L_0x0267:
            int[] r9 = r13.f41666c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.bba.m35174f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.bad.m35047f(r9, r8, r15, r4)
            goto L_0x0526
        L_0x0278:
            int[] r9 = r13.f41666c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.bba.m35174f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.bad.m35053h(r9, r8, r15, r4)
            goto L_0x0526
        L_0x0289:
            int[] r9 = r13.f41666c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.bba.m35174f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.bad.m35041d(r9, r8, r15, r4)
            goto L_0x0526
        L_0x029a:
            int[] r9 = r13.f41666c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.bba.m35174f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.bad.m35037c(r9, r8, r15, r4)
            goto L_0x0526
        L_0x02ab:
            int[] r9 = r13.f41666c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.bba.m35174f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.bad.m35033b(r9, r8, r15, r4)
            goto L_0x0526
        L_0x02bc:
            int[] r9 = r13.f41666c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.bba.m35174f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.bad.m35022a(r9, r8, r15, r4)
            goto L_0x0526
        L_0x02cd:
            int[] r9 = r13.f41666c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.bba.m35174f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.bad.m35044e(r9, r8, r15, r5)
            goto L_0x0526
        L_0x02de:
            int[] r9 = r13.f41666c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.bba.m35174f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.bad.m35059j(r9, r8, r15, r5)
            goto L_0x0526
        L_0x02ef:
            int[] r9 = r13.f41666c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.bba.m35174f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.bad.m35050g(r9, r8, r15, r5)
            goto L_0x0526
        L_0x0300:
            int[] r9 = r13.f41666c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.bba.m35174f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.bad.m35061l(r9, r8, r15, r5)
            goto L_0x0526
        L_0x0311:
            int[] r9 = r13.f41666c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.bba.m35174f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.bad.m35062m(r9, r8, r15, r5)
            goto L_0x0526
        L_0x0322:
            int[] r9 = r13.f41666c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.bba.m35174f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.bad.m35056i(r9, r8, r15, r5)
            goto L_0x0526
        L_0x0333:
            int[] r9 = r13.f41666c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.bba.m35174f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.bad.m35031b(r9, r8, r15)
            goto L_0x0526
        L_0x0344:
            int[] r9 = r13.f41666c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.bba.m35174f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.bab r10 = r13.m34882a(r7)
            com.google.android.gms.internal.ads.bad.m35021a(r9, r8, r15, r10)
            goto L_0x0526
        L_0x0359:
            int[] r9 = r13.f41666c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.bba.m35174f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.bad.m35020a(r9, r8, r15)
            goto L_0x0526
        L_0x036a:
            int[] r9 = r13.f41666c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.bba.m35174f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.bad.m35063n(r9, r8, r15, r5)
            goto L_0x0526
        L_0x037b:
            int[] r9 = r13.f41666c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.bba.m35174f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.bad.m35060k(r9, r8, r15, r5)
            goto L_0x0526
        L_0x038c:
            int[] r9 = r13.f41666c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.bba.m35174f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.bad.m35047f(r9, r8, r15, r5)
            goto L_0x0526
        L_0x039d:
            int[] r9 = r13.f41666c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.bba.m35174f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.bad.m35053h(r9, r8, r15, r5)
            goto L_0x0526
        L_0x03ae:
            int[] r9 = r13.f41666c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.bba.m35174f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.bad.m35041d(r9, r8, r15, r5)
            goto L_0x0526
        L_0x03bf:
            int[] r9 = r13.f41666c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.bba.m35174f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.bad.m35037c(r9, r8, r15, r5)
            goto L_0x0526
        L_0x03d0:
            int[] r9 = r13.f41666c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.bba.m35174f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.bad.m35033b(r9, r8, r15, r5)
            goto L_0x0526
        L_0x03e1:
            int[] r9 = r13.f41666c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.bba.m35174f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.bad.m35022a(r9, r8, r15, r5)
            goto L_0x0526
        L_0x03f2:
            boolean r10 = r13.m34892a((T) r14, r7)
            if (r10 == 0) goto L_0x0526
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.bba.m35174f(r14, r10)
            com.google.android.gms.internal.ads.bab r10 = r13.m34882a(r7)
            r15.mo29757b(r9, r8, r10)
            goto L_0x0526
        L_0x0407:
            boolean r10 = r13.m34892a((T) r14, r7)
            if (r10 == 0) goto L_0x0526
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.ads.bba.m35159b(r14, r10)
            r15.mo29768e(r9, r10)
            goto L_0x0526
        L_0x0418:
            boolean r10 = r13.m34892a((T) r14, r7)
            if (r10 == 0) goto L_0x0526
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.ads.bba.m35144a(r14, r10)
            r15.mo29770f(r9, r8)
            goto L_0x0526
        L_0x0429:
            boolean r10 = r13.m34892a((T) r14, r7)
            if (r10 == 0) goto L_0x0526
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.ads.bba.m35159b(r14, r10)
            r15.mo29756b(r9, r10)
            goto L_0x0526
        L_0x043a:
            boolean r10 = r13.m34892a((T) r14, r7)
            if (r10 == 0) goto L_0x0526
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.ads.bba.m35144a(r14, r10)
            r15.mo29743a(r9, r8)
            goto L_0x0526
        L_0x044b:
            boolean r10 = r13.m34892a((T) r14, r7)
            if (r10 == 0) goto L_0x0526
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.ads.bba.m35144a(r14, r10)
            r15.mo29755b(r9, r8)
            goto L_0x0526
        L_0x045c:
            boolean r10 = r13.m34892a((T) r14, r7)
            if (r10 == 0) goto L_0x0526
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.ads.bba.m35144a(r14, r10)
            r15.mo29767e(r9, r8)
            goto L_0x0526
        L_0x046d:
            boolean r10 = r13.m34892a((T) r14, r7)
            if (r10 == 0) goto L_0x0526
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.bba.m35174f(r14, r10)
            com.google.android.gms.internal.ads.awo r8 = (com.google.android.gms.internal.ads.awo) r8
            r15.mo29745a(r9, r8)
            goto L_0x0526
        L_0x0480:
            boolean r10 = r13.m34892a((T) r14, r7)
            if (r10 == 0) goto L_0x0526
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.bba.m35174f(r14, r10)
            com.google.android.gms.internal.ads.bab r10 = r13.m34882a(r7)
            r15.mo29748a(r9, r8, r10)
            goto L_0x0526
        L_0x0495:
            boolean r10 = r13.m34892a((T) r14, r7)
            if (r10 == 0) goto L_0x0526
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.bba.m35174f(r14, r10)
            m34887a(r9, r8, r15)
            goto L_0x0526
        L_0x04a6:
            boolean r10 = r13.m34892a((T) r14, r7)
            if (r10 == 0) goto L_0x0526
            r8 = r8 & r6
            long r10 = (long) r8
            boolean r8 = com.google.android.gms.internal.ads.bba.m35167c(r14, r10)
            r15.mo29753a(r9, r8)
            goto L_0x0526
        L_0x04b7:
            boolean r10 = r13.m34892a((T) r14, r7)
            if (r10 == 0) goto L_0x0526
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.ads.bba.m35144a(r14, r10)
            r15.mo29764d(r9, r8)
            goto L_0x0526
        L_0x04c7:
            boolean r10 = r13.m34892a((T) r14, r7)
            if (r10 == 0) goto L_0x0526
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.ads.bba.m35159b(r14, r10)
            r15.mo29765d(r9, r10)
            goto L_0x0526
        L_0x04d7:
            boolean r10 = r13.m34892a((T) r14, r7)
            if (r10 == 0) goto L_0x0526
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.ads.bba.m35144a(r14, r10)
            r15.mo29761c(r9, r8)
            goto L_0x0526
        L_0x04e7:
            boolean r10 = r13.m34892a((T) r14, r7)
            if (r10 == 0) goto L_0x0526
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.ads.bba.m35159b(r14, r10)
            r15.mo29762c(r9, r10)
            goto L_0x0526
        L_0x04f7:
            boolean r10 = r13.m34892a((T) r14, r7)
            if (r10 == 0) goto L_0x0526
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.ads.bba.m35159b(r14, r10)
            r15.mo29744a(r9, r10)
            goto L_0x0526
        L_0x0507:
            boolean r10 = r13.m34892a((T) r14, r7)
            if (r10 == 0) goto L_0x0526
            r8 = r8 & r6
            long r10 = (long) r8
            float r8 = com.google.android.gms.internal.ads.bba.m35168d(r14, r10)
            r15.mo29742a(r9, r8)
            goto L_0x0526
        L_0x0517:
            boolean r10 = r13.m34892a((T) r14, r7)
            if (r10 == 0) goto L_0x0526
            r8 = r8 & r6
            long r10 = (long) r8
            double r10 = com.google.android.gms.internal.ads.bba.m35172e(r14, r10)
            r15.mo29741a(r9, r10)
        L_0x0526:
            int r7 = r7 + -3
            goto L_0x0052
        L_0x052a:
            if (r1 == 0) goto L_0x0541
            com.google.android.gms.internal.ads.axn<?> r14 = r13.f41681r
            r14.mo29793a(r15, r1)
            boolean r14 = r0.hasNext()
            if (r14 == 0) goto L_0x053f
            java.lang.Object r14 = r0.next()
            java.util.Map$Entry r14 = (java.util.Map.Entry) r14
            r1 = r14
            goto L_0x052a
        L_0x053f:
            r1 = r3
            goto L_0x052a
        L_0x0541:
            return
        L_0x0542:
            boolean r0 = r13.f41673j
            if (r0 == 0) goto L_0x0a5d
            boolean r0 = r13.f41671h
            if (r0 == 0) goto L_0x0561
            com.google.android.gms.internal.ads.axn<?> r0 = r13.f41681r
            com.google.android.gms.internal.ads.axq r0 = r0.mo29788a(r14)
            boolean r1 = r0.mo29798a()
            if (r1 != 0) goto L_0x0561
            java.util.Iterator r0 = r0.mo29800c()
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x0563
        L_0x0561:
            r0 = r3
            r1 = r0
        L_0x0563:
            int[] r7 = r13.f41666c
            int r7 = r7.length
            r8 = r1
            r1 = 0
        L_0x0568:
            if (r1 >= r7) goto L_0x0a40
            int r9 = r13.m34906d(r1)
            int[] r10 = r13.f41666c
            r10 = r10[r1]
        L_0x0572:
            if (r8 == 0) goto L_0x0590
            com.google.android.gms.internal.ads.axn<?> r11 = r13.f41681r
            int r11 = r11.mo29787a(r8)
            if (r11 > r10) goto L_0x0590
            com.google.android.gms.internal.ads.axn<?> r11 = r13.f41681r
            r11.mo29793a(r15, r8)
            boolean r8 = r0.hasNext()
            if (r8 == 0) goto L_0x058e
            java.lang.Object r8 = r0.next()
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            goto L_0x0572
        L_0x058e:
            r8 = r3
            goto L_0x0572
        L_0x0590:
            r11 = r9 & r2
            int r11 = r11 >>> 20
            switch(r11) {
                case 0: goto L_0x0a2d;
                case 1: goto L_0x0a1d;
                case 2: goto L_0x0a0d;
                case 3: goto L_0x09fd;
                case 4: goto L_0x09ed;
                case 5: goto L_0x09dd;
                case 6: goto L_0x09cd;
                case 7: goto L_0x09bc;
                case 8: goto L_0x09ab;
                case 9: goto L_0x0996;
                case 10: goto L_0x0983;
                case 11: goto L_0x0972;
                case 12: goto L_0x0961;
                case 13: goto L_0x0950;
                case 14: goto L_0x093f;
                case 15: goto L_0x092e;
                case 16: goto L_0x091d;
                case 17: goto L_0x0908;
                case 18: goto L_0x08f7;
                case 19: goto L_0x08e6;
                case 20: goto L_0x08d5;
                case 21: goto L_0x08c4;
                case 22: goto L_0x08b3;
                case 23: goto L_0x08a2;
                case 24: goto L_0x0891;
                case 25: goto L_0x0880;
                case 26: goto L_0x086f;
                case 27: goto L_0x085a;
                case 28: goto L_0x0849;
                case 29: goto L_0x0838;
                case 30: goto L_0x0827;
                case 31: goto L_0x0816;
                case 32: goto L_0x0805;
                case 33: goto L_0x07f4;
                case 34: goto L_0x07e3;
                case 35: goto L_0x07d2;
                case 36: goto L_0x07c1;
                case 37: goto L_0x07b0;
                case 38: goto L_0x079f;
                case 39: goto L_0x078e;
                case 40: goto L_0x077d;
                case 41: goto L_0x076c;
                case 42: goto L_0x075b;
                case 43: goto L_0x074a;
                case 44: goto L_0x0739;
                case 45: goto L_0x0728;
                case 46: goto L_0x0717;
                case 47: goto L_0x0706;
                case 48: goto L_0x06f5;
                case 49: goto L_0x06e0;
                case 50: goto L_0x06d5;
                case 51: goto L_0x06c4;
                case 52: goto L_0x06b3;
                case 53: goto L_0x06a2;
                case 54: goto L_0x0691;
                case 55: goto L_0x0680;
                case 56: goto L_0x066f;
                case 57: goto L_0x065e;
                case 58: goto L_0x064d;
                case 59: goto L_0x063c;
                case 60: goto L_0x0627;
                case 61: goto L_0x0614;
                case 62: goto L_0x0603;
                case 63: goto L_0x05f2;
                case 64: goto L_0x05e1;
                case 65: goto L_0x05d0;
                case 66: goto L_0x05bf;
                case 67: goto L_0x05ae;
                case 68: goto L_0x0599;
                default: goto L_0x0597;
            }
        L_0x0597:
            goto L_0x0a3c
        L_0x0599:
            boolean r11 = r13.m34893a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a3c
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.bba.m35174f(r14, r11)
            com.google.android.gms.internal.ads.bab r11 = r13.m34882a(r1)
            r15.mo29757b(r10, r9, r11)
            goto L_0x0a3c
        L_0x05ae:
            boolean r11 = r13.m34893a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a3c
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = m34909e(r14, r11)
            r15.mo29768e(r10, r11)
            goto L_0x0a3c
        L_0x05bf:
            boolean r11 = r13.m34893a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a3c
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = m34907d(r14, r11)
            r15.mo29770f(r10, r9)
            goto L_0x0a3c
        L_0x05d0:
            boolean r11 = r13.m34893a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a3c
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = m34909e(r14, r11)
            r15.mo29756b(r10, r11)
            goto L_0x0a3c
        L_0x05e1:
            boolean r11 = r13.m34893a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a3c
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = m34907d(r14, r11)
            r15.mo29743a(r10, r9)
            goto L_0x0a3c
        L_0x05f2:
            boolean r11 = r13.m34893a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a3c
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = m34907d(r14, r11)
            r15.mo29755b(r10, r9)
            goto L_0x0a3c
        L_0x0603:
            boolean r11 = r13.m34893a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a3c
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = m34907d(r14, r11)
            r15.mo29767e(r10, r9)
            goto L_0x0a3c
        L_0x0614:
            boolean r11 = r13.m34893a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a3c
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.bba.m35174f(r14, r11)
            com.google.android.gms.internal.ads.awo r9 = (com.google.android.gms.internal.ads.awo) r9
            r15.mo29745a(r10, r9)
            goto L_0x0a3c
        L_0x0627:
            boolean r11 = r13.m34893a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a3c
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.bba.m35174f(r14, r11)
            com.google.android.gms.internal.ads.bab r11 = r13.m34882a(r1)
            r15.mo29748a(r10, r9, r11)
            goto L_0x0a3c
        L_0x063c:
            boolean r11 = r13.m34893a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a3c
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.bba.m35174f(r14, r11)
            m34887a(r10, r9, r15)
            goto L_0x0a3c
        L_0x064d:
            boolean r11 = r13.m34893a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a3c
            r9 = r9 & r6
            long r11 = (long) r9
            boolean r9 = m34912f(r14, r11)
            r15.mo29753a(r10, r9)
            goto L_0x0a3c
        L_0x065e:
            boolean r11 = r13.m34893a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a3c
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = m34907d(r14, r11)
            r15.mo29764d(r10, r9)
            goto L_0x0a3c
        L_0x066f:
            boolean r11 = r13.m34893a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a3c
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = m34909e(r14, r11)
            r15.mo29765d(r10, r11)
            goto L_0x0a3c
        L_0x0680:
            boolean r11 = r13.m34893a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a3c
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = m34907d(r14, r11)
            r15.mo29761c(r10, r9)
            goto L_0x0a3c
        L_0x0691:
            boolean r11 = r13.m34893a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a3c
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = m34909e(r14, r11)
            r15.mo29762c(r10, r11)
            goto L_0x0a3c
        L_0x06a2:
            boolean r11 = r13.m34893a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a3c
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = m34909e(r14, r11)
            r15.mo29744a(r10, r11)
            goto L_0x0a3c
        L_0x06b3:
            boolean r11 = r13.m34893a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a3c
            r9 = r9 & r6
            long r11 = (long) r9
            float r9 = m34903c(r14, r11)
            r15.mo29742a(r10, r9)
            goto L_0x0a3c
        L_0x06c4:
            boolean r11 = r13.m34893a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a3c
            r9 = r9 & r6
            long r11 = (long) r9
            double r11 = m34896b((T) r14, r11)
            r15.mo29741a(r10, r11)
            goto L_0x0a3c
        L_0x06d5:
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.bba.m35174f(r14, r11)
            r13.m34889a(r15, r10, r9, r1)
            goto L_0x0a3c
        L_0x06e0:
            int[] r10 = r13.f41666c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.bba.m35174f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.bab r11 = r13.m34882a(r1)
            com.google.android.gms.internal.ads.bad.m35032b(r10, r9, r15, r11)
            goto L_0x0a3c
        L_0x06f5:
            int[] r10 = r13.f41666c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.bba.m35174f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.bad.m35044e(r10, r9, r15, r4)
            goto L_0x0a3c
        L_0x0706:
            int[] r10 = r13.f41666c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.bba.m35174f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.bad.m35059j(r10, r9, r15, r4)
            goto L_0x0a3c
        L_0x0717:
            int[] r10 = r13.f41666c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.bba.m35174f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.bad.m35050g(r10, r9, r15, r4)
            goto L_0x0a3c
        L_0x0728:
            int[] r10 = r13.f41666c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.bba.m35174f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.bad.m35061l(r10, r9, r15, r4)
            goto L_0x0a3c
        L_0x0739:
            int[] r10 = r13.f41666c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.bba.m35174f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.bad.m35062m(r10, r9, r15, r4)
            goto L_0x0a3c
        L_0x074a:
            int[] r10 = r13.f41666c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.bba.m35174f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.bad.m35056i(r10, r9, r15, r4)
            goto L_0x0a3c
        L_0x075b:
            int[] r10 = r13.f41666c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.bba.m35174f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.bad.m35063n(r10, r9, r15, r4)
            goto L_0x0a3c
        L_0x076c:
            int[] r10 = r13.f41666c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.bba.m35174f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.bad.m35060k(r10, r9, r15, r4)
            goto L_0x0a3c
        L_0x077d:
            int[] r10 = r13.f41666c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.bba.m35174f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.bad.m35047f(r10, r9, r15, r4)
            goto L_0x0a3c
        L_0x078e:
            int[] r10 = r13.f41666c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.bba.m35174f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.bad.m35053h(r10, r9, r15, r4)
            goto L_0x0a3c
        L_0x079f:
            int[] r10 = r13.f41666c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.bba.m35174f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.bad.m35041d(r10, r9, r15, r4)
            goto L_0x0a3c
        L_0x07b0:
            int[] r10 = r13.f41666c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.bba.m35174f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.bad.m35037c(r10, r9, r15, r4)
            goto L_0x0a3c
        L_0x07c1:
            int[] r10 = r13.f41666c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.bba.m35174f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.bad.m35033b(r10, r9, r15, r4)
            goto L_0x0a3c
        L_0x07d2:
            int[] r10 = r13.f41666c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.bba.m35174f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.bad.m35022a(r10, r9, r15, r4)
            goto L_0x0a3c
        L_0x07e3:
            int[] r10 = r13.f41666c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.bba.m35174f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.bad.m35044e(r10, r9, r15, r5)
            goto L_0x0a3c
        L_0x07f4:
            int[] r10 = r13.f41666c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.bba.m35174f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.bad.m35059j(r10, r9, r15, r5)
            goto L_0x0a3c
        L_0x0805:
            int[] r10 = r13.f41666c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.bba.m35174f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.bad.m35050g(r10, r9, r15, r5)
            goto L_0x0a3c
        L_0x0816:
            int[] r10 = r13.f41666c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.bba.m35174f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.bad.m35061l(r10, r9, r15, r5)
            goto L_0x0a3c
        L_0x0827:
            int[] r10 = r13.f41666c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.bba.m35174f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.bad.m35062m(r10, r9, r15, r5)
            goto L_0x0a3c
        L_0x0838:
            int[] r10 = r13.f41666c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.bba.m35174f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.bad.m35056i(r10, r9, r15, r5)
            goto L_0x0a3c
        L_0x0849:
            int[] r10 = r13.f41666c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.bba.m35174f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.bad.m35031b(r10, r9, r15)
            goto L_0x0a3c
        L_0x085a:
            int[] r10 = r13.f41666c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.bba.m35174f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.bab r11 = r13.m34882a(r1)
            com.google.android.gms.internal.ads.bad.m35021a(r10, r9, r15, r11)
            goto L_0x0a3c
        L_0x086f:
            int[] r10 = r13.f41666c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.bba.m35174f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.bad.m35020a(r10, r9, r15)
            goto L_0x0a3c
        L_0x0880:
            int[] r10 = r13.f41666c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.bba.m35174f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.bad.m35063n(r10, r9, r15, r5)
            goto L_0x0a3c
        L_0x0891:
            int[] r10 = r13.f41666c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.bba.m35174f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.bad.m35060k(r10, r9, r15, r5)
            goto L_0x0a3c
        L_0x08a2:
            int[] r10 = r13.f41666c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.bba.m35174f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.bad.m35047f(r10, r9, r15, r5)
            goto L_0x0a3c
        L_0x08b3:
            int[] r10 = r13.f41666c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.bba.m35174f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.bad.m35053h(r10, r9, r15, r5)
            goto L_0x0a3c
        L_0x08c4:
            int[] r10 = r13.f41666c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.bba.m35174f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.bad.m35041d(r10, r9, r15, r5)
            goto L_0x0a3c
        L_0x08d5:
            int[] r10 = r13.f41666c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.bba.m35174f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.bad.m35037c(r10, r9, r15, r5)
            goto L_0x0a3c
        L_0x08e6:
            int[] r10 = r13.f41666c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.bba.m35174f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.bad.m35033b(r10, r9, r15, r5)
            goto L_0x0a3c
        L_0x08f7:
            int[] r10 = r13.f41666c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.bba.m35174f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.bad.m35022a(r10, r9, r15, r5)
            goto L_0x0a3c
        L_0x0908:
            boolean r11 = r13.m34892a((T) r14, r1)
            if (r11 == 0) goto L_0x0a3c
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.bba.m35174f(r14, r11)
            com.google.android.gms.internal.ads.bab r11 = r13.m34882a(r1)
            r15.mo29757b(r10, r9, r11)
            goto L_0x0a3c
        L_0x091d:
            boolean r11 = r13.m34892a((T) r14, r1)
            if (r11 == 0) goto L_0x0a3c
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = com.google.android.gms.internal.ads.bba.m35159b(r14, r11)
            r15.mo29768e(r10, r11)
            goto L_0x0a3c
        L_0x092e:
            boolean r11 = r13.m34892a((T) r14, r1)
            if (r11 == 0) goto L_0x0a3c
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.ads.bba.m35144a(r14, r11)
            r15.mo29770f(r10, r9)
            goto L_0x0a3c
        L_0x093f:
            boolean r11 = r13.m34892a((T) r14, r1)
            if (r11 == 0) goto L_0x0a3c
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = com.google.android.gms.internal.ads.bba.m35159b(r14, r11)
            r15.mo29756b(r10, r11)
            goto L_0x0a3c
        L_0x0950:
            boolean r11 = r13.m34892a((T) r14, r1)
            if (r11 == 0) goto L_0x0a3c
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.ads.bba.m35144a(r14, r11)
            r15.mo29743a(r10, r9)
            goto L_0x0a3c
        L_0x0961:
            boolean r11 = r13.m34892a((T) r14, r1)
            if (r11 == 0) goto L_0x0a3c
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.ads.bba.m35144a(r14, r11)
            r15.mo29755b(r10, r9)
            goto L_0x0a3c
        L_0x0972:
            boolean r11 = r13.m34892a((T) r14, r1)
            if (r11 == 0) goto L_0x0a3c
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.ads.bba.m35144a(r14, r11)
            r15.mo29767e(r10, r9)
            goto L_0x0a3c
        L_0x0983:
            boolean r11 = r13.m34892a((T) r14, r1)
            if (r11 == 0) goto L_0x0a3c
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.bba.m35174f(r14, r11)
            com.google.android.gms.internal.ads.awo r9 = (com.google.android.gms.internal.ads.awo) r9
            r15.mo29745a(r10, r9)
            goto L_0x0a3c
        L_0x0996:
            boolean r11 = r13.m34892a((T) r14, r1)
            if (r11 == 0) goto L_0x0a3c
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.bba.m35174f(r14, r11)
            com.google.android.gms.internal.ads.bab r11 = r13.m34882a(r1)
            r15.mo29748a(r10, r9, r11)
            goto L_0x0a3c
        L_0x09ab:
            boolean r11 = r13.m34892a((T) r14, r1)
            if (r11 == 0) goto L_0x0a3c
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.bba.m35174f(r14, r11)
            m34887a(r10, r9, r15)
            goto L_0x0a3c
        L_0x09bc:
            boolean r11 = r13.m34892a((T) r14, r1)
            if (r11 == 0) goto L_0x0a3c
            r9 = r9 & r6
            long r11 = (long) r9
            boolean r9 = com.google.android.gms.internal.ads.bba.m35167c(r14, r11)
            r15.mo29753a(r10, r9)
            goto L_0x0a3c
        L_0x09cd:
            boolean r11 = r13.m34892a((T) r14, r1)
            if (r11 == 0) goto L_0x0a3c
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.ads.bba.m35144a(r14, r11)
            r15.mo29764d(r10, r9)
            goto L_0x0a3c
        L_0x09dd:
            boolean r11 = r13.m34892a((T) r14, r1)
            if (r11 == 0) goto L_0x0a3c
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = com.google.android.gms.internal.ads.bba.m35159b(r14, r11)
            r15.mo29765d(r10, r11)
            goto L_0x0a3c
        L_0x09ed:
            boolean r11 = r13.m34892a((T) r14, r1)
            if (r11 == 0) goto L_0x0a3c
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.ads.bba.m35144a(r14, r11)
            r15.mo29761c(r10, r9)
            goto L_0x0a3c
        L_0x09fd:
            boolean r11 = r13.m34892a((T) r14, r1)
            if (r11 == 0) goto L_0x0a3c
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = com.google.android.gms.internal.ads.bba.m35159b(r14, r11)
            r15.mo29762c(r10, r11)
            goto L_0x0a3c
        L_0x0a0d:
            boolean r11 = r13.m34892a((T) r14, r1)
            if (r11 == 0) goto L_0x0a3c
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = com.google.android.gms.internal.ads.bba.m35159b(r14, r11)
            r15.mo29744a(r10, r11)
            goto L_0x0a3c
        L_0x0a1d:
            boolean r11 = r13.m34892a((T) r14, r1)
            if (r11 == 0) goto L_0x0a3c
            r9 = r9 & r6
            long r11 = (long) r9
            float r9 = com.google.android.gms.internal.ads.bba.m35168d(r14, r11)
            r15.mo29742a(r10, r9)
            goto L_0x0a3c
        L_0x0a2d:
            boolean r11 = r13.m34892a((T) r14, r1)
            if (r11 == 0) goto L_0x0a3c
            r9 = r9 & r6
            long r11 = (long) r9
            double r11 = com.google.android.gms.internal.ads.bba.m35172e(r14, r11)
            r15.mo29741a(r10, r11)
        L_0x0a3c:
            int r1 = r1 + 3
            goto L_0x0568
        L_0x0a40:
            if (r8 == 0) goto L_0x0a57
            com.google.android.gms.internal.ads.axn<?> r1 = r13.f41681r
            r1.mo29793a(r15, r8)
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0a55
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            r8 = r1
            goto L_0x0a40
        L_0x0a55:
            r8 = r3
            goto L_0x0a40
        L_0x0a57:
            com.google.android.gms.internal.ads.bau<?, ?> r0 = r13.f41680q
            m34888a(r0, (T) r14, r15)
            return
        L_0x0a5d:
            r13.m34901b((T) r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.azo.mo29896a(java.lang.Object, com.google.android.gms.internal.ads.bbq):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:172:0x0527  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002e  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m34901b(T r20, com.google.android.gms.internal.ads.bbq r21) throws java.io.IOException {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            boolean r3 = r0.f41671h
            if (r3 == 0) goto L_0x0021
            com.google.android.gms.internal.ads.axn<?> r3 = r0.f41681r
            com.google.android.gms.internal.ads.axq r3 = r3.mo29788a(r1)
            boolean r5 = r3.mo29798a()
            if (r5 != 0) goto L_0x0021
            java.util.Iterator r3 = r3.mo29800c()
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x0023
        L_0x0021:
            r3 = 0
            r5 = 0
        L_0x0023:
            r6 = -1
            int[] r7 = r0.f41666c
            int r7 = r7.length
            sun.misc.Unsafe r8 = f41665b
            r10 = r5
            r5 = 0
            r11 = 0
        L_0x002c:
            if (r5 >= r7) goto L_0x0525
            int r12 = r0.m34906d(r5)
            int[] r13 = r0.f41666c
            r13 = r13[r5]
            r14 = 267386880(0xff00000, float:2.3665827E-29)
            r14 = r14 & r12
            int r14 = r14 >>> 20
            boolean r15 = r0.f41673j
            r16 = 1048575(0xfffff, float:1.469367E-39)
            if (r15 != 0) goto L_0x0061
            r15 = 17
            if (r14 > r15) goto L_0x0061
            int[] r15 = r0.f41666c
            int r17 = r5 + 2
            r15 = r15[r17]
            r9 = r15 & r16
            if (r9 == r6) goto L_0x0059
            r18 = r5
            long r4 = (long) r9
            int r11 = r8.getInt(r1, r4)
            r6 = r9
            goto L_0x005b
        L_0x0059:
            r18 = r5
        L_0x005b:
            int r4 = r15 >>> 20
            r5 = 1
            int r9 = r5 << r4
            goto L_0x0064
        L_0x0061:
            r18 = r5
            r9 = 0
        L_0x0064:
            if (r10 == 0) goto L_0x0083
            com.google.android.gms.internal.ads.axn<?> r4 = r0.f41681r
            int r4 = r4.mo29787a(r10)
            if (r4 > r13) goto L_0x0083
            com.google.android.gms.internal.ads.axn<?> r4 = r0.f41681r
            r4.mo29793a(r2, r10)
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0081
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            r10 = r4
            goto L_0x0064
        L_0x0081:
            r10 = 0
            goto L_0x0064
        L_0x0083:
            r4 = r12 & r16
            long r4 = (long) r4
            switch(r14) {
                case 0: goto L_0x0514;
                case 1: goto L_0x0506;
                case 2: goto L_0x04f8;
                case 3: goto L_0x04ea;
                case 4: goto L_0x04dc;
                case 5: goto L_0x04ce;
                case 6: goto L_0x04c0;
                case 7: goto L_0x04b2;
                case 8: goto L_0x04a3;
                case 9: goto L_0x0490;
                case 10: goto L_0x047f;
                case 11: goto L_0x0470;
                case 12: goto L_0x0461;
                case 13: goto L_0x0452;
                case 14: goto L_0x0443;
                case 15: goto L_0x0434;
                case 16: goto L_0x0425;
                case 17: goto L_0x0412;
                case 18: goto L_0x0400;
                case 19: goto L_0x03ee;
                case 20: goto L_0x03dc;
                case 21: goto L_0x03ca;
                case 22: goto L_0x03b8;
                case 23: goto L_0x03a6;
                case 24: goto L_0x0394;
                case 25: goto L_0x0382;
                case 26: goto L_0x0371;
                case 27: goto L_0x035c;
                case 28: goto L_0x034b;
                case 29: goto L_0x0339;
                case 30: goto L_0x0327;
                case 31: goto L_0x0315;
                case 32: goto L_0x0303;
                case 33: goto L_0x02f1;
                case 34: goto L_0x02df;
                case 35: goto L_0x02cd;
                case 36: goto L_0x02bb;
                case 37: goto L_0x02a9;
                case 38: goto L_0x0297;
                case 39: goto L_0x0285;
                case 40: goto L_0x0273;
                case 41: goto L_0x0261;
                case 42: goto L_0x024f;
                case 43: goto L_0x023d;
                case 44: goto L_0x022b;
                case 45: goto L_0x0219;
                case 46: goto L_0x0207;
                case 47: goto L_0x01f5;
                case 48: goto L_0x01e3;
                case 49: goto L_0x01ce;
                case 50: goto L_0x01c3;
                case 51: goto L_0x01b2;
                case 52: goto L_0x01a1;
                case 53: goto L_0x0190;
                case 54: goto L_0x017f;
                case 55: goto L_0x016e;
                case 56: goto L_0x015d;
                case 57: goto L_0x014c;
                case 58: goto L_0x013b;
                case 59: goto L_0x012a;
                case 60: goto L_0x0115;
                case 61: goto L_0x0102;
                case 62: goto L_0x00f2;
                case 63: goto L_0x00e2;
                case 64: goto L_0x00d2;
                case 65: goto L_0x00c2;
                case 66: goto L_0x00b2;
                case 67: goto L_0x00a2;
                case 68: goto L_0x008e;
                default: goto L_0x0089;
            }
        L_0x0089:
            r12 = r18
        L_0x008b:
            r14 = 0
            goto L_0x0521
        L_0x008e:
            r12 = r18
            boolean r9 = r0.m34893a((T) r1, r13, r12)
            if (r9 == 0) goto L_0x008b
            java.lang.Object r4 = r8.getObject(r1, r4)
            com.google.android.gms.internal.ads.bab r5 = r0.m34882a(r12)
            r2.mo29757b(r13, r4, r5)
            goto L_0x008b
        L_0x00a2:
            r12 = r18
            boolean r9 = r0.m34893a((T) r1, r13, r12)
            if (r9 == 0) goto L_0x008b
            long r4 = m34909e(r1, r4)
            r2.mo29768e(r13, r4)
            goto L_0x008b
        L_0x00b2:
            r12 = r18
            boolean r9 = r0.m34893a((T) r1, r13, r12)
            if (r9 == 0) goto L_0x008b
            int r4 = m34907d(r1, r4)
            r2.mo29770f(r13, r4)
            goto L_0x008b
        L_0x00c2:
            r12 = r18
            boolean r9 = r0.m34893a((T) r1, r13, r12)
            if (r9 == 0) goto L_0x008b
            long r4 = m34909e(r1, r4)
            r2.mo29756b(r13, r4)
            goto L_0x008b
        L_0x00d2:
            r12 = r18
            boolean r9 = r0.m34893a((T) r1, r13, r12)
            if (r9 == 0) goto L_0x008b
            int r4 = m34907d(r1, r4)
            r2.mo29743a(r13, r4)
            goto L_0x008b
        L_0x00e2:
            r12 = r18
            boolean r9 = r0.m34893a((T) r1, r13, r12)
            if (r9 == 0) goto L_0x008b
            int r4 = m34907d(r1, r4)
            r2.mo29755b(r13, r4)
            goto L_0x008b
        L_0x00f2:
            r12 = r18
            boolean r9 = r0.m34893a((T) r1, r13, r12)
            if (r9 == 0) goto L_0x008b
            int r4 = m34907d(r1, r4)
            r2.mo29767e(r13, r4)
            goto L_0x008b
        L_0x0102:
            r12 = r18
            boolean r9 = r0.m34893a((T) r1, r13, r12)
            if (r9 == 0) goto L_0x008b
            java.lang.Object r4 = r8.getObject(r1, r4)
            com.google.android.gms.internal.ads.awo r4 = (com.google.android.gms.internal.ads.awo) r4
            r2.mo29745a(r13, r4)
            goto L_0x008b
        L_0x0115:
            r12 = r18
            boolean r9 = r0.m34893a((T) r1, r13, r12)
            if (r9 == 0) goto L_0x008b
            java.lang.Object r4 = r8.getObject(r1, r4)
            com.google.android.gms.internal.ads.bab r5 = r0.m34882a(r12)
            r2.mo29748a(r13, r4, r5)
            goto L_0x008b
        L_0x012a:
            r12 = r18
            boolean r9 = r0.m34893a((T) r1, r13, r12)
            if (r9 == 0) goto L_0x008b
            java.lang.Object r4 = r8.getObject(r1, r4)
            m34887a(r13, r4, r2)
            goto L_0x008b
        L_0x013b:
            r12 = r18
            boolean r9 = r0.m34893a((T) r1, r13, r12)
            if (r9 == 0) goto L_0x008b
            boolean r4 = m34912f(r1, r4)
            r2.mo29753a(r13, r4)
            goto L_0x008b
        L_0x014c:
            r12 = r18
            boolean r9 = r0.m34893a((T) r1, r13, r12)
            if (r9 == 0) goto L_0x008b
            int r4 = m34907d(r1, r4)
            r2.mo29764d(r13, r4)
            goto L_0x008b
        L_0x015d:
            r12 = r18
            boolean r9 = r0.m34893a((T) r1, r13, r12)
            if (r9 == 0) goto L_0x008b
            long r4 = m34909e(r1, r4)
            r2.mo29765d(r13, r4)
            goto L_0x008b
        L_0x016e:
            r12 = r18
            boolean r9 = r0.m34893a((T) r1, r13, r12)
            if (r9 == 0) goto L_0x008b
            int r4 = m34907d(r1, r4)
            r2.mo29761c(r13, r4)
            goto L_0x008b
        L_0x017f:
            r12 = r18
            boolean r9 = r0.m34893a((T) r1, r13, r12)
            if (r9 == 0) goto L_0x008b
            long r4 = m34909e(r1, r4)
            r2.mo29762c(r13, r4)
            goto L_0x008b
        L_0x0190:
            r12 = r18
            boolean r9 = r0.m34893a((T) r1, r13, r12)
            if (r9 == 0) goto L_0x008b
            long r4 = m34909e(r1, r4)
            r2.mo29744a(r13, r4)
            goto L_0x008b
        L_0x01a1:
            r12 = r18
            boolean r9 = r0.m34893a((T) r1, r13, r12)
            if (r9 == 0) goto L_0x008b
            float r4 = m34903c(r1, r4)
            r2.mo29742a(r13, r4)
            goto L_0x008b
        L_0x01b2:
            r12 = r18
            boolean r9 = r0.m34893a((T) r1, r13, r12)
            if (r9 == 0) goto L_0x008b
            double r4 = m34896b((T) r1, r4)
            r2.mo29741a(r13, r4)
            goto L_0x008b
        L_0x01c3:
            r12 = r18
            java.lang.Object r4 = r8.getObject(r1, r4)
            r0.m34889a(r2, r13, r4, r12)
            goto L_0x008b
        L_0x01ce:
            r12 = r18
            int[] r9 = r0.f41666c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.bab r5 = r0.m34882a(r12)
            com.google.android.gms.internal.ads.bad.m35032b(r9, r4, r2, r5)
            goto L_0x008b
        L_0x01e3:
            r12 = r18
            int[] r9 = r0.f41666c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            r13 = 1
            com.google.android.gms.internal.ads.bad.m35044e(r9, r4, r2, r13)
            goto L_0x008b
        L_0x01f5:
            r12 = r18
            r13 = 1
            int[] r9 = r0.f41666c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.bad.m35059j(r9, r4, r2, r13)
            goto L_0x008b
        L_0x0207:
            r12 = r18
            r13 = 1
            int[] r9 = r0.f41666c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.bad.m35050g(r9, r4, r2, r13)
            goto L_0x008b
        L_0x0219:
            r12 = r18
            r13 = 1
            int[] r9 = r0.f41666c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.bad.m35061l(r9, r4, r2, r13)
            goto L_0x008b
        L_0x022b:
            r12 = r18
            r13 = 1
            int[] r9 = r0.f41666c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.bad.m35062m(r9, r4, r2, r13)
            goto L_0x008b
        L_0x023d:
            r12 = r18
            r13 = 1
            int[] r9 = r0.f41666c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.bad.m35056i(r9, r4, r2, r13)
            goto L_0x008b
        L_0x024f:
            r12 = r18
            r13 = 1
            int[] r9 = r0.f41666c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.bad.m35063n(r9, r4, r2, r13)
            goto L_0x008b
        L_0x0261:
            r12 = r18
            r13 = 1
            int[] r9 = r0.f41666c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.bad.m35060k(r9, r4, r2, r13)
            goto L_0x008b
        L_0x0273:
            r12 = r18
            r13 = 1
            int[] r9 = r0.f41666c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.bad.m35047f(r9, r4, r2, r13)
            goto L_0x008b
        L_0x0285:
            r12 = r18
            r13 = 1
            int[] r9 = r0.f41666c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.bad.m35053h(r9, r4, r2, r13)
            goto L_0x008b
        L_0x0297:
            r12 = r18
            r13 = 1
            int[] r9 = r0.f41666c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.bad.m35041d(r9, r4, r2, r13)
            goto L_0x008b
        L_0x02a9:
            r12 = r18
            r13 = 1
            int[] r9 = r0.f41666c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.bad.m35037c(r9, r4, r2, r13)
            goto L_0x008b
        L_0x02bb:
            r12 = r18
            r13 = 1
            int[] r9 = r0.f41666c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.bad.m35033b(r9, r4, r2, r13)
            goto L_0x008b
        L_0x02cd:
            r12 = r18
            r13 = 1
            int[] r9 = r0.f41666c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.bad.m35022a(r9, r4, r2, r13)
            goto L_0x008b
        L_0x02df:
            r12 = r18
            int[] r9 = r0.f41666c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            r13 = 0
            com.google.android.gms.internal.ads.bad.m35044e(r9, r4, r2, r13)
            goto L_0x008b
        L_0x02f1:
            r12 = r18
            r13 = 0
            int[] r9 = r0.f41666c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.bad.m35059j(r9, r4, r2, r13)
            goto L_0x008b
        L_0x0303:
            r12 = r18
            r13 = 0
            int[] r9 = r0.f41666c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.bad.m35050g(r9, r4, r2, r13)
            goto L_0x008b
        L_0x0315:
            r12 = r18
            r13 = 0
            int[] r9 = r0.f41666c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.bad.m35061l(r9, r4, r2, r13)
            goto L_0x008b
        L_0x0327:
            r12 = r18
            r13 = 0
            int[] r9 = r0.f41666c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.bad.m35062m(r9, r4, r2, r13)
            goto L_0x008b
        L_0x0339:
            r12 = r18
            r13 = 0
            int[] r9 = r0.f41666c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.bad.m35056i(r9, r4, r2, r13)
            goto L_0x008b
        L_0x034b:
            r12 = r18
            int[] r9 = r0.f41666c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.bad.m35031b(r9, r4, r2)
            goto L_0x008b
        L_0x035c:
            r12 = r18
            int[] r9 = r0.f41666c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.bab r5 = r0.m34882a(r12)
            com.google.android.gms.internal.ads.bad.m35021a(r9, r4, r2, r5)
            goto L_0x008b
        L_0x0371:
            r12 = r18
            int[] r9 = r0.f41666c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.bad.m35020a(r9, r4, r2)
            goto L_0x008b
        L_0x0382:
            r12 = r18
            int[] r9 = r0.f41666c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            r14 = 0
            com.google.android.gms.internal.ads.bad.m35063n(r9, r4, r2, r14)
            goto L_0x0521
        L_0x0394:
            r12 = r18
            r14 = 0
            int[] r9 = r0.f41666c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.bad.m35060k(r9, r4, r2, r14)
            goto L_0x0521
        L_0x03a6:
            r12 = r18
            r14 = 0
            int[] r9 = r0.f41666c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.bad.m35047f(r9, r4, r2, r14)
            goto L_0x0521
        L_0x03b8:
            r12 = r18
            r14 = 0
            int[] r9 = r0.f41666c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.bad.m35053h(r9, r4, r2, r14)
            goto L_0x0521
        L_0x03ca:
            r12 = r18
            r14 = 0
            int[] r9 = r0.f41666c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.bad.m35041d(r9, r4, r2, r14)
            goto L_0x0521
        L_0x03dc:
            r12 = r18
            r14 = 0
            int[] r9 = r0.f41666c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.bad.m35037c(r9, r4, r2, r14)
            goto L_0x0521
        L_0x03ee:
            r12 = r18
            r14 = 0
            int[] r9 = r0.f41666c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.bad.m35033b(r9, r4, r2, r14)
            goto L_0x0521
        L_0x0400:
            r12 = r18
            r14 = 0
            int[] r9 = r0.f41666c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.bad.m35022a(r9, r4, r2, r14)
            goto L_0x0521
        L_0x0412:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x0521
            java.lang.Object r4 = r8.getObject(r1, r4)
            com.google.android.gms.internal.ads.bab r5 = r0.m34882a(r12)
            r2.mo29757b(r13, r4, r5)
            goto L_0x0521
        L_0x0425:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x0521
            long r4 = r8.getLong(r1, r4)
            r2.mo29768e(r13, r4)
            goto L_0x0521
        L_0x0434:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x0521
            int r4 = r8.getInt(r1, r4)
            r2.mo29770f(r13, r4)
            goto L_0x0521
        L_0x0443:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x0521
            long r4 = r8.getLong(r1, r4)
            r2.mo29756b(r13, r4)
            goto L_0x0521
        L_0x0452:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x0521
            int r4 = r8.getInt(r1, r4)
            r2.mo29743a(r13, r4)
            goto L_0x0521
        L_0x0461:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x0521
            int r4 = r8.getInt(r1, r4)
            r2.mo29755b(r13, r4)
            goto L_0x0521
        L_0x0470:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x0521
            int r4 = r8.getInt(r1, r4)
            r2.mo29767e(r13, r4)
            goto L_0x0521
        L_0x047f:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x0521
            java.lang.Object r4 = r8.getObject(r1, r4)
            com.google.android.gms.internal.ads.awo r4 = (com.google.android.gms.internal.ads.awo) r4
            r2.mo29745a(r13, r4)
            goto L_0x0521
        L_0x0490:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x0521
            java.lang.Object r4 = r8.getObject(r1, r4)
            com.google.android.gms.internal.ads.bab r5 = r0.m34882a(r12)
            r2.mo29748a(r13, r4, r5)
            goto L_0x0521
        L_0x04a3:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x0521
            java.lang.Object r4 = r8.getObject(r1, r4)
            m34887a(r13, r4, r2)
            goto L_0x0521
        L_0x04b2:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x0521
            boolean r4 = com.google.android.gms.internal.ads.bba.m35167c(r1, r4)
            r2.mo29753a(r13, r4)
            goto L_0x0521
        L_0x04c0:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x0521
            int r4 = r8.getInt(r1, r4)
            r2.mo29764d(r13, r4)
            goto L_0x0521
        L_0x04ce:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x0521
            long r4 = r8.getLong(r1, r4)
            r2.mo29765d(r13, r4)
            goto L_0x0521
        L_0x04dc:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x0521
            int r4 = r8.getInt(r1, r4)
            r2.mo29761c(r13, r4)
            goto L_0x0521
        L_0x04ea:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x0521
            long r4 = r8.getLong(r1, r4)
            r2.mo29762c(r13, r4)
            goto L_0x0521
        L_0x04f8:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x0521
            long r4 = r8.getLong(r1, r4)
            r2.mo29744a(r13, r4)
            goto L_0x0521
        L_0x0506:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x0521
            float r4 = com.google.android.gms.internal.ads.bba.m35168d(r1, r4)
            r2.mo29742a(r13, r4)
            goto L_0x0521
        L_0x0514:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x0521
            double r4 = com.google.android.gms.internal.ads.bba.m35172e(r1, r4)
            r2.mo29741a(r13, r4)
        L_0x0521:
            int r5 = r12 + 3
            goto L_0x002c
        L_0x0525:
            if (r10 == 0) goto L_0x053c
            com.google.android.gms.internal.ads.axn<?> r4 = r0.f41681r
            r4.mo29793a(r2, r10)
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x053a
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            r10 = r4
            goto L_0x0525
        L_0x053a:
            r10 = 0
            goto L_0x0525
        L_0x053c:
            com.google.android.gms.internal.ads.bau<?, ?> r3 = r0.f41680q
            m34888a(r3, (T) r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.azo.m34901b(java.lang.Object, com.google.android.gms.internal.ads.bbq):void");
    }

    /* renamed from: a */
    private final <K, V> void m34889a(bbq bbq, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            bbq.mo29746a(i, this.f41682s.mo29888f(m34898b(i2)), this.f41682s.mo29884b(obj));
        }
    }

    /* renamed from: a */
    private static <UT, UB> void m34888a(bau<UT, UB> bau, T t, bbq bbq) throws IOException {
        bau.mo29960a(bau.mo29963b(t), bbq);
    }

    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo29895a(T r13, com.google.android.gms.internal.ads.baa r14, com.google.android.gms.internal.ads.axm r15) throws java.io.IOException {
        /*
            r12 = this;
            if (r15 == 0) goto L_0x05da
            com.google.android.gms.internal.ads.bau<?, ?> r7 = r12.f41680q
            com.google.android.gms.internal.ads.axn<?> r8 = r12.f41681r
            r9 = 0
            r0 = r9
            r10 = r0
        L_0x0009:
            int r1 = r14.mo29659a()     // Catch:{ all -> 0x05c2 }
            int r2 = r12.m34913g(r1)     // Catch:{ all -> 0x05c2 }
            if (r2 >= 0) goto L_0x0076
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r1 != r2) goto L_0x002f
            int r14 = r12.f41676m
        L_0x001a:
            int r15 = r12.f41677n
            if (r14 >= r15) goto L_0x0029
            int[] r15 = r12.f41675l
            r15 = r15[r14]
            java.lang.Object r10 = r12.m34884a(r13, r15, (UB) r10, r7)
            int r14 = r14 + 1
            goto L_0x001a
        L_0x0029:
            if (r10 == 0) goto L_0x002e
            r7.mo29966b(r13, r10)
        L_0x002e:
            return
        L_0x002f:
            boolean r2 = r12.f41671h     // Catch:{ all -> 0x05c2 }
            if (r2 != 0) goto L_0x0035
            r2 = r9
            goto L_0x003c
        L_0x0035:
            com.google.android.gms.internal.ads.azj r2 = r12.f41670g     // Catch:{ all -> 0x05c2 }
            java.lang.Object r1 = r8.mo29789a(r15, r2, r1)     // Catch:{ all -> 0x05c2 }
            r2 = r1
        L_0x003c:
            if (r2 == 0) goto L_0x0052
            if (r0 != 0) goto L_0x0044
            com.google.android.gms.internal.ads.axq r0 = r8.mo29795b(r13)     // Catch:{ all -> 0x05c2 }
        L_0x0044:
            r11 = r0
            r0 = r8
            r1 = r14
            r3 = r15
            r4 = r11
            r5 = r10
            r6 = r7
            java.lang.Object r0 = r0.mo29790a(r1, r2, r3, r4, r5, r6)     // Catch:{ all -> 0x05c2 }
            r10 = r0
            r0 = r11
            goto L_0x0009
        L_0x0052:
            if (r10 != 0) goto L_0x0059
            java.lang.Object r1 = r7.mo29967c(r13)     // Catch:{ all -> 0x05c2 }
            r10 = r1
        L_0x0059:
            boolean r1 = r7.mo29962a(r10, r14)     // Catch:{ all -> 0x05c2 }
            if (r1 != 0) goto L_0x0009
            int r14 = r12.f41676m
        L_0x0061:
            int r15 = r12.f41677n
            if (r14 >= r15) goto L_0x0070
            int[] r15 = r12.f41675l
            r15 = r15[r14]
            java.lang.Object r10 = r12.m34884a(r13, r15, (UB) r10, r7)
            int r14 = r14 + 1
            goto L_0x0061
        L_0x0070:
            if (r10 == 0) goto L_0x0075
            r7.mo29966b(r13, r10)
        L_0x0075:
            return
        L_0x0076:
            int r3 = r12.m34906d(r2)     // Catch:{ all -> 0x05c2 }
            r4 = 267386880(0xff00000, float:2.3665827E-29)
            r4 = r4 & r3
            int r4 = r4 >>> 20
            r5 = 1048575(0xfffff, float:1.469367E-39)
            switch(r4) {
                case 0: goto L_0x0571;
                case 1: goto L_0x0562;
                case 2: goto L_0x0553;
                case 3: goto L_0x0544;
                case 4: goto L_0x0535;
                case 5: goto L_0x0526;
                case 6: goto L_0x0517;
                case 7: goto L_0x0508;
                case 8: goto L_0x0500;
                case 9: goto L_0x04cf;
                case 10: goto L_0x04c0;
                case 11: goto L_0x04b1;
                case 12: goto L_0x048f;
                case 13: goto L_0x0480;
                case 14: goto L_0x0471;
                case 15: goto L_0x0462;
                case 16: goto L_0x0453;
                case 17: goto L_0x0422;
                case 18: goto L_0x0414;
                case 19: goto L_0x0406;
                case 20: goto L_0x03f8;
                case 21: goto L_0x03ea;
                case 22: goto L_0x03dc;
                case 23: goto L_0x03ce;
                case 24: goto L_0x03c0;
                case 25: goto L_0x03b2;
                case 26: goto L_0x0390;
                case 27: goto L_0x037e;
                case 28: goto L_0x0370;
                case 29: goto L_0x0362;
                case 30: goto L_0x034c;
                case 31: goto L_0x033e;
                case 32: goto L_0x0330;
                case 33: goto L_0x0322;
                case 34: goto L_0x0314;
                case 35: goto L_0x0306;
                case 36: goto L_0x02f8;
                case 37: goto L_0x02ea;
                case 38: goto L_0x02dc;
                case 39: goto L_0x02ce;
                case 40: goto L_0x02c0;
                case 41: goto L_0x02b2;
                case 42: goto L_0x02a4;
                case 43: goto L_0x0296;
                case 44: goto L_0x0281;
                case 45: goto L_0x0273;
                case 46: goto L_0x0265;
                case 47: goto L_0x0257;
                case 48: goto L_0x0249;
                case 49: goto L_0x0237;
                case 50: goto L_0x01f5;
                case 51: goto L_0x01e3;
                case 52: goto L_0x01d1;
                case 53: goto L_0x01bf;
                case 54: goto L_0x01ad;
                case 55: goto L_0x019b;
                case 56: goto L_0x0189;
                case 57: goto L_0x0177;
                case 58: goto L_0x0165;
                case 59: goto L_0x015d;
                case 60: goto L_0x012c;
                case 61: goto L_0x011e;
                case 62: goto L_0x010c;
                case 63: goto L_0x00e7;
                case 64: goto L_0x00d5;
                case 65: goto L_0x00c3;
                case 66: goto L_0x00b1;
                case 67: goto L_0x009f;
                case 68: goto L_0x008d;
                default: goto L_0x0085;
            }
        L_0x0085:
            if (r10 != 0) goto L_0x0581
            java.lang.Object r1 = r7.mo29954a()     // Catch:{ ayj -> 0x059e }
            goto L_0x0580
        L_0x008d:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ ayj -> 0x059e }
            com.google.android.gms.internal.ads.bab r5 = r12.m34882a(r2)     // Catch:{ ayj -> 0x059e }
            java.lang.Object r5 = r14.mo29665b(r5, r15)     // Catch:{ ayj -> 0x059e }
            com.google.android.gms.internal.ads.bba.m35154a(r13, r3, r5)     // Catch:{ ayj -> 0x059e }
            r12.m34900b((T) r13, r1, r2)     // Catch:{ ayj -> 0x059e }
            goto L_0x0009
        L_0x009f:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ ayj -> 0x059e }
            long r5 = r14.mo29700t()     // Catch:{ ayj -> 0x059e }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ ayj -> 0x059e }
            com.google.android.gms.internal.ads.bba.m35154a(r13, r3, r5)     // Catch:{ ayj -> 0x059e }
            r12.m34900b((T) r13, r1, r2)     // Catch:{ ayj -> 0x059e }
            goto L_0x0009
        L_0x00b1:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ ayj -> 0x059e }
            int r5 = r14.mo29699s()     // Catch:{ ayj -> 0x059e }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ ayj -> 0x059e }
            com.google.android.gms.internal.ads.bba.m35154a(r13, r3, r5)     // Catch:{ ayj -> 0x059e }
            r12.m34900b((T) r13, r1, r2)     // Catch:{ ayj -> 0x059e }
            goto L_0x0009
        L_0x00c3:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ ayj -> 0x059e }
            long r5 = r14.mo29698r()     // Catch:{ ayj -> 0x059e }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ ayj -> 0x059e }
            com.google.android.gms.internal.ads.bba.m35154a(r13, r3, r5)     // Catch:{ ayj -> 0x059e }
            r12.m34900b((T) r13, r1, r2)     // Catch:{ ayj -> 0x059e }
            goto L_0x0009
        L_0x00d5:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ ayj -> 0x059e }
            int r5 = r14.mo29696q()     // Catch:{ ayj -> 0x059e }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ ayj -> 0x059e }
            com.google.android.gms.internal.ads.bba.m35154a(r13, r3, r5)     // Catch:{ ayj -> 0x059e }
            r12.m34900b((T) r13, r1, r2)     // Catch:{ ayj -> 0x059e }
            goto L_0x0009
        L_0x00e7:
            int r4 = r14.mo29694p()     // Catch:{ ayj -> 0x059e }
            com.google.android.gms.internal.ads.aye r6 = r12.m34904c(r2)     // Catch:{ ayj -> 0x059e }
            if (r6 == 0) goto L_0x00fe
            boolean r6 = r6.mo29113a(r4)     // Catch:{ ayj -> 0x059e }
            if (r6 == 0) goto L_0x00f8
            goto L_0x00fe
        L_0x00f8:
            java.lang.Object r1 = com.google.android.gms.internal.ads.bad.m35018a(r1, r4, r10, r7)     // Catch:{ ayj -> 0x059e }
            goto L_0x035f
        L_0x00fe:
            r3 = r3 & r5
            long r5 = (long) r3     // Catch:{ ayj -> 0x059e }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)     // Catch:{ ayj -> 0x059e }
            com.google.android.gms.internal.ads.bba.m35154a(r13, r5, r3)     // Catch:{ ayj -> 0x059e }
            r12.m34900b((T) r13, r1, r2)     // Catch:{ ayj -> 0x059e }
            goto L_0x0009
        L_0x010c:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ ayj -> 0x059e }
            int r5 = r14.mo29692o()     // Catch:{ ayj -> 0x059e }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ ayj -> 0x059e }
            com.google.android.gms.internal.ads.bba.m35154a(r13, r3, r5)     // Catch:{ ayj -> 0x059e }
            r12.m34900b((T) r13, r1, r2)     // Catch:{ ayj -> 0x059e }
            goto L_0x0009
        L_0x011e:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ ayj -> 0x059e }
            com.google.android.gms.internal.ads.awo r5 = r14.mo29690n()     // Catch:{ ayj -> 0x059e }
            com.google.android.gms.internal.ads.bba.m35154a(r13, r3, r5)     // Catch:{ ayj -> 0x059e }
            r12.m34900b((T) r13, r1, r2)     // Catch:{ ayj -> 0x059e }
            goto L_0x0009
        L_0x012c:
            boolean r4 = r12.m34893a((T) r13, r1, r2)     // Catch:{ ayj -> 0x059e }
            if (r4 == 0) goto L_0x0148
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ ayj -> 0x059e }
            java.lang.Object r5 = com.google.android.gms.internal.ads.bba.m35174f(r13, r3)     // Catch:{ ayj -> 0x059e }
            com.google.android.gms.internal.ads.bab r6 = r12.m34882a(r2)     // Catch:{ ayj -> 0x059e }
            java.lang.Object r6 = r14.mo29660a(r6, r15)     // Catch:{ ayj -> 0x059e }
            java.lang.Object r5 = com.google.android.gms.internal.ads.ayb.m34769a(r5, r6)     // Catch:{ ayj -> 0x059e }
            com.google.android.gms.internal.ads.bba.m35154a(r13, r3, r5)     // Catch:{ ayj -> 0x059e }
            goto L_0x0158
        L_0x0148:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ ayj -> 0x059e }
            com.google.android.gms.internal.ads.bab r5 = r12.m34882a(r2)     // Catch:{ ayj -> 0x059e }
            java.lang.Object r5 = r14.mo29660a(r5, r15)     // Catch:{ ayj -> 0x059e }
            com.google.android.gms.internal.ads.bba.m35154a(r13, r3, r5)     // Catch:{ ayj -> 0x059e }
            r12.m34899b((T) r13, r2)     // Catch:{ ayj -> 0x059e }
        L_0x0158:
            r12.m34900b((T) r13, r1, r2)     // Catch:{ ayj -> 0x059e }
            goto L_0x0009
        L_0x015d:
            r12.m34890a(r13, r3, r14)     // Catch:{ ayj -> 0x059e }
            r12.m34900b((T) r13, r1, r2)     // Catch:{ ayj -> 0x059e }
            goto L_0x0009
        L_0x0165:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ ayj -> 0x059e }
            boolean r5 = r14.mo29685k()     // Catch:{ ayj -> 0x059e }
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch:{ ayj -> 0x059e }
            com.google.android.gms.internal.ads.bba.m35154a(r13, r3, r5)     // Catch:{ ayj -> 0x059e }
            r12.m34900b((T) r13, r1, r2)     // Catch:{ ayj -> 0x059e }
            goto L_0x0009
        L_0x0177:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ ayj -> 0x059e }
            int r5 = r14.mo29682j()     // Catch:{ ayj -> 0x059e }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ ayj -> 0x059e }
            com.google.android.gms.internal.ads.bba.m35154a(r13, r3, r5)     // Catch:{ ayj -> 0x059e }
            r12.m34900b((T) r13, r1, r2)     // Catch:{ ayj -> 0x059e }
            goto L_0x0009
        L_0x0189:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ ayj -> 0x059e }
            long r5 = r14.mo29680i()     // Catch:{ ayj -> 0x059e }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ ayj -> 0x059e }
            com.google.android.gms.internal.ads.bba.m35154a(r13, r3, r5)     // Catch:{ ayj -> 0x059e }
            r12.m34900b((T) r13, r1, r2)     // Catch:{ ayj -> 0x059e }
            goto L_0x0009
        L_0x019b:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ ayj -> 0x059e }
            int r5 = r14.mo29678h()     // Catch:{ ayj -> 0x059e }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ ayj -> 0x059e }
            com.google.android.gms.internal.ads.bba.m35154a(r13, r3, r5)     // Catch:{ ayj -> 0x059e }
            r12.m34900b((T) r13, r1, r2)     // Catch:{ ayj -> 0x059e }
            goto L_0x0009
        L_0x01ad:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ ayj -> 0x059e }
            long r5 = r14.mo29674f()     // Catch:{ ayj -> 0x059e }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ ayj -> 0x059e }
            com.google.android.gms.internal.ads.bba.m35154a(r13, r3, r5)     // Catch:{ ayj -> 0x059e }
            r12.m34900b((T) r13, r1, r2)     // Catch:{ ayj -> 0x059e }
            goto L_0x0009
        L_0x01bf:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ ayj -> 0x059e }
            long r5 = r14.mo29676g()     // Catch:{ ayj -> 0x059e }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ ayj -> 0x059e }
            com.google.android.gms.internal.ads.bba.m35154a(r13, r3, r5)     // Catch:{ ayj -> 0x059e }
            r12.m34900b((T) r13, r1, r2)     // Catch:{ ayj -> 0x059e }
            goto L_0x0009
        L_0x01d1:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ ayj -> 0x059e }
            float r5 = r14.mo29672e()     // Catch:{ ayj -> 0x059e }
            java.lang.Float r5 = java.lang.Float.valueOf(r5)     // Catch:{ ayj -> 0x059e }
            com.google.android.gms.internal.ads.bba.m35154a(r13, r3, r5)     // Catch:{ ayj -> 0x059e }
            r12.m34900b((T) r13, r1, r2)     // Catch:{ ayj -> 0x059e }
            goto L_0x0009
        L_0x01e3:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ ayj -> 0x059e }
            double r5 = r14.mo29670d()     // Catch:{ ayj -> 0x059e }
            java.lang.Double r5 = java.lang.Double.valueOf(r5)     // Catch:{ ayj -> 0x059e }
            com.google.android.gms.internal.ads.bba.m35154a(r13, r3, r5)     // Catch:{ ayj -> 0x059e }
            r12.m34900b((T) r13, r1, r2)     // Catch:{ ayj -> 0x059e }
            goto L_0x0009
        L_0x01f5:
            java.lang.Object r1 = r12.m34898b(r2)     // Catch:{ ayj -> 0x059e }
            int r2 = r12.m34906d(r2)     // Catch:{ ayj -> 0x059e }
            r2 = r2 & r5
            long r2 = (long) r2     // Catch:{ ayj -> 0x059e }
            java.lang.Object r4 = com.google.android.gms.internal.ads.bba.m35174f(r13, r2)     // Catch:{ ayj -> 0x059e }
            if (r4 != 0) goto L_0x020f
            com.google.android.gms.internal.ads.aze r4 = r12.f41682s     // Catch:{ ayj -> 0x059e }
            java.lang.Object r4 = r4.mo29887e(r1)     // Catch:{ ayj -> 0x059e }
            com.google.android.gms.internal.ads.bba.m35154a(r13, r2, r4)     // Catch:{ ayj -> 0x059e }
            goto L_0x0226
        L_0x020f:
            com.google.android.gms.internal.ads.aze r5 = r12.f41682s     // Catch:{ ayj -> 0x059e }
            boolean r5 = r5.mo29885c(r4)     // Catch:{ ayj -> 0x059e }
            if (r5 == 0) goto L_0x0226
            com.google.android.gms.internal.ads.aze r5 = r12.f41682s     // Catch:{ ayj -> 0x059e }
            java.lang.Object r5 = r5.mo29887e(r1)     // Catch:{ ayj -> 0x059e }
            com.google.android.gms.internal.ads.aze r6 = r12.f41682s     // Catch:{ ayj -> 0x059e }
            r6.mo29882a(r5, r4)     // Catch:{ ayj -> 0x059e }
            com.google.android.gms.internal.ads.bba.m35154a(r13, r2, r5)     // Catch:{ ayj -> 0x059e }
            r4 = r5
        L_0x0226:
            com.google.android.gms.internal.ads.aze r2 = r12.f41682s     // Catch:{ ayj -> 0x059e }
            java.util.Map r2 = r2.mo29883a(r4)     // Catch:{ ayj -> 0x059e }
            com.google.android.gms.internal.ads.aze r3 = r12.f41682s     // Catch:{ ayj -> 0x059e }
            com.google.android.gms.internal.ads.azc r1 = r3.mo29888f(r1)     // Catch:{ ayj -> 0x059e }
            r14.mo29663a(r2, r1, r15)     // Catch:{ ayj -> 0x059e }
            goto L_0x0009
        L_0x0237:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ ayj -> 0x059e }
            com.google.android.gms.internal.ads.bab r1 = r12.m34882a(r2)     // Catch:{ ayj -> 0x059e }
            com.google.android.gms.internal.ads.ayt r2 = r12.f41679p     // Catch:{ ayj -> 0x059e }
            java.util.List r2 = r2.mo29861a(r13, r3)     // Catch:{ ayj -> 0x059e }
            r14.mo29667b(r2, r1, r15)     // Catch:{ ayj -> 0x059e }
            goto L_0x0009
        L_0x0249:
            com.google.android.gms.internal.ads.ayt r1 = r12.f41679p     // Catch:{ ayj -> 0x059e }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ ayj -> 0x059e }
            java.util.List r1 = r1.mo29861a(r13, r2)     // Catch:{ ayj -> 0x059e }
            r14.mo29697q(r1)     // Catch:{ ayj -> 0x059e }
            goto L_0x0009
        L_0x0257:
            com.google.android.gms.internal.ads.ayt r1 = r12.f41679p     // Catch:{ ayj -> 0x059e }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ ayj -> 0x059e }
            java.util.List r1 = r1.mo29861a(r13, r2)     // Catch:{ ayj -> 0x059e }
            r14.mo29695p(r1)     // Catch:{ ayj -> 0x059e }
            goto L_0x0009
        L_0x0265:
            com.google.android.gms.internal.ads.ayt r1 = r12.f41679p     // Catch:{ ayj -> 0x059e }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ ayj -> 0x059e }
            java.util.List r1 = r1.mo29861a(r13, r2)     // Catch:{ ayj -> 0x059e }
            r14.mo29693o(r1)     // Catch:{ ayj -> 0x059e }
            goto L_0x0009
        L_0x0273:
            com.google.android.gms.internal.ads.ayt r1 = r12.f41679p     // Catch:{ ayj -> 0x059e }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ ayj -> 0x059e }
            java.util.List r1 = r1.mo29861a(r13, r2)     // Catch:{ ayj -> 0x059e }
            r14.mo29691n(r1)     // Catch:{ ayj -> 0x059e }
            goto L_0x0009
        L_0x0281:
            com.google.android.gms.internal.ads.ayt r4 = r12.f41679p     // Catch:{ ayj -> 0x059e }
            r3 = r3 & r5
            long r5 = (long) r3     // Catch:{ ayj -> 0x059e }
            java.util.List r3 = r4.mo29861a(r13, r5)     // Catch:{ ayj -> 0x059e }
            r14.mo29689m(r3)     // Catch:{ ayj -> 0x059e }
            com.google.android.gms.internal.ads.aye r2 = r12.m34904c(r2)     // Catch:{ ayj -> 0x059e }
            java.lang.Object r1 = com.google.android.gms.internal.ads.bad.m35019a(r1, r3, r2, r10, r7)     // Catch:{ ayj -> 0x059e }
            goto L_0x035f
        L_0x0296:
            com.google.android.gms.internal.ads.ayt r1 = r12.f41679p     // Catch:{ ayj -> 0x059e }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ ayj -> 0x059e }
            java.util.List r1 = r1.mo29861a(r13, r2)     // Catch:{ ayj -> 0x059e }
            r14.mo29687l(r1)     // Catch:{ ayj -> 0x059e }
            goto L_0x0009
        L_0x02a4:
            com.google.android.gms.internal.ads.ayt r1 = r12.f41679p     // Catch:{ ayj -> 0x059e }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ ayj -> 0x059e }
            java.util.List r1 = r1.mo29861a(r13, r2)     // Catch:{ ayj -> 0x059e }
            r14.mo29679h(r1)     // Catch:{ ayj -> 0x059e }
            goto L_0x0009
        L_0x02b2:
            com.google.android.gms.internal.ads.ayt r1 = r12.f41679p     // Catch:{ ayj -> 0x059e }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ ayj -> 0x059e }
            java.util.List r1 = r1.mo29861a(r13, r2)     // Catch:{ ayj -> 0x059e }
            r14.mo29677g(r1)     // Catch:{ ayj -> 0x059e }
            goto L_0x0009
        L_0x02c0:
            com.google.android.gms.internal.ads.ayt r1 = r12.f41679p     // Catch:{ ayj -> 0x059e }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ ayj -> 0x059e }
            java.util.List r1 = r1.mo29861a(r13, r2)     // Catch:{ ayj -> 0x059e }
            r14.mo29675f(r1)     // Catch:{ ayj -> 0x059e }
            goto L_0x0009
        L_0x02ce:
            com.google.android.gms.internal.ads.ayt r1 = r12.f41679p     // Catch:{ ayj -> 0x059e }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ ayj -> 0x059e }
            java.util.List r1 = r1.mo29861a(r13, r2)     // Catch:{ ayj -> 0x059e }
            r14.mo29673e(r1)     // Catch:{ ayj -> 0x059e }
            goto L_0x0009
        L_0x02dc:
            com.google.android.gms.internal.ads.ayt r1 = r12.f41679p     // Catch:{ ayj -> 0x059e }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ ayj -> 0x059e }
            java.util.List r1 = r1.mo29861a(r13, r2)     // Catch:{ ayj -> 0x059e }
            r14.mo29668c(r1)     // Catch:{ ayj -> 0x059e }
            goto L_0x0009
        L_0x02ea:
            com.google.android.gms.internal.ads.ayt r1 = r12.f41679p     // Catch:{ ayj -> 0x059e }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ ayj -> 0x059e }
            java.util.List r1 = r1.mo29861a(r13, r2)     // Catch:{ ayj -> 0x059e }
            r14.mo29671d(r1)     // Catch:{ ayj -> 0x059e }
            goto L_0x0009
        L_0x02f8:
            com.google.android.gms.internal.ads.ayt r1 = r12.f41679p     // Catch:{ ayj -> 0x059e }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ ayj -> 0x059e }
            java.util.List r1 = r1.mo29861a(r13, r2)     // Catch:{ ayj -> 0x059e }
            r14.mo29666b(r1)     // Catch:{ ayj -> 0x059e }
            goto L_0x0009
        L_0x0306:
            com.google.android.gms.internal.ads.ayt r1 = r12.f41679p     // Catch:{ ayj -> 0x059e }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ ayj -> 0x059e }
            java.util.List r1 = r1.mo29861a(r13, r2)     // Catch:{ ayj -> 0x059e }
            r14.mo29661a(r1)     // Catch:{ ayj -> 0x059e }
            goto L_0x0009
        L_0x0314:
            com.google.android.gms.internal.ads.ayt r1 = r12.f41679p     // Catch:{ ayj -> 0x059e }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ ayj -> 0x059e }
            java.util.List r1 = r1.mo29861a(r13, r2)     // Catch:{ ayj -> 0x059e }
            r14.mo29697q(r1)     // Catch:{ ayj -> 0x059e }
            goto L_0x0009
        L_0x0322:
            com.google.android.gms.internal.ads.ayt r1 = r12.f41679p     // Catch:{ ayj -> 0x059e }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ ayj -> 0x059e }
            java.util.List r1 = r1.mo29861a(r13, r2)     // Catch:{ ayj -> 0x059e }
            r14.mo29695p(r1)     // Catch:{ ayj -> 0x059e }
            goto L_0x0009
        L_0x0330:
            com.google.android.gms.internal.ads.ayt r1 = r12.f41679p     // Catch:{ ayj -> 0x059e }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ ayj -> 0x059e }
            java.util.List r1 = r1.mo29861a(r13, r2)     // Catch:{ ayj -> 0x059e }
            r14.mo29693o(r1)     // Catch:{ ayj -> 0x059e }
            goto L_0x0009
        L_0x033e:
            com.google.android.gms.internal.ads.ayt r1 = r12.f41679p     // Catch:{ ayj -> 0x059e }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ ayj -> 0x059e }
            java.util.List r1 = r1.mo29861a(r13, r2)     // Catch:{ ayj -> 0x059e }
            r14.mo29691n(r1)     // Catch:{ ayj -> 0x059e }
            goto L_0x0009
        L_0x034c:
            com.google.android.gms.internal.ads.ayt r4 = r12.f41679p     // Catch:{ ayj -> 0x059e }
            r3 = r3 & r5
            long r5 = (long) r3     // Catch:{ ayj -> 0x059e }
            java.util.List r3 = r4.mo29861a(r13, r5)     // Catch:{ ayj -> 0x059e }
            r14.mo29689m(r3)     // Catch:{ ayj -> 0x059e }
            com.google.android.gms.internal.ads.aye r2 = r12.m34904c(r2)     // Catch:{ ayj -> 0x059e }
            java.lang.Object r1 = com.google.android.gms.internal.ads.bad.m35019a(r1, r3, r2, r10, r7)     // Catch:{ ayj -> 0x059e }
        L_0x035f:
            r10 = r1
            goto L_0x0009
        L_0x0362:
            com.google.android.gms.internal.ads.ayt r1 = r12.f41679p     // Catch:{ ayj -> 0x059e }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ ayj -> 0x059e }
            java.util.List r1 = r1.mo29861a(r13, r2)     // Catch:{ ayj -> 0x059e }
            r14.mo29687l(r1)     // Catch:{ ayj -> 0x059e }
            goto L_0x0009
        L_0x0370:
            com.google.android.gms.internal.ads.ayt r1 = r12.f41679p     // Catch:{ ayj -> 0x059e }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ ayj -> 0x059e }
            java.util.List r1 = r1.mo29861a(r13, r2)     // Catch:{ ayj -> 0x059e }
            r14.mo29684k(r1)     // Catch:{ ayj -> 0x059e }
            goto L_0x0009
        L_0x037e:
            com.google.android.gms.internal.ads.bab r1 = r12.m34882a(r2)     // Catch:{ ayj -> 0x059e }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ ayj -> 0x059e }
            com.google.android.gms.internal.ads.ayt r4 = r12.f41679p     // Catch:{ ayj -> 0x059e }
            java.util.List r2 = r4.mo29861a(r13, r2)     // Catch:{ ayj -> 0x059e }
            r14.mo29662a(r2, r1, r15)     // Catch:{ ayj -> 0x059e }
            goto L_0x0009
        L_0x0390:
            boolean r1 = m34911f(r3)     // Catch:{ ayj -> 0x059e }
            if (r1 == 0) goto L_0x03a4
            com.google.android.gms.internal.ads.ayt r1 = r12.f41679p     // Catch:{ ayj -> 0x059e }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ ayj -> 0x059e }
            java.util.List r1 = r1.mo29861a(r13, r2)     // Catch:{ ayj -> 0x059e }
            r14.mo29683j(r1)     // Catch:{ ayj -> 0x059e }
            goto L_0x0009
        L_0x03a4:
            com.google.android.gms.internal.ads.ayt r1 = r12.f41679p     // Catch:{ ayj -> 0x059e }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ ayj -> 0x059e }
            java.util.List r1 = r1.mo29861a(r13, r2)     // Catch:{ ayj -> 0x059e }
            r14.mo29681i(r1)     // Catch:{ ayj -> 0x059e }
            goto L_0x0009
        L_0x03b2:
            com.google.android.gms.internal.ads.ayt r1 = r12.f41679p     // Catch:{ ayj -> 0x059e }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ ayj -> 0x059e }
            java.util.List r1 = r1.mo29861a(r13, r2)     // Catch:{ ayj -> 0x059e }
            r14.mo29679h(r1)     // Catch:{ ayj -> 0x059e }
            goto L_0x0009
        L_0x03c0:
            com.google.android.gms.internal.ads.ayt r1 = r12.f41679p     // Catch:{ ayj -> 0x059e }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ ayj -> 0x059e }
            java.util.List r1 = r1.mo29861a(r13, r2)     // Catch:{ ayj -> 0x059e }
            r14.mo29677g(r1)     // Catch:{ ayj -> 0x059e }
            goto L_0x0009
        L_0x03ce:
            com.google.android.gms.internal.ads.ayt r1 = r12.f41679p     // Catch:{ ayj -> 0x059e }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ ayj -> 0x059e }
            java.util.List r1 = r1.mo29861a(r13, r2)     // Catch:{ ayj -> 0x059e }
            r14.mo29675f(r1)     // Catch:{ ayj -> 0x059e }
            goto L_0x0009
        L_0x03dc:
            com.google.android.gms.internal.ads.ayt r1 = r12.f41679p     // Catch:{ ayj -> 0x059e }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ ayj -> 0x059e }
            java.util.List r1 = r1.mo29861a(r13, r2)     // Catch:{ ayj -> 0x059e }
            r14.mo29673e(r1)     // Catch:{ ayj -> 0x059e }
            goto L_0x0009
        L_0x03ea:
            com.google.android.gms.internal.ads.ayt r1 = r12.f41679p     // Catch:{ ayj -> 0x059e }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ ayj -> 0x059e }
            java.util.List r1 = r1.mo29861a(r13, r2)     // Catch:{ ayj -> 0x059e }
            r14.mo29668c(r1)     // Catch:{ ayj -> 0x059e }
            goto L_0x0009
        L_0x03f8:
            com.google.android.gms.internal.ads.ayt r1 = r12.f41679p     // Catch:{ ayj -> 0x059e }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ ayj -> 0x059e }
            java.util.List r1 = r1.mo29861a(r13, r2)     // Catch:{ ayj -> 0x059e }
            r14.mo29671d(r1)     // Catch:{ ayj -> 0x059e }
            goto L_0x0009
        L_0x0406:
            com.google.android.gms.internal.ads.ayt r1 = r12.f41679p     // Catch:{ ayj -> 0x059e }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ ayj -> 0x059e }
            java.util.List r1 = r1.mo29861a(r13, r2)     // Catch:{ ayj -> 0x059e }
            r14.mo29666b(r1)     // Catch:{ ayj -> 0x059e }
            goto L_0x0009
        L_0x0414:
            com.google.android.gms.internal.ads.ayt r1 = r12.f41679p     // Catch:{ ayj -> 0x059e }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ ayj -> 0x059e }
            java.util.List r1 = r1.mo29861a(r13, r2)     // Catch:{ ayj -> 0x059e }
            r14.mo29661a(r1)     // Catch:{ ayj -> 0x059e }
            goto L_0x0009
        L_0x0422:
            boolean r1 = r12.m34892a((T) r13, r2)     // Catch:{ ayj -> 0x059e }
            if (r1 == 0) goto L_0x0440
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ ayj -> 0x059e }
            java.lang.Object r1 = com.google.android.gms.internal.ads.bba.m35174f(r13, r3)     // Catch:{ ayj -> 0x059e }
            com.google.android.gms.internal.ads.bab r2 = r12.m34882a(r2)     // Catch:{ ayj -> 0x059e }
            java.lang.Object r2 = r14.mo29665b(r2, r15)     // Catch:{ ayj -> 0x059e }
            java.lang.Object r1 = com.google.android.gms.internal.ads.ayb.m34769a(r1, r2)     // Catch:{ ayj -> 0x059e }
            com.google.android.gms.internal.ads.bba.m35154a(r13, r3, r1)     // Catch:{ ayj -> 0x059e }
            goto L_0x0009
        L_0x0440:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ ayj -> 0x059e }
            com.google.android.gms.internal.ads.bab r1 = r12.m34882a(r2)     // Catch:{ ayj -> 0x059e }
            java.lang.Object r1 = r14.mo29665b(r1, r15)     // Catch:{ ayj -> 0x059e }
            com.google.android.gms.internal.ads.bba.m35154a(r13, r3, r1)     // Catch:{ ayj -> 0x059e }
            r12.m34899b((T) r13, r2)     // Catch:{ ayj -> 0x059e }
            goto L_0x0009
        L_0x0453:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ ayj -> 0x059e }
            long r5 = r14.mo29700t()     // Catch:{ ayj -> 0x059e }
            com.google.android.gms.internal.ads.bba.m35153a(r13, r3, r5)     // Catch:{ ayj -> 0x059e }
            r12.m34899b((T) r13, r2)     // Catch:{ ayj -> 0x059e }
            goto L_0x0009
        L_0x0462:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ ayj -> 0x059e }
            int r1 = r14.mo29699s()     // Catch:{ ayj -> 0x059e }
            com.google.android.gms.internal.ads.bba.m35152a(r13, r3, r1)     // Catch:{ ayj -> 0x059e }
            r12.m34899b((T) r13, r2)     // Catch:{ ayj -> 0x059e }
            goto L_0x0009
        L_0x0471:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ ayj -> 0x059e }
            long r5 = r14.mo29698r()     // Catch:{ ayj -> 0x059e }
            com.google.android.gms.internal.ads.bba.m35153a(r13, r3, r5)     // Catch:{ ayj -> 0x059e }
            r12.m34899b((T) r13, r2)     // Catch:{ ayj -> 0x059e }
            goto L_0x0009
        L_0x0480:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ ayj -> 0x059e }
            int r1 = r14.mo29696q()     // Catch:{ ayj -> 0x059e }
            com.google.android.gms.internal.ads.bba.m35152a(r13, r3, r1)     // Catch:{ ayj -> 0x059e }
            r12.m34899b((T) r13, r2)     // Catch:{ ayj -> 0x059e }
            goto L_0x0009
        L_0x048f:
            int r4 = r14.mo29694p()     // Catch:{ ayj -> 0x059e }
            com.google.android.gms.internal.ads.aye r6 = r12.m34904c(r2)     // Catch:{ ayj -> 0x059e }
            if (r6 == 0) goto L_0x04a6
            boolean r6 = r6.mo29113a(r4)     // Catch:{ ayj -> 0x059e }
            if (r6 == 0) goto L_0x04a0
            goto L_0x04a6
        L_0x04a0:
            java.lang.Object r1 = com.google.android.gms.internal.ads.bad.m35018a(r1, r4, r10, r7)     // Catch:{ ayj -> 0x059e }
            goto L_0x035f
        L_0x04a6:
            r1 = r3 & r5
            long r5 = (long) r1     // Catch:{ ayj -> 0x059e }
            com.google.android.gms.internal.ads.bba.m35152a(r13, r5, r4)     // Catch:{ ayj -> 0x059e }
            r12.m34899b((T) r13, r2)     // Catch:{ ayj -> 0x059e }
            goto L_0x0009
        L_0x04b1:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ ayj -> 0x059e }
            int r1 = r14.mo29692o()     // Catch:{ ayj -> 0x059e }
            com.google.android.gms.internal.ads.bba.m35152a(r13, r3, r1)     // Catch:{ ayj -> 0x059e }
            r12.m34899b((T) r13, r2)     // Catch:{ ayj -> 0x059e }
            goto L_0x0009
        L_0x04c0:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ ayj -> 0x059e }
            com.google.android.gms.internal.ads.awo r1 = r14.mo29690n()     // Catch:{ ayj -> 0x059e }
            com.google.android.gms.internal.ads.bba.m35154a(r13, r3, r1)     // Catch:{ ayj -> 0x059e }
            r12.m34899b((T) r13, r2)     // Catch:{ ayj -> 0x059e }
            goto L_0x0009
        L_0x04cf:
            boolean r1 = r12.m34892a((T) r13, r2)     // Catch:{ ayj -> 0x059e }
            if (r1 == 0) goto L_0x04ed
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ ayj -> 0x059e }
            java.lang.Object r1 = com.google.android.gms.internal.ads.bba.m35174f(r13, r3)     // Catch:{ ayj -> 0x059e }
            com.google.android.gms.internal.ads.bab r2 = r12.m34882a(r2)     // Catch:{ ayj -> 0x059e }
            java.lang.Object r2 = r14.mo29660a(r2, r15)     // Catch:{ ayj -> 0x059e }
            java.lang.Object r1 = com.google.android.gms.internal.ads.ayb.m34769a(r1, r2)     // Catch:{ ayj -> 0x059e }
            com.google.android.gms.internal.ads.bba.m35154a(r13, r3, r1)     // Catch:{ ayj -> 0x059e }
            goto L_0x0009
        L_0x04ed:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ ayj -> 0x059e }
            com.google.android.gms.internal.ads.bab r1 = r12.m34882a(r2)     // Catch:{ ayj -> 0x059e }
            java.lang.Object r1 = r14.mo29660a(r1, r15)     // Catch:{ ayj -> 0x059e }
            com.google.android.gms.internal.ads.bba.m35154a(r13, r3, r1)     // Catch:{ ayj -> 0x059e }
            r12.m34899b((T) r13, r2)     // Catch:{ ayj -> 0x059e }
            goto L_0x0009
        L_0x0500:
            r12.m34890a(r13, r3, r14)     // Catch:{ ayj -> 0x059e }
            r12.m34899b((T) r13, r2)     // Catch:{ ayj -> 0x059e }
            goto L_0x0009
        L_0x0508:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ ayj -> 0x059e }
            boolean r1 = r14.mo29685k()     // Catch:{ ayj -> 0x059e }
            com.google.android.gms.internal.ads.bba.m35155a(r13, r3, r1)     // Catch:{ ayj -> 0x059e }
            r12.m34899b((T) r13, r2)     // Catch:{ ayj -> 0x059e }
            goto L_0x0009
        L_0x0517:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ ayj -> 0x059e }
            int r1 = r14.mo29682j()     // Catch:{ ayj -> 0x059e }
            com.google.android.gms.internal.ads.bba.m35152a(r13, r3, r1)     // Catch:{ ayj -> 0x059e }
            r12.m34899b((T) r13, r2)     // Catch:{ ayj -> 0x059e }
            goto L_0x0009
        L_0x0526:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ ayj -> 0x059e }
            long r5 = r14.mo29680i()     // Catch:{ ayj -> 0x059e }
            com.google.android.gms.internal.ads.bba.m35153a(r13, r3, r5)     // Catch:{ ayj -> 0x059e }
            r12.m34899b((T) r13, r2)     // Catch:{ ayj -> 0x059e }
            goto L_0x0009
        L_0x0535:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ ayj -> 0x059e }
            int r1 = r14.mo29678h()     // Catch:{ ayj -> 0x059e }
            com.google.android.gms.internal.ads.bba.m35152a(r13, r3, r1)     // Catch:{ ayj -> 0x059e }
            r12.m34899b((T) r13, r2)     // Catch:{ ayj -> 0x059e }
            goto L_0x0009
        L_0x0544:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ ayj -> 0x059e }
            long r5 = r14.mo29674f()     // Catch:{ ayj -> 0x059e }
            com.google.android.gms.internal.ads.bba.m35153a(r13, r3, r5)     // Catch:{ ayj -> 0x059e }
            r12.m34899b((T) r13, r2)     // Catch:{ ayj -> 0x059e }
            goto L_0x0009
        L_0x0553:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ ayj -> 0x059e }
            long r5 = r14.mo29676g()     // Catch:{ ayj -> 0x059e }
            com.google.android.gms.internal.ads.bba.m35153a(r13, r3, r5)     // Catch:{ ayj -> 0x059e }
            r12.m34899b((T) r13, r2)     // Catch:{ ayj -> 0x059e }
            goto L_0x0009
        L_0x0562:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ ayj -> 0x059e }
            float r1 = r14.mo29672e()     // Catch:{ ayj -> 0x059e }
            com.google.android.gms.internal.ads.bba.m35151a(r13, r3, r1)     // Catch:{ ayj -> 0x059e }
            r12.m34899b((T) r13, r2)     // Catch:{ ayj -> 0x059e }
            goto L_0x0009
        L_0x0571:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ ayj -> 0x059e }
            double r5 = r14.mo29670d()     // Catch:{ ayj -> 0x059e }
            com.google.android.gms.internal.ads.bba.m35150a(r13, r3, r5)     // Catch:{ ayj -> 0x059e }
            r12.m34899b((T) r13, r2)     // Catch:{ ayj -> 0x059e }
            goto L_0x0009
        L_0x0580:
            r10 = r1
        L_0x0581:
            boolean r1 = r7.mo29962a(r10, r14)     // Catch:{ ayj -> 0x059e }
            if (r1 != 0) goto L_0x0009
            int r14 = r12.f41676m
        L_0x0589:
            int r15 = r12.f41677n
            if (r14 >= r15) goto L_0x0598
            int[] r15 = r12.f41675l
            r15 = r15[r14]
            java.lang.Object r10 = r12.m34884a(r13, r15, (UB) r10, r7)
            int r14 = r14 + 1
            goto L_0x0589
        L_0x0598:
            if (r10 == 0) goto L_0x059d
            r7.mo29966b(r13, r10)
        L_0x059d:
            return
        L_0x059e:
            if (r10 != 0) goto L_0x05a5
            java.lang.Object r1 = r7.mo29967c(r13)     // Catch:{ all -> 0x05c2 }
            r10 = r1
        L_0x05a5:
            boolean r1 = r7.mo29962a(r10, r14)     // Catch:{ all -> 0x05c2 }
            if (r1 != 0) goto L_0x0009
            int r14 = r12.f41676m
        L_0x05ad:
            int r15 = r12.f41677n
            if (r14 >= r15) goto L_0x05bc
            int[] r15 = r12.f41675l
            r15 = r15[r14]
            java.lang.Object r10 = r12.m34884a(r13, r15, (UB) r10, r7)
            int r14 = r14 + 1
            goto L_0x05ad
        L_0x05bc:
            if (r10 == 0) goto L_0x05c1
            r7.mo29966b(r13, r10)
        L_0x05c1:
            return
        L_0x05c2:
            r14 = move-exception
            int r15 = r12.f41676m
        L_0x05c5:
            int r0 = r12.f41677n
            if (r15 >= r0) goto L_0x05d4
            int[] r0 = r12.f41675l
            r0 = r0[r15]
            java.lang.Object r10 = r12.m34884a(r13, r0, (UB) r10, r7)
            int r15 = r15 + 1
            goto L_0x05c5
        L_0x05d4:
            if (r10 == 0) goto L_0x05d9
            r7.mo29966b(r13, r10)
        L_0x05d9:
            throw r14
        L_0x05da:
            java.lang.NullPointerException r13 = new java.lang.NullPointerException
            r13.<init>()
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.azo.mo29895a(java.lang.Object, com.google.android.gms.internal.ads.baa, com.google.android.gms.internal.ads.axm):void");
    }

    /* renamed from: e */
    private static bav m34910e(Object obj) {
        axz axz = (axz) obj;
        bav bav = axz.zzfza;
        if (bav != bav.m35112a()) {
            return bav;
        }
        bav b = bav.m35114b();
        axz.zzfza = b;
        return b;
    }

    /* renamed from: a */
    private static int m34880a(byte[] bArr, int i, int i2, bbj bbj, Class<?> cls, awl awl) throws IOException {
        switch (azp.f41683a[bbj.ordinal()]) {
            case 1:
                int b = awk.m34278b(bArr, i, awl);
                awl.f41463c = Boolean.valueOf(awl.f41462b != 0);
                return b;
            case 2:
                return awk.m34284e(bArr, i, awl);
            case 3:
                awl.f41463c = Double.valueOf(awk.m34280c(bArr, i));
                return i + 8;
            case 4:
            case 5:
                awl.f41463c = Integer.valueOf(awk.m34275a(bArr, i));
                return i + 4;
            case 6:
            case 7:
                awl.f41463c = Long.valueOf(awk.m34279b(bArr, i));
                return i + 8;
            case 8:
                awl.f41463c = Float.valueOf(awk.m34282d(bArr, i));
                return i + 4;
            case 9:
            case 10:
            case 11:
                int a = awk.m34276a(bArr, i, awl);
                awl.f41463c = Integer.valueOf(awl.f41461a);
                return a;
            case 12:
            case 13:
                int b2 = awk.m34278b(bArr, i, awl);
                awl.f41463c = Long.valueOf(awl.f41462b);
                return b2;
            case 14:
                return awk.m34274a(azx.m34942a().mo29905a(cls), bArr, i, i2, awl);
            case 15:
                int a2 = awk.m34276a(bArr, i, awl);
                awl.f41463c = Integer.valueOf(axa.m34319e(awl.f41461a));
                return a2;
            case 16:
                int b3 = awk.m34278b(bArr, i, awl);
                awl.f41463c = Long.valueOf(axa.m34317a(awl.f41462b));
                return b3;
            case 17:
                return awk.m34283d(bArr, i, awl);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Regions count limit reached
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeEndlessLoop(RegionMaker.java:368)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:172)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:690)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:695)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:690)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:869)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:128)
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
    /* JADX WARNING: Removed duplicated region for block: B:110:0x023f  */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x0433 A[SYNTHETIC] */
    /* renamed from: a */
    private final int m34878a(T r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, long r25, int r27, long r28, com.google.android.gms.internal.ads.awl r30) throws java.io.IOException {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r18
            r4 = r19
            r5 = r20
            r2 = r21
            r6 = r23
            r8 = r24
            r9 = r28
            r7 = r30
            sun.misc.Unsafe r11 = f41665b
            java.lang.Object r11 = r11.getObject(r1, r9)
            com.google.android.gms.internal.ads.ayh r11 = (com.google.android.gms.internal.ads.ayh) r11
            boolean r12 = r11.mo29588a()
            r13 = 1
            if (r12 != 0) goto L_0x0036
            int r12 = r11.size()
            if (r12 != 0) goto L_0x002c
            r12 = 10
            goto L_0x002d
        L_0x002c:
            int r12 = r12 << r13
        L_0x002d:
            com.google.android.gms.internal.ads.ayh r11 = r11.mo29603a(r12)
            sun.misc.Unsafe r12 = f41665b
            r12.putObject(r1, r9, r11)
        L_0x0036:
            r9 = 5
            r14 = 0
            r10 = 2
            switch(r27) {
                case 18: goto L_0x03f2;
                case 19: goto L_0x03b2;
                case 20: goto L_0x0371;
                case 21: goto L_0x0371;
                case 22: goto L_0x0357;
                case 23: goto L_0x0316;
                case 24: goto L_0x02d5;
                case 25: goto L_0x027e;
                case 26: goto L_0x01c4;
                case 27: goto L_0x01aa;
                case 28: goto L_0x0151;
                case 29: goto L_0x0357;
                case 30: goto L_0x0119;
                case 31: goto L_0x02d5;
                case 32: goto L_0x0316;
                case 33: goto L_0x00cc;
                case 34: goto L_0x007f;
                case 35: goto L_0x03f2;
                case 36: goto L_0x03b2;
                case 37: goto L_0x0371;
                case 38: goto L_0x0371;
                case 39: goto L_0x0357;
                case 40: goto L_0x0316;
                case 41: goto L_0x02d5;
                case 42: goto L_0x027e;
                case 43: goto L_0x0357;
                case 44: goto L_0x0119;
                case 45: goto L_0x02d5;
                case 46: goto L_0x0316;
                case 47: goto L_0x00cc;
                case 48: goto L_0x007f;
                case 49: goto L_0x003f;
                default: goto L_0x003d;
            }
        L_0x003d:
            goto L_0x0432
        L_0x003f:
            r1 = 3
            if (r6 != r1) goto L_0x0432
            com.google.android.gms.internal.ads.bab r1 = r0.m34882a(r8)
            r6 = r2 & -8
            r6 = r6 | 4
            r22 = r1
            r23 = r18
            r24 = r19
            r25 = r20
            r26 = r6
            r27 = r30
            int r4 = com.google.android.gms.internal.ads.awk.m34273a(r22, r23, r24, r25, r26, r27)
            java.lang.Object r8 = r7.f41463c
            r11.add(r8)
        L_0x005f:
            if (r4 >= r5) goto L_0x0432
            int r8 = com.google.android.gms.internal.ads.awk.m34276a(r3, r4, r7)
            int r9 = r7.f41461a
            if (r2 != r9) goto L_0x0432
            r22 = r1
            r23 = r18
            r24 = r8
            r25 = r20
            r26 = r6
            r27 = r30
            int r4 = com.google.android.gms.internal.ads.awk.m34273a(r22, r23, r24, r25, r26, r27)
            java.lang.Object r8 = r7.f41463c
            r11.add(r8)
            goto L_0x005f
        L_0x007f:
            if (r6 != r10) goto L_0x00a3
            com.google.android.gms.internal.ads.ayx r11 = (com.google.android.gms.internal.ads.ayx) r11
            int r1 = com.google.android.gms.internal.ads.awk.m34276a(r3, r4, r7)
            int r2 = r7.f41461a
            int r2 = r2 + r1
        L_0x008a:
            if (r1 >= r2) goto L_0x009a
            int r1 = com.google.android.gms.internal.ads.awk.m34278b(r3, r1, r7)
            long r4 = r7.f41462b
            long r4 = com.google.android.gms.internal.ads.axa.m34317a(r4)
            r11.mo29864a(r4)
            goto L_0x008a
        L_0x009a:
            if (r1 != r2) goto L_0x009e
            goto L_0x0433
        L_0x009e:
            com.google.android.gms.internal.ads.ayi r1 = com.google.android.gms.internal.ads.ayi.m34778a()
            throw r1
        L_0x00a3:
            if (r6 != 0) goto L_0x0432
            com.google.android.gms.internal.ads.ayx r11 = (com.google.android.gms.internal.ads.ayx) r11
            int r1 = com.google.android.gms.internal.ads.awk.m34278b(r3, r4, r7)
            long r8 = r7.f41462b
            long r8 = com.google.android.gms.internal.ads.axa.m34317a(r8)
            r11.mo29864a(r8)
        L_0x00b4:
            if (r1 >= r5) goto L_0x0433
            int r4 = com.google.android.gms.internal.ads.awk.m34276a(r3, r1, r7)
            int r6 = r7.f41461a
            if (r2 != r6) goto L_0x0433
            int r1 = com.google.android.gms.internal.ads.awk.m34278b(r3, r4, r7)
            long r8 = r7.f41462b
            long r8 = com.google.android.gms.internal.ads.axa.m34317a(r8)
            r11.mo29864a(r8)
            goto L_0x00b4
        L_0x00cc:
            if (r6 != r10) goto L_0x00f0
            com.google.android.gms.internal.ads.aya r11 = (com.google.android.gms.internal.ads.aya) r11
            int r1 = com.google.android.gms.internal.ads.awk.m34276a(r3, r4, r7)
            int r2 = r7.f41461a
            int r2 = r2 + r1
        L_0x00d7:
            if (r1 >= r2) goto L_0x00e7
            int r1 = com.google.android.gms.internal.ads.awk.m34276a(r3, r1, r7)
            int r4 = r7.f41461a
            int r4 = com.google.android.gms.internal.ads.axa.m34319e(r4)
            r11.mo29835d(r4)
            goto L_0x00d7
        L_0x00e7:
            if (r1 != r2) goto L_0x00eb
            goto L_0x0433
        L_0x00eb:
            com.google.android.gms.internal.ads.ayi r1 = com.google.android.gms.internal.ads.ayi.m34778a()
            throw r1
        L_0x00f0:
            if (r6 != 0) goto L_0x0432
            com.google.android.gms.internal.ads.aya r11 = (com.google.android.gms.internal.ads.aya) r11
            int r1 = com.google.android.gms.internal.ads.awk.m34276a(r3, r4, r7)
            int r4 = r7.f41461a
            int r4 = com.google.android.gms.internal.ads.axa.m34319e(r4)
            r11.mo29835d(r4)
        L_0x0101:
            if (r1 >= r5) goto L_0x0433
            int r4 = com.google.android.gms.internal.ads.awk.m34276a(r3, r1, r7)
            int r6 = r7.f41461a
            if (r2 != r6) goto L_0x0433
            int r1 = com.google.android.gms.internal.ads.awk.m34276a(r3, r4, r7)
            int r4 = r7.f41461a
            int r4 = com.google.android.gms.internal.ads.axa.m34319e(r4)
            r11.mo29835d(r4)
            goto L_0x0101
        L_0x0119:
            if (r6 != r10) goto L_0x0120
            int r2 = com.google.android.gms.internal.ads.awk.m34277a(r3, r4, r11, r7)
            goto L_0x0131
        L_0x0120:
            if (r6 != 0) goto L_0x0432
            r2 = r21
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r11
            r7 = r30
            int r2 = com.google.android.gms.internal.ads.awk.m34269a(r2, r3, r4, r5, r6, r7)
        L_0x0131:
            com.google.android.gms.internal.ads.axz r1 = (com.google.android.gms.internal.ads.axz) r1
            com.google.android.gms.internal.ads.bav r3 = r1.zzfza
            com.google.android.gms.internal.ads.bav r4 = com.google.android.gms.internal.ads.bav.m35112a()
            if (r3 != r4) goto L_0x013c
            r3 = 0
        L_0x013c:
            com.google.android.gms.internal.ads.aye r4 = r0.m34904c(r8)
            com.google.android.gms.internal.ads.bau<?, ?> r5 = r0.f41680q
            r6 = r22
            java.lang.Object r3 = com.google.android.gms.internal.ads.bad.m35019a(r6, r11, r4, r3, r5)
            com.google.android.gms.internal.ads.bav r3 = (com.google.android.gms.internal.ads.bav) r3
            if (r3 == 0) goto L_0x014e
            r1.zzfza = r3
        L_0x014e:
            r1 = r2
            goto L_0x0433
        L_0x0151:
            if (r6 != r10) goto L_0x0432
            int r1 = com.google.android.gms.internal.ads.awk.m34276a(r3, r4, r7)
            int r4 = r7.f41461a
            if (r4 < 0) goto L_0x01a5
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x01a0
            if (r4 != 0) goto L_0x0167
            com.google.android.gms.internal.ads.awo r4 = com.google.android.gms.internal.ads.awo.zzfuo
            r11.add(r4)
            goto L_0x016f
        L_0x0167:
            com.google.android.gms.internal.ads.awo r6 = com.google.android.gms.internal.ads.awo.zzi(r3, r1, r4)
            r11.add(r6)
            int r1 = r1 + r4
        L_0x016f:
            if (r1 >= r5) goto L_0x0433
            int r4 = com.google.android.gms.internal.ads.awk.m34276a(r3, r1, r7)
            int r6 = r7.f41461a
            if (r2 != r6) goto L_0x0433
            int r1 = com.google.android.gms.internal.ads.awk.m34276a(r3, r4, r7)
            int r4 = r7.f41461a
            if (r4 < 0) goto L_0x019b
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x0196
            if (r4 != 0) goto L_0x018d
            com.google.android.gms.internal.ads.awo r4 = com.google.android.gms.internal.ads.awo.zzfuo
            r11.add(r4)
            goto L_0x016f
        L_0x018d:
            com.google.android.gms.internal.ads.awo r6 = com.google.android.gms.internal.ads.awo.zzi(r3, r1, r4)
            r11.add(r6)
            int r1 = r1 + r4
            goto L_0x016f
        L_0x0196:
            com.google.android.gms.internal.ads.ayi r1 = com.google.android.gms.internal.ads.ayi.m34778a()
            throw r1
        L_0x019b:
            com.google.android.gms.internal.ads.ayi r1 = com.google.android.gms.internal.ads.ayi.m34779b()
            throw r1
        L_0x01a0:
            com.google.android.gms.internal.ads.ayi r1 = com.google.android.gms.internal.ads.ayi.m34778a()
            throw r1
        L_0x01a5:
            com.google.android.gms.internal.ads.ayi r1 = com.google.android.gms.internal.ads.ayi.m34779b()
            throw r1
        L_0x01aa:
            if (r6 != r10) goto L_0x0432
            com.google.android.gms.internal.ads.bab r1 = r0.m34882a(r8)
            r22 = r1
            r23 = r21
            r24 = r18
            r25 = r19
            r26 = r20
            r27 = r11
            r28 = r30
            int r1 = com.google.android.gms.internal.ads.awk.m34272a(r22, r23, r24, r25, r26, r27, r28)
            goto L_0x0433
        L_0x01c4:
            if (r6 != r10) goto L_0x0432
            r8 = 536870912(0x20000000, double:2.652494739E-315)
            long r8 = r25 & r8
            int r1 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r1 != 0) goto L_0x021a
            int r1 = com.google.android.gms.internal.ads.awk.m34276a(r3, r4, r7)
            int r4 = r7.f41461a
            if (r4 < 0) goto L_0x0215
            if (r4 != 0) goto L_0x01df
            java.lang.String r4 = ""
            r11.add(r4)
            goto L_0x01ea
        L_0x01df:
            java.lang.String r6 = new java.lang.String
            java.nio.charset.Charset r8 = com.google.android.gms.internal.ads.ayb.f41627a
            r6.<init>(r3, r1, r4, r8)
            r11.add(r6)
            int r1 = r1 + r4
        L_0x01ea:
            if (r1 >= r5) goto L_0x0433
            int r4 = com.google.android.gms.internal.ads.awk.m34276a(r3, r1, r7)
            int r6 = r7.f41461a
            if (r2 != r6) goto L_0x0433
            int r1 = com.google.android.gms.internal.ads.awk.m34276a(r3, r4, r7)
            int r4 = r7.f41461a
            if (r4 < 0) goto L_0x0210
            if (r4 != 0) goto L_0x0204
            java.lang.String r4 = ""
            r11.add(r4)
            goto L_0x01ea
        L_0x0204:
            java.lang.String r6 = new java.lang.String
            java.nio.charset.Charset r8 = com.google.android.gms.internal.ads.ayb.f41627a
            r6.<init>(r3, r1, r4, r8)
            r11.add(r6)
            int r1 = r1 + r4
            goto L_0x01ea
        L_0x0210:
            com.google.android.gms.internal.ads.ayi r1 = com.google.android.gms.internal.ads.ayi.m34779b()
            throw r1
        L_0x0215:
            com.google.android.gms.internal.ads.ayi r1 = com.google.android.gms.internal.ads.ayi.m34779b()
            throw r1
        L_0x021a:
            int r1 = com.google.android.gms.internal.ads.awk.m34276a(r3, r4, r7)
            int r4 = r7.f41461a
            if (r4 < 0) goto L_0x0279
            if (r4 != 0) goto L_0x022a
            java.lang.String r4 = ""
            r11.add(r4)
            goto L_0x023d
        L_0x022a:
            int r6 = r1 + r4
            boolean r8 = com.google.android.gms.internal.ads.bbc.m35233a(r3, r1, r6)
            if (r8 == 0) goto L_0x0274
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.google.android.gms.internal.ads.ayb.f41627a
            r8.<init>(r3, r1, r4, r9)
            r11.add(r8)
        L_0x023c:
            r1 = r6
        L_0x023d:
            if (r1 >= r5) goto L_0x0433
            int r4 = com.google.android.gms.internal.ads.awk.m34276a(r3, r1, r7)
            int r6 = r7.f41461a
            if (r2 != r6) goto L_0x0433
            int r1 = com.google.android.gms.internal.ads.awk.m34276a(r3, r4, r7)
            int r4 = r7.f41461a
            if (r4 < 0) goto L_0x026f
            if (r4 != 0) goto L_0x0257
            java.lang.String r4 = ""
            r11.add(r4)
            goto L_0x023d
        L_0x0257:
            int r6 = r1 + r4
            boolean r8 = com.google.android.gms.internal.ads.bbc.m35233a(r3, r1, r6)
            if (r8 == 0) goto L_0x026a
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.google.android.gms.internal.ads.ayb.f41627a
            r8.<init>(r3, r1, r4, r9)
            r11.add(r8)
            goto L_0x023c
        L_0x026a:
            com.google.android.gms.internal.ads.ayi r1 = com.google.android.gms.internal.ads.ayi.m34785h()
            throw r1
        L_0x026f:
            com.google.android.gms.internal.ads.ayi r1 = com.google.android.gms.internal.ads.ayi.m34779b()
            throw r1
        L_0x0274:
            com.google.android.gms.internal.ads.ayi r1 = com.google.android.gms.internal.ads.ayi.m34785h()
            throw r1
        L_0x0279:
            com.google.android.gms.internal.ads.ayi r1 = com.google.android.gms.internal.ads.ayi.m34779b()
            throw r1
        L_0x027e:
            r1 = 0
            if (r6 != r10) goto L_0x02a6
            com.google.android.gms.internal.ads.awm r11 = (com.google.android.gms.internal.ads.awm) r11
            int r2 = com.google.android.gms.internal.ads.awk.m34276a(r3, r4, r7)
            int r4 = r7.f41461a
            int r4 = r4 + r2
        L_0x028a:
            if (r2 >= r4) goto L_0x029d
            int r2 = com.google.android.gms.internal.ads.awk.m34278b(r3, r2, r7)
            long r5 = r7.f41462b
            int r8 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r8 == 0) goto L_0x0298
            r5 = 1
            goto L_0x0299
        L_0x0298:
            r5 = 0
        L_0x0299:
            r11.mo29604a(r5)
            goto L_0x028a
        L_0x029d:
            if (r2 != r4) goto L_0x02a1
            goto L_0x014e
        L_0x02a1:
            com.google.android.gms.internal.ads.ayi r1 = com.google.android.gms.internal.ads.ayi.m34778a()
            throw r1
        L_0x02a6:
            if (r6 != 0) goto L_0x0432
            com.google.android.gms.internal.ads.awm r11 = (com.google.android.gms.internal.ads.awm) r11
            int r4 = com.google.android.gms.internal.ads.awk.m34278b(r3, r4, r7)
            long r8 = r7.f41462b
            int r6 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r6 == 0) goto L_0x02b6
            r6 = 1
            goto L_0x02b7
        L_0x02b6:
            r6 = 0
        L_0x02b7:
            r11.mo29604a(r6)
        L_0x02ba:
            if (r4 >= r5) goto L_0x0432
            int r6 = com.google.android.gms.internal.ads.awk.m34276a(r3, r4, r7)
            int r8 = r7.f41461a
            if (r2 != r8) goto L_0x0432
            int r4 = com.google.android.gms.internal.ads.awk.m34278b(r3, r6, r7)
            long r8 = r7.f41462b
            int r6 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r6 == 0) goto L_0x02d0
            r6 = 1
            goto L_0x02d1
        L_0x02d0:
            r6 = 0
        L_0x02d1:
            r11.mo29604a(r6)
            goto L_0x02ba
        L_0x02d5:
            if (r6 != r10) goto L_0x02f5
            com.google.android.gms.internal.ads.aya r11 = (com.google.android.gms.internal.ads.aya) r11
            int r1 = com.google.android.gms.internal.ads.awk.m34276a(r3, r4, r7)
            int r2 = r7.f41461a
            int r2 = r2 + r1
        L_0x02e0:
            if (r1 >= r2) goto L_0x02ec
            int r4 = com.google.android.gms.internal.ads.awk.m34275a(r3, r1)
            r11.mo29835d(r4)
            int r1 = r1 + 4
            goto L_0x02e0
        L_0x02ec:
            if (r1 != r2) goto L_0x02f0
            goto L_0x0433
        L_0x02f0:
            com.google.android.gms.internal.ads.ayi r1 = com.google.android.gms.internal.ads.ayi.m34778a()
            throw r1
        L_0x02f5:
            if (r6 != r9) goto L_0x0432
            com.google.android.gms.internal.ads.aya r11 = (com.google.android.gms.internal.ads.aya) r11
            int r1 = com.google.android.gms.internal.ads.awk.m34275a(r18, r19)
            r11.mo29835d(r1)
            int r1 = r4 + 4
        L_0x0302:
            if (r1 >= r5) goto L_0x0433
            int r4 = com.google.android.gms.internal.ads.awk.m34276a(r3, r1, r7)
            int r6 = r7.f41461a
            if (r2 != r6) goto L_0x0433
            int r1 = com.google.android.gms.internal.ads.awk.m34275a(r3, r4)
            r11.mo29835d(r1)
            int r1 = r4 + 4
            goto L_0x0302
        L_0x0316:
            if (r6 != r10) goto L_0x0336
            com.google.android.gms.internal.ads.ayx r11 = (com.google.android.gms.internal.ads.ayx) r11
            int r1 = com.google.android.gms.internal.ads.awk.m34276a(r3, r4, r7)
            int r2 = r7.f41461a
            int r2 = r2 + r1
        L_0x0321:
            if (r1 >= r2) goto L_0x032d
            long r4 = com.google.android.gms.internal.ads.awk.m34279b(r3, r1)
            r11.mo29864a(r4)
            int r1 = r1 + 8
            goto L_0x0321
        L_0x032d:
            if (r1 != r2) goto L_0x0331
            goto L_0x0433
        L_0x0331:
            com.google.android.gms.internal.ads.ayi r1 = com.google.android.gms.internal.ads.ayi.m34778a()
            throw r1
        L_0x0336:
            if (r6 != r13) goto L_0x0432
            com.google.android.gms.internal.ads.ayx r11 = (com.google.android.gms.internal.ads.ayx) r11
            long r8 = com.google.android.gms.internal.ads.awk.m34279b(r18, r19)
            r11.mo29864a(r8)
            int r1 = r4 + 8
        L_0x0343:
            if (r1 >= r5) goto L_0x0433
            int r4 = com.google.android.gms.internal.ads.awk.m34276a(r3, r1, r7)
            int r6 = r7.f41461a
            if (r2 != r6) goto L_0x0433
            long r8 = com.google.android.gms.internal.ads.awk.m34279b(r3, r4)
            r11.mo29864a(r8)
            int r1 = r4 + 8
            goto L_0x0343
        L_0x0357:
            if (r6 != r10) goto L_0x035f
            int r1 = com.google.android.gms.internal.ads.awk.m34277a(r3, r4, r11, r7)
            goto L_0x0433
        L_0x035f:
            if (r6 != 0) goto L_0x0432
            r22 = r18
            r23 = r19
            r24 = r20
            r25 = r11
            r26 = r30
            int r1 = com.google.android.gms.internal.ads.awk.m34269a(r21, r22, r23, r24, r25, r26)
            goto L_0x0433
        L_0x0371:
            if (r6 != r10) goto L_0x0391
            com.google.android.gms.internal.ads.ayx r11 = (com.google.android.gms.internal.ads.ayx) r11
            int r1 = com.google.android.gms.internal.ads.awk.m34276a(r3, r4, r7)
            int r2 = r7.f41461a
            int r2 = r2 + r1
        L_0x037c:
            if (r1 >= r2) goto L_0x0388
            int r1 = com.google.android.gms.internal.ads.awk.m34278b(r3, r1, r7)
            long r4 = r7.f41462b
            r11.mo29864a(r4)
            goto L_0x037c
        L_0x0388:
            if (r1 != r2) goto L_0x038c
            goto L_0x0433
        L_0x038c:
            com.google.android.gms.internal.ads.ayi r1 = com.google.android.gms.internal.ads.ayi.m34778a()
            throw r1
        L_0x0391:
            if (r6 != 0) goto L_0x0432
            com.google.android.gms.internal.ads.ayx r11 = (com.google.android.gms.internal.ads.ayx) r11
            int r1 = com.google.android.gms.internal.ads.awk.m34278b(r3, r4, r7)
            long r8 = r7.f41462b
            r11.mo29864a(r8)
        L_0x039e:
            if (r1 >= r5) goto L_0x0433
            int r4 = com.google.android.gms.internal.ads.awk.m34276a(r3, r1, r7)
            int r6 = r7.f41461a
            if (r2 != r6) goto L_0x0433
            int r1 = com.google.android.gms.internal.ads.awk.m34278b(r3, r4, r7)
            long r8 = r7.f41462b
            r11.mo29864a(r8)
            goto L_0x039e
        L_0x03b2:
            if (r6 != r10) goto L_0x03d1
            com.google.android.gms.internal.ads.axw r11 = (com.google.android.gms.internal.ads.axw) r11
            int r1 = com.google.android.gms.internal.ads.awk.m34276a(r3, r4, r7)
            int r2 = r7.f41461a
            int r2 = r2 + r1
        L_0x03bd:
            if (r1 >= r2) goto L_0x03c9
            float r4 = com.google.android.gms.internal.ads.awk.m34282d(r3, r1)
            r11.mo29813a(r4)
            int r1 = r1 + 4
            goto L_0x03bd
        L_0x03c9:
            if (r1 != r2) goto L_0x03cc
            goto L_0x0433
        L_0x03cc:
            com.google.android.gms.internal.ads.ayi r1 = com.google.android.gms.internal.ads.ayi.m34778a()
            throw r1
        L_0x03d1:
            if (r6 != r9) goto L_0x0432
            com.google.android.gms.internal.ads.axw r11 = (com.google.android.gms.internal.ads.axw) r11
            float r1 = com.google.android.gms.internal.ads.awk.m34282d(r18, r19)
            r11.mo29813a(r1)
            int r1 = r4 + 4
        L_0x03de:
            if (r1 >= r5) goto L_0x0433
            int r4 = com.google.android.gms.internal.ads.awk.m34276a(r3, r1, r7)
            int r6 = r7.f41461a
            if (r2 != r6) goto L_0x0433
            float r1 = com.google.android.gms.internal.ads.awk.m34282d(r3, r4)
            r11.mo29813a(r1)
            int r1 = r4 + 4
            goto L_0x03de
        L_0x03f2:
            if (r6 != r10) goto L_0x0411
            com.google.android.gms.internal.ads.axi r11 = (com.google.android.gms.internal.ads.axi) r11
            int r1 = com.google.android.gms.internal.ads.awk.m34276a(r3, r4, r7)
            int r2 = r7.f41461a
            int r2 = r2 + r1
        L_0x03fd:
            if (r1 >= r2) goto L_0x0409
            double r4 = com.google.android.gms.internal.ads.awk.m34280c(r3, r1)
            r11.mo29780a(r4)
            int r1 = r1 + 8
            goto L_0x03fd
        L_0x0409:
            if (r1 != r2) goto L_0x040c
            goto L_0x0433
        L_0x040c:
            com.google.android.gms.internal.ads.ayi r1 = com.google.android.gms.internal.ads.ayi.m34778a()
            throw r1
        L_0x0411:
            if (r6 != r13) goto L_0x0432
            com.google.android.gms.internal.ads.axi r11 = (com.google.android.gms.internal.ads.axi) r11
            double r8 = com.google.android.gms.internal.ads.awk.m34280c(r18, r19)
            r11.mo29780a(r8)
            int r1 = r4 + 8
        L_0x041e:
            if (r1 >= r5) goto L_0x0433
            int r4 = com.google.android.gms.internal.ads.awk.m34276a(r3, r1, r7)
            int r6 = r7.f41461a
            if (r2 != r6) goto L_0x0433
            double r8 = com.google.android.gms.internal.ads.awk.m34280c(r3, r4)
            r11.mo29780a(r8)
            int r1 = r4 + 8
            goto L_0x041e
        L_0x0432:
            r1 = r4
        L_0x0433:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.azo.m34878a(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.ads.awl):int");
    }

    /* JADX WARNING: type inference failed for: r10v4, types: [int] */
    /* JADX WARNING: type inference failed for: r10v11 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final <K, V> int m34879a(T r8, byte[] r9, int r10, int r11, int r12, long r13, com.google.android.gms.internal.ads.awl r15) throws java.io.IOException {
        /*
            r7 = this;
            sun.misc.Unsafe r0 = f41665b
            java.lang.Object r12 = r7.m34898b(r12)
            java.lang.Object r1 = r0.getObject(r8, r13)
            com.google.android.gms.internal.ads.aze r2 = r7.f41682s
            boolean r2 = r2.mo29885c(r1)
            if (r2 == 0) goto L_0x0021
            com.google.android.gms.internal.ads.aze r2 = r7.f41682s
            java.lang.Object r2 = r2.mo29887e(r12)
            com.google.android.gms.internal.ads.aze r3 = r7.f41682s
            r3.mo29882a(r2, r1)
            r0.putObject(r8, r13, r2)
            r1 = r2
        L_0x0021:
            com.google.android.gms.internal.ads.aze r8 = r7.f41682s
            com.google.android.gms.internal.ads.azc r8 = r8.mo29888f(r12)
            com.google.android.gms.internal.ads.aze r12 = r7.f41682s
            java.util.Map r12 = r12.mo29883a(r1)
            int r10 = com.google.android.gms.internal.ads.awk.m34276a(r9, r10, r15)
            int r13 = r15.f41461a
            if (r13 < 0) goto L_0x0094
            int r14 = r11 - r10
            if (r13 > r14) goto L_0x0094
            int r13 = r13 + r10
            K r14 = r8.f41657b
            V r0 = r8.f41659d
        L_0x003e:
            if (r10 >= r13) goto L_0x0089
            int r1 = r10 + 1
            byte r10 = r9[r10]
            if (r10 >= 0) goto L_0x004c
            int r1 = com.google.android.gms.internal.ads.awk.m34271a(r10, r9, r1, r15)
            int r10 = r15.f41461a
        L_0x004c:
            r2 = r1
            int r1 = r10 >>> 3
            r3 = r10 & 7
            switch(r1) {
                case 1: goto L_0x006f;
                case 2: goto L_0x0055;
                default: goto L_0x0054;
            }
        L_0x0054:
            goto L_0x0084
        L_0x0055:
            com.google.android.gms.internal.ads.bbj r1 = r8.f41658c
            int r1 = r1.zzawb()
            if (r3 != r1) goto L_0x0084
            com.google.android.gms.internal.ads.bbj r4 = r8.f41658c
            V r10 = r8.f41659d
            java.lang.Class r5 = r10.getClass()
            r1 = r9
            r3 = r11
            r6 = r15
            int r10 = m34880a(r1, r2, r3, r4, r5, r6)
            java.lang.Object r0 = r15.f41463c
            goto L_0x003e
        L_0x006f:
            com.google.android.gms.internal.ads.bbj r1 = r8.f41656a
            int r1 = r1.zzawb()
            if (r3 != r1) goto L_0x0084
            com.google.android.gms.internal.ads.bbj r4 = r8.f41656a
            r5 = 0
            r1 = r9
            r3 = r11
            r6 = r15
            int r10 = m34880a(r1, r2, r3, r4, r5, r6)
            java.lang.Object r14 = r15.f41463c
            goto L_0x003e
        L_0x0084:
            int r10 = com.google.android.gms.internal.ads.awk.m34268a(r10, r9, r2, r11, r15)
            goto L_0x003e
        L_0x0089:
            if (r10 != r13) goto L_0x008f
            r12.put(r14, r0)
            return r13
        L_0x008f:
            com.google.android.gms.internal.ads.ayi r8 = com.google.android.gms.internal.ads.ayi.m34784g()
            throw r8
        L_0x0094:
            com.google.android.gms.internal.ads.ayi r8 = com.google.android.gms.internal.ads.ayi.m34778a()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.azo.m34879a(java.lang.Object, byte[], int, int, int, long, com.google.android.gms.internal.ads.awl):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01a1, code lost:
        r12.putInt(r1, r13, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
        return r2;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m34877a(T r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, int r25, long r26, int r28, com.google.android.gms.internal.ads.awl r29) throws java.io.IOException {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r18
            r4 = r19
            r2 = r21
            r8 = r22
            r5 = r23
            r9 = r26
            r6 = r28
            r11 = r29
            sun.misc.Unsafe r12 = f41665b
            int[] r7 = r0.f41666c
            int r13 = r6 + 2
            r7 = r7[r13]
            r13 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r13
            long r13 = (long) r7
            r7 = 5
            r15 = 2
            switch(r25) {
                case 51: goto L_0x0191;
                case 52: goto L_0x0181;
                case 53: goto L_0x0171;
                case 54: goto L_0x0171;
                case 55: goto L_0x0161;
                case 56: goto L_0x0150;
                case 57: goto L_0x0140;
                case 58: goto L_0x0127;
                case 59: goto L_0x00f3;
                case 60: goto L_0x00c5;
                case 61: goto L_0x00b8;
                case 62: goto L_0x0161;
                case 63: goto L_0x008a;
                case 64: goto L_0x0140;
                case 65: goto L_0x0150;
                case 66: goto L_0x0075;
                case 67: goto L_0x0060;
                case 68: goto L_0x0028;
                default: goto L_0x0026;
            }
        L_0x0026:
            goto L_0x01a5
        L_0x0028:
            r7 = 3
            if (r5 != r7) goto L_0x01a5
            r2 = r2 & -8
            r7 = r2 | 4
            com.google.android.gms.internal.ads.bab r2 = r0.m34882a(r6)
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r7
            r7 = r29
            int r2 = com.google.android.gms.internal.ads.awk.m34273a(r2, r3, r4, r5, r6, r7)
            int r3 = r12.getInt(r1, r13)
            if (r3 != r8) goto L_0x004b
            java.lang.Object r15 = r12.getObject(r1, r9)
            goto L_0x004c
        L_0x004b:
            r15 = 0
        L_0x004c:
            if (r15 != 0) goto L_0x0055
            java.lang.Object r3 = r11.f41463c
            r12.putObject(r1, r9, r3)
            goto L_0x01a1
        L_0x0055:
            java.lang.Object r3 = r11.f41463c
            java.lang.Object r3 = com.google.android.gms.internal.ads.ayb.m34769a(r15, r3)
            r12.putObject(r1, r9, r3)
            goto L_0x01a1
        L_0x0060:
            if (r5 != 0) goto L_0x01a5
            int r2 = com.google.android.gms.internal.ads.awk.m34278b(r3, r4, r11)
            long r3 = r11.f41462b
            long r3 = com.google.android.gms.internal.ads.axa.m34317a(r3)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r12.putObject(r1, r9, r3)
            goto L_0x01a1
        L_0x0075:
            if (r5 != 0) goto L_0x01a5
            int r2 = com.google.android.gms.internal.ads.awk.m34276a(r3, r4, r11)
            int r3 = r11.f41461a
            int r3 = com.google.android.gms.internal.ads.axa.m34319e(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r12.putObject(r1, r9, r3)
            goto L_0x01a1
        L_0x008a:
            if (r5 != 0) goto L_0x01a5
            int r3 = com.google.android.gms.internal.ads.awk.m34276a(r3, r4, r11)
            int r4 = r11.f41461a
            com.google.android.gms.internal.ads.aye r5 = r0.m34904c(r6)
            if (r5 == 0) goto L_0x00ae
            boolean r5 = r5.mo29113a(r4)
            if (r5 == 0) goto L_0x009f
            goto L_0x00ae
        L_0x009f:
            com.google.android.gms.internal.ads.bav r1 = m34910e(r17)
            long r4 = (long) r4
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r1.mo29972a(r2, r4)
            r2 = r3
            goto L_0x01a6
        L_0x00ae:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r12.putObject(r1, r9, r2)
            r2 = r3
            goto L_0x01a1
        L_0x00b8:
            if (r5 != r15) goto L_0x01a5
            int r2 = com.google.android.gms.internal.ads.awk.m34284e(r3, r4, r11)
            java.lang.Object r3 = r11.f41463c
            r12.putObject(r1, r9, r3)
            goto L_0x01a1
        L_0x00c5:
            if (r5 != r15) goto L_0x01a5
            com.google.android.gms.internal.ads.bab r2 = r0.m34882a(r6)
            r5 = r20
            int r2 = com.google.android.gms.internal.ads.awk.m34274a(r2, r3, r4, r5, r11)
            int r3 = r12.getInt(r1, r13)
            if (r3 != r8) goto L_0x00dc
            java.lang.Object r15 = r12.getObject(r1, r9)
            goto L_0x00dd
        L_0x00dc:
            r15 = 0
        L_0x00dd:
            if (r15 != 0) goto L_0x00e5
            java.lang.Object r3 = r11.f41463c
            r12.putObject(r1, r9, r3)
            goto L_0x00ee
        L_0x00e5:
            java.lang.Object r3 = r11.f41463c
            java.lang.Object r3 = com.google.android.gms.internal.ads.ayb.m34769a(r15, r3)
            r12.putObject(r1, r9, r3)
        L_0x00ee:
            r12.putInt(r1, r13, r8)
            goto L_0x01a6
        L_0x00f3:
            if (r5 != r15) goto L_0x01a5
            int r2 = com.google.android.gms.internal.ads.awk.m34276a(r3, r4, r11)
            int r4 = r11.f41461a
            if (r4 != 0) goto L_0x0103
            java.lang.String r3 = ""
            r12.putObject(r1, r9, r3)
            goto L_0x0122
        L_0x0103:
            r5 = 536870912(0x20000000, float:1.0842022E-19)
            r5 = r24 & r5
            if (r5 == 0) goto L_0x0117
            int r5 = r2 + r4
            boolean r5 = com.google.android.gms.internal.ads.bbc.m35233a(r3, r2, r5)
            if (r5 == 0) goto L_0x0112
            goto L_0x0117
        L_0x0112:
            com.google.android.gms.internal.ads.ayi r1 = com.google.android.gms.internal.ads.ayi.m34785h()
            throw r1
        L_0x0117:
            java.lang.String r5 = new java.lang.String
            java.nio.charset.Charset r6 = com.google.android.gms.internal.ads.ayb.f41627a
            r5.<init>(r3, r2, r4, r6)
            r12.putObject(r1, r9, r5)
            int r2 = r2 + r4
        L_0x0122:
            r12.putInt(r1, r13, r8)
            goto L_0x01a6
        L_0x0127:
            if (r5 != 0) goto L_0x01a5
            int r2 = com.google.android.gms.internal.ads.awk.m34278b(r3, r4, r11)
            long r3 = r11.f41462b
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0137
            r15 = 1
            goto L_0x0138
        L_0x0137:
            r15 = 0
        L_0x0138:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r15)
            r12.putObject(r1, r9, r3)
            goto L_0x01a1
        L_0x0140:
            if (r5 != r7) goto L_0x01a5
            int r2 = com.google.android.gms.internal.ads.awk.m34275a(r18, r19)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r12.putObject(r1, r9, r2)
            int r2 = r4 + 4
            goto L_0x01a1
        L_0x0150:
            r2 = 1
            if (r5 != r2) goto L_0x01a5
            long r2 = com.google.android.gms.internal.ads.awk.m34279b(r18, r19)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r12.putObject(r1, r9, r2)
            int r2 = r4 + 8
            goto L_0x01a1
        L_0x0161:
            if (r5 != 0) goto L_0x01a5
            int r2 = com.google.android.gms.internal.ads.awk.m34276a(r3, r4, r11)
            int r3 = r11.f41461a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r12.putObject(r1, r9, r3)
            goto L_0x01a1
        L_0x0171:
            if (r5 != 0) goto L_0x01a5
            int r2 = com.google.android.gms.internal.ads.awk.m34278b(r3, r4, r11)
            long r3 = r11.f41462b
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r12.putObject(r1, r9, r3)
            goto L_0x01a1
        L_0x0181:
            if (r5 != r7) goto L_0x01a5
            float r2 = com.google.android.gms.internal.ads.awk.m34282d(r18, r19)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r12.putObject(r1, r9, r2)
            int r2 = r4 + 4
            goto L_0x01a1
        L_0x0191:
            r2 = 1
            if (r5 != r2) goto L_0x01a5
            double r2 = com.google.android.gms.internal.ads.awk.m34280c(r18, r19)
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            r12.putObject(r1, r9, r2)
            int r2 = r4 + 8
        L_0x01a1:
            r12.putInt(r1, r13, r8)
            goto L_0x01a6
        L_0x01a5:
            r2 = r4
        L_0x01a6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.azo.m34877a(java.lang.Object, byte[], int, int, int, int, int, int, int, long, int, com.google.android.gms.internal.ads.awl):int");
    }

    /* renamed from: a */
    private final bab m34882a(int i) {
        int i2 = (i / 3) << 1;
        bab bab = (bab) this.f41667d[i2];
        if (bab != null) {
            return bab;
        }
        bab a = azx.m34942a().mo29905a((Class) this.f41667d[i2 + 1]);
        this.f41667d[i2] = a;
        return a;
    }

    /* renamed from: b */
    private final Object m34898b(int i) {
        return this.f41667d[(i / 3) << 1];
    }

    /* renamed from: c */
    private final aye m34904c(int i) {
        return (aye) this.f41667d[((i / 3) << 1) + 1];
    }

    /* JADX WARNING: type inference failed for: r32v0, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r12v0 */
    /* JADX WARNING: type inference failed for: r12v1, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r0v12, types: [int, byte] */
    /* JADX WARNING: type inference failed for: r5v1, types: [int] */
    /* JADX WARNING: type inference failed for: r12v4 */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: type inference failed for: r6v3 */
    /* JADX WARNING: type inference failed for: r12v5 */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: type inference failed for: r0v18, types: [int] */
    /* JADX WARNING: type inference failed for: r1v14, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r3v8 */
    /* JADX WARNING: type inference failed for: r12v7 */
    /* JADX WARNING: type inference failed for: r0v26, types: [int] */
    /* JADX WARNING: type inference failed for: r1v23, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r12v9 */
    /* JADX WARNING: type inference failed for: r3v10 */
    /* JADX WARNING: type inference failed for: r3v11 */
    /* JADX WARNING: type inference failed for: r20v0 */
    /* JADX WARNING: type inference failed for: r6v7 */
    /* JADX WARNING: type inference failed for: r13v6 */
    /* JADX WARNING: type inference failed for: r12v11 */
    /* JADX WARNING: type inference failed for: r29v0 */
    /* JADX WARNING: type inference failed for: r6v8 */
    /* JADX WARNING: type inference failed for: r29v1 */
    /* JADX WARNING: type inference failed for: r29v2 */
    /* JADX WARNING: type inference failed for: r2v14, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r5v7, types: [int] */
    /* JADX WARNING: type inference failed for: r6v10 */
    /* JADX WARNING: type inference failed for: r12v13 */
    /* JADX WARNING: type inference failed for: r3v13 */
    /* JADX WARNING: type inference failed for: r2v16, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r12v14 */
    /* JADX WARNING: type inference failed for: r3v15 */
    /* JADX WARNING: type inference failed for: r29v3 */
    /* JADX WARNING: type inference failed for: r12v15 */
    /* JADX WARNING: type inference failed for: r3v16 */
    /* JADX WARNING: type inference failed for: r29v4 */
    /* JADX WARNING: type inference failed for: r2v20, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r5v10, types: [int] */
    /* JADX WARNING: type inference failed for: r29v5 */
    /* JADX WARNING: type inference failed for: r29v6 */
    /* JADX WARNING: type inference failed for: r1v40, types: [int] */
    /* JADX WARNING: type inference failed for: r2v21, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r3v19 */
    /* JADX WARNING: type inference failed for: r12v17 */
    /* JADX WARNING: type inference failed for: r3v20 */
    /* JADX WARNING: type inference failed for: r12v18 */
    /* JADX WARNING: type inference failed for: r3v21 */
    /* JADX WARNING: type inference failed for: r13v10 */
    /* JADX WARNING: type inference failed for: r6v21 */
    /* JADX WARNING: type inference failed for: r13v11 */
    /* JADX WARNING: type inference failed for: r12v19 */
    /* JADX WARNING: type inference failed for: r3v22 */
    /* JADX WARNING: type inference failed for: r13v12 */
    /* JADX WARNING: type inference failed for: r12v20 */
    /* JADX WARNING: type inference failed for: r13v13 */
    /* JADX WARNING: type inference failed for: r12v21, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r13v14 */
    /* JADX WARNING: type inference failed for: r12v22, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r13v15 */
    /* JADX WARNING: type inference failed for: r12v23 */
    /* JADX WARNING: type inference failed for: r13v16 */
    /* JADX WARNING: type inference failed for: r12v24, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r13v17 */
    /* JADX WARNING: type inference failed for: r12v25, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r13v18 */
    /* JADX WARNING: type inference failed for: r13v19 */
    /* JADX WARNING: type inference failed for: r12v26, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r13v20 */
    /* JADX WARNING: type inference failed for: r12v27 */
    /* JADX WARNING: type inference failed for: r3v23 */
    /* JADX WARNING: type inference failed for: r13v22 */
    /* JADX WARNING: type inference failed for: r12v28, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r13v23 */
    /* JADX WARNING: type inference failed for: r12v29, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r13v24 */
    /* JADX WARNING: type inference failed for: r12v30, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r13v25 */
    /* JADX WARNING: type inference failed for: r12v31, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r13v26 */
    /* JADX WARNING: type inference failed for: r13v27 */
    /* JADX WARNING: type inference failed for: r12v32, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r13v28, types: [int] */
    /* JADX WARNING: type inference failed for: r12v33, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r13v29 */
    /* JADX WARNING: type inference failed for: r12v34, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r13v30 */
    /* JADX WARNING: type inference failed for: r12v35 */
    /* JADX WARNING: type inference failed for: r12v36, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r13v31 */
    /* JADX WARNING: type inference failed for: r1v73, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r13v32 */
    /* JADX WARNING: type inference failed for: r3v26 */
    /* JADX WARNING: type inference failed for: r12v37 */
    /* JADX WARNING: type inference failed for: r13v33 */
    /* JADX WARNING: type inference failed for: r13v34 */
    /* JADX WARNING: type inference failed for: r12v38 */
    /* JADX WARNING: type inference failed for: r13v35 */
    /* JADX WARNING: type inference failed for: r6v37 */
    /* JADX WARNING: type inference failed for: r5v17 */
    /* JADX WARNING: type inference failed for: r3v27, types: [int] */
    /* JADX WARNING: type inference failed for: r5v18 */
    /* JADX WARNING: type inference failed for: r12v39 */
    /* JADX WARNING: type inference failed for: r3v28 */
    /* JADX WARNING: type inference failed for: r12v40 */
    /* JADX WARNING: type inference failed for: r3v29 */
    /* JADX WARNING: type inference failed for: r6v38 */
    /* JADX WARNING: type inference failed for: r29v7 */
    /* JADX WARNING: type inference failed for: r12v41 */
    /* JADX WARNING: type inference failed for: r3v30 */
    /* JADX WARNING: type inference failed for: r29v8 */
    /* JADX WARNING: type inference failed for: r12v42 */
    /* JADX WARNING: type inference failed for: r3v31 */
    /* JADX WARNING: type inference failed for: r12v43 */
    /* JADX WARNING: type inference failed for: r3v32 */
    /* JADX WARNING: type inference failed for: r12v44 */
    /* JADX WARNING: type inference failed for: r13v36 */
    /* JADX WARNING: type inference failed for: r12v45 */
    /* JADX WARNING: type inference failed for: r12v46 */
    /* JADX WARNING: type inference failed for: r12v47 */
    /* JADX WARNING: type inference failed for: r13v37 */
    /* JADX WARNING: type inference failed for: r12v48 */
    /* JADX WARNING: type inference failed for: r12v49 */
    /* JADX WARNING: type inference failed for: r12v50 */
    /* JADX WARNING: type inference failed for: r13v38 */
    /* JADX WARNING: type inference failed for: r12v51 */
    /* JADX WARNING: type inference failed for: r12v52 */
    /* JADX WARNING: type inference failed for: r12v53 */
    /* JADX WARNING: type inference failed for: r12v54 */
    /* JADX WARNING: type inference failed for: r12v55 */
    /* JADX WARNING: type inference failed for: r13v39 */
    /* JADX WARNING: type inference failed for: r13v40 */
    /* JADX WARNING: type inference failed for: r13v41 */
    /* JADX WARNING: type inference failed for: r12v56 */
    /* JADX WARNING: type inference failed for: r12v57 */
    /* JADX WARNING: type inference failed for: r13v42 */
    /* JADX WARNING: type inference failed for: r12v58 */
    /* JADX WARNING: type inference failed for: r12v59 */
    /* JADX WARNING: type inference failed for: r12v60 */
    /* JADX WARNING: type inference failed for: r12v61 */
    /* JADX WARNING: type inference failed for: r13v43 */
    /* JADX WARNING: type inference failed for: r13v44 */
    /* JADX WARNING: type inference failed for: r12v62 */
    /* JADX WARNING: type inference failed for: r13v45 */
    /* JADX WARNING: type inference failed for: r13v46 */
    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x02ba, code lost:
        r19 = r6;
        r18 = r8;
        r28 = r10;
        r2 = r11;
        r6 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0354, code lost:
        if (r0 == r15) goto L_0x0356;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0358, code lost:
        r12 = r32;
        r2 = r18;
        r6 = r19;
        r7 = r24;
        r1 = r25;
        r10 = r28;
        r3 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x039f, code lost:
        if (r0 == r15) goto L_0x0356;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0017, code lost:
        r12 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0098, code lost:
        r12 = r32;
        r13 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x009a, code lost:
        r13 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0173, code lost:
        r11 = r4;
        r13 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0214, code lost:
        r6 = r6 | r22;
        r2 = r8;
        r3 = r13;
        r1 = r25;
        r13 = r11;
        r11 = r35;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0240, code lost:
        r11 = r4;
        r13 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0279, code lost:
        r2 = r8;
        r0 = r11;
        r13 = r13;
        r12 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x02b0, code lost:
        r2 = r8;
        r13 = r13;
        r12 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x02b1, code lost:
        r3 = r13;
        r12 = r12;
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=null, for r0v12, types: [int, byte] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte[], code=null, for r32v0, types: [byte[]] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r12v4
      assigns: []
      uses: []
      mth insns count: 570
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
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 64 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo29893a(T r31, byte[] r32, int r33, int r34, int r35, com.google.android.gms.internal.ads.awl r36) throws java.io.IOException {
        /*
            r30 = this;
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            r9 = r36
            sun.misc.Unsafe r10 = f41665b
            r16 = 0
            r0 = r33
            r1 = -1
            r2 = 0
            r3 = 0
            r6 = 0
            r7 = -1
        L_0x0017:
            if (r0 >= r13) goto L_0x0468
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x0028
            int r0 = com.google.android.gms.internal.ads.awk.m34271a(r0, r12, r3, r9)
            int r3 = r9.f41461a
            r4 = r0
            r5 = r3
            goto L_0x002a
        L_0x0028:
            r5 = r0
            r4 = r3
        L_0x002a:
            int r3 = r5 >>> 3
            r0 = r5 & 7
            r8 = 3
            if (r3 <= r1) goto L_0x0039
            int r2 = r2 / r8
            int r1 = r15.m34875a(r3, r2)
        L_0x0036:
            r2 = r1
            r1 = -1
            goto L_0x003e
        L_0x0039:
            int r1 = r15.m34913g(r3)
            goto L_0x0036
        L_0x003e:
            if (r2 != r1) goto L_0x004d
            r25 = r3
            r2 = r4
            r19 = r6
            r28 = r10
            r0 = r11
            r18 = 0
            r6 = r5
            goto L_0x03c7
        L_0x004d:
            int[] r1 = r15.f41666c
            int r18 = r2 + 1
            r1 = r1[r18]
            r18 = 267386880(0xff00000, float:2.3665827E-29)
            r18 = r1 & r18
            int r8 = r18 >>> 20
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r5
            r5 = r1 & r18
            long r11 = (long) r5
            r5 = 17
            r21 = r1
            if (r8 > r5) goto L_0x02c4
            int[] r5 = r15.f41666c
            int r22 = r2 + 2
            r5 = r5[r22]
            int r22 = r5 >>> 20
            r1 = 1
            int r22 = r1 << r22
            r5 = r5 & r18
            if (r5 == r7) goto L_0x008a
            r13 = -1
            if (r7 == r13) goto L_0x0080
            r24 = r2
            long r1 = (long) r7
            r10.putInt(r14, r1, r6)
            goto L_0x0082
        L_0x0080:
            r24 = r2
        L_0x0082:
            long r1 = (long) r5
            int r1 = r10.getInt(r14, r1)
            r6 = r1
            r7 = r5
            goto L_0x008d
        L_0x008a:
            r24 = r2
            r13 = -1
        L_0x008d:
            r1 = 5
            switch(r8) {
                case 0: goto L_0x0296;
                case 1: goto L_0x027c;
                case 2: goto L_0x025d;
                case 3: goto L_0x025d;
                case 4: goto L_0x0243;
                case 5: goto L_0x021d;
                case 6: goto L_0x01fa;
                case 7: goto L_0x01d6;
                case 8: goto L_0x01af;
                case 9: goto L_0x0176;
                case 10: goto L_0x015a;
                case 11: goto L_0x0243;
                case 12: goto L_0x0127;
                case 13: goto L_0x01fa;
                case 14: goto L_0x021d;
                case 15: goto L_0x010b;
                case 16: goto L_0x00e8;
                case 17: goto L_0x009e;
                default: goto L_0x0091;
            }
        L_0x0091:
            r25 = r3
            r11 = r4
            r13 = r20
            r8 = r24
        L_0x0098:
            r12 = r32
        L_0x009a:
            r17 = -1
            goto L_0x02ba
        L_0x009e:
            r2 = 3
            if (r0 != r2) goto L_0x00e0
            int r0 = r3 << 3
            r5 = r0 | 4
            r2 = r24
            com.google.android.gms.internal.ads.bab r0 = r15.m34882a(r2)
            r1 = r32
            r8 = r2
            r2 = r4
            r4 = r3
            r3 = r34
            r25 = r4
            r4 = r5
            r13 = r20
            r5 = r36
            int r0 = com.google.android.gms.internal.ads.awk.m34273a(r0, r1, r2, r3, r4, r5)
            r1 = r6 & r22
            if (r1 != 0) goto L_0x00c7
            java.lang.Object r1 = r9.f41463c
            r10.putObject(r14, r11, r1)
            goto L_0x00d4
        L_0x00c7:
            java.lang.Object r1 = r10.getObject(r14, r11)
            java.lang.Object r2 = r9.f41463c
            java.lang.Object r1 = com.google.android.gms.internal.ads.ayb.m34769a(r1, r2)
            r10.putObject(r14, r11, r1)
        L_0x00d4:
            r6 = r6 | r22
            r2 = r8
            r3 = r13
            r1 = r25
            r11 = r35
            r12 = r32
            goto L_0x02b6
        L_0x00e0:
            r25 = r3
            r13 = r20
            r8 = r24
            r11 = r4
            goto L_0x0098
        L_0x00e8:
            r25 = r3
            r13 = r20
            r8 = r24
            if (r0 != 0) goto L_0x0107
            r2 = r11
            r12 = r32
            int r11 = com.google.android.gms.internal.ads.awk.m34278b(r12, r4, r9)
            long r0 = r9.f41462b
            long r4 = com.google.android.gms.internal.ads.axa.m34317a(r0)
            r0 = r10
            r1 = r31
            r0.putLong(r1, r2, r4)
            r6 = r6 | r22
            goto L_0x0279
        L_0x0107:
            r12 = r32
            goto L_0x0173
        L_0x010b:
            r25 = r3
            r2 = r11
            r13 = r20
            r8 = r24
            r12 = r32
            if (r0 != 0) goto L_0x0173
            int r0 = com.google.android.gms.internal.ads.awk.m34276a(r12, r4, r9)
            int r1 = r9.f41461a
            int r1 = com.google.android.gms.internal.ads.axa.m34319e(r1)
            r10.putInt(r14, r2, r1)
            r6 = r6 | r22
            goto L_0x02b0
        L_0x0127:
            r25 = r3
            r2 = r11
            r13 = r20
            r8 = r24
            r12 = r32
            if (r0 != 0) goto L_0x0173
            int r0 = com.google.android.gms.internal.ads.awk.m34276a(r12, r4, r9)
            int r1 = r9.f41461a
            com.google.android.gms.internal.ads.aye r4 = r15.m34904c(r8)
            if (r4 == 0) goto L_0x0153
            boolean r4 = r4.mo29113a(r1)
            if (r4 == 0) goto L_0x0145
            goto L_0x0153
        L_0x0145:
            com.google.android.gms.internal.ads.bav r2 = m34910e(r31)
            long r3 = (long) r1
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r2.mo29972a(r13, r1)
            goto L_0x02b0
        L_0x0153:
            r10.putInt(r14, r2, r1)
            r6 = r6 | r22
            goto L_0x02b0
        L_0x015a:
            r25 = r3
            r2 = r11
            r13 = r20
            r8 = r24
            r1 = 2
            r12 = r32
            if (r0 != r1) goto L_0x0173
            int r0 = com.google.android.gms.internal.ads.awk.m34284e(r12, r4, r9)
            java.lang.Object r1 = r9.f41463c
            r10.putObject(r14, r2, r1)
            r6 = r6 | r22
            goto L_0x02b0
        L_0x0173:
            r11 = r4
            goto L_0x009a
        L_0x0176:
            r25 = r3
            r2 = r11
            r13 = r20
            r8 = r24
            r1 = 2
            r12 = r32
            if (r0 != r1) goto L_0x01a9
            com.google.android.gms.internal.ads.bab r0 = r15.m34882a(r8)
            r11 = r34
            r17 = -1
            int r0 = com.google.android.gms.internal.ads.awk.m34274a(r0, r12, r4, r11, r9)
            r1 = r6 & r22
            if (r1 != 0) goto L_0x0198
            java.lang.Object r1 = r9.f41463c
            r10.putObject(r14, r2, r1)
            goto L_0x01a5
        L_0x0198:
            java.lang.Object r1 = r10.getObject(r14, r2)
            java.lang.Object r4 = r9.f41463c
            java.lang.Object r1 = com.google.android.gms.internal.ads.ayb.m34769a(r1, r4)
            r10.putObject(r14, r2, r1)
        L_0x01a5:
            r6 = r6 | r22
            goto L_0x0214
        L_0x01a9:
            r11 = r34
            r17 = -1
            goto L_0x0240
        L_0x01af:
            r25 = r3
            r2 = r11
            r13 = r20
            r8 = r24
            r1 = 2
            r11 = r34
            r12 = r32
            r17 = -1
            if (r0 != r1) goto L_0x0240
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r21 & r0
            if (r0 != 0) goto L_0x01ca
            int r0 = com.google.android.gms.internal.ads.awk.m34281c(r12, r4, r9)
            goto L_0x01ce
        L_0x01ca:
            int r0 = com.google.android.gms.internal.ads.awk.m34283d(r12, r4, r9)
        L_0x01ce:
            java.lang.Object r1 = r9.f41463c
            r10.putObject(r14, r2, r1)
            r6 = r6 | r22
            goto L_0x0214
        L_0x01d6:
            r25 = r3
            r2 = r11
            r13 = r20
            r8 = r24
            r11 = r34
            r12 = r32
            r17 = -1
            if (r0 != 0) goto L_0x0240
            int r0 = com.google.android.gms.internal.ads.awk.m34278b(r12, r4, r9)
            long r4 = r9.f41462b
            r18 = 0
            int r1 = (r4 > r18 ? 1 : (r4 == r18 ? 0 : -1))
            if (r1 == 0) goto L_0x01f3
            r1 = 1
            goto L_0x01f4
        L_0x01f3:
            r1 = 0
        L_0x01f4:
            com.google.android.gms.internal.ads.bba.m35155a(r14, r2, r1)
            r6 = r6 | r22
            goto L_0x0214
        L_0x01fa:
            r25 = r3
            r2 = r11
            r13 = r20
            r8 = r24
            r11 = r34
            r12 = r32
            r17 = -1
            if (r0 != r1) goto L_0x0240
            int r0 = com.google.android.gms.internal.ads.awk.m34275a(r12, r4)
            r10.putInt(r14, r2, r0)
            int r0 = r4 + 4
            r6 = r6 | r22
        L_0x0214:
            r2 = r8
            r3 = r13
            r1 = r25
            r13 = r11
            r11 = r35
            goto L_0x0017
        L_0x021d:
            r25 = r3
            r2 = r11
            r13 = r20
            r8 = r24
            r1 = 1
            r11 = r34
            r12 = r32
            r17 = -1
            if (r0 != r1) goto L_0x0240
            long r18 = com.google.android.gms.internal.ads.awk.m34279b(r12, r4)
            r0 = r10
            r1 = r31
            r11 = r4
            r4 = r18
            r0.putLong(r1, r2, r4)
            int r0 = r11 + 8
            r6 = r6 | r22
            goto L_0x02b0
        L_0x0240:
            r11 = r4
            goto L_0x02ba
        L_0x0243:
            r25 = r3
            r2 = r11
            r13 = r20
            r8 = r24
            r12 = r32
            r17 = -1
            r11 = r4
            if (r0 != 0) goto L_0x02ba
            int r0 = com.google.android.gms.internal.ads.awk.m34276a(r12, r11, r9)
            int r1 = r9.f41461a
            r10.putInt(r14, r2, r1)
            r6 = r6 | r22
            goto L_0x02b0
        L_0x025d:
            r25 = r3
            r2 = r11
            r13 = r20
            r8 = r24
            r12 = r32
            r17 = -1
            r11 = r4
            if (r0 != 0) goto L_0x02ba
            int r11 = com.google.android.gms.internal.ads.awk.m34278b(r12, r11, r9)
            long r4 = r9.f41462b
            r0 = r10
            r1 = r31
            r0.putLong(r1, r2, r4)
            r6 = r6 | r22
        L_0x0279:
            r2 = r8
            r0 = r11
            goto L_0x02b1
        L_0x027c:
            r25 = r3
            r2 = r11
            r13 = r20
            r8 = r24
            r12 = r32
            r17 = -1
            r11 = r4
            if (r0 != r1) goto L_0x02ba
            float r0 = com.google.android.gms.internal.ads.awk.m34282d(r12, r11)
            com.google.android.gms.internal.ads.bba.m35151a(r14, r2, r0)
            int r0 = r11 + 4
            r6 = r6 | r22
            goto L_0x02b0
        L_0x0296:
            r25 = r3
            r2 = r11
            r13 = r20
            r8 = r24
            r1 = 1
            r12 = r32
            r17 = -1
            r11 = r4
            if (r0 != r1) goto L_0x02ba
            double r0 = com.google.android.gms.internal.ads.awk.m34280c(r12, r11)
            com.google.android.gms.internal.ads.bba.m35150a(r14, r2, r0)
            int r0 = r11 + 8
            r6 = r6 | r22
        L_0x02b0:
            r2 = r8
        L_0x02b1:
            r3 = r13
        L_0x02b2:
            r1 = r25
            r11 = r35
        L_0x02b6:
            r13 = r34
            goto L_0x0017
        L_0x02ba:
            r19 = r6
            r18 = r8
            r28 = r10
            r2 = r11
            r6 = r13
            goto L_0x03a7
        L_0x02c4:
            r5 = r2
            r25 = r3
            r2 = r11
            r13 = r20
            r12 = r32
            r17 = -1
            r11 = r4
            r1 = 27
            if (r8 != r1) goto L_0x031d
            r1 = 2
            if (r0 != r1) goto L_0x0310
            java.lang.Object r0 = r10.getObject(r14, r2)
            com.google.android.gms.internal.ads.ayh r0 = (com.google.android.gms.internal.ads.ayh) r0
            boolean r1 = r0.mo29588a()
            if (r1 != 0) goto L_0x02f4
            int r1 = r0.size()
            if (r1 != 0) goto L_0x02eb
            r1 = 10
            goto L_0x02ed
        L_0x02eb:
            int r1 = r1 << 1
        L_0x02ed:
            com.google.android.gms.internal.ads.ayh r0 = r0.mo29603a(r1)
            r10.putObject(r14, r2, r0)
        L_0x02f4:
            r8 = r0
            com.google.android.gms.internal.ads.bab r0 = r15.m34882a(r5)
            r1 = r13
            r2 = r32
            r3 = r11
            r4 = r34
            r18 = r5
            r5 = r8
            r19 = r6
            r6 = r36
            int r0 = com.google.android.gms.internal.ads.awk.m34272a(r0, r1, r2, r3, r4, r5, r6)
            r3 = r13
            r2 = r18
            r6 = r19
            goto L_0x02b2
        L_0x0310:
            r18 = r5
            r19 = r6
            r24 = r7
            r28 = r10
            r15 = r11
            r29 = r13
            goto L_0x03a2
        L_0x031d:
            r18 = r5
            r19 = r6
            r1 = 49
            if (r8 > r1) goto L_0x0372
            r1 = r21
            long r5 = (long) r1
            r4 = r0
            r0 = r30
            r1 = r31
            r20 = r2
            r2 = r32
            r3 = r11
            r26 = r4
            r4 = r34
            r22 = r5
            r5 = r13
            r6 = r25
            r24 = r7
            r7 = r26
            r27 = r8
            r8 = r18
            r28 = r10
            r9 = r22
            r15 = r11
            r11 = r27
            r29 = r13
            r12 = r20
            r14 = r36
            int r0 = r0.m34878a((T) r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 != r15) goto L_0x0358
        L_0x0356:
            r2 = r0
            goto L_0x03a3
        L_0x0358:
            r12 = r32
            r2 = r18
            r6 = r19
            r7 = r24
            r1 = r25
            r10 = r28
            r3 = r29
        L_0x0366:
            r9 = r36
            r11 = r35
            r13 = r34
            r14 = r31
            r15 = r30
            goto L_0x0017
        L_0x0372:
            r26 = r0
            r24 = r7
            r27 = r8
            r28 = r10
            r15 = r11
            r29 = r13
            r1 = r21
            r20 = r2
            r0 = 50
            r9 = r27
            if (r9 != r0) goto L_0x03aa
            r7 = r26
            r0 = 2
            if (r7 != r0) goto L_0x03a2
            r0 = r30
            r1 = r31
            r2 = r32
            r3 = r15
            r4 = r34
            r5 = r18
            r6 = r20
            r8 = r36
            int r0 = r0.m34879a((T) r1, r2, r3, r4, r5, r6, r8)
            if (r0 != r15) goto L_0x0358
            goto L_0x0356
        L_0x03a2:
            r2 = r15
        L_0x03a3:
            r7 = r24
            r6 = r29
        L_0x03a7:
            r0 = r35
            goto L_0x03c7
        L_0x03aa:
            r7 = r26
            r0 = r30
            r8 = r1
            r1 = r31
            r2 = r32
            r3 = r15
            r4 = r34
            r5 = r29
            r6 = r25
            r10 = r20
            r12 = r18
            r13 = r36
            int r0 = r0.m34877a((T) r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 != r15) goto L_0x0456
            goto L_0x0356
        L_0x03c7:
            if (r6 != r0) goto L_0x03d7
            if (r0 != 0) goto L_0x03cc
            goto L_0x03d7
        L_0x03cc:
            r9 = r0
            r3 = r6
            r0 = r19
            r1 = -1
            r8 = r30
            r12 = r31
            goto L_0x0475
        L_0x03d7:
            r9 = r0
            r8 = r30
            boolean r0 = r8.f41671h
            if (r0 == 0) goto L_0x042f
            r10 = r36
            com.google.android.gms.internal.ads.axm r0 = r10.f41464d
            com.google.android.gms.internal.ads.axm r1 = com.google.android.gms.internal.ads.axm.m34646a()
            if (r0 == r1) goto L_0x042c
            com.google.android.gms.internal.ads.azj r0 = r8.f41670g
            com.google.android.gms.internal.ads.axm r1 = r10.f41464d
            r11 = r25
            com.google.android.gms.internal.ads.axz$d r0 = r1.mo29784a(r0, r11)
            if (r0 != 0) goto L_0x0411
            com.google.android.gms.internal.ads.bav r4 = m34910e(r31)
            r0 = r6
            r1 = r32
            r3 = r34
            r5 = r36
            int r0 = com.google.android.gms.internal.ads.awk.m34270a(r0, r1, r2, r3, r4, r5)
            r12 = r32
            r3 = r6
            r15 = r8
            r1 = r11
            r2 = r18
            r6 = r19
            r13 = r34
            r14 = r31
            goto L_0x0450
        L_0x0411:
            r12 = r31
            r0 = r12
            com.google.android.gms.internal.ads.axz$c r0 = (com.google.android.gms.internal.ads.axz.C15673c) r0
            com.google.android.gms.internal.ads.axq<java.lang.Object> r1 = r0.zzfzg
            boolean r1 = r1.f41530b
            if (r1 == 0) goto L_0x0426
            com.google.android.gms.internal.ads.axq<java.lang.Object> r1 = r0.zzfzg
            java.lang.Object r1 = r1.clone()
            com.google.android.gms.internal.ads.axq r1 = (com.google.android.gms.internal.ads.axq) r1
            r0.zzfzg = r1
        L_0x0426:
            java.lang.NoSuchMethodError r0 = new java.lang.NoSuchMethodError
            r0.<init>()
            throw r0
        L_0x042c:
            r11 = r25
            goto L_0x0433
        L_0x042f:
            r11 = r25
            r10 = r36
        L_0x0433:
            r12 = r31
            com.google.android.gms.internal.ads.bav r4 = m34910e(r31)
            r0 = r6
            r1 = r32
            r3 = r34
            r5 = r36
            int r0 = com.google.android.gms.internal.ads.awk.m34270a(r0, r1, r2, r3, r4, r5)
            r3 = r6
            r15 = r8
            r1 = r11
            r14 = r12
            r2 = r18
            r6 = r19
            r13 = r34
            r12 = r32
        L_0x0450:
            r11 = r9
            r9 = r10
            r10 = r28
            goto L_0x0017
        L_0x0456:
            r11 = r25
            r6 = r29
            r12 = r32
            r3 = r6
            r1 = r11
            r2 = r18
            r6 = r19
            r7 = r24
            r10 = r28
            goto L_0x0366
        L_0x0468:
            r19 = r6
            r24 = r7
            r28 = r10
            r9 = r11
            r12 = r14
            r8 = r15
            r2 = r0
            r0 = r19
            r1 = -1
        L_0x0475:
            if (r7 == r1) goto L_0x047d
            long r4 = (long) r7
            r1 = r28
            r1.putInt(r12, r4, r0)
        L_0x047d:
            r0 = 0
            int r1 = r8.f41676m
        L_0x0480:
            int r4 = r8.f41677n
            if (r1 >= r4) goto L_0x0493
            int[] r4 = r8.f41675l
            r4 = r4[r1]
            com.google.android.gms.internal.ads.bau<?, ?> r5 = r8.f41680q
            java.lang.Object r0 = r8.m34884a(r12, r4, (UB) r0, r5)
            com.google.android.gms.internal.ads.bav r0 = (com.google.android.gms.internal.ads.bav) r0
            int r1 = r1 + 1
            goto L_0x0480
        L_0x0493:
            if (r0 == 0) goto L_0x049a
            com.google.android.gms.internal.ads.bau<?, ?> r1 = r8.f41680q
            r1.mo29966b(r12, r0)
        L_0x049a:
            if (r9 != 0) goto L_0x04a6
            r0 = r34
            if (r2 != r0) goto L_0x04a1
            goto L_0x04ac
        L_0x04a1:
            com.google.android.gms.internal.ads.ayi r0 = com.google.android.gms.internal.ads.ayi.m34784g()
            throw r0
        L_0x04a6:
            r0 = r34
            if (r2 > r0) goto L_0x04ad
            if (r3 != r9) goto L_0x04ad
        L_0x04ac:
            return r2
        L_0x04ad:
            com.google.android.gms.internal.ads.ayi r0 = com.google.android.gms.internal.ads.ayi.m34784g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.azo.mo29893a(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.ads.awl):int");
    }

    /* JADX WARNING: type inference failed for: r30v0, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r12v0 */
    /* JADX WARNING: type inference failed for: r2v0, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r12v1, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r0v5, types: [int, byte] */
    /* JADX WARNING: type inference failed for: r17v0, types: [int] */
    /* JADX WARNING: type inference failed for: r12v2 */
    /* JADX WARNING: type inference failed for: r12v3 */
    /* JADX WARNING: type inference failed for: r0v10, types: [int] */
    /* JADX WARNING: type inference failed for: r1v5, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r2v7, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r5v3, types: [int] */
    /* JADX WARNING: type inference failed for: r2v8, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r2v10, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r5v5, types: [int] */
    /* JADX WARNING: type inference failed for: r1v11, types: [int] */
    /* JADX WARNING: type inference failed for: r2v11, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r17v1 */
    /* JADX WARNING: type inference failed for: r3v13, types: [int] */
    /* JADX WARNING: type inference failed for: r17v2 */
    /* JADX WARNING: type inference failed for: r12v6 */
    /* JADX WARNING: type inference failed for: r12v7 */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0115, code lost:
        r2 = r4;
        r1 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0149, code lost:
        r0 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0167, code lost:
        r1 = r7;
        r2 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x016c, code lost:
        r25 = r7;
        r15 = r8;
        r18 = r9;
        r19 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01e4, code lost:
        if (r0 == r15) goto L_0x01e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0212, code lost:
        if (r0 == r15) goto L_0x01e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0231, code lost:
        if (r0 == r15) goto L_0x01e6;
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=null, for r0v5, types: [int, byte] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte[], code=null, for r30v0, types: [byte[]] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r12v2
      assigns: []
      uses: []
      mth insns count: 271
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
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 16 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo29897a(T r29, byte[] r30, int r31, int r32, com.google.android.gms.internal.ads.awl r33) throws java.io.IOException {
        /*
            r28 = this;
            r15 = r28
            r14 = r29
            r12 = r30
            r13 = r32
            r11 = r33
            boolean r0 = r15.f41673j
            if (r0 == 0) goto L_0x0260
            sun.misc.Unsafe r9 = f41665b
            r10 = -1
            r16 = 0
            r0 = r31
            r1 = -1
            r2 = 0
        L_0x0017:
            if (r0 >= r13) goto L_0x0257
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x0029
            int r0 = com.google.android.gms.internal.ads.awk.m34271a(r0, r12, r3, r11)
            int r3 = r11.f41461a
            r8 = r0
            r17 = r3
            goto L_0x002c
        L_0x0029:
            r17 = r0
            r8 = r3
        L_0x002c:
            int r7 = r17 >>> 3
            r6 = r17 & 7
            if (r7 <= r1) goto L_0x003a
            int r2 = r2 / 3
            int r0 = r15.m34875a(r7, r2)
        L_0x0038:
            r4 = r0
            goto L_0x003f
        L_0x003a:
            int r0 = r15.m34913g(r7)
            goto L_0x0038
        L_0x003f:
            if (r4 != r10) goto L_0x004c
            r25 = r7
            r2 = r8
            r18 = r9
            r19 = 0
            r27 = -1
            goto L_0x0234
        L_0x004c:
            int[] r0 = r15.f41666c
            int r1 = r4 + 1
            r5 = r0[r1]
            r0 = 267386880(0xff00000, float:2.3665827E-29)
            r0 = r0 & r5
            int r3 = r0 >>> 20
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r1 = (long) r0
            r0 = 17
            r10 = 2
            if (r3 > r0) goto L_0x0175
            r0 = 1
            switch(r3) {
                case 0: goto L_0x015a;
                case 1: goto L_0x014b;
                case 2: goto L_0x0139;
                case 3: goto L_0x0139;
                case 4: goto L_0x012b;
                case 5: goto L_0x0119;
                case 6: goto L_0x0108;
                case 7: goto L_0x00f2;
                case 8: goto L_0x00db;
                case 9: goto L_0x00ba;
                case 10: goto L_0x00ad;
                case 11: goto L_0x012b;
                case 12: goto L_0x009e;
                case 13: goto L_0x0108;
                case 14: goto L_0x0119;
                case 15: goto L_0x008b;
                case 16: goto L_0x0070;
                default: goto L_0x0065;
            }
        L_0x0065:
            r19 = r4
            r25 = r7
            r15 = r8
            r18 = r9
        L_0x006c:
            r27 = -1
            goto L_0x0215
        L_0x0070:
            if (r6 != 0) goto L_0x0065
            int r6 = com.google.android.gms.internal.ads.awk.m34278b(r12, r8, r11)
            r20 = r1
            long r0 = r11.f41462b
            long r22 = com.google.android.gms.internal.ads.axa.m34317a(r0)
            r0 = r9
            r2 = r20
            r1 = r29
            r10 = r4
            r4 = r22
            r0.putLong(r1, r2, r4)
            goto L_0x0149
        L_0x008b:
            r2 = r1
            r10 = r4
            if (r6 != 0) goto L_0x016c
            int r0 = com.google.android.gms.internal.ads.awk.m34276a(r12, r8, r11)
            int r1 = r11.f41461a
            int r1 = com.google.android.gms.internal.ads.axa.m34319e(r1)
            r9.putInt(r14, r2, r1)
            goto L_0x0167
        L_0x009e:
            r2 = r1
            r10 = r4
            if (r6 != 0) goto L_0x016c
            int r0 = com.google.android.gms.internal.ads.awk.m34276a(r12, r8, r11)
            int r1 = r11.f41461a
            r9.putInt(r14, r2, r1)
            goto L_0x0167
        L_0x00ad:
            r2 = r1
            if (r6 != r10) goto L_0x0065
            int r0 = com.google.android.gms.internal.ads.awk.m34284e(r12, r8, r11)
            java.lang.Object r1 = r11.f41463c
            r9.putObject(r14, r2, r1)
            goto L_0x0115
        L_0x00ba:
            r2 = r1
            if (r6 != r10) goto L_0x0065
            com.google.android.gms.internal.ads.bab r0 = r15.m34882a(r4)
            int r0 = com.google.android.gms.internal.ads.awk.m34274a(r0, r12, r8, r13, r11)
            java.lang.Object r1 = r9.getObject(r14, r2)
            if (r1 != 0) goto L_0x00d1
            java.lang.Object r1 = r11.f41463c
            r9.putObject(r14, r2, r1)
            goto L_0x0115
        L_0x00d1:
            java.lang.Object r5 = r11.f41463c
            java.lang.Object r1 = com.google.android.gms.internal.ads.ayb.m34769a(r1, r5)
            r9.putObject(r14, r2, r1)
            goto L_0x0115
        L_0x00db:
            r2 = r1
            if (r6 != r10) goto L_0x0065
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r5
            if (r0 != 0) goto L_0x00e8
            int r0 = com.google.android.gms.internal.ads.awk.m34281c(r12, r8, r11)
            goto L_0x00ec
        L_0x00e8:
            int r0 = com.google.android.gms.internal.ads.awk.m34283d(r12, r8, r11)
        L_0x00ec:
            java.lang.Object r1 = r11.f41463c
            r9.putObject(r14, r2, r1)
            goto L_0x0115
        L_0x00f2:
            r2 = r1
            if (r6 != 0) goto L_0x0065
            int r1 = com.google.android.gms.internal.ads.awk.m34278b(r12, r8, r11)
            long r5 = r11.f41462b
            r19 = 0
            int r8 = (r5 > r19 ? 1 : (r5 == r19 ? 0 : -1))
            if (r8 == 0) goto L_0x0102
            goto L_0x0103
        L_0x0102:
            r0 = 0
        L_0x0103:
            com.google.android.gms.internal.ads.bba.m35155a(r14, r2, r0)
            r0 = r1
            goto L_0x0115
        L_0x0108:
            r2 = r1
            r0 = 5
            if (r6 != r0) goto L_0x0065
            int r0 = com.google.android.gms.internal.ads.awk.m34275a(r12, r8)
            r9.putInt(r14, r2, r0)
            int r0 = r8 + 4
        L_0x0115:
            r2 = r4
            r1 = r7
            goto L_0x0169
        L_0x0119:
            r2 = r1
            if (r6 != r0) goto L_0x0065
            long r5 = com.google.android.gms.internal.ads.awk.m34279b(r12, r8)
            r0 = r9
            r1 = r29
            r10 = r4
            r4 = r5
            r0.putLong(r1, r2, r4)
            int r0 = r8 + 8
            goto L_0x0167
        L_0x012b:
            r2 = r1
            r10 = r4
            if (r6 != 0) goto L_0x016c
            int r0 = com.google.android.gms.internal.ads.awk.m34276a(r12, r8, r11)
            int r1 = r11.f41461a
            r9.putInt(r14, r2, r1)
            goto L_0x0167
        L_0x0139:
            r2 = r1
            r10 = r4
            if (r6 != 0) goto L_0x016c
            int r6 = com.google.android.gms.internal.ads.awk.m34278b(r12, r8, r11)
            long r4 = r11.f41462b
            r0 = r9
            r1 = r29
            r0.putLong(r1, r2, r4)
        L_0x0149:
            r0 = r6
            goto L_0x0167
        L_0x014b:
            r2 = r1
            r10 = r4
            r0 = 5
            if (r6 != r0) goto L_0x016c
            float r0 = com.google.android.gms.internal.ads.awk.m34282d(r12, r8)
            com.google.android.gms.internal.ads.bba.m35151a(r14, r2, r0)
            int r0 = r8 + 4
            goto L_0x0167
        L_0x015a:
            r2 = r1
            r10 = r4
            if (r6 != r0) goto L_0x016c
            double r0 = com.google.android.gms.internal.ads.awk.m34280c(r12, r8)
            com.google.android.gms.internal.ads.bba.m35150a(r14, r2, r0)
            int r0 = r8 + 8
        L_0x0167:
            r1 = r7
            r2 = r10
        L_0x0169:
            r10 = -1
            goto L_0x0017
        L_0x016c:
            r25 = r7
            r15 = r8
            r18 = r9
            r19 = r10
            goto L_0x006c
        L_0x0175:
            r0 = 27
            if (r3 != r0) goto L_0x01b1
            if (r6 != r10) goto L_0x0065
            java.lang.Object r0 = r9.getObject(r14, r1)
            com.google.android.gms.internal.ads.ayh r0 = (com.google.android.gms.internal.ads.ayh) r0
            boolean r3 = r0.mo29588a()
            if (r3 != 0) goto L_0x0199
            int r3 = r0.size()
            if (r3 != 0) goto L_0x0190
            r3 = 10
            goto L_0x0192
        L_0x0190:
            int r3 = r3 << 1
        L_0x0192:
            com.google.android.gms.internal.ads.ayh r0 = r0.mo29603a(r3)
            r9.putObject(r14, r1, r0)
        L_0x0199:
            r5 = r0
            com.google.android.gms.internal.ads.bab r0 = r15.m34882a(r4)
            r1 = r17
            r2 = r30
            r3 = r8
            r19 = r4
            r4 = r32
            r6 = r33
            int r0 = com.google.android.gms.internal.ads.awk.m34272a(r0, r1, r2, r3, r4, r5, r6)
            r1 = r7
            r2 = r19
            goto L_0x0169
        L_0x01b1:
            r19 = r4
            r0 = 49
            if (r3 > r0) goto L_0x01e8
            long r4 = (long) r5
            r0 = r28
            r20 = r1
            r1 = r29
            r2 = r30
            r10 = r3
            r3 = r8
            r22 = r4
            r4 = r32
            r5 = r17
            r24 = r6
            r6 = r7
            r25 = r7
            r7 = r24
            r15 = r8
            r8 = r19
            r18 = r9
            r26 = r10
            r27 = -1
            r9 = r22
            r11 = r26
            r12 = r20
            r14 = r33
            int r0 = r0.m34878a((T) r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 != r15) goto L_0x0244
        L_0x01e6:
            r2 = r0
            goto L_0x0234
        L_0x01e8:
            r20 = r1
            r26 = r3
            r24 = r6
            r25 = r7
            r15 = r8
            r18 = r9
            r27 = -1
            r0 = 50
            r9 = r26
            if (r9 != r0) goto L_0x0217
            r7 = r24
            if (r7 != r10) goto L_0x0215
            r0 = r28
            r1 = r29
            r2 = r30
            r3 = r15
            r4 = r32
            r5 = r19
            r6 = r20
            r8 = r33
            int r0 = r0.m34879a((T) r1, r2, r3, r4, r5, r6, r8)
            if (r0 != r15) goto L_0x0244
            goto L_0x01e6
        L_0x0215:
            r2 = r15
            goto L_0x0234
        L_0x0217:
            r7 = r24
            r0 = r28
            r1 = r29
            r2 = r30
            r3 = r15
            r4 = r32
            r8 = r5
            r5 = r17
            r6 = r25
            r10 = r20
            r12 = r19
            r13 = r33
            int r0 = r0.m34877a((T) r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 != r15) goto L_0x0244
            goto L_0x01e6
        L_0x0234:
            com.google.android.gms.internal.ads.bav r4 = m34910e(r29)
            r0 = r17
            r1 = r30
            r3 = r32
            r5 = r33
            int r0 = com.google.android.gms.internal.ads.awk.m34270a(r0, r1, r2, r3, r4, r5)
        L_0x0244:
            r14 = r29
            r12 = r30
            r11 = r33
            r9 = r18
            r2 = r19
            r1 = r25
            r10 = -1
            r13 = r32
            r15 = r28
            goto L_0x0017
        L_0x0257:
            r4 = r13
            if (r0 != r4) goto L_0x025b
            return
        L_0x025b:
            com.google.android.gms.internal.ads.ayi r0 = com.google.android.gms.internal.ads.ayi.m34784g()
            throw r0
        L_0x0260:
            r4 = r13
            r5 = 0
            r0 = r28
            r1 = r29
            r2 = r30
            r3 = r31
            r4 = r32
            r6 = r33
            r0.mo29893a((T) r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.azo.mo29897a(java.lang.Object, byte[], int, int, com.google.android.gms.internal.ads.awl):void");
    }

    /* renamed from: c */
    public final void mo29901c(T t) {
        for (int i = this.f41676m; i < this.f41677n; i++) {
            long d = (long) (m34906d(this.f41675l[i]) & 1048575);
            Object f = bba.m35174f(t, d);
            if (f != null) {
                bba.m35154a((Object) t, d, this.f41682s.mo29886d(f));
            }
        }
        int length = this.f41675l.length;
        for (int i2 = this.f41677n; i2 < length; i2++) {
            this.f41679p.mo29863b(t, (long) this.f41675l[i2]);
        }
        this.f41680q.mo29969d(t);
        if (this.f41671h) {
            this.f41681r.mo29796c(t);
        }
    }

    /* renamed from: a */
    private final <UT, UB> UB m34884a(Object obj, int i, UB ub, bau<UT, UB> bau) {
        int i2 = this.f41666c[i];
        Object f = bba.m35174f(obj, (long) (m34906d(i) & 1048575));
        if (f == null) {
            return ub;
        }
        aye c = m34904c(i);
        if (c == null) {
            return ub;
        }
        return m34883a(i, i2, this.f41682s.mo29883a(f), c, ub, bau);
    }

    /* renamed from: a */
    private final <K, V, UT, UB> UB m34883a(int i, int i2, Map<K, V> map, aye aye, UB ub, bau<UT, UB> bau) {
        azc f = this.f41682s.mo29888f(m34898b(i));
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            if (!aye.mo29113a(((Integer) entry.getValue()).intValue())) {
                if (ub == null) {
                    ub = bau.mo29954a();
                }
                aww b = awo.m34293b(azb.m34831a(f, entry.getKey(), entry.getValue()));
                try {
                    azb.m34832a(b.f41475a, f, entry.getKey(), entry.getValue());
                    bau.mo29958a(ub, i2, b.mo29632a());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ub;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0104, code lost:
        continue;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo29902d(T r14) {
        /*
            r13 = this;
            r0 = 0
            r1 = -1
            r1 = 0
            r2 = -1
            r3 = 0
        L_0x0005:
            int r4 = r13.f41676m
            r5 = 1
            if (r1 >= r4) goto L_0x0108
            int[] r4 = r13.f41675l
            r4 = r4[r1]
            int[] r6 = r13.f41666c
            r6 = r6[r4]
            int r7 = r13.m34906d(r4)
            boolean r8 = r13.f41673j
            r9 = 1048575(0xfffff, float:1.469367E-39)
            if (r8 != 0) goto L_0x0035
            int[] r8 = r13.f41666c
            int r10 = r4 + 2
            r8 = r8[r10]
            r10 = r8 & r9
            int r8 = r8 >>> 20
            int r8 = r5 << r8
            if (r10 == r2) goto L_0x0036
            sun.misc.Unsafe r2 = f41665b
            long r11 = (long) r10
            int r2 = r2.getInt(r14, r11)
            r3 = r2
            r2 = r10
            goto L_0x0036
        L_0x0035:
            r8 = 0
        L_0x0036:
            r10 = 268435456(0x10000000, float:2.5243549E-29)
            r10 = r10 & r7
            if (r10 == 0) goto L_0x003d
            r10 = 1
            goto L_0x003e
        L_0x003d:
            r10 = 0
        L_0x003e:
            if (r10 == 0) goto L_0x0047
            boolean r10 = r13.m34894a((T) r14, r4, r3, r8)
            if (r10 != 0) goto L_0x0047
            return r0
        L_0x0047:
            r10 = 267386880(0xff00000, float:2.3665827E-29)
            r10 = r10 & r7
            int r10 = r10 >>> 20
            r11 = 9
            if (r10 == r11) goto L_0x00f3
            r11 = 17
            if (r10 == r11) goto L_0x00f3
            r8 = 27
            if (r10 == r8) goto L_0x00c7
            r8 = 60
            if (r10 == r8) goto L_0x00b6
            r8 = 68
            if (r10 == r8) goto L_0x00b6
            switch(r10) {
                case 49: goto L_0x00c7;
                case 50: goto L_0x0065;
                default: goto L_0x0063;
            }
        L_0x0063:
            goto L_0x0104
        L_0x0065:
            com.google.android.gms.internal.ads.aze r6 = r13.f41682s
            r7 = r7 & r9
            long r7 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.bba.m35174f(r14, r7)
            java.util.Map r6 = r6.mo29884b(r7)
            boolean r7 = r6.isEmpty()
            if (r7 != 0) goto L_0x00b3
            java.lang.Object r4 = r13.m34898b(r4)
            com.google.android.gms.internal.ads.aze r7 = r13.f41682s
            com.google.android.gms.internal.ads.azc r4 = r7.mo29888f(r4)
            com.google.android.gms.internal.ads.bbj r4 = r4.f41658c
            com.google.android.gms.internal.ads.bbp r4 = r4.zzawa()
            com.google.android.gms.internal.ads.bbp r7 = com.google.android.gms.internal.ads.bbp.MESSAGE
            if (r4 != r7) goto L_0x00b3
            r4 = 0
            java.util.Collection r6 = r6.values()
            java.util.Iterator r6 = r6.iterator()
        L_0x0094:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x00b3
            java.lang.Object r7 = r6.next()
            if (r4 != 0) goto L_0x00ac
            com.google.android.gms.internal.ads.azx r4 = com.google.android.gms.internal.ads.azx.m34942a()
            java.lang.Class r8 = r7.getClass()
            com.google.android.gms.internal.ads.bab r4 = r4.mo29905a(r8)
        L_0x00ac:
            boolean r7 = r4.mo29902d(r7)
            if (r7 != 0) goto L_0x0094
            r5 = 0
        L_0x00b3:
            if (r5 != 0) goto L_0x0104
            return r0
        L_0x00b6:
            boolean r5 = r13.m34893a((T) r14, r6, r4)
            if (r5 == 0) goto L_0x0104
            com.google.android.gms.internal.ads.bab r4 = r13.m34882a(r4)
            boolean r4 = m34895a(r14, r7, r4)
            if (r4 != 0) goto L_0x0104
            return r0
        L_0x00c7:
            r6 = r7 & r9
            long r6 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.ads.bba.m35174f(r14, r6)
            java.util.List r6 = (java.util.List) r6
            boolean r7 = r6.isEmpty()
            if (r7 != 0) goto L_0x00f0
            com.google.android.gms.internal.ads.bab r4 = r13.m34882a(r4)
            r7 = 0
        L_0x00db:
            int r8 = r6.size()
            if (r7 >= r8) goto L_0x00f0
            java.lang.Object r8 = r6.get(r7)
            boolean r8 = r4.mo29902d(r8)
            if (r8 != 0) goto L_0x00ed
            r5 = 0
            goto L_0x00f0
        L_0x00ed:
            int r7 = r7 + 1
            goto L_0x00db
        L_0x00f0:
            if (r5 != 0) goto L_0x0104
            return r0
        L_0x00f3:
            boolean r5 = r13.m34894a((T) r14, r4, r3, r8)
            if (r5 == 0) goto L_0x0104
            com.google.android.gms.internal.ads.bab r4 = r13.m34882a(r4)
            boolean r4 = m34895a(r14, r7, r4)
            if (r4 != 0) goto L_0x0104
            return r0
        L_0x0104:
            int r1 = r1 + 1
            goto L_0x0005
        L_0x0108:
            boolean r1 = r13.f41671h
            if (r1 == 0) goto L_0x0119
            com.google.android.gms.internal.ads.axn<?> r1 = r13.f41681r
            com.google.android.gms.internal.ads.axq r14 = r1.mo29788a(r14)
            boolean r14 = r14.mo29802d()
            if (r14 != 0) goto L_0x0119
            return r0
        L_0x0119:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.azo.mo29902d(java.lang.Object):boolean");
    }

    /* renamed from: a */
    private static boolean m34895a(Object obj, int i, bab bab) {
        return bab.mo29902d(bba.m35174f(obj, (long) (i & 1048575)));
    }

    /* renamed from: a */
    private static void m34887a(int i, Object obj, bbq bbq) throws IOException {
        if (obj instanceof String) {
            bbq.mo29749a(i, (String) obj);
        } else {
            bbq.mo29745a(i, (awo) obj);
        }
    }

    /* renamed from: a */
    private final void m34890a(Object obj, int i, baa baa) throws IOException {
        if (m34911f(i)) {
            bba.m35154a(obj, (long) (i & 1048575), (Object) baa.mo29688m());
        } else if (this.f41672i) {
            bba.m35154a(obj, (long) (i & 1048575), (Object) baa.mo29686l());
        } else {
            bba.m35154a(obj, (long) (i & 1048575), (Object) baa.mo29690n());
        }
    }

    /* renamed from: d */
    private final int m34906d(int i) {
        return this.f41666c[i + 1];
    }

    /* renamed from: e */
    private final int m34908e(int i) {
        return this.f41666c[i + 2];
    }

    /* renamed from: b */
    private static <T> double m34896b(T t, long j) {
        return ((Double) bba.m35174f(t, j)).doubleValue();
    }

    /* renamed from: c */
    private static <T> float m34903c(T t, long j) {
        return ((Float) bba.m35174f(t, j)).floatValue();
    }

    /* renamed from: d */
    private static <T> int m34907d(T t, long j) {
        return ((Integer) bba.m35174f(t, j)).intValue();
    }

    /* renamed from: e */
    private static <T> long m34909e(T t, long j) {
        return ((Long) bba.m35174f(t, j)).longValue();
    }

    /* renamed from: f */
    private static <T> boolean m34912f(T t, long j) {
        return ((Boolean) bba.m35174f(t, j)).booleanValue();
    }

    /* renamed from: c */
    private final boolean m34905c(T t, T t2, int i) {
        return m34892a(t, i) == m34892a(t2, i);
    }

    /* renamed from: a */
    private final boolean m34894a(T t, int i, int i2, int i3) {
        if (this.f41673j) {
            return m34892a(t, i);
        }
        return (i2 & i3) != 0;
    }

    /* renamed from: a */
    private final boolean m34892a(T t, int i) {
        if (this.f41673j) {
            int d = m34906d(i);
            long j = (long) (d & 1048575);
            switch ((d & 267386880) >>> 20) {
                case 0:
                    return bba.m35172e(t, j) != ProfileUiInitOptimizeEnterThreshold.DEFAULT;
                case 1:
                    return bba.m35168d(t, j) != 0.0f;
                case 2:
                    return bba.m35159b(t, j) != 0;
                case 3:
                    return bba.m35159b(t, j) != 0;
                case 4:
                    return bba.m35144a((Object) t, j) != 0;
                case 5:
                    return bba.m35159b(t, j) != 0;
                case 6:
                    return bba.m35144a((Object) t, j) != 0;
                case 7:
                    return bba.m35167c(t, j);
                case 8:
                    Object f = bba.m35174f(t, j);
                    if (f instanceof String) {
                        return !((String) f).isEmpty();
                    }
                    if (f instanceof awo) {
                        return !awo.zzfuo.equals(f);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    return bba.m35174f(t, j) != null;
                case 10:
                    return !awo.zzfuo.equals(bba.m35174f(t, j));
                case 11:
                    return bba.m35144a((Object) t, j) != 0;
                case 12:
                    return bba.m35144a((Object) t, j) != 0;
                case 13:
                    return bba.m35144a((Object) t, j) != 0;
                case 14:
                    return bba.m35159b(t, j) != 0;
                case 15:
                    return bba.m35144a((Object) t, j) != 0;
                case 16:
                    return bba.m35159b(t, j) != 0;
                case 17:
                    return bba.m35174f(t, j) != null;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            int e = m34908e(i);
            return (bba.m35144a((Object) t, (long) (e & 1048575)) & (1 << (e >>> 20))) != 0;
        }
    }

    /* renamed from: b */
    private final void m34899b(T t, int i) {
        if (!this.f41673j) {
            int e = m34908e(i);
            long j = (long) (e & 1048575);
            bba.m35152a((Object) t, j, bba.m35144a((Object) t, j) | (1 << (e >>> 20)));
        }
    }

    /* renamed from: a */
    private final boolean m34893a(T t, int i, int i2) {
        return bba.m35144a((Object) t, (long) (m34908e(i2) & 1048575)) == i;
    }

    /* renamed from: b */
    private final void m34900b(T t, int i, int i2) {
        bba.m35152a((Object) t, (long) (m34908e(i2) & 1048575), i);
    }

    /* renamed from: g */
    private final int m34913g(int i) {
        if (i < this.f41668e || i > this.f41669f) {
            return -1;
        }
        return m34897b(i, 0);
    }

    /* renamed from: a */
    private final int m34875a(int i, int i2) {
        if (i < this.f41668e || i > this.f41669f) {
            return -1;
        }
        return m34897b(i, i2);
    }

    /* renamed from: b */
    private final int m34897b(int i, int i2) {
        int length = (this.f41666c.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.f41666c[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }
}
