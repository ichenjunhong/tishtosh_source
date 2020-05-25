package com.p683ss.android.ugc.aweme.discover.p1640c.p1641a;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.common.p1589a.C26835b;
import com.p683ss.android.ugc.aweme.discover.adapter.C27859bf;
import com.p683ss.android.ugc.aweme.discover.adapter.C27879bl;
import com.ss.android.ugc.trill.R;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.c.a.i */
public final class C28085i extends C26835b<List<? extends Object>> {

    /* renamed from: a */
    public final C27859bf<?> f73771a;

    /* renamed from: com.ss.android.ugc.aweme.discover.c.a.i$a */
    public enum C28086a {
        TYPE_LIST
    }

    public C28085i(C27859bf<?> bfVar) {
        C52711k.m112240b(bfVar, "adapter");
        this.f73771a = bfVar;
    }

    /* renamed from: a */
    public final C1352v mo51021a(ViewGroup viewGroup) {
        C52711k.m112240b(viewGroup, "parent");
        C27859bf<?> bfVar = this.f73771a;
        C52711k.m112240b(viewGroup, "parent");
        C52711k.m112240b(bfVar, "adapter");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bsq, viewGroup, false);
        C52711k.m112236a((Object) inflate, "itemView");
        return new C27879bl(inflate, bfVar);
    }

    /* renamed from: a */
    public final /* synthetic */ boolean mo51023a(Object obj, int i) {
        List list = (List) obj;
        C52711k.m112240b(list, "items");
        return list.get(i) instanceof C28086a;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo51022a(Object obj, int i, C1352v vVar, List list) {
        C52711k.m112240b((List) obj, "items");
        C52711k.m112240b(vVar, "holder");
        C52711k.m112240b(list, "payloads");
        ((C27879bl) vVar).mo56299a();
    }
}
