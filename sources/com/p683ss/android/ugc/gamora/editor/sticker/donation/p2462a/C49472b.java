package com.p683ss.android.ugc.gamora.editor.sticker.donation.p2462a;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.p1793g.p1794a.C32800a;
import com.p683ss.android.ugc.aweme.utils.C47702b;
import com.p683ss.android.ugc.gamora.editor.sticker.donation.C49464a;
import com.p683ss.android.ugc.gamora.editor.sticker.donation.C49464a.C49467c;
import com.p683ss.android.ugc.gamora.editor.sticker.donation.C49464a.C49468d;
import com.p683ss.android.ugc.gamora.editor.sticker.donation.C49479b;
import com.p683ss.android.ugc.gamora.editor.sticker.donation.p2463b.C49481b;
import com.ss.android.ugc.trill.R;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.a.b */
public final class C49472b extends C1352v {

    /* renamed from: a */
    RemoteImageView f124138a;

    /* renamed from: b */
    DmtTextView f124139b;

    /* renamed from: c */
    DmtTextView f124140c;

    /* renamed from: d */
    RemoteImageView f124141d;

    /* renamed from: e */
    public final C49479b f124142e;

    /* renamed from: f */
    public C49471a f124143f;

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.a.b$a */
    static final class C49473a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C49472b f124144a;

        /* renamed from: b */
        final /* synthetic */ C49481b f124145b;

        C49473a(C49472b bVar, C49481b bVar2) {
            this.f124144a = bVar;
            this.f124145b = bVar2;
        }

        public final void onClick(View view) {
            String str;
            ClickInstrumentation.onClick(view);
            if (!C32800a.m75679a(view)) {
                this.f124144a.f124143f.mo97352b(this.f124145b);
                C49464a aVar = C49464a.f124115b;
                C49479b bVar = this.f124144a.f124142e;
                String str2 = null;
                if (bVar != null) {
                    str = bVar.getShootWay();
                } else {
                    str = null;
                }
                C49479b bVar2 = this.f124144a.f124142e;
                if (bVar2 != null) {
                    str2 = bVar2.getCreationId();
                }
                String name = this.f124145b.getName();
                JSONObject jSONObject = new JSONObject();
                C49464a.m106725a(jSONObject, new C49467c(str, str2, name));
                C47702b.f120193a.mo94985a("enter_ngo_detail", jSONObject);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.a.b$b */
    static final class C49474b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C49472b f124146a;

        /* renamed from: b */
        final /* synthetic */ C49481b f124147b;

        C49474b(C49472b bVar, C49481b bVar2) {
            this.f124146a = bVar;
            this.f124147b = bVar2;
        }

        public final void onClick(View view) {
            String str;
            String str2;
            String str3;
            ClickInstrumentation.onClick(view);
            if (!C32800a.m75679a(view)) {
                this.f124146a.f124143f.mo97351a(this.f124147b);
                C49464a aVar = C49464a.f124115b;
                C49479b bVar = this.f124146a.f124142e;
                String str4 = null;
                if (bVar != null) {
                    str = bVar.getShootWay();
                } else {
                    str = null;
                }
                C49479b bVar2 = this.f124146a.f124142e;
                if (bVar2 != null) {
                    str2 = bVar2.getCreationId();
                } else {
                    str2 = null;
                }
                String name = this.f124147b.getName();
                int adapterPosition = this.f124146a.getAdapterPosition() + 1;
                C49479b bVar3 = this.f124146a.f124142e;
                if (bVar3 != null) {
                    str3 = bVar3.getContentSource();
                } else {
                    str3 = null;
                }
                C49479b bVar4 = this.f124146a.f124142e;
                if (bVar4 != null) {
                    str4 = bVar4.getContentType();
                }
                String str5 = str4;
                JSONObject jSONObject = new JSONObject();
                C49468d dVar = new C49468d(str, str2, name, str3, str5, adapterPosition);
                C49464a.m106725a(jSONObject, dVar);
                C47702b.f120193a.mo94985a("add_donation_sticker", jSONObject);
            }
        }
    }

    public C49472b(View view, C49479b bVar, C49471a aVar) {
        C52711k.m112240b(view, "itemView");
        C52711k.m112240b(aVar, "listener");
        super(view);
        this.f124142e = bVar;
        this.f124143f = aVar;
        this.f124138a = (RemoteImageView) view.findViewById(R.id.efe);
        this.f124139b = (DmtTextView) view.findViewById(R.id.f3t);
        this.f124140c = (DmtTextView) view.findViewById(R.id.f3s);
        this.f124141d = (RemoteImageView) view.findViewById(R.id.efd);
    }
}
