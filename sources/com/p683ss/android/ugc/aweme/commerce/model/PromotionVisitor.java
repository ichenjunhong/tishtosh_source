package com.p683ss.android.ugc.aweme.commerce.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import java.util.List;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commerce.model.PromotionVisitor */
public final class PromotionVisitor implements Serializable {
    @C17952c(mo34828a = "avatar")
    private List<? extends UrlModel> avatars;
    @C17952c(mo34828a = "count")
    private long count;

    public PromotionVisitor() {
        this(null, 0, 3, null);
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<? extends com.ss.android.ugc.aweme.base.model.UrlModel>, for r1v0, types: [java.util.List] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.p683ss.android.ugc.aweme.commerce.model.PromotionVisitor copy$default(com.p683ss.android.ugc.aweme.commerce.model.PromotionVisitor r0, java.util.List<? extends com.p683ss.android.ugc.aweme.base.model.UrlModel> r1, long r2, int r4, java.lang.Object r5) {
        /*
            r5 = r4 & 1
            if (r5 == 0) goto L_0x0006
            java.util.List<? extends com.ss.android.ugc.aweme.base.model.UrlModel> r1 = r0.avatars
        L_0x0006:
            r4 = r4 & 2
            if (r4 == 0) goto L_0x000c
            long r2 = r0.count
        L_0x000c:
            com.ss.android.ugc.aweme.commerce.model.PromotionVisitor r0 = r0.copy(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.commerce.model.PromotionVisitor.copy$default(com.ss.android.ugc.aweme.commerce.model.PromotionVisitor, java.util.List, long, int, java.lang.Object):com.ss.android.ugc.aweme.commerce.model.PromotionVisitor");
    }

    public final List<UrlModel> component1() {
        return this.avatars;
    }

    public final long component2() {
        return this.count;
    }

    public final PromotionVisitor copy(List<? extends UrlModel> list, long j) {
        C52711k.m112240b(list, "avatars");
        return new PromotionVisitor(list, j);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PromotionVisitor) {
                PromotionVisitor promotionVisitor = (PromotionVisitor) obj;
                if (C52711k.m112239a((Object) this.avatars, (Object) promotionVisitor.avatars)) {
                    if (this.count == promotionVisitor.count) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final List<UrlModel> getAvatars() {
        return this.avatars;
    }

    public final long getCount() {
        return this.count;
    }

    public final int hashCode() {
        List<? extends UrlModel> list = this.avatars;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        long j = this.count;
        return hashCode + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PromotionVisitor(avatars=");
        sb.append(this.avatars);
        sb.append(", count=");
        sb.append(this.count);
        sb.append(")");
        return sb.toString();
    }

    public final void setCount(long j) {
        this.count = j;
    }

    public final void setAvatars(List<? extends UrlModel> list) {
        C52711k.m112240b(list, "<set-?>");
        this.avatars = list;
    }

    public PromotionVisitor(List<? extends UrlModel> list, long j) {
        C52711k.m112240b(list, "avatars");
        this.avatars = list;
        this.count = j;
    }

    public /* synthetic */ PromotionVisitor(List list, long j, int i, C52707g gVar) {
        if ((i & 1) != 0) {
            list = C52575l.m112097a();
        }
        if ((i & 2) != 0) {
            j = 0;
        }
        this(list, j);
    }
}
