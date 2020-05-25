package com.p683ss.android.ugc.aweme.shortvideo.util;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.DonationTokenBean */
public final class DonationTokenBean implements Serializable {
    @C17952c(mo34828a = "token")
    private final String token;

    public static /* synthetic */ DonationTokenBean copy$default(DonationTokenBean donationTokenBean, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = donationTokenBean.token;
        }
        return donationTokenBean.copy(str);
    }

    public final String component1() {
        return this.token;
    }

    public final DonationTokenBean copy(String str) {
        return new DonationTokenBean(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r1.token, (java.lang.Object) ((com.p683ss.android.ugc.aweme.shortvideo.util.DonationTokenBean) r2).token) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.p683ss.android.ugc.aweme.shortvideo.util.DonationTokenBean
            if (r0 == 0) goto L_0x0013
            com.ss.android.ugc.aweme.shortvideo.util.DonationTokenBean r2 = (com.p683ss.android.ugc.aweme.shortvideo.util.DonationTokenBean) r2
            java.lang.String r0 = r1.token
            java.lang.String r2 = r2.token
            boolean r2 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r2)
            if (r2 == 0) goto L_0x0013
            goto L_0x0015
        L_0x0013:
            r2 = 0
            return r2
        L_0x0015:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.util.DonationTokenBean.equals(java.lang.Object):boolean");
    }

    public final String getToken() {
        return this.token;
    }

    public final int hashCode() {
        String str = this.token;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DonationTokenBean(token=");
        sb.append(this.token);
        sb.append(")");
        return sb.toString();
    }

    public DonationTokenBean(String str) {
        this.token = str;
    }
}
