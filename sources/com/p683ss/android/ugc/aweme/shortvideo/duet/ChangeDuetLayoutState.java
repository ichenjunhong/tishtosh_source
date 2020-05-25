package com.p683ss.android.ugc.aweme.shortvideo.duet;

import com.bytedance.jedi.arch.C11932s;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.gamora.jedi.C49555b;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.ChangeDuetLayoutState */
public final class ChangeDuetLayoutState implements C11932s {
    private final C49555b<Effect> effect;
    private final C49555b<Integer> layoutDirection;

    public ChangeDuetLayoutState() {
        this(null, null, 3, null);
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=com.ss.android.ugc.gamora.jedi.b, code=com.ss.android.ugc.gamora.jedi.b<com.ss.android.ugc.effectmanager.effect.model.Effect>, for r1v0, types: [com.ss.android.ugc.gamora.jedi.b] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=com.ss.android.ugc.gamora.jedi.b, code=com.ss.android.ugc.gamora.jedi.b<java.lang.Integer>, for r2v0, types: [com.ss.android.ugc.gamora.jedi.b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.p683ss.android.ugc.aweme.shortvideo.duet.ChangeDuetLayoutState copy$default(com.p683ss.android.ugc.aweme.shortvideo.duet.ChangeDuetLayoutState r0, com.p683ss.android.ugc.gamora.jedi.C49555b<com.p683ss.android.ugc.effectmanager.effect.model.Effect> r1, com.p683ss.android.ugc.gamora.jedi.C49555b<java.lang.Integer> r2, int r3, java.lang.Object r4) {
        /*
            r4 = r3 & 1
            if (r4 == 0) goto L_0x0006
            com.ss.android.ugc.gamora.jedi.b<com.ss.android.ugc.effectmanager.effect.model.Effect> r1 = r0.effect
        L_0x0006:
            r3 = r3 & 2
            if (r3 == 0) goto L_0x000c
            com.ss.android.ugc.gamora.jedi.b<java.lang.Integer> r2 = r0.layoutDirection
        L_0x000c:
            com.ss.android.ugc.aweme.shortvideo.duet.ChangeDuetLayoutState r0 = r0.copy(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.duet.ChangeDuetLayoutState.copy$default(com.ss.android.ugc.aweme.shortvideo.duet.ChangeDuetLayoutState, com.ss.android.ugc.gamora.jedi.b, com.ss.android.ugc.gamora.jedi.b, int, java.lang.Object):com.ss.android.ugc.aweme.shortvideo.duet.ChangeDuetLayoutState");
    }

    public final C49555b<Effect> component1() {
        return this.effect;
    }

    public final C49555b<Integer> component2() {
        return this.layoutDirection;
    }

    public final ChangeDuetLayoutState copy(C49555b<? extends Effect> bVar, C49555b<Integer> bVar2) {
        return new ChangeDuetLayoutState(bVar, bVar2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.layoutDirection, (java.lang.Object) r3.layoutDirection) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.shortvideo.duet.ChangeDuetLayoutState
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.shortvideo.duet.ChangeDuetLayoutState r3 = (com.p683ss.android.ugc.aweme.shortvideo.duet.ChangeDuetLayoutState) r3
            com.ss.android.ugc.gamora.jedi.b<com.ss.android.ugc.effectmanager.effect.model.Effect> r0 = r2.effect
            com.ss.android.ugc.gamora.jedi.b<com.ss.android.ugc.effectmanager.effect.model.Effect> r1 = r3.effect
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.gamora.jedi.b<java.lang.Integer> r0 = r2.layoutDirection
            com.ss.android.ugc.gamora.jedi.b<java.lang.Integer> r3 = r3.layoutDirection
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.duet.ChangeDuetLayoutState.equals(java.lang.Object):boolean");
    }

    public final C49555b<Effect> getEffect() {
        return this.effect;
    }

    public final C49555b<Integer> getLayoutDirection() {
        return this.layoutDirection;
    }

    public final int hashCode() {
        C49555b<Effect> bVar = this.effect;
        int i = 0;
        int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
        C49555b<Integer> bVar2 = this.layoutDirection;
        if (bVar2 != null) {
            i = bVar2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChangeDuetLayoutState(effect=");
        sb.append(this.effect);
        sb.append(", layoutDirection=");
        sb.append(this.layoutDirection);
        sb.append(")");
        return sb.toString();
    }

    public ChangeDuetLayoutState(C49555b<? extends Effect> bVar, C49555b<Integer> bVar2) {
        this.effect = bVar;
        this.layoutDirection = bVar2;
    }

    public /* synthetic */ ChangeDuetLayoutState(C49555b bVar, C49555b bVar2, int i, C52707g gVar) {
        if ((i & 1) != 0) {
            bVar = null;
        }
        if ((i & 2) != 0) {
            bVar2 = null;
        }
        this(bVar, bVar2);
    }
}
