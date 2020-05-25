package com.p683ss.android.ugc.aweme.commercialize.link;

import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.discover.model.Challenge;
import com.p683ss.android.ugc.aweme.i18n.C33095b;
import com.ss.android.ugc.trill.R;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.link.a */
public final class C25947a extends C1322a<C25950b> {

    /* renamed from: a */
    public List<? extends Challenge> f68505a;

    /* renamed from: b */
    private final C25975j f68506b;

    public final int getItemCount() {
        return this.f68505a.size();
    }

    public C25947a(List<? extends Challenge> list, C25975j jVar) {
        C52711k.m112240b(list, "list");
        C52711k.m112240b(jVar, "challengeCallback");
        this.f68505a = list;
        this.f68506b = jVar;
    }

    public final /* synthetic */ C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        C52711k.m112240b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a71, viewGroup, false);
        C52711k.m112236a((Object) inflate, "itemView");
        return new C25950b(inflate, this.f68506b);
    }

    public final /* synthetic */ void onBindViewHolder(C1352v vVar, int i) {
        C25950b bVar = (C25950b) vVar;
        C52711k.m112240b(bVar, "holder");
        Challenge challenge = (Challenge) this.f68505a.get(i);
        C52711k.m112240b(challenge, "challenge");
        bVar.f68524b = i;
        bVar.f68523a = challenge;
        View view = bVar.itemView;
        C52711k.m112236a((Object) view, "itemView");
        DmtTextView dmtTextView = (DmtTextView) view.findViewById(R.id.rq);
        C52711k.m112236a((Object) dmtTextView, "itemView.challengeName");
        StringBuilder sb = new StringBuilder("#");
        sb.append(challenge.getChallengeName());
        dmtTextView.setText(sb.toString());
        View view2 = bVar.itemView;
        C52711k.m112236a((Object) view2, "itemView");
        DmtTextView dmtTextView2 = (DmtTextView) view2.findViewById(R.id.dqr);
        C52711k.m112236a((Object) dmtTextView2, "itemView.viewCount");
        View view3 = bVar.itemView;
        C52711k.m112236a((Object) view3, "itemView");
        dmtTextView2.setText(view3.getContext().getString(R.string.zk, new Object[]{C33095b.m76068a(challenge.getViewCount())}));
        View view4 = bVar.itemView;
        C52711k.m112236a((Object) view4, "itemView");
        C23515d.m57677a((RemoteImageView) view4.findViewById(R.id.c5_), challenge.getChallengeProfileUrl());
        bVar.f68525c.mo53338b(i);
    }
}
