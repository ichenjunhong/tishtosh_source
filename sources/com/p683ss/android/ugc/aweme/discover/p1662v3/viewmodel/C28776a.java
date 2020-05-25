package com.p683ss.android.ugc.aweme.discover.p1662v3.viewmodel;

import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52761d;
import p2628d.p2648k.C52771j;

/* renamed from: com.ss.android.ugc.aweme.discover.v3.viewmodel.a */
final /* synthetic */ class C28776a extends C52720t {

    /* renamed from: a */
    public static final C52771j f75460a = new C28776a();

    C28776a() {
    }

    public final String getName() {
        return "cells";
    }

    public final C52761d getOwner() {
        return C52728w.m112245a(DiscoverStateV3.class);
    }

    public final String getSignature() {
        return "getCells()Lcom/bytedance/jedi/arch/ext/list/ListState;";
    }

    public final Object get(Object obj) {
        return ((DiscoverStateV3) obj).getCells();
    }
}
