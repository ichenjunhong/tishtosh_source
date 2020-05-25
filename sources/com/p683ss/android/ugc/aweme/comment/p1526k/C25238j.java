package com.p683ss.android.ugc.aweme.comment.p1526k;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import java.util.List;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.comment.k.j */
public final class C25238j implements Serializable {
    @C17952c(mo34828a = "icon_url_list")

    /* renamed from: a */
    private final List<UrlModel> f66837a;

    public C25238j() {
        this(null, 1, null);
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<com.ss.android.ugc.aweme.base.model.UrlModel>, for r1v0, types: [java.util.List] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.p683ss.android.ugc.aweme.comment.p1526k.C25238j copy$default(com.p683ss.android.ugc.aweme.comment.p1526k.C25238j r0, java.util.List<com.p683ss.android.ugc.aweme.base.model.UrlModel> r1, int r2, java.lang.Object r3) {
        /*
            r2 = r2 & 1
            if (r2 == 0) goto L_0x0006
            java.util.List<com.ss.android.ugc.aweme.base.model.UrlModel> r1 = r0.f66837a
        L_0x0006:
            com.ss.android.ugc.aweme.comment.k.j r0 = r0.copy(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.comment.p1526k.C25238j.copy$default(com.ss.android.ugc.aweme.comment.k.j, java.util.List, int, java.lang.Object):com.ss.android.ugc.aweme.comment.k.j");
    }

    public final List<UrlModel> component1() {
        return this.f66837a;
    }

    public final C25238j copy(List<? extends UrlModel> list) {
        return new C25238j(list);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r1.f66837a, (java.lang.Object) ((com.p683ss.android.ugc.aweme.comment.p1526k.C25238j) r2).f66837a) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.p683ss.android.ugc.aweme.comment.p1526k.C25238j
            if (r0 == 0) goto L_0x0013
            com.ss.android.ugc.aweme.comment.k.j r2 = (com.p683ss.android.ugc.aweme.comment.p1526k.C25238j) r2
            java.util.List<com.ss.android.ugc.aweme.base.model.UrlModel> r0 = r1.f66837a
            java.util.List<com.ss.android.ugc.aweme.base.model.UrlModel> r2 = r2.f66837a
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.comment.p1526k.C25238j.equals(java.lang.Object):boolean");
    }

    public final List<UrlModel> getIconUrlList() {
        return this.f66837a;
    }

    public final int hashCode() {
        List<UrlModel> list = this.f66837a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DonationStickerAnchorExtra(iconUrlList=");
        sb.append(this.f66837a);
        sb.append(")");
        return sb.toString();
    }

    public C25238j(List<? extends UrlModel> list) {
        this.f66837a = list;
    }

    public /* synthetic */ C25238j(List list, int i, C52707g gVar) {
        if ((i & 1) != 0) {
            list = null;
        }
        this(list);
    }
}
