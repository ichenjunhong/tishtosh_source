package android.support.p030v4.content.p035a;

import android.content.res.ColorStateList;
import android.graphics.Shader;

/* renamed from: android.support.v4.content.a.b */
public final class C0711b {

    /* renamed from: a */
    public final Shader f2500a;

    /* renamed from: b */
    public int f2501b;

    /* renamed from: c */
    private final ColorStateList f2502c;

    /* renamed from: a */
    public final boolean mo2377a() {
        if (this.f2500a != null) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo2380c() {
        if (mo2377a() || this.f2501b != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo2379b() {
        if (this.f2500a != null || this.f2502c == null || !this.f2502c.isStateful()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    static C0711b m2058a(int i) {
        return new C0711b(null, null, i);
    }

    /* renamed from: a */
    public final boolean mo2378a(int[] iArr) {
        if (mo2379b()) {
            int colorForState = this.f2502c.getColorForState(iArr, this.f2502c.getDefaultColor());
            if (colorForState != this.f2501b) {
                this.f2501b = colorForState;
                return true;
            }
        }
        return false;
    }

    private C0711b(Shader shader, ColorStateList colorStateList, int i) {
        this.f2500a = shader;
        this.f2502c = colorStateList;
        this.f2501b = i;
    }

    /* JADX WARNING: type inference failed for: r1v5, types: [android.graphics.Shader] */
    /* JADX WARNING: type inference failed for: r17v0, types: [android.graphics.RadialGradient] */
    /* JADX WARNING: type inference failed for: r1v10, types: [android.graphics.SweepGradient] */
    /* JADX WARNING: type inference failed for: r12v4, types: [android.graphics.LinearGradient] */
    /* JADX WARNING: type inference failed for: r17v2, types: [android.graphics.RadialGradient] */
    /* JADX WARNING: type inference failed for: r1v14 */
    /* JADX WARNING: type inference failed for: r12v5, types: [android.graphics.LinearGradient] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r17v2, types: [android.graphics.RadialGradient]
      assigns: [android.graphics.RadialGradient, android.graphics.LinearGradient]
      uses: [android.graphics.RadialGradient, android.graphics.Shader, android.graphics.LinearGradient]
      mth insns count: 140
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
    /* JADX WARNING: Unknown variable types count: 4 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.support.p030v4.content.p035a.C0711b m2059a(android.content.res.Resources r27, int r28, android.content.res.Resources.Theme r29) {
        /*
            r0 = r27
            r1 = r29
            android.content.res.XmlResourceParser r3 = r27.getXml(r28)     // Catch:{ Exception -> 0x017f }
            android.util.AttributeSet r4 = android.util.Xml.asAttributeSet(r3)     // Catch:{ Exception -> 0x017f }
        L_0x000c:
            int r5 = r3.next()     // Catch:{ Exception -> 0x017f }
            r6 = 1
            r7 = 2
            if (r5 == r7) goto L_0x0016
            if (r5 != r6) goto L_0x000c
        L_0x0016:
            if (r5 != r7) goto L_0x0177
            java.lang.String r5 = r3.getName()     // Catch:{ Exception -> 0x017f }
            r8 = -1
            int r9 = r5.hashCode()     // Catch:{ Exception -> 0x017f }
            r10 = 89650992(0x557f730, float:1.01546526E-35)
            r11 = 0
            if (r9 == r10) goto L_0x0037
            r10 = 1191572447(0x4705f3df, float:34291.87)
            if (r9 == r10) goto L_0x002d
            goto L_0x0040
        L_0x002d:
            java.lang.String r9 = "selector"
            boolean r9 = r5.equals(r9)     // Catch:{ Exception -> 0x017f }
            if (r9 == 0) goto L_0x0040
            r8 = 0
            goto L_0x0040
        L_0x0037:
            java.lang.String r9 = "gradient"
            boolean r9 = r5.equals(r9)     // Catch:{ Exception -> 0x017f }
            if (r9 == 0) goto L_0x0040
            r8 = 1
        L_0x0040:
            switch(r8) {
                case 0: goto L_0x014a;
                case 1: goto L_0x0047;
                default: goto L_0x0043;
            }     // Catch:{ Exception -> 0x017f }
        L_0x0043:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x017f }
            goto L_0x015b
        L_0x0047:
            java.lang.String r5 = r3.getName()     // Catch:{ Exception -> 0x017f }
            java.lang.String r8 = "gradient"
            boolean r8 = r5.equals(r8)     // Catch:{ Exception -> 0x017f }
            if (r8 == 0) goto L_0x012c
            r5 = 12
            int[] r5 = new int[r5]     // Catch:{ Exception -> 0x017f }
            r5 = {16843165, 16843166, 16843169, 16843170, 16843171, 16843172, 16843265, 16843275, 16844048, 16844049, 16844050, 16844051} // fill-array     // Catch:{ Exception -> 0x017f }
            android.content.res.TypedArray r5 = android.support.p030v4.content.p035a.C0724g.m2082a(r0, r1, r4, r5)     // Catch:{ Exception -> 0x017f }
            java.lang.String r8 = "startX"
            r9 = 8
            r10 = 0
            float r13 = android.support.p030v4.content.p035a.C0724g.m2080a(r5, r3, r8, r9, r10)     // Catch:{ Exception -> 0x017f }
            java.lang.String r8 = "startY"
            r9 = 9
            float r14 = android.support.p030v4.content.p035a.C0724g.m2080a(r5, r3, r8, r9, r10)     // Catch:{ Exception -> 0x017f }
            java.lang.String r8 = "endX"
            r9 = 10
            float r15 = android.support.p030v4.content.p035a.C0724g.m2080a(r5, r3, r8, r9, r10)     // Catch:{ Exception -> 0x017f }
            java.lang.String r8 = "endY"
            r9 = 11
            float r16 = android.support.p030v4.content.p035a.C0724g.m2080a(r5, r3, r8, r9, r10)     // Catch:{ Exception -> 0x017f }
            java.lang.String r8 = "centerX"
            r9 = 3
            float r8 = android.support.p030v4.content.p035a.C0724g.m2080a(r5, r3, r8, r9, r10)     // Catch:{ Exception -> 0x017f }
            java.lang.String r9 = "centerY"
            r12 = 4
            float r9 = android.support.p030v4.content.p035a.C0724g.m2080a(r5, r3, r9, r12, r10)     // Catch:{ Exception -> 0x017f }
            java.lang.String r12 = "type"
            int r7 = android.support.p030v4.content.p035a.C0724g.m2081a(r5, r3, r12, r7, r11)     // Catch:{ Exception -> 0x017f }
            java.lang.String r12 = "startColor"
            int r12 = android.support.p030v4.content.p035a.C0724g.m2086b(r5, r3, r12, r11, r11)     // Catch:{ Exception -> 0x017f }
            java.lang.String r2 = "centerColor"
            boolean r2 = android.support.p030v4.content.p035a.C0724g.m2085a(r3, r2)     // Catch:{ Exception -> 0x017f }
            java.lang.String r10 = "centerColor"
            r6 = 7
            int r6 = android.support.p030v4.content.p035a.C0724g.m2086b(r5, r3, r10, r6, r11)     // Catch:{ Exception -> 0x017f }
            java.lang.String r10 = "endColor"
            r24 = r15
            r15 = 1
            int r10 = android.support.p030v4.content.p035a.C0724g.m2086b(r5, r3, r10, r15, r11)     // Catch:{ Exception -> 0x017f }
            java.lang.String r15 = "tileMode"
            r25 = r14
            r14 = 6
            int r14 = android.support.p030v4.content.p035a.C0724g.m2081a(r5, r3, r15, r14, r11)     // Catch:{ Exception -> 0x017f }
            java.lang.String r15 = "gradientRadius"
            r11 = 5
            r26 = r13
            r13 = 0
            float r20 = android.support.p030v4.content.p035a.C0724g.m2080a(r5, r3, r15, r11, r13)     // Catch:{ Exception -> 0x017f }
            r5.recycle()     // Catch:{ Exception -> 0x017f }
            android.support.v4.content.a.d$a r0 = android.support.p030v4.content.p035a.C0717d.m2071a(r0, r3, r4, r1)     // Catch:{ Exception -> 0x017f }
            if (r0 == 0) goto L_0x00cc
            goto L_0x00d9
        L_0x00cc:
            if (r2 == 0) goto L_0x00d4
            android.support.v4.content.a.d$a r0 = new android.support.v4.content.a.d$a     // Catch:{ Exception -> 0x017f }
            r0.<init>(r12, r6, r10)     // Catch:{ Exception -> 0x017f }
            goto L_0x00d9
        L_0x00d4:
            android.support.v4.content.a.d$a r0 = new android.support.v4.content.a.d$a     // Catch:{ Exception -> 0x017f }
            r0.<init>(r12, r10)     // Catch:{ Exception -> 0x017f }
        L_0x00d9:
            switch(r7) {
                case 1: goto L_0x00e9;
                case 2: goto L_0x00df;
                default: goto L_0x00dc;
            }     // Catch:{ Exception -> 0x017f }
        L_0x00dc:
            android.graphics.LinearGradient r1 = new android.graphics.LinearGradient     // Catch:{ Exception -> 0x017f }
            goto L_0x010e
        L_0x00df:
            android.graphics.SweepGradient r1 = new android.graphics.SweepGradient     // Catch:{ Exception -> 0x017f }
            int[] r2 = r0.f2513a     // Catch:{ Exception -> 0x017f }
            float[] r0 = r0.f2514b     // Catch:{ Exception -> 0x017f }
            r1.<init>(r8, r9, r2, r0)     // Catch:{ Exception -> 0x017f }
            goto L_0x0124
        L_0x00e9:
            r1 = 0
            int r1 = (r20 > r1 ? 1 : (r20 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x0106
            android.graphics.RadialGradient r1 = new android.graphics.RadialGradient     // Catch:{ Exception -> 0x017f }
            int[] r2 = r0.f2513a     // Catch:{ Exception -> 0x017f }
            float[] r0 = r0.f2514b     // Catch:{ Exception -> 0x017f }
            android.graphics.Shader$TileMode r23 = android.support.p030v4.content.p035a.C0717d.m2070a(r14)     // Catch:{ Exception -> 0x017f }
            r17 = r1
            r18 = r8
            r19 = r9
            r21 = r2
            r22 = r0
            r17.<init>(r18, r19, r20, r21, r22, r23)     // Catch:{ Exception -> 0x017f }
            goto L_0x0124
        L_0x0106:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x017f }
            java.lang.String r1 = "<gradient> tag requires 'gradientRadius' attribute with radial type"
            r0.<init>(r1)     // Catch:{ Exception -> 0x017f }
            throw r0     // Catch:{ Exception -> 0x017f }
        L_0x010e:
            int[] r2 = r0.f2513a     // Catch:{ Exception -> 0x017f }
            float[] r0 = r0.f2514b     // Catch:{ Exception -> 0x017f }
            android.graphics.Shader$TileMode r19 = android.support.p030v4.content.p035a.C0717d.m2070a(r14)     // Catch:{ Exception -> 0x017f }
            r12 = r1
            r13 = r26
            r14 = r25
            r15 = r24
            r17 = r2
            r18 = r0
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ Exception -> 0x017f }
        L_0x0124:
            android.support.v4.content.a.b r0 = new android.support.v4.content.a.b     // Catch:{ Exception -> 0x017f }
            r2 = 0
            r3 = 0
            r0.<init>(r1, r3, r2)     // Catch:{ Exception -> 0x0159 }
            return r0
        L_0x012c:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x017f }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x017f }
            r1.<init>()     // Catch:{ Exception -> 0x017f }
            java.lang.String r2 = r3.getPositionDescription()     // Catch:{ Exception -> 0x017f }
            r1.append(r2)     // Catch:{ Exception -> 0x017f }
            java.lang.String r2 = ": invalid gradient color tag "
            r1.append(r2)     // Catch:{ Exception -> 0x017f }
            r1.append(r5)     // Catch:{ Exception -> 0x017f }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x017f }
            r0.<init>(r1)     // Catch:{ Exception -> 0x017f }
            throw r0     // Catch:{ Exception -> 0x017f }
        L_0x014a:
            android.content.res.ColorStateList r0 = android.support.p030v4.content.p035a.C0710a.m2056a(r0, r3, r4, r1)     // Catch:{ Exception -> 0x017f }
            android.support.v4.content.a.b r1 = new android.support.v4.content.a.b     // Catch:{ Exception -> 0x017f }
            int r2 = r0.getDefaultColor()     // Catch:{ Exception -> 0x017f }
            r3 = 0
            r1.<init>(r3, r0, r2)     // Catch:{ Exception -> 0x0159 }
            return r1
        L_0x0159:
            r0 = r3
            goto L_0x0180
        L_0x015b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x017f }
            r1.<init>()     // Catch:{ Exception -> 0x017f }
            java.lang.String r2 = r3.getPositionDescription()     // Catch:{ Exception -> 0x017f }
            r1.append(r2)     // Catch:{ Exception -> 0x017f }
            java.lang.String r2 = ": unsupported complex color tag "
            r1.append(r2)     // Catch:{ Exception -> 0x017f }
            r1.append(r5)     // Catch:{ Exception -> 0x017f }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x017f }
            r0.<init>(r1)     // Catch:{ Exception -> 0x017f }
            throw r0     // Catch:{ Exception -> 0x017f }
        L_0x0177:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x017f }
            java.lang.String r1 = "No start tag found"
            r0.<init>(r1)     // Catch:{ Exception -> 0x017f }
            throw r0     // Catch:{ Exception -> 0x017f }
        L_0x017f:
            r0 = 0
        L_0x0180:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p030v4.content.p035a.C0711b.m2059a(android.content.res.Resources, int, android.content.res.Resources$Theme):android.support.v4.content.a.b");
    }
}
