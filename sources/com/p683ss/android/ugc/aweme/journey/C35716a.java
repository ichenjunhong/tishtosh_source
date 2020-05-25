package com.p683ss.android.ugc.aweme.journey;

import android.content.Context;
import android.graphics.BlurMaskFilter.Blur;
import android.graphics.Color;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.language.C35834e;
import com.ss.android.ugc.trill.R;
import java.util.List;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.journey.a */
public final class C35716a extends C1322a<C35717a> {

    /* renamed from: a */
    public C35834e f91689a;

    /* renamed from: b */
    public final List<C35834e> f91690b;

    /* renamed from: c */
    public final C52671b<C35834e, C52860x> f91691c;

    /* renamed from: com.ss.android.ugc.aweme.journey.a$a */
    public final class C35717a extends C1352v {

        /* renamed from: a */
        final /* synthetic */ C35716a f91692a;

        /* renamed from: b */
        private final C35792w f91693b;

        /* renamed from: c */
        private final C35798y f91694c;

        public C35717a(C35716a aVar, final View view) {
            C52711k.m112240b(view, "view");
            this.f91692a = aVar;
            super(view);
            C35792w wVar = new C35792w(C9432q.m18687b(view.getContext(), 8.0f), Blur.NORMAL, 0.0f, C9432q.m18687b(view.getContext(), 2.0f), Color.parseColor("#1f000000"), C9432q.m18687b(view.getContext(), 2.0f));
            this.f91693b = wVar;
            View view2 = this.itemView;
            C52711k.m112236a((Object) view2, "itemView");
            Context context = view2.getContext();
            C52711k.m112236a((Object) context, "itemView.context");
            this.f91694c = new C35798y(context.getResources().getColor(R.color.aso), this.f91693b);
            C35798y yVar = this.f91694c;
            View view3 = this.itemView;
            C52711k.m112236a((Object) view3, "itemView");
            Context context2 = view3.getContext();
            C52711k.m112236a((Object) context2, "itemView.context");
            yVar.mo74466a(context2.getResources().getColor(R.color.j5));
            view.setBackground(this.f91694c);
            view.setOnClickListener(new OnClickListener(this) {

                /* renamed from: a */
                final /* synthetic */ C35717a f91695a;

                {
                    this.f91695a = r1;
                }

                public final void onClick(View view) {
                    C35834e eVar;
                    ClickInstrumentation.onClick(view);
                    ImageView imageView = (ImageView) view.findViewById(R.id.t9);
                    C52711k.m112236a((Object) imageView, "view.choose_img");
                    ImageView imageView2 = (ImageView) view.findViewById(R.id.t9);
                    C52711k.m112236a((Object) imageView2, "view.choose_img");
                    imageView.setSelected(!imageView2.isSelected());
                    if (this.f91695a.getAdapterPosition() >= 0) {
                        C35716a aVar = this.f91695a.f91692a;
                        ImageView imageView3 = (ImageView) view.findViewById(R.id.t9);
                        C52711k.m112236a((Object) imageView3, "view.choose_img");
                        if (imageView3.isSelected()) {
                            eVar = (C35834e) this.f91695a.f91692a.f91690b.get(this.f91695a.getAdapterPosition());
                        } else {
                            eVar = null;
                        }
                        aVar.f91689a = eVar;
                        this.f91695a.f91692a.notifyDataSetChanged();
                        this.f91695a.f91692a.f91691c.invoke(this.f91695a.f91692a.f91689a);
                    }
                }
            });
            view.setLayerType(1, null);
        }
    }

    public final int getItemCount() {
        return this.f91690b.size();
    }

    public C35716a(List<? extends C35834e> list, C52671b<? super C35834e, C52860x> bVar) {
        C52711k.m112240b(list, "language");
        C52711k.m112240b(bVar, "itemListner");
        this.f91690b = list;
        this.f91691c = bVar;
    }

