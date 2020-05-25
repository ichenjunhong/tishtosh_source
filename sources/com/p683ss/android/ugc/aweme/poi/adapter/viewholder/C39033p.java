package com.p683ss.android.ugc.aweme.poi.adapter.viewholder;

import android.content.Context;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.effect.C29094ad;
import com.p683ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p683ss.android.ugc.aweme.poi.C39067g;
import com.ss.android.ugc.trill.R;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.poi.adapter.viewholder.p */
public final class C39033p extends C1322a<C1352v> {

    /* renamed from: a */
    private final Context f99499a;

    /* renamed from: b */
    private final List<AwemeRawAd> f99500b;

    /* renamed from: c */
    private final C39067g f99501c;

    public final int getItemCount() {
        return this.f99500b.size();
    }

    public final void onBindViewHolder(C1352v vVar, int i) {
        C52711k.m112240b(vVar, "p0");
        C39036r rVar = (C39036r) vVar;
        AwemeRawAd awemeRawAd = (AwemeRawAd) this.f99500b.get(i);
        C39067g gVar = this.f99501c;
        C52711k.m112240b(awemeRawAd, C29094ad.f76264a);
        rVar.f99515a.mo79170a(awemeRawAd, gVar);
    }

    public final C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        C52711k.m112240b(viewGroup, "p0");
        View inflate = LayoutInflater.from(this.f99499a).inflate(R.layout.bno, viewGroup, false);
        C52711k.m112236a((Object) inflate, "view");
        return new C39036r(inflate);
    }

    public C39033p(Context context, List<? extends AwemeRawAd> list, C39067g gVar) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(list, "ads");
        this.f99499a = context;
        this.f99500b = list;
        this.f99501c = gVar;
    }
}
