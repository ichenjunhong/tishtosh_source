package android.support.p030v4.content.p035a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.util.AttributeSet;
import android.util.Xml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: android.support.v4.content.a.a */
public final class C0710a {
    /* renamed from: a */
    public static ColorStateList m2055a(Resources resources, XmlPullParser xmlPullParser, Theme theme) throws XmlPullParserException, IOException {
        int next;
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return m2056a(resources, xmlPullParser, asAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* renamed from: a */
    public static ColorStateList m2056a(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if (name.equals("selector")) {
            return m2057b(resources, xmlPullParser, attributeSet, theme);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(xmlPullParser.getPositionDescription());
        sb.append(": invalid color state list tag ");
        sb.append(name);
        throw new XmlPullParserException(sb.toString());
    }

    /* JADX WARNING: type inference failed for: r8v17, types: [java.lang.Object[], java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.res.ColorStateList m2057b(android.content.res.Resources r17, org.xmlpull.v1.XmlPullParser r18, android.util.AttributeSet r19, android.content.res.Resources.Theme r20) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r0 = r19
            r1 = r20
            int r2 = r18.getDepth()
            r3 = 1
            int r2 = r2 + r3
            r4 = 20
            int[][] r5 = new int[r4][]
            int[] r4 = new int[r4]
            r6 = 0
            r7 = 0
        L_0x0012:
            int r8 = r18.next()
            if (r8 == r3) goto L_0x00fc
            int r9 = r18.getDepth()
            r10 = 3
            if (r9 >= r2) goto L_0x0021
            if (r8 == r10) goto L_0x00fc
        L_0x0021:
            r11 = 2
            if (r8 != r11) goto L_0x00f7
            if (r9 > r2) goto L_0x00f7
            java.lang.String r8 = r18.getName()
            java.lang.String r9 = "item"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x00f7
            int[] r8 = new int[r10]
            r8 = {16843173, 16843551, 2131361856} // fill-array
            if (r1 != 0) goto L_0x0040
            r9 = r17
            android.content.res.TypedArray r8 = r9.obtainAttributes(r0, r8)
            goto L_0x0046
        L_0x0040:
            r9 = r17
            android.content.res.TypedArray r8 = r1.obtainStyledAttributes(r0, r8, r6, r6)
        L_0x0046:
            r10 = -65281(0xffffffffffff00ff, float:NaN)
            int r10 = r8.getColor(r6, r10)
            boolean r12 = r8.hasValue(r3)
            r13 = 1065353216(0x3f800000, float:1.0)
            if (r12 == 0) goto L_0x005a
            float r13 = r8.getFloat(r3, r13)
            goto L_0x0064
        L_0x005a:
            boolean r12 = r8.hasValue(r11)
            if (r12 == 0) goto L_0x0064
            float r13 = r8.getFloat(r11, r13)
        L_0x0064:
            r8.recycle()
            int r8 = r19.getAttributeCount()
            int[] r11 = new int[r8]
            r12 = 0
            r14 = 0
        L_0x006f:
            if (r12 >= r8) goto L_0x0095
            int r15 = r0.getAttributeNameResource(r12)
            r3 = 16843173(0x10101a5, float:2.3694738E-38)
            if (r15 == r3) goto L_0x0091
            r3 = 16843551(0x101031f, float:2.3695797E-38)
            if (r15 == r3) goto L_0x0091
            r3 = 2131361856(0x7f0a0040, float:1.8343476E38)
            if (r15 == r3) goto L_0x0091
            int r3 = r14 + 1
            boolean r16 = r0.getAttributeBooleanValue(r12, r6)
            if (r16 == 0) goto L_0x008d
            goto L_0x008e
        L_0x008d:
            int r15 = -r15
        L_0x008e:
            r11[r14] = r15
            r14 = r3
        L_0x0091:
            int r12 = r12 + 1
            r3 = 1
            goto L_0x006f
        L_0x0095:
            int[] r3 = android.util.StateSet.trimStateSet(r11, r14)
            int r8 = android.graphics.Color.alpha(r10)
            float r8 = (float) r8
            float r8 = r8 * r13
            int r8 = java.lang.Math.round(r8)
            r11 = 16777215(0xffffff, float:2.3509886E-38)
            r10 = r10 & r11
            int r8 = r8 << 24
            r8 = r8 | r10
            boolean r10 = android.support.p030v4.content.p035a.C0719e.f2515a
            if (r10 != 0) goto L_0x00b9
            int r10 = r4.length
            if (r7 > r10) goto L_0x00b3
            goto L_0x00b9
        L_0x00b3:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L_0x00b9:
            int r10 = r7 + 1
            int r11 = r4.length
            if (r10 <= r11) goto L_0x00c8
            int r11 = android.support.p030v4.content.p035a.C0719e.m2072a(r7)
            int[] r11 = new int[r11]
            java.lang.System.arraycopy(r4, r6, r11, r6, r7)
            r4 = r11
        L_0x00c8:
            r4[r7] = r8
            boolean r8 = android.support.p030v4.content.p035a.C0719e.f2515a
            if (r8 != 0) goto L_0x00d8
            int r8 = r5.length
            if (r7 > r8) goto L_0x00d2
            goto L_0x00d8
        L_0x00d2:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L_0x00d8:
            int r8 = r5.length
            if (r10 <= r8) goto L_0x00f1
            java.lang.Class r8 = r5.getClass()
            java.lang.Class r8 = r8.getComponentType()
            int r11 = android.support.p030v4.content.p035a.C0719e.m2072a(r7)
            java.lang.Object r8 = java.lang.reflect.Array.newInstance(r8, r11)
            java.lang.Object[] r8 = (java.lang.Object[]) r8
            java.lang.System.arraycopy(r5, r6, r8, r6, r7)
            r5 = r8
        L_0x00f1:
            r5[r7] = r3
            int[][] r5 = (int[][]) r5
            r7 = r10
            goto L_0x00f9
        L_0x00f7:
            r9 = r17
        L_0x00f9:
            r3 = 1
            goto L_0x0012
        L_0x00fc:
            int[] r0 = new int[r7]
            int[][] r1 = new int[r7][]
            java.lang.System.arraycopy(r4, r6, r0, r6, r7)
            java.lang.System.arraycopy(r5, r6, r1, r6, r7)
            android.content.res.ColorStateList r2 = new android.content.res.ColorStateList
            r2.<init>(r1, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p030v4.content.p035a.C0710a.m2057b(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):android.content.res.ColorStateList");
    }
}
