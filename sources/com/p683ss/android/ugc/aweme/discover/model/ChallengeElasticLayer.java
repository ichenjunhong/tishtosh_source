package com.p683ss.android.ugc.aweme.discover.model;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.discover.model.ChallengeElasticLayer */
public final class ChallengeElasticLayer implements Serializable {
    @C17952c(mo34828a = "desc")
    private final String desc;
    @C17952c(mo34828a = "tag")
    private final String tag;

    public ChallengeElasticLayer() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ ChallengeElasticLayer copy$default(ChallengeElasticLayer challengeElasticLayer, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = challengeElasticLayer.tag;
        }
        if ((i & 2) != 0) {
            str2 = challengeElasticLayer.desc;
        }
        return challengeElasticLayer.copy(str, str2);
    }

    public final String component1() {
        return this.tag;
    }

    public final String component2() {
        return this.desc;
    }

    public final ChallengeElasticLayer copy(String str, String str2) {
        return new ChallengeElasticLayer(str, str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.desc, (java.lang.Object) r3.desc) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.discover.model.ChallengeElasticLayer
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.discover.model.ChallengeElasticLayer r3 = (com.p683ss.android.ugc.aweme.discover.model.ChallengeElasticLayer) r3
            java.lang.String r0 = r2.tag
            java.lang.String r1 = r3.tag
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.lang.String r0 = r2.desc
            java.lang.String r3 = r3.desc
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.discover.model.ChallengeElasticLayer.equals(java.lang.Object):boolean");
    }

    public final String getDesc() {
        return this.desc;
    }

    public final String getTag() {
        return this.tag;
    }

    public final int hashCode() {
        String str = this.tag;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.desc;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChallengeElasticLayer(tag=");
        sb.append(this.tag);
        sb.append(", desc=");
        sb.append(this.desc);
        sb.append(")");
        return sb.toString();
    }

    public ChallengeElasticLayer(String str, String str2) {
        this.tag = str;
        this.desc = str2;
    }

    public /* synthetic */ ChallengeElasticLayer(String str, String str2, int i, C52707g gVar) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        this(str, str2);
    }
}
