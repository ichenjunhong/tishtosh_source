package com.p683ss.android.ugc.aweme.poi.adapter.viewholder;

import android.content.Context;
import android.os.Bundle;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1340m;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.feed.model.poi.SimplePoiInfoStruct;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import com.p683ss.android.ugc.aweme.poi.C39067g;
import com.p683ss.android.ugc.aweme.poi.adapter.C38984l;
import com.p683ss.android.ugc.aweme.poi.p2058a.C38965j;
import com.p683ss.android.ugc.aweme.poi.utils.C39452l;
import com.p683ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.ss.android.ugc.trill.R;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.poi.adapter.viewholder.n */
public final class C39029n extends C1352v {

    /* renamed from: a */
    public final Context f99478a;

    /* renamed from: b */
    public final DmtTextView f99479b;

    /* renamed from: c */
    public final DmtTextView f99480c;

    /* renamed from: d */
    public final RecyclerView f99481d;

    /* renamed from: e */
    public final View f99482e;

    /* renamed from: f */
    public final View f99483f;

    /* renamed from: g */
    public C38984l f99484g;

    /* renamed from: h */
    public boolean f99485h;

    /* renamed from: i */
    public WrapLinearLayoutManager f99486i;

    /* renamed from: j */
    public List<? extends SimplePoiInfoStruct> f99487j;

    /* renamed from: k */
    public Integer f99488k;

    /* renamed from: l */
    public C39067g f99489l;

    /* renamed from: com.ss.android.ugc.aweme.poi.adapter.viewholder.n$a */
    public static final class C39030a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C38965j f99490a;

        /* renamed from: b */
        final /* synthetic */ C39067g f99491b;

        public C39030a(C38965j jVar, C39067g gVar) {
            this.f99490a = jVar;
            this.f99491b = gVar;
        }

        public final void onClick(View view) {
            String str;
            ClickInstrumentation.onClick(view);
            String a = C39452l.m87726a(this.f99490a.getRecommendType().intValue());
            C39067g gVar = this.f99491b;
            String str2 = "click_more_recommend_poi";
            C23089d a2 = C23089d.m56640a().mo47829a("enter_from", "poi_page").mo47829a("enter_method", "click").mo47829a("poi_channel", C23198ae.m56852b());
            String str3 = "poi_id";
            C39067g gVar2 = this.f99491b;
            String str4 = null;
            if (gVar2 != null) {
                str = gVar2.getPoiId();
            } else {
                str = null;
            }
            C39452l.m87730a(gVar, str2, a2.mo47829a(str3, str).mo47829a("city_info", C23198ae.m56845a()).mo47829a("content_type", a));
            Bundle bundle = new Bundle();
            bundle.putString("enter_from", "poi_page");
            bundle.putString("enter_method", "click_poi_explore_more_card");
            String str5 = "id";
            C39067g gVar3 = this.f99491b;
            if (gVar3 != null) {
                str4 = gVar3.getPoiId();
            }
            bundle.putString(str5, str4);
            bundle.putInt("recommend_type", this.f99490a.getRecommendType().intValue());
            bundle.putString("recommend_title", this.f99490a.title());
            bundle.putString("content_type", a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.adapter.viewholder.n$b */
    public static final class C39031b extends C1340m {

        /* renamed from: a */
        final /* synthetic */ C39067g f99492a;

        /* renamed from: b */
        final /* synthetic */ C38965j f99493b;

        public C39031b(C39067g gVar, C38965j jVar) {
            this.f99492a = gVar;
            this.f99493b = jVar;
        }

        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            String str;
            C52711k.m112240b(recyclerView, "recyclerView");
            if (i == 0) {
                C39067g gVar = this.f99492a;
                String str2 = "poi_explore_card";
                C23089d a = C23089d.m56640a().mo47829a("enter_from", "poi_page").mo47829a("enter_method", "slide").mo47829a("poi_channel", C23198ae.m56852b());
                String str3 = "poi_id";
                C39067g gVar2 = this.f99492a;
                if (gVar2 != null) {
                    str = gVar2.getPoiId();
                } else {
                    str = null;
                }
                C39452l.m87730a(gVar, str2, a.mo47829a(str3, str).mo47829a("city_info", C23198ae.m56845a()).mo47829a("content_type", C39452l.m87726a(this.f99493b.getRecommendType().intValue())));
            }
        }
    }

    public C39029n(View view) {
        C52711k.m112240b(view, "itemView");
        super(view);
        Context context = view.getContext();
        C52711k.m112236a((Object) context, "itemView.context");
        this.f99478a = context;
        View findViewById = view.findViewById(R.id.c20);
        C52711k.m112236a((Object) findViewById, "itemView.findViewById(R.id.poi_recommend_title)");
        this.f99479b = (DmtTextView) findViewById;
        View findViewById2 = view.findViewById(R.id.c1z);
        C52711k.m112236a((Object) findViewById2, "itemView.findViewById(R.id.poi_recommend_subtitle)");
        this.f99480c = (DmtTextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.c1y);
        C52711k.m112236a((Object) findViewById3, "itemView.findViewById(R.id.poi_recommend_list)");
        this.f99481d = (RecyclerView) findViewById3;
        View findViewById4 = view.findViewById(R.id.c1x);
        C52711k.m112236a((Object) findViewById4, "itemView.findViewById(R.…oi_recommend_divider_top)");
        this.f99482e = findViewById4;
        View findViewById5 = view.findViewById(R.id.c1w);
        C52711k.m112236a((Object) findViewById5, "itemView.findViewById(R.id.poi_recommend_divider)");
        this.f99483f = findViewById5;
    }
}
