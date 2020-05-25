package com.p683ss.android.ugc.aweme.profile.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;

/* renamed from: com.ss.android.ugc.aweme.profile.model.SafeInfoNoticeMsgResponse */
public final class SafeInfoNoticeMsgResponse extends BaseResponse {
    @C17952c(mo34828a = "data")
    public final SafeInfoNoticeMsg data;

    public static /* synthetic */ SafeInfoNoticeMsgResponse copy$default(SafeInfoNoticeMsgResponse safeInfoNoticeMsgResponse, SafeInfoNoticeMsg safeInfoNoticeMsg, int i, Object obj) {
        if ((i & 1) != 0) {
            safeInfoNoticeMsg = safeInfoNoticeMsgResponse.data;
        }
        return safeInfoNoticeMsgResponse.copy(safeInfoNoticeMsg);
    }

    public final SafeInfoNoticeMsgResponse copy(SafeInfoNoticeMsg safeInfoNoticeMsg) {
        return new SafeInfoNoticeMsgResponse(safeInfoNoticeMsg);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r1.data, (java.lang.Object) ((com.p683ss.android.ugc.aweme.profile.model.SafeInfoNoticeMsgResponse) r2).data) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.p683ss.android.ugc.aweme.profile.model.SafeInfoNoticeMsgResponse
            if (r0 == 0) goto L_0x0013
            com.ss.android.ugc.aweme.profile.model.SafeInfoNoticeMsgResponse r2 = (com.p683ss.android.ugc.aweme.profile.model.SafeInfoNoticeMsgResponse) r2
            com.ss.android.ugc.aweme.profile.model.SafeInfoNoticeMsg r0 = r1.data
            com.ss.android.ugc.aweme.profile.model.SafeInfoNoticeMsg r2 = r2.data
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.profile.model.SafeInfoNoticeMsgResponse.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        SafeInfoNoticeMsg safeInfoNoticeMsg = this.data;
        if (safeInfoNoticeMsg != null) {
            return safeInfoNoticeMsg.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SafeInfoNoticeMsgResponse(data=");
        sb.append(this.data);
        sb.append(")");
        return sb.toString();
    }

    public SafeInfoNoticeMsgResponse(SafeInfoNoticeMsg safeInfoNoticeMsg) {
        this.data = safeInfoNoticeMsg;
    }
}
