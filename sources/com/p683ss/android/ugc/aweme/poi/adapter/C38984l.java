package com.p683ss.android.ugc.aweme.poi.adapter;

import android.os.Bundle;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.p1420ui.SquareImageView;
import com.p683ss.android.ugc.aweme.feed.model.poi.SimplePoiInfoStruct;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import com.p683ss.android.ugc.aweme.poi.C39067g;
import com.p683ss.android.ugc.aweme.poi.model.C39129m;
import com.p683ss.android.ugc.aweme.poi.p2074ui.PoiDetailActivity;
import com.p683ss.android.ugc.aweme.poi.utils.C39452l;
import com.ss.android.ugc.trill.R;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.poi.adapter.l */
public final class C38984l extends C1322a<C1352v> {

    /* renamed from: a */
    private final List<SimplePoiInfoStruct> f99309a;

    /* renamed from: b */
    private final C39067g f99310b;

    /* renamed from: c */
    private final Integer f99311c;

    /* renamed from: d */
    private final String f99312d;

    /* renamed from: com.ss.android.ugc.aweme.poi.adapter.l$a */
    public static final class C38985a extends C1352v {

        /* renamed from: com.ss.android.ugc.aweme.poi.adapter.l$a$a */
        static final class C38986a implements OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C39067g f99313a;

            /* renamed from: b */
            final /* synthetic */ Integer f99314b;

            /* renamed from: c */
            final /* synthetic */ String f99315c;

            C38986a(C39067g gVar, Integer num, String str) {
                this.f99313a = gVar;
                this.f99314b = num;
                this.f99315c = str;
            }

            public final void onClick(View view) {
                String str;
                ClickInstrumentation.onClick(view);
                C39067g gVar = this.f99313a;
                String str2 = "click_more_recommend_poi";
                C23089d a = C23089d.m56640a().mo47829a("enter_from", "poi_page").mo47829a("enter_method", "click").mo47829a("poi_channel", C23198ae.m56852b());
                String str3 = "poi_id";
                C39067g gVar2 = this.f99313a;
                String str4 = null;
                if (gVar2 != null) {
                    str = gVar2.getPoiId();
                } else {
                    str = null;
                }
                C39452l.m87730a(gVar, str2, a.mo47829a(str3, str).mo47829a("city_info", C23198ae.m56845a()).mo47829a("content_type", C39452l.m87726a(this.f99314b.intValue())));
                Bundle bundle = new Bundle();
                bundle.putString("enter_from", "poi_page");
                bundle.putString("enter_method", "click_poi_explore_more_card");
                String str5 = "id";
                C39067g gVar3 = this.f99313a;
                if (gVar3 != null) {
                    str4 = gVar3.getPoiId();
                }
                bundle.putString(str5, str4);
                bundle.putInt("recommend_type", this.f99314b.intValue());
                bundle.putString("recommend_title", this.f99315c);
            }
        }

