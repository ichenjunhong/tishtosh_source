package com.p683ss.android.ugc.aweme.language;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.language.n */
public final class C35850n extends C1352v {

    /* renamed from: a */
    final DmtTextView f92046a;

    /* renamed from: b */
    final LinearLayout f92047b;

    /* renamed from: com.ss.android.ugc.aweme.language.n$a */
    static final class C35851a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C52671b f92048a;

        /* renamed from: b */
        final /* synthetic */ C35841k f92049b;

        C35851a(C52671b bVar, C35841k kVar) {
            this.f92048a = bVar;
            this.f92049b = kVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C52671b bVar = this.f92048a;
            if (bVar != null) {
                bVar.invoke(this.f92049b);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.language.n$b */
    static final class C35852b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C52671b f92050a;

        /* renamed from: b */
        final /* synthetic */ C35841k f92051b;

        C35852b(C52671b bVar, C35841k kVar) {
            this.f92050a = bVar;
            this.f92051b = kVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C52671b bVar = this.f92050a;
            if (bVar != null) {
                bVar.invoke(this.f92051b);
            }
        }
    }

    public C35850n(View view) {
        C52711k.m112240b(view, "itemView");
        super(view);
        DmtTextView dmtTextView = (DmtTextView) view.findViewById(R.id.cay);
        C52711k.m112236a((Object) dmtTextView, "itemView.region_text");
        this.f92046a = dmtTextView;
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.cfg);
        C52711k.m112236a((Object) linearLayout, "itemView.root_layout");
        this.f92047b = linearLayout;
    }
}
