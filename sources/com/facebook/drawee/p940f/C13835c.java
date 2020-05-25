package com.facebook.drawee.p940f;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import com.facebook.drawee.p939e.C13816q.C13818b;

/* renamed from: com.facebook.drawee.f.c */
public final class C13835c {
    /* renamed from: a */
    private static C13837e m28110a(C13834b bVar) {
        if (bVar.f36104t == null) {
            bVar.mo25918a(new C13837e());
        }
        return bVar.f36104t;
    }

    /* renamed from: a */
    private static C13818b m28108a(TypedArray typedArray, int i) {
        switch (typedArray.getInt(i, -2)) {
            case -1:
                return null;
            case 0:
                return C13818b.f36061a;
            case 1:
                return C13818b.f36062b;
            case 2:
                return C13818b.f36063c;
            case 3:
                return C13818b.f36064d;
            case 4:
                return C13818b.f36065e;
            case 5:
                return C13818b.f36066f;
            case 6:
                return C13818b.f36067g;
            case 7:
                return C13818b.f36068h;
            case 8:
                return C13818b.f36069i;
            default:
                throw new RuntimeException("XML attribute not specified!");
        }
    }

    /* renamed from: a */
    private static Drawable m28107a(Context context, TypedArray typedArray, int i) {
        int resourceId = typedArray.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        return context.getResources().getDrawable(resourceId);
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x01e2, code lost:
        if (r14 != false) goto L_0x0201;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x01fd, code lost:
        if (r15 != false) goto L_0x0201;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.facebook.drawee.p940f.C13834b m28109a(com.facebook.drawee.p940f.C13834b r18, android.content.Context r19, android.util.AttributeSet r20) {
        /*
            r0 = r18
            r1 = r19
            r2 = r20
            if (r2 == 0) goto L_0x021a
            r6 = 29
            int[] r6 = new int[r6]
            r6 = {2131361836, 2131361912, 2131362252, 2131362254, 2131362255, 2131362636, 2131362658, 2131362659, 2131362670, 2131362676, 2131362677, 2131362678, 2131362761, 2131362762, 2131362819, 2131362820, 2131362821, 2131362822, 2131362823, 2131362825, 2131362826, 2131362827, 2131362828, 2131362829, 2131362838, 2131362840, 2131362841, 2131362842, 2131363215} // fill-array
            android.content.res.TypedArray r2 = r1.obtainStyledAttributes(r2, r6)
            int r7 = r2.getIndexCount()     // Catch:{ all -> 0x0204 }
            r5 = 0
            r6 = 1
            r8 = 0
            r9 = 1
            r10 = 1
            r11 = 1
            r12 = 1
            r13 = 1
            r14 = 1
            r15 = 1
            r16 = 0
        L_0x0023:
            if (r8 >= r7) goto L_0x01b0
            int r3 = r2.getIndex(r8)     // Catch:{ all -> 0x0204 }
            if (r3 != 0) goto L_0x0037
            com.facebook.drawee.e.q$b r3 = m28108a(r2, r3)     // Catch:{ all -> 0x0204 }
            r0.mo25930e(r3)     // Catch:{ all -> 0x0204 }
        L_0x0032:
            r17 = r16
        L_0x0034:
            r4 = 0
            goto L_0x01a8
        L_0x0037:
            r4 = 6
            if (r3 != r4) goto L_0x0042
            android.graphics.drawable.Drawable r3 = m28107a(r1, r2, r3)     // Catch:{ all -> 0x0204 }
            r0.mo25916a(r3)     // Catch:{ all -> 0x0204 }
            goto L_0x0032
        L_0x0042:
            r4 = 8
            if (r3 != r4) goto L_0x004e
            android.graphics.drawable.Drawable r3 = m28107a(r1, r2, r3)     // Catch:{ all -> 0x0204 }
            r0.mo25931f(r3)     // Catch:{ all -> 0x0204 }
            goto L_0x0032
        L_0x004e:
            r4 = 10
            if (r3 != r4) goto L_0x005a
            android.graphics.drawable.Drawable r3 = m28107a(r1, r2, r3)     // Catch:{ all -> 0x0204 }
            r0.mo25927d(r3)     // Catch:{ all -> 0x0204 }
            goto L_0x0032
        L_0x005a:
            r4 = 2
            if (r3 != r4) goto L_0x0066
            r4 = 0
            int r3 = r2.getInt(r3, r4)     // Catch:{ all -> 0x0204 }
            r0.mo25913a(r3)     // Catch:{ all -> 0x0204 }
            goto L_0x0032
        L_0x0066:
            r4 = 28
            if (r3 != r4) goto L_0x0072
            r4 = 0
            float r3 = r2.getFloat(r3, r4)     // Catch:{ all -> 0x0204 }
            r0.f36089e = r3     // Catch:{ all -> 0x0204 }
            goto L_0x0032
        L_0x0072:
            r4 = 7
            if (r3 != r4) goto L_0x007d
            com.facebook.drawee.e.q$b r3 = m28108a(r2, r3)     // Catch:{ all -> 0x0204 }
            r0.mo25917a(r3)     // Catch:{ all -> 0x0204 }
            goto L_0x0032
        L_0x007d:
            r4 = 12
            if (r3 != r4) goto L_0x0089
            android.graphics.drawable.Drawable r3 = m28107a(r1, r2, r3)     // Catch:{ all -> 0x0204 }
            r0.mo25921b(r3)     // Catch:{ all -> 0x0204 }
            goto L_0x0032
        L_0x0089:
            r4 = 13
            if (r3 != r4) goto L_0x0095
            com.facebook.drawee.e.q$b r3 = m28108a(r2, r3)     // Catch:{ all -> 0x0204 }
            r0.mo25922b(r3)     // Catch:{ all -> 0x0204 }
            goto L_0x0032
        L_0x0095:
            r4 = 3
            if (r3 != r4) goto L_0x00a0
            android.graphics.drawable.Drawable r3 = m28107a(r1, r2, r3)     // Catch:{ all -> 0x0204 }
            r0.mo25924c(r3)     // Catch:{ all -> 0x0204 }
            goto L_0x0032
        L_0x00a0:
            r4 = 4
            if (r3 != r4) goto L_0x00ab
            com.facebook.drawee.e.q$b r3 = m28108a(r2, r3)     // Catch:{ all -> 0x0204 }
            r0.mo25925c(r3)     // Catch:{ all -> 0x0204 }
            goto L_0x0032
        L_0x00ab:
            r4 = 11
            if (r3 != r4) goto L_0x00b8
            com.facebook.drawee.e.q$b r3 = m28108a(r2, r3)     // Catch:{ all -> 0x0204 }
            r0.mo25928d(r3)     // Catch:{ all -> 0x0204 }
            goto L_0x0032
        L_0x00b8:
            r4 = 9
            if (r3 != r4) goto L_0x00c3
            int r5 = r2.getInteger(r3, r5)     // Catch:{ all -> 0x0204 }
        L_0x00c0:
            r4 = 0
            goto L_0x01aa
        L_0x00c3:
            r4 = 1
            if (r3 != r4) goto L_0x00cf
            android.graphics.drawable.Drawable r3 = m28107a(r1, r2, r3)     // Catch:{ all -> 0x0204 }
            r0.mo25929e(r3)     // Catch:{ all -> 0x0204 }
            goto L_0x0032
        L_0x00cf:
            r4 = 5
            if (r3 != r4) goto L_0x00eb
            android.graphics.drawable.Drawable r3 = m28107a(r1, r2, r3)     // Catch:{ all -> 0x0204 }
            if (r3 != 0) goto L_0x00dd
            r3 = 0
            r0.f36102r = r3     // Catch:{ all -> 0x0204 }
            goto L_0x0032
        L_0x00dd:
            r4 = 1
            android.graphics.drawable.Drawable[] r1 = new android.graphics.drawable.Drawable[r4]     // Catch:{ all -> 0x0204 }
            r4 = 0
            r1[r4] = r3     // Catch:{ all -> 0x0204 }
            java.util.List r1 = java.util.Arrays.asList(r1)     // Catch:{ all -> 0x0204 }
            r0.f36102r = r1     // Catch:{ all -> 0x0204 }
            goto L_0x0032
        L_0x00eb:
            r1 = 14
            if (r3 != r1) goto L_0x00fd
            com.facebook.drawee.f.e r1 = m28110a(r18)     // Catch:{ all -> 0x0204 }
            r4 = 0
            boolean r3 = r2.getBoolean(r3, r4)     // Catch:{ all -> 0x0204 }
            r1.mo25937a(r3)     // Catch:{ all -> 0x0204 }
            goto L_0x0032
        L_0x00fd:
            r1 = 24
            if (r3 != r1) goto L_0x0108
            r4 = r16
            int r16 = r2.getDimensionPixelSize(r3, r4)     // Catch:{ all -> 0x0204 }
            goto L_0x00c0
        L_0x0108:
            r4 = r16
            r1 = 20
            if (r3 != r1) goto L_0x0116
            boolean r1 = r2.getBoolean(r3, r9)     // Catch:{ all -> 0x0204 }
            r9 = r1
        L_0x0113:
            r16 = r4
            goto L_0x00c0
        L_0x0116:
            r1 = 21
            if (r3 != r1) goto L_0x0120
            boolean r1 = r2.getBoolean(r3, r12)     // Catch:{ all -> 0x0204 }
            r12 = r1
            goto L_0x0113
        L_0x0120:
            r1 = 16
            if (r3 != r1) goto L_0x012a
            boolean r1 = r2.getBoolean(r3, r6)     // Catch:{ all -> 0x0204 }
            r6 = r1
            goto L_0x0113
        L_0x012a:
            r1 = 17
            if (r3 != r1) goto L_0x0134
            boolean r1 = r2.getBoolean(r3, r13)     // Catch:{ all -> 0x0204 }
            r13 = r1
            goto L_0x0113
        L_0x0134:
            r1 = 22
            if (r3 != r1) goto L_0x013e
            boolean r1 = r2.getBoolean(r3, r10)     // Catch:{ all -> 0x0204 }
            r10 = r1
            goto L_0x0113
        L_0x013e:
            r1 = 19
            if (r3 != r1) goto L_0x0148
            boolean r1 = r2.getBoolean(r3, r11)     // Catch:{ all -> 0x0204 }
            r11 = r1
            goto L_0x0113
        L_0x0148:
            r1 = 18
            if (r3 != r1) goto L_0x0152
            boolean r1 = r2.getBoolean(r3, r15)     // Catch:{ all -> 0x0204 }
            r15 = r1
            goto L_0x0113
        L_0x0152:
            r1 = 15
            if (r3 != r1) goto L_0x015c
            boolean r1 = r2.getBoolean(r3, r14)     // Catch:{ all -> 0x0204 }
            r14 = r1
            goto L_0x0113
        L_0x015c:
            r1 = 23
            if (r3 != r1) goto L_0x0170
            com.facebook.drawee.f.e r1 = m28110a(r18)     // Catch:{ all -> 0x0204 }
            r17 = r4
            r4 = 0
            int r3 = r2.getColor(r3, r4)     // Catch:{ all -> 0x0204 }
            r1.mo25934a(r3)     // Catch:{ all -> 0x0204 }
            goto L_0x0034
        L_0x0170:
            r17 = r4
            r1 = 27
            if (r3 != r1) goto L_0x0185
            com.facebook.drawee.f.e r1 = m28110a(r18)     // Catch:{ all -> 0x0204 }
            r4 = 0
            int r3 = r2.getDimensionPixelSize(r3, r4)     // Catch:{ all -> 0x0204 }
            float r3 = (float) r3     // Catch:{ all -> 0x0204 }
            r1.mo25939c(r3)     // Catch:{ all -> 0x0204 }
            goto L_0x0034
        L_0x0185:
            r1 = 25
            if (r3 != r1) goto L_0x0197
            com.facebook.drawee.f.e r1 = m28110a(r18)     // Catch:{ all -> 0x0204 }
            r4 = 0
            int r3 = r2.getColor(r3, r4)     // Catch:{ all -> 0x0204 }
            r1.mo25938b(r3)     // Catch:{ all -> 0x0204 }
            goto L_0x0034
        L_0x0197:
            r1 = 26
            if (r3 != r1) goto L_0x0034
            com.facebook.drawee.f.e r1 = m28110a(r18)     // Catch:{ all -> 0x0204 }
            r4 = 0
            int r3 = r2.getDimensionPixelSize(r3, r4)     // Catch:{ all -> 0x0204 }
            float r3 = (float) r3     // Catch:{ all -> 0x0204 }
            r1.mo25940d(r3)     // Catch:{ all -> 0x0204 }
        L_0x01a8:
            r16 = r17
        L_0x01aa:
            int r8 = r8 + 1
            r1 = r19
            goto L_0x0023
        L_0x01b0:
            r17 = r16
            r4 = 0
            r2.recycle()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 17
            if (r1 < r2) goto L_0x01e5
            android.content.res.Resources r1 = r19.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            int r1 = r1.getLayoutDirection()
            r2 = 1
            if (r1 != r2) goto L_0x01e6
            if (r9 == 0) goto L_0x01d1
            if (r11 == 0) goto L_0x01d1
            r1 = 1
            goto L_0x01d2
        L_0x01d1:
            r1 = 0
        L_0x01d2:
            if (r12 == 0) goto L_0x01d8
            if (r10 == 0) goto L_0x01d8
            r3 = 1
            goto L_0x01d9
        L_0x01d8:
            r3 = 0
        L_0x01d9:
            if (r13 == 0) goto L_0x01df
            if (r15 == 0) goto L_0x01df
            r7 = 1
            goto L_0x01e0
        L_0x01df:
            r7 = 0
        L_0x01e0:
            if (r6 == 0) goto L_0x0200
            if (r14 == 0) goto L_0x0200
            goto L_0x0201
        L_0x01e5:
            r2 = 1
        L_0x01e6:
            if (r9 == 0) goto L_0x01ec
            if (r10 == 0) goto L_0x01ec
            r1 = 1
            goto L_0x01ed
        L_0x01ec:
            r1 = 0
        L_0x01ed:
            if (r12 == 0) goto L_0x01f3
            if (r11 == 0) goto L_0x01f3
            r3 = 1
            goto L_0x01f4
        L_0x01f3:
            r3 = 0
        L_0x01f4:
            if (r13 == 0) goto L_0x01fa
            if (r14 == 0) goto L_0x01fa
            r7 = 1
            goto L_0x01fb
        L_0x01fa:
            r7 = 0
        L_0x01fb:
            if (r6 == 0) goto L_0x0200
            if (r15 == 0) goto L_0x0200
            goto L_0x0201
        L_0x0200:
            r2 = 0
        L_0x0201:
            r4 = r17
            goto L_0x0220
        L_0x0204:
            r0 = move-exception
            r2.recycle()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 17
            if (r1 < r2) goto L_0x0219
            android.content.res.Resources r1 = r19.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            r1.getLayoutDirection()
        L_0x0219:
            throw r0
        L_0x021a:
            r2 = 1
            r4 = 0
            r1 = 1
            r3 = 1
            r5 = 0
            r7 = 1
        L_0x0220:
            android.graphics.drawable.Drawable r6 = r0.f36096l
            if (r6 == 0) goto L_0x0230
            if (r5 <= 0) goto L_0x0230
            com.facebook.drawee.e.b r6 = new com.facebook.drawee.e.b
            android.graphics.drawable.Drawable r8 = r0.f36096l
            r6.<init>(r8, r5)
            r0.mo25927d(r6)
        L_0x0230:
            if (r4 <= 0) goto L_0x024d
            com.facebook.drawee.f.e r5 = m28110a(r18)
            if (r1 == 0) goto L_0x023a
            float r1 = (float) r4
            goto L_0x023b
        L_0x023a:
            r1 = 0
        L_0x023b:
            if (r3 == 0) goto L_0x023f
            float r3 = (float) r4
            goto L_0x0240
        L_0x023f:
            r3 = 0
        L_0x0240:
            if (r7 == 0) goto L_0x0244
            float r6 = (float) r4
            goto L_0x0245
        L_0x0244:
            r6 = 0
        L_0x0245:
            if (r2 == 0) goto L_0x0249
            float r2 = (float) r4
            goto L_0x024a
        L_0x0249:
            r2 = 0
        L_0x024a:
            r5.mo25933a(r1, r3, r6, r2)
        L_0x024d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.drawee.p940f.C13835c.m28109a(com.facebook.drawee.f.b, android.content.Context, android.util.AttributeSet):com.facebook.drawee.f.b");
    }
}
