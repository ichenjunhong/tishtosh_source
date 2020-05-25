package com.p683ss.android.ugc.aweme.discover.p1635a;

import android.support.p030v4.p038f.C0801o;
import android.support.p043v7.widget.GridLayoutManager;
import android.support.p043v7.widget.GridLayoutManager.C1302b;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1324c;
import android.support.p043v7.widget.RecyclerView.C1332i;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.support.p043v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.a.c */
public class C27718c extends C1322a<C1352v> {

    /* renamed from: a */
    public final ArrayList<C27739k> f72749a = new ArrayList<>();

    /* renamed from: b */
    public final C0801o<C27739k> f72750b = new C0801o<>();

    /* renamed from: c */
    public final C27740l f72751c = new C27740l();

    /* renamed from: d */
    public RecyclerView f72752d;

    /* renamed from: e */
    public C1322a<C1352v> f72753e;

    /* renamed from: f */
    private final ArrayList<C27739k> f72754f = new ArrayList<>();

    /* renamed from: g */
    private final C0801o<C27739k> f72755g = new C0801o<>();

    /* renamed from: h */
    private final C27719a f72756h = new C27719a(this);

    /* renamed from: com.ss.android.ugc.aweme.discover.a.c$a */
    public static final class C27719a extends C1324c {

        /* renamed from: a */
        final /* synthetic */ C27718c f72757a;

        /* renamed from: a */
        public final void mo4984a() {
            this.f72757a.notifyDataSetChanged();
        }

        C27719a(C27718c cVar) {
            this.f72757a = cVar;
        }

        /* renamed from: a */
        public final void mo4985a(int i, int i2) {
            this.f72757a.notifyItemRangeChanged(this.f72757a.mo56144a() + i, i2);
        }

        /* renamed from: b */
        public final void mo4988b(int i, int i2) {
            this.f72757a.notifyItemRangeInserted(this.f72757a.mo56144a() + i, i2);
        }

        /* renamed from: c */
        public final void mo4989c(int i, int i2) {
            this.f72757a.notifyItemRangeRemoved(this.f72757a.mo56144a() + i, i2);
        }

        /* renamed from: a */
        public final void mo4986a(int i, int i2, int i3) {
            this.f72757a.notifyItemMoved(this.f72757a.mo56144a() + i, this.f72757a.mo56144a() + i2);
        }

