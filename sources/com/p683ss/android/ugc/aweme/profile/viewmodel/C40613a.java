package com.p683ss.android.ugc.aweme.profile.viewmodel;

import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52761d;
import p2628d.p2648k.C52771j;

/* renamed from: com.ss.android.ugc.aweme.profile.viewmodel.a */
final /* synthetic */ class C40613a extends C52720t {

    /* renamed from: a */
    public static final C52771j f103571a = new C40613a();

    C40613a() {
    }

    public final String getName() {
        return "listState";
    }

    public final C52761d getOwner() {
        return C52728w.m112245a(MediaMixListState.class);
    }

    public final String getSignature() {
        return "getListState()Lcom/bytedance/jedi/arch/ext/list/ListState;";
    }

    public final Object get(Object obj) {
        return ((MediaMixListState) obj).getListState();
    }
}
