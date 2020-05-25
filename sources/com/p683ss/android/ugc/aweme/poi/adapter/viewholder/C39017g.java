package com.p683ss.android.ugc.aweme.poi.adapter.viewholder;

import android.content.Context;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1340m;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.poi.C39067g;
import com.p683ss.android.ugc.aweme.poi.p2058a.C38968l;
import com.p683ss.android.ugc.aweme.poi.utils.C39452l;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.poi.adapter.viewholder.g */
public final class C39017g extends C1352v {

    /* renamed from: a */
    public final Context f99436a;

    /* renamed from: b */
    public final View f99437b;

    /* renamed from: c */
    public final DmtTextView f99438c;

    /* renamed from: d */
    public final RecyclerView f99439d;

    /* renamed from: e */
    public C38968l f99440e;

    /* renamed from: f */
    public LinearLayoutManager f99441f;

    /* renamed from: g */
    public C39067g f99442g;

    /* renamed from: com.ss.android.ugc.aweme.poi.adapter.viewholder.g$a */
    public static final class C39018a extends C1340m {

        /* renamed from: a */
        final /* synthetic */ C39017g f99443a;

        /* renamed from: b */
        final /* synthetic */ C39067g f99444b;

        public C39018a(C39017g gVar, C39067g gVar2) {
            this.f99443a = gVar;
            this.f99444b = gVar2;
        }

        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            String str;
            C52711k.m112240b(recyclerView, "recyclerView");
            if (i == 0) {
                C39067g gVar = this.f99443a.f99442g;
                String str2 = "show_poi_product";
                C23089d a = C23089d.m56640a().mo47829a("enter_from", "poi_page").mo47829a("enter_method", "slide");
                String str3 = "poi_id";
                C39067g gVar2 = this.f99444b;
                if (gVar2 != null) {
                    str = gVar2.getPoiId();
                } else {
                    str = null;
                }
                C39452l.m87730a(gVar, str2, a.mo47829a(str3, str).mo47829a("product_id", "").mo47829a("poi_posititon", "poi_page"));
            }
        }
    }

    public C39017g(View view) {
        C52711k.m112240b(view, "itemView");
        super(view);
        Context context = view.getContext();
        C52711k.m112236a((Object) context, "itemView.context");
        this.f99436a = context;
        View findViewById = view.findViewById(R.id.c2x);
        C52711k.m112236a((Object) findViewById, "itemView.findViewById(R.…tour_product_divider_top)");
        this.f99437b = findViewById;
        View findViewById2 = view.findViewById(R.id.c2z);
        C52711k.m112236a((Object) findViewById2, "itemView.findViewById(R.id.poi_tour_product_title)");
        this.f99438c = (DmtTextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.c2y);
        C52711k.m112236a((Object) findViewById3, "itemView.findViewById(R.id.poi_tour_product_list)");
        this.f99439d = (RecyclerView) findViewById3;
    }
}
