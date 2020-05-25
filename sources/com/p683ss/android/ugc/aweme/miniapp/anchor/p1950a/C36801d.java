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
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.miniapp.anchor.a.d */
public final class C36801d extends C36795a<C36831b, C1352v> {

    /* renamed from: d */
    public static final C36802a f94065d = new C36802a(null);

    /* renamed from: c */
    public C43990a f94066c;

    /* renamed from: com.ss.android.ugc.aweme.miniapp.anchor.a.d$a */
    public static final class C36802a {
        private C36802a() {
        }

        public /* synthetic */ C36802a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.miniapp.anchor.a.d$b */
    public static final class C36803b extends C1352v {

        /* renamed from: a */
        public final RemoteImageView f94067a;

        /* renamed from: b */
        public final DmtTextView f94068b;

        /* renamed from: c */
        public final DmtTextView f94069c;

        /* renamed from: d */
        public final Button f94070d;

        public C36803b(View view) {
            C52711k.m112240b(view, "itemView");
            super(view);
            View findViewById = view.findViewById(R.id.a_8);
            C52711k.m112236a((Object) findViewById, "itemView.findViewById(R.id.element_icon)");
            this.f94067a = (RemoteImageView) findViewById;
            View findViewById2 = view.findViewById(R.id.a_b);
            C52711k.m112236a((Object) findViewById2, "itemView.findViewById(R.id.element_name)");
            this.f94068b = (DmtTextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.a_d);
            C52711k.m112236a((Object) findViewById3, "itemView.findViewById(R.id.element_summary)");
            this.f94069c = (DmtTextView) findViewById3;
            View findViewById4 = view.findViewById(R.id.e0f);
            C52711k.m112236a((Object) findViewById4, "itemView.findViewById(R.id.btn_anchor_game_add)");
            this.f94070d = (Button) findViewById4;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.miniapp.anchor.a.d$c */
    public static final class C36804c extends C1352v {
        public C36804c(View view) {
            C52711k.m112240b(view, "itemView");
            super(view);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.miniapp.anchor.a.d$d */
    static final class C36805d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C36801d f94071a;

        /* renamed from: b */
        final /* synthetic */ C36831b f94072b;

        C36805d(C36801d dVar, C36831b bVar) {
            this.f94071a = dVar;
            this.f94072b = bVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C43990a aVar = this.f94071a.f94066c;
            if (aVar != null) {
                C36831b bVar = this.f94072b;
                C52711k.m112236a((Object) bVar, "info");
                aVar.mo75998a(bVar);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.miniapp.anchor.a.d$e */
    static final class C36806e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C36801d f94073a;

        /* renamed from: b */
        final /* synthetic */ C36831b f94074b;

        C36806e(C36801d dVar, C36831b bVar) {
            this.f94073a = dVar;
            this.f94074b = bVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (this.f94073a.f94053b != null) {
                this.f94073a.f94053b.mo75996a(this.f94074b);
            }
        }
    }

    public final int getItemViewType(int i) {
        return i == 0 ? 0 : 1;
    }

    public final int getItemCount() {
        if (this.f94052a == null) {
            return 1;
        }
        return this.f94052a.size() + 1;
    }

    public final C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        C1352v vVar;
        C52711k.m112240b(viewGroup, "parent");
        switch (i) {
            case 0:
                View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bhh, viewGroup, false);
                C52711k.m112236a((Object) inflate, "LayoutInflater.from(pare…nd_header, parent, false)");
                vVar = new C36804c(inflate);
                break;
            case 1:
                View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bhf, viewGroup, false);
                C52711k.m112236a((Object) inflate2, "LayoutInflater.from(pare…nt_medium, parent, false)");
                vVar = new C36803b(inflate2);
                break;
            default:
                vVar = null;
                break;
        }
        if (vVar == null) {
            C52711k.m112234a();
        }
        return vVar;
    }

    public final void onBindViewHolder(C1352v vVar, int i) {
        int i2;
        long j;
        C52711k.m112240b(vVar, "holder");
        if (i >= 0 && i <= getItemCount() - 1 && (vVar instanceof C36803b)) {
            C36831b bVar = (C36831b) this.f94052a.get(i - 1);
            C36803b bVar2 = (C36803b) vVar;
            bVar2.f94070d.setOnClickListener(new C36805d(this, bVar));
            if (bVar != null) {
                C23515d.m57669a(bVar2.f94067a, bVar.getPoster());
                bVar2.f94068b.setText(bVar.getName());
                DmtTextView dmtTextView = bVar2.f94069c;
                View view = bVar2.itemView;
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
            vVar.itemView.setOnClickListener(new C36806e(this, bVar));
        }
    }
}
