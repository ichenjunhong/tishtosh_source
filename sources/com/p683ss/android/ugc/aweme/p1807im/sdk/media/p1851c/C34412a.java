package com.p683ss.android.ugc.aweme.p1807im.sdk.media.p1851c;

import com.p683ss.android.ugc.aweme.services.external.ability.IAVProcessService.CompileParam;
import com.p683ss.android.ugc.aweme.services.external.ability.IAVProcessService.CompileResult;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.media.c.a */
public final class C34412a {

    /* renamed from: a */
    public final CompileParam f88802a;

    /* renamed from: b */
    public final C52671b<CompileResult, C52860x> f88803b;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f88803b, (java.lang.Object) r3.f88803b) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.p1807im.sdk.media.p1851c.C34412a
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.im.sdk.media.c.a r3 = (com.p683ss.android.ugc.aweme.p1807im.sdk.media.p1851c.C34412a) r3
            com.ss.android.ugc.aweme.services.external.ability.IAVProcessService$CompileParam r0 = r2.f88802a
            com.ss.android.ugc.aweme.services.external.ability.IAVProcessService$CompileParam r1 = r3.f88802a
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x001d
            d.f.a.b<com.ss.android.ugc.aweme.services.external.ability.IAVProcessService$CompileResult, d.x> r0 = r2.f88803b
            d.f.a.b<com.ss.android.ugc.aweme.services.external.ability.IAVProcessService$CompileResult, d.x> r3 = r3.f88803b
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.media.p1851c.C34412a.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        CompileParam compileParam = this.f88802a;
        int i = 0;
        int hashCode = (compileParam != null ? compileParam.hashCode() : 0) * 31;
        C52671b<CompileResult, C52860x> bVar = this.f88803b;
        if (bVar != null) {
            i = bVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CompileTask(compileParam=");
        sb.append(this.f88802a);
        sb.append(", callback=");
        sb.append(this.f88803b);
        sb.append(")");
        return sb.toString();
    }

    public C34412a(CompileParam compileParam, C52671b<? super CompileResult, C52860x> bVar) {
        C52711k.m112240b(compileParam, "compileParam");
        C52711k.m112240b(bVar, "callback");
        this.f88802a = compileParam;
        this.f88803b = bVar;
    }
}
