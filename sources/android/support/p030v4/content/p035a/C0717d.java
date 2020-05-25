package android.support.p030v4.content.p035a;

import android.graphics.Shader.TileMode;
import java.util.List;

/* renamed from: android.support.v4.content.a.d */
final class C0717d {

    /* renamed from: android.support.v4.content.a.d$a */
    static final class C0718a {

        /* renamed from: a */
        final int[] f2513a;

        /* renamed from: b */
        final float[] f2514b;

        C0718a(int i, int i2) {
            this.f2513a = new int[]{i, i2};
            this.f2514b = new float[]{0.0f, 1.0f};
        }

        C0718a(List<Integer> list, List<Float> list2) {
            int size = list.size();
            this.f2513a = new int[size];
            this.f2514b = new float[size];
            for (int i = 0; i < size; i++) {
                this.f2513a[i] = ((Integer) list.get(i)).intValue();
                this.f2514b[i] = ((Float) list2.get(i)).floatValue();
            }
        }

        C0718a(int i, int i2, int i3) {
            this.f2513a = new int[]{i, i2, i3};
            this.f2514b = new float[]{0.0f, 0.5f, 1.0f};
        }
    }

    /* renamed from: a */
    static TileMode m2070a(int i) {
        switch (i) {
            case 1:
                return TileMode.REPEAT;
            case 2:
                return TileMode.MIRROR;
            default:
                return TileMode.CLAMP;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x007d, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r10.toString());
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static android.support.p030v4.content.p035a.C0717d.C0718a m2071a(android.content.res.Resources r8, org.xmlpull.v1.XmlPullParser r9, android.util.AttributeSet r10, android.content.res.Resources.Theme r11) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            int r0 = r9.getDepth()
            r1 = 1
            int r0 = r0 + r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 20
            r2.<init>(r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
        L_0x0012:
            int r3 = r9.next()
            if (r3 == r1) goto L_0x007e
            int r5 = r9.getDepth()
            if (r5 >= r0) goto L_0x0021
            r6 = 3
            if (r3 == r6) goto L_0x007e
        L_0x0021:
            r6 = 2
            if (r3 != r6) goto L_0x0012
            if (r5 > r0) goto L_0x0012
            java.lang.String r3 = r9.getName()
            java.lang.String r5 = "item"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x0012
            int[] r3 = new int[r6]
            r3 = {16843173, 16844052} // fill-array
            android.content.res.TypedArray r3 = android.support.p030v4.content.p035a.C0724g.m2082a(r8, r11, r10, r3)
            r5 = 0
            boolean r6 = r3.hasValue(r5)
            boolean r7 = r3.hasValue(r1)
            if (r6 == 0) goto L_0x0063
            if (r7 == 0) goto L_0x0063
            int r5 = r3.getColor(r5, r5)
            r6 = 0
            float r6 = r3.getFloat(r1, r6)
            r3.recycle()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r4.add(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r6)
            r2.add(r3)
            goto L_0x0012
        L_0x0063:
            org.xmlpull.v1.XmlPullParserException r8 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r9 = r9.getPositionDescription()
            r10.append(r9)
            java.lang.String r9 = ": <item> tag requires a 'color' attribute and a 'offset' attribute!"
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            r8.<init>(r9)
            throw r8
        L_0x007e:
            int r8 = r4.size()
            if (r8 <= 0) goto L_0x008a
            android.support.v4.content.a.d$a r8 = new android.support.v4.content.a.d$a
            r8.<init>(r4, r2)
            return r8
        L_0x008a:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p030v4.content.p035a.C0717d.m2071a(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):android.support.v4.content.a.d$a");
    }
}
