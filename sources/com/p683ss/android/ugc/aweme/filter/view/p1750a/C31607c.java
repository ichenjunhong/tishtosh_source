package com.p683ss.android.ugc.aweme.filter.view.p1750a;

import com.p683ss.android.ugc.aweme.filter.C31459g;
import com.p683ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.filter.view.a.c */
public final class C31607c {

    /* renamed from: a */
    public final C31608d f82613a;

    /* renamed from: b */
    public final EffectCategoryResponse f82614b;

    /* renamed from: c */
    public final C31459g f82615c;

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f82615c, (java.lang.Object) r3.f82615c) != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0029
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.filter.view.p1750a.C31607c
            if (r0 == 0) goto L_0x0027
            com.ss.android.ugc.aweme.filter.view.a.c r3 = (com.p683ss.android.ugc.aweme.filter.view.p1750a.C31607c) r3
            com.ss.android.ugc.aweme.filter.view.a.d r0 = r2.f82613a
            com.ss.android.ugc.aweme.filter.view.a.d r1 = r3.f82613a
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0027
            com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse r0 = r2.f82614b
            com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse r1 = r3.f82614b
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0027
            com.ss.android.ugc.aweme.filter.g r0 = r2.f82615c
            com.ss.android.ugc.aweme.filter.g r3 = r3.f82615c
            boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r3)
            if (r3 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r3 = 0
            return r3
        L_0x0029:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.filter.view.p1750a.C31607c.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        C31608d dVar = this.f82613a;
        int i = 0;
        int hashCode = (dVar != null ? dVar.hashCode() : 0) * 31;
        EffectCategoryResponse effectCategoryResponse = this.f82614b;
        int hashCode2 = (hashCode + (effectCategoryResponse != null ? effectCategoryResponse.hashCode() : 0)) * 31;
        C31459g gVar = this.f82615c;
        if (gVar != null) {
            i = gVar.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FilterViewActionEvent(type=");
        sb.append(this.f82613a);
        sb.append(", extraTab=");
        sb.append(this.f82614b);
        sb.append(", extraFilter=");
        sb.append(this.f82615c);
        sb.append(")");
        return sb.toString();
    }

    private C31607c(C31608d dVar, EffectCategoryResponse effectCategoryResponse, C31459g gVar) {
        C52711k.m112240b(dVar, "type");
        this.f82613a = dVar;
        this.f82614b = effectCategoryResponse;
        this.f82615c = gVar;
    }

    public /* synthetic */ C31607c(C31608d dVar, EffectCategoryResponse effectCategoryResponse, C31459g gVar, int i, C52707g gVar2) {
        if ((i & 2) != 0) {
            effectCategoryResponse = null;
        }
        if ((i & 4) != 0) {
            gVar = null;
        }
        this(dVar, effectCategoryResponse, gVar);
    }
}
