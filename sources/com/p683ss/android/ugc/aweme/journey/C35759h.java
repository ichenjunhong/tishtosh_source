package com.p683ss.android.ugc.aweme.journey;

import android.content.Context;
import android.graphics.BlurMaskFilter.Blur;
import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p766a.C12197k;
import com.bytedance.lighten.p766a.C12203q;
import com.bytedance.lighten.p766a.C12208t;
import com.ss.android.ugc.trill.R;
import java.util.LinkedHashSet;
import java.util.List;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.journey.h */
public final class C35759h extends C1322a<C35760a> {

    /* renamed from: a */
    public final LinkedHashSet<Integer> f91846a = new LinkedHashSet<>();

    /* renamed from: b */
    public final List<C35777q> f91847b;

    /* renamed from: c */
    public final C52671b<Integer, C52860x> f91848c;

    /* renamed from: com.ss.android.ugc.aweme.journey.h$a */
    public final class C35760a extends C1352v {

        /* renamed from: a */
        final C35798y f91849a;

        /* renamed from: b */
        final C35798y f91850b;

        /* renamed from: c */
        public final int f91851c;

        /* renamed from: d */
        final /* synthetic */ C35759h f91852d;

        /* renamed from: e */
        private final C35792w f91853e;

        public C35760a(C35759h hVar, View view) {
            C52711k.m112240b(view, "view");
            this.f91852d = hVar;
            super(view);
            C35792w wVar = new C35792w(C9432q.m18687b(view.getContext(), 8.0f), Blur.NORMAL, 0.0f, C9432q.m18687b(view.getContext(), 2.0f), Color.parseColor("#1f000000"), C9432q.m18687b(view.getContext(), 24.0f));
            this.f91853e = wVar;
            this.f91849a = new C35798y(view.getResources().getColor(R.color.aso), this.f91853e);
            this.f91850b = new C35798y(view.getResources().getColor(R.color.ja), this.f91853e);
            View view2 = this.itemView;
            C52711k.m112236a((Object) view2, "itemView");
            this.f91851c = (int) C9432q.m18687b(view2.getContext(), 28.0f);
            C35798y yVar = this.f91849a;
            View view3 = this.itemView;
            C52711k.m112236a((Object) view3, "itemView");
            Context context = view3.getContext();
            C52711k.m112236a((Object) context, "itemView.context");
            yVar.mo74466a(context.getResources().getColor(R.color.j5));
            view.setOnClickListener(new OnClickListener(this) {

                /* renamed from: a */
                final /* synthetic */ C35760a f91854a;

                {
                    this.f91854a = r1;
                }

                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    View view2 = this.f91854a.itemView;
                    C52711k.m112236a((Object) view2, "itemView");
                    ConstraintLayout constraintLayout = (ConstraintLayout) view2.findViewById(R.id.ed6);
                    C52711k.m112236a((Object) constraintLayout, "itemView.interest_root");
                    if (constraintLayout.isSelected()) {
                        this.f91854a.f91852d.f91846a.remove(Integer.valueOf(this.f91854a.getAdapterPosition()));
                    } else {
                        this.f91854a.f91852d.f91846a.add(Integer.valueOf(this.f91854a.getAdapterPosition()));
                    }
                    this.f91854a.f91852d.notifyItemChanged(this.f91854a.getAdapterPosition());
                    this.f91854a.f91852d.f91848c.invoke(Integer.valueOf(this.f91854a.f91852d.f91846a.size()));
                }
            });
            view.setLayerType(1, null);
        }
    }

    public final int getItemCount() {
        return this.f91847b.size();
    }

    public C35759h(List<C35777q> list, C52671b<? super Integer, C52860x> bVar) {
        C52711k.m112240b(list, "newUserInterestStruct");
        C52711k.m112240b(bVar, "sizeListner");
        this.f91847b = list;
        this.f91848c = bVar;
    }

    public final /* synthetic */ C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        C52711k.m112240b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bik, viewGroup, false);
        C52711k.m112236a((Object) inflate, "view");
        return new C35760a(this, inflate);
    }

    public final /* synthetic */ void onBindViewHolder(C1352v vVar, int i) {
        C35760a aVar = (C35760a) vVar;
        C52711k.m112240b(aVar, "p0");
        C35777q qVar = (C35777q) aVar.f91852d.f91847b.get(aVar.getAdapterPosition());
        View view = aVar.itemView;
        C52711k.m112236a((Object) view, "itemView");
        DmtTextView dmtTextView = (DmtTextView) view.findViewById(R.id.text);
        C52711k.m112236a((Object) dmtTextView, "itemView.text");
        dmtTextView.setText(qVar.f91888b);
        boolean contains = aVar.f91852d.f91846a.contains(Integer.valueOf(aVar.getAdapterPosition()));
        View view2 = aVar.itemView;
        C52711k.m112236a((Object) view2, "itemView");
        ConstraintLayout constraintLayout = (ConstraintLayout) view2.findViewById(R.id.ed6);
        C52711k.m112236a((Object) constraintLayout, "itemView.interest_root");
        constraintLayout.setSelected(contains);
        if (contains) {
            View view3 = aVar.itemView;
            C52711k.m112236a((Object) view3, "itemView");
            ConstraintLayout constraintLayout2 = (ConstraintLayout) view3.findViewById(R.id.ed6);
            C52711k.m112236a((Object) constraintLayout2, "itemView.interest_root");
            constraintLayout2.setBackground(aVar.f91850b);
            View view4 = aVar.itemView;
            C52711k.m112236a((Object) view4, "itemView");
            ConstraintLayout constraintLayout3 = (ConstraintLayout) view4.findViewById(R.id.ed6);
            C52711k.m112236a((Object) constraintLayout3, "itemView.interest_root");
            ((SmartImageView) constraintLayout3.findViewById(R.id.aro)).setImageResource(R.drawable.d0y);
            View view5 = aVar.itemView;
            C52711k.m112236a((Object) view5, "itemView");
            ConstraintLayout constraintLayout4 = (ConstraintLayout) view5.findViewById(R.id.ed6);
            C52711k.m112236a((Object) constraintLayout4, "itemView.interest_root");
            DmtTextView dmtTextView2 = (DmtTextView) constraintLayout4.findViewById(R.id.text);
            View view6 = aVar.itemView;
            C52711k.m112236a((Object) view6, "itemView");
            dmtTextView2.setTextColor(view6.getResources().getColor(R.color.jf));
            return;
        }
        View view7 = aVar.itemView;
        C52711k.m112236a((Object) view7, "itemView");
        ConstraintLayout constraintLayout5 = (ConstraintLayout) view7.findViewById(R.id.ed6);
        C52711k.m112236a((Object) constraintLayout5, "itemView.interest_root");
        constraintLayout5.setBackground(aVar.f91849a);
        View view8 = aVar.itemView;
        C52711k.m112236a((Object) view8, "itemView");
        ConstraintLayout constraintLayout6 = (ConstraintLayout) view8.findViewById(R.id.ed6);
        C52711k.m112236a((Object) constraintLayout6, "itemView.interest_root");
        DmtTextView dmtTextView3 = (DmtTextView) constraintLayout6.findViewById(R.id.text);
        View view9 = aVar.itemView;
        C52711k.m112236a((Object) view9, "itemView");
        Context context = view9.getContext();
        C52711k.m112236a((Object) context, "itemView.context");
        dmtTextView3.setTextColor(context.getResources().getColor(R.color.ji));
        String str = ((C35777q) aVar.f91852d.f91847b.get(aVar.getAdapterPosition())).f91889c;
        if (str == null) {
            str = "";
        }
        C12208t a = C12203q.m24646a(str).mo23111a(aVar.f91851c, aVar.f91851c).mo23118a("NewUserJourneyActivity");
        View view10 = aVar.itemView;
        C52711k.m112236a((Object) view10, "itemView");
        ConstraintLayout constraintLayout7 = (ConstraintLayout) view10.findViewById(R.id.ed6);
        C52711k.m112236a((Object) constraintLayout7, "itemView.interest_root");
        a.mo23116a((C12197k) (SmartImageView) constraintLayout7.findViewById(R.id.aro)).mo23121a();
    }
}
