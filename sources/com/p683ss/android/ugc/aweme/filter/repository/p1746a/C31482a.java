package com.p683ss.android.ugc.aweme.filter.repository.p1746a;

import com.p683ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import java.util.List;
import p2628d.C52847n;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.filter.repository.a.a */
public final class C31482a {

    /* renamed from: a */
    public final List<C31489b> f82382a;

    /* renamed from: b */
    public final List<C52847n<EffectCategoryModel, List<C31489b>>> f82383b;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f82383b, (java.lang.Object) r3.f82383b) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31482a
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.filter.repository.a.a r3 = (com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31482a) r3
            java.util.List<com.ss.android.ugc.aweme.filter.repository.a.b> r0 = r2.f82382a
            java.util.List<com.ss.android.ugc.aweme.filter.repository.a.b> r1 = r3.f82382a
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.util.List<d.n<com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel, java.util.List<com.ss.android.ugc.aweme.filter.repository.a.b>>> r0 = r2.f82383b
            java.util.List<d.n<com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel, java.util.List<com.ss.android.ugc.aweme.filter.repository.a.b>>> r3 = r3.f82383b
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31482a.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        List<C31489b> list = this.f82382a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<C52847n<EffectCategoryModel, List<C31489b>>> list2 = this.f82383b;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FilterBoxData(metas=");
        sb.append(this.f82382a);
        sb.append(", table=");
        sb.append(this.f82383b);
        sb.append(")");
        return sb.toString();
    }

    public C31482a(List<C31489b> list, List<? extends C52847n<? extends EffectCategoryModel, ? extends List<C31489b>>> list2) {
        C52711k.m112240b(list, "metas");
        C52711k.m112240b(list2, "table");
        this.f82382a = list;
        this.f82383b = list2;
    }
}
