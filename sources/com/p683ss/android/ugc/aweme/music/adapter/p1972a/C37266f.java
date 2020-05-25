package com.p683ss.android.ugc.aweme.music.adapter.p1972a;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.p683ss.android.ugc.aweme.common.p1589a.C26835b;
import com.p683ss.android.ugc.aweme.music.adapter.p1973b.C37275b;
import com.p683ss.android.ugc.aweme.music.adapter.p1973b.C37276c;
import com.p683ss.android.ugc.aweme.music.adapter.p1973b.C37277d;
import com.p683ss.android.ugc.aweme.music.adapter.p1973b.C37283j;
import com.ss.android.ugc.trill.R;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.music.adapter.a.f */
public final class C37266f extends C26835b<List<C37283j>> {
    /* renamed from: a */
    public final C1352v mo51021a(ViewGroup viewGroup) {
        C52711k.m112240b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a0m, viewGroup, false);
        C52711k.m112236a((Object) inflate, "view");
        return new C37277d(inflate);
    }

    /* renamed from: a */
    public final /* synthetic */ boolean mo51023a(Object obj, int i) {
        List list = (List) obj;
        C52711k.m112240b(list, "items");
        int size = list.size();
        boolean z = false;
        if (i >= 0 && size > i) {
            if (!(list.get(i) instanceof C37276c) && !(list.get(i) instanceof C37275b)) {
                return false;
            }
            z = true;
        }
        return z;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo51022a(Object obj, int i, C1352v vVar, List list) {
        List list2 = (List) obj;
        C52711k.m112240b(list2, "items");
        C52711k.m112240b(vVar, "holder");
        C52711k.m112240b(list, "payloads");
        if (vVar instanceof C37277d) {
            C37277d dVar = (C37277d) vVar;
            DmtStatusView dmtStatusView = dVar.f95169a;
            DmtStatusView dmtStatusView2 = dVar.f95169a;
            C52711k.m112236a((Object) dmtStatusView2, "holder.statusView");
            dmtStatusView.setBuilder(C10719a.m21676a(dmtStatusView2.getContext()));
            if (list2.get(i) instanceof C37276c) {
                dVar.f95169a.setStatus(-1);
                dVar.f95169a.mo19212f();
            } else if (list2.get(i) instanceof C37275b) {
                dVar.f95169a.setStatus(-1);
                dVar.f95169a.mo19214h();
            }
        }
    }
}
