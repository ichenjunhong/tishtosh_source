package com.p683ss.android.ugc.aweme.feed.p1736ui.masklayer;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer.h */
public final class C31048h extends C1352v {

    /* renamed from: c */
    public static final C31049a f81294c = new C31049a(null);

    /* renamed from: a */
    public ImageView f81295a;

    /* renamed from: b */
    public TextView f81296b;

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer.h$a */
    public static final class C31049a {
        private C31049a() {
        }

        public /* synthetic */ C31049a(C52707g gVar) {
            this();
        }
    }

    public C31048h(View view) {
        C52711k.m112240b(view, "itemView");
        super(view);
        View findViewById = view.findViewById(R.id.cm9);
        C52711k.m112236a((Object) findViewById, "itemView.findViewById(R.id.shade_item_icon)");
        this.f81295a = (ImageView) findViewById;
        View findViewById2 = view.findViewById(R.id.cm_);
        C52711k.m112236a((Object) findViewById2, "itemView.findViewById(R.id.shade_item_name)");
        this.f81296b = (TextView) findViewById2;
    }
}
