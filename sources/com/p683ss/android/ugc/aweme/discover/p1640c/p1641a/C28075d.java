package com.p683ss.android.ugc.aweme.discover.p1640c.p1641a;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.common.p1589a.C26835b;
import com.p683ss.android.ugc.aweme.discover.adapter.viewholder.C27998c;
import com.p683ss.android.ugc.aweme.discover.adapter.viewholder.C27998c.C28000b;
import com.p683ss.android.ugc.aweme.discover.adapter.viewholder.C27998c.C28002c;
import com.p683ss.android.ugc.aweme.discover.adapter.viewholder.C28003d;
import com.p683ss.android.ugc.aweme.discover.model.SearchHistory;
import com.p683ss.android.ugc.aweme.discover.p1659ui.C28522ay.C28524b;
import com.p683ss.android.ugc.aweme.search.C41424g;
import com.ss.android.ugc.trill.R;
import java.util.List;
import p2628d.C52857u;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.c.a.d */
public final class C28075d extends C26835b<List<? extends Object>> {

    /* renamed from: a */
    public C28524b f73757a;

    /* renamed from: a */
    public final C1352v mo51021a(ViewGroup viewGroup) {
        C52711k.m112240b(viewGroup, "parent");
        if (C41424g.m91246f()) {
            C28524b bVar = this.f73757a;
            C52711k.m112240b(viewGroup, "parent");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bsg, viewGroup, false);
            C52711k.m112236a((Object) inflate, "inflate");
            return new C27998c(inflate, bVar);
        }
        C28524b bVar2 = this.f73757a;
        C52711k.m112240b(viewGroup, "parent");
        View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bsh, viewGroup, false);
        C52711k.m112236a((Object) inflate2, "view");
        return new C28003d(inflate2, bVar2);
    }

    /* renamed from: a */
    public final /* synthetic */ boolean mo51023a(Object obj, int i) {
        List list = (List) obj;
        C52711k.m112240b(list, "items");
        Object obj2 = list.get(i);
        if (!(obj2 instanceof List) || !(C52575l.m112140f((List) obj2) instanceof SearchHistory)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo51022a(Object obj, int i, C1352v vVar, List list) {
        List list2 = (List) obj;
        C52711k.m112240b(list2, "items");
        C52711k.m112240b(vVar, "holder");
        C52711k.m112240b(list, "payloads");
        Object obj2 = list2.get(i);
        if (vVar instanceof C27998c) {
            C27998c cVar = (C27998c) vVar;
            if (obj2 != null) {
                List list3 = (List) obj2;
                C52711k.m112240b(list3, "histories");
                cVar.f73552b.setAdapter(new C28000b(cVar, list3, list3));
                cVar.f73551a.setOnClickListener(new C28002c(cVar));
                return;
            }
            throw new C52857u("null cannot be cast to non-null type kotlin.collections.List<com.ss.android.ugc.aweme.discover.model.SearchHistory>");
        }
        if (vVar instanceof C28003d) {
            C28003d dVar = (C28003d) vVar;
            if (obj2 != null) {
                dVar.mo56388a((List) obj2);
            } else {
                throw new C52857u("null cannot be cast to non-null type kotlin.collections.List<com.ss.android.ugc.aweme.discover.model.SearchHistory>");
            }
        }
    }
}
