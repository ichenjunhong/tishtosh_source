package com.p683ss.android.ugc.aweme.music.adapter.p1972a;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.common.p1589a.C26835b;
import com.p683ss.android.ugc.aweme.music.adapter.C37290f;
import com.p683ss.android.ugc.aweme.music.adapter.p1973b.C37278e;
import com.p683ss.android.ugc.aweme.music.adapter.p1973b.C37283j;
import com.ss.android.ugc.trill.R;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.music.adapter.a.g */
public final class C37267g extends C26835b<List<C37283j>> {
    /* renamed from: a */
    public final C1352v mo51021a(ViewGroup viewGroup) {
        C52711k.m112240b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.vm, viewGroup, false);
        C52711k.m112236a((Object) inflate, "view");
        return new C37290f(inflate);
    }

    /* renamed from: a */
    public final /* synthetic */ boolean mo51023a(Object obj, int i) {
        List list = (List) obj;
        C52711k.m112240b(list, "items");
        return list.get(i) instanceof C37278e;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo51022a(Object obj, int i, C1352v vVar, List list) {
        C52711k.m112240b((List) obj, "items");
        C52711k.m112240b(vVar, "holder");
        C52711k.m112240b(list, "payloads");
    }
}
