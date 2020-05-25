package com.p683ss.android.ugc.aweme.tools.draft;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import android.widget.TextView;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.c */
public final class C46980c extends C1352v {

    /* renamed from: a */
    final View f118682a;

    /* renamed from: b */
    final TextView f118683b;

    /* renamed from: c */
    final TextView f118684c;

    public C46980c(View view) {
        C52711k.m112240b(view, "view");
        super(view);
        this.f118682a = view;
        View findViewById = view.findViewById(R.id.f2y);
        C52711k.m112236a((Object) findViewById, "view.findViewById(R.id.tv_live_name)");
        this.f118683b = (TextView) findViewById;
        View findViewById2 = view.findViewById(R.id.dh7);
        C52711k.m112236a((Object) findViewById2, "view.findViewById(R.id.tv_time)");
        this.f118684c = (TextView) findViewById2;
    }
}
