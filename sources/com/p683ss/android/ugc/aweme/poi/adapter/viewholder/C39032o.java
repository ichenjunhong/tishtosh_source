package com.p683ss.android.ugc.aweme.poi.adapter.viewholder;

import android.content.Context;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.poi.adapter.viewholder.o */
public final class C39032o extends C1352v {

    /* renamed from: a */
    public final Context f99494a;

    /* renamed from: b */
    public final DmtTextView f99495b;

    /* renamed from: c */
    public final View f99496c;

    /* renamed from: d */
    public boolean f99497d;

    /* renamed from: e */
    public final C39034q f99498e;

    public C39032o(View view) {
        C52711k.m112240b(view, "itemView");
        super(view);
        Context context = view.getContext();
        C52711k.m112236a((Object) context, "itemView.context");
        this.f99494a = context;
        View findViewById = view.findViewById(R.id.c2z);
        C52711k.m112236a((Object) findViewById, "itemView.findViewById(R.id.poi_tour_product_title)");
        this.f99495b = (DmtTextView) findViewById;
        View findViewById2 = view.findViewById(R.id.c2x);
        C52711k.m112236a((Object) findViewById2, "itemView.findViewById(R.…tour_product_divider_top)");
        this.f99496c = findViewById2;
        this.f99498e = new C39034q(view);
    }
}
