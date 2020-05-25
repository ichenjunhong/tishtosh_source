package com.p683ss.android.ugc.aweme.sticker.presenter;

import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sticker.presenter.i */
public final class C46351i {

    /* renamed from: a */
    public final C46299h f116945a;

    /* renamed from: b */
    public final C46299h f116946b;

    public C46351i() {
        this(null, null, 3, null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f116946b, (java.lang.Object) r3.f116946b) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.sticker.presenter.C46351i
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.sticker.presenter.i r3 = (com.p683ss.android.ugc.aweme.sticker.presenter.C46351i) r3
            com.ss.android.ugc.aweme.sticker.presenter.h r0 = r2.f116945a
            com.ss.android.ugc.aweme.sticker.presenter.h r1 = r3.f116945a
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.sticker.presenter.h r0 = r2.f116946b
            com.ss.android.ugc.aweme.sticker.presenter.h r3 = r3.f116946b
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.sticker.presenter.C46351i.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        C46299h hVar = this.f116945a;
        int i = 0;
        int hashCode = (hVar != null ? hVar.hashCode() : 0) * 31;
        C46299h hVar2 = this.f116946b;
        if (hVar2 != null) {
            i = hVar2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MultiStickerChangeEvent(from=");
        sb.append(this.f116945a);
        sb.append(", to=");
        sb.append(this.f116946b);
        sb.append(")");
        return sb.toString();
    }

    public C46351i(C46299h hVar, C46299h hVar2) {
        C52711k.m112240b(hVar, "from");
        C52711k.m112240b(hVar2, "to");
        this.f116945a = hVar;
        this.f116946b = hVar2;
    }

    private /* synthetic */ C46351i(C46299h hVar, C46299h hVar2, int i, C52707g gVar) {
        this(new C46299h(null, 0, 3, null), new C46299h(null, 0, 3, null));
    }
}
