package com.p683ss.android.ugc.aweme.discover.alading;

import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import android.widget.TextView;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.alading.g */
public final class C28037g extends C1352v {

    /* renamed from: a */
    public final RecyclerView f73653a;

    /* renamed from: b */
    public final ScrollToOpenLayout f73654b;

    /* renamed from: c */
    public final TextView f73655c;

    /* renamed from: d */
    public final C28026a f73656d = new C28026a();

    public C28037g(View view) {
        C52711k.m112240b(view, "itemView");
        super(view);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.qx);
        C52711k.m112236a((Object) recyclerView, "itemView.card_list");
        this.f73653a = recyclerView;
        ScrollToOpenLayout scrollToOpenLayout = (ScrollToOpenLayout) view.findViewById(R.id.chw);
        C52711k.m112236a((Object) scrollToOpenLayout, "itemView.scroll_to_open");
        this.f73654b = scrollToOpenLayout;
        DmtTextView dmtTextView = (DmtTextView) view.findViewById(R.id.cyg);
        C52711k.m112236a((Object) dmtTextView, "itemView.textView3");
        this.f73655c = dmtTextView;
        this.f73653a.setLayoutManager(new LinearLayoutManager(view.getContext(), 0, false));
        this.f73653a.setAdapter(this.f73656d);
    }
}
