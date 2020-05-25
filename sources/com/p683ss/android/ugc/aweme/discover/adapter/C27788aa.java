package com.p683ss.android.ugc.aweme.discover.adapter;

import android.support.p043v7.widget.GridLayoutManager;
import android.support.p043v7.widget.GridLayoutManager.C1302b;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1324c;
import android.support.p043v7.widget.RecyclerView.C1340m;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.aa */
public final class C27788aa<VH extends C1352v> extends C1322a<C1352v> {

    /* renamed from: a */
    public int f73026a = 1;

    /* renamed from: b */
    public final C1322a<VH> f73027b;

    /* renamed from: c */
    final C27796ac f73028c;

    /* renamed from: d */
    final C27794e f73029d;

    /* renamed from: e */
    RecyclerView f73030e;

    /* renamed from: f */
    C27793d f73031f;

    /* renamed from: g */
    C1340m f73032g;

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.aa$a */
    static class C27790a extends C1340m {

        /* renamed from: a */
        C27794e f73033a;

        C27790a(C27794e eVar) {
            this.f73033a = eVar;
        }

        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
        }

        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            recyclerView.canScrollVertically(1);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.aa$b */
    static class C27791b implements C27796ac {
        private C27791b() {
        }

        /* renamed from: a */
        public final C27795ab mo56231a(ViewGroup viewGroup) {
            return new C27792c(new LoadMoreLoadingLayout(viewGroup.getContext()));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.aa$c */
    static class C27792c extends C27795ab {

        /* renamed from: a */
        LoadMoreLoadingLayout f73034a;

        C27792c(View view) {
            super(view);
            this.f73034a = (LoadMoreLoadingLayout) view;
        }

        /* renamed from: a */
        public final void mo56232a(int i) {
            this.f73034a.setState(i);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.aa$d */
    static class C27793d extends C1302b {

        /* renamed from: c */
        RecyclerView f73035c;

        /* renamed from: d */
        GridLayoutManager f73036d;

        /* renamed from: e */
        C1302b f73037e;

        C27793d() {
        }

        /* renamed from: a */
        public final int mo4690a(int i) {
            if (i < this.f73035c.getAdapter().getItemCount() - 1) {
                return this.f73037e.mo4690a(i);
            }
            return this.f73036d.f4521b;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.aa$e */
    public interface C27794e {
    }

    public final int getItemCount() {
        return this.f73027b.getItemCount() + 1;
    }

    /* renamed from: a */
    public static <VH extends C1352v> C27788aa<VH> m66530a(C1322a<VH> aVar) {
        return m66531a(aVar, (C27796ac) null);
    }

    public final void setHasStableIds(boolean z) {
        this.f73027b.setHasStableIds(z);
    }

    public final boolean onFailedToRecycleView(C1352v vVar) {
        if (vVar instanceof C27795ab) {
            return super.onFailedToRecycleView(vVar);
        }
        return this.f73027b.onFailedToRecycleView(vVar);
    }

    public final void onViewAttachedToWindow(C1352v vVar) {
        if (vVar instanceof C27795ab) {
            super.onViewAttachedToWindow(vVar);
        } else {
            this.f73027b.onViewAttachedToWindow(vVar);
        }
    }

    public final void onViewDetachedFromWindow(C1352v vVar) {
        if (vVar instanceof C27795ab) {
            super.onViewDetachedFromWindow(vVar);
        } else {
            this.f73027b.onViewDetachedFromWindow(vVar);
        }
    }

    public final void onViewRecycled(C1352v vVar) {
        if (vVar instanceof C27795ab) {
            super.onViewRecycled(vVar);
        } else {
            this.f73027b.onViewRecycled(vVar);
        }
    }

    public final void registerAdapterDataObserver(C1324c cVar) {
        super.registerAdapterDataObserver(cVar);
        this.f73027b.registerAdapterDataObserver(cVar);
    }

    public final void unregisterAdapterDataObserver(C1324c cVar) {
        super.unregisterAdapterDataObserver(cVar);
        this.f73027b.unregisterAdapterDataObserver(cVar);
    }

    public final long getItemId(int i) {
        if (i < this.f73027b.getItemCount()) {
            return this.f73027b.getItemId(i);
        }
        return super.getItemId(i);
    }

    public final int getItemViewType(int i) {
        if (i < this.f73027b.getItemCount()) {
            return this.f73027b.getItemViewType(i);
        }
        return 65298;
    }

    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        this.f73027b.onDetachedFromRecyclerView(recyclerView);
        if (this.f73031f != null) {
            this.f73031f = null;
        }
        if (this.f73032g != null) {
            this.f73030e.mo4818b(this.f73032g);
        }
        this.f73030e = null;
        super.onDetachedFromRecyclerView(recyclerView);
    }

    /* renamed from: a */
    public final void mo56230a(int i) {
        if (i == 0 || i == 1 || i == 3 || i == 2) {
            int i2 = this.f73026a;
            if (i2 != i) {
                this.f73026a = i;
                m66533a(i2, i);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("state must be one of STATE_OK, STATE_LOADING, STATE_EMPTY and STATE_ERROR.");
    }

    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.f73030e = recyclerView;
        if (this.f73031f == null && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            this.f73031f = new C27793d();
            C27793d dVar = this.f73031f;
            dVar.f73035c = recyclerView;
            dVar.f73036d = (GridLayoutManager) recyclerView.getLayoutManager();
            dVar.f73037e = dVar.f73036d.f4526g;
            dVar.f73036d.f4526g = dVar;
        }
        if (this.f73032g == null && this.f73029d != null) {
            this.f73032g = new C27790a(this.f73029d);
        }
        if (this.f73032g != null) {
            this.f73030e.mo4801a(this.f73032g);
        }
        this.f73027b.onAttachedToRecyclerView(recyclerView);
    }

    /* renamed from: a */
    private static <VH extends C1352v> C27788aa<VH> m66531a(C1322a<VH> aVar, C27796ac acVar) {
        return m66532a(aVar, null, null);
    }

    /* renamed from: a */
    private void m66533a(int i, int i2) {
        notifyItemChanged(getItemCount() - 1);
    }

    public final void onBindViewHolder(C1352v vVar, int i) {
        if (i < this.f73027b.getItemCount()) {
            this.f73027b.onBindViewHolder(vVar, i);
        } else {
            ((C27795ab) vVar).mo56232a(this.f73026a);
        }
    }

    public final C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 65298) {
            return this.f73028c.mo56231a(viewGroup);
        }
        return this.f73027b.onCreateViewHolder(viewGroup, i);
    }

    private C27788aa(C1322a<VH> aVar, C27796ac acVar, C27794e eVar) {
        this.f73027b = aVar;
        this.f73028c = acVar;
        this.f73029d = eVar;
    }

    /* renamed from: a */
    private static <VH extends C1352v> C27788aa<VH> m66532a(C1322a<VH> aVar, C27796ac acVar, C27794e eVar) {
        if (aVar == null) {
            throw new NullPointerException();
        } else if (!(aVar instanceof C27788aa)) {
            if (acVar == null) {
                acVar = new C27791b();
            }
            return new C27788aa<>(aVar, acVar, null);
        } else {
            throw new IllegalArgumentException("LoadMoreAdapter can't wrap itself.");
        }
    }

    public final void onBindViewHolder(C1352v vVar, int i, List<Object> list) {
        if (i < this.f73027b.getItemCount()) {
            this.f73027b.onBindViewHolder(vVar, i, list);
        } else {
            super.onBindViewHolder(vVar, i, list);
        }
    }
}
