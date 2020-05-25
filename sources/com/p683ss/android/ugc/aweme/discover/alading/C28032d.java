package com.p683ss.android.ugc.aweme.discover.alading;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import android.widget.TextView;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.p683ss.android.ugc.aweme.feed.widget.LinearGradientDraweeView;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.alading.d */
public final class C28032d extends C1352v {

    /* renamed from: a */
    public View f73644a;

    /* renamed from: b */
    public SmartImageView f73645b;

    /* renamed from: c */
    public TextView f73646c;

    public C28032d(View view) {
        C52711k.m112240b(view, "itemView");
        super(view);
        this.f73644a = view;
        LinearGradientDraweeView linearGradientDraweeView = (LinearGradientDraweeView) view.findViewById(R.id.a22);
        C52711k.m112236a((Object) linearGradientDraweeView, "itemView.cover");
        this.f73645b = linearGradientDraweeView;
        DmtTextView dmtTextView = (DmtTextView) view.findViewById(R.id.baj);
        C52711k.m112236a((Object) dmtTextView, "itemView.like_count");
        this.f73646c = dmtTextView;
    }
}
