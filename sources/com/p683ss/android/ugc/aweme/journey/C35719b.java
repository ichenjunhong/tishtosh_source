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
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.ss.android.ugc.trill.R;
import java.util.LinkedHashSet;
import java.util.List;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.journey.b */
public final class C35719b extends C1322a<C35720a> {

    /* renamed from: a */
    public final LinkedHashSet<Integer> f91697a = new LinkedHashSet<>();

    /* renamed from: b */
    public final C52671b<Integer, C52860x> f91698b;

    /* renamed from: c */
    private final List<C35765k> f91699c;

    /* renamed from: com.ss.android.ugc.aweme.journey.b$a */
    public final class C35720a extends C1352v {

        /* renamed from: a */
        final /* synthetic */ C35719b f91700a;

        /* renamed from: b */
        private final C35792w f91701b;

        /* renamed from: c */
        private final C35798y f91702c;

        public C35720a(C35719b bVar, View view) {
            C52711k.m112240b(view, "view");
            this.f91700a = bVar;
            super(view);
            C35792w wVar = new C35792w(C9432q.m18687b(view.getContext(), 8.0f), Blur.NORMAL, 0.0f, C9432q.m18687b(view.getContext(), 2.0f), Color.parseColor("#1f000000"), C9432q.m18687b(view.getContext(), 2.0f));
            this.f91701b = wVar;
            this.f91702c = new C35798y(view.getResources().getColor(R.color.aso), this.f91701b);
            C35798y yVar = this.f91702c;
            View view2 = this.itemView;
            C52711k.m112236a((Object) view2, "itemView");
            Context context = view2.getContext();
            C52711k.m112236a((Object) context, "itemView.context");
            yVar.mo74466a(context.getResources().getColor(R.color.j5));
            view.setBackground(this.f91702c);
            view.setOnClickListener(new OnClickListener(this) {

                /* renamed from: a */
                final /* synthetic */ C35720a f91703a;

                {
                    this.f91703a = r1;
                }

                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    View view2 = this.f91703a.itemView;
                    C52711k.m112236a((Object) view2, "itemView");
                    ImageView imageView = (ImageView) view2.findViewById(R.id.sv);
                    C52711k.m112236a((Object) imageView, "itemView.check_img");
                    if (imageView.isSelected()) {
                        this.f91703a.f91700a.f91697a.remove(Integer.valueOf(this.f91703a.getAdapterPosition()));
                    } else {
                        this.f91703a.f91700a.f91697a.add(Integer.valueOf(this.f91703a.getAdapterPosition()));
                    }
                    View view3 = this.f91703a.itemView;
                    C52711k.m112236a((Object) view3, "itemView");
                    ImageView imageView2 = (ImageView) view3.findViewById(R.id.sv);
                    C52711k.m112236a((Object) imageView2, "itemView.check_img");
                    View view4 = this.f91703a.itemView;
                    C52711k.m112236a((Object) view4, "itemView");
                    ImageView imageView3 = (ImageView) view4.findViewById(R.id.sv);
                    C52711k.m112236a((Object) imageView3, "itemView.check_img");
                    imageView2.setSelected(!imageView3.isSelected());
                    this.f91703a.f91700a.f91698b.invoke(Integer.valueOf(this.f91703a.f91700a.f91697a.size()));
                }
            });
            view.setLayerType(1, null);
        }
    }

    public final int getItemCount() {
        return this.f91699c.size();
    }

    public C35719b(List<C35765k> list, C52671b<? super Integer, C52860x> bVar) {
        C52711k.m112240b(list, "contentLanguage");
        C52711k.m112240b(bVar, "sizeListner");
        this.f91699c = list;
        this.f91698b = bVar;
    }

    public final /* synthetic */ C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        C52711k.m112240b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bii, viewGroup, false);
        C52711k.m112236a((Object) inflate, "view");
        return new C35720a(this, inflate);
    }

    public final /* synthetic */ void onBindViewHolder(C1352v vVar, int i) {
        C35720a aVar = (C35720a) vVar;
        C52711k.m112240b(aVar, "p0");
        C35765k kVar = (C35765k) this.f91699c.get(i);
        boolean contains = this.f91697a.contains(Integer.valueOf(i));
        C52711k.m112240b(kVar, "contentLanguage");
        View view = aVar.itemView;
        C52711k.m112236a((Object) view, "itemView");
        ImageView imageView = (ImageView) view.findViewById(R.id.sv);
        C52711k.m112236a((Object) imageView, "itemView.check_img");
        imageView.setSelected(contains);
        View view2 = aVar.itemView;
        C52711k.m112236a((Object) view2, "itemView");
        DmtTextView dmtTextView = (DmtTextView) view2.findViewById(R.id.e7e);
        C52711k.m112236a((Object) dmtTextView, "itemView.english");
        dmtTextView.setText(kVar.f91858b);
        View view3 = aVar.itemView;
        C52711k.m112236a((Object) view3, "itemView");
        DmtTextView dmtTextView2 = (DmtTextView) view3.findViewById(R.id.ekp);
        C52711k.m112236a((Object) dmtTextView2, "itemView.local_language");
        dmtTextView2.setText(kVar.f91859c);
        View view4 = aVar.itemView;
        C52711k.m112236a((Object) view4, "itemView");
        LayoutParams layoutParams = view4.getLayoutParams();
        if (layoutParams != null) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
            if (aVar.getAdapterPosition() <= 1) {
                marginLayoutParams.topMargin = 0;
            } else {
                View view5 = aVar.itemView;
                C52711k.m112236a((Object) view5, "itemView");
                marginLayoutParams.topMargin = -((int) C9432q.m18687b(view5.getContext(), 8.0f));
            }
            if (aVar.getAdapterPosition() % 2 == 0) {
                marginLayoutParams.leftMargin = 0;
            } else {
                View view6 = aVar.itemView;
                C52711k.m112236a((Object) view6, "itemView");
                marginLayoutParams.leftMargin = -((int) C9432q.m18687b(view6.getContext(), 8.0f));
            }
            View view7 = aVar.itemView;
            C52711k.m112236a((Object) view7, "itemView");
            view7.setLayoutParams(marginLayoutParams);
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }
}
