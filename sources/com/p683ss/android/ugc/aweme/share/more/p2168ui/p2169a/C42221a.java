package com.p683ss.android.ugc.aweme.share.more.p2168ui.p2169a;

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
import com.p683ss.android.ugc.aweme.sharer.p2173ui.bar.C42341c;
import com.ss.android.ugc.trill.R;
import java.util.List;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.share.more.ui.a.a */
public final class C42221a extends C1322a<C42222a> {

    /* renamed from: c */
    public static final C42223b f106746c = new C42223b(null);

    /* renamed from: a */
    public List<? extends C42357g> f106747a = C52575l.m112097a();

    /* renamed from: b */
    public final C42341c f106748b;

    /* renamed from: com.ss.android.ugc.aweme.share.more.ui.a.a$a */
    public static final class C42222a extends C1352v {

        /* renamed from: a */
        public final ImageView f106749a;

        /* renamed from: b */
        public final DmtTextView f106750b;

        public C42222a(View view) {
            C52711k.m112240b(view, "itemView");
            super(view);
            View findViewById = view.findViewById(R.id.eli);
            C52711k.m112236a((Object) findViewById, "itemView.findViewById(R.id.more_action_icon)");
            this.f106749a = (ImageView) findViewById;
            View findViewById2 = view.findViewById(R.id.elj);
            C52711k.m112236a((Object) findViewById2, "itemView.findViewById(R.id.more_action_label)");
            this.f106750b = (DmtTextView) findViewById2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.more.ui.a.a$b */
    public static final class C42223b {
        private C42223b() {
        }

        public /* synthetic */ C42223b(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.more.ui.a.a$c */
    static final class C42224c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C42221a f106751a;

        /* renamed from: b */
        final /* synthetic */ int f106752b;

        C42224c(C42221a aVar, int i) {
            this.f106751a = aVar;
            this.f106752b = i;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (!C42310b.m92909a(view, 1200)) {
                this.f106751a.f106748b.mo86165a((C42357g) this.f106751a.f106747a.get(this.f106752b));
            }
        }
    }

    public final int getItemCount() {
        return this.f106747a.size();
    }

    /* renamed from: a */
    public final void mo86172a(List<? extends C42357g> list) {
        C52711k.m112240b(list, "actions");
        this.f106747a = list;
        notifyDataSetChanged();
    }

    public C42221a(C42341c cVar) {
        C52711k.m112240b(cVar, "listener");
        this.f106748b = cVar;
    }

    public final /* synthetic */ void onViewDetachedFromWindow(C1352v vVar) {
        C42222a aVar = (C42222a) vVar;
        C52711k.m112240b(aVar, "holder");
        Animation animation = aVar.f106749a.getAnimation();
        if (animation != null) {
            animation.cancel();
        }
        super.onViewDetachedFromWindow(aVar);
    }

    public final /* synthetic */ void onViewAttachedToWindow(C1352v vVar) {
        C42222a aVar = (C42222a) vVar;
        C52711k.m112240b(aVar, "holder");
        super.onViewAttachedToWindow(aVar);
        int adapterPosition = aVar.getAdapterPosition();
        if (adapterPosition >= 0 && adapterPosition < getItemCount()) {
            ((C42357g) this.f106747a.get(adapterPosition)).mo49951a(aVar.f106749a);
        }
    }

    public final /* synthetic */ C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        C52711k.m112240b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bun, viewGroup, false);
        C52711k.m112236a((Object) inflate, "itemView");
        return new C42222a(inflate);
    }

    public final /* synthetic */ void onBindViewHolder(C1352v vVar, int i) {
        float f;
        C42222a aVar = (C42222a) vVar;
        C52711k.m112240b(aVar, "holder");
        Context context = aVar.f106749a.getContext();
        ImageView imageView = aVar.f106749a;
        C52711k.m112236a((Object) context, "context");
        imageView.setImageDrawable(context.getResources().getDrawable(((C42357g) this.f106747a.get(i)).mo49958g()));
        ((C42357g) this.f106747a.get(i)).mo49952a((TextView) aVar.f106750b);
        ImageView imageView2 = aVar.f106749a;
        float f2 = 0.34f;
        if (((C42357g) this.f106747a.get(i)).mo49957f()) {
            f = 1.0f;
        } else {
            f = 0.34f;
        }
        imageView2.setAlpha(f);
        DmtTextView dmtTextView = aVar.f106750b;
        if (((C42357g) this.f106747a.get(i)).mo49957f()) {
            f2 = 1.0f;
        }
        dmtTextView.setAlpha(f2);
        aVar.itemView.setOnClickListener(new C42224c(this, i));
    }
}
