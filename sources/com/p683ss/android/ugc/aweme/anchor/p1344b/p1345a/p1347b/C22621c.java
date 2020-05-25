package com.p683ss.android.ugc.aweme.anchor.p1344b.p1345a.p1347b;

import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.p683ss.android.ugc.aweme.anchor.C22678i;
import com.p683ss.android.ugc.aweme.anchor.api.model.C22598a;
import com.p683ss.android.ugc.aweme.anchor.p1344b.p1345a.C22601a;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.anchor.b.a.b.c */
public final class C22621c extends C22601a<C22598a, C1352v> {

    /* renamed from: com.ss.android.ugc.aweme.anchor.b.a.b.c$a */
    public final class C22622a extends C1352v {

        /* renamed from: a */
        final /* synthetic */ C22621c f60778a;

        public C22622a(C22621c cVar, final View view) {
            C52711k.m112240b(view, "itemView");
            this.f60778a = cVar;
            super(view);
            view.post(new Runnable(this) {

                /* renamed from: a */
                final /* synthetic */ C22622a f60779a;

                {
                    this.f60779a = r1;
                }

                public final void run() {
                    int i;
                    int height = view.getHeight();
                    ViewParent parent = view.getParent();
                    if (!(parent instanceof RecyclerView)) {
                        parent = null;
                    }
                    RecyclerView recyclerView = (RecyclerView) parent;
                    int adapterPosition = this.f60779a.getAdapterPosition();
                    int i2 = 0;
                    for (int i3 = 0; i3 < adapterPosition; i3++) {
                        if (recyclerView != null) {
                            View childAt = recyclerView.getChildAt(i3);
                            if (childAt != null) {
                                i = childAt.getHeight();
                                i2 += i;
                            }
                        }
                        i = 0;
                        i2 += i;
                    }
                    view.getLayoutParams().height = height - i2;
                    view.setLayoutParams(view.getLayoutParams());
                }
            });
        }
    }

    public C22621c(C22678i iVar) {
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
        View inflate = layoutInflater.inflate(R.layout.bhl, viewGroup, false);
        C52711k.m112236a((Object) inflate, "inflater.inflate(R.layou…end_empty, parent, false)");
        return new C22622a(this, inflate);
    }
}
