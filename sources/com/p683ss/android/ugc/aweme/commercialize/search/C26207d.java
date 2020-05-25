package com.p683ss.android.ugc.aweme.commercialize.search;

import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.commercialize.model.C26114ah;
import com.ss.android.ugc.trill.R;
import java.util.List;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.search.d */
public final class C26207d extends C1322a<C26209f> {

    /* renamed from: a */
    public final List<C26114ah> f69195a;

    /* renamed from: b */
    public final C52671b<String, C52860x> f69196b;

    /* renamed from: c */
    private final C52671b<C26114ah, C52860x> f69197c;

    /* renamed from: d */
    private final C52671b<C26114ah, C52860x> f69198d;

    public final int getItemCount() {
        return this.f69195a.size();
    }

    public final /* synthetic */ C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        C52711k.m112240b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bt3, viewGroup, false);
        C52711k.m112236a((Object) inflate, "view");
        return new C26209f(inflate, this.f69196b, this.f69197c, this.f69198d);
    }

    public final /* synthetic */ void onBindViewHolder(C1352v vVar, int i) {
        boolean z;
        C26209f fVar = (C26209f) vVar;
        C52711k.m112240b(fVar, "holder");
        C26114ah ahVar = (C26114ah) this.f69195a.get(i);
        C52711k.m112240b(ahVar, "info");
        C23515d.m57677a(fVar.f69202a, ahVar.icon);
        DmtTextView dmtTextView = fVar.f69203b;
        C52711k.m112236a((Object) dmtTextView, "title");
        String str = ahVar.title;
        if (str == null) {
            str = "";
        }
        dmtTextView.setText(str);
        DmtTextView dmtTextView2 = fVar.f69204c;
        C52711k.m112236a((Object) dmtTextView2, "desc");
        String str2 = ahVar.desc;
        if (str2 == null) {
            str2 = "";
        }
        dmtTextView2.setText(str2);
        String str3 = ahVar.btnText;
        if (str3 == null || str3.length() <= 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            RelativeLayout relativeLayout = fVar.f69206e;
            C52711k.m112236a((Object) relativeLayout, "layoutBtn");
            relativeLayout.setVisibility(0);
            DmtTextView dmtTextView3 = fVar.f69205d;
            C52711k.m112236a((Object) dmtTextView3, "btn");
            dmtTextView3.setText(ahVar.btnText);
        } else {
            RelativeLayout relativeLayout2 = fVar.f69206e;
            C52711k.m112236a((Object) relativeLayout2, "layoutBtn");
            relativeLayout2.setVisibility(8);
        }
        fVar.f69208g.invoke(ahVar);
        fVar.itemView.setOnClickListener(new C26210a(fVar, ahVar));
    }

    public C26207d(List<? extends C26114ah> list, C52671b<? super String, C52860x> bVar, C52671b<? super C26114ah, C52860x> bVar2, C52671b<? super C26114ah, C52860x> bVar3) {
        C52711k.m112240b(list, "list");
        C52711k.m112240b(bVar, "click");
        C52711k.m112240b(bVar2, "mobViewMoreShow");
        C52711k.m112240b(bVar3, "mobViewMoreClick");
        this.f69195a = list;
        this.f69196b = bVar;
        this.f69197c = bVar2;
        this.f69198d = bVar3;
    }
}
