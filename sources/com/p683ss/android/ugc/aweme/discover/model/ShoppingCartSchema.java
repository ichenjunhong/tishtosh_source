package com.p683ss.android.ugc.aweme.discover.model;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.discover.model.ShoppingCartSchema */
public final class ShoppingCartSchema implements Serializable {
    @C17952c(mo34828a = "type")
    private final Integer type;
    @C17952c(mo34828a = "value")
    private final String value;

    public ShoppingCartSchema() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ ShoppingCartSchema copy$default(ShoppingCartSchema shoppingCartSchema, Integer num, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            num = shoppingCartSchema.type;
        }
        if ((i & 2) != 0) {
            str = shoppingCartSchema.value;
        }
        return shoppingCartSchema.copy(num, str);
    }

    public final Integer component1() {
        return this.type;
    }

    public final String component2() {
        return this.value;
    }

    public final ShoppingCartSchema copy(Integer num, String str) {
        return new ShoppingCartSchema(num, str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.value, (java.lang.Object) r3.value) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.discover.model.ShoppingCartSchema
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.discover.model.ShoppingCartSchema r3 = (com.p683ss.android.ugc.aweme.discover.model.ShoppingCartSchema) r3
            java.lang.Integer r0 = r2.type
            java.lang.Integer r1 = r3.type
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.lang.String r0 = r2.value
            java.lang.String r3 = r3.value
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.discover.model.ShoppingCartSchema.equals(java.lang.Object):boolean");
    }

    public final Integer getType() {
        return this.type;
    }

    public final String getValue() {
        return this.value;
    }

    public final int hashCode() {
        Integer num = this.type;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        String str = this.value;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShoppingCartSchema(type=");
        sb.append(this.type);
        sb.append(", value=");
        sb.append(this.value);
        sb.append(")");
        return sb.toString();
    }

    public ShoppingCartSchema(Integer num, String str) {
        this.type = num;
        this.value = str;
    }

    public /* synthetic */ ShoppingCartSchema(Integer num, String str, int i, C52707g gVar) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        this(num, str);
    }
}
