package com.p683ss.android.ugc.aweme.protection.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.protection.model.CmplRespForEncrypt */
public final class CmplRespForEncrypt extends BaseResponse implements Serializable {
    @C17952c(mo34828a = "cmpl_enc")
    private final String complianceEncrypt;

    public CmplRespForEncrypt() {
        this(null, 1, null);
    }

    public static /* synthetic */ CmplRespForEncrypt copy$default(CmplRespForEncrypt cmplRespForEncrypt, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cmplRespForEncrypt.complianceEncrypt;
        }
        return cmplRespForEncrypt.copy(str);
    }

    public final String component1() {
        return this.complianceEncrypt;
    }

    public final CmplRespForEncrypt copy(String str) {
        return new CmplRespForEncrypt(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r1.complianceEncrypt, (java.lang.Object) ((com.p683ss.android.ugc.aweme.protection.model.CmplRespForEncrypt) r2).complianceEncrypt) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.p683ss.android.ugc.aweme.protection.model.CmplRespForEncrypt
            if (r0 == 0) goto L_0x0013
            com.ss.android.ugc.aweme.protection.model.CmplRespForEncrypt r2 = (com.p683ss.android.ugc.aweme.protection.model.CmplRespForEncrypt) r2
            java.lang.String r0 = r1.complianceEncrypt
            java.lang.String r2 = r2.complianceEncrypt
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.protection.model.CmplRespForEncrypt.equals(java.lang.Object):boolean");
    }

    public final String getComplianceEncrypt() {
        return this.complianceEncrypt;
    }

    public final int hashCode() {
        String str = this.complianceEncrypt;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CmplRespForEncrypt(complianceEncrypt=");
        sb.append(this.complianceEncrypt);
        sb.append(")");
        return sb.toString();
    }

    public CmplRespForEncrypt(String str) {
        this.complianceEncrypt = str;
    }

    public /* synthetic */ CmplRespForEncrypt(String str, int i, C52707g gVar) {
        if ((i & 1) != 0) {
            str = null;
        }
        this(str);
    }
}
