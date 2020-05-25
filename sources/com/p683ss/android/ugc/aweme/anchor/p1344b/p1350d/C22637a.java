package com.p683ss.android.ugc.aweme.anchor.p1344b.p1350d;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.p683ss.android.ugc.aweme.anchor.C22678i;
import com.p683ss.android.ugc.aweme.anchor.api.model.AnchorCell;
import com.p683ss.android.ugc.aweme.anchor.p1344b.p1345a.C22601a;
import com.p683ss.android.ugc.aweme.anchor.p1344b.p1345a.C22601a.C22605c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.commercialize.anchor.C25600a;
import com.p683ss.android.ugc.aweme.commercialize.anchor.C25615b;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.services.publish.AnchorTransData;
import com.p683ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.ss.android.ugc.trill.R;
import org.json.JSONException;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.anchor.b.d.a */
public final class C22637a extends C22601a<AnchorCell, C22638a> {

    /* renamed from: d */
    public final String f60805d;

    /* renamed from: com.ss.android.ugc.aweme.anchor.b.d.a$a */
    public final class C22638a extends C22605c {

        /* renamed from: d */
        public final SmartImageView f60806d;

        /* renamed from: e */
        public final DmtTextView f60807e;

        /* renamed from: f */
        public final Button f60808f;

        /* renamed from: g */
        final /* synthetic */ C22637a f60809g;

        /* renamed from: com.ss.android.ugc.aweme.anchor.b.d.a$a$a */
        static final class C22639a implements OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C22638a f60810a;

            /* renamed from: b */
            final /* synthetic */ AnchorCell f60811b;

            C22639a(C22638a aVar, AnchorCell anchorCell) {
                this.f60810a = aVar;
                this.f60811b = anchorCell;
            }

            public final void onClick(View view) {
                String str;
                ClickInstrumentation.onClick(view);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("third_id", this.f60811b.f60738a);
                    jSONObject.put(CreateAnchorInfo.KEY_ADD_FROM, 2);
                } catch (JSONException e) {
                    C32458a.m75143a((Exception) e);
                }
                C22678i iVar = this.f60810a.f60809g.f60755b;
                String str2 = null;
                if (iVar != null) {
                    str = iVar.mo46964a();
                } else {
                    str = null;
                }
                C22678i iVar2 = this.f60810a.f60809g.f60755b;
                if (iVar2 != null) {
                    str2 = iVar2.mo46967b();
                }
                C26890h.m65011a("choose_anchor", C23089d.m56640a().mo47829a("anchor_type", "movie").mo47829a("anchor_entry", this.f60811b.f60740c).mo47829a("enter_from", "video_post_page").mo47829a("shoot_way", str).mo47829a("creation_id", str2).mo47826a("status", 1).f61491a);
                int type = C25600a.INDIA_MOVIE.getTYPE();
                String jSONObject2 = jSONObject.toString();
                C52711k.m112236a((Object) jSONObject2, "contentMap.toString()");
                AnchorTransData anchorTransData = new AnchorTransData(type, jSONObject2, this.f60811b.f60740c, null, Integer.valueOf(1), null, null, 104, null);
                C47718bf.m103288a(new C25615b(anchorTransData));
                C22678i iVar3 = this.f60810a.f60809g.f60755b;
                if (iVar3 != null) {
                    iVar3.mo46970e();
                }
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:7:0x0018  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo46997a(com.p683ss.android.ugc.aweme.anchor.api.model.AnchorCell r3) {
            /*
                r2 = this;
                java.lang.String r0 = "cell"
                p2628d.p2639f.p2641b.C52711k.m112240b(r3, r0)
                com.ss.android.ugc.aweme.anchor.api.model.AnchorIcon r0 = r3.f60739b
                if (r0 == 0) goto L_0x0015
                java.util.ArrayList<java.lang.String> r0 = r0.f60746b
                if (r0 == 0) goto L_0x0015
                r1 = 0
                java.lang.Object r0 = r0.get(r1)
                java.lang.String r0 = (java.lang.String) r0
                goto L_0x0016
            L_0x0015:
                r0 = 0
            L_0x0016:
                if (r0 != 0) goto L_0x001a
                java.lang.String r0 = ""
            L_0x001a:
                com.bytedance.lighten.a.t r0 = com.bytedance.lighten.p766a.C12203q.m24646a(r0)
                com.bytedance.lighten.loader.SmartImageView r1 = r2.f60806d
                com.bytedance.lighten.a.k r1 = (com.bytedance.lighten.p766a.C12197k) r1
                com.bytedance.lighten.a.t r0 = r0.mo23116a(r1)
                r0.mo23121a()
                com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r2.f60807e
                java.lang.String r1 = "name"
                p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
                java.lang.String r1 = r3.f60740c
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                r0.setText(r1)
                android.widget.Button r0 = r2.f60808f
                com.ss.android.ugc.aweme.anchor.b.d.a$a$a r1 = new com.ss.android.ugc.aweme.anchor.b.d.a$a$a
                r1.<init>(r2, r3)
                android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
                r0.setOnClickListener(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.anchor.p1344b.p1350d.C22637a.C22638a.mo46997a(com.ss.android.ugc.aweme.anchor.api.model.AnchorCell):void");
        }

        public C22638a(C22637a aVar, View view) {
            C52711k.m112240b(view, "itemView");
            this.f60809g = aVar;
            super(aVar, view, aVar.f60805d);
            this.f60806d = (SmartImageView) view.findViewById(R.id.eb8);
            this.f60807e = (DmtTextView) view.findViewById(R.id.f1a);
            this.f60808f = (Button) view.findViewById(R.id.e0g);
        }
    }

    public C22637a(C22678i iVar, String str) {
        C52711k.m112240b(str, "fragmentType");
        super(iVar);
        this.f60805d = str;
    }

    /* renamed from: a */
    public final /* synthetic */ C1352v mo14349a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C52711k.m112240b(layoutInflater, "inflater");
        C52711k.m112240b(viewGroup, "parent");
        View inflate = layoutInflater.inflate(R.layout.bhi, viewGroup, false);
        C52711k.m112236a((Object) inflate, "inflater.inflate(R.layou…hor_movie, parent, false)");
        return new C22638a(this, inflate);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo14350a(C1352v vVar, Object obj) {
        C22638a aVar = (C22638a) vVar;
        AnchorCell anchorCell = (AnchorCell) obj;
        C52711k.m112240b(aVar, "holder");
        C52711k.m112240b(anchorCell, "cell");
        aVar.mo46997a(anchorCell);
    }
}
