package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model;

import com.google.gson.p1076a.C17952c;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.model.DefaultTextExtra */
public final class DefaultTextExtra {
    @C17952c(mo34828a = "en")
    private final String textEn;
    @C17952c(mo34828a = "zh")
    private final String textZh;

    public static /* synthetic */ DefaultTextExtra copy$default(DefaultTextExtra defaultTextExtra, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = defaultTextExtra.textZh;
        }
        if ((i & 2) != 0) {
            str2 = defaultTextExtra.textEn;
        }
        return defaultTextExtra.copy(str, str2);
    }

    public final String component1() {
        return this.textZh;
    }

    public final String component2() {
        return this.textEn;
    }

    public final DefaultTextExtra copy(String str, String str2) {
        return new DefaultTextExtra(str, str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.textEn, (java.lang.Object) r3.textEn) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.DefaultTextExtra
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.im.sdk.chat.model.DefaultTextExtra r3 = (com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.DefaultTextExtra) r3
            java.lang.String r0 = r2.textZh
            java.lang.String r1 = r3.textZh
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.lang.String r0 = r2.textEn
            java.lang.String r3 = r3.textEn
            boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r3)
            if (r3 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r3 = 0
            return r3
        L_0x001f:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.DefaultTextExtra.equals(java.lang.Object):boolean");
    }

    public final String getTextEn() {
        return this.textEn;
    }

    public final String getTextZh() {
        return this.textZh;
    }

    public final int hashCode() {
        String str = this.textZh;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.textEn;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DefaultTextExtra(textZh=");
        sb.append(this.textZh);
        sb.append(", textEn=");
        sb.append(this.textEn);
        sb.append(")");
        return sb.toString();
    }

    public DefaultTextExtra(String str, String str2) {
        this.textZh = str;
        this.textEn = str2;
    }
}
