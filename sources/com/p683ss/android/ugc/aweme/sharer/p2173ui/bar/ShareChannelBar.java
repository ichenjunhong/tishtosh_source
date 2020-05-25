package com.p683ss.android.ugc.aweme.sharer.p2173ui.bar;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.p683ss.android.ugc.aweme.sharer.C42307b;
import com.ss.android.ugc.trill.R;
import java.util.List;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sharer.ui.bar.ShareChannelBar */
public final class ShareChannelBar extends FrameLayout implements C42345e {

    /* renamed from: a */
    private List<? extends C42307b> f106922a = C52575l.m112097a();

    /* renamed from: b */
    private C42345e f106923b;

    /* renamed from: c */
    private C42342d f106924c;

    /* renamed from: d */
    private final RecyclerView f106925d;

    /* renamed from: a */
    public final void mo86250a(C42345e eVar) {
        C52711k.m112240b(eVar, "listener");
        this.f106923b = eVar;
    }

    /* renamed from: a */
    public final void mo66353a(C42307b bVar) {
        C52711k.m112240b(bVar, "channel");
        C42345e eVar = this.f106923b;
        if (eVar != null) {
            eVar.mo66353a(bVar);
        }
    }

    /* renamed from: a */
    public final void mo86251a(List<? extends C42307b> list) {
        C52711k.m112240b(list, "channels");
        this.f106922a = list;
        this.f106924c.mo86255a(list);
    }

    public ShareChannelBar(Context context, AttributeSet attributeSet) {
        int i;
        C52711k.m112240b(context, "ctx");
        C52711k.m112240b(attributeSet, "attributeSet");
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.q1, R.attr.ad1});
        Context context2 = getContext();
        C52711k.m112236a((Object) context2, "context");
        int color = obtainStyledAttributes.getColor(0, context2.getResources().getColor(R.color.a44));
        boolean z = obtainStyledAttributes.getBoolean(1, false);
        obtainStyledAttributes.recycle();
        LayoutInflater from = LayoutInflater.from(getContext());
        if (z) {
            i = R.layout.bkf;
        } else {
            i = R.layout.a7l;
        }
        from.inflate(i, this, true);
        View findViewById = findViewById(R.id.si);
        C52711k.m112236a((Object) findViewById, "findViewById(R.id.channel_list)");
        this.f106925d = (RecyclerView) findViewById;
        C42342d dVar = new C42342d(this, false, false, color, z);
        this.f106924c = dVar;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 0, false);
        this.f106924c.mo86255a(this.f106922a);
        RecyclerView recyclerView = this.f106925d;
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(this.f106924c);
    }
}
