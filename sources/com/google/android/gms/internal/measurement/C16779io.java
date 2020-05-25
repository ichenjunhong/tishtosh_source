package com.google.android.gms.internal.measurement;

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

/* renamed from: com.google.android.gms.internal.measurement.io */
final class C16779io<T> implements C16793jb<T> {

    /* renamed from: a */
    private static final int[] f47146a = new int[0];

    /* renamed from: b */
    private static final Unsafe f47147b = C16819ka.m40694c();

    /* renamed from: c */
    private final int[] f47148c;

    /* renamed from: d */
    private final Object[] f47149d;

    /* renamed from: e */
    private final int f47150e;

    /* renamed from: f */
    private final int f47151f;

    /* renamed from: g */
    private final C16775ik f47152g;

    /* renamed from: h */
    private final boolean f47153h;

    /* renamed from: i */
    private final boolean f47154i;

    /* renamed from: j */
    private final boolean f47155j;

    /* renamed from: k */
    private final boolean f47156k;

    /* renamed from: l */
    private final int[] f47157l;

    /* renamed from: m */
    private final int f47158m;

    /* renamed from: n */
    private final int f47159n;

    /* renamed from: o */
    private final C16783is f47160o;

    /* renamed from: p */
    private final C16758hu f47161p;

    /* renamed from: q */
    private final C16812ju<?, ?> f47162q;

    /* renamed from: r */
    private final C16723gr<?> f47163r;

    /* renamed from: s */
    private final C16770if f47164s;

    private C16779io(int[] iArr, Object[] objArr, int i, int i2, C16775ik ikVar, boolean z, boolean z2, int[] iArr2, int i3, int i4, C16783is isVar, C16758hu huVar, C16812ju<?, ?> juVar, C16723gr<?> grVar, C16770if ifVar) {
        this.f47148c = iArr;
        this.f47149d = objArr;
        this.f47150e = i;
        this.f47151f = i2;
        this.f47154i = ikVar instanceof C16736hd;
        this.f47155j = z;
        this.f47153h = grVar != null && grVar.mo32199a(ikVar);
        this.f47156k = false;
        this.f47157l = iArr2;
        this.f47158m = i3;
        this.f47159n = i4;
        this.f47160o = isVar;
        this.f47161p = huVar;
        this.f47162q = juVar;
        this.f47163r = grVar;
        this.f47152g = ikVar;
        this.f47164s = ifVar;
    }

