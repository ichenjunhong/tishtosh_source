package com.bytedance.jedi.arch.ext.list;

import com.bytedance.jedi.arch.C11787a;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.jedi.arch.ext.list.j */
public final class C11861j {
    /* renamed from: a */
    public static final <T, P extends C11865l> List<T> m24211a(IListState<T, P> iListState) {
        C52711k.m112240b(iListState, "$this$list");
        return ((ListState) iListState.getSubstate()).getList();
    }

    /* renamed from: b */
    public static final <T, P extends C11865l> C11787a<List<T>> m24212b(IListState<T, P> iListState) {
        C52711k.m112240b(iListState, "$this$refresh");
        return ((ListState) iListState.getSubstate()).getRefresh();
    }

    /* renamed from: c */
    public static final <T, P extends C11865l> C11787a<List<T>> m24213c(IListState<T, P> iListState) {
        C52711k.m112240b(iListState, "$this$loadMore");
        return ((ListState) iListState.getSubstate()).getLoadMore();
    }

    /* renamed from: d */
    public static final <T, P extends C11865l> C11853b m24214d(IListState<T, P> iListState) {
        C52711k.m112240b(iListState, "$this$hasMore");
        return ((ListState) iListState.getSubstate()).getHasMore();
    }
}
