package com.p683ss.android.ugc.gamora.editor.sticker.donation.p2462a;

import android.content.Context;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.common.p1589a.C26840g;
import com.p683ss.android.ugc.aweme.utils.C47702b;
import com.p683ss.android.ugc.gamora.editor.sticker.donation.C49464a;
import com.p683ss.android.ugc.gamora.editor.sticker.donation.C49464a.C49469e;
import com.p683ss.android.ugc.gamora.editor.sticker.donation.C49479b;
import com.p683ss.android.ugc.gamora.editor.sticker.donation.p2463b.C49481b;
import com.ss.android.ugc.trill.R;
import java.util.List;
import org.json.JSONObject;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.a.c */
public final class C49475c extends C26840g<C49481b> {

    /* renamed from: a */
    private C49471a f124148a;

    /* renamed from: b */
    private final C49479b f124149b;

    public C49475c(C49471a aVar, C49479b bVar) {
        C52711k.m112240b(aVar, "listener");
        this.f124148a = aVar;
        this.f124149b = bVar;
    }

    /* renamed from: a */
    public final C1352v mo48221a(ViewGroup viewGroup, int i) {
        Context context;
        if (viewGroup != null) {
            context = viewGroup.getContext();
        } else {
            context = null;
        }
        View inflate = LayoutInflater.from(context).inflate(R.layout.bi1, viewGroup, false);
        C52711k.m112236a((Object) inflate, "itemView");
        return new C49472b(inflate, this.f124149b, this.f124148a);
    }

    /* renamed from: a */
    public final void mo48222a(C1352v vVar, int i) {
        String str;
        if (vVar instanceof C49472b) {
            List list = this.f70670n;
            C52711k.m112236a((Object) list, "mItems");
            C49481b bVar = (C49481b) C52575l.m112118a(list, i);
            if (bVar != null) {
                C49472b bVar2 = (C49472b) vVar;
                C52711k.m112240b(bVar, "data");
                C49464a aVar = C49464a.f124115b;
                C49479b bVar3 = bVar2.f124142e;
                String str2 = null;
                if (bVar3 != null) {
                    str = bVar3.getShootWay();
                } else {
                    str = null;
                }
                C49479b bVar4 = bVar2.f124142e;
                if (bVar4 != null) {
                    str2 = bVar4.getCreationId();
                }
                String name = bVar.getName();
                int adapterPosition = bVar2.getAdapterPosition() + 1;
                JSONObject jSONObject = new JSONObject();
                C49464a.m106725a(jSONObject, new C49469e(str, str2, name, adapterPosition));
                C47702b.f120193a.mo94985a("ngo_show", jSONObject);
                C23515d.m57669a(bVar2.f124138a, bVar.getIcon());
                DmtTextView dmtTextView = bVar2.f124139b;
                if (dmtTextView != null) {
                    dmtTextView.setText(bVar.getName());
                }
                DmtTextView dmtTextView2 = bVar2.f124140c;
                if (dmtTextView2 != null) {
                    dmtTextView2.setText(bVar.getDesc());
                }
                RemoteImageView remoteImageView = bVar2.f124141d;
                if (remoteImageView != null) {
                    remoteImageView.setOnClickListener(new C49473a(bVar2, bVar));
                }
                bVar2.itemView.setOnClickListener(new C49474b(bVar2, bVar));
            }
        }
    }
}
