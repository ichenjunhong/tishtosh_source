package com.p683ss.android.ugc.aweme.sharer.p2173ui.bar;

import android.content.Context;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42310b;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42357g;
import com.ss.android.ugc.trill.R;
import java.util.List;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sharer.ui.bar.a */
public final class C42336a extends C1322a<C42337a> {

    /* renamed from: c */
    public static final C42338b f106926c = new C42338b(null);

    /* renamed from: a */
    public List<? extends C42357g> f106927a = C52575l.m112097a();

    /* renamed from: b */
    public final C42341c f106928b;

    /* renamed from: com.ss.android.ugc.aweme.sharer.ui.bar.a$a */
    public static final class C42337a extends C1352v {

        /* renamed from: a */
        public final ImageView f106929a;

        /* renamed from: b */
        public final DmtTextView f106930b;

        /* renamed from: c */
        public final View f106931c;

        public C42337a(View view) {
            C52711k.m112240b(view, "itemView");
            super(view);
            View findViewById = view.findViewById(R.id.cmk);
            C52711k.m112236a((Object) findViewById, "itemView.findViewById(R.id.share_action_icon)");
            this.f106929a = (ImageView) findViewById;
            View findViewById2 = view.findViewById(R.id.cmm);
            C52711k.m112236a((Object) findViewById2, "itemView.findViewById(R.id.share_action_label)");
            this.f106930b = (DmtTextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.cml);
            C52711k.m112236a((Object) findViewById3, "itemView.findViewById(R.….share_action_icon_badge)");
            this.f106931c = findViewById3;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sharer.ui.bar.a$b */
    public static final class C42338b {
        private C42338b() {
        }

        public /* synthetic */ C42338b(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sharer.ui.bar.a$c */
    static final class C42339c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C42336a f106932a;

        /* renamed from: b */
        final /* synthetic */ int f106933b;

        C42339c(C42336a aVar, int i) {
            this.f106932a = aVar;
            this.f106933b = i;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (!C42310b.m92909a(view, 1200)) {
                this.f106932a.f106928b.mo86165a((C42357g) this.f106932a.f106927a.get(this.f106933b));
            }
        }
    }

    public final int getItemCount() {
        return this.f106927a.size();
    }

    /* renamed from: a */
    public final void mo86252a(List<? extends C42357g> list) {
        C52711k.m112240b(list, "actions");
        this.f106927a = list;
        notifyDataSetChanged();
    }

    public C42336a(C42341c cVar) {
        C52711k.m112240b(cVar, "listener");
        this.f106928b = cVar;
    }

    public final /* synthetic */ void onViewDetachedFromWindow(C1352v vVar) {
        C42337a aVar = (C42337a) vVar;
        C52711k.m112240b(aVar, "holder");
        Animation animation = aVar.f106929a.getAnimation();
        if (animation != null) {
            animation.cancel();
        }
        super.onViewDetachedFromWindow(aVar);
    }

    public final /* synthetic */ void onViewAttachedToWindow(C1352v vVar) {
        C42337a aVar = (C42337a) vVar;
        C52711k.m112240b(aVar, "holder");
        super.onViewAttachedToWindow(aVar);
        int adapterPosition = aVar.getAdapterPosition();
        if (adapterPosition >= 0 && adapterPosition < getItemCount()) {
            ((C42357g) this.f106927a.get(adapterPosition)).mo49951a(aVar.f106929a);
        }
    }

    public final /* synthetic */ C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        C52711k.m112240b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a7j, viewGroup, false);
        C52711k.m112236a((Object) inflate, "itemView");
        return new C42337a(inflate);
    }

    public final /* synthetic */ void onBindViewHolder(C1352v vVar, int i) {
        int i2;
        float f;
        C42337a aVar = (C42337a) vVar;
        C52711k.m112240b(aVar, "holder");
        Context context = aVar.f106929a.getContext();
        ImageView imageView = aVar.f106929a;
        C52711k.m112236a((Object) context, "context");
        imageView.setImageDrawable(context.getResources().getDrawable(((C42357g) this.f106927a.get(i)).mo49948a()));
        ((C42357g) this.f106927a.get(i)).mo49952a((TextView) aVar.f106930b);
        View view = aVar.f106931c;
        if (((C42357g) this.f106927a.get(i)).mo49955d()) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        view.setVisibility(i2);
        ImageView imageView2 = aVar.f106929a;
        float f2 = 0.34f;
        if (((C42357g) this.f106927a.get(i)).mo49957f()) {
            f = 1.0f;
        } else {
            f = 0.34f;
        }
        imageView2.setAlpha(f);
        DmtTextView dmtTextView = aVar.f106930b;
        if (((C42357g) this.f106927a.get(i)).mo49957f()) {
            f2 = 1.0f;
        }
        dmtTextView.setAlpha(f2);
        aVar.itemView.setOnClickListener(new C42339c(this, i));
    }
}
