package com.p683ss.android.ugc.aweme.discover.adapter;

import android.content.Context;
import android.view.View;
import com.p683ss.android.ugc.aweme.discover.model.SearchPoi;
import com.p683ss.android.ugc.aweme.poi.C39040b;
import com.p683ss.android.ugc.aweme.poi.C39054d;
import com.p683ss.android.ugc.aweme.poi.utils.C39454n;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.bd */
public final class C27857bd extends C27849b {

    /* renamed from: c */
    Context f73188c;

    /* renamed from: d */
    SearchPoi f73189d;

    /* renamed from: e */
    String f73190e;

    /* renamed from: f */
    boolean f73191f;

    /* renamed from: g */
    C39040b f73192g;

    /* renamed from: d */
    public final View mo56209d() {
        return this.itemView;
    }

    public C27857bd(View view, C39054d dVar, boolean z) {
        super(view);
        this.f73191f = z;
        this.f73188c = view.getContext();
        this.f73188c = view.getContext();
        C39454n nVar = C39454n.f100872a;
        this.f73192g = C39454n.m87738a().createPoiItemViewHolder(view, dVar);
        view.setOnClickListener(new C27858be(this));
    }
}
