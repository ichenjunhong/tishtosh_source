package com.p683ss.android.ugc.aweme.commercialize.anchor.p1546a;

import android.content.Context;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.commercialize.anchor.C25625f;
import com.p683ss.android.ugc.aweme.feed.model.WikipediaInfo;
import com.ss.android.ugc.trill.R;
import java.util.Map;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.anchor.a.d */
public final class C25608d extends C1352v {

    /* renamed from: a */
    final DmtTextView f67788a;

    /* renamed from: b */
    final ImageView f67789b;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.anchor.a.d$a */
    static final class C25609a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C25608d f67790a;

        /* renamed from: b */
        final /* synthetic */ C52671b f67791b;

        /* renamed from: c */
        final /* synthetic */ WikipediaInfo f67792c;

        /* renamed from: d */
        final /* synthetic */ Map f67793d;

        C25609a(C25608d dVar, C52671b bVar, WikipediaInfo wikipediaInfo, Map map) {
            this.f67790a = dVar;
            this.f67791b = bVar;
            this.f67792c = wikipediaInfo;
            this.f67793d = map;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f67791b.invoke(this.f67792c);
            View view2 = this.f67790a.itemView;
            C52711k.m112236a((Object) view2, "itemView");
            Context context = view2.getContext();
            C52711k.m112236a((Object) context, "itemView.context");
            C25625f.m62154a(context, this.f67792c, this.f67793d);
        }
    }

    public C25608d(View view) {
        C52711k.m112240b(view, "view");
        super(view);
        View findViewById = this.itemView.findViewById(R.id.f2q);
        C52711k.m112236a((Object) findViewById, "itemView.findViewById(R.…em_select_anchor_keyword)");
        this.f67788a = (DmtTextView) findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.ef4);
        C52711k.m112236a((Object) findViewById2, "itemView.findViewById(R.…item_select_anchor_arrow)");
        this.f67789b = (ImageView) findViewById2;
    }
}
