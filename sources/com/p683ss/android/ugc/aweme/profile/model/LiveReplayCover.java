package com.p683ss.android.ugc.aweme.profile.model;

import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.profile.model.LiveReplayCover */
public final class LiveReplayCover {
    public final String liveCoverUrl;
    public final String liveId;

    public static /* synthetic */ LiveReplayCover copy$default(LiveReplayCover liveReplayCover, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = liveReplayCover.liveId;
        }
        if ((i & 2) != 0) {
            str2 = liveReplayCover.liveCoverUrl;
        }
        return liveReplayCover.copy(str, str2);
    }

    public final LiveReplayCover copy(String str, String str2) {
        C52711k.m112240b(str, "liveId");
        C52711k.m112240b(str2, "liveCoverUrl");
        return new LiveReplayCover(str, str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.liveCoverUrl, (java.lang.Object) r3.liveCoverUrl) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.profile.model.LiveReplayCover
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.profile.model.LiveReplayCover r3 = (com.p683ss.android.ugc.aweme.profile.model.LiveReplayCover) r3
            java.lang.String r0 = r2.liveId
            java.lang.String r1 = r3.liveId
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.lang.String r0 = r2.liveCoverUrl
            java.lang.String r3 = r3.liveCoverUrl
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.profile.model.LiveReplayCover.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.liveId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.liveCoverUrl;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LiveReplayCover(liveId=");
        sb.append(this.liveId);
        sb.append(", liveCoverUrl=");
        sb.append(this.liveCoverUrl);
        sb.append(")");
        return sb.toString();
    }

    public LiveReplayCover(String str, String str2) {
        C52711k.m112240b(str, "liveId");
        C52711k.m112240b(str2, "liveCoverUrl");
        this.liveId = str;
        this.liveCoverUrl = str2;
    }
}
