package com.p683ss.android.ugc.aweme.feed.p1736ui.masklayer2.p1737a;

import android.view.View;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.p1736ui.masklayer2.C31051a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.a.i */
public abstract class C31068i {

    /* renamed from: a */
    private final C31051a f81321a;

    /* renamed from: e */
    public Aweme f81322e;

    /* renamed from: f */
    public String f81323f;

    /* renamed from: a */
    public abstract void mo63838a(View view);

    /* renamed from: b */
    public void mo63839b(View view) {
        C52711k.m112240b(view, "v");
        mo63838a(view);
        this.f81321a.mo63837c();
    }

    public C31068i(C31051a aVar) {
        C52711k.m112240b(aVar, "actionsManager");
        this.f81321a = aVar;
        this.f81322e = aVar.f81298b;
        this.f81323f = aVar.f81299c;
    }
}
