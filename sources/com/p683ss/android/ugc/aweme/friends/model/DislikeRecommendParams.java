package com.p683ss.android.ugc.aweme.friends.model;

import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.friends.model.DislikeRecommendParams */
public final class DislikeRecommendParams {
    public final String secUid;
    public final String uid;

    public static /* synthetic */ DislikeRecommendParams copy$default(DislikeRecommendParams dislikeRecommendParams, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dislikeRecommendParams.uid;
        }
        if ((i & 2) != 0) {
            str2 = dislikeRecommendParams.secUid;
        }
        return dislikeRecommendParams.copy(str, str2);
    }

    public final DislikeRecommendParams copy(String str, String str2) {
        C52711k.m112240b(str, "uid");
        return new DislikeRecommendParams(str, str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.secUid, (java.lang.Object) r3.secUid) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.friends.model.DislikeRecommendParams
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.friends.model.DislikeRecommendParams r3 = (com.p683ss.android.ugc.aweme.friends.model.DislikeRecommendParams) r3
            java.lang.String r0 = r2.uid
            java.lang.String r1 = r3.uid
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.lang.String r0 = r2.secUid
            java.lang.String r3 = r3.secUid
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.friends.model.DislikeRecommendParams.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.uid;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.secUid;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DislikeRecommendParams(uid=");
        sb.append(this.uid);
        sb.append(", secUid=");
        sb.append(this.secUid);
        sb.append(")");
        return sb.toString();
    }

    public DislikeRecommendParams(String str, String str2) {
        C52711k.m112240b(str, "uid");
        this.uid = str;
        this.secUid = str2;
    }
}