        public C38985a(View view) {
            C52711k.m112240b(view, "itemView");
            super(view);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.adapter.l$b */
    public static final class C38987b extends C1352v {

        /* renamed from: a */
        final ImageView f99316a;

        /* renamed from: b */
        final SquareImageView f99317b;

        /* renamed from: c */
        final DmtTextView f99318c;

        /* renamed from: d */
        final DmtTextView f99319d;

        /* renamed from: e */
        final DmtTextView f99320e;

        /* renamed from: com.ss.android.ugc.aweme.poi.adapter.l$b$a */
        static final class C38988a implements OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C38987b f99321a;

            /* renamed from: b */
            final /* synthetic */ C39067g f99322b;

            /* renamed from: c */
            final /* synthetic */ SimplePoiInfoStruct f99323c;

            /* renamed from: d */
            final /* synthetic */ Integer f99324d;

            C38988a(C38987b bVar, C39067g gVar, SimplePoiInfoStruct simplePoiInfoStruct, Integer num) {
                this.f99321a = bVar;
                this.f99322b = gVar;
                this.f99323c = simplePoiInfoStruct;
                this.f99324d = num;
            }

            public final void onClick(View view) {
                String str;
                ClickInstrumentation.onClick(view);
                C39129m mVar = new C39129m();
                C39067g gVar = this.f99322b;
                if (gVar != null) {
                    str = gVar.getPoiId();
                } else {
                    str = null;
                }
                C39129m k = mVar.mo79734p(str).mo79726h("poi_page").mo79718a(this.f99323c.getPoiId()).mo79724f(this.f99323c.getPoiName()).mo79715a(this.f99323c).mo79736r(C39452l.m87726a(this.f99324d.intValue())).mo79729k("click_poi_explore_card");
                View view2 = this.f99321a.itemView;
                C52711k.m112236a((Object) view2, "itemView");
                PoiDetailActivity.m87276a(view2.getContext(), k.mo79713a());
            }
        }

        public C38987b(View view) {
            C52711k.m112240b(view, "itemView");
            super(view);
            View findViewById = view.findViewById(R.id.awc);
            C52711k.m112236a((Object) findViewById, "itemView.findViewById(R.…item_poi_img_placeholder)");
            this.f99316a = (ImageView) findViewById;
            View findViewById2 = view.findViewById(R.id.awb);
            C52711k.m112236a((Object) findViewById2, "itemView.findViewById(R.id.item_poi_img)");
            this.f99317b = (SquareImageView) findViewById2;
            View findViewById3 = view.findViewById(R.id.awt);
            C52711k.m112236a((Object) findViewById3, "itemView.findViewById(R.id.item_poi_title)");
            this.f99318c = (DmtTextView) findViewById3;
            View findViewById4 = view.findViewById(R.id.awa);
            C52711k.m112236a((Object) findViewById4, "itemView.findViewById(R.id.item_poi_distance)");
            this.f99319d = (DmtTextView) findViewById4;
            View findViewById5 = view.findViewById(R.id.awf);
            C52711k.m112236a((Object) findViewById5, "itemView.findViewById(R.id.item_poi_price)");
            this.f99320e = (DmtTextView) findViewById5;
        }
    }

