package com.p683ss.android.ugc.aweme.protection.model;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.protection.model.CopyWritingInfo */
public final class CopyWritingInfo implements Serializable {
    @C17952c(mo34828a = "check")
    private final String checkSettings;
    @C17952c(mo34828a = "confirm")
    private final String confirm;
    @C17952c(mo34828a = "policy_link_list")
    private final List<String> policyLinkList;
    @C17952c(mo34828a = "policy_list")
    private final List<String> policyList;
    @C17952c(mo34828a = "subtext")
    private final String subtext;
    @C17952c(mo34828a = "title")
    private final String title;

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<java.lang.String>, for r7v0, types: [java.util.List] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<java.lang.String>, for r8v0, types: [java.util.List] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.p683ss.android.ugc.aweme.protection.model.CopyWritingInfo copy$default(com.p683ss.android.ugc.aweme.protection.model.CopyWritingInfo r4, java.lang.String r5, java.lang.String r6, java.util.List<java.lang.String> r7, java.util.List<java.lang.String> r8, java.lang.String r9, java.lang.String r10, int r11, java.lang.Object r12) {
        /*
            r12 = r11 & 1
            if (r12 == 0) goto L_0x0006
            java.lang.String r5 = r4.title
        L_0x0006:
            r12 = r11 & 2
            if (r12 == 0) goto L_0x000c
            java.lang.String r6 = r4.subtext
        L_0x000c:
            r12 = r6
            r6 = r11 & 4
            if (r6 == 0) goto L_0x0013
            java.util.List<java.lang.String> r7 = r4.policyList
        L_0x0013:
            r0 = r7
            r6 = r11 & 8
            if (r6 == 0) goto L_0x001a
            java.util.List<java.lang.String> r8 = r4.policyLinkList
        L_0x001a:
            r1 = r8
            r6 = r11 & 16
            if (r6 == 0) goto L_0x0021
            java.lang.String r9 = r4.confirm
        L_0x0021:
            r2 = r9
            r6 = r11 & 32
            if (r6 == 0) goto L_0x0028
            java.lang.String r10 = r4.checkSettings
        L_0x0028:
            r3 = r10
            r6 = r4
            r7 = r5
            r8 = r12
            r9 = r0
            r10 = r1
            r11 = r2
            r12 = r3
            com.ss.android.ugc.aweme.protection.model.CopyWritingInfo r4 = r6.copy(r7, r8, r9, r10, r11, r12)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.protection.model.CopyWritingInfo.copy$default(com.ss.android.ugc.aweme.protection.model.CopyWritingInfo, java.lang.String, java.lang.String, java.util.List, java.util.List, java.lang.String, java.lang.String, int, java.lang.Object):com.ss.android.ugc.aweme.protection.model.CopyWritingInfo");
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.subtext;
    }

    public final List<String> component3() {
        return this.policyList;
    }

    public final List<String> component4() {
        return this.policyLinkList;
    }

    public final String component5() {
        return this.confirm;
    }

    public final String component6() {
        return this.checkSettings;
    }

    public final CopyWritingInfo copy(String str, String str2, List<String> list, List<String> list2, String str3, String str4) {
        CopyWritingInfo copyWritingInfo = new CopyWritingInfo(str, str2, list, list2, str3, str4);
        return copyWritingInfo;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0042, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.checkSettings, (java.lang.Object) r3.checkSettings) != false) goto L_0x0047;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0047
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.protection.model.CopyWritingInfo
            if (r0 == 0) goto L_0x0045
            com.ss.android.ugc.aweme.protection.model.CopyWritingInfo r3 = (com.p683ss.android.ugc.aweme.protection.model.CopyWritingInfo) r3
            java.lang.String r0 = r2.title
            java.lang.String r1 = r3.title
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0045
            java.lang.String r0 = r2.subtext
            java.lang.String r1 = r3.subtext
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0045
            java.util.List<java.lang.String> r0 = r2.policyList
            java.util.List<java.lang.String> r1 = r3.policyList
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0045
            java.util.List<java.lang.String> r0 = r2.policyLinkList
            java.util.List<java.lang.String> r1 = r3.policyLinkList
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0045
            java.lang.String r0 = r2.confirm
            java.lang.String r1 = r3.confirm
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0045
            java.lang.String r0 = r2.checkSettings
            java.lang.String r3 = r3.checkSettings
            boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r3)
            if (r3 == 0) goto L_0x0045
            goto L_0x0047
        L_0x0045:
            r3 = 0
            return r3
        L_0x0047:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.protection.model.CopyWritingInfo.equals(java.lang.Object):boolean");
    }

    public final String getCheckSettings() {
        return this.checkSettings;
    }

    public final String getConfirm() {
        return this.confirm;
    }

    public final List<String> getPolicyLinkList() {
        return this.policyLinkList;
    }

    public final List<String> getPolicyList() {
        return this.policyList;
    }

    public final String getSubtext() {
        return this.subtext;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        String str = this.title;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.subtext;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        List<String> list = this.policyList;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        List<String> list2 = this.policyLinkList;
        int hashCode4 = (hashCode3 + (list2 != null ? list2.hashCode() : 0)) * 31;
        String str3 = this.confirm;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.checkSettings;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode5 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CopyWritingInfo(title=");
        sb.append(this.title);
        sb.append(", subtext=");
        sb.append(this.subtext);
        sb.append(", policyList=");
        sb.append(this.policyList);
        sb.append(", policyLinkList=");
        sb.append(this.policyLinkList);
        sb.append(", confirm=");
        sb.append(this.confirm);
        sb.append(", checkSettings=");
        sb.append(this.checkSettings);
        sb.append(")");
        return sb.toString();
    }

    public CopyWritingInfo(String str, String str2, List<String> list, List<String> list2, String str3, String str4) {
        this.title = str;
        this.subtext = str2;
        this.policyList = list;
        this.policyLinkList = list2;
        this.confirm = str3;
        this.checkSettings = str4;
    }
}
