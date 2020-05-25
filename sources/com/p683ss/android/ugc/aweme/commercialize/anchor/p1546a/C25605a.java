package com.p683ss.android.ugc.aweme.commercialize.anchor.p1546a;

import android.arch.lifecycle.C0184k;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.commercialize.anchor.C25626g;
import com.p683ss.android.ugc.aweme.common.p1589a.C26835b;
import com.p683ss.android.ugc.aweme.common.p1589a.C26836c;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.anchor.a.a */
public final class C25605a extends C1322a<C1352v> {

    /* renamed from: a */
    public List<C25626g> f67781a;

    /* renamed from: b */
    public final C0184k f67782b;

    /* renamed from: c */
    private final C26836c<List<C25626g>> f67783c = new C26836c<>();

    public final int getItemCount() {
        return this.f67781a.size();
    }

    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C52711k.m112240b(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        this.f67783c.mo54765a(recyclerView);
    }

    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        C52711k.m112240b(recyclerView, "recyclerView");
        super.onDetachedFromRecyclerView(recyclerView);
        this.f67783c.mo54768b(recyclerView);
    }

    public final int getItemViewType(int i) {
        if (i < this.f67781a.size()) {
            return this.f67783c.mo54760a(this.f67781a, i);
        }
        return super.getItemViewType(i);
    }

    public final void onBindViewHolder(C1352v vVar, int i) {
        C52711k.m112240b(vVar, "holder");
        this.f67783c.mo54766a(this.f67781a, i, vVar);
    }

    public final C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        C52711k.m112240b(viewGroup, "parent");
        C1352v a = this.f67783c.mo54761a(viewGroup, i);
        C52711k.m112236a((Object) a, "delegatesManager.onCreat…wHolder(parent, viewType)");
        return a;
    }

    public C25605a(List<C25626g> list, C0184k kVar) {
        C52711k.m112240b(list, "data");
        C52711k.m112240b(kVar, "lifecycleOwner");
        this.f67781a = list;
        this.f67782b = kVar;
        this.f67783c.mo54763a((C26835b<T>) new C25610e<T>(this.f67782b));
    }
}
