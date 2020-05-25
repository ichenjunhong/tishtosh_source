package com.bytedance.jedi.arch.ext.list;

import com.bytedance.jedi.arch.C11787a;
import com.bytedance.jedi.arch.C11790ac;
import com.bytedance.jedi.arch.C11932s;
import com.bytedance.jedi.arch.ext.list.C11865l;
import java.util.List;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

public final class ListState<T, P extends C11865l> implements C11932s {
    private final C11853b isEmpty;
    private final List<T> list;
    private final C11787a<List<T>> loadMore;
    private final P payload;
    private final C11787a<List<T>> refresh;

    /* JADX WARNING: Incorrect type for immutable var: ssa=com.bytedance.jedi.arch.a, code=com.bytedance.jedi.arch.a<java.util.List<T>>, for r6v0, types: [com.bytedance.jedi.arch.a] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=com.bytedance.jedi.arch.a, code=com.bytedance.jedi.arch.a<java.util.List<T>>, for r7v0, types: [com.bytedance.jedi.arch.a] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=com.bytedance.jedi.arch.ext.list.l, code=P, for r4v0, types: [com.bytedance.jedi.arch.ext.list.l] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<T>, for r5v0, types: [java.util.List] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.bytedance.jedi.arch.ext.list.ListState copy$default(com.bytedance.jedi.arch.ext.list.ListState r3, P r4, java.util.List<T> r5, com.bytedance.jedi.arch.C11787a<java.util.List<T>> r6, com.bytedance.jedi.arch.C11787a<java.util.List<T>> r7, com.bytedance.jedi.arch.ext.list.C11853b r8, int r9, java.lang.Object r10) {
        /*
            r10 = r9 & 1
            if (r10 == 0) goto L_0x0006
            P r4 = r3.payload
        L_0x0006:
            r10 = r9 & 2
            if (r10 == 0) goto L_0x000c
            java.util.List<T> r5 = r3.list
        L_0x000c:
            r10 = r5
            r5 = r9 & 4
            if (r5 == 0) goto L_0x0013
            com.bytedance.jedi.arch.a<java.util.List<T>> r6 = r3.refresh
        L_0x0013:
            r0 = r6
            r5 = r9 & 8
            if (r5 == 0) goto L_0x001a
            com.bytedance.jedi.arch.a<java.util.List<T>> r7 = r3.loadMore
        L_0x001a:
            r1 = r7
            r5 = r9 & 16
            if (r5 == 0) goto L_0x0021
            com.bytedance.jedi.arch.ext.list.b r8 = r3.isEmpty
        L_0x0021:
            r2 = r8
            r5 = r3
            r6 = r4
            r7 = r10
            r8 = r0
            r9 = r1
            r10 = r2
            com.bytedance.jedi.arch.ext.list.ListState r3 = r5.copy(r6, r7, r8, r9, r10)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.jedi.arch.ext.list.ListState.copy$default(com.bytedance.jedi.arch.ext.list.ListState, com.bytedance.jedi.arch.ext.list.l, java.util.List, com.bytedance.jedi.arch.a, com.bytedance.jedi.arch.a, com.bytedance.jedi.arch.ext.list.b, int, java.lang.Object):com.bytedance.jedi.arch.ext.list.ListState");
    }

    public final P component1() {
        return this.payload;
    }

    public final List<T> component2() {
        return this.list;
    }

    public final C11787a<List<T>> component3() {
        return this.refresh;
    }

    public final C11787a<List<T>> component4() {
        return this.loadMore;
    }

    public final C11853b component5() {
        return this.isEmpty;
    }

    public final ListState<T, P> copy(P p, List<? extends T> list2, C11787a<? extends List<? extends T>> aVar, C11787a<? extends List<? extends T>> aVar2, C11853b bVar) {
        C52711k.m112240b(p, "payload");
        C52711k.m112240b(list2, "list");
        C52711k.m112240b(aVar, "refresh");
        C52711k.m112240b(aVar2, "loadMore");
        C52711k.m112240b(bVar, "isEmpty");
        ListState listState = new ListState(p, list2, aVar, aVar2, bVar);
        return listState;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0038, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.isEmpty, (java.lang.Object) r3.isEmpty) != false) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x003d
            boolean r0 = r3 instanceof com.bytedance.jedi.arch.ext.list.ListState
            if (r0 == 0) goto L_0x003b
            com.bytedance.jedi.arch.ext.list.ListState r3 = (com.bytedance.jedi.arch.ext.list.ListState) r3
            P r0 = r2.payload
            P r1 = r3.payload
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x003b
            java.util.List<T> r0 = r2.list
            java.util.List<T> r1 = r3.list
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x003b
            com.bytedance.jedi.arch.a<java.util.List<T>> r0 = r2.refresh
            com.bytedance.jedi.arch.a<java.util.List<T>> r1 = r3.refresh
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x003b
            com.bytedance.jedi.arch.a<java.util.List<T>> r0 = r2.loadMore
            com.bytedance.jedi.arch.a<java.util.List<T>> r1 = r3.loadMore
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x003b
            com.bytedance.jedi.arch.ext.list.b r0 = r2.isEmpty
            com.bytedance.jedi.arch.ext.list.b r3 = r3.isEmpty
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
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.jedi.arch.ext.list.ListState.equals(java.lang.Object):boolean");
    }

    public final List<T> getList() {
        return this.list;
    }

    public final C11787a<List<T>> getLoadMore() {
        return this.loadMore;
    }

    public final P getPayload() {
        return this.payload;
    }

    public final C11787a<List<T>> getRefresh() {
        return this.refresh;
    }

    public final int hashCode() {
        P p = this.payload;
        int i = 0;
        int hashCode = (p != null ? p.hashCode() : 0) * 31;
        List<T> list2 = this.list;
        int hashCode2 = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
        C11787a<List<T>> aVar = this.refresh;
        int hashCode3 = (hashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        C11787a<List<T>> aVar2 = this.loadMore;
        int hashCode4 = (hashCode3 + (aVar2 != null ? aVar2.hashCode() : 0)) * 31;
        C11853b bVar = this.isEmpty;
        if (bVar != null) {
            i = bVar.hashCode();
        }
        return hashCode4 + i;
    }

    public final C11853b isEmpty() {
        return this.isEmpty;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ListState(payload=");
        sb.append(this.payload);
        sb.append(", list=");
        sb.append(this.list);
        sb.append(", refresh=");
        sb.append(this.refresh);
        sb.append(", loadMore=");
        sb.append(this.loadMore);
        sb.append(", isEmpty=");
        sb.append(this.isEmpty);
        sb.append(")");
        return sb.toString();
    }

    public final C11853b getHasMore() {
        return this.payload.f31449a;
    }

    public ListState(P p, List<? extends T> list2, C11787a<? extends List<? extends T>> aVar, C11787a<? extends List<? extends T>> aVar2, C11853b bVar) {
        C52711k.m112240b(p, "payload");
        C52711k.m112240b(list2, "list");
        C52711k.m112240b(aVar, "refresh");
        C52711k.m112240b(aVar2, "loadMore");
        C52711k.m112240b(bVar, "isEmpty");
        this.payload = p;
        this.list = list2;
        this.refresh = aVar;
        this.loadMore = aVar2;
        this.isEmpty = bVar;
    }

    public /* synthetic */ ListState(C11865l lVar, List list2, C11787a aVar, C11787a aVar2, C11853b bVar, int i, C52707g gVar) {
        if ((i & 2) != 0) {
            list2 = C52575l.m112097a();
        }
        List list3 = list2;
        if ((i & 4) != 0) {
            aVar = C11790ac.f31299a;
        }
        C11787a aVar3 = aVar;
        if ((i & 8) != 0) {
            aVar2 = C11790ac.f31299a;
        }
        C11787a aVar4 = aVar2;
        if ((i & 16) != 0) {
            bVar = new C11853b(false);
        }
        this(lVar, list3, aVar3, aVar4, bVar);
    }
}
