package com.p683ss.android.ugc.aweme.shortvideo.util;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.DonationTokenResponse */
public final class DonationTokenResponse extends BaseResponse implements Serializable {
    @C17952c(mo34828a = "data")
    private final DonationTokenBean data;

    public static /* synthetic */ DonationTokenResponse copy$default(DonationTokenResponse donationTokenResponse, DonationTokenBean donationTokenBean, int i, Object obj) {
        if ((i & 1) != 0) {
            donationTokenBean = donationTokenResponse.data;
        }
        return donationTokenResponse.copy(donationTokenBean);
    }

    public final DonationTokenBean component1() {
        return this.data;
    }

    public final DonationTokenResponse copy(DonationTokenBean donationTokenBean) {
        return new DonationTokenResponse(donationTokenBean);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r1.data, (java.lang.Object) ((com.p683ss.android.ugc.aweme.shortvideo.util.DonationTokenResponse) r2).data) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.p683ss.android.ugc.aweme.shortvideo.util.DonationTokenResponse
            if (r0 == 0) goto L_0x0013
            com.ss.android.ugc.aweme.shortvideo.util.DonationTokenResponse r2 = (com.p683ss.android.ugc.aweme.shortvideo.util.DonationTokenResponse) r2
            com.ss.android.ugc.aweme.shortvideo.util.DonationTokenBean r0 = r1.data
            com.ss.android.ugc.aweme.shortvideo.util.DonationTokenBean r2 = r2.data
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.util.DonationTokenResponse.equals(java.lang.Object):boolean");
    }

    public final DonationTokenBean getData() {
        return this.data;
    }

    public final int hashCode() {
        DonationTokenBean donationTokenBean = this.data;
        if (donationTokenBean != null) {
            return donationTokenBean.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DonationTokenResponse(data=");
        sb.append(this.data);
        sb.append(")");
        return sb.toString();
    }

    public DonationTokenResponse(DonationTokenBean donationTokenBean) {
        this.data = donationTokenBean;
    }
}
