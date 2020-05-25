package com.p683ss.android.ugc.aweme.feed.p1736ui;

import android.content.Context;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView.C1349s;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.CallBackLinearLayoutManager */
public final class CallBackLinearLayoutManager extends LinearLayoutManager {

    /* renamed from: a */
    public final C52670a<C52860x> f80340a;

    /* renamed from: a */
    public final void mo4677a(C1349s sVar) {
        super.mo4677a(sVar);
        this.f80340a.invoke();
    }

    public CallBackLinearLayoutManager(Context context, int i, boolean z, C52670a<C52860x> aVar) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(aVar, "callback");
        super(context, 0, false);
        this.f80340a = aVar;
    }
}
