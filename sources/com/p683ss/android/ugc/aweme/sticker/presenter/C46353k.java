package com.p683ss.android.ugc.aweme.sticker.presenter;

import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.sticker.presenter.k */
public final class C46353k {

    /* renamed from: a */
    public final Effect f116947a;

    /* renamed from: b */
    public final Effect f116948b;

    public C46353k() {
        this(null, null, 3, null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f116948b, (java.lang.Object) r3.f116948b) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.sticker.presenter.C46353k
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.sticker.presenter.k r3 = (com.p683ss.android.ugc.aweme.sticker.presenter.C46353k) r3
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = r2.f116947a
            com.ss.android.ugc.effectmanager.effect.model.Effect r1 = r3.f116947a
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = r2.f116948b
            com.ss.android.ugc.effectmanager.effect.model.Effect r3 = r3.f116948b
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.sticker.presenter.C46353k.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Effect effect = this.f116947a;
        int i = 0;
        int hashCode = (effect != null ? effect.hashCode() : 0) * 31;
        Effect effect2 = this.f116948b;
        if (effect2 != null) {
            i = effect2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickerChangeEvent(from=");
        sb.append(this.f116947a);
        sb.append(", to=");
        sb.append(this.f116948b);
        sb.append(")");
        return sb.toString();
    }

    public C46353k(Effect effect, Effect effect2) {
        this.f116947a = effect;
        this.f116948b = effect2;
    }

    private /* synthetic */ C46353k(Effect effect, Effect effect2, int i, C52707g gVar) {
        this(null, null);
    }
}
