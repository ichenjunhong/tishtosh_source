package com.p683ss.android.ugc.aweme.filter.view.internal.p1751a;

import android.arch.lifecycle.C0184k;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.filter.C31459g;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31494g;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31499l;
import com.p683ss.android.ugc.aweme.filter.view.internal.C31634f;
import com.p683ss.android.ugc.aweme.filter.view.internal.main.C31669d;
import com.p683ss.android.ugc.aweme.filter.view.internal.main.C31720m;
import com.p683ss.android.ugc.aweme.filter.view.internal.main.FilterListViewSelectionViewModel;
import com.p683ss.android.ugc.aweme.filter.view.internal.main.FilterListViewStateViewModel;
import com.ss.android.ugc.trill.R;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.filter.view.internal.a.a */
public final class C31620a extends C31669d {
    /* renamed from: a */
    public final C1352v mo64520a(ViewGroup viewGroup, int i, C52682m<? super C31459g, ? super C31494g, C52860x> mVar) {
        C52711k.m112240b(viewGroup, "parent");
        C52711k.m112240b(mVar, "clickListener");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.axu, viewGroup, false);
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(R.id.edg);
        if (viewGroup2 != null) {
            viewGroup2.addView(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.axt, viewGroup2, false));
        }
        C52711k.m112236a((Object) inflate, "view");
        return new C31720m(inflate, mVar);
    }

    public C31620a(RecyclerView recyclerView, C0184k kVar, C31499l lVar, C31634f fVar) {
        C52711k.m112240b(recyclerView, "recyclerView");
        C52711k.m112240b(kVar, "lifecycleOwner");
        C52711k.m112240b(lVar, "repository");
        super(recyclerView, kVar, new FilterListViewSelectionViewModel(kVar, lVar, fVar), new FilterListViewStateViewModel(kVar, lVar), null, 16, null);
    }

    /* renamed from: a */
    public final void mo64521a(C1352v vVar, int i, C31459g gVar, C31494g gVar2) {
        int i2;
        C52711k.m112240b(vVar, "holder");
        C52711k.m112240b(gVar, "filterBean");
        C52711k.m112240b(gVar2, "filterState");
        super.mo64521a(vVar, i, gVar, gVar2);
        View view = vVar.itemView;
        C52711k.m112236a((Object) view, "holder.itemView");
        View findViewById = view.findViewById(R.id.ad_);
        if (findViewById != null) {
            if (i != 0) {
                int i3 = gVar.f82324a;
                C31459g a = mo64492a();
                if (a != null && i3 == a.f82324a) {
                    i2 = 0;
                    findViewById.setVisibility(i2);
                }
            }
            i2 = 8;
            findViewById.setVisibility(i2);
        }
    }
}
