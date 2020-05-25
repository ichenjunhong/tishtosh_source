package com.p683ss.android.ugc.aweme.discover.p1665v4.viewmodel;

import com.bytedance.jedi.arch.C11932s;
import com.bytedance.jedi.arch.ext.list.C11865l;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.p683ss.android.ugc.aweme.discover.model.DiscoverCategoryStructV4;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.v4.viewmodel.DiscoverV4ListState */
public final class DiscoverV4ListState implements C11932s {
    private final ListState<DiscoverCategoryStructV4, C11865l> cells;

    public DiscoverV4ListState() {
        this(null, 1, null);
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=com.bytedance.jedi.arch.ext.list.ListState, code=com.bytedance.jedi.arch.ext.list.ListState<com.ss.android.ugc.aweme.discover.model.DiscoverCategoryStructV4, com.bytedance.jedi.arch.ext.list.l>, for r1v0, types: [com.bytedance.jedi.arch.ext.list.ListState] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.p683ss.android.ugc.aweme.discover.p1665v4.viewmodel.DiscoverV4ListState copy$default(com.p683ss.android.ugc.aweme.discover.p1665v4.viewmodel.DiscoverV4ListState r0, com.bytedance.jedi.arch.ext.list.ListState<com.p683ss.android.ugc.aweme.discover.model.DiscoverCategoryStructV4, com.bytedance.jedi.arch.ext.list.C11865l> r1, int r2, java.lang.Object r3) {
        /*
            r2 = r2 & 1
            if (r2 == 0) goto L_0x0006
            com.bytedance.jedi.arch.ext.list.ListState<com.ss.android.ugc.aweme.discover.model.DiscoverCategoryStructV4, com.bytedance.jedi.arch.ext.list.l> r1 = r0.cells
        L_0x0006:
            com.ss.android.ugc.aweme.discover.v4.viewmodel.DiscoverV4ListState r0 = r0.copy(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.discover.p1665v4.viewmodel.DiscoverV4ListState.copy$default(com.ss.android.ugc.aweme.discover.v4.viewmodel.DiscoverV4ListState, com.bytedance.jedi.arch.ext.list.ListState, int, java.lang.Object):com.ss.android.ugc.aweme.discover.v4.viewmodel.DiscoverV4ListState");
    }

    public final ListState<DiscoverCategoryStructV4, C11865l> component1() {
        return this.cells;
    }

    public final DiscoverV4ListState copy(ListState<DiscoverCategoryStructV4, C11865l> listState) {
        C52711k.m112240b(listState, "cells");
        return new DiscoverV4ListState(listState);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r1.cells, (java.lang.Object) ((com.p683ss.android.ugc.aweme.discover.p1665v4.viewmodel.DiscoverV4ListState) r2).cells) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.p683ss.android.ugc.aweme.discover.p1665v4.viewmodel.DiscoverV4ListState
            if (r0 == 0) goto L_0x0013
            com.ss.android.ugc.aweme.discover.v4.viewmodel.DiscoverV4ListState r2 = (com.p683ss.android.ugc.aweme.discover.p1665v4.viewmodel.DiscoverV4ListState) r2
            com.bytedance.jedi.arch.ext.list.ListState<com.ss.android.ugc.aweme.discover.model.DiscoverCategoryStructV4, com.bytedance.jedi.arch.ext.list.l> r0 = r1.cells
            com.bytedance.jedi.arch.ext.list.ListState<com.ss.android.ugc.aweme.discover.model.DiscoverCategoryStructV4, com.bytedance.jedi.arch.ext.list.l> r2 = r2.cells
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.discover.p1665v4.viewmodel.DiscoverV4ListState.equals(java.lang.Object):boolean");
    }

    public final ListState<DiscoverCategoryStructV4, C11865l> getCells() {
        return this.cells;
    }

    public final int hashCode() {
        ListState<DiscoverCategoryStructV4, C11865l> listState = this.cells;
        if (listState != null) {
            return listState.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DiscoverV4ListState(cells=");
        sb.append(this.cells);
        sb.append(")");
        return sb.toString();
    }

    public DiscoverV4ListState(ListState<DiscoverCategoryStructV4, C11865l> listState) {
        C52711k.m112240b(listState, "cells");
        this.cells = listState;
    }

    public /* synthetic */ DiscoverV4ListState(ListState listState, int i, C52707g gVar) {
        if ((i & 1) != 0) {
            listState = new ListState(new C11865l(false, 0, 3, null), null, null, null, null, 30, null);
        }
        this(listState);
    }
}
