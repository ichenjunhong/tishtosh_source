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

/* renamed from: com.ss.android.ugc.aweme.sharer.ui.bar.MicroShareChannelBar */
public final class MicroShareChannelBar extends FrameLayout implements C42345e {

    /* renamed from: a */
    public List<? extends C42307b> f106911a = C52575l.m112097a();

    /* renamed from: b */
    public C42345e f106912b;

    /* renamed from: c */
    public final C42342d f106913c;

    /* renamed from: d */
    private final RecyclerView f106914d;

    /* renamed from: a */
    public final void mo66353a(C42307b bVar) {
        C52711k.m112240b(bVar, "channel");
        C42345e eVar = this.f106912b;
        if (eVar != null) {
            eVar.mo66353a(bVar);
        }
    }

    public MicroShareChannelBar(Context context, AttributeSet attributeSet) {
        C52711k.m112240b(context, "ctx");
        C52711k.m112240b(attributeSet, "attributeSet");
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.n4});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        LayoutInflater.from(getContext()).inflate(R.layout.a7o, this, true);
        View findViewById = findViewById(R.id.si);
        C52711k.m112236a((Object) findViewById, "findViewById(R.id.channel_list)");
        this.f106914d = (RecyclerView) findViewById;
        C42342d dVar = new C42342d(this, true, z, 0, false, 24, null);
        this.f106913c = dVar;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 0, false);
        this.f106913c.mo86255a(this.f106911a);
        RecyclerView recyclerView = this.f106914d;
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(this.f106913c);
    }
}
