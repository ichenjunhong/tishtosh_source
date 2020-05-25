package com.p683ss.android.ugc.aweme.challenge.adapter;

import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.ss.android.ugc.trill.R;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.challenge.adapter.f */
public final class C24542f extends C1322a<C24544b> {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f64981a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C24542f.class), "screenWidth", "getScreenWidth()I")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C24542f.class), "cellHeight", "getCellHeight()F"))};

    /* renamed from: c */
    public static final C24543a f64982c = new C24543a(null);

    /* renamed from: b */
    final C52668f f64983b = C52732g.m112285a(C24546d.f64987a);

    /* renamed from: d */
    private final C52668f f64984d = C52732g.m112285a(new C24545c(this));

    /* renamed from: com.ss.android.ugc.aweme.challenge.adapter.f$a */
    public static final class C24543a {
        private C24543a() {
        }

        public /* synthetic */ C24543a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.adapter.f$b */
    public static final class C24544b extends C1352v {

        /* renamed from: a */
        private View f64985a;

        public C24544b(View view, int i) {
            C52711k.m112240b(view, "itemView");
            super(view);
            View findViewById = view.findViewById(R.id.by7);
            C52711k.m112236a((Object) findViewById, "itemView.findViewById<Vi…>(R.id.place_holder_view)");
            this.f64985a = findViewById;
            this.f64985a.getLayoutParams().height = i;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.adapter.f$c */
    static final class C24545c extends C52712l implements C52670a<Float> {

        /* renamed from: a */
        final /* synthetic */ C24542f f64986a;

        C24545c(C24542f fVar) {
            this.f64986a = fVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Float.valueOf(((((float) ((Number) this.f64986a.f64983b.getValue()).intValue()) / 2.0f) * 4.0f) / 3.0f);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.adapter.f$d */
    static final class C24546d extends C52712l implements C52670a<Integer> {

        /* renamed from: a */
        public static final C24546d f64987a = new C24546d();

        C24546d() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(C9432q.m18670a(C11010c.m22280a()));
        }
    }

    public final int getItemCount() {
        return 8;
    }

    public final /* synthetic */ void onBindViewHolder(C1352v vVar, int i) {
        C52711k.m112240b((C24544b) vVar, "p0");
    }

    public final /* synthetic */ C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        C52711k.m112240b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.b5c, viewGroup, false);
        C52711k.m112236a((Object) inflate, "view");
        return new C24544b(inflate, (int) ((Number) this.f64984d.getValue()).floatValue());
    }
}
