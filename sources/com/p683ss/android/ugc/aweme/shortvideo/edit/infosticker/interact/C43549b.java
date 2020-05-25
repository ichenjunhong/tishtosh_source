package com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact;

import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b */
public final class C43549b {

    /* renamed from: a */
    public float f110201a;

    /* renamed from: b */
    public float f110202b;

    /* renamed from: c */
    public float f110203c;

    /* renamed from: d */
    public float f110204d;

    public C43549b() {
        this(0.0f, 0.0f, 0.0f, 0.0f, 15, null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (java.lang.Float.compare(r2.f110204d, r3.f110204d) == 0) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0033
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.C43549b
            if (r0 == 0) goto L_0x0031
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b r3 = (com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.C43549b) r3
            float r0 = r2.f110201a
            float r1 = r3.f110201a
            int r0 = java.lang.Float.compare(r0, r1)
            if (r0 != 0) goto L_0x0031
            float r0 = r2.f110202b
            float r1 = r3.f110202b
            int r0 = java.lang.Float.compare(r0, r1)
            if (r0 != 0) goto L_0x0031
            float r0 = r2.f110203c
            float r1 = r3.f110203c
            int r0 = java.lang.Float.compare(r0, r1)
            if (r0 != 0) goto L_0x0031
            float r0 = r2.f110204d
            float r3 = r3.f110204d
            int r3 = java.lang.Float.compare(r0, r3)
            if (r3 != 0) goto L_0x0031
            goto L_0x0033
        L_0x0031:
            r3 = 0
            return r3
        L_0x0033:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.C43549b.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return (((((Float.floatToIntBits(this.f110201a) * 31) + Float.floatToIntBits(this.f110202b)) * 31) + Float.floatToIntBits(this.f110203c)) * 31) + Float.floatToIntBits(this.f110204d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EditStickerLocationData(rotate=");
        sb.append(this.f110201a);
        sb.append(", scale=");
        sb.append(this.f110202b);
        sb.append(", xLocation=");
        sb.append(this.f110203c);
        sb.append(", yLocation=");
        sb.append(this.f110204d);
        sb.append(")");
        return sb.toString();
    }

    public C43549b(float f, float f2, float f3, float f4) {
        this.f110201a = f;
        this.f110202b = f2;
        this.f110203c = f3;
        this.f110204d = f4;
    }

    private /* synthetic */ C43549b(float f, float f2, float f3, float f4, int i, C52707g gVar) {
        this(0.0f, 0.0f, 0.0f, 0.0f);
    }
}
