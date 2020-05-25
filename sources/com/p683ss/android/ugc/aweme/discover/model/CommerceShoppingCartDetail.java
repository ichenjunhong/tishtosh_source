package com.p683ss.android.ugc.aweme.discover.model;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;
import java.util.List;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.discover.model.CommerceShoppingCartDetail */
public final class CommerceShoppingCartDetail implements Serializable {
    @C17952c(mo34828a = "alliance_open_status")
    private final Integer allianceOpenStatus;
    @C17952c(mo34828a = "has_shopping_cart_authority")
    private final Boolean hasShoppingCartAuthority;
    @C17952c(mo34828a = "is_limited")
    private final Boolean isLimited;
    @C17952c(mo34828a = "pid_bind")
    private final List<ShoppingCartPidBind> pidBinds;
    @C17952c(mo34828a = "shopping_cart_schema")
    private final List<ShoppingCartSchema> shoppingCartSchemas;
    @C17952c(mo34828a = "status_code")
    private final Integer statusCode;
    @C17952c(mo34828a = "status_msg")
    private final String statusMsg;

    public CommerceShoppingCartDetail() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<com.ss.android.ugc.aweme.discover.model.ShoppingCartPidBind>, for r9v0, types: [java.util.List] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<com.ss.android.ugc.aweme.discover.model.ShoppingCartSchema>, for r12v0, types: [java.util.List] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.p683ss.android.ugc.aweme.discover.model.CommerceShoppingCartDetail copy$default(com.p683ss.android.ugc.aweme.discover.model.CommerceShoppingCartDetail r5, java.lang.Integer r6, java.lang.String r7, java.lang.Boolean r8, java.util.List<com.p683ss.android.ugc.aweme.discover.model.ShoppingCartPidBind> r9, java.lang.Boolean r10, java.lang.Integer r11, java.util.List<com.p683ss.android.ugc.aweme.discover.model.ShoppingCartSchema> r12, int r13, java.lang.Object r14) {
        /*
            r14 = r13 & 1
            if (r14 == 0) goto L_0x0006
            java.lang.Integer r6 = r5.statusCode
        L_0x0006:
            r14 = r13 & 2
            if (r14 == 0) goto L_0x000c
            java.lang.String r7 = r5.statusMsg
        L_0x000c:
            r14 = r7
            r7 = r13 & 4
            if (r7 == 0) goto L_0x0013
            java.lang.Boolean r8 = r5.hasShoppingCartAuthority
        L_0x0013:
            r0 = r8
            r7 = r13 & 8
            if (r7 == 0) goto L_0x001a
            java.util.List<com.ss.android.ugc.aweme.discover.model.ShoppingCartPidBind> r9 = r5.pidBinds
        L_0x001a:
            r1 = r9
            r7 = r13 & 16
            if (r7 == 0) goto L_0x0021
            java.lang.Boolean r10 = r5.isLimited
        L_0x0021:
            r2 = r10
            r7 = r13 & 32
            if (r7 == 0) goto L_0x0028
            java.lang.Integer r11 = r5.allianceOpenStatus
        L_0x0028:
            r3 = r11
            r7 = r13 & 64
            if (r7 == 0) goto L_0x002f
            java.util.List<com.ss.android.ugc.aweme.discover.model.ShoppingCartSchema> r12 = r5.shoppingCartSchemas
        L_0x002f:
            r4 = r12
            r7 = r5
            r8 = r6
            r9 = r14
            r10 = r0
            r11 = r1
            r12 = r2
            r13 = r3
            r14 = r4
            com.ss.android.ugc.aweme.discover.model.CommerceShoppingCartDetail r5 = r7.copy(r8, r9, r10, r11, r12, r13, r14)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.discover.model.CommerceShoppingCartDetail.copy$default(com.ss.android.ugc.aweme.discover.model.CommerceShoppingCartDetail, java.lang.Integer, java.lang.String, java.lang.Boolean, java.util.List, java.lang.Boolean, java.lang.Integer, java.util.List, int, java.lang.Object):com.ss.android.ugc.aweme.discover.model.CommerceShoppingCartDetail");
    }

    public final Integer component1() {
        return this.statusCode;
    }

    public final String component2() {
        return this.statusMsg;
    }

    public final Boolean component3() {
        return this.hasShoppingCartAuthority;
    }

    public final List<ShoppingCartPidBind> component4() {
        return this.pidBinds;
    }

    public final Boolean component5() {
        return this.isLimited;
    }

    public final Integer component6() {
        return this.allianceOpenStatus;
    }

    public final List<ShoppingCartSchema> component7() {
        return this.shoppingCartSchemas;
    }

    public final CommerceShoppingCartDetail copy(Integer num, String str, Boolean bool, List<ShoppingCartPidBind> list, Boolean bool2, Integer num2, List<ShoppingCartSchema> list2) {
        CommerceShoppingCartDetail commerceShoppingCartDetail = new CommerceShoppingCartDetail(num, str, bool, list, bool2, num2, list2);
        return commerceShoppingCartDetail;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004c, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.shoppingCartSchemas, (java.lang.Object) r3.shoppingCartSchemas) != false) goto L_0x0051;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0051
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.discover.model.CommerceShoppingCartDetail
            if (r0 == 0) goto L_0x004f
            com.ss.android.ugc.aweme.discover.model.CommerceShoppingCartDetail r3 = (com.p683ss.android.ugc.aweme.discover.model.CommerceShoppingCartDetail) r3
            java.lang.Integer r0 = r2.statusCode
            java.lang.Integer r1 = r3.statusCode
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x004f
            java.lang.String r0 = r2.statusMsg
            java.lang.String r1 = r3.statusMsg
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x004f
            java.lang.Boolean r0 = r2.hasShoppingCartAuthority
            java.lang.Boolean r1 = r3.hasShoppingCartAuthority
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x004f
            java.util.List<com.ss.android.ugc.aweme.discover.model.ShoppingCartPidBind> r0 = r2.pidBinds
            java.util.List<com.ss.android.ugc.aweme.discover.model.ShoppingCartPidBind> r1 = r3.pidBinds
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x004f
            java.lang.Boolean r0 = r2.isLimited
            java.lang.Boolean r1 = r3.isLimited
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x004f
            java.lang.Integer r0 = r2.allianceOpenStatus
            java.lang.Integer r1 = r3.allianceOpenStatus
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x004f
            java.util.List<com.ss.android.ugc.aweme.discover.model.ShoppingCartSchema> r0 = r2.shoppingCartSchemas
            java.util.List<com.ss.android.ugc.aweme.discover.model.ShoppingCartSchema> r3 = r3.shoppingCartSchemas
            boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r3)
            if (r3 == 0) goto L_0x004f
            goto L_0x0051
        L_0x004f:
            r3 = 0
            return r3
        L_0x0051:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.discover.model.CommerceShoppingCartDetail.equals(java.lang.Object):boolean");
    }

    public final Integer getAllianceOpenStatus() {
        return this.allianceOpenStatus;
    }

    public final Boolean getHasShoppingCartAuthority() {
        return this.hasShoppingCartAuthority;
    }

    public final List<ShoppingCartPidBind> getPidBinds() {
        return this.pidBinds;
    }

    public final List<ShoppingCartSchema> getShoppingCartSchemas() {
        return this.shoppingCartSchemas;
    }

    public final Integer getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusMsg() {
        return this.statusMsg;
    }

    public final int hashCode() {
        Integer num = this.statusCode;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        String str = this.statusMsg;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Boolean bool = this.hasShoppingCartAuthority;
        int hashCode3 = (hashCode2 + (bool != null ? bool.hashCode() : 0)) * 31;
        List<ShoppingCartPidBind> list = this.pidBinds;
        int hashCode4 = (hashCode3 + (list != null ? list.hashCode() : 0)) * 31;
        Boolean bool2 = this.isLimited;
        int hashCode5 = (hashCode4 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        Integer num2 = this.allianceOpenStatus;
        int hashCode6 = (hashCode5 + (num2 != null ? num2.hashCode() : 0)) * 31;
        List<ShoppingCartSchema> list2 = this.shoppingCartSchemas;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode6 + i;
    }

    public final Boolean isLimited() {
        return this.isLimited;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommerceShoppingCartDetail(statusCode=");
        sb.append(this.statusCode);
        sb.append(", statusMsg=");
        sb.append(this.statusMsg);
        sb.append(", hasShoppingCartAuthority=");
        sb.append(this.hasShoppingCartAuthority);
        sb.append(", pidBinds=");
        sb.append(this.pidBinds);
        sb.append(", isLimited=");
        sb.append(this.isLimited);
        sb.append(", allianceOpenStatus=");
        sb.append(this.allianceOpenStatus);
        sb.append(", shoppingCartSchemas=");
        sb.append(this.shoppingCartSchemas);
        sb.append(")");
        return sb.toString();
    }

    public CommerceShoppingCartDetail(Integer num, String str, Boolean bool, List<ShoppingCartPidBind> list, Boolean bool2, Integer num2, List<ShoppingCartSchema> list2) {
        this.statusCode = num;
        this.statusMsg = str;
        this.hasShoppingCartAuthority = bool;
        this.pidBinds = list;
        this.isLimited = bool2;
        this.allianceOpenStatus = num2;
        this.shoppingCartSchemas = list2;
    }

    public /* synthetic */ CommerceShoppingCartDetail(Integer num, String str, Boolean bool, List list, Boolean bool2, Integer num2, List list2, int i, C52707g gVar) {
        Integer num3;
        String str2;
        List list3;
        List list4;
        if ((i & 1) != 0) {
            num3 = null;
        } else {
            num3 = num;
        }
        if ((i & 2) != 0) {
            str2 = null;
        } else {
            str2 = str;
        }
        if ((i & 4) != 0) {
            bool = Boolean.valueOf(false);
        }
        Boolean bool3 = bool;
        if ((i & 8) != 0) {
            list3 = null;
        } else {
            list3 = list;
        }
        if ((i & 16) != 0) {
            bool2 = Boolean.valueOf(false);
        }
        Boolean bool4 = bool2;
        if ((i & 32) != 0) {
            num2 = Integer.valueOf(0);
        }
        Integer num4 = num2;
        if ((i & 64) != 0) {
            list4 = null;
        } else {
            list4 = list2;
        }
        this(num3, str2, bool3, list3, bool4, num4, list4);
    }
}
