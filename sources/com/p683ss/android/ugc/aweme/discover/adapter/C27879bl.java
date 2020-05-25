package com.p683ss.android.ugc.aweme.discover.adapter;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.bl */
public final class C27879bl extends C1352v {

    /* renamed from: b */
    public static final C27880a f73243b = new C27880a(null);

    /* renamed from: a */
    public final C27859bf<?> f73244a;

    /* renamed from: c */
    private View f73245c;

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.bl$a */
    public static final class C27880a {
        private C27880a() {
        }

        public /* synthetic */ C27880a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo56299a() {
        this.f73245c.setAlpha(0.2f);
        if (this.f73244a.mo56280a().mo56287b().size() > 0) {
            this.f73245c.setVisibility(0);
        } else {
            this.f73245c.setVisibility(8);
        }
    }

    public C27879bl(View view, C27859bf<?> bfVar) {
        C52711k.m112240b(view, "itemView");
        C52711k.m112240b(bfVar, "adapter");
        super(view);
        this.f73244a = bfVar;
        View findViewById = view.findViewById(R.id.bb1);
        C52711k.m112236a((Object) findViewById, "itemView.findViewById(R.…line_upper_suggest_first)");
        this.f73245c = findViewById;
    }
}
