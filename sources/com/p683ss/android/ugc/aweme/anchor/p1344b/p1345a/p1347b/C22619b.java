package com.p683ss.android.ugc.aweme.anchor.p1344b.p1345a.p1347b;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.anchor.C22678i;
import com.p683ss.android.ugc.aweme.anchor.api.model.C22598a;
import com.p683ss.android.ugc.aweme.anchor.p1344b.p1345a.C22601a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.anchor.b.a.b.b */
public final class C22619b extends C22601a<C22598a, C1352v> {

    /* renamed from: com.ss.android.ugc.aweme.anchor.b.a.b.b$a */
    public final class C22620a extends C1352v {

        /* renamed from: a */
        final /* synthetic */ C22619b f60777a;

        public C22620a(C22619b bVar, View view) {
            C52711k.m112240b(view, "itemView");
            this.f60777a = bVar;
            super(view);
        }
    }

    public C22619b(C22678i iVar) {
        super(iVar);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo14350a(C1352v vVar, Object obj) {
        C22598a aVar = (C22598a) obj;
        C52711k.m112240b(vVar, "holder");
        C52711k.m112240b(aVar, "module");
    }

    /* renamed from: a */
    public final C1352v mo14349a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C52711k.m112240b(layoutInflater, "inflater");
        C52711k.m112240b(viewGroup, "parent");
        return new C22620a(this, new View(viewGroup.getContext()));
    }
}
