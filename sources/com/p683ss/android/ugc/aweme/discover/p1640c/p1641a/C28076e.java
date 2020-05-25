package com.p683ss.android.ugc.aweme.discover.p1640c.p1641a;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.common.p1589a.C26835b;
import com.p683ss.android.ugc.aweme.discover.adapter.viewholder.C27995b;
import com.p683ss.android.ugc.aweme.discover.adapter.viewholder.C28010e;
import com.p683ss.android.ugc.aweme.discover.model.SearchHistory;
import com.p683ss.android.ugc.aweme.discover.p1659ui.C28522ay.C28524b;
import com.p683ss.android.ugc.aweme.search.C41424g;
import com.ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.List;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.c.a.e */
public final class C28076e extends C26835b<List<? extends Object>> {

    /* renamed from: a */
    public C28524b f73758a;

    /* renamed from: a */
    public final C1352v mo51021a(ViewGroup viewGroup) {
        C52711k.m112240b(viewGroup, "parent");
        C28524b bVar = this.f73758a;
        C52711k.m112240b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bsy, viewGroup, false);
        C52711k.m112236a((Object) inflate, "view");
        return new C27995b(inflate, bVar);
    }

    /* renamed from: a */
    public final /* synthetic */ boolean mo51023a(Object obj, int i) {
        List list = (List) obj;
        C52711k.m112240b(list, "items");
        Object obj2 = list.get(i);
        if (!(obj2 instanceof List)) {
            obj2 = null;
        }
        List list2 = (List) obj2;
        if (list2 != null && !C9376b.m18558a((Collection<T>) list2) && (list2.get(0) instanceof SearchHistory)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo51022a(Object obj, int i, C1352v vVar, List list) {
        boolean z;
        List list2 = (List) obj;
        C52711k.m112240b(list2, "items");
        C52711k.m112240b(vVar, "holder");
        C52711k.m112240b(list, "payloads");
        Object obj2 = list2.get(i);
        C27995b bVar = (C27995b) vVar;
        if (obj2 != null) {
            List<? extends SearchHistory> list3 = (List) obj2;
            C52711k.m112240b(list3, "list");
            bVar.f73544b = list3;
            if (!C41424g.m91243d() || !C28010e.m66767b() || !C28010e.m66766a()) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                bVar.f73545c.setVisibility(8);
            } else {
                bVar.f73545c.setVisibility(0);
            }
            bVar.f73543a.notifyDataSetChanged();
            C23794bh.m58379E().mo58332a("search_transfer_history_words_show");
            return;
        }
        throw new C52857u("null cannot be cast to non-null type kotlin.collections.List<com.ss.android.ugc.aweme.discover.model.SearchHistory>");
    }
}