        /* renamed from: a */
        public final void mo4987a(int i, int i2, Object obj) {
            this.f72757a.notifyItemRangeChanged(this.f72757a.mo56144a() + i, i2, obj);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.a.c$b */
    public static final class C27720b extends C1302b {

        /* renamed from: c */
        final /* synthetic */ C27718c f72758c;

        /* renamed from: d */
        final /* synthetic */ GridLayoutManager f72759d;

        /* renamed from: e */
        final /* synthetic */ C1302b f72760e;

        /* renamed from: a */
        public final int mo4690a(int i) {
            if (this.f72758c.mo56146a(this.f72758c.getItemViewType(i))) {
                GridLayoutManager gridLayoutManager = this.f72759d;
                if (gridLayoutManager != null) {
                    return gridLayoutManager.f4521b;
                }
            } else if (this.f72760e != null) {
                return this.f72760e.mo4690a(i - this.f72758c.mo56144a());
            }
            return 1;
        }

        C27720b(C27718c cVar, GridLayoutManager gridLayoutManager, C1302b bVar) {
            this.f72758c = cVar;
            this.f72759d = gridLayoutManager;
            this.f72760e = bVar;
        }
    }

    /* renamed from: c */
    private int mo56153c() {
        return this.f72753e.getItemCount();
    }

    /* renamed from: d */
    private final int m66369d() {
        return this.f72754f.size();
    }

    /* renamed from: a */
    public final int mo56144a() {
        return this.f72749a.size();
    }

    public int getItemCount() {
        return mo56144a() + m66369d() + mo56153c();
    }

    /* renamed from: b */
    public final List<View> mo56147b() {
        Iterable<C27739k> iterable = this.f72749a;
        Collection arrayList = new ArrayList(C52575l.m112104a(iterable, 10));
        for (C27739k kVar : iterable) {
            arrayList.add(kVar.itemView);
        }
        return (List) arrayList;
    }

    /* renamed from: b */
    private final boolean mo56152b(int i) {
        if (i < mo56144a()) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private final boolean mo56154c(int i) {
        if (i >= mo56144a() + mo56153c()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo56145a(View view) {
        m66365a(this.f72754f.size(), view);
    }

    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        C52711k.m112240b(recyclerView, "recyclerView");
        this.f72752d = null;
        this.f72753e.onDetachedFromRecyclerView(recyclerView);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo56146a(int i) {
        return C27740l.m66407a(i);
    }

    public boolean onFailedToRecycleView(C1352v vVar) {
        C52711k.m112240b(vVar, "holder");
        if (mo56146a(vVar.mItemViewType)) {
            return super.onFailedToRecycleView(vVar);
        }
        return this.f72753e.onFailedToRecycleView(vVar);
    }

    public void onViewDetachedFromWindow(C1352v vVar) {
        C52711k.m112240b(vVar, "holder");
        if (mo56146a(vVar.mItemViewType)) {
            super.onViewDetachedFromWindow(vVar);
        } else {
            this.f72753e.onViewDetachedFromWindow(vVar);
        }
    }

    public void onViewRecycled(C1352v vVar) {
        C52711k.m112240b(vVar, "holder");
        if (mo56146a(vVar.mItemViewType)) {
            super.onViewRecycled(vVar);
        } else {
            this.f72753e.onViewRecycled(vVar);
        }
    }

    public void registerAdapterDataObserver(C1324c cVar) {
        C52711k.m112240b(cVar, "observer");
        super.registerAdapterDataObserver(cVar);
        this.f72753e.registerAdapterDataObserver(this.f72756h);
    }

    public void unregisterAdapterDataObserver(C1324c cVar) {
        C52711k.m112240b(cVar, "observer");
        super.unregisterAdapterDataObserver(cVar);
        this.f72753e.unregisterAdapterDataObserver(this.f72756h);
    }

    public C27718c(C1322a<C1352v> aVar) {
        C52711k.m112240b(aVar, "innerAdapter");
        this.f72753e = aVar;
        setHasStableIds(this.f72753e.mHasStableIds);
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C52711k.m112240b(recyclerView, "recyclerView");
        this.f72752d = recyclerView;
        this.f72753e.onAttachedToRecyclerView(recyclerView);
        C1332i layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            gridLayoutManager.f4526g = new C27720b(this, gridLayoutManager, gridLayoutManager.f4526g);
        }
    }

    public void onViewAttachedToWindow(C1352v vVar) {
        C52711k.m112240b(vVar, "holder");
        if (mo56146a(vVar.mItemViewType)) {
            View view = vVar.itemView;
            C52711k.m112236a((Object) view, "holder.itemView");
            LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof StaggeredGridLayoutManager.LayoutParams) {
                ((StaggeredGridLayoutManager.LayoutParams) layoutParams).f4918b = true;
            }
        } else {
            this.f72753e.onViewAttachedToWindow(vVar);
        }
    }

    public int getItemViewType(int i) {
        if (mo56152b(i)) {
            return ((C27739k) this.f72749a.get(i)).f72798a;
        }
        if (mo56154c(i)) {
            return ((C27739k) this.f72754f.get((i - mo56144a()) - mo56153c())).f72798a;
        }
        int itemViewType = this.f72753e.getItemViewType(i - mo56144a());
        if (!mo56146a(itemViewType)) {
            return itemViewType;
        }
        throw new IllegalArgumentException("HeaderAndFooterWrapper use the viewType between 100000 and 110000");
    }

    public void onBindViewHolder(C1352v vVar, int i) {
        C52711k.m112240b(vVar, "holder");
        if (!mo56152b(i) && !mo56154c(i)) {
            this.f72753e.onBindViewHolder(vVar, i - mo56144a());
        }
    }

    /* renamed from: a */
    private void m66365a(int i, View view) {
        if (i >= 0 && i <= this.f72754f.size() && view != null) {
            int a = this.f72751c.mo56168a();
            C27739k kVar = new C27739k(a, view);
            this.f72754f.add(kVar);
            this.f72755g.mo2595b(a, kVar);
            notifyItemInserted((getItemCount() - m66369d()) + i);
        }
    }

    public C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        C52711k.m112240b(viewGroup, "parent");
        C27739k kVar = (C27739k) this.f72750b.mo2591a(i);
        if (kVar == null) {
            kVar = (C27739k) this.f72755g.mo2591a(i);
        }
        if (kVar != null) {
            return kVar;
        }
        C1352v onCreateViewHolder = this.f72753e.onCreateViewHolder(viewGroup, i);
        C52711k.m112236a((Object) onCreateViewHolder, "innerAdapter.onCreateViewHolder(parent, viewType)");
        return onCreateViewHolder;
    }

    public void onBindViewHolder(C1352v vVar, int i, List<Object> list) {
        C52711k.m112240b(vVar, "holder");
        C52711k.m112240b(list, "payloads");
        if (!mo56152b(i) && !mo56154c(i)) {
            this.f72753e.onBindViewHolder(vVar, i - mo56144a(), list);
        }
    }
}
