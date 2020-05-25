package com.p683ss.android.ugc.aweme.favorites.model;

import com.bytedance.jedi.arch.C11932s;
import com.bytedance.jedi.arch.ext.list.C11865l;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.p683ss.android.ugc.aweme.favorites.adapter.C29677g;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.favorites.model.PoiCollectListState */
public final class PoiCollectListState implements C11932s {
    private final ListState<C29677g, C11865l> listState;

    public PoiCollectListState() {
        this(null, 1, null);
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=com.bytedance.jedi.arch.ext.list.ListState, code=com.bytedance.jedi.arch.ext.list.ListState<com.ss.android.ugc.aweme.favorites.adapter.g, com.bytedance.jedi.arch.ext.list.l>, for r1v0, types: [com.bytedance.jedi.arch.ext.list.ListState] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.p683ss.android.ugc.aweme.favorites.model.PoiCollectListState copy$default(com.p683ss.android.ugc.aweme.favorites.model.PoiCollectListState r0, com.bytedance.jedi.arch.ext.list.ListState<com.p683ss.android.ugc.aweme.favorites.adapter.C29677g, com.bytedance.jedi.arch.ext.list.C11865l> r1, int r2, java.lang.Object r3) {
        /*
            r2 = r2 & 1
            if (r2 == 0) goto L_0x0006
            com.bytedance.jedi.arch.ext.list.ListState<com.ss.android.ugc.aweme.favorites.adapter.g, com.bytedance.jedi.arch.ext.list.l> r1 = r0.listState
        L_0x0006:
            com.ss.android.ugc.aweme.favorites.model.PoiCollectListState r0 = r0.copy(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.favorites.model.PoiCollectListState.copy$default(com.ss.android.ugc.aweme.favorites.model.PoiCollectListState, com.bytedance.jedi.arch.ext.list.ListState, int, java.lang.Object):com.ss.android.ugc.aweme.favorites.model.PoiCollectListState");
    }

    public final ListState<C29677g, C11865l> component1() {
        return this.listState;
    }

    public final PoiCollectListState copy(ListState<C29677g, C11865l> listState2) {
        C52711k.m112240b(listState2, "listState");
        return new PoiCollectListState(listState2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r1.listState, (java.lang.Object) ((com.p683ss.android.ugc.aweme.favorites.model.PoiCollectListState) r2).listState) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.p683ss.android.ugc.aweme.favorites.model.PoiCollectListState
            if (r0 == 0) goto L_0x0013
            com.ss.android.ugc.aweme.favorites.model.PoiCollectListState r2 = (com.p683ss.android.ugc.aweme.favorites.model.PoiCollectListState) r2
            com.bytedance.jedi.arch.ext.list.ListState<com.ss.android.ugc.aweme.favorites.adapter.g, com.bytedance.jedi.arch.ext.list.l> r0 = r1.listState
            com.bytedance.jedi.arch.ext.list.ListState<com.ss.android.ugc.aweme.favorites.adapter.g, com.bytedance.jedi.arch.ext.list.l> r2 = r2.listState
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.favorites.model.PoiCollectListState.equals(java.lang.Object):boolean");
    }

    public final ListState<C29677g, C11865l> getListState() {
        return this.listState;
    }

    public final int hashCode() {
        ListState<C29677g, C11865l> listState2 = this.listState;
        if (listState2 != null) {
            return listState2.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PoiCollectListState(listState=");
        sb.append(this.listState);
        sb.append(")");
        return sb.toString();
    }

    public PoiCollectListState(ListState<C29677g, C11865l> listState2) {
        C52711k.m112240b(listState2, "listState");
        this.listState = listState2;
    }

    public /* synthetic */ PoiCollectListState(ListState listState2, int i, C52707g gVar) {
        if ((i & 1) != 0) {
            listState2 = new ListState(new C11865l(false, 0, 3, null), null, null, null, null, 30, null);
        }
        this(listState2);
    }
}
