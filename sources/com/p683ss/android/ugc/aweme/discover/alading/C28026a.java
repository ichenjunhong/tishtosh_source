package com.p683ss.android.ugc.aweme.discover.alading;

import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1324c;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.ViewGroup;

/* renamed from: com.ss.android.ugc.aweme.discover.alading.a */
public final class C28026a extends C1322a<C1352v> {

    /* renamed from: a */
    private C1322a f73632a;

    /* renamed from: b */
    private C1324c f73633b = new C1324c() {
        /* renamed from: a */
        public final void mo4984a() {
            super.mo4984a();
            C28026a.this.notifyDataSetChanged();
        }

        /* renamed from: b */
        public final void mo4988b(int i, int i2) {
            super.mo4988b(i, i2);
            C28026a.this.notifyItemRangeInserted(i, i2);
        }

        /* renamed from: c */
        public final void mo4989c(int i, int i2) {
            super.mo4989c(i, i2);
            C28026a.this.notifyItemRangeRemoved(i, i2);
        }

        /* renamed from: a */
        public final void mo4985a(int i, int i2) {
            super.mo4985a(i, i2);
            C28026a.this.notifyItemRangeChanged(i, i2);
        }

        /* renamed from: a */
        public final void mo4986a(int i, int i2, int i3) {
            super.mo4986a(i, i2, i3);
            C28026a.this.notifyDataSetChanged();
        }

        /* renamed from: a */
        public final void mo4987a(int i, int i2, Object obj) {
            super.mo4987a(i, i2, obj);
            C28026a.this.notifyItemRangeChanged(i, i2, obj);
        }
    };

    public final int getItemCount() {
        if (this.f73632a != null) {
            return this.f73632a.getItemCount();
        }
        return 0;
    }

    public final int getItemViewType(int i) {
        return this.f73632a.getItemViewType(i);
    }

    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        if (this.f73632a != null) {
            this.f73632a.onAttachedToRecyclerView(recyclerView);
        }
    }

    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        if (this.f73632a != null) {
            this.f73632a.onDetachedFromRecyclerView(recyclerView);
        }
    }

    public final boolean onFailedToRecycleView(C1352v vVar) {
        if (this.f73632a != null) {
            return this.f73632a.onFailedToRecycleView(vVar);
        }
        return super.onFailedToRecycleView(vVar);
    }

    public final void onViewAttachedToWindow(C1352v vVar) {
        super.onViewAttachedToWindow(vVar);
        if (this.f73632a != null) {
            this.f73632a.onViewAttachedToWindow(vVar);
        }
    }

    public final void onViewDetachedFromWindow(C1352v vVar) {
        super.onViewDetachedFromWindow(vVar);
        if (this.f73632a != null) {
            this.f73632a.onViewDetachedFromWindow(vVar);
        }
    }

    public final void onViewRecycled(C1352v vVar) {
        super.onViewRecycled(vVar);
        if (this.f73632a != null) {
            this.f73632a.onViewRecycled(vVar);
        }
    }

    /* renamed from: a */
    public final void mo56406a(C1322a aVar) {
        if (this.f73632a != aVar) {
            if (this.f73632a != null) {
                try {
                    this.f73632a.unregisterAdapterDataObserver(this.f73633b);
                } catch (Exception unused) {
                }
            }
            this.f73632a = aVar;
            aVar.registerAdapterDataObserver(this.f73633b);
        }
    }

    public final void onBindViewHolder(C1352v vVar, int i) {
        this.f73632a.onBindViewHolder(vVar, i);
    }

    public final C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        return this.f73632a.onCreateViewHolder(viewGroup, i);
    }
}
