package com.p683ss.android.ugc.aweme.guide.p1796a;

import android.content.Context;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.sharer.C42307b;
import com.ss.android.ugc.trill.R;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.guide.a.b */
public final class C32931b extends C1322a<C32930a> {

    /* renamed from: a */
    private final Context f85590a;

    /* renamed from: b */
    private final List<C42307b> f85591b;

    public final int getItemCount() {
        return this.f85591b.size();
    }

    public C32931b(Context context, List<? extends C42307b> list) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(list, "channels");
        this.f85590a = context;
        this.f85591b = list;
    }

    public final /* synthetic */ void onBindViewHolder(C1352v vVar, int i) {
        C32930a aVar = (C32930a) vVar;
        C52711k.m112240b(aVar, "holder");
        aVar.f85589a.setImageResource(((C42307b) this.f85591b.get(i)).mo86131a());
    }

    public final /* synthetic */ C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        C52711k.m112240b(viewGroup, "parent");
        View inflate = LayoutInflater.from(this.f85590a).inflate(R.layout.buq, viewGroup, false);
        C52711k.m112236a((Object) inflate, "layout");
        return new C32930a(inflate);
    }
}
