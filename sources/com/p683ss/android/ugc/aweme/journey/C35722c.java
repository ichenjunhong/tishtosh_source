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
import java.util.List;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.journey.c */
public final class C35722c extends C1322a<C35723a> {

    /* renamed from: a */
    public Integer f91704a;

    /* renamed from: b */
    public final List<String> f91705b;

    /* renamed from: c */
    public final C52671b<Integer, C52860x> f91706c;

    /* renamed from: com.ss.android.ugc.aweme.journey.c$a */
    public final class C35723a extends C1352v {

        /* renamed from: a */
        final /* synthetic */ C35722c f91707a;

        /* renamed from: b */
        private final C35792w f91708b;

        /* renamed from: c */
        private final C35798y f91709c;

        public C35723a(C35722c cVar, final View view) {
            C52711k.m112240b(view, "view");
            this.f91707a = cVar;
            super(view);
            C35792w wVar = new C35792w(C9432q.m18687b(view.getContext(), 8.0f), Blur.NORMAL, 0.0f, C9432q.m18687b(view.getContext(), 2.0f), Color.parseColor("#1f000000"), C9432q.m18687b(view.getContext(), 2.0f));
            this.f91708b = wVar;
            View view2 = this.itemView;
            C52711k.m112236a((Object) view2, "itemView");
            Context context = view2.getContext();
            C52711k.m112236a((Object) context, "itemView.context");
            this.f91709c = new C35798y(context.getResources().getColor(R.color.aso), this.f91708b);
            C35798y yVar = this.f91709c;
            View view3 = this.itemView;
            C52711k.m112236a((Object) view3, "itemView");
            Context context2 = view3.getContext();
            C52711k.m112236a((Object) context2, "itemView.context");
            yVar.mo74466a(context2.getResources().getColor(R.color.j5));
            view.setBackground(this.f91709c);
            view.setOnClickListener(new OnClickListener(this) {

                /* renamed from: a */
                final /* synthetic */ C35723a f91710a;

                {
                    this.f91710a = r1;
                }

                public final void onClick(View view) {
                    Integer num;
                    ClickInstrumentation.onClick(view);
                    ImageView imageView = (ImageView) view.findViewById(R.id.t9);
                    C52711k.m112236a((Object) imageView, "view.choose_img");
                    ImageView imageView2 = (ImageView) view.findViewById(R.id.t9);
                    C52711k.m112236a((Object) imageView2, "view.choose_img");
                    imageView.setSelected(!imageView2.isSelected());
                    if (this.f91710a.getAdapterPosition() >= 0) {
                        C35722c cVar = this.f91710a.f91707a;
                        ImageView imageView3 = (ImageView) view.findViewById(R.id.t9);
                        C52711k.m112236a((Object) imageView3, "view.choose_img");
                        if (imageView3.isSelected()) {
                            num = Integer.valueOf(this.f91710a.getAdapterPosition());
                        } else {
                            num = null;
                        }
                        cVar.f91704a = num;
                        this.f91710a.f91707a.notifyDataSetChanged();
                        this.f91710a.f91707a.f91706c.invoke(this.f91710a.f91707a.f91704a);
                    }
                }
            });
            view.setLayerType(1, null);
        }
    }

    public final int getItemCount() {
        return this.f91705b.size();
    }

    public C35722c(List<String> list, C52671b<? super Integer, C52860x> bVar) {
        C52711k.m112240b(list, "genderSelectionList");
        C52711k.m112240b(bVar, "itemListener");
        this.f91705b = list;
        this.f91706c = bVar;
    }

    public final /* synthetic */ C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        C52711k.m112240b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bij, viewGroup, false);
        C52711k.m112236a((Object) inflate, "view");
        return new C35723a(this, inflate);
    }

    public final /* synthetic */ void onBindViewHolder(C1352v vVar, int i) {
        boolean z;
        C35723a aVar = (C35723a) vVar;
        C52711k.m112240b(aVar, "p0");
        View view = aVar.itemView;
        C52711k.m112236a((Object) view, "itemView");
        DmtTextView dmtTextView = (DmtTextView) view.findViewById(R.id.e__);
        C52711k.m112236a((Object) dmtTextView, "itemView.gender_item_name");
        dmtTextView.setText((CharSequence) aVar.f91707a.f91705b.get(aVar.getAdapterPosition()));
        View view2 = aVar.itemView;
        C52711k.m112236a((Object) view2, "itemView");
        ImageView imageView = (ImageView) view2.findViewById(R.id.t9);
        C52711k.m112236a((Object) imageView, "itemView.choose_img");
        Integer num = aVar.f91707a.f91704a;
        int adapterPosition = aVar.getAdapterPosition();
        if (num != null && num.intValue() == adapterPosition) {
            z = true;
        } else {
            z = false;
        }
        imageView.setSelected(z);
        View view3 = aVar.itemView;
        C52711k.m112236a((Object) view3, "itemView");
        LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams != null) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
            if (aVar.getAdapterPosition() == 0) {
                marginLayoutParams.topMargin = 0;
            } else {
                View view4 = aVar.itemView;
                C52711k.m112236a((Object) view4, "itemView");
                marginLayoutParams.topMargin = -((int) C9432q.m18687b(view4.getContext(), 8.0f));
            }
            View view5 = aVar.itemView;
            C52711k.m112236a((Object) view5, "itemView");
            view5.setLayoutParams(marginLayoutParams);
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }
}
