package com.p683ss.android.ugc.aweme.beauty;

import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.beauty.BeautifyTag */
public final class BeautifyTag {
    private final String tag;
    private final float value;

    public BeautifyTag() {
        this(null, 0.0f, 3, null);
    }

    public static /* synthetic */ BeautifyTag copy$default(BeautifyTag beautifyTag, String str, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            str = beautifyTag.tag;
        }
        if ((i & 2) != 0) {
            f = beautifyTag.value;
        }
        return beautifyTag.copy(str, f);
    }

    public final String component1() {
        return this.tag;
    }

    public final float component2() {
        return this.value;
    }

    public final BeautifyTag copy(String str, float f) {
        C52711k.m112240b(str, "tag");
        return new BeautifyTag(str, f);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (java.lang.Float.compare(r2.value, r3.value) == 0) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.beauty.BeautifyTag
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.beauty.BeautifyTag r3 = (com.p683ss.android.ugc.aweme.beauty.BeautifyTag) r3
            java.lang.String r0 = r2.tag
            java.lang.String r1 = r3.tag
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x001d
            float r0 = r2.value
            float r3 = r3.value
            int r3 = java.lang.Float.compare(r0, r3)
            if (r3 != 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r3 = 0
            return r3
        L_0x001f:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.beauty.BeautifyTag.equals(java.lang.Object):boolean");
    }

    public final String getTag() {
        return this.tag;
    }

    public final float getValue() {
        return this.value;
    }

    public final int hashCode() {
        String str = this.tag;
        return ((str != null ? str.hashCode() : 0) * 31) + Float.floatToIntBits(this.value);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BeautifyTag(tag=");
        sb.append(this.tag);
        sb.append(", value=");
        sb.append(this.value);
        sb.append(")");
        return sb.toString();
    }

    public BeautifyTag(String str, float f) {
        C52711k.m112240b(str, "tag");
        this.tag = str;
        this.value = f;
    }

    public /* synthetic */ BeautifyTag(String str, float f, int i, C52707g gVar) {
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        this(str, f);
    }
}
