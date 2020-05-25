package com.p683ss.android.ugc.aweme.commercialize.anchor.p1546a;

import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.common.p1589a.C26835b;
import com.p683ss.android.ugc.aweme.common.p1589a.C26836c;
import com.p683ss.android.ugc.aweme.feed.model.WikipediaInfo;
import java.util.List;
import java.util.Map;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.anchor.a.c */
public final class C25607c extends C1322a<C1352v> {

    /* renamed from: a */
    public final List<WikipediaInfo> f67786a;

    /* renamed from: b */
    private final C26836c<List<WikipediaInfo>> f67787b = new C26836c<>();

    public final int getItemCount() {
        return this.f67786a.size();
    }

    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C52711k.m112240b(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        this.f67787b.mo54765a(recyclerView);
    }

    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        C52711k.m112240b(recyclerView, "recyclerView");
        super.onDetachedFromRecyclerView(recyclerView);
        this.f67787b.mo54768b(recyclerView);
    }

    public final int getItemViewType(int i) {
        if (i < this.f67786a.size()) {
            return this.f67787b.mo54760a(this.f67786a, i);
        }
        return super.getItemViewType(i);
    }

    public final void onBindViewHolder(C1352v vVar, int i) {
        C52711k.m112240b(vVar, "holder");
        this.f67787b.mo54766a(this.f67786a, i, vVar);
    }

    public final C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        C52711k.m112240b(viewGroup, "parent");
        C1352v a = this.f67787b.mo54761a(viewGroup, i);
        C52711k.m112236a((Object) a, "delegateMgr.onCreateViewHolder(parent, viewType)");
        return a;
    }

    public C25607c(List<WikipediaInfo> list, Map<String, String> map, C52671b<? super WikipediaInfo, C52860x> bVar) {
        C52711k.m112240b(list, "data");
        C52711k.m112240b(map, "params");
        C52711k.m112240b(bVar, "clickItemAction");
        this.f67786a = list;
        this.f67787b.mo54763a((C26835b<T>) new C25606b<T>(map, bVar));
    }
}
