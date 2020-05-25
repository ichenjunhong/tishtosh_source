package com.p683ss.android.ugc.aweme.discover.adapter;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.support.p043v7.widget.RecyclerView.LayoutParams;
import android.view.View;
import android.widget.TextView;
import com.bytedance.common.utility.C9432q;
import com.ss.android.ugc.trill.R;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.ay */
public final class C27838ay extends C1352v {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f73127a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C27838ay.class), "params", "getParams()Landroid/support/v7/widget/RecyclerView$LayoutParams;"))};

    /* renamed from: b */
    public TextView f73128b;

    /* renamed from: c */
    final C52668f f73129c;

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.ay$a */
    static final class C27839a extends C52712l implements C52670a<LayoutParams> {

        /* renamed from: a */
        final /* synthetic */ View f73130a;

        C27839a(View view) {
            this.f73130a = view;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            int b = (int) C9432q.m18687b(this.f73130a.getContext(), 4.0f);
            LayoutParams layoutParams = new LayoutParams(-2, -2);
            layoutParams.setMargins(0, 0, b, 0);
            return layoutParams;
        }
    }

    public C27838ay(View view) {
        C52711k.m112240b(view, "itemView");
        super(view);
        this.f73129c = C52732g.m112285a(new C27839a(view));
        this.f73128b = (TextView) view.findViewById(R.id.emf);
    }
}
