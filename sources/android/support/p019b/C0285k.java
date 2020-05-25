package android.support.p019b;

/* renamed from: android.support.b.k */
public final class C0285k extends C0255ak {

    /* renamed from: a */
    public int f696a = 80;

    /* renamed from: b */
    private float f697b = 3.0f;

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0092, code lost:
        if (r7 != false) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0096, code lost:
        r7 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a7, code lost:
        if (r7 != false) goto L_0x0096;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0103  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo583a(android.view.ViewGroup r19, android.support.p019b.C0296m r20, android.support.p019b.C0312s r21, android.support.p019b.C0312s r22) {
        /*
            r18 = this;
            r0 = r18
            r1 = r20
            r2 = r21
            r4 = 0
            if (r2 != 0) goto L_0x000d
            if (r22 != 0) goto L_0x000d
            return r4
        L_0x000d:
            android.support.b.m$b r6 = r1.f732n
            if (r6 != 0) goto L_0x0013
            r6 = 0
            goto L_0x0019
        L_0x0013:
            android.support.b.m$b r6 = r1.f732n
            android.graphics.Rect r6 = r6.mo578a(r1)
        L_0x0019:
            r7 = 1
            if (r22 == 0) goto L_0x0039
            r8 = 8
            if (r2 != 0) goto L_0x0021
            goto L_0x0032
        L_0x0021:
            java.util.Map<java.lang.String, java.lang.Object> r9 = r2.f770a
            java.lang.String r10 = "android:visibilityPropagation:visibility"
            java.lang.Object r9 = r9.get(r10)
            java.lang.Integer r9 = (java.lang.Integer) r9
            if (r9 != 0) goto L_0x002e
            goto L_0x0032
        L_0x002e:
            int r8 = r9.intValue()
        L_0x0032:
            if (r8 != 0) goto L_0x0035
            goto L_0x0039
        L_0x0035:
            r2 = r22
            r3 = 1
            goto L_0x003a
        L_0x0039:
            r3 = -1
        L_0x003a:
            r8 = 0
            int r9 = android.support.p019b.C0255ak.m533a(r2, r8)
            int r2 = android.support.p019b.C0255ak.m533a(r2, r7)
            r10 = 2
            int[] r11 = new int[r10]
            r12 = r19
            r12.getLocationOnScreen(r11)
            r13 = r11[r8]
            float r14 = r19.getTranslationX()
            int r14 = java.lang.Math.round(r14)
            int r13 = r13 + r14
            r11 = r11[r7]
            float r14 = r19.getTranslationY()
            int r14 = java.lang.Math.round(r14)
            int r11 = r11 + r14
            int r14 = r19.getWidth()
            int r14 = r14 + r13
            int r15 = r19.getHeight()
            int r15 = r15 + r11
            if (r6 == 0) goto L_0x007b
            int r10 = r6.centerX()
            int r6 = r6.centerY()
            r17 = r10
            r10 = r6
            r6 = r17
            goto L_0x0082
        L_0x007b:
            int r6 = r13 + r14
            int r6 = r6 / r10
            int r16 = r11 + r15
            int r10 = r16 / 2
        L_0x0082:
            int r8 = r0.f696a
            r5 = 8388611(0x800003, float:1.1754948E-38)
            r4 = 3
            if (r8 != r5) goto L_0x0098
            int r8 = android.support.p030v4.view.C1056u.m3055f(r19)
            if (r8 != r7) goto L_0x0091
            goto L_0x0092
        L_0x0091:
            r7 = 0
        L_0x0092:
            if (r7 == 0) goto L_0x0096
        L_0x0094:
            r7 = 5
            goto L_0x00ac
        L_0x0096:
            r7 = 3
            goto L_0x00ac
        L_0x0098:
            int r8 = r0.f696a
            r5 = 8388613(0x800005, float:1.175495E-38)
            if (r8 != r5) goto L_0x00aa
            int r5 = android.support.p030v4.view.C1056u.m3055f(r19)
            if (r5 != r7) goto L_0x00a6
            goto L_0x00a7
        L_0x00a6:
            r7 = 0
        L_0x00a7:
            if (r7 == 0) goto L_0x0094
            goto L_0x0096
        L_0x00aa:
            int r7 = r0.f696a
        L_0x00ac:
            if (r7 == r4) goto L_0x00d6
            r5 = 5
            if (r7 == r5) goto L_0x00cd
            r5 = 48
            if (r7 == r5) goto L_0x00c4
            r5 = 80
            if (r7 == r5) goto L_0x00bb
            r8 = 0
            goto L_0x00de
        L_0x00bb:
            int r2 = r2 - r11
            int r6 = r6 - r9
            int r5 = java.lang.Math.abs(r6)
            int r8 = r2 + r5
            goto L_0x00de
        L_0x00c4:
            int r15 = r15 - r2
            int r6 = r6 - r9
            int r2 = java.lang.Math.abs(r6)
            int r8 = r15 + r2
            goto L_0x00de
        L_0x00cd:
            int r9 = r9 - r13
            int r10 = r10 - r2
            int r2 = java.lang.Math.abs(r10)
            int r8 = r9 + r2
            goto L_0x00de
        L_0x00d6:
            int r14 = r14 - r9
            int r10 = r10 - r2
            int r2 = java.lang.Math.abs(r10)
            int r8 = r14 + r2
        L_0x00de:
            float r2 = (float) r8
            int r5 = r0.f696a
            if (r5 == r4) goto L_0x00f5
            r4 = 5
            if (r5 == r4) goto L_0x00f5
            r4 = 8388611(0x800003, float:1.1754948E-38)
            if (r5 == r4) goto L_0x00f5
            r4 = 8388613(0x800005, float:1.175495E-38)
            if (r5 == r4) goto L_0x00f5
            int r4 = r19.getHeight()
            goto L_0x00f9
        L_0x00f5:
            int r4 = r19.getWidth()
        L_0x00f9:
            float r4 = (float) r4
            float r2 = r2 / r4
            long r4 = r1.f722d
            r6 = 0
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 >= 0) goto L_0x0105
            r4 = 300(0x12c, double:1.48E-321)
        L_0x0105:
            long r6 = (long) r3
            long r4 = r4 * r6
            float r1 = (float) r4
            float r3 = r0.f697b
            float r1 = r1 / r3
            float r1 = r1 * r2
            int r1 = java.lang.Math.round(r1)
            long r1 = (long) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p019b.C0285k.mo583a(android.view.ViewGroup, android.support.b.m, android.support.b.s, android.support.b.s):long");
    }
}
