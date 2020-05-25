package com.bytedance.android.livesdk.p279af;

import com.facebook.imagepipeline.p975o.C14234d;
import com.facebook.p914c.p915a.C13619c;
import com.facebook.p914c.p915a.C13624h;

/* renamed from: com.bytedance.android.livesdk.af.v */
public final class C4620v implements C14234d {

    /* renamed from: a */
    private int f12598a;

    /* renamed from: b */
    private float f12599b;

    /* renamed from: c */
    private C4621a f12600c;

    /* renamed from: com.bytedance.android.livesdk.af.v$a */
    public interface C4621a {
    }

    public final String getName() {
        return "blurProcessor";
    }

    public final C13619c getPostprocessorCacheKey() {
        return new C13624h("blur_bitmap_processor");
    }

    public C4620v(int i) {
        this.f12598a = 8;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0087  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.facebook.common.p924h.C13715a<android.graphics.Bitmap> process(android.graphics.Bitmap r42, com.facebook.imagepipeline.p963c.C13946f r43) {
        /*
            r41 = this;
            r0 = r41
            int r1 = r42.getWidth()
            int r2 = r42.getHeight()
            r3 = 100
            if (r1 < r3) goto L_0x0020
            if (r2 >= r3) goto L_0x0011
            goto L_0x0020
        L_0x0011:
            r3 = 200(0xc8, float:2.8E-43)
            if (r1 < r3) goto L_0x001c
            if (r2 >= r3) goto L_0x0018
            goto L_0x001c
        L_0x0018:
            r3 = 1036831949(0x3dcccccd, float:0.1)
            goto L_0x0023
        L_0x001c:
            r3 = 1050253722(0x3e99999a, float:0.3)
            goto L_0x0023
        L_0x0020:
            r3 = 1058642330(0x3f19999a, float:0.6)
        L_0x0023:
            float r1 = (float) r1
            float r1 = r1 * r3
            int r1 = java.lang.Math.round(r1)
            float r2 = (float) r2
            float r2 = r2 * r3
            int r2 = java.lang.Math.round(r2)
            r3 = 0
            r4 = r42
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createScaledBitmap(r4, r1, r2, r3)
            float r5 = r0.f12599b
            r6 = 0
            r7 = 1
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 == 0) goto L_0x0070
            float r5 = (float) r1
            float r6 = (float) r2
            float r8 = r5 / r6
            int r9 = r0.f12598a
            float r9 = (float) r9
            float r8 = r8 - r9
            float r8 = java.lang.Math.abs(r8)
            r9 = 1045220557(0x3e4ccccd, float:0.2)
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 <= 0) goto L_0x0070
            float r8 = r0.f12599b
            float r5 = r5 / r8
            int r5 = (int) r5
            if (r5 <= r2) goto L_0x0060
            float r5 = r0.f12599b
            float r6 = r6 * r5
            int r5 = (int) r6
            r6 = r2
            goto L_0x0062
        L_0x0060:
            r6 = r5
            r5 = r1
        L_0x0062:
            int r1 = r1 - r5
            int r1 = r1 >> r7
            int r2 = r2 - r6
            int r2 = r2 >> r7
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r4, r1, r2, r5, r6)
            r4.recycle()
            r4 = r1
            r2 = r6
            goto L_0x0071
        L_0x0070:
            r5 = r1
        L_0x0071:
            r1 = r43
            com.facebook.common.h.a r1 = r1.mo26108a(r5, r2)
            java.lang.Object r2 = r1.mo25630a()
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            int r5 = r0.f12598a
            if (r5 > 0) goto L_0x0087
            r21 = r1
            r23 = r4
            goto L_0x0345
        L_0x0087:
            int r6 = r2.getWidth()
            int r15 = r2.getHeight()
            int r14 = r6 * r15
            int[] r13 = new int[r14]
            r10 = 0
            r12 = 0
            r16 = 0
            r8 = r4
            r9 = r13
            r11 = r6
            r17 = r13
            r13 = r16
            r3 = r14
            r14 = r6
            r19 = r15
            r8.getPixels(r9, r10, r11, r12, r13, r14, r15)
            int r8 = r6 + -1
            int r9 = r15 + -1
            int r10 = r5 + r5
            int r10 = r10 + r7
            int[] r11 = new int[r3]
            int[] r12 = new int[r3]
            int[] r3 = new int[r3]
            int r13 = java.lang.Math.max(r6, r15)
            int[] r13 = new int[r13]
            int r14 = r10 + 1
            int r14 = r14 >> r7
            int r14 = r14 * r14
            int r7 = r14 * 256
            int[] r0 = new int[r7]
            r21 = r1
            r1 = 0
        L_0x00c4:
            if (r1 >= r7) goto L_0x00cd
            int r16 = r1 / r14
            r0[r1] = r16
            int r1 = r1 + 1
            goto L_0x00c4
        L_0x00cd:
            r1 = 3
            int[] r1 = new int[]{r10, r1}
            java.lang.Class<int> r7 = int.class
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r7, r1)
            int[][] r1 = (int[][]) r1
            int r7 = r5 + 1
            r14 = 0
            r16 = 0
            r19 = 0
        L_0x00e1:
            r22 = 2
            if (r14 >= r15) goto L_0x0207
            r23 = r4
            int r4 = -r5
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
        L_0x00fa:
            r33 = 65280(0xff00, float:9.1477E-41)
            r34 = 16711680(0xff0000, float:2.3418052E-38)
            if (r4 > r5) goto L_0x0162
            r35 = r2
            r36 = r15
            r2 = 0
            int r15 = java.lang.Math.max(r4, r2)
            int r15 = java.lang.Math.min(r8, r15)
            int r15 = r16 + r15
            r15 = r17[r15]
            int r18 = r4 + r5
            r37 = r1[r18]
            r18 = r15 & r34
            int r18 = r18 >> 16
            r37[r2] = r18
            r18 = r15 & r33
            int r18 = r18 >> 8
            r20 = 1
            r37[r20] = r18
            r15 = r15 & 255(0xff, float:3.57E-43)
            r37[r22] = r15
            int r15 = java.lang.Math.abs(r4)
            int r15 = r7 - r15
            r18 = r37[r2]
            int r18 = r18 * r15
            int r24 = r24 + r18
            r18 = r37[r20]
            int r18 = r18 * r15
            int r25 = r25 + r18
            r18 = r37[r22]
            int r18 = r18 * r15
            int r26 = r26 + r18
            if (r4 <= 0) goto L_0x014f
            r15 = r37[r2]
            int r27 = r27 + r15
            r15 = r37[r20]
            int r28 = r28 + r15
            r15 = r37[r22]
            int r29 = r29 + r15
            goto L_0x015b
        L_0x014f:
            r15 = r37[r2]
            int r30 = r30 + r15
            r2 = r37[r20]
            int r31 = r31 + r2
            r2 = r37[r22]
            int r32 = r32 + r2
        L_0x015b:
            int r4 = r4 + 1
            r2 = r35
            r15 = r36
            goto L_0x00fa
        L_0x0162:
            r35 = r2
            r36 = r15
            r4 = r5
            r2 = 0
        L_0x0168:
            if (r2 >= r6) goto L_0x01f9
            r15 = r0[r24]
            r11[r16] = r15
            r15 = r0[r25]
            r12[r16] = r15
            r15 = r0[r26]
            r3[r16] = r15
            int r24 = r24 - r30
            int r25 = r25 - r31
            int r26 = r26 - r32
            int r15 = r4 - r5
            int r15 = r15 + r10
            int r15 = r15 % r10
            r15 = r1[r15]
            r18 = 0
            r37 = r15[r18]
            int r30 = r30 - r37
            r20 = 1
            r37 = r15[r20]
            int r31 = r31 - r37
            r37 = r15[r22]
            int r32 = r32 - r37
            if (r14 != 0) goto L_0x01a1
            int r37 = r2 + r5
            r38 = r0
            int r0 = r37 + 1
            int r0 = java.lang.Math.min(r0, r8)
            r13[r2] = r0
            goto L_0x01a3
        L_0x01a1:
            r38 = r0
        L_0x01a3:
            r0 = r13[r2]
            int r0 = r19 + r0
            r0 = r17[r0]
            r37 = r0 & r34
            int r37 = r37 >> 16
            r18 = 0
            r15[r18] = r37
            r37 = r0 & r33
            int r37 = r37 >> 8
            r20 = 1
            r15[r20] = r37
            r0 = r0 & 255(0xff, float:3.57E-43)
            r15[r22] = r0
            r0 = r15[r18]
            int r27 = r27 + r0
            r0 = r15[r20]
            int r28 = r28 + r0
            r0 = r15[r22]
            int r29 = r29 + r0
            int r24 = r24 + r27
            int r25 = r25 + r28
            int r26 = r26 + r29
            int r4 = r4 + 1
            int r4 = r4 % r10
            int r0 = r4 % r10
            r0 = r1[r0]
            r15 = 0
            r18 = r0[r15]
            int r30 = r30 + r18
            r20 = 1
            r18 = r0[r20]
            int r31 = r31 + r18
            r18 = r0[r22]
            int r32 = r32 + r18
            r37 = r0[r15]
            int r27 = r27 - r37
            r15 = r0[r20]
            int r28 = r28 - r15
            r0 = r0[r22]
            int r29 = r29 - r0
            int r16 = r16 + 1
            int r2 = r2 + 1
            r0 = r38
            goto L_0x0168
        L_0x01f9:
            r38 = r0
            int r19 = r19 + r6
            int r14 = r14 + 1
            r4 = r23
            r2 = r35
            r15 = r36
            goto L_0x00e1
        L_0x0207:
            r38 = r0
            r35 = r2
            r23 = r4
            r36 = r15
            r0 = 0
        L_0x0210:
            if (r0 >= r6) goto L_0x0336
            int r2 = -r5
            int r4 = r2 * r6
            r8 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r19 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
        L_0x0224:
            if (r2 > r5) goto L_0x0282
            r39 = r13
            r13 = 0
            int r18 = java.lang.Math.max(r13, r4)
            int r28 = r18 + r0
            int r18 = r2 + r5
            r29 = r1[r18]
            r18 = r11[r28]
            r29[r13] = r18
            r13 = r12[r28]
            r20 = 1
            r29[r20] = r13
            r13 = r3[r28]
            r29[r22] = r13
            int r13 = java.lang.Math.abs(r2)
            int r13 = r7 - r13
            r30 = r11[r28]
            int r30 = r30 * r13
            int r8 = r8 + r30
            r30 = r12[r28]
            int r30 = r30 * r13
            int r14 = r14 + r30
            r28 = r3[r28]
            int r28 = r28 * r13
            int r15 = r15 + r28
            if (r2 <= 0) goto L_0x026b
            r13 = 0
            r18 = r29[r13]
            int r16 = r16 + r18
            r20 = 1
            r18 = r29[r20]
            int r19 = r19 + r18
            r18 = r29[r22]
            int r24 = r24 + r18
            goto L_0x027a
        L_0x026b:
            r13 = 0
            r20 = 1
            r28 = r29[r13]
            int r25 = r25 + r28
            r13 = r29[r20]
            int r26 = r26 + r13
            r13 = r29[r22]
            int r27 = r27 + r13
        L_0x027a:
            if (r2 >= r9) goto L_0x027d
            int r4 = r4 + r6
        L_0x027d:
            int r2 = r2 + 1
            r13 = r39
            goto L_0x0224
        L_0x0282:
            r39 = r13
            r13 = r8
            r28 = r24
            r2 = r36
            r4 = 0
            r8 = r0
            r24 = r19
            r19 = r16
            r16 = r5
        L_0x0291:
            if (r4 >= r2) goto L_0x0328
            r29 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r30 = r17[r8]
            r29 = r30 & r29
            r30 = r38[r13]
            int r30 = r30 << 16
            r29 = r29 | r30
            r30 = r38[r14]
            int r30 = r30 << 8
            r29 = r29 | r30
            r30 = r38[r15]
            r29 = r29 | r30
            r17[r8] = r29
            int r13 = r13 - r25
            int r14 = r14 - r26
            int r15 = r15 - r27
            int r29 = r16 - r5
            int r29 = r29 + r10
            int r29 = r29 % r10
            r29 = r1[r29]
            r18 = 0
            r30 = r29[r18]
            int r25 = r25 - r30
            r20 = 1
            r30 = r29[r20]
            int r26 = r26 - r30
            r30 = r29[r22]
            int r27 = r27 - r30
            if (r0 != 0) goto L_0x02d8
            r40 = r5
            int r5 = r4 + r7
            int r5 = java.lang.Math.min(r5, r9)
            int r5 = r5 * r6
            r39[r4] = r5
            goto L_0x02da
        L_0x02d8:
            r40 = r5
        L_0x02da:
            r5 = r39[r4]
            int r5 = r5 + r0
            r30 = r11[r5]
            r18 = 0
            r29[r18] = r30
            r30 = r12[r5]
            r20 = 1
            r29[r20] = r30
            r5 = r3[r5]
            r29[r22] = r5
            r5 = r29[r18]
            int r19 = r19 + r5
            r5 = r29[r20]
            int r24 = r24 + r5
            r5 = r29[r22]
            int r28 = r28 + r5
            int r13 = r13 + r19
            int r14 = r14 + r24
            int r15 = r15 + r28
            int r16 = r16 + 1
            int r16 = r16 % r10
            r5 = r1[r16]
            r18 = 0
            r29 = r5[r18]
            int r25 = r25 + r29
            r20 = 1
            r29 = r5[r20]
            int r26 = r26 + r29
            r29 = r5[r22]
            int r27 = r27 + r29
            r29 = r5[r18]
            int r19 = r19 - r29
            r29 = r5[r20]
            int r24 = r24 - r29
            r5 = r5[r22]
            int r28 = r28 - r5
            int r8 = r8 + r6
            int r4 = r4 + 1
            r5 = r40
            goto L_0x0291
        L_0x0328:
            r40 = r5
            r18 = 0
            r20 = 1
            int r0 = r0 + 1
            r36 = r2
            r13 = r39
            goto L_0x0210
        L_0x0336:
            r2 = r36
            r10 = 0
            r12 = 0
            r13 = 0
            r8 = r35
            r9 = r17
            r11 = r6
            r14 = r6
            r15 = r2
            r8.setPixels(r9, r10, r11, r12, r13, r14, r15)
        L_0x0345:
            r23.recycle()
            return r21
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.p279af.C4620v.process(android.graphics.Bitmap, com.facebook.imagepipeline.c.f):com.facebook.common.h.a");
    }

    public C4620v(int i, float f, C4621a aVar) {
        this.f12599b = f;
        this.f12598a = i;
        this.f12600c = null;
    }
}
