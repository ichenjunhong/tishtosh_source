package com.p683ss.android.ugc.aweme.music.adapter;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.music.p1971ab.C37249a;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.music.adapter.f */
public final class C37290f extends C1352v {

    /* renamed from: a */
    public final DmtTextView f95171a;

    public C37290f(View view) {
        C52711k.m112240b(view, "view");
        super(view);
        this.f95171a = (DmtTextView) view.findViewById(R.id.bi3);
        if (C37249a.m83512c() == 2) {
            DmtTextView dmtTextView = this.f95171a;
            C52711k.m112236a((Object) dmtTextView, "title");
            dmtTextView.setText(view.getContext().getString(R.string.cem));
            return;
        }
        DmtTextView dmtTextView2 = this.f95171a;
        C52711k.m112236a((Object) dmtTextView2, "title");
        dmtTextView2.setText(view.getContext().getString(R.string.cel));
    }
}
