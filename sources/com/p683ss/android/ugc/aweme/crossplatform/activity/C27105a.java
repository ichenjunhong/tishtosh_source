package com.p683ss.android.ugc.aweme.crossplatform.activity;

import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.ss.android.ugc.trill.R;
import java.util.LinkedList;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.activity.a */
public final class C27105a extends C1322a<C27106b> {

    /* renamed from: a */
    public LinkedList<C27112g> f71512a;

    public final int getItemCount() {
        return this.f71512a.size();
    }

    public final /* synthetic */ C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        C52711k.m112240b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.b82, null, false);
        C52711k.m112236a((Object) inflate, "itemView");
        return new C27106b(inflate);
    }

    public final /* synthetic */ void onBindViewHolder(C1352v vVar, int i) {
        C27106b bVar = (C27106b) vVar;
        C52711k.m112240b(bVar, "holder");
        Object obj = this.f71512a.get(i);
        C52711k.m112236a(obj, "list[pos]");
        C27112g gVar = (C27112g) obj;
        C52711k.m112240b(gVar, "debugUrlMessage");
        bVar.f71514b = i;
        bVar.f71513a = gVar;
        View view = bVar.itemView;
        C52711k.m112236a((Object) view, "itemView");
        DmtTextView dmtTextView = (DmtTextView) view.findViewById(R.id.dly);
        C52711k.m112236a((Object) dmtTextView, "itemView.url");
        dmtTextView.setText(gVar.f71528a);
        View view2 = bVar.itemView;
        C52711k.m112236a((Object) view2, "itemView");
        DmtTextView dmtTextView2 = (DmtTextView) view2.findViewById(R.id.bld);
        C52711k.m112236a((Object) dmtTextView2, "itemView.message");
        dmtTextView2.setText(gVar.f71529b);
    }
}
