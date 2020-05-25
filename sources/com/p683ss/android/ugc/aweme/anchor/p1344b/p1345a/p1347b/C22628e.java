package com.p683ss.android.ugc.aweme.anchor.p1344b.p1345a.p1347b;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.p879t.p882c.C13248c;
import com.p683ss.android.ugc.aweme.anchor.C22678i;
import com.p683ss.android.ugc.aweme.anchor.api.model.C22598a;
import com.p683ss.android.ugc.aweme.anchor.p1344b.p1345a.C22601a;
import com.p683ss.android.ugc.aweme.anchor.p1344b.p1345a.C22601a.C22602a;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.anchor.b.a.b.e */
public final class C22628e extends C22601a<C22598a, C22629a> {

    /* renamed from: com.ss.android.ugc.aweme.anchor.b.a.b.e$a */
    public final class C22629a extends C22602a {

        /* renamed from: b */
        public final DmtTextView f60787b;

        /* renamed from: c */
        final /* synthetic */ C22628e f60788c;

        public C22629a(C22628e eVar, View view) {
            C52711k.m112240b(view, "itemView");
            this.f60788c = eVar;
            super(eVar, view);
            View findViewById = view.findViewById(R.id.dl0);
            C52711k.m112236a((Object) findViewById, "itemView.findViewById(R.id.txt_title)");
            this.f60787b = (DmtTextView) findViewById;
        }
    }

    public C22628e(C22678i iVar) {
        super(iVar);
    }

    /* renamed from: a */
    public final /* synthetic */ C1352v mo14349a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C52711k.m112240b(layoutInflater, "inflater");
        C52711k.m112240b(viewGroup, "parent");
        View inflate = layoutInflater.inflate(R.layout.bhk, viewGroup, false);
        C52711k.m112236a((Object) inflate, "inflater.inflate(R.layou…mmend_add, parent, false)");
        return new C22629a(this, inflate);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo14350a(C1352v vVar, Object obj) {
        C22629a aVar = (C22629a) vVar;
        C22598a aVar2 = (C22598a) obj;
        C52711k.m112240b(aVar, "holder");
        C52711k.m112240b(aVar2, "module");
        if (C13248c.m26638a(aVar2.f60749c)) {
            aVar.f60787b.setVisibility(8);
            return;
        }
        aVar.f60787b.setVisibility(0);
        aVar.f60787b.setText(aVar2.f60749c);
    }
}