    /* renamed from: f */
    private static boolean m40443f(int i) {
        return (i & 536870912) != 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:170:0x0383  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x03de  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static <T> com.google.android.gms.internal.measurement.C16779io<T> m40415a(java.lang.Class<T> r40, com.google.android.gms.internal.measurement.C16773ii r41, com.google.android.gms.internal.measurement.C16783is r42, com.google.android.gms.internal.measurement.C16758hu r43, com.google.android.gms.internal.measurement.C16812ju<?, ?> r44, com.google.android.gms.internal.measurement.C16723gr<?> r45, com.google.android.gms.internal.measurement.C16770if r46) {
        /*
            r0 = r41
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.C16790iz
            if (r1 == 0) goto L_0x0463
            com.google.android.gms.internal.measurement.iz r0 = (com.google.android.gms.internal.measurement.C16790iz) r0
            int r1 = r0.mo32294a()
            int r2 = com.google.android.gms.internal.measurement.C16736hd.C16741e.f47098i
            r3 = 0
            if (r1 != r2) goto L_0x0013
            r11 = 1
            goto L_0x0014
        L_0x0013:
            r11 = 0
        L_0x0014:
            java.lang.String r1 = r0.f47176a
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
            int[] r8 = f47146a
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
            sun.misc.Unsafe r6 = f47147b
            java.lang.Object[] r7 = r0.f47177b
            com.google.android.gms.internal.measurement.ik r17 = r0.mo32296c()
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
            java.lang.reflect.Field r13 = m40419a(r4, r13)
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
            java.lang.reflect.Field r13 = m40419a(r4, r13)
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
            java.lang.reflect.Field r13 = m40419a(r4, r13)
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
            java.lang.reflect.Field r15 = m40419a(r4, r15)
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
            com.google.android.gms.internal.measurement.io r1 = new com.google.android.gms.internal.measurement.io
            com.google.android.gms.internal.measurement.ik r10 = r0.mo32296c()
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
            com.google.android.gms.internal.measurement.jo r0 = (com.google.android.gms.internal.measurement.C16806jo) r0
            r0.mo32294a()
            java.lang.NoSuchMethodError r0 = new java.lang.NoSuchMethodError
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C16779io.m40415a(java.lang.Class, com.google.android.gms.internal.measurement.ii, com.google.android.gms.internal.measurement.is, com.google.android.gms.internal.measurement.hu, com.google.android.gms.internal.measurement.ju, com.google.android.gms.internal.measurement.gr, com.google.android.gms.internal.measurement.if):com.google.android.gms.internal.measurement.io");
    }

    /* renamed from: a */
    private static Field m40419a(Class<?> cls, String str) {
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
    public final T mo32298a() {
        return this.f47160o.mo32307a(this.f47152g);
    }

    /* JADX INFO: used method not loaded: com.google.android.gms.internal.measurement.jd.a(java.lang.Object, java.lang.Object):null, types can be incorrect */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006a, code lost:
        if (com.google.android.gms.internal.measurement.C16795jd.m40546a(com.google.android.gms.internal.measurement.C16819ka.m40704f(r10, r6), com.google.android.gms.internal.measurement.C16819ka.m40704f(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007e, code lost:
        if (com.google.android.gms.internal.measurement.C16819ka.m40689b(r10, r6) == com.google.android.gms.internal.measurement.C16819ka.m40689b(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0090, code lost:
        if (com.google.android.gms.internal.measurement.C16819ka.m40674a((java.lang.Object) r10, r6) == com.google.android.gms.internal.measurement.C16819ka.m40674a((java.lang.Object) r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a4, code lost:
        if (com.google.android.gms.internal.measurement.C16819ka.m40689b(r10, r6) == com.google.android.gms.internal.measurement.C16819ka.m40689b(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b6, code lost:
        if (com.google.android.gms.internal.measurement.C16819ka.m40674a((java.lang.Object) r10, r6) == com.google.android.gms.internal.measurement.C16819ka.m40674a((java.lang.Object) r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c8, code lost:
        if (com.google.android.gms.internal.measurement.C16819ka.m40674a((java.lang.Object) r10, r6) == com.google.android.gms.internal.measurement.C16819ka.m40674a((java.lang.Object) r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00da, code lost:
        if (com.google.android.gms.internal.measurement.C16819ka.m40674a((java.lang.Object) r10, r6) == com.google.android.gms.internal.measurement.C16819ka.m40674a((java.lang.Object) r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f0, code lost:
        if (com.google.android.gms.internal.measurement.C16795jd.m40546a(com.google.android.gms.internal.measurement.C16819ka.m40704f(r10, r6), com.google.android.gms.internal.measurement.C16819ka.m40704f(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0106, code lost:
        if (com.google.android.gms.internal.measurement.C16795jd.m40546a(com.google.android.gms.internal.measurement.C16819ka.m40704f(r10, r6), com.google.android.gms.internal.measurement.C16819ka.m40704f(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x011c, code lost:
        if (com.google.android.gms.internal.measurement.C16795jd.m40546a(com.google.android.gms.internal.measurement.C16819ka.m40704f(r10, r6), com.google.android.gms.internal.measurement.C16819ka.m40704f(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x012e, code lost:
        if (com.google.android.gms.internal.measurement.C16819ka.m40697c(r10, r6) == com.google.android.gms.internal.measurement.C16819ka.m40697c(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0140, code lost:
        if (com.google.android.gms.internal.measurement.C16819ka.m40674a((java.lang.Object) r10, r6) == com.google.android.gms.internal.measurement.C16819ka.m40674a((java.lang.Object) r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0154, code lost:
        if (com.google.android.gms.internal.measurement.C16819ka.m40689b(r10, r6) == com.google.android.gms.internal.measurement.C16819ka.m40689b(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0165, code lost:
        if (com.google.android.gms.internal.measurement.C16819ka.m40674a((java.lang.Object) r10, r6) == com.google.android.gms.internal.measurement.C16819ka.m40674a((java.lang.Object) r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0178, code lost:
        if (com.google.android.gms.internal.measurement.C16819ka.m40689b(r10, r6) == com.google.android.gms.internal.measurement.C16819ka.m40689b(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x018b, code lost:
        if (com.google.android.gms.internal.measurement.C16819ka.m40689b(r10, r6) == com.google.android.gms.internal.measurement.C16819ka.m40689b(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01a4, code lost:
        if (java.lang.Float.floatToIntBits(com.google.android.gms.internal.measurement.C16819ka.m40698d(r10, r6)) == java.lang.Float.floatToIntBits(com.google.android.gms.internal.measurement.C16819ka.m40698d(r11, r6))) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01bf, code lost:
        if (java.lang.Double.doubleToLongBits(com.google.android.gms.internal.measurement.C16819ka.m40702e(r10, r6)) == java.lang.Double.doubleToLongBits(com.google.android.gms.internal.measurement.C16819ka.m40702e(r11, r6))) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01c1, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0038, code lost:
        if (com.google.android.gms.internal.measurement.C16795jd.m40546a(com.google.android.gms.internal.measurement.C16819ka.m40704f(r10, r6), com.google.android.gms.internal.measurement.C16819ka.m40704f(r11, r6)) != false) goto L_0x01c2;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo32301a(T r10, T r11) {
        /*
            r9 = this;
            int[] r0 = r9.f47148c
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L_0x0005:
            r3 = 1
            if (r2 >= r0) goto L_0x01c9
            int r4 = r9.m40439d(r2)
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
            int r4 = r9.m40441e(r2)
            r4 = r4 & r5
            long r4 = (long) r4
            int r8 = com.google.android.gms.internal.measurement.C16819ka.m40674a(r10, r4)
            int r4 = com.google.android.gms.internal.measurement.C16819ka.m40674a(r11, r4)
            if (r8 != r4) goto L_0x01c1
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C16819ka.m40704f(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.measurement.C16819ka.m40704f(r11, r6)
            boolean r4 = com.google.android.gms.internal.measurement.C16795jd.m40546a(r4, r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x003c:
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C16819ka.m40704f(r10, r6)
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C16819ka.m40704f(r11, r6)
            boolean r3 = com.google.android.gms.internal.measurement.C16795jd.m40546a(r3, r4)
            goto L_0x01c2
        L_0x004a:
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C16819ka.m40704f(r10, r6)
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C16819ka.m40704f(r11, r6)
            boolean r3 = com.google.android.gms.internal.measurement.C16795jd.m40546a(r3, r4)
            goto L_0x01c2
        L_0x0058:
            boolean r4 = r9.m40438c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C16819ka.m40704f(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.measurement.C16819ka.m40704f(r11, r6)
            boolean r4 = com.google.android.gms.internal.measurement.C16795jd.m40546a(r4, r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x006e:
            boolean r4 = r9.m40438c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = com.google.android.gms.internal.measurement.C16819ka.m40689b(r10, r6)
            long r6 = com.google.android.gms.internal.measurement.C16819ka.m40689b(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x0082:
            boolean r4 = r9.m40438c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = com.google.android.gms.internal.measurement.C16819ka.m40674a(r10, r6)
            int r5 = com.google.android.gms.internal.measurement.C16819ka.m40674a(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x0094:
            boolean r4 = r9.m40438c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = com.google.android.gms.internal.measurement.C16819ka.m40689b(r10, r6)
            long r6 = com.google.android.gms.internal.measurement.C16819ka.m40689b(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x00a8:
            boolean r4 = r9.m40438c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = com.google.android.gms.internal.measurement.C16819ka.m40674a(r10, r6)
            int r5 = com.google.android.gms.internal.measurement.C16819ka.m40674a(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x00ba:
            boolean r4 = r9.m40438c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = com.google.android.gms.internal.measurement.C16819ka.m40674a(r10, r6)
            int r5 = com.google.android.gms.internal.measurement.C16819ka.m40674a(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x00cc:
            boolean r4 = r9.m40438c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = com.google.android.gms.internal.measurement.C16819ka.m40674a(r10, r6)
            int r5 = com.google.android.gms.internal.measurement.C16819ka.m40674a(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x00de:
            boolean r4 = r9.m40438c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C16819ka.m40704f(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.measurement.C16819ka.m40704f(r11, r6)
            boolean r4 = com.google.android.gms.internal.measurement.C16795jd.m40546a(r4, r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x00f4:
            boolean r4 = r9.m40438c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C16819ka.m40704f(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.measurement.C16819ka.m40704f(r11, r6)
            boolean r4 = com.google.android.gms.internal.measurement.C16795jd.m40546a(r4, r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x010a:
            boolean r4 = r9.m40438c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C16819ka.m40704f(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.measurement.C16819ka.m40704f(r11, r6)
            boolean r4 = com.google.android.gms.internal.measurement.C16795jd.m40546a(r4, r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x0120:
            boolean r4 = r9.m40438c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            boolean r4 = com.google.android.gms.internal.measurement.C16819ka.m40697c(r10, r6)
            boolean r5 = com.google.android.gms.internal.measurement.C16819ka.m40697c(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x0132:
            boolean r4 = r9.m40438c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = com.google.android.gms.internal.measurement.C16819ka.m40674a(r10, r6)
            int r5 = com.google.android.gms.internal.measurement.C16819ka.m40674a(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x0144:
            boolean r4 = r9.m40438c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = com.google.android.gms.internal.measurement.C16819ka.m40689b(r10, r6)
            long r6 = com.google.android.gms.internal.measurement.C16819ka.m40689b(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x0157:
            boolean r4 = r9.m40438c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = com.google.android.gms.internal.measurement.C16819ka.m40674a(r10, r6)
            int r5 = com.google.android.gms.internal.measurement.C16819ka.m40674a(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x0168:
            boolean r4 = r9.m40438c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = com.google.android.gms.internal.measurement.C16819ka.m40689b(r10, r6)
            long r6 = com.google.android.gms.internal.measurement.C16819ka.m40689b(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x017b:
            boolean r4 = r9.m40438c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = com.google.android.gms.internal.measurement.C16819ka.m40689b(r10, r6)
            long r6 = com.google.android.gms.internal.measurement.C16819ka.m40689b(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x018e:
            boolean r4 = r9.m40438c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            float r4 = com.google.android.gms.internal.measurement.C16819ka.m40698d(r10, r6)
            int r4 = java.lang.Float.floatToIntBits(r4)
            float r5 = com.google.android.gms.internal.measurement.C16819ka.m40698d(r11, r6)
            int r5 = java.lang.Float.floatToIntBits(r5)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x01a7:
            boolean r4 = r9.m40438c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            double r4 = com.google.android.gms.internal.measurement.C16819ka.m40702e(r10, r6)
            long r4 = java.lang.Double.doubleToLongBits(r4)
            double r6 = com.google.android.gms.internal.measurement.C16819ka.m40702e(r11, r6)
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
            com.google.android.gms.internal.measurement.ju<?, ?> r0 = r9.f47162q
            java.lang.Object r0 = r0.mo32365b(r10)
            com.google.android.gms.internal.measurement.ju<?, ?> r2 = r9.f47162q
            java.lang.Object r2 = r2.mo32365b(r11)
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x01dc
            return r1
        L_0x01dc:
            boolean r0 = r9.f47153h
            if (r0 == 0) goto L_0x01f1
            com.google.android.gms.internal.measurement.gr<?> r0 = r9.f47163r
            com.google.android.gms.internal.measurement.gu r10 = r0.mo32193a(r10)
            com.google.android.gms.internal.measurement.gr<?> r0 = r9.f47163r
            com.google.android.gms.internal.measurement.gu r11 = r0.mo32193a(r11)
            boolean r10 = r10.equals(r11)
            return r10
        L_0x01f1:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C16779io.mo32301a(java.lang.Object, java.lang.Object):boolean");
    }

    /* renamed from: a */
    public final int mo32297a(T t) {
        int length = this.f47148c.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2 += 3) {
            int d = m40439d(i2);
            int i3 = this.f47148c[i2];
            long j = (long) (1048575 & d);
            int i4 = 37;
            switch ((d & 267386880) >>> 20) {
                case 0:
                    i = (i * 53) + C16743hf.m40312a(Double.doubleToLongBits(C16819ka.m40702e(t, j)));
                    break;
                case 1:
                    i = (i * 53) + Float.floatToIntBits(C16819ka.m40698d(t, j));
                    break;
                case 2:
                    i = (i * 53) + C16743hf.m40312a(C16819ka.m40689b(t, j));
                    break;
                case 3:
                    i = (i * 53) + C16743hf.m40312a(C16819ka.m40689b(t, j));
                    break;
                case 4:
                    i = (i * 53) + C16819ka.m40674a((Object) t, j);
                    break;
                case 5:
                    i = (i * 53) + C16743hf.m40312a(C16819ka.m40689b(t, j));
                    break;
                case 6:
                    i = (i * 53) + C16819ka.m40674a((Object) t, j);
                    break;
                case 7:
                    i = (i * 53) + C16743hf.m40313a(C16819ka.m40697c(t, j));
                    break;
                case 8:
                    i = (i * 53) + ((String) C16819ka.m40704f(t, j)).hashCode();
                    break;
                case 9:
                    Object f = C16819ka.m40704f(t, j);
                    if (f != null) {
                        i4 = f.hashCode();
                    }
                    i = (i * 53) + i4;
                    break;
                case 10:
                    i = (i * 53) + C16819ka.m40704f(t, j).hashCode();
                    break;
                case 11:
                    i = (i * 53) + C16819ka.m40674a((Object) t, j);
                    break;
                case 12:
                    i = (i * 53) + C16819ka.m40674a((Object) t, j);
                    break;
                case 13:
                    i = (i * 53) + C16819ka.m40674a((Object) t, j);
                    break;
                case 14:
                    i = (i * 53) + C16743hf.m40312a(C16819ka.m40689b(t, j));
                    break;
                case 15:
                    i = (i * 53) + C16819ka.m40674a((Object) t, j);
                    break;
                case 16:
                    i = (i * 53) + C16743hf.m40312a(C16819ka.m40689b(t, j));
                    break;
                case 17:
                    Object f2 = C16819ka.m40704f(t, j);
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
                    i = (i * 53) + C16819ka.m40704f(t, j).hashCode();
                    break;
                case 50:
                    i = (i * 53) + C16819ka.m40704f(t, j).hashCode();
                    break;
                case 51:
                    if (!m40427a(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + C16743hf.m40312a(Double.doubleToLongBits(m40430b(t, j)));
                        break;
                    }
                case 52:
                    if (!m40427a(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + Float.floatToIntBits(m40436c(t, j));
                        break;
                    }
                case 53:
                    if (!m40427a(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + C16743hf.m40312a(m40442e(t, j));
                        break;
                    }
                case 54:
                    if (!m40427a(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + C16743hf.m40312a(m40442e(t, j));
                        break;
                    }
                case 55:
                    if (!m40427a(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + m40440d(t, j);
                        break;
                    }
                case 56:
                    if (!m40427a(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + C16743hf.m40312a(m40442e(t, j));
                        break;
                    }
                case 57:
                    if (!m40427a(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + m40440d(t, j);
                        break;
                    }
                case 58:
                    if (!m40427a(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + C16743hf.m40313a(m40444f(t, j));
                        break;
                    }
                case 59:
                    if (!m40427a(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + ((String) C16819ka.m40704f(t, j)).hashCode();
                        break;
                    }
                case 60:
                    if (!m40427a(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + C16819ka.m40704f(t, j).hashCode();
                        break;
                    }
                case BaseNotice.TCM /*61*/:
                    if (!m40427a(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + C16819ka.m40704f(t, j).hashCode();
                        break;
                    }
                case BaseNotice.CREATOR /*62*/:
                    if (!m40427a(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + m40440d(t, j);
                        break;
                    }
                case 63:
                    if (!m40427a(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + m40440d(t, j);
                        break;
                    }
                case UnReadVideoExperiment.RELATION_LIST /*64*/:
                    if (!m40427a(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + m40440d(t, j);
                        break;
                    }
                case 65:
                    if (!m40427a(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + C16743hf.m40312a(m40442e(t, j));
                        break;
                    }
                case 66:
                    if (!m40427a(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + m40440d(t, j);
                        break;
                    }
                case 67:
                    if (!m40427a(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + C16743hf.m40312a(m40442e(t, j));
                        break;
                    }
                case 68:
                    if (!m40427a(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + C16819ka.m40704f(t, j).hashCode();
                        break;
                    }
            }
        }
        int hashCode = (i * 53) + this.f47162q.mo32365b(t).hashCode();
        return this.f47153h ? (hashCode * 53) + this.f47163r.mo32193a((Object) t).hashCode() : hashCode;
    }

    /* renamed from: b */
    public final void mo32303b(T t, T t2) {
        if (t2 != null) {
            for (int i = 0; i < this.f47148c.length; i += 3) {
                int d = m40439d(i);
                long j = (long) (1048575 & d);
                int i2 = this.f47148c[i];
                switch ((d & 267386880) >>> 20) {
                    case 0:
                        if (!m40426a(t2, i)) {
                            break;
                        } else {
                            C16819ka.m40680a((Object) t, j, C16819ka.m40702e(t2, j));
                            m40432b(t, i);
                            break;
                        }
                    case 1:
                        if (!m40426a(t2, i)) {
                            break;
                        } else {
                            C16819ka.m40681a((Object) t, j, C16819ka.m40698d(t2, j));
                            m40432b(t, i);
                            break;
                        }
                    case 2:
                        if (!m40426a(t2, i)) {
                            break;
                        } else {
                            C16819ka.m40683a((Object) t, j, C16819ka.m40689b(t2, j));
                            m40432b(t, i);
                            break;
                        }
                    case 3:
                        if (!m40426a(t2, i)) {
                            break;
                        } else {
                            C16819ka.m40683a((Object) t, j, C16819ka.m40689b(t2, j));
                            m40432b(t, i);
                            break;
                        }
                    case 4:
                        if (!m40426a(t2, i)) {
                            break;
                        } else {
                            C16819ka.m40682a((Object) t, j, C16819ka.m40674a((Object) t2, j));
                            m40432b(t, i);
                            break;
                        }
                    case 5:
                        if (!m40426a(t2, i)) {
                            break;
                        } else {
                            C16819ka.m40683a((Object) t, j, C16819ka.m40689b(t2, j));
                            m40432b(t, i);
                            break;
                        }
                    case 6:
                        if (!m40426a(t2, i)) {
                            break;
                        } else {
                            C16819ka.m40682a((Object) t, j, C16819ka.m40674a((Object) t2, j));
                            m40432b(t, i);
                            break;
                        }
                    case 7:
                        if (!m40426a(t2, i)) {
                            break;
                        } else {
                            C16819ka.m40685a((Object) t, j, C16819ka.m40697c(t2, j));
                            m40432b(t, i);
                            break;
                        }
                    case 8:
                        if (!m40426a(t2, i)) {
                            break;
                        } else {
                            C16819ka.m40684a((Object) t, j, C16819ka.m40704f(t2, j));
                            m40432b(t, i);
                            break;
                        }
                    case 9:
                        m40425a(t, t2, i);
                        break;
                    case 10:
                        if (!m40426a(t2, i)) {
                            break;
                        } else {
                            C16819ka.m40684a((Object) t, j, C16819ka.m40704f(t2, j));
                            m40432b(t, i);
                            break;
                        }
                    case 11:
                        if (!m40426a(t2, i)) {
                            break;
                        } else {
                            C16819ka.m40682a((Object) t, j, C16819ka.m40674a((Object) t2, j));
                            m40432b(t, i);
                            break;
                        }
                    case 12:
                        if (!m40426a(t2, i)) {
                            break;
                        } else {
                            C16819ka.m40682a((Object) t, j, C16819ka.m40674a((Object) t2, j));
                            m40432b(t, i);
                            break;
                        }
                    case 13:
                        if (!m40426a(t2, i)) {
                            break;
                        } else {
                            C16819ka.m40682a((Object) t, j, C16819ka.m40674a((Object) t2, j));
                            m40432b(t, i);
                            break;
                        }
                    case 14:
                        if (!m40426a(t2, i)) {
                            break;
                        } else {
                            C16819ka.m40683a((Object) t, j, C16819ka.m40689b(t2, j));
                            m40432b(t, i);
                            break;
                        }
                    case 15:
                        if (!m40426a(t2, i)) {
                            break;
                        } else {
                            C16819ka.m40682a((Object) t, j, C16819ka.m40674a((Object) t2, j));
                            m40432b(t, i);
                            break;
                        }
                    case 16:
                        if (!m40426a(t2, i)) {
                            break;
                        } else {
                            C16819ka.m40683a((Object) t, j, C16819ka.m40689b(t2, j));
                            m40432b(t, i);
                            break;
                        }
                    case 17:
                        m40425a(t, t2, i);
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
                        this.f47161p.mo32266a(t, t2, j);
                        break;
                    case 50:
                        C16819ka.m40684a((Object) t, j, this.f47164s.mo32287a(C16819ka.m40704f(t, j), C16819ka.m40704f(t2, j)));
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
                        if (!m40427a(t2, i2, i)) {
                            break;
                        } else {
                            C16819ka.m40684a((Object) t, j, C16819ka.m40704f(t2, j));
                            m40433b(t, i2, i);
                            break;
                        }
                    case 60:
                        m40435b(t, t2, i);
                        break;
                    case BaseNotice.TCM /*61*/:
                    case BaseNotice.CREATOR /*62*/:
                    case 63:
                    case UnReadVideoExperiment.RELATION_LIST /*64*/:
                    case 65:
                    case 66:
                    case 67:
                        if (!m40427a(t2, i2, i)) {
                            break;
                        } else {
                            C16819ka.m40684a((Object) t, j, C16819ka.m40704f(t2, j));
                            m40433b(t, i2, i);
                            break;
                        }
                    case 68:
                        m40435b(t, t2, i);
                        break;
                }
            }
            if (!this.f47155j) {
                C16795jd.m40545a(this.f47162q, t, t2);
                if (this.f47153h) {
                    C16795jd.m40544a(this.f47163r, t, t2);
                    return;
                }
                return;
            }
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: a */
    private final void m40425a(T t, T t2, int i) {
        long d = (long) (m40439d(i) & 1048575);
        if (m40426a(t2, i)) {
            Object f = C16819ka.m40704f(t, d);
            Object f2 = C16819ka.m40704f(t2, d);
            if (f == null || f2 == null) {
                if (f2 != null) {
                    C16819ka.m40684a((Object) t, d, f2);
                    m40432b(t, i);
                }
                return;
            }
            C16819ka.m40684a((Object) t, d, C16743hf.m40315a(f, f2));
            m40432b(t, i);
        }
    }

    /* renamed from: b */
    private final void m40435b(T t, T t2, int i) {
        int d = m40439d(i);
        int i2 = this.f47148c[i];
        long j = (long) (d & 1048575);
        if (m40427a(t2, i2, i)) {
            Object f = C16819ka.m40704f(t, j);
            Object f2 = C16819ka.m40704f(t2, j);
            if (f == null || f2 == null) {
                if (f2 != null) {
                    C16819ka.m40684a((Object) t, j, f2);
                    m40433b(t, i2, i);
                }
                return;
            }
            C16819ka.m40684a((Object) t, j, C16743hf.m40315a(f, f2));
            m40433b(t, i2, i);
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
    public final int mo32302b(T r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            boolean r2 = r0.f47155j
            r3 = 267386880(0xff00000, float:2.3665827E-29)
            r4 = 0
            r7 = 1048575(0xfffff, float:1.469367E-39)
            r8 = 1
            r9 = 0
            r11 = 0
            if (r2 == 0) goto L_0x055f
            sun.misc.Unsafe r2 = f47147b
            r12 = 0
            r13 = 0
        L_0x0016:
            int[] r14 = r0.f47148c
            int r14 = r14.length
            if (r12 >= r14) goto L_0x0557
            int r14 = r0.m40439d(r12)
            r15 = r14 & r3
            int r15 = r15 >>> 20
            int[] r3 = r0.f47148c
            r3 = r3[r12]
            r14 = r14 & r7
            long r5 = (long) r14
            com.google.android.gms.internal.measurement.gx r14 = com.google.android.gms.internal.measurement.C16729gx.DOUBLE_LIST_PACKED
            int r14 = r14.mo32217id()
            if (r15 < r14) goto L_0x0041
            com.google.android.gms.internal.measurement.gx r14 = com.google.android.gms.internal.measurement.C16729gx.SINT64_LIST_PACKED
            int r14 = r14.mo32217id()
            if (r15 > r14) goto L_0x0041
            int[] r14 = r0.f47148c
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
            boolean r14 = r0.m40427a((T) r1, r3, r12)
            if (r14 == 0) goto L_0x0551
            java.lang.Object r5 = com.google.android.gms.internal.measurement.C16819ka.m40704f(r1, r5)
            com.google.android.gms.internal.measurement.ik r5 = (com.google.android.gms.internal.measurement.C16775ik) r5
            com.google.android.gms.internal.measurement.jb r6 = r0.m40416a(r12)
            int r3 = com.google.android.gms.internal.measurement.C16709gj.m40015c(r3, r5, r6)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x005e:
            boolean r14 = r0.m40427a((T) r1, r3, r12)
            if (r14 == 0) goto L_0x0551
            long r5 = m40442e(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.C16709gj.m40026f(r3, r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x006f:
            boolean r14 = r0.m40427a((T) r1, r3, r12)
            if (r14 == 0) goto L_0x0551
            int r5 = m40440d(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.C16709gj.m40033h(r3, r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0080:
            boolean r5 = r0.m40427a((T) r1, r3, r12)
            if (r5 == 0) goto L_0x0551
            int r3 = com.google.android.gms.internal.measurement.C16709gj.m40034h(r3, r9)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x008d:
            boolean r5 = r0.m40427a((T) r1, r3, r12)
            if (r5 == 0) goto L_0x0551
            int r3 = com.google.android.gms.internal.measurement.C16709gj.m40038j(r3, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x009a:
            boolean r14 = r0.m40427a((T) r1, r3, r12)
            if (r14 == 0) goto L_0x0551
            int r5 = m40440d(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.C16709gj.m40040k(r3, r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x00ab:
            boolean r14 = r0.m40427a((T) r1, r3, r12)
            if (r14 == 0) goto L_0x0551
            int r5 = m40440d(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.C16709gj.m40029g(r3, r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x00bc:
            boolean r14 = r0.m40427a((T) r1, r3, r12)
            if (r14 == 0) goto L_0x0551
            java.lang.Object r5 = com.google.android.gms.internal.measurement.C16819ka.m40704f(r1, r5)
            com.google.android.gms.internal.measurement.fs r5 = (com.google.android.gms.internal.measurement.C16691fs) r5
            int r3 = com.google.android.gms.internal.measurement.C16709gj.m40013c(r3, r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x00cf:
            boolean r14 = r0.m40427a((T) r1, r3, r12)
            if (r14 == 0) goto L_0x0551
            java.lang.Object r5 = com.google.android.gms.internal.measurement.C16819ka.m40704f(r1, r5)
            com.google.android.gms.internal.measurement.jb r6 = r0.m40416a(r12)
            int r3 = com.google.android.gms.internal.measurement.C16795jd.m40532a(r3, r5, r6)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x00e4:
            boolean r14 = r0.m40427a((T) r1, r3, r12)
            if (r14 == 0) goto L_0x0551
            java.lang.Object r5 = com.google.android.gms.internal.measurement.C16819ka.m40704f(r1, r5)
            boolean r6 = r5 instanceof com.google.android.gms.internal.measurement.C16691fs
            if (r6 == 0) goto L_0x00fb
            com.google.android.gms.internal.measurement.fs r5 = (com.google.android.gms.internal.measurement.C16691fs) r5
            int r3 = com.google.android.gms.internal.measurement.C16709gj.m40013c(r3, r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x00fb:
            java.lang.String r5 = (java.lang.String) r5
            int r3 = com.google.android.gms.internal.measurement.C16709gj.m40007b(r3, r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0104:
            boolean r5 = r0.m40427a((T) r1, r3, r12)
            if (r5 == 0) goto L_0x0551
            int r3 = com.google.android.gms.internal.measurement.C16709gj.m40008b(r3, r8)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0111:
            boolean r5 = r0.m40427a((T) r1, r3, r12)
            if (r5 == 0) goto L_0x0551
            int r3 = com.google.android.gms.internal.measurement.C16709gj.m40036i(r3, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x011e:
            boolean r5 = r0.m40427a((T) r1, r3, r12)
            if (r5 == 0) goto L_0x0551
            int r3 = com.google.android.gms.internal.measurement.C16709gj.m40030g(r3, r9)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x012b:
            boolean r14 = r0.m40427a((T) r1, r3, r12)
            if (r14 == 0) goto L_0x0551
            int r5 = m40440d(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.C16709gj.m40025f(r3, r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x013c:
            boolean r14 = r0.m40427a((T) r1, r3, r12)
            if (r14 == 0) goto L_0x0551
            long r5 = m40442e(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.C16709gj.m40022e(r3, r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x014d:
            boolean r14 = r0.m40427a((T) r1, r3, r12)
            if (r14 == 0) goto L_0x0551
            long r5 = m40442e(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.C16709gj.m40018d(r3, r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x015e:
            boolean r5 = r0.m40427a((T) r1, r3, r12)
            if (r5 == 0) goto L_0x0551
            int r3 = com.google.android.gms.internal.measurement.C16709gj.m40004b(r3, r4)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x016b:
            boolean r5 = r0.m40427a((T) r1, r3, r12)
            if (r5 == 0) goto L_0x0551
            r5 = 0
            int r3 = com.google.android.gms.internal.measurement.C16709gj.m40003b(r3, r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x017a:
            com.google.android.gms.internal.measurement.if r14 = r0.f47164s
            java.lang.Object r5 = com.google.android.gms.internal.measurement.C16819ka.m40704f(r1, r5)
            java.lang.Object r6 = r0.m40431b(r12)
            int r3 = r14.mo32286a(r3, r5, r6)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x018b:
            java.util.List r5 = m40420a(r1, r5)
            com.google.android.gms.internal.measurement.jb r6 = r0.m40416a(r12)
            int r3 = com.google.android.gms.internal.measurement.C16795jd.m40548b(r3, r5, r6)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x019a:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.measurement.C16795jd.m40556c(r5)
            if (r5 <= 0) goto L_0x0551
            boolean r6 = r0.f47156k
            if (r6 == 0) goto L_0x01ae
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x01ae:
            int r3 = com.google.android.gms.internal.measurement.C16709gj.m40021e(r3)
            int r6 = com.google.android.gms.internal.measurement.C16709gj.m40028g(r5)
            int r3 = r3 + r6
            int r3 = r3 + r5
            int r13 = r13 + r3
            goto L_0x0551
        L_0x01bb:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.measurement.C16795jd.m40570g(r5)
            if (r5 <= 0) goto L_0x0551
            boolean r6 = r0.f47156k
            if (r6 == 0) goto L_0x01cf
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x01cf:
            int r3 = com.google.android.gms.internal.measurement.C16709gj.m40021e(r3)
            int r6 = com.google.android.gms.internal.measurement.C16709gj.m40028g(r5)
            int r3 = r3 + r6
            int r3 = r3 + r5
            int r13 = r13 + r3
            goto L_0x0551
        L_0x01dc:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.measurement.C16795jd.m40576i(r5)
            if (r5 <= 0) goto L_0x0551
            boolean r6 = r0.f47156k
            if (r6 == 0) goto L_0x01f0
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x01f0:
            int r3 = com.google.android.gms.internal.measurement.C16709gj.m40021e(r3)
            int r6 = com.google.android.gms.internal.measurement.C16709gj.m40028g(r5)
            int r3 = r3 + r6
            int r3 = r3 + r5
            int r13 = r13 + r3
            goto L_0x0551
        L_0x01fd:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.measurement.C16795jd.m40573h(r5)
            if (r5 <= 0) goto L_0x0551
            boolean r6 = r0.f47156k
            if (r6 == 0) goto L_0x0211
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x0211:
            int r3 = com.google.android.gms.internal.measurement.C16709gj.m40021e(r3)
            int r6 = com.google.android.gms.internal.measurement.C16709gj.m40028g(r5)
            int r3 = r3 + r6
            int r3 = r3 + r5
            int r13 = r13 + r3
            goto L_0x0551
        L_0x021e:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.measurement.C16795jd.m40560d(r5)
            if (r5 <= 0) goto L_0x0551
            boolean r6 = r0.f47156k
            if (r6 == 0) goto L_0x0232
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x0232:
            int r3 = com.google.android.gms.internal.measurement.C16709gj.m40021e(r3)
            int r6 = com.google.android.gms.internal.measurement.C16709gj.m40028g(r5)
            int r3 = r3 + r6
            int r3 = r3 + r5
            int r13 = r13 + r3
            goto L_0x0551
        L_0x023f:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.measurement.C16795jd.m40567f(r5)
            if (r5 <= 0) goto L_0x0551
            boolean r6 = r0.f47156k
            if (r6 == 0) goto L_0x0253
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x0253:
            int r3 = com.google.android.gms.internal.measurement.C16709gj.m40021e(r3)
            int r6 = com.google.android.gms.internal.measurement.C16709gj.m40028g(r5)
            int r3 = r3 + r6
            int r3 = r3 + r5
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0260:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.measurement.C16795jd.m40579j(r5)
            if (r5 <= 0) goto L_0x0551
            boolean r6 = r0.f47156k
            if (r6 == 0) goto L_0x0274
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x0274:
            int r3 = com.google.android.gms.internal.measurement.C16709gj.m40021e(r3)
            int r6 = com.google.android.gms.internal.measurement.C16709gj.m40028g(r5)
            int r3 = r3 + r6
            int r3 = r3 + r5
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0281:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.measurement.C16795jd.m40573h(r5)
            if (r5 <= 0) goto L_0x0551
            boolean r6 = r0.f47156k
            if (r6 == 0) goto L_0x0295
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x0295:
            int r3 = com.google.android.gms.internal.measurement.C16709gj.m40021e(r3)
            int r6 = com.google.android.gms.internal.measurement.C16709gj.m40028g(r5)
            int r3 = r3 + r6
            int r3 = r3 + r5
            int r13 = r13 + r3
            goto L_0x0551
        L_0x02a2:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.measurement.C16795jd.m40576i(r5)
            if (r5 <= 0) goto L_0x0551
            boolean r6 = r0.f47156k
            if (r6 == 0) goto L_0x02b6
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x02b6:
            int r3 = com.google.android.gms.internal.measurement.C16709gj.m40021e(r3)
            int r6 = com.google.android.gms.internal.measurement.C16709gj.m40028g(r5)
            int r3 = r3 + r6
            int r3 = r3 + r5
            int r13 = r13 + r3
            goto L_0x0551
        L_0x02c3:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.measurement.C16795jd.m40564e(r5)
            if (r5 <= 0) goto L_0x0551
            boolean r6 = r0.f47156k
            if (r6 == 0) goto L_0x02d7
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x02d7:
            int r3 = com.google.android.gms.internal.measurement.C16709gj.m40021e(r3)
            int r6 = com.google.android.gms.internal.measurement.C16709gj.m40028g(r5)
            int r3 = r3 + r6
            int r3 = r3 + r5
            int r13 = r13 + r3
            goto L_0x0551
        L_0x02e4:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.measurement.C16795jd.m40550b(r5)
            if (r5 <= 0) goto L_0x0551
            boolean r6 = r0.f47156k
            if (r6 == 0) goto L_0x02f8
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x02f8:
            int r3 = com.google.android.gms.internal.measurement.C16709gj.m40021e(r3)
            int r6 = com.google.android.gms.internal.measurement.C16709gj.m40028g(r5)
            int r3 = r3 + r6
            int r3 = r3 + r5
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0305:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.measurement.C16795jd.m40536a(r5)
            if (r5 <= 0) goto L_0x0551
            boolean r6 = r0.f47156k
            if (r6 == 0) goto L_0x0319
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x0319:
            int r3 = com.google.android.gms.internal.measurement.C16709gj.m40021e(r3)
            int r6 = com.google.android.gms.internal.measurement.C16709gj.m40028g(r5)
            int r3 = r3 + r6
            int r3 = r3 + r5
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0326:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.measurement.C16795jd.m40573h(r5)
            if (r5 <= 0) goto L_0x0551
            boolean r6 = r0.f47156k
            if (r6 == 0) goto L_0x033a
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x033a:
            int r3 = com.google.android.gms.internal.measurement.C16709gj.m40021e(r3)
            int r6 = com.google.android.gms.internal.measurement.C16709gj.m40028g(r5)
            int r3 = r3 + r6
            int r3 = r3 + r5
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0347:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.measurement.C16795jd.m40576i(r5)
            if (r5 <= 0) goto L_0x0551
            boolean r6 = r0.f47156k
            if (r6 == 0) goto L_0x035b
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x035b:
            int r3 = com.google.android.gms.internal.measurement.C16709gj.m40021e(r3)
            int r6 = com.google.android.gms.internal.measurement.C16709gj.m40028g(r5)
            int r3 = r3 + r6
            int r3 = r3 + r5
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0368:
            java.util.List r5 = m40420a(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.C16795jd.m40555c(r3, r5, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0373:
            java.util.List r5 = m40420a(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.C16795jd.m40569g(r3, r5, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x037e:
            java.util.List r5 = m40420a(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.C16795jd.m40575i(r3, r5, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0389:
            java.util.List r5 = m40420a(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.C16795jd.m40572h(r3, r5, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0394:
            java.util.List r5 = m40420a(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.C16795jd.m40559d(r3, r5, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x039f:
            java.util.List r5 = m40420a(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.C16795jd.m40566f(r3, r5, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x03aa:
            java.util.List r5 = m40420a(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.C16795jd.m40547b(r3, r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x03b5:
            java.util.List r5 = m40420a(r1, r5)
            com.google.android.gms.internal.measurement.jb r6 = r0.m40416a(r12)
            int r3 = com.google.android.gms.internal.measurement.C16795jd.m40534a(r3, r5, r6)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x03c4:
            java.util.List r5 = m40420a(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.C16795jd.m40533a(r3, r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x03cf:
            java.util.List r5 = m40420a(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.C16795jd.m40578j(r3, r5, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x03da:
            java.util.List r5 = m40420a(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.C16795jd.m40572h(r3, r5, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x03e5:
            java.util.List r5 = m40420a(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.C16795jd.m40575i(r3, r5, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x03f0:
            java.util.List r5 = m40420a(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.C16795jd.m40563e(r3, r5, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x03fb:
            java.util.List r5 = m40420a(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.C16795jd.m40549b(r3, r5, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0406:
            java.util.List r5 = m40420a(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.C16795jd.m40535a(r3, r5, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0411:
            java.util.List r5 = m40420a(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.C16795jd.m40572h(r3, r5, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x041c:
            java.util.List r5 = m40420a(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.C16795jd.m40575i(r3, r5, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0427:
            boolean r14 = r0.m40426a((T) r1, r12)
            if (r14 == 0) goto L_0x0551
            java.lang.Object r5 = com.google.android.gms.internal.measurement.C16819ka.m40704f(r1, r5)
            com.google.android.gms.internal.measurement.ik r5 = (com.google.android.gms.internal.measurement.C16775ik) r5
            com.google.android.gms.internal.measurement.jb r6 = r0.m40416a(r12)
            int r3 = com.google.android.gms.internal.measurement.C16709gj.m40015c(r3, r5, r6)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x043e:
            boolean r14 = r0.m40426a((T) r1, r12)
            if (r14 == 0) goto L_0x0551
            long r5 = com.google.android.gms.internal.measurement.C16819ka.m40689b(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.C16709gj.m40026f(r3, r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x044f:
            boolean r14 = r0.m40426a((T) r1, r12)
            if (r14 == 0) goto L_0x0551
            int r5 = com.google.android.gms.internal.measurement.C16819ka.m40674a(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.C16709gj.m40033h(r3, r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0460:
            boolean r5 = r0.m40426a((T) r1, r12)
            if (r5 == 0) goto L_0x0551
            int r3 = com.google.android.gms.internal.measurement.C16709gj.m40034h(r3, r9)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x046d:
            boolean r5 = r0.m40426a((T) r1, r12)
            if (r5 == 0) goto L_0x0551
            int r3 = com.google.android.gms.internal.measurement.C16709gj.m40038j(r3, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x047a:
            boolean r14 = r0.m40426a((T) r1, r12)
            if (r14 == 0) goto L_0x0551
            int r5 = com.google.android.gms.internal.measurement.C16819ka.m40674a(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.C16709gj.m40040k(r3, r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x048b:
            boolean r14 = r0.m40426a((T) r1, r12)
            if (r14 == 0) goto L_0x0551
            int r5 = com.google.android.gms.internal.measurement.C16819ka.m40674a(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.C16709gj.m40029g(r3, r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x049c:
            boolean r14 = r0.m40426a((T) r1, r12)
            if (r14 == 0) goto L_0x0551
            java.lang.Object r5 = com.google.android.gms.internal.measurement.C16819ka.m40704f(r1, r5)
            com.google.android.gms.internal.measurement.fs r5 = (com.google.android.gms.internal.measurement.C16691fs) r5
            int r3 = com.google.android.gms.internal.measurement.C16709gj.m40013c(r3, r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x04af:
            boolean r14 = r0.m40426a((T) r1, r12)
            if (r14 == 0) goto L_0x0551
            java.lang.Object r5 = com.google.android.gms.internal.measurement.C16819ka.m40704f(r1, r5)
            com.google.android.gms.internal.measurement.jb r6 = r0.m40416a(r12)
            int r3 = com.google.android.gms.internal.measurement.C16795jd.m40532a(r3, r5, r6)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x04c4:
            boolean r14 = r0.m40426a((T) r1, r12)
            if (r14 == 0) goto L_0x0551
            java.lang.Object r5 = com.google.android.gms.internal.measurement.C16819ka.m40704f(r1, r5)
            boolean r6 = r5 instanceof com.google.android.gms.internal.measurement.C16691fs
            if (r6 == 0) goto L_0x04db
            com.google.android.gms.internal.measurement.fs r5 = (com.google.android.gms.internal.measurement.C16691fs) r5
            int r3 = com.google.android.gms.internal.measurement.C16709gj.m40013c(r3, r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x04db:
            java.lang.String r5 = (java.lang.String) r5
            int r3 = com.google.android.gms.internal.measurement.C16709gj.m40007b(r3, r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x04e4:
            boolean r5 = r0.m40426a((T) r1, r12)
            if (r5 == 0) goto L_0x0551
            int r3 = com.google.android.gms.internal.measurement.C16709gj.m40008b(r3, r8)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x04f0:
            boolean r5 = r0.m40426a((T) r1, r12)
            if (r5 == 0) goto L_0x0551
            int r3 = com.google.android.gms.internal.measurement.C16709gj.m40036i(r3, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x04fc:
            boolean r5 = r0.m40426a((T) r1, r12)
            if (r5 == 0) goto L_0x0551
            int r3 = com.google.android.gms.internal.measurement.C16709gj.m40030g(r3, r9)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0508:
            boolean r14 = r0.m40426a((T) r1, r12)
            if (r14 == 0) goto L_0x0551
            int r5 = com.google.android.gms.internal.measurement.C16819ka.m40674a(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.C16709gj.m40025f(r3, r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0518:
            boolean r14 = r0.m40426a((T) r1, r12)
            if (r14 == 0) goto L_0x0551
            long r5 = com.google.android.gms.internal.measurement.C16819ka.m40689b(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.C16709gj.m40022e(r3, r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0528:
            boolean r14 = r0.m40426a((T) r1, r12)
            if (r14 == 0) goto L_0x0551
            long r5 = com.google.android.gms.internal.measurement.C16819ka.m40689b(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.C16709gj.m40018d(r3, r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0538:
            boolean r5 = r0.m40426a((T) r1, r12)
            if (r5 == 0) goto L_0x0551
            int r3 = com.google.android.gms.internal.measurement.C16709gj.m40004b(r3, r4)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0544:
            boolean r5 = r0.m40426a((T) r1, r12)
            if (r5 == 0) goto L_0x0551
            r5 = 0
            int r3 = com.google.android.gms.internal.measurement.C16709gj.m40003b(r3, r5)
            int r13 = r13 + r3
        L_0x0551:
            int r12 = r12 + 3
            r3 = 267386880(0xff00000, float:2.3665827E-29)
            goto L_0x0016
        L_0x0557:
            com.google.android.gms.internal.measurement.ju<?, ?> r2 = r0.f47162q
            int r1 = m40414a(r2, (T) r1)
            int r13 = r13 + r1
            return r13
        L_0x055f:
            sun.misc.Unsafe r2 = f47147b
            r3 = -1
            r3 = 0
            r5 = 0
            r6 = -1
            r12 = 0
        L_0x0566:
            int[] r13 = r0.f47148c
            int r13 = r13.length
            if (r3 >= r13) goto L_0x0b09
            int r13 = r0.m40439d(r3)
            int[] r14 = r0.f47148c
            r14 = r14[r3]
            r15 = 267386880(0xff00000, float:2.3665827E-29)
            r16 = r13 & r15
            int r15 = r16 >>> 20
            r4 = 17
            if (r15 > r4) goto L_0x0592
            int[] r4 = r0.f47148c
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
            boolean r4 = r0.f47156k
            if (r4 == 0) goto L_0x05b0
            com.google.android.gms.internal.measurement.gx r4 = com.google.android.gms.internal.measurement.C16729gx.DOUBLE_LIST_PACKED
            int r4 = r4.mo32217id()
            if (r15 < r4) goto L_0x05b0
            com.google.android.gms.internal.measurement.gx r4 = com.google.android.gms.internal.measurement.C16729gx.SINT64_LIST_PACKED
            int r4 = r4.mo32217id()
            if (r15 > r4) goto L_0x05b0
            int[] r4 = r0.f47148c
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
            boolean r4 = r0.m40427a((T) r1, r14, r3)
            if (r4 == 0) goto L_0x09ce
            java.lang.Object r4 = r2.getObject(r1, r8)
            com.google.android.gms.internal.measurement.ik r4 = (com.google.android.gms.internal.measurement.C16775ik) r4
            com.google.android.gms.internal.measurement.jb r8 = r0.m40416a(r3)
            int r4 = com.google.android.gms.internal.measurement.C16709gj.m40015c(r14, r4, r8)
            int r5 = r5 + r4
            goto L_0x09ce
        L_0x05d2:
            boolean r4 = r0.m40427a((T) r1, r14, r3)
            if (r4 == 0) goto L_0x09ce
            long r8 = m40442e(r1, r8)
            int r4 = com.google.android.gms.internal.measurement.C16709gj.m40026f(r14, r8)
            int r5 = r5 + r4
            goto L_0x09ce
        L_0x05e3:
            boolean r4 = r0.m40427a((T) r1, r14, r3)
            if (r4 == 0) goto L_0x09ce
            int r4 = m40440d(r1, r8)
            int r4 = com.google.android.gms.internal.measurement.C16709gj.m40033h(r14, r4)
            int r5 = r5 + r4
            goto L_0x09ce
        L_0x05f4:
            boolean r4 = r0.m40427a((T) r1, r14, r3)
            if (r4 == 0) goto L_0x09ce
            r8 = 0
            int r4 = com.google.android.gms.internal.measurement.C16709gj.m40034h(r14, r8)
            int r5 = r5 + r4
            goto L_0x09ce
        L_0x0603:
            boolean r4 = r0.m40427a((T) r1, r14, r3)
            if (r4 == 0) goto L_0x09ce
            r4 = 0
            int r8 = com.google.android.gms.internal.measurement.C16709gj.m40038j(r14, r4)
            int r5 = r5 + r8
            goto L_0x09ce
        L_0x0611:
            boolean r4 = r0.m40427a((T) r1, r14, r3)
            if (r4 == 0) goto L_0x09ce
            int r4 = m40440d(r1, r8)
            int r4 = com.google.android.gms.internal.measurement.C16709gj.m40040k(r14, r4)
            int r5 = r5 + r4
            goto L_0x09ce
        L_0x0622:
            boolean r4 = r0.m40427a((T) r1, r14, r3)
            if (r4 == 0) goto L_0x09ce
            int r4 = m40440d(r1, r8)
            int r4 = com.google.android.gms.internal.measurement.C16709gj.m40029g(r14, r4)
            int r5 = r5 + r4
            goto L_0x09ce
        L_0x0633:
            boolean r4 = r0.m40427a((T) r1, r14, r3)
            if (r4 == 0) goto L_0x09ce
            java.lang.Object r4 = r2.getObject(r1, r8)
            com.google.android.gms.internal.measurement.fs r4 = (com.google.android.gms.internal.measurement.C16691fs) r4
            int r4 = com.google.android.gms.internal.measurement.C16709gj.m40013c(r14, r4)
            int r5 = r5 + r4
            goto L_0x09ce
        L_0x0646:
            boolean r4 = r0.m40427a((T) r1, r14, r3)
            if (r4 == 0) goto L_0x09ce
            java.lang.Object r4 = r2.getObject(r1, r8)
            com.google.android.gms.internal.measurement.jb r8 = r0.m40416a(r3)
            int r4 = com.google.android.gms.internal.measurement.C16795jd.m40532a(r14, r4, r8)
            int r5 = r5 + r4
            goto L_0x09ce
        L_0x065b:
            boolean r4 = r0.m40427a((T) r1, r14, r3)
            if (r4 == 0) goto L_0x09ce
            java.lang.Object r4 = r2.getObject(r1, r8)
            boolean r8 = r4 instanceof com.google.android.gms.internal.measurement.C16691fs
            if (r8 == 0) goto L_0x0672
            com.google.android.gms.internal.measurement.fs r4 = (com.google.android.gms.internal.measurement.C16691fs) r4
            int r4 = com.google.android.gms.internal.measurement.C16709gj.m40013c(r14, r4)
            int r5 = r5 + r4
            goto L_0x09ce
        L_0x0672:
            java.lang.String r4 = (java.lang.String) r4
            int r4 = com.google.android.gms.internal.measurement.C16709gj.m40007b(r14, r4)
            int r5 = r5 + r4
            goto L_0x09ce
        L_0x067b:
            boolean r4 = r0.m40427a((T) r1, r14, r3)
            if (r4 == 0) goto L_0x09ce
            r4 = 1
            int r8 = com.google.android.gms.internal.measurement.C16709gj.m40008b(r14, r4)
            int r5 = r5 + r8
            goto L_0x09ce
        L_0x0689:
            boolean r4 = r0.m40427a((T) r1, r14, r3)
            if (r4 == 0) goto L_0x09ce
            r4 = 0
            int r8 = com.google.android.gms.internal.measurement.C16709gj.m40036i(r14, r4)
            int r5 = r5 + r8
            goto L_0x09ce
        L_0x0697:
            boolean r4 = r0.m40427a((T) r1, r14, r3)
            if (r4 == 0) goto L_0x09ce
            r8 = 0
            int r4 = com.google.android.gms.internal.measurement.C16709gj.m40030g(r14, r8)
            int r5 = r5 + r4
            goto L_0x09ce
        L_0x06a6:
            boolean r4 = r0.m40427a((T) r1, r14, r3)
            if (r4 == 0) goto L_0x09ce
            int r4 = m40440d(r1, r8)
            int r4 = com.google.android.gms.internal.measurement.C16709gj.m40025f(r14, r4)
            int r5 = r5 + r4
            goto L_0x09ce
        L_0x06b7:
            boolean r4 = r0.m40427a((T) r1, r14, r3)
            if (r4 == 0) goto L_0x09ce
            long r8 = m40442e(r1, r8)
            int r4 = com.google.android.gms.internal.measurement.C16709gj.m40022e(r14, r8)
            int r5 = r5 + r4
            goto L_0x09ce
        L_0x06c8:
            boolean r4 = r0.m40427a((T) r1, r14, r3)
            if (r4 == 0) goto L_0x09ce
            long r8 = m40442e(r1, r8)
            int r4 = com.google.android.gms.internal.measurement.C16709gj.m40018d(r14, r8)
            int r5 = r5 + r4
            goto L_0x09ce
        L_0x06d9:
            boolean r4 = r0.m40427a((T) r1, r14, r3)
            if (r4 == 0) goto L_0x09ce
            r4 = 0
            int r8 = com.google.android.gms.internal.measurement.C16709gj.m40004b(r14, r4)
            int r5 = r5 + r8
            goto L_0x09ce
        L_0x06e7:
            boolean r4 = r0.m40427a((T) r1, r14, r3)
            if (r4 == 0) goto L_0x09ce
            r8 = 0
            int r4 = com.google.android.gms.internal.measurement.C16709gj.m40003b(r14, r8)
            int r5 = r5 + r4
            goto L_0x09ce
        L_0x06f6:
            com.google.android.gms.internal.measurement.if r4 = r0.f47164s
            java.lang.Object r8 = r2.getObject(r1, r8)
            java.lang.Object r9 = r0.m40431b(r3)
            int r4 = r4.mo32286a(r14, r8, r9)
            int r5 = r5 + r4
            goto L_0x09ce
        L_0x0707:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.jb r8 = r0.m40416a(r3)
            int r4 = com.google.android.gms.internal.measurement.C16795jd.m40548b(r14, r4, r8)
            int r5 = r5 + r4
            goto L_0x09ce
        L_0x0718:
            java.lang.Object r8 = r2.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            int r8 = com.google.android.gms.internal.measurement.C16795jd.m40556c(r8)
            if (r8 <= 0) goto L_0x09ce
            boolean r9 = r0.f47156k
            if (r9 == 0) goto L_0x072c
            long r9 = (long) r4
            r2.putInt(r1, r9, r8)
        L_0x072c:
            int r4 = com.google.android.gms.internal.measurement.C16709gj.m40021e(r14)
            int r9 = com.google.android.gms.internal.measurement.C16709gj.m40028g(r8)
            int r4 = r4 + r9
            int r4 = r4 + r8
            int r5 = r5 + r4
            goto L_0x09ce
        L_0x0739:
            java.lang.Object r8 = r2.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            int r8 = com.google.android.gms.internal.measurement.C16795jd.m40570g(r8)
            if (r8 <= 0) goto L_0x09ce
            boolean r9 = r0.f47156k
            if (r9 == 0) goto L_0x074d
            long r9 = (long) r4
            r2.putInt(r1, r9, r8)
        L_0x074d:
            int r4 = com.google.android.gms.internal.measurement.C16709gj.m40021e(r14)
            int r9 = com.google.android.gms.internal.measurement.C16709gj.m40028g(r8)
            int r4 = r4 + r9
            int r4 = r4 + r8
            int r5 = r5 + r4
            goto L_0x09ce
        L_0x075a:
            java.lang.Object r8 = r2.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            int r8 = com.google.android.gms.internal.measurement.C16795jd.m40576i(r8)
            if (r8 <= 0) goto L_0x09ce
            boolean r9 = r0.f47156k
            if (r9 == 0) goto L_0x076e
            long r9 = (long) r4
            r2.putInt(r1, r9, r8)
        L_0x076e:
            int r4 = com.google.android.gms.internal.measurement.C16709gj.m40021e(r14)
            int r9 = com.google.android.gms.internal.measurement.C16709gj.m40028g(r8)
            int r4 = r4 + r9
            int r4 = r4 + r8
            int r5 = r5 + r4
            goto L_0x09ce
        L_0x077b:
            java.lang.Object r8 = r2.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            int r8 = com.google.android.gms.internal.measurement.C16795jd.m40573h(r8)
            if (r8 <= 0) goto L_0x09ce
            boolean r9 = r0.f47156k
            if (r9 == 0) goto L_0x078f
            long r9 = (long) r4
            r2.putInt(r1, r9, r8)
        L_0x078f:
            int r4 = com.google.android.gms.internal.measurement.C16709gj.m40021e(r14)
            int r9 = com.google.android.gms.internal.measurement.C16709gj.m40028g(r8)
            int r4 = r4 + r9
            int r4 = r4 + r8
            int r5 = r5 + r4
            goto L_0x09ce
        L_0x079c:
            java.lang.Object r8 = r2.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            int r8 = com.google.android.gms.internal.measurement.C16795jd.m40560d(r8)
            if (r8 <= 0) goto L_0x09ce
            boolean r9 = r0.f47156k
            if (r9 == 0) goto L_0x07b0
            long r9 = (long) r4
            r2.putInt(r1, r9, r8)
        L_0x07b0:
            int r4 = com.google.android.gms.internal.measurement.C16709gj.m40021e(r14)
            int r9 = com.google.android.gms.internal.measurement.C16709gj.m40028g(r8)
            int r4 = r4 + r9
            int r4 = r4 + r8
            int r5 = r5 + r4
            goto L_0x09ce
        L_0x07bd:
            java.lang.Object r8 = r2.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            int r8 = com.google.android.gms.internal.measurement.C16795jd.m40567f(r8)
            if (r8 <= 0) goto L_0x09ce
            boolean r9 = r0.f47156k
            if (r9 == 0) goto L_0x07d1
            long r9 = (long) r4
            r2.putInt(r1, r9, r8)
        L_0x07d1:
            int r4 = com.google.android.gms.internal.measurement.C16709gj.m40021e(r14)
            int r9 = com.google.android.gms.internal.measurement.C16709gj.m40028g(r8)
            int r4 = r4 + r9
            int r4 = r4 + r8
            int r5 = r5 + r4
            goto L_0x09ce
        L_0x07de:
            java.lang.Object r8 = r2.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            int r8 = com.google.android.gms.internal.measurement.C16795jd.m40579j(r8)
            if (r8 <= 0) goto L_0x09ce
            boolean r9 = r0.f47156k
            if (r9 == 0) goto L_0x07f2
            long r9 = (long) r4
            r2.putInt(r1, r9, r8)
        L_0x07f2:
            int r4 = com.google.android.gms.internal.measurement.C16709gj.m40021e(r14)
            int r9 = com.google.android.gms.internal.measurement.C16709gj.m40028g(r8)
            int r4 = r4 + r9
            int r4 = r4 + r8
            int r5 = r5 + r4
            goto L_0x09ce
        L_0x07ff:
            java.lang.Object r8 = r2.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            int r8 = com.google.android.gms.internal.measurement.C16795jd.m40573h(r8)
            if (r8 <= 0) goto L_0x09ce
            boolean r9 = r0.f47156k
            if (r9 == 0) goto L_0x0813
            long r9 = (long) r4
            r2.putInt(r1, r9, r8)
        L_0x0813:
            int r4 = com.google.android.gms.internal.measurement.C16709gj.m40021e(r14)
            int r9 = com.google.android.gms.internal.measurement.C16709gj.m40028g(r8)
            int r4 = r4 + r9
            int r4 = r4 + r8
            int r5 = r5 + r4
            goto L_0x09ce
        L_0x0820:
            java.lang.Object r8 = r2.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            int r8 = com.google.android.gms.internal.measurement.C16795jd.m40576i(r8)
            if (r8 <= 0) goto L_0x09ce
            boolean r9 = r0.f47156k
            if (r9 == 0) goto L_0x0834
            long r9 = (long) r4
            r2.putInt(r1, r9, r8)
        L_0x0834:
            int r4 = com.google.android.gms.internal.measurement.C16709gj.m40021e(r14)
            int r9 = com.google.android.gms.internal.measurement.C16709gj.m40028g(r8)
            int r4 = r4 + r9
            int r4 = r4 + r8
            int r5 = r5 + r4
            goto L_0x09ce
        L_0x0841:
            java.lang.Object r8 = r2.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            int r8 = com.google.android.gms.internal.measurement.C16795jd.m40564e(r8)
            if (r8 <= 0) goto L_0x09ce
            boolean r9 = r0.f47156k
            if (r9 == 0) goto L_0x0855
            long r9 = (long) r4
            r2.putInt(r1, r9, r8)
        L_0x0855:
            int r4 = com.google.android.gms.internal.measurement.C16709gj.m40021e(r14)
            int r9 = com.google.android.gms.internal.measurement.C16709gj.m40028g(r8)
            int r4 = r4 + r9
            int r4 = r4 + r8
            int r5 = r5 + r4
            goto L_0x09ce
        L_0x0862:
            java.lang.Object r8 = r2.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            int r8 = com.google.android.gms.internal.measurement.C16795jd.m40550b(r8)
            if (r8 <= 0) goto L_0x09ce
            boolean r9 = r0.f47156k
            if (r9 == 0) goto L_0x0876
            long r9 = (long) r4
            r2.putInt(r1, r9, r8)
        L_0x0876:
            int r4 = com.google.android.gms.internal.measurement.C16709gj.m40021e(r14)
            int r9 = com.google.android.gms.internal.measurement.C16709gj.m40028g(r8)
            int r4 = r4 + r9
            int r4 = r4 + r8
            int r5 = r5 + r4
            goto L_0x09ce
        L_0x0883:
            java.lang.Object r8 = r2.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            int r8 = com.google.android.gms.internal.measurement.C16795jd.m40536a(r8)
            if (r8 <= 0) goto L_0x09ce
            boolean r9 = r0.f47156k
            if (r9 == 0) goto L_0x0897
            long r9 = (long) r4
            r2.putInt(r1, r9, r8)
        L_0x0897:
            int r4 = com.google.android.gms.internal.measurement.C16709gj.m40021e(r14)
            int r9 = com.google.android.gms.internal.measurement.C16709gj.m40028g(r8)
            int r4 = r4 + r9
            int r4 = r4 + r8
            int r5 = r5 + r4
            goto L_0x09ce
        L_0x08a4:
            java.lang.Object r8 = r2.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            int r8 = com.google.android.gms.internal.measurement.C16795jd.m40573h(r8)
            if (r8 <= 0) goto L_0x09ce
            boolean r9 = r0.f47156k
            if (r9 == 0) goto L_0x08b8
            long r9 = (long) r4
            r2.putInt(r1, r9, r8)
        L_0x08b8:
            int r4 = com.google.android.gms.internal.measurement.C16709gj.m40021e(r14)
            int r9 = com.google.android.gms.internal.measurement.C16709gj.m40028g(r8)
            int r4 = r4 + r9
            int r4 = r4 + r8
            int r5 = r5 + r4
            goto L_0x09ce
        L_0x08c5:
            java.lang.Object r8 = r2.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            int r8 = com.google.android.gms.internal.measurement.C16795jd.m40576i(r8)
            if (r8 <= 0) goto L_0x09ce
            boolean r9 = r0.f47156k
            if (r9 == 0) goto L_0x08d9
            long r9 = (long) r4
            r2.putInt(r1, r9, r8)
        L_0x08d9:
            int r4 = com.google.android.gms.internal.measurement.C16709gj.m40021e(r14)
            int r9 = com.google.android.gms.internal.measurement.C16709gj.m40028g(r8)
            int r4 = r4 + r9
            int r4 = r4 + r8
            int r5 = r5 + r4
            goto L_0x09ce
        L_0x08e6:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            r10 = 0
            int r4 = com.google.android.gms.internal.measurement.C16795jd.m40555c(r14, r4, r10)
            int r5 = r5 + r4
            goto L_0x09be
        L_0x08f4:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C16795jd.m40569g(r14, r4, r10)
            int r5 = r5 + r4
            goto L_0x09be
        L_0x0902:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C16795jd.m40575i(r14, r4, r10)
            int r5 = r5 + r4
            goto L_0x09be
        L_0x0910:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C16795jd.m40572h(r14, r4, r10)
            int r5 = r5 + r4
            goto L_0x09be
        L_0x091e:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C16795jd.m40559d(r14, r4, r10)
            int r5 = r5 + r4
            goto L_0x09be
        L_0x092c:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C16795jd.m40566f(r14, r4, r10)
            int r5 = r5 + r4
            goto L_0x09ce
        L_0x093a:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C16795jd.m40547b(r14, r4)
            int r5 = r5 + r4
            goto L_0x09ce
        L_0x0947:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.jb r8 = r0.m40416a(r3)
            int r4 = com.google.android.gms.internal.measurement.C16795jd.m40534a(r14, r4, r8)
            int r5 = r5 + r4
            goto L_0x09ce
        L_0x0958:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C16795jd.m40533a(r14, r4)
            int r5 = r5 + r4
            goto L_0x09ce
        L_0x0964:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            r10 = 0
            int r4 = com.google.android.gms.internal.measurement.C16795jd.m40578j(r14, r4, r10)
            int r5 = r5 + r4
            goto L_0x09be
        L_0x0971:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C16795jd.m40572h(r14, r4, r10)
            int r5 = r5 + r4
            goto L_0x09be
        L_0x097e:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C16795jd.m40575i(r14, r4, r10)
            int r5 = r5 + r4
            goto L_0x09be
        L_0x098b:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C16795jd.m40563e(r14, r4, r10)
            int r5 = r5 + r4
            goto L_0x09be
        L_0x0998:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C16795jd.m40549b(r14, r4, r10)
            int r5 = r5 + r4
            goto L_0x09be
        L_0x09a5:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C16795jd.m40535a(r14, r4, r10)
            int r5 = r5 + r4
            goto L_0x09be
        L_0x09b2:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C16795jd.m40572h(r14, r4, r10)
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
            int r4 = com.google.android.gms.internal.measurement.C16795jd.m40575i(r14, r4, r10)
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
            com.google.android.gms.internal.measurement.ik r4 = (com.google.android.gms.internal.measurement.C16775ik) r4
            com.google.android.gms.internal.measurement.jb r8 = r0.m40416a(r3)
            int r4 = com.google.android.gms.internal.measurement.C16709gj.m40015c(r14, r4, r8)
            int r5 = r5 + r4
            goto L_0x09ce
        L_0x09ea:
            r4 = r12 & r16
            if (r4 == 0) goto L_0x09ce
            long r8 = r2.getLong(r1, r8)
            int r4 = com.google.android.gms.internal.measurement.C16709gj.m40026f(r14, r8)
            int r5 = r5 + r4
            goto L_0x09ce
        L_0x09f8:
            r4 = r12 & r16
            if (r4 == 0) goto L_0x09ce
            int r4 = r2.getInt(r1, r8)
            int r4 = com.google.android.gms.internal.measurement.C16709gj.m40033h(r14, r4)
            int r5 = r5 + r4
            goto L_0x09ce
        L_0x0a06:
            r4 = r12 & r16
            if (r4 == 0) goto L_0x09ce
            r8 = 0
            int r4 = com.google.android.gms.internal.measurement.C16709gj.m40034h(r14, r8)
            int r5 = r5 + r4
            goto L_0x09ce
        L_0x0a12:
            r4 = r12 & r16
            if (r4 == 0) goto L_0x09ce
            r4 = 0
            int r8 = com.google.android.gms.internal.measurement.C16709gj.m40038j(r14, r4)
            int r5 = r5 + r8
            goto L_0x09ce
        L_0x0a1d:
            r4 = r12 & r16
            if (r4 == 0) goto L_0x09ce
            int r4 = r2.getInt(r1, r8)
            int r4 = com.google.android.gms.internal.measurement.C16709gj.m40040k(r14, r4)
            int r5 = r5 + r4
            goto L_0x09ce
        L_0x0a2b:
            r4 = r12 & r16
            if (r4 == 0) goto L_0x09ce
            int r4 = r2.getInt(r1, r8)
            int r4 = com.google.android.gms.internal.measurement.C16709gj.m40029g(r14, r4)
            int r5 = r5 + r4
            goto L_0x09ce
        L_0x0a39:
            r4 = r12 & r16
            if (r4 == 0) goto L_0x09ce
            java.lang.Object r4 = r2.getObject(r1, r8)
            com.google.android.gms.internal.measurement.fs r4 = (com.google.android.gms.internal.measurement.C16691fs) r4
            int r4 = com.google.android.gms.internal.measurement.C16709gj.m40013c(r14, r4)
            int r5 = r5 + r4
            goto L_0x09ce
        L_0x0a49:
            r4 = r12 & r16
            if (r4 == 0) goto L_0x09ce
            java.lang.Object r4 = r2.getObject(r1, r8)
            com.google.android.gms.internal.measurement.jb r8 = r0.m40416a(r3)
            int r4 = com.google.android.gms.internal.measurement.C16795jd.m40532a(r14, r4, r8)
            int r5 = r5 + r4
            goto L_0x09ce
        L_0x0a5c:
            r4 = r12 & r16
            if (r4 == 0) goto L_0x09ce
            java.lang.Object r4 = r2.getObject(r1, r8)
            boolean r8 = r4 instanceof com.google.android.gms.internal.measurement.C16691fs
            if (r8 == 0) goto L_0x0a71
            com.google.android.gms.internal.measurement.fs r4 = (com.google.android.gms.internal.measurement.C16691fs) r4
            int r4 = com.google.android.gms.internal.measurement.C16709gj.m40013c(r14, r4)
            int r5 = r5 + r4
            goto L_0x09ce
        L_0x0a71:
            java.lang.String r4 = (java.lang.String) r4
            int r4 = com.google.android.gms.internal.measurement.C16709gj.m40007b(r14, r4)
            int r5 = r5 + r4
            goto L_0x09ce
        L_0x0a7a:
            r4 = r12 & r16
            if (r4 == 0) goto L_0x09ce
            r4 = 1
            int r8 = com.google.android.gms.internal.measurement.C16709gj.m40008b(r14, r4)
            int r5 = r5 + r8
            goto L_0x09cf
        L_0x0a86:
            r4 = 1
            r8 = r12 & r16
            if (r8 == 0) goto L_0x0a93
            r10 = 0
            int r8 = com.google.android.gms.internal.measurement.C16709gj.m40036i(r14, r10)
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
            int r11 = com.google.android.gms.internal.measurement.C16709gj.m40030g(r14, r8)
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
            int r8 = com.google.android.gms.internal.measurement.C16709gj.m40025f(r14, r8)
            int r5 = r5 + r8
            goto L_0x0aea
        L_0x0ab8:
            r4 = 1
            r10 = 0
            r18 = 0
            r11 = r12 & r16
            if (r11 == 0) goto L_0x0aea
            long r8 = r2.getLong(r1, r8)
            int r8 = com.google.android.gms.internal.measurement.C16709gj.m40022e(r14, r8)
            int r5 = r5 + r8
            goto L_0x0aea
        L_0x0aca:
            r4 = 1
            r10 = 0
            r18 = 0
            r11 = r12 & r16
            if (r11 == 0) goto L_0x0aea
            long r8 = r2.getLong(r1, r8)
            int r8 = com.google.android.gms.internal.measurement.C16709gj.m40018d(r14, r8)
            int r5 = r5 + r8
            goto L_0x0aea
        L_0x0adc:
            r4 = 1
            r10 = 0
            r18 = 0
            r8 = r12 & r16
            if (r8 == 0) goto L_0x0aea
            r8 = 0
            int r9 = com.google.android.gms.internal.measurement.C16709gj.m40004b(r14, r8)
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
            int r9 = com.google.android.gms.internal.measurement.C16709gj.m40003b(r14, r7)
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
            com.google.android.gms.internal.measurement.ju<?, ?> r2 = r0.f47162q
            int r2 = m40414a(r2, (T) r1)
            int r5 = r5 + r2
            boolean r2 = r0.f47153h
            if (r2 == 0) goto L_0x0b63
            com.google.android.gms.internal.measurement.gr<?> r2 = r0.f47163r
            com.google.android.gms.internal.measurement.gu r1 = r2.mo32193a(r1)
            r2 = 0
        L_0x0b1c:
            com.google.android.gms.internal.measurement.je<FieldDescriptorType, java.lang.Object> r3 = r1.f47003a
            int r3 = r3.mo32315b()
            if (r10 >= r3) goto L_0x0b3c
            com.google.android.gms.internal.measurement.je<FieldDescriptorType, java.lang.Object> r3 = r1.f47003a
            java.util.Map$Entry r3 = r3.mo32316b(r10)
            java.lang.Object r4 = r3.getKey()
            com.google.android.gms.internal.measurement.gw r4 = (com.google.android.gms.internal.measurement.C16728gw) r4
            java.lang.Object r3 = r3.getValue()
            int r3 = com.google.android.gms.internal.measurement.C16726gu.m40242a(r4, r3)
            int r2 = r2 + r3
            int r10 = r10 + 1
            goto L_0x0b1c
        L_0x0b3c:
            com.google.android.gms.internal.measurement.je<FieldDescriptorType, java.lang.Object> r1 = r1.f47003a
            java.lang.Iterable r1 = r1.mo32317c()
            java.util.Iterator r1 = r1.iterator()
        L_0x0b46:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0b62
            java.lang.Object r3 = r1.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            com.google.android.gms.internal.measurement.gw r4 = (com.google.android.gms.internal.measurement.C16728gw) r4
            java.lang.Object r3 = r3.getValue()
            int r3 = com.google.android.gms.internal.measurement.C16726gu.m40242a(r4, r3)
            int r2 = r2 + r3
            goto L_0x0b46
        L_0x0b62:
            int r5 = r5 + r2
        L_0x0b63:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C16779io.mo32302b(java.lang.Object):int");
    }

    /* renamed from: a */
    private static <UT, UB> int m40414a(C16812ju<UT, UB> juVar, T t) {
        return juVar.mo32373f(juVar.mo32365b(t));
    }

    /* renamed from: a */
    private static <E> List<E> m40420a(Object obj, long j) {
        return (List) C16819ka.m40704f(obj, j);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x052c  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x056a  */
    /* JADX WARNING: Removed duplicated region for block: B:335:0x0a42  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo32300a(T r14, com.google.android.gms.internal.measurement.C16838kp r15) throws java.io.IOException {
        /*
            r13 = this;
            int r0 = r15.mo32144a()
            int r1 = com.google.android.gms.internal.measurement.C16736hd.C16741e.f47100k
            r2 = 267386880(0xff00000, float:2.3665827E-29)
            r3 = 0
            r4 = 1
            r5 = 0
            r6 = 1048575(0xfffff, float:1.469367E-39)
            if (r0 != r1) goto L_0x0542
            com.google.android.gms.internal.measurement.ju<?, ?> r0 = r13.f47162q
            m40422a(r0, (T) r14, r15)
            boolean r0 = r13.f47153h
            if (r0 == 0) goto L_0x004b
            com.google.android.gms.internal.measurement.gr<?> r0 = r13.f47163r
            com.google.android.gms.internal.measurement.gu r0 = r0.mo32193a(r14)
            boolean r1 = r0.mo32203a()
            if (r1 != 0) goto L_0x004b
            boolean r1 = r0.f47005c
            if (r1 == 0) goto L_0x003a
            com.google.android.gms.internal.measurement.hq r1 = new com.google.android.gms.internal.measurement.hq
            com.google.android.gms.internal.measurement.je<FieldDescriptorType, java.lang.Object> r0 = r0.f47003a
            java.util.Set r0 = r0.mo32321d()
            java.util.Iterator r0 = r0.iterator()
            r1.<init>(r0)
            r0 = r1
            goto L_0x0044
        L_0x003a:
            com.google.android.gms.internal.measurement.je<FieldDescriptorType, java.lang.Object> r0 = r0.f47003a
            java.util.Set r0 = r0.mo32321d()
            java.util.Iterator r0 = r0.iterator()
        L_0x0044:
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x004d
        L_0x004b:
            r0 = r3
            r1 = r0
        L_0x004d:
            int[] r7 = r13.f47148c
            int r7 = r7.length
            int r7 = r7 + -3
        L_0x0052:
            if (r7 < 0) goto L_0x052a
            int r8 = r13.m40439d(r7)
            int[] r9 = r13.f47148c
            r9 = r9[r7]
        L_0x005c:
            if (r1 == 0) goto L_0x007a
            com.google.android.gms.internal.measurement.gr<?> r10 = r13.f47163r
            int r10 = r10.mo32192a(r1)
            if (r10 <= r9) goto L_0x007a
            com.google.android.gms.internal.measurement.gr<?> r10 = r13.f47163r
            r10.mo32198a(r15, r1)
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
            boolean r10 = r13.m40427a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x0526
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C16819ka.m40704f(r14, r10)
            com.google.android.gms.internal.measurement.jb r10 = r13.m40416a(r7)
            r15.mo32162b(r9, r8, r10)
            goto L_0x0526
        L_0x0098:
            boolean r10 = r13.m40427a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x0526
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = m40442e(r14, r10)
            r15.mo32173e(r9, r10)
            goto L_0x0526
        L_0x00a9:
            boolean r10 = r13.m40427a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x0526
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = m40440d(r14, r10)
            r15.mo32175f(r9, r8)
            goto L_0x0526
        L_0x00ba:
            boolean r10 = r13.m40427a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x0526
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = m40442e(r14, r10)
            r15.mo32161b(r9, r10)
            goto L_0x0526
        L_0x00cb:
            boolean r10 = r13.m40427a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x0526
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = m40440d(r14, r10)
            r15.mo32148a(r9, r8)
            goto L_0x0526
        L_0x00dc:
            boolean r10 = r13.m40427a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x0526
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = m40440d(r14, r10)
            r15.mo32160b(r9, r8)
            goto L_0x0526
        L_0x00ed:
            boolean r10 = r13.m40427a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x0526
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = m40440d(r14, r10)
            r15.mo32172e(r9, r8)
            goto L_0x0526
        L_0x00fe:
            boolean r10 = r13.m40427a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x0526
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C16819ka.m40704f(r14, r10)
            com.google.android.gms.internal.measurement.fs r8 = (com.google.android.gms.internal.measurement.C16691fs) r8
            r15.mo32150a(r9, r8)
            goto L_0x0526
        L_0x0111:
            boolean r10 = r13.m40427a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x0526
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C16819ka.m40704f(r14, r10)
            com.google.android.gms.internal.measurement.jb r10 = r13.m40416a(r7)
            r15.mo32153a(r9, r8, r10)
            goto L_0x0526
        L_0x0126:
            boolean r10 = r13.m40427a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x0526
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C16819ka.m40704f(r14, r10)
            m40421a(r9, r8, r15)
            goto L_0x0526
        L_0x0137:
            boolean r10 = r13.m40427a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x0526
            r8 = r8 & r6
            long r10 = (long) r8
            boolean r8 = m40444f(r14, r10)
            r15.mo32158a(r9, r8)
            goto L_0x0526
        L_0x0148:
            boolean r10 = r13.m40427a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x0526
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = m40440d(r14, r10)
            r15.mo32169d(r9, r8)
            goto L_0x0526
        L_0x0159:
            boolean r10 = r13.m40427a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x0526
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = m40442e(r14, r10)
            r15.mo32170d(r9, r10)
            goto L_0x0526
        L_0x016a:
            boolean r10 = r13.m40427a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x0526
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = m40440d(r14, r10)
            r15.mo32166c(r9, r8)
            goto L_0x0526
        L_0x017b:
            boolean r10 = r13.m40427a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x0526
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = m40442e(r14, r10)
            r15.mo32167c(r9, r10)
            goto L_0x0526
        L_0x018c:
            boolean r10 = r13.m40427a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x0526
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = m40442e(r14, r10)
            r15.mo32149a(r9, r10)
            goto L_0x0526
        L_0x019d:
            boolean r10 = r13.m40427a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x0526
            r8 = r8 & r6
            long r10 = (long) r8
            float r8 = m40436c(r14, r10)
            r15.mo32147a(r9, r8)
            goto L_0x0526
        L_0x01ae:
            boolean r10 = r13.m40427a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x0526
            r8 = r8 & r6
            long r10 = (long) r8
            double r10 = m40430b((T) r14, r10)
            r15.mo32146a(r9, r10)
            goto L_0x0526
        L_0x01bf:
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C16819ka.m40704f(r14, r10)
            r13.m40423a(r15, r9, r8, r7)
            goto L_0x0526
        L_0x01ca:
            int[] r9 = r13.f47148c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C16819ka.m40704f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.jb r10 = r13.m40416a(r7)
            com.google.android.gms.internal.measurement.C16795jd.m40553b(r9, r8, r15, r10)
            goto L_0x0526
        L_0x01df:
            int[] r9 = r13.f47148c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C16819ka.m40704f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C16795jd.m40565e(r9, r8, r15, r4)
            goto L_0x0526
        L_0x01f0:
            int[] r9 = r13.f47148c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C16819ka.m40704f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C16795jd.m40580j(r9, r8, r15, r4)
            goto L_0x0526
        L_0x0201:
            int[] r9 = r13.f47148c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C16819ka.m40704f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C16795jd.m40571g(r9, r8, r15, r4)
            goto L_0x0526
        L_0x0212:
            int[] r9 = r13.f47148c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C16819ka.m40704f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C16795jd.m40582l(r9, r8, r15, r4)
            goto L_0x0526
        L_0x0223:
            int[] r9 = r13.f47148c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C16819ka.m40704f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C16795jd.m40583m(r9, r8, r15, r4)
            goto L_0x0526
        L_0x0234:
            int[] r9 = r13.f47148c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C16819ka.m40704f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C16795jd.m40577i(r9, r8, r15, r4)
            goto L_0x0526
        L_0x0245:
            int[] r9 = r13.f47148c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C16819ka.m40704f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C16795jd.m40584n(r9, r8, r15, r4)
            goto L_0x0526
        L_0x0256:
            int[] r9 = r13.f47148c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C16819ka.m40704f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C16795jd.m40581k(r9, r8, r15, r4)
            goto L_0x0526
        L_0x0267:
            int[] r9 = r13.f47148c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C16819ka.m40704f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C16795jd.m40568f(r9, r8, r15, r4)
            goto L_0x0526
        L_0x0278:
            int[] r9 = r13.f47148c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C16819ka.m40704f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C16795jd.m40574h(r9, r8, r15, r4)
            goto L_0x0526
        L_0x0289:
            int[] r9 = r13.f47148c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C16819ka.m40704f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C16795jd.m40562d(r9, r8, r15, r4)
            goto L_0x0526
        L_0x029a:
            int[] r9 = r13.f47148c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C16819ka.m40704f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C16795jd.m40558c(r9, r8, r15, r4)
            goto L_0x0526
        L_0x02ab:
            int[] r9 = r13.f47148c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C16819ka.m40704f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C16795jd.m40554b(r9, r8, r15, r4)
            goto L_0x0526
        L_0x02bc:
            int[] r9 = r13.f47148c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C16819ka.m40704f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C16795jd.m40543a(r9, r8, r15, r4)
            goto L_0x0526
        L_0x02cd:
            int[] r9 = r13.f47148c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C16819ka.m40704f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C16795jd.m40565e(r9, r8, r15, r5)
            goto L_0x0526
        L_0x02de:
            int[] r9 = r13.f47148c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C16819ka.m40704f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C16795jd.m40580j(r9, r8, r15, r5)
            goto L_0x0526
        L_0x02ef:
            int[] r9 = r13.f47148c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C16819ka.m40704f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C16795jd.m40571g(r9, r8, r15, r5)
            goto L_0x0526
        L_0x0300:
            int[] r9 = r13.f47148c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C16819ka.m40704f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C16795jd.m40582l(r9, r8, r15, r5)
            goto L_0x0526
        L_0x0311:
            int[] r9 = r13.f47148c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C16819ka.m40704f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C16795jd.m40583m(r9, r8, r15, r5)
            goto L_0x0526
        L_0x0322:
            int[] r9 = r13.f47148c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C16819ka.m40704f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C16795jd.m40577i(r9, r8, r15, r5)
            goto L_0x0526
        L_0x0333:
            int[] r9 = r13.f47148c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C16819ka.m40704f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C16795jd.m40552b(r9, r8, r15)
            goto L_0x0526
        L_0x0344:
            int[] r9 = r13.f47148c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C16819ka.m40704f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.jb r10 = r13.m40416a(r7)
            com.google.android.gms.internal.measurement.C16795jd.m40542a(r9, r8, r15, r10)
            goto L_0x0526
        L_0x0359:
            int[] r9 = r13.f47148c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C16819ka.m40704f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C16795jd.m40541a(r9, r8, r15)
            goto L_0x0526
        L_0x036a:
            int[] r9 = r13.f47148c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C16819ka.m40704f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C16795jd.m40584n(r9, r8, r15, r5)
            goto L_0x0526
        L_0x037b:
            int[] r9 = r13.f47148c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C16819ka.m40704f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C16795jd.m40581k(r9, r8, r15, r5)
            goto L_0x0526
        L_0x038c:
            int[] r9 = r13.f47148c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C16819ka.m40704f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C16795jd.m40568f(r9, r8, r15, r5)
            goto L_0x0526
        L_0x039d:
            int[] r9 = r13.f47148c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C16819ka.m40704f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C16795jd.m40574h(r9, r8, r15, r5)
            goto L_0x0526
        L_0x03ae:
            int[] r9 = r13.f47148c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C16819ka.m40704f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C16795jd.m40562d(r9, r8, r15, r5)
            goto L_0x0526
        L_0x03bf:
            int[] r9 = r13.f47148c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C16819ka.m40704f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C16795jd.m40558c(r9, r8, r15, r5)
            goto L_0x0526
        L_0x03d0:
            int[] r9 = r13.f47148c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C16819ka.m40704f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C16795jd.m40554b(r9, r8, r15, r5)
            goto L_0x0526
        L_0x03e1:
            int[] r9 = r13.f47148c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C16819ka.m40704f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C16795jd.m40543a(r9, r8, r15, r5)
            goto L_0x0526
        L_0x03f2:
            boolean r10 = r13.m40426a((T) r14, r7)
            if (r10 == 0) goto L_0x0526
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C16819ka.m40704f(r14, r10)
            com.google.android.gms.internal.measurement.jb r10 = r13.m40416a(r7)
            r15.mo32162b(r9, r8, r10)
            goto L_0x0526
        L_0x0407:
            boolean r10 = r13.m40426a((T) r14, r7)
            if (r10 == 0) goto L_0x0526
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.measurement.C16819ka.m40689b(r14, r10)
            r15.mo32173e(r9, r10)
            goto L_0x0526
        L_0x0418:
            boolean r10 = r13.m40426a((T) r14, r7)
            if (r10 == 0) goto L_0x0526
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.measurement.C16819ka.m40674a(r14, r10)
            r15.mo32175f(r9, r8)
            goto L_0x0526
        L_0x0429:
            boolean r10 = r13.m40426a((T) r14, r7)
            if (r10 == 0) goto L_0x0526
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.measurement.C16819ka.m40689b(r14, r10)
            r15.mo32161b(r9, r10)
            goto L_0x0526
        L_0x043a:
            boolean r10 = r13.m40426a((T) r14, r7)
            if (r10 == 0) goto L_0x0526
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.measurement.C16819ka.m40674a(r14, r10)
            r15.mo32148a(r9, r8)
            goto L_0x0526
        L_0x044b:
            boolean r10 = r13.m40426a((T) r14, r7)
            if (r10 == 0) goto L_0x0526
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.measurement.C16819ka.m40674a(r14, r10)
            r15.mo32160b(r9, r8)
            goto L_0x0526
        L_0x045c:
            boolean r10 = r13.m40426a((T) r14, r7)
            if (r10 == 0) goto L_0x0526
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.measurement.C16819ka.m40674a(r14, r10)
            r15.mo32172e(r9, r8)
            goto L_0x0526
        L_0x046d:
            boolean r10 = r13.m40426a((T) r14, r7)
            if (r10 == 0) goto L_0x0526
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C16819ka.m40704f(r14, r10)
            com.google.android.gms.internal.measurement.fs r8 = (com.google.android.gms.internal.measurement.C16691fs) r8
            r15.mo32150a(r9, r8)
            goto L_0x0526
        L_0x0480:
            boolean r10 = r13.m40426a((T) r14, r7)
            if (r10 == 0) goto L_0x0526
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C16819ka.m40704f(r14, r10)
            com.google.android.gms.internal.measurement.jb r10 = r13.m40416a(r7)
            r15.mo32153a(r9, r8, r10)
            goto L_0x0526
        L_0x0495:
            boolean r10 = r13.m40426a((T) r14, r7)
            if (r10 == 0) goto L_0x0526
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C16819ka.m40704f(r14, r10)
            m40421a(r9, r8, r15)
            goto L_0x0526
        L_0x04a6:
            boolean r10 = r13.m40426a((T) r14, r7)
            if (r10 == 0) goto L_0x0526
            r8 = r8 & r6
            long r10 = (long) r8
            boolean r8 = com.google.android.gms.internal.measurement.C16819ka.m40697c(r14, r10)
            r15.mo32158a(r9, r8)
            goto L_0x0526
        L_0x04b7:
            boolean r10 = r13.m40426a((T) r14, r7)
            if (r10 == 0) goto L_0x0526
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.measurement.C16819ka.m40674a(r14, r10)
            r15.mo32169d(r9, r8)
            goto L_0x0526
        L_0x04c7:
            boolean r10 = r13.m40426a((T) r14, r7)
            if (r10 == 0) goto L_0x0526
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.measurement.C16819ka.m40689b(r14, r10)
            r15.mo32170d(r9, r10)
            goto L_0x0526
        L_0x04d7:
            boolean r10 = r13.m40426a((T) r14, r7)
            if (r10 == 0) goto L_0x0526
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.measurement.C16819ka.m40674a(r14, r10)
            r15.mo32166c(r9, r8)
            goto L_0x0526
        L_0x04e7:
            boolean r10 = r13.m40426a((T) r14, r7)
            if (r10 == 0) goto L_0x0526
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.measurement.C16819ka.m40689b(r14, r10)
            r15.mo32167c(r9, r10)
            goto L_0x0526
        L_0x04f7:
            boolean r10 = r13.m40426a((T) r14, r7)
            if (r10 == 0) goto L_0x0526
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.measurement.C16819ka.m40689b(r14, r10)
            r15.mo32149a(r9, r10)
            goto L_0x0526
        L_0x0507:
            boolean r10 = r13.m40426a((T) r14, r7)
            if (r10 == 0) goto L_0x0526
            r8 = r8 & r6
            long r10 = (long) r8
            float r8 = com.google.android.gms.internal.measurement.C16819ka.m40698d(r14, r10)
            r15.mo32147a(r9, r8)
            goto L_0x0526
        L_0x0517:
            boolean r10 = r13.m40426a((T) r14, r7)
            if (r10 == 0) goto L_0x0526
            r8 = r8 & r6
            long r10 = (long) r8
            double r10 = com.google.android.gms.internal.measurement.C16819ka.m40702e(r14, r10)
            r15.mo32146a(r9, r10)
        L_0x0526:
            int r7 = r7 + -3
            goto L_0x0052
        L_0x052a:
            if (r1 == 0) goto L_0x0541
            com.google.android.gms.internal.measurement.gr<?> r14 = r13.f47163r
            r14.mo32198a(r15, r1)
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
            boolean r0 = r13.f47155j
            if (r0 == 0) goto L_0x0a5d
            boolean r0 = r13.f47153h
            if (r0 == 0) goto L_0x0561
            com.google.android.gms.internal.measurement.gr<?> r0 = r13.f47163r
            com.google.android.gms.internal.measurement.gu r0 = r0.mo32193a(r14)
            boolean r1 = r0.mo32203a()
            if (r1 != 0) goto L_0x0561
            java.util.Iterator r0 = r0.mo32205c()
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x0563
        L_0x0561:
            r0 = r3
            r1 = r0
        L_0x0563:
            int[] r7 = r13.f47148c
            int r7 = r7.length
            r8 = r1
            r1 = 0
        L_0x0568:
            if (r1 >= r7) goto L_0x0a40
            int r9 = r13.m40439d(r1)
            int[] r10 = r13.f47148c
            r10 = r10[r1]
        L_0x0572:
            if (r8 == 0) goto L_0x0590
            com.google.android.gms.internal.measurement.gr<?> r11 = r13.f47163r
            int r11 = r11.mo32192a(r8)
            if (r11 > r10) goto L_0x0590
            com.google.android.gms.internal.measurement.gr<?> r11 = r13.f47163r
            r11.mo32198a(r15, r8)
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
            boolean r11 = r13.m40427a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a3c
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C16819ka.m40704f(r14, r11)
            com.google.android.gms.internal.measurement.jb r11 = r13.m40416a(r1)
            r15.mo32162b(r10, r9, r11)
            goto L_0x0a3c
        L_0x05ae:
            boolean r11 = r13.m40427a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a3c
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = m40442e(r14, r11)
            r15.mo32173e(r10, r11)
            goto L_0x0a3c
        L_0x05bf:
            boolean r11 = r13.m40427a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a3c
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = m40440d(r14, r11)
            r15.mo32175f(r10, r9)
            goto L_0x0a3c
        L_0x05d0:
            boolean r11 = r13.m40427a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a3c
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = m40442e(r14, r11)
            r15.mo32161b(r10, r11)
            goto L_0x0a3c
        L_0x05e1:
            boolean r11 = r13.m40427a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a3c
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = m40440d(r14, r11)
            r15.mo32148a(r10, r9)
            goto L_0x0a3c
        L_0x05f2:
            boolean r11 = r13.m40427a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a3c
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = m40440d(r14, r11)
            r15.mo32160b(r10, r9)
            goto L_0x0a3c
        L_0x0603:
            boolean r11 = r13.m40427a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a3c
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = m40440d(r14, r11)
            r15.mo32172e(r10, r9)
            goto L_0x0a3c
        L_0x0614:
            boolean r11 = r13.m40427a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a3c
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C16819ka.m40704f(r14, r11)
            com.google.android.gms.internal.measurement.fs r9 = (com.google.android.gms.internal.measurement.C16691fs) r9
            r15.mo32150a(r10, r9)
            goto L_0x0a3c
        L_0x0627:
            boolean r11 = r13.m40427a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a3c
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C16819ka.m40704f(r14, r11)
            com.google.android.gms.internal.measurement.jb r11 = r13.m40416a(r1)
            r15.mo32153a(r10, r9, r11)
            goto L_0x0a3c
        L_0x063c:
            boolean r11 = r13.m40427a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a3c
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C16819ka.m40704f(r14, r11)
            m40421a(r10, r9, r15)
            goto L_0x0a3c
        L_0x064d:
            boolean r11 = r13.m40427a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a3c
            r9 = r9 & r6
            long r11 = (long) r9
            boolean r9 = m40444f(r14, r11)
            r15.mo32158a(r10, r9)
            goto L_0x0a3c
        L_0x065e:
            boolean r11 = r13.m40427a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a3c
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = m40440d(r14, r11)
            r15.mo32169d(r10, r9)
            goto L_0x0a3c
        L_0x066f:
            boolean r11 = r13.m40427a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a3c
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = m40442e(r14, r11)
            r15.mo32170d(r10, r11)
            goto L_0x0a3c
        L_0x0680:
            boolean r11 = r13.m40427a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a3c
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = m40440d(r14, r11)
            r15.mo32166c(r10, r9)
            goto L_0x0a3c
        L_0x0691:
            boolean r11 = r13.m40427a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a3c
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = m40442e(r14, r11)
            r15.mo32167c(r10, r11)
            goto L_0x0a3c
        L_0x06a2:
            boolean r11 = r13.m40427a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a3c
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = m40442e(r14, r11)
            r15.mo32149a(r10, r11)
            goto L_0x0a3c
        L_0x06b3:
            boolean r11 = r13.m40427a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a3c
            r9 = r9 & r6
            long r11 = (long) r9
            float r9 = m40436c(r14, r11)
            r15.mo32147a(r10, r9)
            goto L_0x0a3c
        L_0x06c4:
            boolean r11 = r13.m40427a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a3c
            r9 = r9 & r6
            long r11 = (long) r9
            double r11 = m40430b((T) r14, r11)
            r15.mo32146a(r10, r11)
            goto L_0x0a3c
        L_0x06d5:
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C16819ka.m40704f(r14, r11)
            r13.m40423a(r15, r10, r9, r1)
            goto L_0x0a3c
        L_0x06e0:
            int[] r10 = r13.f47148c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C16819ka.m40704f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.jb r11 = r13.m40416a(r1)
            com.google.android.gms.internal.measurement.C16795jd.m40553b(r10, r9, r15, r11)
            goto L_0x0a3c
        L_0x06f5:
            int[] r10 = r13.f47148c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C16819ka.m40704f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C16795jd.m40565e(r10, r9, r15, r4)
            goto L_0x0a3c
        L_0x0706:
            int[] r10 = r13.f47148c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C16819ka.m40704f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C16795jd.m40580j(r10, r9, r15, r4)
            goto L_0x0a3c
        L_0x0717:
            int[] r10 = r13.f47148c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C16819ka.m40704f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C16795jd.m40571g(r10, r9, r15, r4)
            goto L_0x0a3c
        L_0x0728:
            int[] r10 = r13.f47148c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C16819ka.m40704f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C16795jd.m40582l(r10, r9, r15, r4)
            goto L_0x0a3c
        L_0x0739:
            int[] r10 = r13.f47148c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C16819ka.m40704f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C16795jd.m40583m(r10, r9, r15, r4)
            goto L_0x0a3c
        L_0x074a:
            int[] r10 = r13.f47148c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C16819ka.m40704f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C16795jd.m40577i(r10, r9, r15, r4)
            goto L_0x0a3c
        L_0x075b:
            int[] r10 = r13.f47148c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C16819ka.m40704f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C16795jd.m40584n(r10, r9, r15, r4)
            goto L_0x0a3c
        L_0x076c:
            int[] r10 = r13.f47148c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C16819ka.m40704f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C16795jd.m40581k(r10, r9, r15, r4)
            goto L_0x0a3c
        L_0x077d:
            int[] r10 = r13.f47148c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C16819ka.m40704f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C16795jd.m40568f(r10, r9, r15, r4)
            goto L_0x0a3c
        L_0x078e:
            int[] r10 = r13.f47148c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C16819ka.m40704f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C16795jd.m40574h(r10, r9, r15, r4)
            goto L_0x0a3c
        L_0x079f:
            int[] r10 = r13.f47148c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C16819ka.m40704f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C16795jd.m40562d(r10, r9, r15, r4)
            goto L_0x0a3c
        L_0x07b0:
            int[] r10 = r13.f47148c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C16819ka.m40704f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C16795jd.m40558c(r10, r9, r15, r4)
            goto L_0x0a3c
        L_0x07c1:
            int[] r10 = r13.f47148c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C16819ka.m40704f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C16795jd.m40554b(r10, r9, r15, r4)
            goto L_0x0a3c
        L_0x07d2:
            int[] r10 = r13.f47148c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C16819ka.m40704f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C16795jd.m40543a(r10, r9, r15, r4)
            goto L_0x0a3c
        L_0x07e3:
            int[] r10 = r13.f47148c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C16819ka.m40704f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C16795jd.m40565e(r10, r9, r15, r5)
            goto L_0x0a3c
        L_0x07f4:
            int[] r10 = r13.f47148c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C16819ka.m40704f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C16795jd.m40580j(r10, r9, r15, r5)
            goto L_0x0a3c
        L_0x0805:
            int[] r10 = r13.f47148c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C16819ka.m40704f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C16795jd.m40571g(r10, r9, r15, r5)
            goto L_0x0a3c
        L_0x0816:
            int[] r10 = r13.f47148c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C16819ka.m40704f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C16795jd.m40582l(r10, r9, r15, r5)
            goto L_0x0a3c
        L_0x0827:
            int[] r10 = r13.f47148c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C16819ka.m40704f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C16795jd.m40583m(r10, r9, r15, r5)
            goto L_0x0a3c
        L_0x0838:
            int[] r10 = r13.f47148c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C16819ka.m40704f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C16795jd.m40577i(r10, r9, r15, r5)
            goto L_0x0a3c
        L_0x0849:
            int[] r10 = r13.f47148c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C16819ka.m40704f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C16795jd.m40552b(r10, r9, r15)
            goto L_0x0a3c
        L_0x085a:
            int[] r10 = r13.f47148c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C16819ka.m40704f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.jb r11 = r13.m40416a(r1)
            com.google.android.gms.internal.measurement.C16795jd.m40542a(r10, r9, r15, r11)
            goto L_0x0a3c
        L_0x086f:
            int[] r10 = r13.f47148c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C16819ka.m40704f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C16795jd.m40541a(r10, r9, r15)
            goto L_0x0a3c
        L_0x0880:
            int[] r10 = r13.f47148c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C16819ka.m40704f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C16795jd.m40584n(r10, r9, r15, r5)
            goto L_0x0a3c
        L_0x0891:
            int[] r10 = r13.f47148c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C16819ka.m40704f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C16795jd.m40581k(r10, r9, r15, r5)
            goto L_0x0a3c
        L_0x08a2:
            int[] r10 = r13.f47148c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C16819ka.m40704f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C16795jd.m40568f(r10, r9, r15, r5)
            goto L_0x0a3c
        L_0x08b3:
            int[] r10 = r13.f47148c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C16819ka.m40704f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C16795jd.m40574h(r10, r9, r15, r5)
            goto L_0x0a3c
        L_0x08c4:
            int[] r10 = r13.f47148c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C16819ka.m40704f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C16795jd.m40562d(r10, r9, r15, r5)
            goto L_0x0a3c
        L_0x08d5:
            int[] r10 = r13.f47148c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C16819ka.m40704f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C16795jd.m40558c(r10, r9, r15, r5)
            goto L_0x0a3c
        L_0x08e6:
            int[] r10 = r13.f47148c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C16819ka.m40704f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C16795jd.m40554b(r10, r9, r15, r5)
            goto L_0x0a3c
        L_0x08f7:
            int[] r10 = r13.f47148c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C16819ka.m40704f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C16795jd.m40543a(r10, r9, r15, r5)
            goto L_0x0a3c
        L_0x0908:
            boolean r11 = r13.m40426a((T) r14, r1)
            if (r11 == 0) goto L_0x0a3c
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C16819ka.m40704f(r14, r11)
            com.google.android.gms.internal.measurement.jb r11 = r13.m40416a(r1)
            r15.mo32162b(r10, r9, r11)
            goto L_0x0a3c
        L_0x091d:
            boolean r11 = r13.m40426a((T) r14, r1)
            if (r11 == 0) goto L_0x0a3c
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = com.google.android.gms.internal.measurement.C16819ka.m40689b(r14, r11)
            r15.mo32173e(r10, r11)
            goto L_0x0a3c
        L_0x092e:
            boolean r11 = r13.m40426a((T) r14, r1)
            if (r11 == 0) goto L_0x0a3c
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.measurement.C16819ka.m40674a(r14, r11)
            r15.mo32175f(r10, r9)
            goto L_0x0a3c
        L_0x093f:
            boolean r11 = r13.m40426a((T) r14, r1)
            if (r11 == 0) goto L_0x0a3c
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = com.google.android.gms.internal.measurement.C16819ka.m40689b(r14, r11)
            r15.mo32161b(r10, r11)
            goto L_0x0a3c
        L_0x0950:
            boolean r11 = r13.m40426a((T) r14, r1)
            if (r11 == 0) goto L_0x0a3c
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.measurement.C16819ka.m40674a(r14, r11)
            r15.mo32148a(r10, r9)
            goto L_0x0a3c
        L_0x0961:
            boolean r11 = r13.m40426a((T) r14, r1)
            if (r11 == 0) goto L_0x0a3c
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.measurement.C16819ka.m40674a(r14, r11)
            r15.mo32160b(r10, r9)
            goto L_0x0a3c
        L_0x0972:
            boolean r11 = r13.m40426a((T) r14, r1)
            if (r11 == 0) goto L_0x0a3c
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.measurement.C16819ka.m40674a(r14, r11)
            r15.mo32172e(r10, r9)
            goto L_0x0a3c
        L_0x0983:
            boolean r11 = r13.m40426a((T) r14, r1)
            if (r11 == 0) goto L_0x0a3c
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C16819ka.m40704f(r14, r11)
            com.google.android.gms.internal.measurement.fs r9 = (com.google.android.gms.internal.measurement.C16691fs) r9
            r15.mo32150a(r10, r9)
            goto L_0x0a3c
        L_0x0996:
            boolean r11 = r13.m40426a((T) r14, r1)
            if (r11 == 0) goto L_0x0a3c
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C16819ka.m40704f(r14, r11)
            com.google.android.gms.internal.measurement.jb r11 = r13.m40416a(r1)
            r15.mo32153a(r10, r9, r11)
            goto L_0x0a3c
        L_0x09ab:
            boolean r11 = r13.m40426a((T) r14, r1)
            if (r11 == 0) goto L_0x0a3c
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C16819ka.m40704f(r14, r11)
            m40421a(r10, r9, r15)
            goto L_0x0a3c
        L_0x09bc:
            boolean r11 = r13.m40426a((T) r14, r1)
            if (r11 == 0) goto L_0x0a3c
            r9 = r9 & r6
            long r11 = (long) r9
            boolean r9 = com.google.android.gms.internal.measurement.C16819ka.m40697c(r14, r11)
            r15.mo32158a(r10, r9)
            goto L_0x0a3c
        L_0x09cd:
            boolean r11 = r13.m40426a((T) r14, r1)
            if (r11 == 0) goto L_0x0a3c
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.measurement.C16819ka.m40674a(r14, r11)
            r15.mo32169d(r10, r9)
            goto L_0x0a3c
        L_0x09dd:
            boolean r11 = r13.m40426a((T) r14, r1)
            if (r11 == 0) goto L_0x0a3c
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = com.google.android.gms.internal.measurement.C16819ka.m40689b(r14, r11)
            r15.mo32170d(r10, r11)
            goto L_0x0a3c
        L_0x09ed:
            boolean r11 = r13.m40426a((T) r14, r1)
            if (r11 == 0) goto L_0x0a3c
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.measurement.C16819ka.m40674a(r14, r11)
            r15.mo32166c(r10, r9)
            goto L_0x0a3c
        L_0x09fd:
            boolean r11 = r13.m40426a((T) r14, r1)
            if (r11 == 0) goto L_0x0a3c
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = com.google.android.gms.internal.measurement.C16819ka.m40689b(r14, r11)
            r15.mo32167c(r10, r11)
            goto L_0x0a3c
        L_0x0a0d:
            boolean r11 = r13.m40426a((T) r14, r1)
            if (r11 == 0) goto L_0x0a3c
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = com.google.android.gms.internal.measurement.C16819ka.m40689b(r14, r11)
            r15.mo32149a(r10, r11)
            goto L_0x0a3c
        L_0x0a1d:
            boolean r11 = r13.m40426a((T) r14, r1)
            if (r11 == 0) goto L_0x0a3c
            r9 = r9 & r6
            long r11 = (long) r9
            float r9 = com.google.android.gms.internal.measurement.C16819ka.m40698d(r14, r11)
            r15.mo32147a(r10, r9)
            goto L_0x0a3c
        L_0x0a2d:
            boolean r11 = r13.m40426a((T) r14, r1)
            if (r11 == 0) goto L_0x0a3c
            r9 = r9 & r6
            long r11 = (long) r9
            double r11 = com.google.android.gms.internal.measurement.C16819ka.m40702e(r14, r11)
            r15.mo32146a(r10, r11)
        L_0x0a3c:
            int r1 = r1 + 3
            goto L_0x0568
        L_0x0a40:
            if (r8 == 0) goto L_0x0a57
            com.google.android.gms.internal.measurement.gr<?> r1 = r13.f47163r
            r1.mo32198a(r15, r8)
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
            com.google.android.gms.internal.measurement.ju<?, ?> r0 = r13.f47162q
            m40422a(r0, (T) r14, r15)
            return
        L_0x0a5d:
            r13.m40434b((T) r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C16779io.mo32300a(java.lang.Object, com.google.android.gms.internal.measurement.kp):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:172:0x0527  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002e  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m40434b(T r20, com.google.android.gms.internal.measurement.C16838kp r21) throws java.io.IOException {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            boolean r3 = r0.f47153h
            if (r3 == 0) goto L_0x0021
            com.google.android.gms.internal.measurement.gr<?> r3 = r0.f47163r
            com.google.android.gms.internal.measurement.gu r3 = r3.mo32193a(r1)
            boolean r5 = r3.mo32203a()
            if (r5 != 0) goto L_0x0021
            java.util.Iterator r3 = r3.mo32205c()
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x0023
        L_0x0021:
            r3 = 0
            r5 = 0
        L_0x0023:
            r6 = -1
            int[] r7 = r0.f47148c
            int r7 = r7.length
            sun.misc.Unsafe r8 = f47147b
            r10 = r5
            r5 = 0
            r11 = 0
        L_0x002c:
            if (r5 >= r7) goto L_0x0525
            int r12 = r0.m40439d(r5)
            int[] r13 = r0.f47148c
            r13 = r13[r5]
            r14 = 267386880(0xff00000, float:2.3665827E-29)
            r14 = r14 & r12
            int r14 = r14 >>> 20
            boolean r15 = r0.f47155j
            r16 = 1048575(0xfffff, float:1.469367E-39)
            if (r15 != 0) goto L_0x0061
            r15 = 17
            if (r14 > r15) goto L_0x0061
            int[] r15 = r0.f47148c
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
            com.google.android.gms.internal.measurement.gr<?> r4 = r0.f47163r
            int r4 = r4.mo32192a(r10)
            if (r4 > r13) goto L_0x0083
            com.google.android.gms.internal.measurement.gr<?> r4 = r0.f47163r
            r4.mo32198a(r2, r10)
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
            boolean r9 = r0.m40427a((T) r1, r13, r12)
            if (r9 == 0) goto L_0x008b
            java.lang.Object r4 = r8.getObject(r1, r4)
            com.google.android.gms.internal.measurement.jb r5 = r0.m40416a(r12)
            r2.mo32162b(r13, r4, r5)
            goto L_0x008b
        L_0x00a2:
            r12 = r18
            boolean r9 = r0.m40427a((T) r1, r13, r12)
            if (r9 == 0) goto L_0x008b
            long r4 = m40442e(r1, r4)
            r2.mo32173e(r13, r4)
            goto L_0x008b
        L_0x00b2:
            r12 = r18
            boolean r9 = r0.m40427a((T) r1, r13, r12)
            if (r9 == 0) goto L_0x008b
            int r4 = m40440d(r1, r4)
            r2.mo32175f(r13, r4)
            goto L_0x008b
        L_0x00c2:
            r12 = r18
            boolean r9 = r0.m40427a((T) r1, r13, r12)
            if (r9 == 0) goto L_0x008b
            long r4 = m40442e(r1, r4)
            r2.mo32161b(r13, r4)
            goto L_0x008b
        L_0x00d2:
            r12 = r18
            boolean r9 = r0.m40427a((T) r1, r13, r12)
            if (r9 == 0) goto L_0x008b
            int r4 = m40440d(r1, r4)
            r2.mo32148a(r13, r4)
            goto L_0x008b
        L_0x00e2:
            r12 = r18
            boolean r9 = r0.m40427a((T) r1, r13, r12)
            if (r9 == 0) goto L_0x008b
            int r4 = m40440d(r1, r4)
            r2.mo32160b(r13, r4)
            goto L_0x008b
        L_0x00f2:
            r12 = r18
            boolean r9 = r0.m40427a((T) r1, r13, r12)
            if (r9 == 0) goto L_0x008b
            int r4 = m40440d(r1, r4)
            r2.mo32172e(r13, r4)
            goto L_0x008b
        L_0x0102:
            r12 = r18
            boolean r9 = r0.m40427a((T) r1, r13, r12)
            if (r9 == 0) goto L_0x008b
            java.lang.Object r4 = r8.getObject(r1, r4)
            com.google.android.gms.internal.measurement.fs r4 = (com.google.android.gms.internal.measurement.C16691fs) r4
            r2.mo32150a(r13, r4)
            goto L_0x008b
        L_0x0115:
            r12 = r18
            boolean r9 = r0.m40427a((T) r1, r13, r12)
            if (r9 == 0) goto L_0x008b
            java.lang.Object r4 = r8.getObject(r1, r4)
            com.google.android.gms.internal.measurement.jb r5 = r0.m40416a(r12)
            r2.mo32153a(r13, r4, r5)
            goto L_0x008b
        L_0x012a:
            r12 = r18
            boolean r9 = r0.m40427a((T) r1, r13, r12)
            if (r9 == 0) goto L_0x008b
            java.lang.Object r4 = r8.getObject(r1, r4)
            m40421a(r13, r4, r2)
            goto L_0x008b
        L_0x013b:
            r12 = r18
            boolean r9 = r0.m40427a((T) r1, r13, r12)
            if (r9 == 0) goto L_0x008b
            boolean r4 = m40444f(r1, r4)
            r2.mo32158a(r13, r4)
            goto L_0x008b
        L_0x014c:
            r12 = r18
            boolean r9 = r0.m40427a((T) r1, r13, r12)
            if (r9 == 0) goto L_0x008b
            int r4 = m40440d(r1, r4)
            r2.mo32169d(r13, r4)
            goto L_0x008b
        L_0x015d:
            r12 = r18
            boolean r9 = r0.m40427a((T) r1, r13, r12)
            if (r9 == 0) goto L_0x008b
            long r4 = m40442e(r1, r4)
            r2.mo32170d(r13, r4)
            goto L_0x008b
        L_0x016e:
            r12 = r18
            boolean r9 = r0.m40427a((T) r1, r13, r12)
            if (r9 == 0) goto L_0x008b
            int r4 = m40440d(r1, r4)
            r2.mo32166c(r13, r4)
            goto L_0x008b
        L_0x017f:
            r12 = r18
            boolean r9 = r0.m40427a((T) r1, r13, r12)
            if (r9 == 0) goto L_0x008b
            long r4 = m40442e(r1, r4)
            r2.mo32167c(r13, r4)
            goto L_0x008b
        L_0x0190:
            r12 = r18
            boolean r9 = r0.m40427a((T) r1, r13, r12)
            if (r9 == 0) goto L_0x008b
            long r4 = m40442e(r1, r4)
            r2.mo32149a(r13, r4)
            goto L_0x008b
        L_0x01a1:
            r12 = r18
            boolean r9 = r0.m40427a((T) r1, r13, r12)
            if (r9 == 0) goto L_0x008b
            float r4 = m40436c(r1, r4)
            r2.mo32147a(r13, r4)
            goto L_0x008b
        L_0x01b2:
            r12 = r18
            boolean r9 = r0.m40427a((T) r1, r13, r12)
            if (r9 == 0) goto L_0x008b
            double r4 = m40430b((T) r1, r4)
            r2.mo32146a(r13, r4)
            goto L_0x008b
        L_0x01c3:
            r12 = r18
            java.lang.Object r4 = r8.getObject(r1, r4)
            r0.m40423a(r2, r13, r4, r12)
            goto L_0x008b
        L_0x01ce:
            r12 = r18
            int[] r9 = r0.f47148c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.jb r5 = r0.m40416a(r12)
            com.google.android.gms.internal.measurement.C16795jd.m40553b(r9, r4, r2, r5)
            goto L_0x008b
        L_0x01e3:
            r12 = r18
            int[] r9 = r0.f47148c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            r13 = 1
            com.google.android.gms.internal.measurement.C16795jd.m40565e(r9, r4, r2, r13)
            goto L_0x008b
        L_0x01f5:
            r12 = r18
            r13 = 1
            int[] r9 = r0.f47148c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.C16795jd.m40580j(r9, r4, r2, r13)
            goto L_0x008b
        L_0x0207:
            r12 = r18
            r13 = 1
            int[] r9 = r0.f47148c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.C16795jd.m40571g(r9, r4, r2, r13)
            goto L_0x008b
        L_0x0219:
            r12 = r18
            r13 = 1
            int[] r9 = r0.f47148c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.C16795jd.m40582l(r9, r4, r2, r13)
            goto L_0x008b
        L_0x022b:
            r12 = r18
            r13 = 1
            int[] r9 = r0.f47148c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.C16795jd.m40583m(r9, r4, r2, r13)
            goto L_0x008b
        L_0x023d:
            r12 = r18
            r13 = 1
            int[] r9 = r0.f47148c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.C16795jd.m40577i(r9, r4, r2, r13)
            goto L_0x008b
        L_0x024f:
            r12 = r18
            r13 = 1
            int[] r9 = r0.f47148c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.C16795jd.m40584n(r9, r4, r2, r13)
            goto L_0x008b
        L_0x0261:
            r12 = r18
            r13 = 1
            int[] r9 = r0.f47148c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.C16795jd.m40581k(r9, r4, r2, r13)
            goto L_0x008b
        L_0x0273:
            r12 = r18
            r13 = 1
            int[] r9 = r0.f47148c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.C16795jd.m40568f(r9, r4, r2, r13)
            goto L_0x008b
        L_0x0285:
            r12 = r18
            r13 = 1
            int[] r9 = r0.f47148c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.C16795jd.m40574h(r9, r4, r2, r13)
            goto L_0x008b
        L_0x0297:
            r12 = r18
            r13 = 1
            int[] r9 = r0.f47148c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.C16795jd.m40562d(r9, r4, r2, r13)
            goto L_0x008b
        L_0x02a9:
            r12 = r18
            r13 = 1
            int[] r9 = r0.f47148c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.C16795jd.m40558c(r9, r4, r2, r13)
            goto L_0x008b
        L_0x02bb:
            r12 = r18
            r13 = 1
            int[] r9 = r0.f47148c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.C16795jd.m40554b(r9, r4, r2, r13)
            goto L_0x008b
        L_0x02cd:
            r12 = r18
            r13 = 1
            int[] r9 = r0.f47148c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.C16795jd.m40543a(r9, r4, r2, r13)
            goto L_0x008b
        L_0x02df:
            r12 = r18
            int[] r9 = r0.f47148c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            r13 = 0
            com.google.android.gms.internal.measurement.C16795jd.m40565e(r9, r4, r2, r13)
            goto L_0x008b
        L_0x02f1:
            r12 = r18
            r13 = 0
            int[] r9 = r0.f47148c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.C16795jd.m40580j(r9, r4, r2, r13)
            goto L_0x008b
        L_0x0303:
            r12 = r18
            r13 = 0
            int[] r9 = r0.f47148c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.C16795jd.m40571g(r9, r4, r2, r13)
            goto L_0x008b
        L_0x0315:
            r12 = r18
            r13 = 0
            int[] r9 = r0.f47148c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.C16795jd.m40582l(r9, r4, r2, r13)
            goto L_0x008b
        L_0x0327:
            r12 = r18
            r13 = 0
            int[] r9 = r0.f47148c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.C16795jd.m40583m(r9, r4, r2, r13)
            goto L_0x008b
        L_0x0339:
            r12 = r18
            r13 = 0
            int[] r9 = r0.f47148c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.C16795jd.m40577i(r9, r4, r2, r13)
            goto L_0x008b
        L_0x034b:
            r12 = r18
            int[] r9 = r0.f47148c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.C16795jd.m40552b(r9, r4, r2)
            goto L_0x008b
        L_0x035c:
            r12 = r18
            int[] r9 = r0.f47148c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.jb r5 = r0.m40416a(r12)
            com.google.android.gms.internal.measurement.C16795jd.m40542a(r9, r4, r2, r5)
            goto L_0x008b
        L_0x0371:
            r12 = r18
            int[] r9 = r0.f47148c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.C16795jd.m40541a(r9, r4, r2)
            goto L_0x008b
        L_0x0382:
            r12 = r18
            int[] r9 = r0.f47148c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            r14 = 0
            com.google.android.gms.internal.measurement.C16795jd.m40584n(r9, r4, r2, r14)
            goto L_0x0521
        L_0x0394:
            r12 = r18
            r14 = 0
            int[] r9 = r0.f47148c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.C16795jd.m40581k(r9, r4, r2, r14)
            goto L_0x0521
        L_0x03a6:
            r12 = r18
            r14 = 0
            int[] r9 = r0.f47148c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.C16795jd.m40568f(r9, r4, r2, r14)
            goto L_0x0521
        L_0x03b8:
            r12 = r18
            r14 = 0
            int[] r9 = r0.f47148c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.C16795jd.m40574h(r9, r4, r2, r14)
            goto L_0x0521
        L_0x03ca:
            r12 = r18
            r14 = 0
            int[] r9 = r0.f47148c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.C16795jd.m40562d(r9, r4, r2, r14)
            goto L_0x0521
        L_0x03dc:
            r12 = r18
            r14 = 0
            int[] r9 = r0.f47148c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.C16795jd.m40558c(r9, r4, r2, r14)
            goto L_0x0521
        L_0x03ee:
            r12 = r18
            r14 = 0
            int[] r9 = r0.f47148c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.C16795jd.m40554b(r9, r4, r2, r14)
            goto L_0x0521
        L_0x0400:
            r12 = r18
            r14 = 0
            int[] r9 = r0.f47148c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.C16795jd.m40543a(r9, r4, r2, r14)
            goto L_0x0521
        L_0x0412:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x0521
            java.lang.Object r4 = r8.getObject(r1, r4)
            com.google.android.gms.internal.measurement.jb r5 = r0.m40416a(r12)
            r2.mo32162b(r13, r4, r5)
            goto L_0x0521
        L_0x0425:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x0521
            long r4 = r8.getLong(r1, r4)
            r2.mo32173e(r13, r4)
            goto L_0x0521
        L_0x0434:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x0521
            int r4 = r8.getInt(r1, r4)
            r2.mo32175f(r13, r4)
            goto L_0x0521
        L_0x0443:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x0521
            long r4 = r8.getLong(r1, r4)
            r2.mo32161b(r13, r4)
            goto L_0x0521
        L_0x0452:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x0521
            int r4 = r8.getInt(r1, r4)
            r2.mo32148a(r13, r4)
            goto L_0x0521
        L_0x0461:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x0521
            int r4 = r8.getInt(r1, r4)
            r2.mo32160b(r13, r4)
            goto L_0x0521
        L_0x0470:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x0521
            int r4 = r8.getInt(r1, r4)
            r2.mo32172e(r13, r4)
            goto L_0x0521
        L_0x047f:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x0521
            java.lang.Object r4 = r8.getObject(r1, r4)
            com.google.android.gms.internal.measurement.fs r4 = (com.google.android.gms.internal.measurement.C16691fs) r4
            r2.mo32150a(r13, r4)
            goto L_0x0521
        L_0x0490:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x0521
            java.lang.Object r4 = r8.getObject(r1, r4)
            com.google.android.gms.internal.measurement.jb r5 = r0.m40416a(r12)
            r2.mo32153a(r13, r4, r5)
            goto L_0x0521
        L_0x04a3:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x0521
            java.lang.Object r4 = r8.getObject(r1, r4)
            m40421a(r13, r4, r2)
            goto L_0x0521
        L_0x04b2:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x0521
            boolean r4 = com.google.android.gms.internal.measurement.C16819ka.m40697c(r1, r4)
            r2.mo32158a(r13, r4)
            goto L_0x0521
        L_0x04c0:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x0521
            int r4 = r8.getInt(r1, r4)
            r2.mo32169d(r13, r4)
            goto L_0x0521
        L_0x04ce:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x0521
            long r4 = r8.getLong(r1, r4)
            r2.mo32170d(r13, r4)
            goto L_0x0521
        L_0x04dc:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x0521
            int r4 = r8.getInt(r1, r4)
            r2.mo32166c(r13, r4)
            goto L_0x0521
        L_0x04ea:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x0521
            long r4 = r8.getLong(r1, r4)
            r2.mo32167c(r13, r4)
            goto L_0x0521
        L_0x04f8:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x0521
            long r4 = r8.getLong(r1, r4)
            r2.mo32149a(r13, r4)
            goto L_0x0521
        L_0x0506:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x0521
            float r4 = com.google.android.gms.internal.measurement.C16819ka.m40698d(r1, r4)
            r2.mo32147a(r13, r4)
            goto L_0x0521
        L_0x0514:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x0521
            double r4 = com.google.android.gms.internal.measurement.C16819ka.m40702e(r1, r4)
            r2.mo32146a(r13, r4)
        L_0x0521:
            int r5 = r12 + 3
            goto L_0x002c
        L_0x0525:
            if (r10 == 0) goto L_0x053c
            com.google.android.gms.internal.measurement.gr<?> r4 = r0.f47163r
            r4.mo32198a(r2, r10)
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
            com.google.android.gms.internal.measurement.ju<?, ?> r3 = r0.f47162q
            m40422a(r3, (T) r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C16779io.m40434b(java.lang.Object, com.google.android.gms.internal.measurement.kp):void");
    }

    /* renamed from: a */
    private final <K, V> void m40423a(C16838kp kpVar, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            kpVar.mo32151a(i, this.f47164s.mo32293f(m40431b(i2)), this.f47164s.mo32289b(obj));
        }
    }

    /* renamed from: a */
    private static <UT, UB> void m40422a(C16812ju<UT, UB> juVar, T t, C16838kp kpVar) throws IOException {
        juVar.mo32362a(juVar.mo32365b(t), kpVar);
    }

    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo32299a(T r18, com.google.android.gms.internal.measurement.C16792ja r19, com.google.android.gms.internal.measurement.C16721gq r20) throws java.io.IOException {
        /*
            r17 = this;
            r1 = r17
            r2 = r18
            r0 = r19
            r10 = r20
            if (r10 == 0) goto L_0x05eb
            com.google.android.gms.internal.measurement.ju<?, ?> r11 = r1.f47162q
            com.google.android.gms.internal.measurement.gr<?> r12 = r1.f47163r
            r13 = 0
            r3 = r13
            r14 = r3
        L_0x0011:
            int r4 = r19.mo32065a()     // Catch:{ all -> 0x05d3 }
            int r5 = r1.f47150e     // Catch:{ all -> 0x05d3 }
            r6 = -1
            if (r4 < r5) goto L_0x003e
            int r5 = r1.f47151f     // Catch:{ all -> 0x05d3 }
            if (r4 > r5) goto L_0x003e
            r5 = 0
            int[] r7 = r1.f47148c     // Catch:{ all -> 0x05d3 }
            int r7 = r7.length     // Catch:{ all -> 0x05d3 }
            int r7 = r7 / 3
            int r7 = r7 + -1
        L_0x0026:
            if (r5 > r7) goto L_0x003e
            int r8 = r7 + r5
            int r8 = r8 >>> 1
            int r9 = r8 * 3
            int[] r15 = r1.f47148c     // Catch:{ all -> 0x05d3 }
            r15 = r15[r9]     // Catch:{ all -> 0x05d3 }
            if (r4 != r15) goto L_0x0036
            r6 = r9
            goto L_0x003e
        L_0x0036:
            if (r4 >= r15) goto L_0x003b
            int r7 = r8 + -1
            goto L_0x0026
        L_0x003b:
            int r5 = r8 + 1
            goto L_0x0026
        L_0x003e:
            if (r6 >= 0) goto L_0x00a5
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 != r5) goto L_0x005c
            int r0 = r1.f47158m
        L_0x0047:
            int r3 = r1.f47159n
            if (r0 >= r3) goto L_0x0056
            int[] r3 = r1.f47157l
            r3 = r3[r0]
            java.lang.Object r14 = r1.m40418a(r2, r3, (UB) r14, r11)
            int r0 = r0 + 1
            goto L_0x0047
        L_0x0056:
            if (r14 == 0) goto L_0x005b
            r11.mo32368b(r2, r14)
        L_0x005b:
            return
        L_0x005c:
            boolean r5 = r1.f47153h     // Catch:{ all -> 0x05d3 }
            if (r5 != 0) goto L_0x0062
            r5 = r13
            goto L_0x0069
        L_0x0062:
            com.google.android.gms.internal.measurement.ik r5 = r1.f47152g     // Catch:{ all -> 0x05d3 }
            java.lang.Object r4 = r12.mo32194a(r10, r5, r4)     // Catch:{ all -> 0x05d3 }
            r5 = r4
        L_0x0069:
            if (r5 == 0) goto L_0x0081
            if (r3 != 0) goto L_0x0071
            com.google.android.gms.internal.measurement.gu r3 = r12.mo32200b(r2)     // Catch:{ all -> 0x05d3 }
        L_0x0071:
            r15 = r3
            r3 = r12
            r4 = r19
            r6 = r20
            r7 = r15
            r8 = r14
            r9 = r11
            java.lang.Object r3 = r3.mo32195a(r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x05d3 }
            r14 = r3
            r3 = r15
            goto L_0x0011
        L_0x0081:
            if (r14 != 0) goto L_0x0088
            java.lang.Object r4 = r11.mo32369c(r2)     // Catch:{ all -> 0x05d3 }
            r14 = r4
        L_0x0088:
            boolean r4 = r11.mo32364a(r14, r0)     // Catch:{ all -> 0x05d3 }
            if (r4 != 0) goto L_0x0011
            int r0 = r1.f47158m
        L_0x0090:
            int r3 = r1.f47159n
            if (r0 >= r3) goto L_0x009f
            int[] r3 = r1.f47157l
            r3 = r3[r0]
            java.lang.Object r14 = r1.m40418a(r2, r3, (UB) r14, r11)
            int r0 = r0 + 1
            goto L_0x0090
        L_0x009f:
            if (r14 == 0) goto L_0x00a4
            r11.mo32368b(r2, r14)
        L_0x00a4:
            return
        L_0x00a5:
            int r5 = r1.m40439d(r6)     // Catch:{ all -> 0x05d3 }
            r7 = 267386880(0xff00000, float:2.3665827E-29)
            r7 = r7 & r5
            int r7 = r7 >>> 20
            r8 = 1048575(0xfffff, float:1.469367E-39)
            switch(r7) {
                case 0: goto L_0x0582;
                case 1: goto L_0x0573;
                case 2: goto L_0x0564;
                case 3: goto L_0x0555;
                case 4: goto L_0x0546;
                case 5: goto L_0x0537;
                case 6: goto L_0x0528;
                case 7: goto L_0x0519;
                case 8: goto L_0x0511;
                case 9: goto L_0x04e0;
                case 10: goto L_0x04d1;
                case 11: goto L_0x04c2;
                case 12: goto L_0x04a0;
                case 13: goto L_0x0491;
                case 14: goto L_0x0482;
                case 15: goto L_0x0473;
                case 16: goto L_0x0464;
                case 17: goto L_0x0433;
                case 18: goto L_0x0426;
                case 19: goto L_0x0419;
                case 20: goto L_0x040c;
                case 21: goto L_0x03ff;
                case 22: goto L_0x03f2;
                case 23: goto L_0x03e5;
                case 24: goto L_0x03d8;
                case 25: goto L_0x03cb;
                case 26: goto L_0x03ab;
                case 27: goto L_0x039a;
                case 28: goto L_0x038d;
                case 29: goto L_0x0380;
                case 30: goto L_0x036a;
                case 31: goto L_0x035d;
                case 32: goto L_0x0350;
                case 33: goto L_0x0343;
                case 34: goto L_0x0336;
                case 35: goto L_0x0329;
                case 36: goto L_0x031c;
                case 37: goto L_0x030f;
                case 38: goto L_0x0302;
                case 39: goto L_0x02f5;
                case 40: goto L_0x02e8;
                case 41: goto L_0x02db;
                case 42: goto L_0x02ce;
                case 43: goto L_0x02c1;
                case 44: goto L_0x02ac;
                case 45: goto L_0x029f;
                case 46: goto L_0x0292;
                case 47: goto L_0x0285;
                case 48: goto L_0x0278;
                case 49: goto L_0x0266;
                case 50: goto L_0x0224;
                case 51: goto L_0x0212;
                case 52: goto L_0x0200;
                case 53: goto L_0x01ee;
                case 54: goto L_0x01dc;
                case 55: goto L_0x01ca;
                case 56: goto L_0x01b8;
                case 57: goto L_0x01a6;
                case 58: goto L_0x0194;
                case 59: goto L_0x018c;
                case 60: goto L_0x015b;
                case 61: goto L_0x014d;
                case 62: goto L_0x013b;
                case 63: goto L_0x0116;
                case 64: goto L_0x0104;
                case 65: goto L_0x00f2;
                case 66: goto L_0x00e0;
                case 67: goto L_0x00ce;
                case 68: goto L_0x00bc;
                default: goto L_0x00b4;
            }
        L_0x00b4:
            if (r14 != 0) goto L_0x0592
            java.lang.Object r4 = r11.mo32356a()     // Catch:{ hl -> 0x05af }
            goto L_0x0591
        L_0x00bc:
            r5 = r5 & r8
            long r7 = (long) r5     // Catch:{ hl -> 0x05af }
            com.google.android.gms.internal.measurement.jb r5 = r1.m40416a(r6)     // Catch:{ hl -> 0x05af }
            java.lang.Object r5 = r0.mo32071b(r5, r10)     // Catch:{ hl -> 0x05af }
            com.google.android.gms.internal.measurement.C16819ka.m40684a(r2, r7, r5)     // Catch:{ hl -> 0x05af }
            r1.m40433b((T) r2, r4, r6)     // Catch:{ hl -> 0x05af }
            goto L_0x0011
        L_0x00ce:
            r5 = r5 & r8
            long r7 = (long) r5     // Catch:{ hl -> 0x05af }
            long r15 = r19.mo32106t()     // Catch:{ hl -> 0x05af }
            java.lang.Long r5 = java.lang.Long.valueOf(r15)     // Catch:{ hl -> 0x05af }
            com.google.android.gms.internal.measurement.C16819ka.m40684a(r2, r7, r5)     // Catch:{ hl -> 0x05af }
            r1.m40433b((T) r2, r4, r6)     // Catch:{ hl -> 0x05af }
            goto L_0x0011
        L_0x00e0:
            r5 = r5 & r8
            long r7 = (long) r5     // Catch:{ hl -> 0x05af }
            int r5 = r19.mo32105s()     // Catch:{ hl -> 0x05af }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ hl -> 0x05af }
            com.google.android.gms.internal.measurement.C16819ka.m40684a(r2, r7, r5)     // Catch:{ hl -> 0x05af }
            r1.m40433b((T) r2, r4, r6)     // Catch:{ hl -> 0x05af }
            goto L_0x0011
        L_0x00f2:
            r5 = r5 & r8
            long r7 = (long) r5     // Catch:{ hl -> 0x05af }
            long r15 = r19.mo32104r()     // Catch:{ hl -> 0x05af }
            java.lang.Long r5 = java.lang.Long.valueOf(r15)     // Catch:{ hl -> 0x05af }
            com.google.android.gms.internal.measurement.C16819ka.m40684a(r2, r7, r5)     // Catch:{ hl -> 0x05af }
            r1.m40433b((T) r2, r4, r6)     // Catch:{ hl -> 0x05af }
            goto L_0x0011
        L_0x0104:
            r5 = r5 & r8
            long r7 = (long) r5     // Catch:{ hl -> 0x05af }
            int r5 = r19.mo32102q()     // Catch:{ hl -> 0x05af }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ hl -> 0x05af }
            com.google.android.gms.internal.measurement.C16819ka.m40684a(r2, r7, r5)     // Catch:{ hl -> 0x05af }
            r1.m40433b((T) r2, r4, r6)     // Catch:{ hl -> 0x05af }
            goto L_0x0011
        L_0x0116:
            int r7 = r19.mo32100p()     // Catch:{ hl -> 0x05af }
            com.google.android.gms.internal.measurement.hi r9 = r1.m40437c(r6)     // Catch:{ hl -> 0x05af }
            if (r9 == 0) goto L_0x012d
            boolean r9 = r9.mo31922a(r7)     // Catch:{ hl -> 0x05af }
            if (r9 == 0) goto L_0x0127
            goto L_0x012d
        L_0x0127:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C16795jd.m40539a(r4, r7, r14, r11)     // Catch:{ hl -> 0x05af }
            goto L_0x037d
        L_0x012d:
            r5 = r5 & r8
            long r8 = (long) r5     // Catch:{ hl -> 0x05af }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r7)     // Catch:{ hl -> 0x05af }
            com.google.android.gms.internal.measurement.C16819ka.m40684a(r2, r8, r5)     // Catch:{ hl -> 0x05af }
            r1.m40433b((T) r2, r4, r6)     // Catch:{ hl -> 0x05af }
            goto L_0x0011
        L_0x013b:
            r5 = r5 & r8
            long r7 = (long) r5     // Catch:{ hl -> 0x05af }
            int r5 = r19.mo32098o()     // Catch:{ hl -> 0x05af }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ hl -> 0x05af }
            com.google.android.gms.internal.measurement.C16819ka.m40684a(r2, r7, r5)     // Catch:{ hl -> 0x05af }
            r1.m40433b((T) r2, r4, r6)     // Catch:{ hl -> 0x05af }
            goto L_0x0011
        L_0x014d:
            r5 = r5 & r8
            long r7 = (long) r5     // Catch:{ hl -> 0x05af }
            com.google.android.gms.internal.measurement.fs r5 = r19.mo32096n()     // Catch:{ hl -> 0x05af }
            com.google.android.gms.internal.measurement.C16819ka.m40684a(r2, r7, r5)     // Catch:{ hl -> 0x05af }
            r1.m40433b((T) r2, r4, r6)     // Catch:{ hl -> 0x05af }
            goto L_0x0011
        L_0x015b:
            boolean r7 = r1.m40427a((T) r2, r4, r6)     // Catch:{ hl -> 0x05af }
            if (r7 == 0) goto L_0x0177
            r5 = r5 & r8
            long r7 = (long) r5     // Catch:{ hl -> 0x05af }
            java.lang.Object r5 = com.google.android.gms.internal.measurement.C16819ka.m40704f(r2, r7)     // Catch:{ hl -> 0x05af }
            com.google.android.gms.internal.measurement.jb r9 = r1.m40416a(r6)     // Catch:{ hl -> 0x05af }
            java.lang.Object r9 = r0.mo32066a(r9, r10)     // Catch:{ hl -> 0x05af }
            java.lang.Object r5 = com.google.android.gms.internal.measurement.C16743hf.m40315a(r5, r9)     // Catch:{ hl -> 0x05af }
            com.google.android.gms.internal.measurement.C16819ka.m40684a(r2, r7, r5)     // Catch:{ hl -> 0x05af }
            goto L_0x0187
        L_0x0177:
            r5 = r5 & r8
            long r7 = (long) r5     // Catch:{ hl -> 0x05af }
            com.google.android.gms.internal.measurement.jb r5 = r1.m40416a(r6)     // Catch:{ hl -> 0x05af }
            java.lang.Object r5 = r0.mo32066a(r5, r10)     // Catch:{ hl -> 0x05af }
            com.google.android.gms.internal.measurement.C16819ka.m40684a(r2, r7, r5)     // Catch:{ hl -> 0x05af }
            r1.m40432b((T) r2, r6)     // Catch:{ hl -> 0x05af }
        L_0x0187:
            r1.m40433b((T) r2, r4, r6)     // Catch:{ hl -> 0x05af }
            goto L_0x0011
        L_0x018c:
            r1.m40424a(r2, r5, r0)     // Catch:{ hl -> 0x05af }
            r1.m40433b((T) r2, r4, r6)     // Catch:{ hl -> 0x05af }
            goto L_0x0011
        L_0x0194:
            r5 = r5 & r8
            long r7 = (long) r5     // Catch:{ hl -> 0x05af }
            boolean r5 = r19.mo32091k()     // Catch:{ hl -> 0x05af }
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch:{ hl -> 0x05af }
            com.google.android.gms.internal.measurement.C16819ka.m40684a(r2, r7, r5)     // Catch:{ hl -> 0x05af }
            r1.m40433b((T) r2, r4, r6)     // Catch:{ hl -> 0x05af }
            goto L_0x0011
        L_0x01a6:
            r5 = r5 & r8
            long r7 = (long) r5     // Catch:{ hl -> 0x05af }
            int r5 = r19.mo32088j()     // Catch:{ hl -> 0x05af }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ hl -> 0x05af }
            com.google.android.gms.internal.measurement.C16819ka.m40684a(r2, r7, r5)     // Catch:{ hl -> 0x05af }
            r1.m40433b((T) r2, r4, r6)     // Catch:{ hl -> 0x05af }
            goto L_0x0011
        L_0x01b8:
            r5 = r5 & r8
            long r7 = (long) r5     // Catch:{ hl -> 0x05af }
            long r15 = r19.mo32086i()     // Catch:{ hl -> 0x05af }
            java.lang.Long r5 = java.lang.Long.valueOf(r15)     // Catch:{ hl -> 0x05af }
            com.google.android.gms.internal.measurement.C16819ka.m40684a(r2, r7, r5)     // Catch:{ hl -> 0x05af }
            r1.m40433b((T) r2, r4, r6)     // Catch:{ hl -> 0x05af }
            goto L_0x0011
        L_0x01ca:
            r5 = r5 & r8
            long r7 = (long) r5     // Catch:{ hl -> 0x05af }
            int r5 = r19.mo32084h()     // Catch:{ hl -> 0x05af }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ hl -> 0x05af }
            com.google.android.gms.internal.measurement.C16819ka.m40684a(r2, r7, r5)     // Catch:{ hl -> 0x05af }
            r1.m40433b((T) r2, r4, r6)     // Catch:{ hl -> 0x05af }
            goto L_0x0011
        L_0x01dc:
            r5 = r5 & r8
            long r7 = (long) r5     // Catch:{ hl -> 0x05af }
            long r15 = r19.mo32080f()     // Catch:{ hl -> 0x05af }
            java.lang.Long r5 = java.lang.Long.valueOf(r15)     // Catch:{ hl -> 0x05af }
            com.google.android.gms.internal.measurement.C16819ka.m40684a(r2, r7, r5)     // Catch:{ hl -> 0x05af }
            r1.m40433b((T) r2, r4, r6)     // Catch:{ hl -> 0x05af }
            goto L_0x0011
        L_0x01ee:
            r5 = r5 & r8
            long r7 = (long) r5     // Catch:{ hl -> 0x05af }
            long r15 = r19.mo32082g()     // Catch:{ hl -> 0x05af }
            java.lang.Long r5 = java.lang.Long.valueOf(r15)     // Catch:{ hl -> 0x05af }
            com.google.android.gms.internal.measurement.C16819ka.m40684a(r2, r7, r5)     // Catch:{ hl -> 0x05af }
            r1.m40433b((T) r2, r4, r6)     // Catch:{ hl -> 0x05af }
            goto L_0x0011
        L_0x0200:
            r5 = r5 & r8
            long r7 = (long) r5     // Catch:{ hl -> 0x05af }
            float r5 = r19.mo32078e()     // Catch:{ hl -> 0x05af }
            java.lang.Float r5 = java.lang.Float.valueOf(r5)     // Catch:{ hl -> 0x05af }
            com.google.android.gms.internal.measurement.C16819ka.m40684a(r2, r7, r5)     // Catch:{ hl -> 0x05af }
            r1.m40433b((T) r2, r4, r6)     // Catch:{ hl -> 0x05af }
            goto L_0x0011
        L_0x0212:
            r5 = r5 & r8
            long r7 = (long) r5     // Catch:{ hl -> 0x05af }
            double r15 = r19.mo32076d()     // Catch:{ hl -> 0x05af }
            java.lang.Double r5 = java.lang.Double.valueOf(r15)     // Catch:{ hl -> 0x05af }
            com.google.android.gms.internal.measurement.C16819ka.m40684a(r2, r7, r5)     // Catch:{ hl -> 0x05af }
            r1.m40433b((T) r2, r4, r6)     // Catch:{ hl -> 0x05af }
            goto L_0x0011
        L_0x0224:
            java.lang.Object r4 = r1.m40431b(r6)     // Catch:{ hl -> 0x05af }
            int r5 = r1.m40439d(r6)     // Catch:{ hl -> 0x05af }
            r5 = r5 & r8
            long r5 = (long) r5     // Catch:{ hl -> 0x05af }
            java.lang.Object r7 = com.google.android.gms.internal.measurement.C16819ka.m40704f(r2, r5)     // Catch:{ hl -> 0x05af }
            if (r7 != 0) goto L_0x023e
            com.google.android.gms.internal.measurement.if r7 = r1.f47164s     // Catch:{ hl -> 0x05af }
            java.lang.Object r7 = r7.mo32292e(r4)     // Catch:{ hl -> 0x05af }
            com.google.android.gms.internal.measurement.C16819ka.m40684a(r2, r5, r7)     // Catch:{ hl -> 0x05af }
            goto L_0x0255
        L_0x023e:
            com.google.android.gms.internal.measurement.if r8 = r1.f47164s     // Catch:{ hl -> 0x05af }
            boolean r8 = r8.mo32290c(r7)     // Catch:{ hl -> 0x05af }
            if (r8 == 0) goto L_0x0255
            com.google.android.gms.internal.measurement.if r8 = r1.f47164s     // Catch:{ hl -> 0x05af }
            java.lang.Object r8 = r8.mo32292e(r4)     // Catch:{ hl -> 0x05af }
            com.google.android.gms.internal.measurement.if r9 = r1.f47164s     // Catch:{ hl -> 0x05af }
            r9.mo32287a(r8, r7)     // Catch:{ hl -> 0x05af }
            com.google.android.gms.internal.measurement.C16819ka.m40684a(r2, r5, r8)     // Catch:{ hl -> 0x05af }
            r7 = r8
        L_0x0255:
            com.google.android.gms.internal.measurement.if r5 = r1.f47164s     // Catch:{ hl -> 0x05af }
            java.util.Map r5 = r5.mo32288a(r7)     // Catch:{ hl -> 0x05af }
            com.google.android.gms.internal.measurement.if r6 = r1.f47164s     // Catch:{ hl -> 0x05af }
            com.google.android.gms.internal.measurement.id r4 = r6.mo32293f(r4)     // Catch:{ hl -> 0x05af }
            r0.mo32069a(r5, r4, r10)     // Catch:{ hl -> 0x05af }
            goto L_0x0011
        L_0x0266:
            r4 = r5 & r8
            long r4 = (long) r4     // Catch:{ hl -> 0x05af }
            com.google.android.gms.internal.measurement.jb r6 = r1.m40416a(r6)     // Catch:{ hl -> 0x05af }
            com.google.android.gms.internal.measurement.hu r7 = r1.f47161p     // Catch:{ hl -> 0x05af }
            java.util.List r4 = r7.mo32265a(r2, r4)     // Catch:{ hl -> 0x05af }
            r0.mo32073b(r4, r6, r10)     // Catch:{ hl -> 0x05af }
            goto L_0x0011
        L_0x0278:
            com.google.android.gms.internal.measurement.hu r4 = r1.f47161p     // Catch:{ hl -> 0x05af }
            r5 = r5 & r8
            long r5 = (long) r5     // Catch:{ hl -> 0x05af }
            java.util.List r4 = r4.mo32265a(r2, r5)     // Catch:{ hl -> 0x05af }
            r0.mo32103q(r4)     // Catch:{ hl -> 0x05af }
            goto L_0x0011
        L_0x0285:
            com.google.android.gms.internal.measurement.hu r4 = r1.f47161p     // Catch:{ hl -> 0x05af }
            r5 = r5 & r8
            long r5 = (long) r5     // Catch:{ hl -> 0x05af }
            java.util.List r4 = r4.mo32265a(r2, r5)     // Catch:{ hl -> 0x05af }
            r0.mo32101p(r4)     // Catch:{ hl -> 0x05af }
            goto L_0x0011
        L_0x0292:
            com.google.android.gms.internal.measurement.hu r4 = r1.f47161p     // Catch:{ hl -> 0x05af }
            r5 = r5 & r8
            long r5 = (long) r5     // Catch:{ hl -> 0x05af }
            java.util.List r4 = r4.mo32265a(r2, r5)     // Catch:{ hl -> 0x05af }
            r0.mo32099o(r4)     // Catch:{ hl -> 0x05af }
            goto L_0x0011
        L_0x029f:
            com.google.android.gms.internal.measurement.hu r4 = r1.f47161p     // Catch:{ hl -> 0x05af }
            r5 = r5 & r8
            long r5 = (long) r5     // Catch:{ hl -> 0x05af }
            java.util.List r4 = r4.mo32265a(r2, r5)     // Catch:{ hl -> 0x05af }
            r0.mo32097n(r4)     // Catch:{ hl -> 0x05af }
            goto L_0x0011
        L_0x02ac:
            com.google.android.gms.internal.measurement.hu r7 = r1.f47161p     // Catch:{ hl -> 0x05af }
            r5 = r5 & r8
            long r8 = (long) r5     // Catch:{ hl -> 0x05af }
            java.util.List r5 = r7.mo32265a(r2, r8)     // Catch:{ hl -> 0x05af }
            r0.mo32095m(r5)     // Catch:{ hl -> 0x05af }
            com.google.android.gms.internal.measurement.hi r6 = r1.m40437c(r6)     // Catch:{ hl -> 0x05af }
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C16795jd.m40540a(r4, r5, r6, r14, r11)     // Catch:{ hl -> 0x05af }
            goto L_0x037d
        L_0x02c1:
            com.google.android.gms.internal.measurement.hu r4 = r1.f47161p     // Catch:{ hl -> 0x05af }
            r5 = r5 & r8
            long r5 = (long) r5     // Catch:{ hl -> 0x05af }
            java.util.List r4 = r4.mo32265a(r2, r5)     // Catch:{ hl -> 0x05af }
            r0.mo32093l(r4)     // Catch:{ hl -> 0x05af }
            goto L_0x0011
        L_0x02ce:
            com.google.android.gms.internal.measurement.hu r4 = r1.f47161p     // Catch:{ hl -> 0x05af }
            r5 = r5 & r8
            long r5 = (long) r5     // Catch:{ hl -> 0x05af }
            java.util.List r4 = r4.mo32265a(r2, r5)     // Catch:{ hl -> 0x05af }
            r0.mo32085h(r4)     // Catch:{ hl -> 0x05af }
            goto L_0x0011
        L_0x02db:
            com.google.android.gms.internal.measurement.hu r4 = r1.f47161p     // Catch:{ hl -> 0x05af }
            r5 = r5 & r8
            long r5 = (long) r5     // Catch:{ hl -> 0x05af }
            java.util.List r4 = r4.mo32265a(r2, r5)     // Catch:{ hl -> 0x05af }
            r0.mo32083g(r4)     // Catch:{ hl -> 0x05af }
            goto L_0x0011
        L_0x02e8:
            com.google.android.gms.internal.measurement.hu r4 = r1.f47161p     // Catch:{ hl -> 0x05af }
            r5 = r5 & r8
            long r5 = (long) r5     // Catch:{ hl -> 0x05af }
            java.util.List r4 = r4.mo32265a(r2, r5)     // Catch:{ hl -> 0x05af }
            r0.mo32081f(r4)     // Catch:{ hl -> 0x05af }
            goto L_0x0011
        L_0x02f5:
            com.google.android.gms.internal.measurement.hu r4 = r1.f47161p     // Catch:{ hl -> 0x05af }
            r5 = r5 & r8
            long r5 = (long) r5     // Catch:{ hl -> 0x05af }
            java.util.List r4 = r4.mo32265a(r2, r5)     // Catch:{ hl -> 0x05af }
            r0.mo32079e(r4)     // Catch:{ hl -> 0x05af }
            goto L_0x0011
        L_0x0302:
            com.google.android.gms.internal.measurement.hu r4 = r1.f47161p     // Catch:{ hl -> 0x05af }
            r5 = r5 & r8
            long r5 = (long) r5     // Catch:{ hl -> 0x05af }
            java.util.List r4 = r4.mo32265a(r2, r5)     // Catch:{ hl -> 0x05af }
            r0.mo32074c(r4)     // Catch:{ hl -> 0x05af }
            goto L_0x0011
        L_0x030f:
            com.google.android.gms.internal.measurement.hu r4 = r1.f47161p     // Catch:{ hl -> 0x05af }
            r5 = r5 & r8
            long r5 = (long) r5     // Catch:{ hl -> 0x05af }
            java.util.List r4 = r4.mo32265a(r2, r5)     // Catch:{ hl -> 0x05af }
            r0.mo32077d(r4)     // Catch:{ hl -> 0x05af }
            goto L_0x0011
        L_0x031c:
            com.google.android.gms.internal.measurement.hu r4 = r1.f47161p     // Catch:{ hl -> 0x05af }
            r5 = r5 & r8
            long r5 = (long) r5     // Catch:{ hl -> 0x05af }
            java.util.List r4 = r4.mo32265a(r2, r5)     // Catch:{ hl -> 0x05af }
            r0.mo32072b(r4)     // Catch:{ hl -> 0x05af }
            goto L_0x0011
        L_0x0329:
            com.google.android.gms.internal.measurement.hu r4 = r1.f47161p     // Catch:{ hl -> 0x05af }
            r5 = r5 & r8
            long r5 = (long) r5     // Catch:{ hl -> 0x05af }
            java.util.List r4 = r4.mo32265a(r2, r5)     // Catch:{ hl -> 0x05af }
            r0.mo32067a(r4)     // Catch:{ hl -> 0x05af }
            goto L_0x0011
        L_0x0336:
            com.google.android.gms.internal.measurement.hu r4 = r1.f47161p     // Catch:{ hl -> 0x05af }
            r5 = r5 & r8
            long r5 = (long) r5     // Catch:{ hl -> 0x05af }
            java.util.List r4 = r4.mo32265a(r2, r5)     // Catch:{ hl -> 0x05af }
            r0.mo32103q(r4)     // Catch:{ hl -> 0x05af }
            goto L_0x0011
        L_0x0343:
            com.google.android.gms.internal.measurement.hu r4 = r1.f47161p     // Catch:{ hl -> 0x05af }
            r5 = r5 & r8
            long r5 = (long) r5     // Catch:{ hl -> 0x05af }
            java.util.List r4 = r4.mo32265a(r2, r5)     // Catch:{ hl -> 0x05af }
            r0.mo32101p(r4)     // Catch:{ hl -> 0x05af }
            goto L_0x0011
        L_0x0350:
            com.google.android.gms.internal.measurement.hu r4 = r1.f47161p     // Catch:{ hl -> 0x05af }
            r5 = r5 & r8
            long r5 = (long) r5     // Catch:{ hl -> 0x05af }
            java.util.List r4 = r4.mo32265a(r2, r5)     // Catch:{ hl -> 0x05af }
            r0.mo32099o(r4)     // Catch:{ hl -> 0x05af }
            goto L_0x0011
        L_0x035d:
            com.google.android.gms.internal.measurement.hu r4 = r1.f47161p     // Catch:{ hl -> 0x05af }
            r5 = r5 & r8
            long r5 = (long) r5     // Catch:{ hl -> 0x05af }
            java.util.List r4 = r4.mo32265a(r2, r5)     // Catch:{ hl -> 0x05af }
            r0.mo32097n(r4)     // Catch:{ hl -> 0x05af }
            goto L_0x0011
        L_0x036a:
            com.google.android.gms.internal.measurement.hu r7 = r1.f47161p     // Catch:{ hl -> 0x05af }
            r5 = r5 & r8
            long r8 = (long) r5     // Catch:{ hl -> 0x05af }
            java.util.List r5 = r7.mo32265a(r2, r8)     // Catch:{ hl -> 0x05af }
            r0.mo32095m(r5)     // Catch:{ hl -> 0x05af }
            com.google.android.gms.internal.measurement.hi r6 = r1.m40437c(r6)     // Catch:{ hl -> 0x05af }
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C16795jd.m40540a(r4, r5, r6, r14, r11)     // Catch:{ hl -> 0x05af }
        L_0x037d:
            r14 = r4
            goto L_0x0011
        L_0x0380:
            com.google.android.gms.internal.measurement.hu r4 = r1.f47161p     // Catch:{ hl -> 0x05af }
            r5 = r5 & r8
            long r5 = (long) r5     // Catch:{ hl -> 0x05af }
            java.util.List r4 = r4.mo32265a(r2, r5)     // Catch:{ hl -> 0x05af }
            r0.mo32093l(r4)     // Catch:{ hl -> 0x05af }
            goto L_0x0011
        L_0x038d:
            com.google.android.gms.internal.measurement.hu r4 = r1.f47161p     // Catch:{ hl -> 0x05af }
            r5 = r5 & r8
            long r5 = (long) r5     // Catch:{ hl -> 0x05af }
            java.util.List r4 = r4.mo32265a(r2, r5)     // Catch:{ hl -> 0x05af }
            r0.mo32090k(r4)     // Catch:{ hl -> 0x05af }
            goto L_0x0011
        L_0x039a:
            com.google.android.gms.internal.measurement.jb r4 = r1.m40416a(r6)     // Catch:{ hl -> 0x05af }
            r5 = r5 & r8
            long r5 = (long) r5     // Catch:{ hl -> 0x05af }
            com.google.android.gms.internal.measurement.hu r7 = r1.f47161p     // Catch:{ hl -> 0x05af }
            java.util.List r5 = r7.mo32265a(r2, r5)     // Catch:{ hl -> 0x05af }
            r0.mo32068a(r5, r4, r10)     // Catch:{ hl -> 0x05af }
            goto L_0x0011
        L_0x03ab:
            boolean r4 = m40443f(r5)     // Catch:{ hl -> 0x05af }
            if (r4 == 0) goto L_0x03be
            com.google.android.gms.internal.measurement.hu r4 = r1.f47161p     // Catch:{ hl -> 0x05af }
            r5 = r5 & r8
            long r5 = (long) r5     // Catch:{ hl -> 0x05af }
            java.util.List r4 = r4.mo32265a(r2, r5)     // Catch:{ hl -> 0x05af }
            r0.mo32089j(r4)     // Catch:{ hl -> 0x05af }
            goto L_0x0011
        L_0x03be:
            com.google.android.gms.internal.measurement.hu r4 = r1.f47161p     // Catch:{ hl -> 0x05af }
            r5 = r5 & r8
            long r5 = (long) r5     // Catch:{ hl -> 0x05af }
            java.util.List r4 = r4.mo32265a(r2, r5)     // Catch:{ hl -> 0x05af }
            r0.mo32087i(r4)     // Catch:{ hl -> 0x05af }
            goto L_0x0011
        L_0x03cb:
            com.google.android.gms.internal.measurement.hu r4 = r1.f47161p     // Catch:{ hl -> 0x05af }
            r5 = r5 & r8
            long r5 = (long) r5     // Catch:{ hl -> 0x05af }
            java.util.List r4 = r4.mo32265a(r2, r5)     // Catch:{ hl -> 0x05af }
            r0.mo32085h(r4)     // Catch:{ hl -> 0x05af }
            goto L_0x0011
        L_0x03d8:
            com.google.android.gms.internal.measurement.hu r4 = r1.f47161p     // Catch:{ hl -> 0x05af }
            r5 = r5 & r8
            long r5 = (long) r5     // Catch:{ hl -> 0x05af }
            java.util.List r4 = r4.mo32265a(r2, r5)     // Catch:{ hl -> 0x05af }
            r0.mo32083g(r4)     // Catch:{ hl -> 0x05af }
            goto L_0x0011
        L_0x03e5:
            com.google.android.gms.internal.measurement.hu r4 = r1.f47161p     // Catch:{ hl -> 0x05af }
            r5 = r5 & r8
            long r5 = (long) r5     // Catch:{ hl -> 0x05af }
            java.util.List r4 = r4.mo32265a(r2, r5)     // Catch:{ hl -> 0x05af }
            r0.mo32081f(r4)     // Catch:{ hl -> 0x05af }
            goto L_0x0011
        L_0x03f2:
            com.google.android.gms.internal.measurement.hu r4 = r1.f47161p     // Catch:{ hl -> 0x05af }
            r5 = r5 & r8
            long r5 = (long) r5     // Catch:{ hl -> 0x05af }
            java.util.List r4 = r4.mo32265a(r2, r5)     // Catch:{ hl -> 0x05af }
            r0.mo32079e(r4)     // Catch:{ hl -> 0x05af }
            goto L_0x0011
        L_0x03ff:
            com.google.android.gms.internal.measurement.hu r4 = r1.f47161p     // Catch:{ hl -> 0x05af }
            r5 = r5 & r8
            long r5 = (long) r5     // Catch:{ hl -> 0x05af }
            java.util.List r4 = r4.mo32265a(r2, r5)     // Catch:{ hl -> 0x05af }
            r0.mo32074c(r4)     // Catch:{ hl -> 0x05af }
            goto L_0x0011
        L_0x040c:
            com.google.android.gms.internal.measurement.hu r4 = r1.f47161p     // Catch:{ hl -> 0x05af }
            r5 = r5 & r8
            long r5 = (long) r5     // Catch:{ hl -> 0x05af }
            java.util.List r4 = r4.mo32265a(r2, r5)     // Catch:{ hl -> 0x05af }
            r0.mo32077d(r4)     // Catch:{ hl -> 0x05af }
            goto L_0x0011
        L_0x0419:
            com.google.android.gms.internal.measurement.hu r4 = r1.f47161p     // Catch:{ hl -> 0x05af }
            r5 = r5 & r8
            long r5 = (long) r5     // Catch:{ hl -> 0x05af }
            java.util.List r4 = r4.mo32265a(r2, r5)     // Catch:{ hl -> 0x05af }
            r0.mo32072b(r4)     // Catch:{ hl -> 0x05af }
            goto L_0x0011
        L_0x0426:
            com.google.android.gms.internal.measurement.hu r4 = r1.f47161p     // Catch:{ hl -> 0x05af }
            r5 = r5 & r8
            long r5 = (long) r5     // Catch:{ hl -> 0x05af }
            java.util.List r4 = r4.mo32265a(r2, r5)     // Catch:{ hl -> 0x05af }
            r0.mo32067a(r4)     // Catch:{ hl -> 0x05af }
            goto L_0x0011
        L_0x0433:
            boolean r4 = r1.m40426a((T) r2, r6)     // Catch:{ hl -> 0x05af }
            if (r4 == 0) goto L_0x0451
            r4 = r5 & r8
            long r4 = (long) r4     // Catch:{ hl -> 0x05af }
            java.lang.Object r7 = com.google.android.gms.internal.measurement.C16819ka.m40704f(r2, r4)     // Catch:{ hl -> 0x05af }
            com.google.android.gms.internal.measurement.jb r6 = r1.m40416a(r6)     // Catch:{ hl -> 0x05af }
            java.lang.Object r6 = r0.mo32071b(r6, r10)     // Catch:{ hl -> 0x05af }
            java.lang.Object r6 = com.google.android.gms.internal.measurement.C16743hf.m40315a(r7, r6)     // Catch:{ hl -> 0x05af }
            com.google.android.gms.internal.measurement.C16819ka.m40684a(r2, r4, r6)     // Catch:{ hl -> 0x05af }
            goto L_0x0011
        L_0x0451:
            r4 = r5 & r8
            long r4 = (long) r4     // Catch:{ hl -> 0x05af }
            com.google.android.gms.internal.measurement.jb r7 = r1.m40416a(r6)     // Catch:{ hl -> 0x05af }
            java.lang.Object r7 = r0.mo32071b(r7, r10)     // Catch:{ hl -> 0x05af }
            com.google.android.gms.internal.measurement.C16819ka.m40684a(r2, r4, r7)     // Catch:{ hl -> 0x05af }
            r1.m40432b((T) r2, r6)     // Catch:{ hl -> 0x05af }
            goto L_0x0011
        L_0x0464:
            r4 = r5 & r8
            long r4 = (long) r4     // Catch:{ hl -> 0x05af }
            long r7 = r19.mo32106t()     // Catch:{ hl -> 0x05af }
            com.google.android.gms.internal.measurement.C16819ka.m40683a(r2, r4, r7)     // Catch:{ hl -> 0x05af }
            r1.m40432b((T) r2, r6)     // Catch:{ hl -> 0x05af }
            goto L_0x0011
        L_0x0473:
            r4 = r5 & r8
            long r4 = (long) r4     // Catch:{ hl -> 0x05af }
            int r7 = r19.mo32105s()     // Catch:{ hl -> 0x05af }
            com.google.android.gms.internal.measurement.C16819ka.m40682a(r2, r4, r7)     // Catch:{ hl -> 0x05af }
            r1.m40432b((T) r2, r6)     // Catch:{ hl -> 0x05af }
            goto L_0x0011
        L_0x0482:
            r4 = r5 & r8
            long r4 = (long) r4     // Catch:{ hl -> 0x05af }
            long r7 = r19.mo32104r()     // Catch:{ hl -> 0x05af }
            com.google.android.gms.internal.measurement.C16819ka.m40683a(r2, r4, r7)     // Catch:{ hl -> 0x05af }
            r1.m40432b((T) r2, r6)     // Catch:{ hl -> 0x05af }
            goto L_0x0011
        L_0x0491:
            r4 = r5 & r8
            long r4 = (long) r4     // Catch:{ hl -> 0x05af }
            int r7 = r19.mo32102q()     // Catch:{ hl -> 0x05af }
            com.google.android.gms.internal.measurement.C16819ka.m40682a(r2, r4, r7)     // Catch:{ hl -> 0x05af }
            r1.m40432b((T) r2, r6)     // Catch:{ hl -> 0x05af }
            goto L_0x0011
        L_0x04a0:
            int r7 = r19.mo32100p()     // Catch:{ hl -> 0x05af }
            com.google.android.gms.internal.measurement.hi r9 = r1.m40437c(r6)     // Catch:{ hl -> 0x05af }
            if (r9 == 0) goto L_0x04b7
            boolean r9 = r9.mo31922a(r7)     // Catch:{ hl -> 0x05af }
            if (r9 == 0) goto L_0x04b1
            goto L_0x04b7
        L_0x04b1:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C16795jd.m40539a(r4, r7, r14, r11)     // Catch:{ hl -> 0x05af }
            goto L_0x037d
        L_0x04b7:
            r4 = r5 & r8
            long r4 = (long) r4     // Catch:{ hl -> 0x05af }
            com.google.android.gms.internal.measurement.C16819ka.m40682a(r2, r4, r7)     // Catch:{ hl -> 0x05af }
            r1.m40432b((T) r2, r6)     // Catch:{ hl -> 0x05af }
            goto L_0x0011
        L_0x04c2:
            r4 = r5 & r8
            long r4 = (long) r4     // Catch:{ hl -> 0x05af }
            int r7 = r19.mo32098o()     // Catch:{ hl -> 0x05af }
            com.google.android.gms.internal.measurement.C16819ka.m40682a(r2, r4, r7)     // Catch:{ hl -> 0x05af }
            r1.m40432b((T) r2, r6)     // Catch:{ hl -> 0x05af }
            goto L_0x0011
        L_0x04d1:
            r4 = r5 & r8
            long r4 = (long) r4     // Catch:{ hl -> 0x05af }
            com.google.android.gms.internal.measurement.fs r7 = r19.mo32096n()     // Catch:{ hl -> 0x05af }
            com.google.android.gms.internal.measurement.C16819ka.m40684a(r2, r4, r7)     // Catch:{ hl -> 0x05af }
            r1.m40432b((T) r2, r6)     // Catch:{ hl -> 0x05af }
            goto L_0x0011
        L_0x04e0:
            boolean r4 = r1.m40426a((T) r2, r6)     // Catch:{ hl -> 0x05af }
            if (r4 == 0) goto L_0x04fe
            r4 = r5 & r8
            long r4 = (long) r4     // Catch:{ hl -> 0x05af }
            java.lang.Object r7 = com.google.android.gms.internal.measurement.C16819ka.m40704f(r2, r4)     // Catch:{ hl -> 0x05af }
            com.google.android.gms.internal.measurement.jb r6 = r1.m40416a(r6)     // Catch:{ hl -> 0x05af }
            java.lang.Object r6 = r0.mo32066a(r6, r10)     // Catch:{ hl -> 0x05af }
            java.lang.Object r6 = com.google.android.gms.internal.measurement.C16743hf.m40315a(r7, r6)     // Catch:{ hl -> 0x05af }
            com.google.android.gms.internal.measurement.C16819ka.m40684a(r2, r4, r6)     // Catch:{ hl -> 0x05af }
            goto L_0x0011
        L_0x04fe:
            r4 = r5 & r8
            long r4 = (long) r4     // Catch:{ hl -> 0x05af }
            com.google.android.gms.internal.measurement.jb r7 = r1.m40416a(r6)     // Catch:{ hl -> 0x05af }
            java.lang.Object r7 = r0.mo32066a(r7, r10)     // Catch:{ hl -> 0x05af }
            com.google.android.gms.internal.measurement.C16819ka.m40684a(r2, r4, r7)     // Catch:{ hl -> 0x05af }
            r1.m40432b((T) r2, r6)     // Catch:{ hl -> 0x05af }
            goto L_0x0011
        L_0x0511:
            r1.m40424a(r2, r5, r0)     // Catch:{ hl -> 0x05af }
            r1.m40432b((T) r2, r6)     // Catch:{ hl -> 0x05af }
            goto L_0x0011
        L_0x0519:
            r4 = r5 & r8
            long r4 = (long) r4     // Catch:{ hl -> 0x05af }
            boolean r7 = r19.mo32091k()     // Catch:{ hl -> 0x05af }
            com.google.android.gms.internal.measurement.C16819ka.m40685a(r2, r4, r7)     // Catch:{ hl -> 0x05af }
            r1.m40432b((T) r2, r6)     // Catch:{ hl -> 0x05af }
            goto L_0x0011
        L_0x0528:
            r4 = r5 & r8
            long r4 = (long) r4     // Catch:{ hl -> 0x05af }
            int r7 = r19.mo32088j()     // Catch:{ hl -> 0x05af }
            com.google.android.gms.internal.measurement.C16819ka.m40682a(r2, r4, r7)     // Catch:{ hl -> 0x05af }
            r1.m40432b((T) r2, r6)     // Catch:{ hl -> 0x05af }
            goto L_0x0011
        L_0x0537:
            r4 = r5 & r8
            long r4 = (long) r4     // Catch:{ hl -> 0x05af }
            long r7 = r19.mo32086i()     // Catch:{ hl -> 0x05af }
            com.google.android.gms.internal.measurement.C16819ka.m40683a(r2, r4, r7)     // Catch:{ hl -> 0x05af }
            r1.m40432b((T) r2, r6)     // Catch:{ hl -> 0x05af }
            goto L_0x0011
        L_0x0546:
            r4 = r5 & r8
            long r4 = (long) r4     // Catch:{ hl -> 0x05af }
            int r7 = r19.mo32084h()     // Catch:{ hl -> 0x05af }
            com.google.android.gms.internal.measurement.C16819ka.m40682a(r2, r4, r7)     // Catch:{ hl -> 0x05af }
            r1.m40432b((T) r2, r6)     // Catch:{ hl -> 0x05af }
            goto L_0x0011
        L_0x0555:
            r4 = r5 & r8
            long r4 = (long) r4     // Catch:{ hl -> 0x05af }
            long r7 = r19.mo32080f()     // Catch:{ hl -> 0x05af }
            com.google.android.gms.internal.measurement.C16819ka.m40683a(r2, r4, r7)     // Catch:{ hl -> 0x05af }
            r1.m40432b((T) r2, r6)     // Catch:{ hl -> 0x05af }
            goto L_0x0011
        L_0x0564:
            r4 = r5 & r8
            long r4 = (long) r4     // Catch:{ hl -> 0x05af }
            long r7 = r19.mo32082g()     // Catch:{ hl -> 0x05af }
            com.google.android.gms.internal.measurement.C16819ka.m40683a(r2, r4, r7)     // Catch:{ hl -> 0x05af }
            r1.m40432b((T) r2, r6)     // Catch:{ hl -> 0x05af }
            goto L_0x0011
        L_0x0573:
            r4 = r5 & r8
            long r4 = (long) r4     // Catch:{ hl -> 0x05af }
            float r7 = r19.mo32078e()     // Catch:{ hl -> 0x05af }
            com.google.android.gms.internal.measurement.C16819ka.m40681a(r2, r4, r7)     // Catch:{ hl -> 0x05af }
            r1.m40432b((T) r2, r6)     // Catch:{ hl -> 0x05af }
            goto L_0x0011
        L_0x0582:
            r4 = r5 & r8
            long r4 = (long) r4     // Catch:{ hl -> 0x05af }
            double r7 = r19.mo32076d()     // Catch:{ hl -> 0x05af }
            com.google.android.gms.internal.measurement.C16819ka.m40680a(r2, r4, r7)     // Catch:{ hl -> 0x05af }
            r1.m40432b((T) r2, r6)     // Catch:{ hl -> 0x05af }
            goto L_0x0011
        L_0x0591:
            r14 = r4
        L_0x0592:
            boolean r4 = r11.mo32364a(r14, r0)     // Catch:{ hl -> 0x05af }
            if (r4 != 0) goto L_0x0011
            int r0 = r1.f47158m
        L_0x059a:
            int r3 = r1.f47159n
            if (r0 >= r3) goto L_0x05a9
            int[] r3 = r1.f47157l
            r3 = r3[r0]
            java.lang.Object r14 = r1.m40418a(r2, r3, (UB) r14, r11)
            int r0 = r0 + 1
            goto L_0x059a
        L_0x05a9:
            if (r14 == 0) goto L_0x05ae
            r11.mo32368b(r2, r14)
        L_0x05ae:
            return
        L_0x05af:
            if (r14 != 0) goto L_0x05b6
            java.lang.Object r4 = r11.mo32369c(r2)     // Catch:{ all -> 0x05d3 }
            r14 = r4
        L_0x05b6:
            boolean r4 = r11.mo32364a(r14, r0)     // Catch:{ all -> 0x05d3 }
            if (r4 != 0) goto L_0x0011
            int r0 = r1.f47158m
        L_0x05be:
            int r3 = r1.f47159n
            if (r0 >= r3) goto L_0x05cd
            int[] r3 = r1.f47157l
            r3 = r3[r0]
            java.lang.Object r14 = r1.m40418a(r2, r3, (UB) r14, r11)
            int r0 = r0 + 1
            goto L_0x05be
        L_0x05cd:
            if (r14 == 0) goto L_0x05d2
            r11.mo32368b(r2, r14)
        L_0x05d2:
            return
        L_0x05d3:
            r0 = move-exception
            int r3 = r1.f47158m
        L_0x05d6:
            int r4 = r1.f47159n
            if (r3 >= r4) goto L_0x05e5
            int[] r4 = r1.f47157l
            r4 = r4[r3]
            java.lang.Object r14 = r1.m40418a(r2, r4, (UB) r14, r11)
            int r3 = r3 + 1
            goto L_0x05d6
        L_0x05e5:
            if (r14 == 0) goto L_0x05ea
            r11.mo32368b(r2, r14)
        L_0x05ea:
            throw r0
        L_0x05eb:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C16779io.mo32299a(java.lang.Object, com.google.android.gms.internal.measurement.ja, com.google.android.gms.internal.measurement.gq):void");
    }

    /* renamed from: a */
    private final C16793jb m40416a(int i) {
        int i2 = (i / 3) << 1;
        C16793jb jbVar = (C16793jb) this.f47149d[i2];
        if (jbVar != null) {
            return jbVar;
        }
        C16793jb a = C16788ix.m40472a().mo32308a((Class) this.f47149d[i2 + 1]);
        this.f47149d[i2] = a;
        return a;
    }

    /* renamed from: b */
    private final Object m40431b(int i) {
        return this.f47149d[(i / 3) << 1];
    }

    /* renamed from: c */
    private final C16746hi m40437c(int i) {
        return (C16746hi) this.f47149d[((i / 3) << 1) + 1];
    }

    /* renamed from: c */
    public final void mo32304c(T t) {
        for (int i = this.f47158m; i < this.f47159n; i++) {
            long d = (long) (m40439d(this.f47157l[i]) & 1048575);
            Object f = C16819ka.m40704f(t, d);
            if (f != null) {
                C16819ka.m40684a((Object) t, d, this.f47164s.mo32291d(f));
            }
        }
        int length = this.f47157l.length;
        for (int i2 = this.f47159n; i2 < length; i2++) {
            this.f47161p.mo32267b(t, (long) this.f47157l[i2]);
        }
        this.f47162q.mo32371d(t);
        if (this.f47153h) {
            this.f47163r.mo32201c(t);
        }
    }

    /* renamed from: a */
    private final <UT, UB> UB m40418a(Object obj, int i, UB ub, C16812ju<UT, UB> juVar) {
        int i2 = this.f47148c[i];
        Object f = C16819ka.m40704f(obj, (long) (m40439d(i) & 1048575));
        if (f == null) {
            return ub;
        }
        C16746hi c = m40437c(i);
        if (c == null) {
            return ub;
        }
        return m40417a(i, i2, this.f47164s.mo32288a(f), c, ub, juVar);
    }

    /* renamed from: a */
    private final <K, V, UT, UB> UB m40417a(int i, int i2, Map<K, V> map, C16746hi hiVar, UB ub, C16812ju<UT, UB> juVar) {
        C16768id f = this.f47164s.mo32293f(m40431b(i));
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            if (!hiVar.mo31922a(((Integer) entry.getValue()).intValue())) {
                if (ub == null) {
                    ub = juVar.mo32356a();
                }
                C16700ga b = C16691fs.m39867b(C16767ic.m40373a(f, entry.getKey(), entry.getValue()));
                try {
                    C16767ic.m40374a(b.f46950a, f, entry.getKey(), entry.getValue());
                    juVar.mo32360a(ub, i2, b.mo32036a());
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
    public final boolean mo32305d(T r14) {
        /*
            r13 = this;
            r0 = 0
            r1 = -1
            r1 = 0
            r2 = -1
            r3 = 0
        L_0x0005:
            int r4 = r13.f47158m
            r5 = 1
            if (r1 >= r4) goto L_0x0108
            int[] r4 = r13.f47157l
            r4 = r4[r1]
            int[] r6 = r13.f47148c
            r6 = r6[r4]
            int r7 = r13.m40439d(r4)
            boolean r8 = r13.f47155j
            r9 = 1048575(0xfffff, float:1.469367E-39)
            if (r8 != 0) goto L_0x0035
            int[] r8 = r13.f47148c
            int r10 = r4 + 2
            r8 = r8[r10]
            r10 = r8 & r9
            int r8 = r8 >>> 20
            int r8 = r5 << r8
            if (r10 == r2) goto L_0x0036
            sun.misc.Unsafe r2 = f47147b
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
            boolean r10 = r13.m40428a((T) r14, r4, r3, r8)
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
            com.google.android.gms.internal.measurement.if r6 = r13.f47164s
            r7 = r7 & r9
            long r7 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.C16819ka.m40704f(r14, r7)
            java.util.Map r6 = r6.mo32289b(r7)
            boolean r7 = r6.isEmpty()
            if (r7 != 0) goto L_0x00b3
            java.lang.Object r4 = r13.m40431b(r4)
            com.google.android.gms.internal.measurement.if r7 = r13.f47164s
            com.google.android.gms.internal.measurement.id r4 = r7.mo32293f(r4)
            com.google.android.gms.internal.measurement.kj r4 = r4.f47140c
            com.google.android.gms.internal.measurement.ko r4 = r4.zzyv()
            com.google.android.gms.internal.measurement.ko r7 = com.google.android.gms.internal.measurement.C16837ko.zzcek
            if (r4 != r7) goto L_0x00b3
            r4 = 0
            java.util.Collection r6 = r6.values()
            java.util.Iterator r6 = r6.iterator()
        L_0x0094:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x00b3
            java.lang.Object r7 = r6.next()
            if (r4 != 0) goto L_0x00ac
            com.google.android.gms.internal.measurement.ix r4 = com.google.android.gms.internal.measurement.C16788ix.m40472a()
            java.lang.Class r8 = r7.getClass()
            com.google.android.gms.internal.measurement.jb r4 = r4.mo32308a(r8)
        L_0x00ac:
            boolean r7 = r4.mo32305d(r7)
            if (r7 != 0) goto L_0x0094
            r5 = 0
        L_0x00b3:
            if (r5 != 0) goto L_0x0104
            return r0
        L_0x00b6:
            boolean r5 = r13.m40427a((T) r14, r6, r4)
            if (r5 == 0) goto L_0x0104
            com.google.android.gms.internal.measurement.jb r4 = r13.m40416a(r4)
            boolean r4 = m40429a(r14, r7, r4)
            if (r4 != 0) goto L_0x0104
            return r0
        L_0x00c7:
            r6 = r7 & r9
            long r6 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.measurement.C16819ka.m40704f(r14, r6)
            java.util.List r6 = (java.util.List) r6
            boolean r7 = r6.isEmpty()
            if (r7 != 0) goto L_0x00f0
            com.google.android.gms.internal.measurement.jb r4 = r13.m40416a(r4)
            r7 = 0
        L_0x00db:
            int r8 = r6.size()
            if (r7 >= r8) goto L_0x00f0
            java.lang.Object r8 = r6.get(r7)
            boolean r8 = r4.mo32305d(r8)
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
            boolean r5 = r13.m40428a((T) r14, r4, r3, r8)
            if (r5 == 0) goto L_0x0104
            com.google.android.gms.internal.measurement.jb r4 = r13.m40416a(r4)
            boolean r4 = m40429a(r14, r7, r4)
            if (r4 != 0) goto L_0x0104
            return r0
        L_0x0104:
            int r1 = r1 + 1
            goto L_0x0005
        L_0x0108:
            boolean r1 = r13.f47153h
            if (r1 == 0) goto L_0x0119
            com.google.android.gms.internal.measurement.gr<?> r1 = r13.f47163r
            com.google.android.gms.internal.measurement.gu r14 = r1.mo32193a(r14)
            boolean r14 = r14.mo32207d()
            if (r14 != 0) goto L_0x0119
            return r0
        L_0x0119:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C16779io.mo32305d(java.lang.Object):boolean");
    }

    /* renamed from: a */
    private static boolean m40429a(Object obj, int i, C16793jb jbVar) {
        return jbVar.mo32305d(C16819ka.m40704f(obj, (long) (i & 1048575)));
    }

    /* renamed from: a */
    private static void m40421a(int i, Object obj, C16838kp kpVar) throws IOException {
        if (obj instanceof String) {
            kpVar.mo32154a(i, (String) obj);
        } else {
            kpVar.mo32150a(i, (C16691fs) obj);
        }
    }

    /* renamed from: a */
    private final void m40424a(Object obj, int i, C16792ja jaVar) throws IOException {
        if (m40443f(i)) {
            C16819ka.m40684a(obj, (long) (i & 1048575), (Object) jaVar.mo32094m());
        } else if (this.f47154i) {
            C16819ka.m40684a(obj, (long) (i & 1048575), (Object) jaVar.mo32092l());
        } else {
            C16819ka.m40684a(obj, (long) (i & 1048575), (Object) jaVar.mo32096n());
        }
    }

    /* renamed from: d */
    private final int m40439d(int i) {
        return this.f47148c[i + 1];
    }

    /* renamed from: e */
    private final int m40441e(int i) {
        return this.f47148c[i + 2];
    }

    /* renamed from: b */
    private static <T> double m40430b(T t, long j) {
        return ((Double) C16819ka.m40704f(t, j)).doubleValue();
    }

    /* renamed from: c */
    private static <T> float m40436c(T t, long j) {
        return ((Float) C16819ka.m40704f(t, j)).floatValue();
    }

    /* renamed from: d */
    private static <T> int m40440d(T t, long j) {
        return ((Integer) C16819ka.m40704f(t, j)).intValue();
    }

    /* renamed from: e */
    private static <T> long m40442e(T t, long j) {
        return ((Long) C16819ka.m40704f(t, j)).longValue();
    }

    /* renamed from: f */
    private static <T> boolean m40444f(T t, long j) {
        return ((Boolean) C16819ka.m40704f(t, j)).booleanValue();
    }

    /* renamed from: c */
    private final boolean m40438c(T t, T t2, int i) {
        return m40426a(t, i) == m40426a(t2, i);
    }

    /* renamed from: a */
    private final boolean m40428a(T t, int i, int i2, int i3) {
        if (this.f47155j) {
            return m40426a(t, i);
        }
        return (i2 & i3) != 0;
    }

    /* renamed from: a */
    private final boolean m40426a(T t, int i) {
        if (this.f47155j) {
            int d = m40439d(i);
            long j = (long) (d & 1048575);
            switch ((d & 267386880) >>> 20) {
                case 0:
                    return C16819ka.m40702e(t, j) != ProfileUiInitOptimizeEnterThreshold.DEFAULT;
                case 1:
                    return C16819ka.m40698d(t, j) != 0.0f;
                case 2:
                    return C16819ka.m40689b(t, j) != 0;
                case 3:
                    return C16819ka.m40689b(t, j) != 0;
                case 4:
                    return C16819ka.m40674a((Object) t, j) != 0;
                case 5:
                    return C16819ka.m40689b(t, j) != 0;
                case 6:
                    return C16819ka.m40674a((Object) t, j) != 0;
                case 7:
                    return C16819ka.m40697c(t, j);
                case 8:
                    Object f = C16819ka.m40704f(t, j);
                    if (f instanceof String) {
                        return !((String) f).isEmpty();
                    }
                    if (f instanceof C16691fs) {
                        return !C16691fs.zzbtq.equals(f);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    return C16819ka.m40704f(t, j) != null;
                case 10:
                    return !C16691fs.zzbtq.equals(C16819ka.m40704f(t, j));
                case 11:
                    return C16819ka.m40674a((Object) t, j) != 0;
                case 12:
                    return C16819ka.m40674a((Object) t, j) != 0;
                case 13:
                    return C16819ka.m40674a((Object) t, j) != 0;
                case 14:
                    return C16819ka.m40689b(t, j) != 0;
                case 15:
                    return C16819ka.m40674a((Object) t, j) != 0;
                case 16:
                    return C16819ka.m40689b(t, j) != 0;
                case 17:
                    return C16819ka.m40704f(t, j) != null;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            int e = m40441e(i);
            return (C16819ka.m40674a((Object) t, (long) (e & 1048575)) & (1 << (e >>> 20))) != 0;
        }
    }

    /* renamed from: b */
    private final void m40432b(T t, int i) {
        if (!this.f47155j) {
            int e = m40441e(i);
            long j = (long) (e & 1048575);
            C16819ka.m40682a((Object) t, j, C16819ka.m40674a((Object) t, j) | (1 << (e >>> 20)));
        }
    }

    /* renamed from: a */
    private final boolean m40427a(T t, int i, int i2) {
        return C16819ka.m40674a((Object) t, (long) (m40441e(i2) & 1048575)) == i;
    }

    /* renamed from: b */
    private final void m40433b(T t, int i, int i2) {
        C16819ka.m40682a((Object) t, (long) (m40441e(i2) & 1048575), i);
    }
}
