package com.p683ss.android.ugc.aweme.p2377ug.settings;

import android.support.annotation.Keep;
import com.google.gson.p1076a.C17952c;

@Keep
/* renamed from: com.ss.android.ugc.aweme.ug.settings.UgcPermission */
public final class UgcPermission {
    @C17952c(mo34828a = "desc")
    public final String desc;
    @C17952c(mo34828a = "url")
    public final String url;

    public static /* synthetic */ UgcPermission copy$default(UgcPermission ugcPermission, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ugcPermission.desc;
        }
        if ((i & 2) != 0) {
            str2 = ugcPermission.url;
        }
        return ugcPermission.copy(str, str2);
    }

    public final String component1() {
        return this.desc;
    }

    public final String component2() {
        return this.url;
    }

    public final UgcPermission copy(String str, String str2) {
        return new UgcPermission(str, str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.url, (java.lang.Object) r3.url) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.p2377ug.settings.UgcPermission
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.ug.settings.UgcPermission r3 = (com.p683ss.android.ugc.aweme.p2377ug.settings.UgcPermission) r3
            java.lang.String r0 = r2.desc
            java.lang.String r1 = r3.desc
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.lang.String r0 = r2.url
            java.lang.String r3 = r3.url
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p2377ug.settings.UgcPermission.equals(java.lang.Object):boolean");
    }

    public final String getDesc() {
        return this.desc;
    }

    public final String getUrl() {
        return this.url;
    }

    public final int hashCode() {
        String str = this.desc;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.url;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UgcPermission(desc=");
        sb.append(this.desc);
        sb.append(", url=");
        sb.append(this.url);
        sb.append(")");
        return sb.toString();
    }

    public UgcPermission(String str, String str2) {
        this.desc = str;
        this.url = str2;
    }
}
