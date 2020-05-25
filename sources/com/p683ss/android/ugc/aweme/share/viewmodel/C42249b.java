package com.p683ss.android.ugc.aweme.share.viewmodel;

import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0210y.C0213c;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.share.viewmodel.b */
public final class C42249b extends C0213c {

    /* renamed from: a */
    public FeedPanelStateViewModel f106811a;

    /* renamed from: a */
    public final <T extends C0209x> T mo361a(Class<T> cls) {
        C52711k.m112240b(cls, "modelClass");
        if (!C52711k.m112239a((Object) FeedPanelStateViewModel.class, (Object) cls)) {
            return super.mo361a(cls);
        }
        if (this.f106811a == null) {
            this.f106811a = (FeedPanelStateViewModel) super.mo361a(cls);
        }
        return (C0209x) this.f106811a;
    }
}
