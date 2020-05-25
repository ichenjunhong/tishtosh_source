package com.p683ss.android.ugc.aweme.anchor.p1344b.p1348b;

import android.support.p030v4.p038f.C0777a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
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
import com.p683ss.android.ugc.aweme.commercialize.anchor.C25600a;
import com.p683ss.android.ugc.aweme.commercialize.anchor.C25615b;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.miniapp.anchor.C36811b;
import com.p683ss.android.ugc.aweme.services.publish.AnchorTransData;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.ss.android.ugc.trill.R;
import java.util.Map;
import leakcanary.internal.LeakCanaryFileProvider;
import org.json.JSONException;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.anchor.b.b.a */
public final class C22630a extends C22601a<AnchorCell, C22631a> {

    /* renamed from: d */
    public final String f60789d;

    /* renamed from: com.ss.android.ugc.aweme.anchor.b.b.a$a */
    public final class C22631a extends C22605c {

        /* renamed from: d */
        public final SmartImageView f60790d;

        /* renamed from: e */
        public final DmtTextView f60791e;

        /* renamed from: f */
        public final DmtTextView f60792f;

        /* renamed from: g */
        public final Button f60793g;

        /* renamed from: h */
        final /* synthetic */ C22630a f60794h;

        /* renamed from: com.ss.android.ugc.aweme.anchor.b.b.a$a$a */
        static final class C22632a implements OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C22631a f60795a;

            /* renamed from: b */
            final /* synthetic */ AnchorCell f60796b;

            C22632a(C22631a aVar, AnchorCell anchorCell) {
                this.f60795a = aVar;
                this.f60796b = anchorCell;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (C52711k.m112239a((Object) this.f60795a.f60794h.f60789d, (Object) "enter_page")) {
                    C26890h.m65011a("gc_label_game_add", C23089d.m56640a().mo47829a("params_for_special", "game_platform").mo47829a("target_app_id", "2210").mo47829a("game_name", this.f60796b.f60740c).mo47829a("game_id", this.f60796b.f60738a).mo47829a("position", this.f60795a.f60794h.f60789d).f61491a);
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", this.f60796b.f60738a);
                    jSONObject.put(LeakCanaryFileProvider.f132049i, this.f60796b.f60740c);
                    jSONObject.put("icon", this.f60796b.f60739b);
                    jSONObject.put("title", this.f60796b.f60740c);
                    jSONObject.put("description", this.f60796b.f60741d);
                    jSONObject.put("extra", this.f60796b.f60743f);
                    jSONObject.put("keyword", this.f60796b.f60740c);
                } catch (JSONException e) {
                    C32458a.m75143a((Exception) e);
                }
                String a = C36811b.m82838a();
                Map aVar = new C0777a();
                aVar.put("anchor_content", jSONObject.toString());
                try {
                    jSONObject.put("url", C36811b.m82840a(a, aVar));
                } catch (JSONException e2) {
                    C32458a.m75143a((Exception) e2);
                }
                if (!TextUtils.isEmpty(this.f60796b.f60740c)) {
                    String str = this.f60796b.f60740c;
                    if (str == null) {
                        str = "";
                    }
                    String str2 = str;
                    String jSONObject2 = jSONObject.toString();
                    C52711k.m112236a((Object) jSONObject2, "contentMap.toString()");
                    C52711k.m112240b(str2, "anchorTitle");
                    C52711k.m112240b(jSONObject2, "anchorContent");
                    AnchorTransData anchorTransData = new AnchorTransData(C25600a.GAME.getTYPE(), jSONObject2, str2, null, Integer.valueOf(1), null, null, 104, null);
                    C47718bf.m103288a(new C25615b(anchorTransData));
                }
                C22678i iVar = this.f60795a.f60794h.f60755b;
                if (iVar != null) {
                    iVar.mo46970e();
                }
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.anchor.b.b.a$a$b */
        static final class C22633b implements OnClickListener {

            /* renamed from: a */
            final /* synthetic */ AnchorCell f60797a;

            C22633b(AnchorCell anchorCell) {
                this.f60797a = anchorCell;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", this.f60797a.f60738a);
                } catch (JSONException e) {
                    C32458a.m75143a((Exception) e);
                }
                String a = C36811b.m82838a();
                Map aVar = new C0777a();
                aVar.put("anchor_content", jSONObject.toString());
                aVar.put("scene", "021014");
                String a2 = C36811b.m82840a(a, aVar);
                if (a2 == null) {
                    C52711k.m112234a();
                }
                C36811b.m82843a(a2);
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
            C12203q.m24646a(str).mo23116a((C12197k) this.f60790d).mo23121a();
            DmtTextView dmtTextView = this.f60791e;
            C52711k.m112236a((Object) dmtTextView, LeakCanaryFileProvider.f132049i);
            dmtTextView.setText(anchorCell.f60740c);
            DmtTextView dmtTextView2 = this.f60792f;
            C52711k.m112236a((Object) dmtTextView2, "summary");
            dmtTextView2.setText(anchorCell.f60741d);
            this.f60793g.setOnClickListener(new C22632a(this, anchorCell));
            this.itemView.setOnClickListener(new C22633b(anchorCell));
        }

        public C22631a(C22630a aVar, View view) {
            C52711k.m112240b(view, "itemView");
            this.f60794h = aVar;
            super(aVar, view, aVar.f60789d);
            this.f60790d = (SmartImageView) view.findViewById(R.id.ebg);
            this.f60791e = (DmtTextView) view.findViewById(R.id.f5f);
            this.f60792f = (DmtTextView) view.findViewById(R.id.f5g);
            this.f60793g = (Button) view.findViewById(R.id.e0f);
        }
    }

    public C22630a(C22678i iVar, String str) {
        C52711k.m112240b(str, "fragmentType");
        super(iVar);
        this.f60789d = str;
    }

    /* renamed from: a */
    public final /* synthetic */ C1352v mo14349a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C52711k.m112240b(layoutInflater, "inflater");
        C52711k.m112240b(viewGroup, "parent");
        View inflate = layoutInflater.inflate(R.layout.bhe, viewGroup, false);
        C52711k.m112236a((Object) inflate, "inflater.inflate(R.layou…ment_game, parent, false)");
        return new C22631a(this, inflate);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo14350a(C1352v vVar, Object obj) {
        C22631a aVar = (C22631a) vVar;
        AnchorCell anchorCell = (AnchorCell) obj;
        C52711k.m112240b(aVar, "holder");
        C52711k.m112240b(anchorCell, "cell");
        aVar.mo46997a(anchorCell);
        if (C52711k.m112239a((Object) this.f60789d, (Object) "enter_page")) {
            C26890h.m65011a("gc_label_game_show", C23089d.m56640a().mo47829a("params_for_special", "game_platform").mo47829a("target_app_id", "2210").mo47829a("game_name", anchorCell.f60740c).mo47829a("game_id", anchorCell.f60738a).mo47829a("position", this.f60789d).f61491a);
        }
    }
}