    public final int getItemCount() {
        List<SimplePoiInfoStruct> list = this.f99309a;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public final int getItemViewType(int i) {
        List<SimplePoiInfoStruct> list = this.f99309a;
        if (list == null) {
            C52711k.m112234a();
        }
        if (((SimplePoiInfoStruct) list.get(i)).isValid()) {
            return 1;
        }
        return 2;
    }

    public final C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        C52711k.m112240b(viewGroup, "parent");
        if (i == 1) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bnr, viewGroup, false);
            C52711k.m112236a((Object) inflate, "view");
            return new C38987b(inflate);
        }
        View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bna, viewGroup, false);
        C52711k.m112236a((Object) inflate2, "view");
        return new C38985a(inflate2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0181  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0186  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onBindViewHolder(android.support.p043v7.widget.RecyclerView.C1352v r19, int r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            java.lang.String r2 = "holder"
            p2628d.p2639f.p2641b.C52711k.m112240b(r1, r2)
            boolean r2 = r1 instanceof com.p683ss.android.ugc.aweme.poi.adapter.C38984l.C38987b
            if (r2 == 0) goto L_0x01a7
            com.ss.android.ugc.aweme.poi.adapter.l$b r1 = (com.p683ss.android.ugc.aweme.poi.adapter.C38984l.C38987b) r1
            java.util.List<com.ss.android.ugc.aweme.feed.model.poi.SimplePoiInfoStruct> r2 = r0.f99309a
            if (r2 != 0) goto L_0x0016
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0016:
            r3 = r20
            java.lang.Object r2 = r2.get(r3)
            com.ss.android.ugc.aweme.feed.model.poi.SimplePoiInfoStruct r2 = (com.p683ss.android.ugc.aweme.feed.model.poi.SimplePoiInfoStruct) r2
            com.ss.android.ugc.aweme.poi.g r3 = r0.f99310b
            java.lang.Integer r4 = r0.f99311c
            java.lang.String r5 = "recommendType"
            p2628d.p2639f.p2641b.C52711k.m112240b(r4, r5)
            if (r2 == 0) goto L_0x01a6
            android.view.View r5 = r1.itemView
            com.ss.android.ugc.aweme.poi.adapter.l$b$a r6 = new com.ss.android.ugc.aweme.poi.adapter.l$b$a
            r6.<init>(r1, r3, r2, r4)
            android.view.View$OnClickListener r6 = (android.view.View.OnClickListener) r6
            r5.setOnClickListener(r6)
            com.ss.android.ugc.aweme.base.ui.SquareImageView r5 = r1.f99317b
            r6 = 2131821688(0x7f110478, float:1.9276126E38)
            r5.setImageResource(r6)
            com.ss.android.ugc.aweme.base.model.UrlModel r5 = r2.getCover()
            r6 = 8
            r7 = 0
            if (r5 == 0) goto L_0x006d
            com.ss.android.ugc.aweme.base.model.UrlModel r5 = r2.getCover()
            java.lang.String r8 = "poi.cover"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r8)
            java.util.List r5 = r5.getUrlList()
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r5 = com.bytedance.common.utility.p522b.C9376b.m18558a(r5)
            if (r5 == 0) goto L_0x005c
            goto L_0x006d
        L_0x005c:
            android.widget.ImageView r5 = r1.f99316a
            r5.setVisibility(r6)
            com.ss.android.ugc.aweme.base.ui.SquareImageView r5 = r1.f99317b
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r5 = (com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView) r5
            com.ss.android.ugc.aweme.base.model.UrlModel r8 = r2.getCover()
            com.p683ss.android.ugc.aweme.base.C23515d.m57669a(r5, r8)
            goto L_0x0072
        L_0x006d:
            android.widget.ImageView r5 = r1.f99316a
            r5.setVisibility(r7)
        L_0x0072:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r5 = r1.f99318c
            java.lang.String r8 = r2.getPoiName()
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            r5.setText(r8)
            com.ss.android.ugc.aweme.location.u r5 = com.p683ss.android.ugc.aweme.location.C36285u.C36286a.m81925a()
            com.ss.android.ugc.aweme.location.r r5 = r5.mo75118a()
            if (r5 == 0) goto L_0x00ec
            boolean r8 = r5.isValid()
            if (r8 == 0) goto L_0x00ec
            java.lang.String r8 = r2.getLatitude()
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            boolean r8 = android.text.TextUtils.isEmpty(r8)
            if (r8 != 0) goto L_0x00ec
            java.lang.String r8 = r2.getLongitude()
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            boolean r8 = android.text.TextUtils.isEmpty(r8)
            if (r8 == 0) goto L_0x00a6
            goto L_0x00ec
        L_0x00a6:
            double r10 = r5.getLatitude()
            double r12 = r5.getLongitude()
            java.lang.String r5 = r2.getLatitude()
            java.lang.Double r5 = java.lang.Double.valueOf(r5)
            if (r5 != 0) goto L_0x00bb
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x00bb:
            double r14 = r5.doubleValue()
            java.lang.String r5 = r2.getLongitude()
            java.lang.Double r5 = java.lang.Double.valueOf(r5)
            if (r5 != 0) goto L_0x00cc
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x00cc:
            double r16 = r5.doubleValue()
            android.view.View r5 = r1.itemView
            java.lang.String r8 = "itemView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r8)
            android.content.Context r9 = r5.getContext()
            java.lang.String r5 = com.p683ss.android.ugc.aweme.poi.utils.C39442c.m87700c(r9, r10, r12, r14, r16)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r8 = r1.f99319d
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r8.setText(r5)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r5 = r1.f99319d
            r5.setVisibility(r7)
            goto L_0x010e
        L_0x00ec:
            java.lang.String r5 = r2.getCity()
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 == 0) goto L_0x00fe
            com.bytedance.ies.dmt.ui.widget.DmtTextView r5 = r1.f99319d
            r5.setVisibility(r6)
            goto L_0x010e
        L_0x00fe:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r5 = r1.f99319d
            java.lang.String r8 = r2.getCity()
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            r5.setText(r8)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r5 = r1.f99319d
            r5.setVisibility(r7)
        L_0x010e:
            double r8 = r2.getCost()
            int r2 = (int) r8
            if (r2 != 0) goto L_0x011b
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r1.f99320e
            r1.setVisibility(r6)
            goto L_0x015d
        L_0x011b:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r5 = r1.f99320e
            android.view.View r6 = r1.itemView
            java.lang.String r8 = "itemView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r8)
            android.content.Context r6 = r6.getContext()
            java.lang.String r8 = "itemView.context"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r8)
            android.content.res.Resources r6 = r6.getResources()
            r8 = 2132547543(0x7f1c17d7, float:2.0748335E38)
            java.lang.String r6 = r6.getString(r8)
            java.lang.String r8 = "itemView.context.resourc…String(R.string.poi_cost)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r8)
            r8 = 1
            java.lang.Object[] r9 = new java.lang.Object[r8]
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r9[r7] = r2
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r9, r8)
            java.lang.String r2 = com.C2240a.m6772a(r6, r2)
            java.lang.String r6 = "java.lang.String.format(format, *args)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r6)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r5.setText(r2)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r1.f99320e
            r1.setVisibility(r7)
        L_0x015d:
            java.lang.String r1 = "poi_explore_card"
            com.ss.android.ugc.aweme.app.f.d r2 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r5 = "enter_from"
            java.lang.String r6 = "poi_page"
            com.ss.android.ugc.aweme.app.f.d r2 = r2.mo47829a(r5, r6)
            java.lang.String r5 = "enter_method"
            java.lang.String r6 = "show"
            com.ss.android.ugc.aweme.app.f.d r2 = r2.mo47829a(r5, r6)
            java.lang.String r5 = "poi_channel"
            java.lang.String r6 = com.p683ss.android.ugc.aweme.p1382aq.C23198ae.m56852b()
            com.ss.android.ugc.aweme.app.f.d r2 = r2.mo47829a(r5, r6)
            java.lang.String r5 = "poi_id"
            if (r3 == 0) goto L_0x0186
            java.lang.String r6 = r3.getPoiId()
            goto L_0x0187
        L_0x0186:
            r6 = 0
        L_0x0187:
            com.ss.android.ugc.aweme.app.f.d r2 = r2.mo47829a(r5, r6)
            java.lang.String r5 = "city_info"
            java.lang.String r6 = com.p683ss.android.ugc.aweme.p1382aq.C23198ae.m56845a()
            com.ss.android.ugc.aweme.app.f.d r2 = r2.mo47829a(r5, r6)
            java.lang.String r5 = "content_type"
            int r4 = r4.intValue()
            java.lang.String r4 = com.p683ss.android.ugc.aweme.poi.utils.C39452l.m87726a(r4)
            com.ss.android.ugc.aweme.app.f.d r2 = r2.mo47829a(r5, r4)
            com.p683ss.android.ugc.aweme.poi.utils.C39452l.m87730a(r3, r1, r2)
        L_0x01a6:
            return
        L_0x01a7:
            boolean r2 = r1 instanceof com.p683ss.android.ugc.aweme.poi.adapter.C38984l.C38985a
            if (r2 == 0) goto L_0x01c9
            com.ss.android.ugc.aweme.poi.adapter.l$a r1 = (com.p683ss.android.ugc.aweme.poi.adapter.C38984l.C38985a) r1
            java.lang.String r2 = r0.f99312d
            com.ss.android.ugc.aweme.poi.g r3 = r0.f99310b
            java.lang.Integer r4 = r0.f99311c
            java.lang.String r5 = "title"
            p2628d.p2639f.p2641b.C52711k.m112240b(r2, r5)
            java.lang.String r5 = "recommendType"
            p2628d.p2639f.p2641b.C52711k.m112240b(r4, r5)
            android.view.View r1 = r1.itemView
            com.ss.android.ugc.aweme.poi.adapter.l$a$a r5 = new com.ss.android.ugc.aweme.poi.adapter.l$a$a
            r5.<init>(r3, r4, r2)
            android.view.View$OnClickListener r5 = (android.view.View.OnClickListener) r5
            r1.setOnClickListener(r5)
        L_0x01c9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.poi.adapter.C38984l.onBindViewHolder(android.support.v7.widget.RecyclerView$v, int):void");
    }

    public C38984l(List<? extends SimplePoiInfoStruct> list, C39067g gVar, Integer num, String str) {
        C52711k.m112240b(num, "recommendType");
        C52711k.m112240b(str, "title");
        this.f99309a = list;
        this.f99310b = gVar;
        this.f99311c = num;
        this.f99312d = str;
    }
}
