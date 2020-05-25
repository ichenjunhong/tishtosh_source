package com.p683ss.android.ugc.aweme.framework.services;

import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.framework.services.StickerTagChangeData */
public final class StickerTagChangeData {
    private final String panel;
    private final String tabKey;
    private final String tabName;

    public static /* synthetic */ StickerTagChangeData copy$default(StickerTagChangeData stickerTagChangeData, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = stickerTagChangeData.panel;
        }
        if ((i & 2) != 0) {
            str2 = stickerTagChangeData.tabName;
        }
        if ((i & 4) != 0) {
            str3 = stickerTagChangeData.tabKey;
        }
        return stickerTagChangeData.copy(str, str2, str3);
    }

    public final String component1() {
        return this.panel;
    }

    public final String component2() {
        return this.tabName;
    }

    public final String component3() {
        return this.tabKey;
    }

    public final StickerTagChangeData copy(String str, String str2, String str3) {
        C52711k.m112240b(str, "panel");
        C52711k.m112240b(str2, "tabName");
        C52711k.m112240b(str3, "tabKey");
        return new StickerTagChangeData(str, str2, str3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.tabKey, (java.lang.Object) r3.tabKey) != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0029
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.framework.services.StickerTagChangeData
            if (r0 == 0) goto L_0x0027
            com.ss.android.ugc.aweme.framework.services.StickerTagChangeData r3 = (com.p683ss.android.ugc.aweme.framework.services.StickerTagChangeData) r3
            java.lang.String r0 = r2.panel
            java.lang.String r1 = r3.panel
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = r2.tabName
            java.lang.String r1 = r3.tabName
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = r2.tabKey
            java.lang.String r3 = r3.tabKey
            boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r3)
            if (r3 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r3 = 0
            return r3
        L_0x0029:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.framework.services.StickerTagChangeData.equals(java.lang.Object):boolean");
    }

    public final String getPanel() {
        return this.panel;
    }

    public final String getTabKey() {
        return this.tabKey;
    }

    public final String getTabName() {
        return this.tabName;
    }

    public final int hashCode() {
        String str = this.panel;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.tabName;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.tabKey;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickerTagChangeData(panel=");
        sb.append(this.panel);
        sb.append(", tabName=");
        sb.append(this.tabName);
        sb.append(", tabKey=");
        sb.append(this.tabKey);
        sb.append(")");
        return sb.toString();
    }

    public StickerTagChangeData(String str, String str2, String str3) {
        C52711k.m112240b(str, "panel");
        C52711k.m112240b(str2, "tabName");
        C52711k.m112240b(str3, "tabKey");
        this.panel = str;
        this.tabName = str2;
        this.tabKey = str3;
    }
}
