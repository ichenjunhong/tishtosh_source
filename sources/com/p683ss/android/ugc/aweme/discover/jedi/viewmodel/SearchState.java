package com.p683ss.android.ugc.aweme.discover.jedi.viewmodel;

import com.bytedance.jedi.arch.C11932s;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.p683ss.android.ugc.aweme.discover.mixfeed.C28333l;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.jedi.viewmodel.SearchState */
public final class SearchState implements C11932s {
    private final ListState<C28333l, C28294f> listState;
    private final C28295g searchParam;

    public SearchState() {
        this(null, null, 3, null);
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=com.bytedance.jedi.arch.ext.list.ListState, code=com.bytedance.jedi.arch.ext.list.ListState<com.ss.android.ugc.aweme.discover.mixfeed.l, com.ss.android.ugc.aweme.discover.jedi.viewmodel.f>, for r1v0, types: [com.bytedance.jedi.arch.ext.list.ListState] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.p683ss.android.ugc.aweme.discover.jedi.viewmodel.SearchState copy$default(com.p683ss.android.ugc.aweme.discover.jedi.viewmodel.SearchState r0, com.bytedance.jedi.arch.ext.list.ListState<com.p683ss.android.ugc.aweme.discover.mixfeed.C28333l, com.p683ss.android.ugc.aweme.discover.jedi.viewmodel.C28294f> r1, com.p683ss.android.ugc.aweme.discover.jedi.viewmodel.C28295g r2, int r3, java.lang.Object r4) {
        /*
            r4 = r3 & 1
            if (r4 == 0) goto L_0x0006
            com.bytedance.jedi.arch.ext.list.ListState<com.ss.android.ugc.aweme.discover.mixfeed.l, com.ss.android.ugc.aweme.discover.jedi.viewmodel.f> r1 = r0.listState
        L_0x0006:
            r3 = r3 & 2
            if (r3 == 0) goto L_0x000c
            com.ss.android.ugc.aweme.discover.jedi.viewmodel.g r2 = r0.searchParam
        L_0x000c:
            com.ss.android.ugc.aweme.discover.jedi.viewmodel.SearchState r0 = r0.copy(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.discover.jedi.viewmodel.SearchState.copy$default(com.ss.android.ugc.aweme.discover.jedi.viewmodel.SearchState, com.bytedance.jedi.arch.ext.list.ListState, com.ss.android.ugc.aweme.discover.jedi.viewmodel.g, int, java.lang.Object):com.ss.android.ugc.aweme.discover.jedi.viewmodel.SearchState");
    }

    public final ListState<C28333l, C28294f> component1() {
        return this.listState;
    }

    public final C28295g component2() {
        return this.searchParam;
    }

    public final SearchState copy(ListState<C28333l, C28294f> listState2, C28295g gVar) {
        C52711k.m112240b(listState2, "listState");
        C52711k.m112240b(gVar, "searchParam");
        return new SearchState(listState2, gVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.searchParam, (java.lang.Object) r3.searchParam) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.discover.jedi.viewmodel.SearchState
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.discover.jedi.viewmodel.SearchState r3 = (com.p683ss.android.ugc.aweme.discover.jedi.viewmodel.SearchState) r3
            com.bytedance.jedi.arch.ext.list.ListState<com.ss.android.ugc.aweme.discover.mixfeed.l, com.ss.android.ugc.aweme.discover.jedi.viewmodel.f> r0 = r2.listState
            com.bytedance.jedi.arch.ext.list.ListState<com.ss.android.ugc.aweme.discover.mixfeed.l, com.ss.android.ugc.aweme.discover.jedi.viewmodel.f> r1 = r3.listState
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.discover.jedi.viewmodel.g r0 = r2.searchParam
            com.ss.android.ugc.aweme.discover.jedi.viewmodel.g r3 = r3.searchParam
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.discover.jedi.viewmodel.SearchState.equals(java.lang.Object):boolean");
    }

    public final ListState<C28333l, C28294f> getListState() {
        return this.listState;
    }

    public final C28295g getSearchParam() {
        return this.searchParam;
    }

    public final int hashCode() {
        ListState<C28333l, C28294f> listState2 = this.listState;
        int i = 0;
        int hashCode = (listState2 != null ? listState2.hashCode() : 0) * 31;
        C28295g gVar = this.searchParam;
        if (gVar != null) {
            i = gVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchState(listState=");
        sb.append(this.listState);
        sb.append(", searchParam=");
        sb.append(this.searchParam);
        sb.append(")");
        return sb.toString();
    }

    public SearchState(ListState<C28333l, C28294f> listState2, C28295g gVar) {
        C52711k.m112240b(listState2, "listState");
        C52711k.m112240b(gVar, "searchParam");
        this.listState = listState2;
        this.searchParam = gVar;
    }

    public /* synthetic */ SearchState(ListState listState2, C28295g gVar, int i, C52707g gVar2) {
        if ((i & 1) != 0) {
            C28294f fVar = new C28294f(null, false, 0, null, 15, null);
            listState2 = new ListState(fVar, null, null, null, null, 30, null);
        }
        if ((i & 2) != 0) {
            gVar = new C28295g("", 0, null, 0, 0, null, null, 126, null);
        }
        this(listState2, gVar);
    }
}
