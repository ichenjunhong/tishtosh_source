package com.p683ss.android.ugc.aweme.favorites.model;

import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52761d;
import p2628d.p2648k.C52771j;

/* renamed from: com.ss.android.ugc.aweme.favorites.model.c */
final /* synthetic */ class C29708c extends C52720t {

    /* renamed from: a */
    public static final C52771j f77620a = new C29708c();

    C29708c() {
    }

    public final String getName() {
        return "listState";
    }

    public final C52761d getOwner() {
        return C52728w.m112245a(PoiCollectListState.class);
    }

    public final String getSignature() {
        return "getListState()Lcom/bytedance/jedi/arch/ext/list/ListState;";
    }

    public final Object get(Object obj) {
        return ((PoiCollectListState) obj).getListState();
    }
}
