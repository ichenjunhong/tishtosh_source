package android.support.p017a.p018a;

import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.support.p030v4.content.p035a.C0724g;
import android.support.p030v4.graphics.C0804b;
import android.support.p030v4.graphics.C0804b.C0806b;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.InflateException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: android.support.a.a.e */
public final class C0222e {

    /* renamed from: android.support.a.a.e$a */
    static class C0223a implements TypeEvaluator<C0806b[]> {

        /* renamed from: a */
        private C0806b[] f514a;

        C0223a() {
        }

        public final /* synthetic */ Object evaluate(float f, Object obj, Object obj2) {
            C0806b[] bVarArr = (C0806b[]) obj;
            C0806b[] bVarArr2 = (C0806b[]) obj2;
            if (C0804b.m2303a(bVarArr, bVarArr2)) {
                if (this.f514a == null || !C0804b.m2303a(this.f514a, bVarArr)) {
                    this.f514a = C0804b.m2305a(bVarArr);
                }
                for (int i = 0; i < bVarArr.length; i++) {
                    this.f514a[i].mo2603a(bVarArr[i], bVarArr2[i], f);
                }
                return this.f514a;
            }
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
    }

    /* renamed from: a */
    private static boolean m456a(int i) {
        return i >= 28 && i <= 31;
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x01ca  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01c2  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.animation.PropertyValuesHolder[] m457a(android.content.Context r21, android.content.res.Resources r22, android.content.res.Resources.Theme r23, org.xmlpull.v1.XmlPullParser r24, android.util.AttributeSet r25) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r0 = r22
            r1 = r23
            r2 = r24
            r4 = 0
        L_0x0007:
            int r5 = r24.getEventType()
            r6 = 3
            r7 = 0
            if (r5 == r6) goto L_0x01e1
            r8 = 1
            if (r5 == r8) goto L_0x01e1
            r9 = 2
            if (r5 == r9) goto L_0x0019
            r24.next()
            goto L_0x0007
        L_0x0019:
            java.lang.String r5 = r24.getName()
            java.lang.String r10 = "propertyValuesHolder"
            boolean r5 = r5.equals(r10)
            if (r5 == 0) goto L_0x01d8
            int[] r5 = android.support.p017a.p018a.C0215a.f499i
            r10 = r25
            android.content.res.TypedArray r5 = android.support.p030v4.content.p035a.C0724g.m2082a(r0, r1, r10, r5)
            java.lang.String r11 = "propertyName"
            java.lang.String r11 = android.support.p030v4.content.p035a.C0724g.m2084a(r5, r2, r11, r6)
            java.lang.String r12 = "valueType"
            r13 = 4
            int r9 = android.support.p030v4.content.p035a.C0724g.m2081a(r5, r2, r12, r9, r13)
            r14 = r9
            r12 = 0
        L_0x003c:
            int r15 = r24.next()
            if (r15 == r6) goto L_0x0100
            if (r15 == r8) goto L_0x0100
            java.lang.String r15 = r24.getName()
            java.lang.String r8 = "keyframe"
            boolean r8 = r15.equals(r8)
            if (r8 == 0) goto L_0x00fa
            if (r14 != r13) goto L_0x0077
            android.util.AttributeSet r8 = android.util.Xml.asAttributeSet(r24)
            int[] r14 = android.support.p017a.p018a.C0215a.f500j
            android.content.res.TypedArray r8 = android.support.p030v4.content.p035a.C0724g.m2082a(r0, r1, r8, r14)
            java.lang.String r14 = "value"
            android.util.TypedValue r14 = android.support.p030v4.content.p035a.C0724g.m2087b(r8, r2, r14, r7)
            if (r14 == 0) goto L_0x0066
            r15 = 1
            goto L_0x0067
        L_0x0066:
            r15 = 0
        L_0x0067:
            if (r15 == 0) goto L_0x0073
            int r14 = r14.type
            boolean r14 = m456a(r14)
            if (r14 == 0) goto L_0x0073
            r14 = 3
            goto L_0x0074
        L_0x0073:
            r14 = 0
        L_0x0074:
            r8.recycle()
        L_0x0077:
            android.util.AttributeSet r8 = android.util.Xml.asAttributeSet(r24)
            int[] r15 = android.support.p017a.p018a.C0215a.f500j
            android.content.res.TypedArray r8 = android.support.p030v4.content.p035a.C0724g.m2082a(r0, r1, r8, r15)
            java.lang.String r15 = "fraction"
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r3 = android.support.p030v4.content.p035a.C0724g.m2080a(r8, r2, r15, r6, r3)
            java.lang.String r15 = "value"
            android.util.TypedValue r15 = android.support.p030v4.content.p035a.C0724g.m2087b(r8, r2, r15, r7)
            if (r15 == 0) goto L_0x0094
            r18 = 1
            goto L_0x0096
        L_0x0094:
            r18 = 0
        L_0x0096:
            if (r14 != r13) goto L_0x00a6
            if (r18 == 0) goto L_0x00a4
            int r15 = r15.type
            boolean r15 = m456a(r15)
            if (r15 == 0) goto L_0x00a4
            r15 = 3
            goto L_0x00a7
        L_0x00a4:
            r15 = 0
            goto L_0x00a7
        L_0x00a6:
            r15 = r14
        L_0x00a7:
            if (r18 == 0) goto L_0x00c7
            if (r15 == r6) goto L_0x00bc
            switch(r15) {
                case 0: goto L_0x00b0;
                case 1: goto L_0x00bc;
                default: goto L_0x00ae;
            }
        L_0x00ae:
            r3 = 0
            goto L_0x00d2
        L_0x00b0:
            java.lang.String r15 = "value"
            r13 = 0
            float r13 = android.support.p030v4.content.p035a.C0724g.m2080a(r8, r2, r15, r7, r13)
            android.animation.Keyframe r3 = android.animation.Keyframe.ofFloat(r3, r13)
            goto L_0x00d2
        L_0x00bc:
            java.lang.String r13 = "value"
            int r13 = android.support.p030v4.content.p035a.C0724g.m2081a(r8, r2, r13, r7, r7)
            android.animation.Keyframe r3 = android.animation.Keyframe.ofInt(r3, r13)
            goto L_0x00d2
        L_0x00c7:
            if (r15 != 0) goto L_0x00ce
            android.animation.Keyframe r3 = android.animation.Keyframe.ofFloat(r3)
            goto L_0x00d2
        L_0x00ce:
            android.animation.Keyframe r3 = android.animation.Keyframe.ofInt(r3)
        L_0x00d2:
            java.lang.String r13 = "interpolator"
            r15 = 1
            int r13 = android.support.p030v4.content.p035a.C0724g.m2088c(r8, r2, r13, r15, r7)
            if (r13 <= 0) goto L_0x00e5
            r15 = r21
            android.view.animation.Interpolator r13 = android.support.p017a.p018a.C0221d.m446a(r15, r13)
            r3.setInterpolator(r13)
            goto L_0x00e7
        L_0x00e5:
            r15 = r21
        L_0x00e7:
            r8.recycle()
            if (r3 == 0) goto L_0x00f6
            if (r12 != 0) goto L_0x00f3
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
        L_0x00f3:
            r12.add(r3)
        L_0x00f6:
            r24.next()
            goto L_0x00fc
        L_0x00fa:
            r15 = r21
        L_0x00fc:
            r8 = 1
            r13 = 4
            goto L_0x003c
        L_0x0100:
            r15 = r21
            if (r12 == 0) goto L_0x01bf
            int r3 = r12.size()
            if (r3 <= 0) goto L_0x01bf
            java.lang.Object r8 = r12.get(r7)
            android.animation.Keyframe r8 = (android.animation.Keyframe) r8
            int r13 = r3 + -1
            java.lang.Object r13 = r12.get(r13)
            android.animation.Keyframe r13 = (android.animation.Keyframe) r13
            float r18 = r13.getFraction()
            r6 = 1065353216(0x3f800000, float:1.0)
            int r19 = (r18 > r6 ? 1 : (r18 == r6 ? 0 : -1))
            if (r19 >= 0) goto L_0x0139
            r17 = 0
            int r18 = (r18 > r17 ? 1 : (r18 == r17 ? 0 : -1))
            if (r18 >= 0) goto L_0x012c
            r13.setFraction(r6)
            goto L_0x0139
        L_0x012c:
            int r7 = r12.size()
            android.animation.Keyframe r13 = m449a(r13, r6)
            r12.add(r7, r13)
            int r3 = r3 + 1
        L_0x0139:
            float r7 = r8.getFraction()
            r13 = 0
            int r17 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r17 == 0) goto L_0x0154
            int r7 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r7 >= 0) goto L_0x014a
            r8.setFraction(r13)
            goto L_0x0154
        L_0x014a:
            android.animation.Keyframe r7 = m449a(r8, r13)
            r8 = 0
            r12.add(r8, r7)
            int r3 = r3 + 1
        L_0x0154:
            android.animation.Keyframe[] r7 = new android.animation.Keyframe[r3]
            r12.toArray(r7)
            r8 = 0
        L_0x015a:
            if (r8 >= r3) goto L_0x01b0
            r12 = r7[r8]
            float r13 = r12.getFraction()
            r6 = 0
            int r13 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r13 >= 0) goto L_0x01a9
            if (r8 != 0) goto L_0x016d
            r12.setFraction(r6)
            goto L_0x01a9
        L_0x016d:
            int r6 = r3 + -1
            if (r8 != r6) goto L_0x0177
            r13 = 1065353216(0x3f800000, float:1.0)
            r12.setFraction(r13)
            goto L_0x01a9
        L_0x0177:
            r13 = 1065353216(0x3f800000, float:1.0)
            int r12 = r8 + 1
            r13 = r8
        L_0x017c:
            if (r12 >= r6) goto L_0x0192
            r18 = r7[r12]
            float r18 = r18.getFraction()
            r17 = 0
            int r18 = (r18 > r17 ? 1 : (r18 == r17 ? 0 : -1))
            if (r18 >= 0) goto L_0x0194
            int r13 = r12 + 1
            r20 = r13
            r13 = r12
            r12 = r20
            goto L_0x017c
        L_0x0192:
            r17 = 0
        L_0x0194:
            int r6 = r13 + 1
            r6 = r7[r6]
            float r6 = r6.getFraction()
            int r12 = r8 + -1
            r12 = r7[r12]
            float r12 = r12.getFraction()
            float r6 = r6 - r12
            m455a(r7, r6, r8, r13)
            goto L_0x01ab
        L_0x01a9:
            r17 = 0
        L_0x01ab:
            int r8 = r8 + 1
            r6 = 1065353216(0x3f800000, float:1.0)
            goto L_0x015a
        L_0x01b0:
            android.animation.PropertyValuesHolder r3 = android.animation.PropertyValuesHolder.ofKeyframe(r11, r7)
            r6 = 3
            if (r14 != r6) goto L_0x01c0
            android.support.a.a.f r6 = android.support.p017a.p018a.C0224f.m458a()
            r3.setEvaluator(r6)
            goto L_0x01c0
        L_0x01bf:
            r3 = 0
        L_0x01c0:
            if (r3 != 0) goto L_0x01c8
            r6 = 1
            r8 = 0
            android.animation.PropertyValuesHolder r3 = m451a(r5, r9, r8, r6, r11)
        L_0x01c8:
            if (r3 == 0) goto L_0x01d4
            if (r4 != 0) goto L_0x01d1
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L_0x01d1:
            r4.add(r3)
        L_0x01d4:
            r5.recycle()
            goto L_0x01dc
        L_0x01d8:
            r15 = r21
            r10 = r25
        L_0x01dc:
            r24.next()
            goto L_0x0007
        L_0x01e1:
            r8 = 0
            if (r4 == 0) goto L_0x01fa
            int r0 = r4.size()
            android.animation.PropertyValuesHolder[] r3 = new android.animation.PropertyValuesHolder[r0]
        L_0x01ea:
            if (r8 >= r0) goto L_0x01f7
            java.lang.Object r1 = r4.get(r8)
            android.animation.PropertyValuesHolder r1 = (android.animation.PropertyValuesHolder) r1
            r3[r8] = r1
            int r8 = r8 + 1
            goto L_0x01ea
        L_0x01f7:
            r16 = r3
            goto L_0x01fc
        L_0x01fa:
            r16 = 0
        L_0x01fc:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p017a.p018a.C0222e.m457a(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet):android.animation.PropertyValuesHolder[]");
    }

    /* renamed from: a */
    private static void m455a(Keyframe[] keyframeArr, float f, int i, int i2) {
        float f2 = f / ((float) ((i2 - i) + 2));
        while (i <= i2) {
            keyframeArr[i].setFraction(keyframeArr[i - 1].getFraction() + f2);
            i++;
        }
    }

    /* renamed from: a */
    private static Keyframe m449a(Keyframe keyframe, float f) {
        if (keyframe.getType() == Float.TYPE) {
            return Keyframe.ofFloat(f);
        }
        if (keyframe.getType() == Integer.TYPE) {
            return Keyframe.ofInt(f);
        }
        return Keyframe.ofObject(f);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0060  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.animation.Animator m447a(android.content.Context r9, android.content.res.Resources r10, android.content.res.Resources.Theme r11, int r12, float r13) throws android.content.res.Resources.NotFoundException {
        /*
            r13 = 0
            android.content.res.XmlResourceParser r8 = r10.getAnimation(r12)     // Catch:{ XmlPullParserException -> 0x0042, IOException -> 0x0026 }
            r7 = 1065353216(0x3f800000, float:1.0)
            android.util.AttributeSet r4 = android.util.Xml.asAttributeSet(r8)     // Catch:{ XmlPullParserException -> 0x0021, IOException -> 0x001e, all -> 0x001b }
            r5 = 0
            r6 = 0
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r8
            android.animation.Animator r9 = m448a(r0, r1, r2, r3, r4, r5, r6, r7)     // Catch:{ XmlPullParserException -> 0x0021, IOException -> 0x001e, all -> 0x001b }
            if (r8 == 0) goto L_0x001a
            r8.close()
        L_0x001a:
            return r9
        L_0x001b:
            r9 = move-exception
            r13 = r8
            goto L_0x005e
        L_0x001e:
            r9 = move-exception
            r13 = r8
            goto L_0x0027
        L_0x0021:
            r9 = move-exception
            r13 = r8
            goto L_0x0043
        L_0x0024:
            r9 = move-exception
            goto L_0x005e
        L_0x0026:
            r9 = move-exception
        L_0x0027:
            android.content.res.Resources$NotFoundException r10 = new android.content.res.Resources$NotFoundException     // Catch:{ all -> 0x0024 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0024 }
            java.lang.String r0 = "Can't load animation resource ID #0x"
            r11.<init>(r0)     // Catch:{ all -> 0x0024 }
            java.lang.String r12 = java.lang.Integer.toHexString(r12)     // Catch:{ all -> 0x0024 }
            r11.append(r12)     // Catch:{ all -> 0x0024 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x0024 }
            r10.<init>(r11)     // Catch:{ all -> 0x0024 }
            r10.initCause(r9)     // Catch:{ all -> 0x0024 }
            throw r10     // Catch:{ all -> 0x0024 }
        L_0x0042:
            r9 = move-exception
        L_0x0043:
            android.content.res.Resources$NotFoundException r10 = new android.content.res.Resources$NotFoundException     // Catch:{ all -> 0x0024 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0024 }
            java.lang.String r0 = "Can't load animation resource ID #0x"
            r11.<init>(r0)     // Catch:{ all -> 0x0024 }
            java.lang.String r12 = java.lang.Integer.toHexString(r12)     // Catch:{ all -> 0x0024 }
            r11.append(r12)     // Catch:{ all -> 0x0024 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x0024 }
            r10.<init>(r11)     // Catch:{ all -> 0x0024 }
            r10.initCause(r9)     // Catch:{ all -> 0x0024 }
            throw r10     // Catch:{ all -> 0x0024 }
        L_0x005e:
            if (r13 == 0) goto L_0x0063
            r13.close()
        L_0x0063:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p017a.p018a.C0222e.m447a(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, int, float):android.animation.Animator");
    }

    /* renamed from: a */
    private static void m453a(ValueAnimator valueAnimator, TypedArray typedArray, TypedArray typedArray2, float f, XmlPullParser xmlPullParser) {
        boolean z;
        int i;
        boolean z2;
        int i2;
        ValueAnimator valueAnimator2 = valueAnimator;
        TypedArray typedArray3 = typedArray;
        TypedArray typedArray4 = typedArray2;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        long a = (long) C0724g.m2081a(typedArray3, xmlPullParser2, "duration", 1, 300);
        long a2 = (long) C0724g.m2081a(typedArray3, xmlPullParser2, "startOffset", 2, 0);
        int a3 = C0724g.m2081a(typedArray3, xmlPullParser2, "valueType", 7, 4);
        if (C0724g.m2085a(xmlPullParser2, "valueFrom") && C0724g.m2085a(xmlPullParser2, "valueTo")) {
            if (a3 == 4) {
                TypedValue peekValue = typedArray3.peekValue(5);
                if (peekValue != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    i = peekValue.type;
                } else {
                    i = 0;
                }
                TypedValue peekValue2 = typedArray3.peekValue(6);
                if (peekValue2 != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    i2 = peekValue2.type;
                } else {
                    i2 = 0;
                }
                if ((!z || !m456a(i)) && (!z2 || !m456a(i2))) {
                    a3 = 0;
                } else {
                    a3 = 3;
                }
            }
            PropertyValuesHolder a4 = m451a(typedArray3, a3, 5, 6, "");
            if (a4 != null) {
                valueAnimator2.setValues(new PropertyValuesHolder[]{a4});
            }
        }
        valueAnimator2.setDuration(a);
        valueAnimator2.setStartDelay(a2);
        valueAnimator2.setRepeatCount(C0724g.m2081a(typedArray3, xmlPullParser2, "repeatCount", 3, 0));
        valueAnimator2.setRepeatMode(C0724g.m2081a(typedArray3, xmlPullParser2, "repeatMode", 4, 1));
        if (typedArray4 != null) {
            ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator2;
            String a5 = C0724g.m2084a(typedArray4, xmlPullParser2, "pathData", 1);
            if (a5 != null) {
                String a6 = C0724g.m2084a(typedArray4, xmlPullParser2, "propertyXName", 2);
                String a7 = C0724g.m2084a(typedArray4, xmlPullParser2, "propertyYName", 3);
                if (a6 == null && a7 == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(typedArray2.getPositionDescription());
                    sb.append(" propertyXName or propertyYName is needed for PathData");
                    throw new InflateException(sb.toString());
                }
                m454a(C0804b.m2301a(a5), objectAnimator, 0.5f * f, a6, a7);
                return;
            }
            objectAnimator.setPropertyName(C0724g.m2084a(typedArray4, xmlPullParser2, "propertyName", 0));
        }
    }

    /* renamed from: a */
    private static PropertyValuesHolder m451a(TypedArray typedArray, int i, int i2, int i3, String str) {
        boolean z;
        int i4;
        boolean z2;
        int i5;
        boolean z3;
        TypeEvaluator typeEvaluator;
        int i6;
        int i7;
        int i8;
        float f;
        float f2;
        float f3;
        TypedValue peekValue = typedArray.peekValue(i2);
        if (peekValue != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i4 = peekValue.type;
        } else {
            i4 = 0;
        }
        TypedValue peekValue2 = typedArray.peekValue(i3);
        if (peekValue2 != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            i5 = peekValue2.type;
        } else {
            i5 = 0;
        }
        if (i == 4) {
            if ((!z || !m456a(i4)) && (!z2 || !m456a(i5))) {
                i = 0;
            } else {
                i = 3;
            }
        }
        if (i == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        PropertyValuesHolder propertyValuesHolder = null;
        if (i == 2) {
            String string = typedArray.getString(i2);
            String string2 = typedArray.getString(i3);
            C0806b[] b = C0804b.m2306b(string);
            C0806b[] b2 = C0804b.m2306b(string2);
            if (!(b == null && b2 == null)) {
                if (b != null) {
                    C0223a aVar = new C0223a();
                    if (b2 == null) {
                        return PropertyValuesHolder.ofObject(str, aVar, new Object[]{b});
                    } else if (C0804b.m2303a(b, b2)) {
                        propertyValuesHolder = PropertyValuesHolder.ofObject(str, aVar, new Object[]{b, b2});
                    } else {
                        StringBuilder sb = new StringBuilder(" Can't morph from ");
                        sb.append(string);
                        sb.append(" to ");
                        sb.append(string2);
                        throw new InflateException(sb.toString());
                    }
                } else if (b2 != null) {
                    propertyValuesHolder = PropertyValuesHolder.ofObject(str, new C0223a(), new Object[]{b2});
                }
            }
            return propertyValuesHolder;
        }
        if (i == 3) {
            typeEvaluator = C0224f.m458a();
        } else {
            typeEvaluator = null;
        }
        if (z3) {
            if (z) {
                if (i4 == 5) {
                    f2 = typedArray.getDimension(i2, 0.0f);
                } else {
                    f2 = typedArray.getFloat(i2, 0.0f);
                }
                if (z2) {
                    if (i5 == 5) {
                        f3 = typedArray.getDimension(i3, 0.0f);
                    } else {
                        f3 = typedArray.getFloat(i3, 0.0f);
                    }
                    propertyValuesHolder = PropertyValuesHolder.ofFloat(str, new float[]{f2, f3});
                } else {
                    propertyValuesHolder = PropertyValuesHolder.ofFloat(str, new float[]{f2});
                }
            } else {
                if (i5 == 5) {
                    f = typedArray.getDimension(i3, 0.0f);
                } else {
                    f = typedArray.getFloat(i3, 0.0f);
                }
                propertyValuesHolder = PropertyValuesHolder.ofFloat(str, new float[]{f});
            }
        } else if (z) {
            if (i4 == 5) {
                i7 = (int) typedArray.getDimension(i2, 0.0f);
            } else if (m456a(i4)) {
                i7 = typedArray.getColor(i2, 0);
            } else {
                i7 = typedArray.getInt(i2, 0);
            }
            if (z2) {
                if (i5 == 5) {
                    i8 = (int) typedArray.getDimension(i3, 0.0f);
                } else if (m456a(i5)) {
                    i8 = typedArray.getColor(i3, 0);
                } else {
                    i8 = typedArray.getInt(i3, 0);
                }
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, new int[]{i7, i8});
            } else {
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, new int[]{i7});
            }
        } else if (z2) {
            if (i5 == 5) {
                i6 = (int) typedArray.getDimension(i3, 0.0f);
            } else if (m456a(i5)) {
                i6 = typedArray.getColor(i3, 0);
            } else {
                i6 = typedArray.getInt(i3, 0);
            }
            propertyValuesHolder = PropertyValuesHolder.ofInt(str, new int[]{i6});
        }
        PropertyValuesHolder propertyValuesHolder2 = propertyValuesHolder;
        if (propertyValuesHolder2 == null || typeEvaluator == null) {
            return propertyValuesHolder2;
        }
        propertyValuesHolder2.setEvaluator(typeEvaluator);
        return propertyValuesHolder2;
    }

    /* renamed from: a */
    private static void m454a(Path path, ObjectAnimator objectAnimator, float f, String str, String str2) {
        PropertyValuesHolder propertyValuesHolder;
        PropertyValuesHolder propertyValuesHolder2;
        Path path2 = path;
        ObjectAnimator objectAnimator2 = objectAnimator;
        String str3 = str;
        String str4 = str2;
        PathMeasure pathMeasure = new PathMeasure(path2, false);
        ArrayList arrayList = new ArrayList();
        arrayList.add(Float.valueOf(0.0f));
        float f2 = 0.0f;
        do {
            f2 += pathMeasure.getLength();
            arrayList.add(Float.valueOf(f2));
        } while (pathMeasure.nextContour());
        PathMeasure pathMeasure2 = new PathMeasure(path2, false);
        int min = Math.min(100, ((int) (f2 / f)) + 1);
        float[] fArr = new float[min];
        float[] fArr2 = new float[min];
        float[] fArr3 = new float[2];
        float f3 = f2 / ((float) (min - 1));
        int i = 0;
        float f4 = 0.0f;
        int i2 = 0;
        while (true) {
            propertyValuesHolder = null;
            if (i >= min) {
                break;
            }
            pathMeasure2.getPosTan(f4 - ((Float) arrayList.get(i2)).floatValue(), fArr3, null);
            fArr[i] = fArr3[0];
            fArr2[i] = fArr3[1];
            f4 += f3;
            int i3 = i2 + 1;
            if (i3 < arrayList.size() && f4 > ((Float) arrayList.get(i3)).floatValue()) {
                pathMeasure2.nextContour();
                i2 = i3;
            }
            i++;
        }
        if (str3 != null) {
            propertyValuesHolder2 = PropertyValuesHolder.ofFloat(str3, fArr);
        } else {
            propertyValuesHolder2 = null;
        }
        if (str4 != null) {
            propertyValuesHolder = PropertyValuesHolder.ofFloat(str4, fArr2);
        }
        if (propertyValuesHolder2 == null) {
            objectAnimator2.setValues(new PropertyValuesHolder[]{propertyValuesHolder});
        } else if (propertyValuesHolder == null) {
            objectAnimator2.setValues(new PropertyValuesHolder[]{propertyValuesHolder2});
        } else {
            objectAnimator2.setValues(new PropertyValuesHolder[]{propertyValuesHolder2, propertyValuesHolder});
        }
    }

    /* renamed from: a */
    private static ObjectAnimator m450a(Context context, Resources resources, Theme theme, AttributeSet attributeSet, float f, XmlPullParser xmlPullParser) throws NotFoundException {
        ObjectAnimator objectAnimator = new ObjectAnimator();
        m452a(context, resources, theme, attributeSet, objectAnimator, f, xmlPullParser);
        return objectAnimator;
    }

    /* renamed from: a */
    private static ValueAnimator m452a(Context context, Resources resources, Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, float f, XmlPullParser xmlPullParser) throws NotFoundException {
        TypedArray a = C0724g.m2082a(resources, theme, attributeSet, C0215a.f497g);
        TypedArray a2 = C0724g.m2082a(resources, theme, attributeSet, C0215a.f501k);
        if (valueAnimator == null) {
            valueAnimator = new ValueAnimator();
        }
        m453a(valueAnimator, a, a2, f, xmlPullParser);
        int c = C0724g.m2088c(a, xmlPullParser, "interpolator", 0, 0);
        if (c > 0) {
            valueAnimator.setInterpolator(C0221d.m446a(context, c));
        }
        a.recycle();
        if (a2 != null) {
            a2.recycle();
        }
        return valueAnimator;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00bb  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.animation.Animator m448a(android.content.Context r18, android.content.res.Resources r19, android.content.res.Resources.Theme r20, org.xmlpull.v1.XmlPullParser r21, android.util.AttributeSet r22, android.animation.AnimatorSet r23, int r24, float r25) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r8 = r19
            r9 = r20
            r10 = r21
            r11 = r23
            int r12 = r21.getDepth()
            r0 = 0
            r13 = r0
        L_0x000e:
            int r1 = r21.next()
            r2 = 3
            r14 = 0
            if (r1 != r2) goto L_0x001c
            int r2 = r21.getDepth()
            if (r2 <= r12) goto L_0x00e1
        L_0x001c:
            r2 = 1
            if (r1 == r2) goto L_0x00e1
            r3 = 2
            if (r1 != r3) goto L_0x00dd
            java.lang.String r1 = r21.getName()
            java.lang.String r3 = "objectAnimator"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0042
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r22
            r4 = r25
            r5 = r21
            android.animation.ObjectAnimator r0 = m450a(r0, r1, r2, r3, r4, r5)
        L_0x003e:
            r3 = r18
            goto L_0x00b5
        L_0x0042:
            java.lang.String r3 = "animator"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x005c
            r4 = 0
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r22
            r5 = r25
            r6 = r21
            android.animation.ValueAnimator r0 = m452a(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x003e
        L_0x005c:
            java.lang.String r3 = "set"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0094
            android.animation.AnimatorSet r15 = new android.animation.AnimatorSet
            r15.<init>()
            int[] r0 = android.support.p017a.p018a.C0215a.f498h
            r7 = r22
            android.content.res.TypedArray r6 = android.support.p030v4.content.p035a.C0724g.m2082a(r8, r9, r7, r0)
            java.lang.String r0 = "ordering"
            int r16 = android.support.p030v4.content.p035a.C0724g.m2081a(r6, r10, r0, r14, r14)
            r5 = r15
            android.animation.AnimatorSet r5 = (android.animation.AnimatorSet) r5
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r22
            r17 = r6
            r6 = r16
            r7 = r25
            m448a(r0, r1, r2, r3, r4, r5, r6, r7)
            r17.recycle()
            r3 = r18
            r0 = r15
            goto L_0x00b5
        L_0x0094:
            java.lang.String r3 = "propertyValuesHolder"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00c5
            android.util.AttributeSet r1 = android.util.Xml.asAttributeSet(r21)
            r3 = r18
            android.animation.PropertyValuesHolder[] r1 = m457a(r3, r8, r9, r10, r1)
            if (r1 == 0) goto L_0x00b4
            if (r0 == 0) goto L_0x00b4
            boolean r4 = r0 instanceof android.animation.ValueAnimator
            if (r4 == 0) goto L_0x00b4
            r4 = r0
            android.animation.ValueAnimator r4 = (android.animation.ValueAnimator) r4
            r4.setValues(r1)
        L_0x00b4:
            r14 = 1
        L_0x00b5:
            if (r11 == 0) goto L_0x000e
            if (r14 != 0) goto L_0x000e
            if (r13 != 0) goto L_0x00c0
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
        L_0x00c0:
            r13.add(r0)
            goto L_0x000e
        L_0x00c5:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unknown animator name: "
            r1.<init>(r2)
            java.lang.String r2 = r21.getName()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00dd:
            r3 = r18
            goto L_0x000e
        L_0x00e1:
            if (r11 == 0) goto L_0x010a
            if (r13 == 0) goto L_0x010a
            int r1 = r13.size()
            android.animation.Animator[] r1 = new android.animation.Animator[r1]
            java.util.Iterator r2 = r13.iterator()
        L_0x00ef:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0101
            java.lang.Object r3 = r2.next()
            android.animation.Animator r3 = (android.animation.Animator) r3
            int r4 = r14 + 1
            r1[r14] = r3
            r14 = r4
            goto L_0x00ef
        L_0x0101:
            if (r24 != 0) goto L_0x0107
            r11.playTogether(r1)
            goto L_0x010a
        L_0x0107:
            r11.playSequentially(r1)
        L_0x010a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p017a.p018a.C0222e.m448a(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.animation.AnimatorSet, int, float):android.animation.Animator");
    }
}
