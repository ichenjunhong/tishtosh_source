package com.p683ss.android.ugc.aweme.language;

import android.content.Context;
import android.support.p030v4.content.C0726c;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.ss.android.ugc.trill.R;
import java.util.List;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.language.l */
public final class C35842l extends C1322a<C35850n> {

    /* renamed from: a */
    public List<? extends C35841k> f92022a = C52575l.m112097a();

    /* renamed from: b */
    public C52671b<? super C35841k, C52860x> f92023b;

    /* renamed from: c */
    public C35841k f92024c;

    public final int getItemCount() {
        return this.f92022a.size();
    }

    /* renamed from: a */
    public final void mo74498a(List<? extends C35841k> list) {
        C52711k.m112240b(list, "<set-?>");
        this.f92022a = list;
    }

    public final /* synthetic */ C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        C52711k.m112240b(viewGroup, "viewGroup");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.zf, viewGroup, false);
        C52711k.m112236a((Object) inflate, "itemView");
        return new C35850n(inflate);
    }

    public final /* synthetic */ void onBindViewHolder(C1352v vVar, int i) {
        String str;
        C35850n nVar = (C35850n) vVar;
        C52711k.m112240b(nVar, "vh");
        C35841k kVar = (C35841k) this.f92022a.get(i);
        C52671b<? super C35841k, C52860x> bVar = this.f92023b;
        C35841k kVar2 = this.f92024c;
        C52711k.m112240b(kVar, "item");
        boolean z = kVar instanceof C35832c;
        int i2 = R.color.dj;
        if (z) {
            nVar.f92046a.setText("*NONE*");
            DmtTextView dmtTextView = nVar.f92046a;
            View view = nVar.itemView;
            C52711k.m112236a((Object) view, "itemView");
            Context context = view.getContext();
            if (kVar2 == null) {
                i2 = R.color.a05;
            }
            dmtTextView.setTextColor(C0726c.m2098c(context, i2));
            nVar.f92047b.setOnClickListener(new C35851a(bVar, kVar));
            return;
        }
        DmtTextView dmtTextView2 = nVar.f92046a;
        StringBuilder sb = new StringBuilder("[");
        sb.append(kVar.f92021b);
        sb.append(']');
        sb.append(kVar.f92020a);
        dmtTextView2.setText(sb.toString());
        DmtTextView dmtTextView3 = nVar.f92046a;
        View view2 = nVar.itemView;
        C52711k.m112236a((Object) view2, "itemView");
        Context context2 = view2.getContext();
        String str2 = kVar.f92021b;
        if (kVar2 != null) {
            str = kVar2.f92021b;
        } else {
            str = null;
        }
        if (C52830p.m112406a(str2, str, true)) {
            i2 = R.color.a05;
        }
        dmtTextView3.setTextColor(C0726c.m2098c(context2, i2));
        nVar.f92047b.setOnClickListener(new C35852b(bVar, kVar));
    }
}
