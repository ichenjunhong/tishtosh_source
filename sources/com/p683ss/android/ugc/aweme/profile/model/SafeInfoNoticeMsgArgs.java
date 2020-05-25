package com.p683ss.android.ugc.aweme.profile.model;

import com.google.gson.p1076a.C17952c;

/* renamed from: com.ss.android.ugc.aweme.profile.model.SafeInfoNoticeMsgArgs */
public final class SafeInfoNoticeMsgArgs {
    @C17952c(mo34828a = "mobile")
    public final String mobile;

    public static /* synthetic */ SafeInfoNoticeMsgArgs copy$default(SafeInfoNoticeMsgArgs safeInfoNoticeMsgArgs, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = safeInfoNoticeMsgArgs.mobile;
        }
        return safeInfoNoticeMsgArgs.copy(str);
    }

    public final SafeInfoNoticeMsgArgs copy(String str) {
        return new SafeInfoNoticeMsgArgs(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r1.mobile, (java.lang.Object) ((com.p683ss.android.ugc.aweme.profile.model.SafeInfoNoticeMsgArgs) r2).mobile) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.p683ss.android.ugc.aweme.profile.model.SafeInfoNoticeMsgArgs
            if (r0 == 0) goto L_0x0013
            com.ss.android.ugc.aweme.profile.model.SafeInfoNoticeMsgArgs r2 = (com.p683ss.android.ugc.aweme.profile.model.SafeInfoNoticeMsgArgs) r2
            java.lang.String r0 = r1.mobile
            java.lang.String r2 = r2.mobile
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.profile.model.SafeInfoNoticeMsgArgs.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.mobile;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SafeInfoNoticeMsgArgs(mobile=");
        sb.append(this.mobile);
        sb.append(")");
        return sb.toString();
    }

    public SafeInfoNoticeMsgArgs(String str) {
        this.mobile = str;
    }
}
