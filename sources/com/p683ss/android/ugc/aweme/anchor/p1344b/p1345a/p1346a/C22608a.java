package com.p683ss.android.ugc.aweme.anchor.p1344b.p1345a.p1346a;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.anchor.C22678i;
import com.p683ss.android.ugc.aweme.anchor.api.model.AnchorCell;
import com.p683ss.android.ugc.aweme.anchor.p1344b.p1345a.C22601a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.anchor.b.a.a.a */
public final class C22608a extends C22601a<AnchorCell, C1352v> {

    /* renamed from: com.ss.android.ugc.aweme.anchor.b.a.a.a$a */
    public final class C22609a extends C1352v {

        /* renamed from: a */
        final /* synthetic */ C22608a f60765a;

        public C22609a(C22608a aVar, View view) {
            C52711k.m112240b(view, "itemView");
            this.f60765a = aVar;
            super(view);
        }
    }

    public C22608a(C22678i iVar) {
        super(iVar);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo14350a(C1352v vVar, Object obj) {
        AnchorCell anchorCell = (AnchorCell) obj;
        C52711k.m112240b(vVar, "holder");
        C52711k.m112240b(anchorCell, "cell");
    }

    /* renamed from: a */
    public final C1352v mo14349a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C52711k.m112240b(layoutInflater, "inflater");
        C52711k.m112240b(viewGroup, "parent");
        return new C22609a(this, new View(viewGroup.getContext()));
    }
}
