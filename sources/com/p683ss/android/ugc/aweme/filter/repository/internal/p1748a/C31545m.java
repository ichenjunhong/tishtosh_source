package com.p683ss.android.ugc.aweme.filter.repository.internal.p1748a;

import com.p683ss.android.ugc.aweme.filter.C31459g;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import java.util.List;
import java.util.Map;
import p2628d.C52847n;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.a.m */
final class C31545m {

    /* renamed from: a */
    public final List<C31459g> f82502a;

    /* renamed from: b */
    public final List<EffectCategoryResponse> f82503b;

    /* renamed from: c */
    public final List<C52847n<EffectCategoryResponse, List<C31459g>>> f82504c;

    /* renamed from: d */
    public final Map<String, Effect> f82505d;

    /* renamed from: e */
    public final List<C31459g> f82506e;

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0038, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f82506e, (java.lang.Object) r3.f82506e) != false) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x003d
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.filter.repository.internal.p1748a.C31545m
            if (r0 == 0) goto L_0x003b
            com.ss.android.ugc.aweme.filter.repository.internal.a.m r3 = (com.p683ss.android.ugc.aweme.filter.repository.internal.p1748a.C31545m) r3
            java.util.List<com.ss.android.ugc.aweme.filter.g> r0 = r2.f82502a
            java.util.List<com.ss.android.ugc.aweme.filter.g> r1 = r3.f82502a
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x003b
            java.util.List<com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse> r0 = r2.f82503b
            java.util.List<com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse> r1 = r3.f82503b
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x003b
            java.util.List<d.n<com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse, java.util.List<com.ss.android.ugc.aweme.filter.g>>> r0 = r2.f82504c
            java.util.List<d.n<com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse, java.util.List<com.ss.android.ugc.aweme.filter.g>>> r1 = r3.f82504c
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x003b
            java.util.Map<java.lang.String, com.ss.android.ugc.effectmanager.effect.model.Effect> r0 = r2.f82505d
            java.util.Map<java.lang.String, com.ss.android.ugc.effectmanager.effect.model.Effect> r1 = r3.f82505d
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x003b
            java.util.List<com.ss.android.ugc.aweme.filter.g> r0 = r2.f82506e
            java.util.List<com.ss.android.ugc.aweme.filter.g> r3 = r3.f82506e
            boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r3)
            if (r3 == 0) goto L_0x003b
            goto L_0x003d
        L_0x003b:
            r3 = 0
            return r3
        L_0x003d:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.filter.repository.internal.p1748a.C31545m.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        List<C31459g> list = this.f82502a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<EffectCategoryResponse> list2 = this.f82503b;
        int hashCode2 = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
        List<C52847n<EffectCategoryResponse, List<C31459g>>> list3 = this.f82504c;
        int hashCode3 = (hashCode2 + (list3 != null ? list3.hashCode() : 0)) * 31;
        Map<String, Effect> map = this.f82505d;
        int hashCode4 = (hashCode3 + (map != null ? map.hashCode() : 0)) * 31;
        List<C31459g> list4 = this.f82506e;
        if (list4 != null) {
            i = list4.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FilterDataObserveBundle(filters=");
        sb.append(this.f82502a);
        sb.append(", categories=");
        sb.append(this.f82503b);
        sb.append(", categoryMap=");
        sb.append(this.f82504c);
        sb.append(", effectMap=");
        sb.append(this.f82505d);
        sb.append(", availableFilters=");
        sb.append(this.f82506e);
        sb.append(")");
        return sb.toString();
    }

    public C31545m(List<? extends C31459g> list, List<? extends EffectCategoryResponse> list2, List<? extends C52847n<? extends EffectCategoryResponse, ? extends List<? extends C31459g>>> list3, Map<String, ? extends Effect> map, List<? extends C31459g> list4) {
        C52711k.m112240b(list, "filters");
        C52711k.m112240b(list2, "categories");
        C52711k.m112240b(list3, "categoryMap");
        C52711k.m112240b(map, "effectMap");
        C52711k.m112240b(list4, "availableFilters");
        this.f82502a = list;
        this.f82503b = list2;
        this.f82504c = list3;
        this.f82505d = map;
        this.f82506e = list4;
    }
}
