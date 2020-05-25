package com.p683ss.android.ugc.aweme.commercialize.anchor.p1546a;

import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0199s;
import android.support.constraint.ConstraintLayout;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.commercialize.anchor.C25600a;
import com.p683ss.android.ugc.aweme.commercialize.anchor.C25615b;
import com.p683ss.android.ugc.aweme.commercialize.anchor.C25626g;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.miniapp.anchor.p1953d.p1954a.C36830a;
import com.p683ss.android.ugc.aweme.services.publish.AnchorTransData;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.utils.C47760cd;
import com.ss.android.ugc.trill.R;
import java.net.URLDecoder;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.anchor.a.f */
public final class C25611f extends C1352v {

    /* renamed from: a */
    final RemoteImageView f67795a;

    /* renamed from: b */
    final DmtTextView f67796b;

    /* renamed from: c */
    public final ConstraintLayout f67797c;

    /* renamed from: d */
    final DmtTextView f67798d;

    /* renamed from: e */
    final DmtTextView f67799e;

    /* renamed from: f */
    final ImageView f67800f;

    /* renamed from: g */
    final ImageView f67801g;

    /* renamed from: h */
    public final C0184k f67802h;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.anchor.a.f$a */
    static final class C25612a<T> implements C0199s<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C25611f f67803a;

        C25612a(C25611f fVar) {
            this.f67803a = fVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            float f;
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                ConstraintLayout constraintLayout = this.f67803a.f67797c;
                C52711k.m112236a((Object) bool, "it");
                if (bool.booleanValue()) {
                    f = 1.0f;
                } else {
                    f = 0.34f;
                }
                constraintLayout.setAlpha(f);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.anchor.a.f$b */
    static final class C25613b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C25626g f67804a;

        C25613b(C25626g gVar) {
            this.f67804a = gVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (this.f67804a.f67830a == C25600a.GAME.getTYPE()) {
                C36830a aVar = (C36830a) C47760cd.m103384a(this.f67804a.f67836g, C36830a.class);
                C52711k.m112236a((Object) aVar, "gameInfo");
                C26890h.m65011a("gc_label_game_add", C23089d.m56640a().mo47829a("params_for_special", "game_platform").mo47829a("target_app_id", "2210").mo47829a("game_name", this.f67804a.f67832c).mo47829a("game_id", aVar.getId()).mo47829a("position", "auto_page").f61491a);
            }
            int i = this.f67804a.f67830a;
            String str = this.f67804a.f67836g;
            if (str == null) {
                str = "";
            }
            String decode = URLDecoder.decode(str);
            C52711k.m112236a((Object) decode, "URLDecoder.decode(anchor…                   ?: \"\")");
            AnchorTransData anchorTransData = new AnchorTransData(i, decode, this.f67804a.f67832c, null, Integer.valueOf(2), null, null, 104, null);
            C47718bf.m103288a(new C25615b(anchorTransData));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.anchor.a.f$c */
    static final class C25614c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C25626g f67805a;

        C25614c(C25626g gVar) {
            this.f67805a = gVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f67805a.f67841l.invoke();
        }
    }

    public C25611f(View view, C0184k kVar) {
        C52711k.m112240b(view, "view");
        C52711k.m112240b(kVar, "lifecycleOwner");
        super(view);
        this.f67802h = kVar;
        View findViewById = this.itemView.findViewById(R.id.axw);
        C52711k.m112236a((Object) findViewById, "itemView.findViewById(R.id.iv_anchor)");
        this.f67795a = (RemoteImageView) findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.d6q);
        C52711k.m112236a((Object) findViewById2, "itemView.findViewById(R.id.tv_anchor)");
        this.f67796b = (DmtTextView) findViewById2;
        View findViewById3 = this.itemView.findViewById(R.id.f6);
        C52711k.m112236a((Object) findViewById3, "itemView.findViewById(R.id.anchor_item_container)");
        this.f67797c = (ConstraintLayout) findViewById3;
        View findViewById4 = this.itemView.findViewById(R.id.dgu);
        C52711k.m112236a((Object) findViewById4, "itemView.findViewById(R.id.tv_subtitle)");
        this.f67798d = (DmtTextView) findViewById4;
        View findViewById5 = this.itemView.findViewById(R.id.jt);
        C52711k.m112236a((Object) findViewById5, "itemView.findViewById(R.id.beta_anchor)");
        this.f67799e = (DmtTextView) findViewById5;
        View findViewById6 = this.itemView.findViewById(R.id.edv);
        C52711k.m112236a((Object) findViewById6, "itemView.findViewById(R.id.iv_add)");
        this.f67800f = (ImageView) findViewById6;
        View findViewById7 = this.itemView.findViewById(R.id.edw);
        C52711k.m112236a((Object) findViewById7, "itemView.findViewById(R.id.iv_ai_tag)");
        this.f67801g = (ImageView) findViewById7;
    }
}
