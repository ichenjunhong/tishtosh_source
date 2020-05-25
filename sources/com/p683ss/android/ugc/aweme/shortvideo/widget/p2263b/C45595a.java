package com.p683ss.android.ugc.aweme.shortvideo.widget.p2263b;

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

/* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.b.a */
public final class C45595a extends C1322a<C1352v> {

    /* renamed from: a */
    public C0801o<View> f115333a = new C0801o<>();

    /* renamed from: b */
    public C0801o<View> f115334b = new C0801o<>();

    /* renamed from: c */
    private C1322a f115335c;

    /* renamed from: d */
    private C1324c f115336d = new C1324c() {
        /* renamed from: a */
        public final void mo4984a() {
            C45595a.this.notifyDataSetChanged();
        }

        /* renamed from: a */
        public final void mo4985a(int i, int i2) {
            C45595a.this.notifyItemRangeChanged(C45595a.this.mo91983a() + i, i2);
        }

        /* renamed from: b */
        public final void mo4988b(int i, int i2) {
            C45595a.this.notifyItemRangeInserted(C45595a.this.mo91983a() + i, i2);
        }

        /* renamed from: c */
        public final void mo4989c(int i, int i2) {
            C45595a.this.notifyItemRangeRemoved(C45595a.this.mo91983a() + i, i2);
        }

        /* renamed from: a */
        public final void mo4986a(int i, int i2, int i3) {
            C45595a.this.notifyItemMoved(C45595a.this.mo91983a() + i, C45595a.this.mo91983a() + i2);
        }

        /* renamed from: a */
        public final void mo4987a(int i, int i2, Object obj) {
            C45595a.this.notifyItemRangeChanged(C45595a.this.mo91983a() + i, i2, obj);
        }
    };

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.b.a$a */
    public interface C45599a {
        /* renamed from: a */
        int mo91985a(GridLayoutManager gridLayoutManager, C1302b bVar, int i);
    }

    /* renamed from: c */
    private int m99323c() {
        return this.f115335c.getItemCount();
    }

    /* renamed from: a */
    public final int mo91983a() {
        return this.f115333a.mo2596c();
    }

    /* renamed from: b */
    public int mo91984b() {
        return this.f115334b.mo2596c();
    }

    public final int getItemCount() {
        return mo91983a() + mo91984b() + m99323c();
    }

    /* renamed from: a */
    private boolean m99321a(int i) {
        if (i < mo91983a()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private boolean m99322b(int i) {
        if (i >= mo91983a() + m99323c()) {
            return true;
        }
        return false;
    }

    public final void registerAdapterDataObserver(C1324c cVar) {
        super.registerAdapterDataObserver(cVar);
        this.f115335c.registerAdapterDataObserver(this.f115336d);
    }

    public final void unregisterAdapterDataObserver(C1324c cVar) {
        super.unregisterAdapterDataObserver(cVar);
        this.f115335c.unregisterAdapterDataObserver(this.f115336d);
    }

    public C45595a(C1322a aVar) {
        this.f115335c = aVar;
    }

    public final int getItemViewType(int i) {
        if (m99321a(i)) {
            return this.f115333a.mo2597c(i);
        }
        if (m99322b(i)) {
            return this.f115334b.mo2597c((i - mo91983a()) - m99323c());
        }
        return this.f115335c.getItemViewType(i - mo91983a());
    }

    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        this.f115335c.onAttachedToRecyclerView(recyclerView);
        final C455961 r0 = new C45599a() {
            /* renamed from: a */
            public final int mo91985a(GridLayoutManager gridLayoutManager, C1302b bVar, int i) {
                int itemViewType = C45595a.this.getItemViewType(i);
                if (C45595a.this.f115333a.mo2591a(itemViewType) != null) {
                    return gridLayoutManager.f4521b;
                }
                if (C45595a.this.f115334b.mo2591a(itemViewType) != null) {
                    return gridLayoutManager.f4521b;
                }
                if (bVar != null) {
                    return bVar.mo4690a(i - C45595a.this.mo91983a());
                }
                return 1;
            }
        };
        C1332i layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            final GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            final C1302b bVar = gridLayoutManager.f4526g;
            gridLayoutManager.f4526g = new C1302b() {
                /* renamed from: a */
                public final int mo4690a(int i) {
                    return r0.mo91985a(gridLayoutManager, bVar, i);
                }
            };
            gridLayoutManager.mo4672a(gridLayoutManager.f4521b);
        }
    }

    public final void onViewAttachedToWindow(C1352v vVar) {
        this.f115335c.onViewAttachedToWindow(vVar);
        int layoutPosition = vVar.getLayoutPosition();
        if (m99321a(layoutPosition) || m99322b(layoutPosition)) {
            LayoutParams layoutParams = vVar.itemView.getLayoutParams();
            if (layoutParams != null && (layoutParams instanceof StaggeredGridLayoutManager.LayoutParams)) {
                ((StaggeredGridLayoutManager.LayoutParams) layoutParams).f4918b = true;
            }
        }
    }

    public final void onBindViewHolder(C1352v vVar, int i) {
        if (!m99321a(i) && !m99322b(i)) {
            this.f115335c.onBindViewHolder(vVar, i - mo91983a());
        }
    }

    public final C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (this.f115333a.mo2591a(i) != null) {
            C45600b a = C45600b.m99335a(viewGroup.getContext(), (View) this.f115333a.mo2591a(i));
            a.setIsRecyclable(false);
            return a;
        } else if (this.f115334b.mo2591a(i) == null) {
            return this.f115335c.onCreateViewHolder(viewGroup, i);
        } else {
            C45600b a2 = C45600b.m99335a(viewGroup.getContext(), (View) this.f115334b.mo2591a(i));
            a2.setIsRecyclable(false);
            return a2;
        }
    }
}
