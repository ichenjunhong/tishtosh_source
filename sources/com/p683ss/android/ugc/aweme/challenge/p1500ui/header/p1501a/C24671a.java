package com.p683ss.android.ugc.aweme.challenge.p1500ui.header.p1501a;

import android.graphics.drawable.ColorDrawable;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.base.utils.C23723j;
import com.ss.android.ugc.trill.R;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.challenge.ui.header.a.a */
public final class C24671a extends C1322a<C24672b> {

    /* renamed from: a */
    public List<String> f65313a;

    public final int getItemCount() {
        return this.f65313a.size();
    }

    public C24671a(List<String> list) {
        C52711k.m112240b(list, "list");
        this.f65313a = list;
    }

    public final /* synthetic */ C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        C52711k.m112240b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.b5a, viewGroup, false);
        C52711k.m112236a((Object) inflate, "itemView");
        return new C24672b(inflate);
    }

    public final /* synthetic */ void onBindViewHolder(C1352v vVar, int i) {
        C24672b bVar = (C24672b) vVar;
        C52711k.m112240b(bVar, "holder");
        String str = (String) this.f65313a.get(i);
        C52711k.m112240b(str, "giftReward");
        bVar.f65315b = i;
        bVar.f65314a = str;
        switch (i) {
            case 0:
                View view = bVar.itemView;
                C52711k.m112236a((Object) view, "itemView");
                View findViewById = view.findViewById(R.id.f63);
                C52711k.m112236a((Object) findViewById, "itemView.vReward");
                findViewById.setBackground(new ColorDrawable(C23723j.m58217a().getColor(R.color.a36)));
                break;
            case 1:
                View view2 = bVar.itemView;
                C52711k.m112236a((Object) view2, "itemView");
                View findViewById2 = view2.findViewById(R.id.f63);
                C52711k.m112236a((Object) findViewById2, "itemView.vReward");
                findViewById2.setBackground(new ColorDrawable(C23723j.m58217a().getColor(R.color.ax6)));
                break;
            case 2:
                View view3 = bVar.itemView;
                C52711k.m112236a((Object) view3, "itemView");
                View findViewById3 = view3.findViewById(R.id.f63);
                C52711k.m112236a((Object) findViewById3, "itemView.vReward");
                findViewById3.setBackground(new ColorDrawable(C23723j.m58217a().getColor(R.color.ax7)));
                break;
            default:
                View view4 = bVar.itemView;
                C52711k.m112236a((Object) view4, "itemView");
                View findViewById4 = view4.findViewById(R.id.f63);
                C52711k.m112236a((Object) findViewById4, "itemView.vReward");
                findViewById4.setBackground(new ColorDrawable(C23723j.m58217a().getColor(R.color.ax5)));
                break;
        }
        View view5 = bVar.itemView;
        C52711k.m112236a((Object) view5, "itemView");
        DmtTextView dmtTextView = (DmtTextView) view5.findViewById(R.id.f1_);
        C52711k.m112236a((Object) dmtTextView, "itemView.tvGift");
        dmtTextView.setText(str);
    }
}
