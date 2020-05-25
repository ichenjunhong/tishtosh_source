package com.p683ss.android.ugc.aweme.feedback.runtime.behavior.strategy;

import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.AwemeToolFeedbackECode */
public final class AwemeToolFeedbackECode {
    private final String code;
    private final String stage;

    public AwemeToolFeedbackECode() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ AwemeToolFeedbackECode copy$default(AwemeToolFeedbackECode awemeToolFeedbackECode, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = awemeToolFeedbackECode.code;
        }
        if ((i & 2) != 0) {
            str2 = awemeToolFeedbackECode.stage;
        }
        return awemeToolFeedbackECode.copy(str, str2);
    }

    public final String component1() {
        return this.code;
    }

    public final String component2() {
        return this.stage;
    }

    public final AwemeToolFeedbackECode copy(String str, String str2) {
        C52711k.m112240b(str, "code");
        return new AwemeToolFeedbackECode(str, str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.stage, (java.lang.Object) r3.stage) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.feedback.runtime.behavior.strategy.AwemeToolFeedbackECode
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.AwemeToolFeedbackECode r3 = (com.p683ss.android.ugc.aweme.feedback.runtime.behavior.strategy.AwemeToolFeedbackECode) r3
            java.lang.String r0 = r2.code
            java.lang.String r1 = r3.code
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.lang.String r0 = r2.stage
            java.lang.String r3 = r3.stage
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feedback.runtime.behavior.strategy.AwemeToolFeedbackECode.equals(java.lang.Object):boolean");
    }

    public final String getCode() {
        return this.code;
    }

    public final String getStage() {
        return this.stage;
    }

    public final int hashCode() {
        String str = this.code;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.stage;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AwemeToolFeedbackECode(code=");
        sb.append(this.code);
        sb.append(", stage=");
        sb.append(this.stage);
        sb.append(")");
        return sb.toString();
    }

    public AwemeToolFeedbackECode(String str, String str2) {
        C52711k.m112240b(str, "code");
        this.code = str;
        this.stage = str2;
    }

    public /* synthetic */ AwemeToolFeedbackECode(String str, String str2, int i, C52707g gVar) {
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        this(str, str2);
    }
}
