package com.p683ss.android.ugc.aweme.anchor.p1344b.p1345a.p1347b;

import android.content.Context;
import android.graphics.Rect;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.support.p043v7.widget.RecyclerView.C1349s;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.anchor.C22678i;
import com.p683ss.android.ugc.aweme.anchor.api.model.AnchorCell;
import com.p683ss.android.ugc.aweme.anchor.api.model.C22598a;
import com.p683ss.android.ugc.aweme.anchor.p1344b.p1345a.C22601a;
import com.p683ss.android.ugc.aweme.anchor.p1344b.p1345a.C22601a.C22602a;
import com.p683ss.android.ugc.aweme.anchor.p1344b.p1345a.p1346a.C22610b;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;
import p2663f.p2664a.p2665a.C53037e;

/* renamed from: com.ss.android.ugc.aweme.anchor.b.a.b.a */
public final class C22616a extends C22601a<C22598a, C22617a> {

    /* renamed from: d */
    public final C53037e f60773d = new C53037e();

    /* renamed from: com.ss.android.ugc.aweme.anchor.b.a.b.a$a */
    public final class C22617a extends C22602a {

        /* renamed from: b */
        public final RecyclerView f60774b;

        /* renamed from: c */
        final /* synthetic */ C22616a f60775c;

        public C22617a(C22616a aVar, View view) {
            C52711k.m112240b(view, "itemView");
            this.f60775c = aVar;
            super(aVar, view);
            View findViewById = view.findViewById(R.id.ern);
            C52711k.m112236a((Object) findViewById, "itemView.findViewById(R.id.recycler_icons)");
            this.f60774b = (RecyclerView) findViewById;
            Context context = view.getContext();
            this.f60774b.setLayoutManager(new LinearLayoutManager(context, 0, false));
            this.f60774b.mo4798a((C1331h) new C22618b((int) C9432q.m18687b(context, 4.0f)));
            this.f60774b.setAdapter(aVar.f60773d);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.anchor.b.a.b.a$b */
    public static final class C22618b extends C1331h {

        /* renamed from: a */
        public final int f60776a;

        public C22618b(int i) {
            this.f60776a = i;
        }

        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1349s sVar) {
            C52711k.m112240b(rect, "outRect");
            C52711k.m112240b(view, "view");
            C52711k.m112240b(recyclerView, "parent");
            C52711k.m112240b(sVar, "state");
            rect.left = this.f60776a;
        }
    }

    public C22616a(C22678i iVar) {
        super(iVar);
        this.f60773d.mo110580a(AnchorCell.class, new C22610b(iVar));
    }

    /* renamed from: a */
    public final /* synthetic */ C1352v mo14349a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C52711k.m112240b(layoutInflater, "inflater");
        C52711k.m112240b(viewGroup, "parent");
        View inflate = layoutInflater.inflate(R.layout.bhc, viewGroup, false);
        C52711k.m112236a((Object) inflate, "inflater.inflate(R.layou…ollection, parent, false)");
        return new C22617a(this, inflate);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo14350a(C1352v vVar, Object obj) {
        boolean z;
        C22598a aVar = (C22598a) obj;
        C52711k.m112240b((C22617a) vVar, "holder");
        C52711k.m112240b(aVar, "module");
        Collection collection = aVar.f60751e;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            C53037e eVar = this.f60773d;
            ArrayList<AnchorCell> arrayList = aVar.f60751e;
            if (arrayList == null) {
                C52711k.m112234a();
            }
            eVar.mo10432a((List<?>) arrayList);
            this.f60773d.notifyItemRangeChanged(0, this.f60773d.f131517a.size());
        }
    }
}