    public final /* synthetic */ C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        C52711k.m112240b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bih, viewGroup, false);
        C52711k.m112236a((Object) inflate, "view");
        return new C35717a(this, inflate);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x00b4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void onBindViewHolder(android.support.p043v7.widget.RecyclerView.C1352v r4, int r5) {
        /*
            r3 = this;
            com.ss.android.ugc.aweme.journey.a$a r4 = (com.p683ss.android.ugc.aweme.journey.C35716a.C35717a) r4
            java.lang.String r5 = "p0"
            p2628d.p2639f.p2641b.C52711k.m112240b(r4, r5)
            android.view.View r5 = r4.itemView
            java.lang.String r0 = "itemView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r0)
            r0 = 2132017448(0x7f140128, float:1.9673175E38)
            android.view.View r5 = r5.findViewById(r0)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r5 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r5
            java.lang.String r0 = "itemView.applanguage_name"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r0)
            com.ss.android.ugc.aweme.journey.a r0 = r4.f91692a
            java.util.List<com.ss.android.ugc.aweme.language.e> r0 = r0.f91690b
            int r1 = r4.getAdapterPosition()
            java.lang.Object r0 = r0.get(r1)
            com.ss.android.ugc.aweme.language.e r0 = (com.p683ss.android.ugc.aweme.language.C35834e) r0
            java.lang.String r0 = r0.mo70126f()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r5.setText(r0)
            android.view.View r5 = r4.itemView
            java.lang.String r0 = "itemView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r0)
            r0 = 2132018033(0x7f140371, float:1.9674361E38)
            android.view.View r5 = r5.findViewById(r0)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            java.lang.String r0 = "itemView.choose_img"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r0)
            com.ss.android.ugc.aweme.journey.a r0 = r4.f91692a
            com.ss.android.ugc.aweme.language.e r0 = r0.f91689a
            r1 = 0
            if (r0 == 0) goto L_0x0076
            com.ss.android.ugc.aweme.journey.a r0 = r4.f91692a
            java.util.List<com.ss.android.ugc.aweme.language.e> r0 = r0.f91690b
            int r2 = r4.getAdapterPosition()
            java.lang.Object r0 = r0.get(r2)
            com.ss.android.ugc.aweme.language.e r0 = (com.p683ss.android.ugc.aweme.language.C35834e) r0
            java.lang.String r0 = r0.mo70127g()
            com.ss.android.ugc.aweme.journey.a r2 = r4.f91692a
            com.ss.android.ugc.aweme.language.e r2 = r2.f91689a
            if (r2 != 0) goto L_0x006a
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x006a:
            java.lang.String r2 = r2.mo70127g()
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r2)
            if (r0 == 0) goto L_0x0076
            r0 = 1
            goto L_0x0077
        L_0x0076:
            r0 = 0
        L_0x0077:
            r5.setSelected(r0)
            android.view.View r5 = r4.itemView
            java.lang.String r0 = "itemView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r0)
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            if (r5 == 0) goto L_0x00b4
            android.view.ViewGroup$MarginLayoutParams r5 = (android.view.ViewGroup.MarginLayoutParams) r5
            int r0 = r4.getAdapterPosition()
            if (r0 != 0) goto L_0x0092
            r5.topMargin = r1
            goto L_0x00a7
        L_0x0092:
            android.view.View r0 = r4.itemView
            java.lang.String r1 = "itemView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            android.content.Context r0 = r0.getContext()
            r1 = 1090519040(0x41000000, float:8.0)
            float r0 = com.bytedance.common.utility.C9432q.m18687b(r0, r1)
            int r0 = (int) r0
            int r0 = -r0
            r5.topMargin = r0
        L_0x00a7:
            android.view.View r4 = r4.itemView
            java.lang.String r0 = "itemView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r0)
            android.view.ViewGroup$LayoutParams r5 = (android.view.ViewGroup.LayoutParams) r5
            r4.setLayoutParams(r5)
            return
        L_0x00b4:
            d.u r4 = new d.u
            java.lang.String r5 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.journey.C35716a.onBindViewHolder(android.support.v7.widget.RecyclerView$v, int):void");
    }
}
