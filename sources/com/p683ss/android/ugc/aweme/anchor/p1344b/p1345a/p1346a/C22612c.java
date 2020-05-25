package com.p683ss.android.ugc.aweme.anchor.p1344b.p1345a.p1346a;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.anchor.C22678i;
import com.p683ss.android.ugc.aweme.anchor.p1344b.p1345a.C22601a;
import com.p683ss.android.ugc.aweme.anchor.p1344b.p1345a.C22601a.C22602a;
import com.ss.android.ugc.trill.R;
import leakcanary.internal.LeakCanaryFileProvider;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;
import p2663f.p2664a.p2665a.C53037e;

/* renamed from: com.ss.android.ugc.aweme.anchor.b.a.a.c */
public final class C22612c extends C22601a<String, C22614b> {

    /* renamed from: d */
    public C22613a f60768d;

    /* renamed from: com.ss.android.ugc.aweme.anchor.b.a.a.c$a */
    public interface C22613a {
        /* renamed from: a */
        void mo46999a(String str);
    }

    /* renamed from: com.ss.android.ugc.aweme.anchor.b.a.a.c$b */
    public final class C22614b extends C22602a {

        /* renamed from: b */
        public final DmtTextView f60769b;

        /* renamed from: c */
        public final ImageView f60770c;

        /* renamed from: d */
        final /* synthetic */ C22612c f60771d;

        public C22614b(C22612c cVar, View view) {
            C52711k.m112240b(view, "itemView");
            this.f60771d = cVar;
            super(cVar, view);
            this.f60769b = (DmtTextView) view.findViewById(R.id.ap0);
            this.f60770c = (ImageView) view.findViewById(R.id.aoz);
            this.f60770c.setOnClickListener(new OnClickListener(this) {

                /* renamed from: a */
                final /* synthetic */ C22614b f60772a;

                {
                    this.f60772a = r1;
                }

                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    C53037e eVar = this.f60772a.f60771d.f131516e;
                    C52711k.m112236a((Object) eVar, "adapter");
                    Object obj = eVar.f131517a.get(this.f60772a.getAdapterPosition());
                    if (obj != null) {
                        String str = (String) obj;
                        C22613a aVar = this.f60772a.f60771d.f60768d;
                        if (aVar != null) {
                            aVar.mo46999a(str);
                            return;
                        }
                        return;
                    }
                    throw new C52857u("null cannot be cast to non-null type kotlin.String");
                }
            });
        }
    }

    public C22612c(C22678i iVar) {
        super(iVar);
    }

    /* renamed from: a */
    public final /* synthetic */ C1352v mo14349a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C52711k.m112240b(layoutInflater, "inflater");
        C52711k.m112240b(viewGroup, "parent");
        View inflate = layoutInflater.inflate(R.layout.s0, viewGroup, false);
        C52711k.m112236a((Object) inflate, "inflater.inflate(R.layou…h_history, parent, false)");
        return new C22614b(this, inflate);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo14350a(C1352v vVar, Object obj) {
        C22614b bVar = (C22614b) vVar;
        String str = (String) obj;
        C52711k.m112240b(bVar, "holder");
        C52711k.m112240b(str, LeakCanaryFileProvider.f132049i);
        DmtTextView dmtTextView = bVar.f60769b;
        C52711k.m112236a((Object) dmtTextView, "holder.mName");
        dmtTextView.setText(str);
    }
}
