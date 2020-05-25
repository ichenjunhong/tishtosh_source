package com.p683ss.android.ugc.aweme.filter.repository.p1746a;

import com.p683ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import java.util.List;
import p2628d.C52847n;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.filter.repository.a.c */
public final class C31490c {

    /* renamed from: a */
    public final List<C31493f> f82395a;

    /* renamed from: b */
    public final List<C52847n<EffectCategoryResponse, List<C31493f>>> f82396b;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f82396b, (java.lang.Object) r3.f82396b) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31490c
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.filter.repository.a.c r3 = (com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31490c) r3
            java.util.List<com.ss.android.ugc.aweme.filter.repository.a.f> r0 = r2.f82395a
            java.util.List<com.ss.android.ugc.aweme.filter.repository.a.f> r1 = r3.f82395a
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.util.List<d.n<com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse, java.util.List<com.ss.android.ugc.aweme.filter.repository.a.f>>> r0 = r2.f82396b
            java.util.List<d.n<com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse, java.util.List<com.ss.android.ugc.aweme.filter.repository.a.f>>> r3 = r3.f82396b
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31490c.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        List<C31493f> list = this.f82395a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<C52847n<EffectCategoryResponse, List<C31493f>>> list2 = this.f82396b;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FilterData(filters=");
        sb.append(this.f82395a);
        sb.append(", filterTable=");
        sb.append(this.f82396b);
        sb.append(")");
        return sb.toString();
    }

    public C31490c(List<C31493f> list, List<? extends C52847n<? extends EffectCategoryResponse, ? extends List<C31493f>>> list2) {
        C52711k.m112240b(list, "filters");
        C52711k.m112240b(list2, "filterTable");
        this.f82395a = list;
        this.f82396b = list2;
    }
}
