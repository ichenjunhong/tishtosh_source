package com.p683ss.android.ugc.aweme.anchor.p1344b.p1349c;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p766a.C12197k;
import com.bytedance.lighten.p766a.C12203q;
import com.p683ss.android.ugc.aweme.anchor.C22678i;
import com.p683ss.android.ugc.aweme.anchor.api.model.AnchorCell;
import com.p683ss.android.ugc.aweme.anchor.api.model.AnchorIcon;
import com.p683ss.android.ugc.aweme.anchor.p1344b.p1345a.C22601a;
import com.p683ss.android.ugc.aweme.anchor.p1344b.p1345a.C22601a.C22605c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.miniapp_api.C36949e;
import com.p683ss.android.ugc.aweme.miniapp_api.model.p1962b.C36960b;
import com.p683ss.android.ugc.aweme.miniapp_api.model.p1962b.C36960b.C36961a;
import com.p683ss.android.ugc.aweme.miniapp_api.services.C36983a;
import com.p683ss.android.ugc.aweme.miniapp_api.services.IMiniAppService;
import com.ss.android.ugc.trill.R;
import leakcanary.internal.LeakCanaryFileProvider;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.anchor.b.c.a */
public final class C22634a extends C22601a<AnchorCell, C22635a> {

    /* renamed from: d */
    public final String f60798d;

    /* renamed from: com.ss.android.ugc.aweme.anchor.b.c.a$a */
    public final class C22635a extends C22605c {

        /* renamed from: d */
        public final SmartImageView f60799d;

        /* renamed from: e */
        public final DmtTextView f60800e;

        /* renamed from: f */
        public final DmtTextView f60801f;

        /* renamed from: g */
        final /* synthetic */ C22634a f60802g;

        /* renamed from: com.ss.android.ugc.aweme.anchor.b.c.a$a$a */
        static final class C22636a implements OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C22635a f60803a;

            /* renamed from: b */
            final /* synthetic */ AnchorCell f60804b;

            C22636a(C22635a aVar, AnchorCell anchorCell) {
                this.f60803a = aVar;
                this.f60804b = anchorCell;
            }

            public final void onClick(View view) {
                String str;
                ClickInstrumentation.onClick(view);
                C36983a b = C36983a.m83185b();
                C52711k.m112236a((Object) b, "MiniAppServiceProxy.inst()");
                IMiniAppService a = b.mo76294a();
                C36960b a2 = new C36961a().mo76222b("publish_anchor_point").mo76223c("021014").mo76220a("recommend").mo76221a();
                String launchModeHostTask = a.setLaunchModeHostTask(a.addScene(this.f60804b.f60742e, "021014"));
                View view2 = this.f60803a.itemView;
                C52711k.m112236a((Object) view2, "itemView");
                a.openMiniApp(view2.getContext(), launchModeHostTask, a2);
                String str2 = "mp_click";
                C23089d a3 = C23089d.m56640a().mo47829a("enter_from", "publish_anchor_point").mo47829a("mp_id", this.f60804b.f60738a);
                String str3 = "_param_for_special";
                if (C36949e.m83167c(this.f60804b.f60742e)) {
                    str = "micro_app";
                } else {
                    str = "micro_game";
                }
                C26890h.m65011a(str2, a3.mo47829a(str3, str).f61491a);
            }
        }

        /* renamed from: a */
        public final void mo46997a(AnchorCell anchorCell) {
            String str;
            C52711k.m112240b(anchorCell, "cell");
            super.mo46997a(anchorCell);
            AnchorIcon anchorIcon = anchorCell.f60739b;
            if (anchorIcon != null) {
                str = anchorIcon.f60745a;
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            C12203q.m24646a(str).mo23116a((C12197k) this.f60799d).mo23121a();
            DmtTextView dmtTextView = this.f60800e;
            C52711k.m112236a((Object) dmtTextView, LeakCanaryFileProvider.f132049i);
            dmtTextView.setText(anchorCell.f60740c);
            DmtTextView dmtTextView2 = this.f60801f;
            C52711k.m112236a((Object) dmtTextView2, "summary");
            dmtTextView2.setText(anchorCell.f60741d);
            this.itemView.setOnClickListener(new C22636a(this, anchorCell));
        }

        public C22635a(C22634a aVar, View view) {
            C52711k.m112240b(view, "itemView");
            this.f60802g = aVar;
            super(aVar, view, aVar.f60798d);
            this.f60799d = (SmartImageView) view.findViewById(R.id.ebg);
            this.f60800e = (DmtTextView) view.findViewById(R.id.f5f);
            this.f60801f = (DmtTextView) view.findViewById(R.id.f5g);
        }
    }

    public C22634a(C22678i iVar, String str) {
        C52711k.m112240b(str, "fragmentType");
        super(iVar);
        this.f60798d = str;
    }

    /* renamed from: a */
    public final /* synthetic */ C1352v mo14349a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C52711k.m112240b(layoutInflater, "inflater");
        C52711k.m112240b(viewGroup, "parent");
        View inflate = layoutInflater.inflate(R.layout.bhg, viewGroup, false);
        C52711k.m112236a((Object) inflate, "inflater.inflate(R.layou…micro_app, parent, false)");
        return new C22635a(this, inflate);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo14350a(C1352v vVar, Object obj) {
        String str;
        C22635a aVar = (C22635a) vVar;
        AnchorCell anchorCell = (AnchorCell) obj;
        C52711k.m112240b(aVar, "holder");
        C52711k.m112240b(anchorCell, "cell");
        aVar.mo46997a(anchorCell);
        String str2 = "mp_show";
        C23089d a = C23089d.m56640a().mo47829a("enter_from", "publish_anchor_point").mo47829a("mp_id", anchorCell.f60738a);
        String str3 = "_param_for_special";
        if (C36949e.m83167c(anchorCell.f60742e)) {
            str = "micro_app";
        } else {
            str = "micro_game";
        }
        C26890h.m65011a(str2, a.mo47829a(str3, str).f61491a);
    }
}
