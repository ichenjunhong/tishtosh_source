package com.p683ss.android.ugc.aweme.miniapp.anchor.p1950a;

import android.content.Context;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.i18n.C33095b;
import com.p683ss.android.ugc.aweme.miniapp.anchor.p1953d.p1954a.C36831b;
import com.p683ss.android.ugc.aweme.shortvideo.p2210m.C43990a;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45379ae;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.miniapp.anchor.a.e */
public final class C36807e extends C36795a<C36831b, C36808a> {

    /* renamed from: c */
    public C43990a f94075c;

    /* renamed from: com.ss.android.ugc.aweme.miniapp.anchor.a.e$a */
    public static final class C36808a extends C1352v {

        /* renamed from: a */
        public final RemoteImageView f94076a;

        /* renamed from: b */
        public final DmtTextView f94077b;

        /* renamed from: c */
        final DmtTextView f94078c;

        /* renamed from: d */
        public final Button f94079d;

        public C36808a(View view) {
            C52711k.m112240b(view, "itemView");
            super(view);
            View findViewById = view.findViewById(R.id.a_8);
            C52711k.m112236a((Object) findViewById, "itemView.findViewById(R.id.element_icon)");
            this.f94076a = (RemoteImageView) findViewById;
            View findViewById2 = view.findViewById(R.id.a_b);
            C52711k.m112236a((Object) findViewById2, "itemView.findViewById(R.id.element_name)");
            this.f94077b = (DmtTextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.a_d);
            C52711k.m112236a((Object) findViewById3, "itemView.findViewById(R.id.element_summary)");
            this.f94078c = (DmtTextView) findViewById3;
            View findViewById4 = view.findViewById(R.id.e0f);
            C52711k.m112236a((Object) findViewById4, "itemView.findViewById(R.id.btn_anchor_game_add)");
            this.f94079d = (Button) findViewById4;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.miniapp.anchor.a.e$b */
    static final class C36809b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C36807e f94080a;

        /* renamed from: b */
        final /* synthetic */ C36831b f94081b;

        C36809b(C36807e eVar, C36831b bVar) {
            this.f94080a = eVar;
            this.f94081b = bVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C43990a aVar = this.f94080a.f94075c;
            if (aVar != null) {
                C36831b bVar = this.f94081b;
                C52711k.m112236a((Object) bVar, "info");
                aVar.mo75998a(bVar);
            }
        }
    }

    public final /* synthetic */ C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        C52711k.m112240b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bhf, viewGroup, false);
        C52711k.m112236a((Object) inflate, "view");
        return new C36808a(inflate);
    }

    public final /* synthetic */ void onBindViewHolder(C1352v vVar, int i) {
        int i2;
        long j;
        C36808a aVar = (C36808a) vVar;
        C52711k.m112240b(aVar, "holder");
        super.onBindViewHolder(aVar, i);
        C36831b bVar = (C36831b) this.f94052a.get(i);
        aVar.f94079d.setOnClickListener(new C36809b(this, bVar));
        if (bVar != null) {
            C23515d.m57669a(aVar.f94076a, bVar.getPoster());
            aVar.f94077b.setText(bVar.getName());
            DmtTextView dmtTextView = aVar.f94078c;
            View view = aVar.itemView;
            C52711k.m112236a((Object) view, "itemView");
            Context context = view.getContext();
            Object[] objArr = new Object[2];
            Integer type = bVar.getType();
            if (type != null) {
                i2 = type.intValue();
            } else {
                i2 = -1;
            }
            objArr[0] = C45379ae.m98929a(i2);
            Long playCnt = bVar.getPlayCnt();
            if (playCnt != null) {
                j = playCnt.longValue();
            } else {
                j = 0;
            }
            objArr[1] = C33095b.m76068a(j);
            dmtTextView.setText(context.getString(R.string.gs6, objArr));
        }
    }
}
