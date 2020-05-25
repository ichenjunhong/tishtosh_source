package com.p683ss.android.ugc.aweme.following.p1770ui.viewmodel;

import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52761d;
import p2628d.p2648k.C52771j;

/* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.e */
final /* synthetic */ class C32348e extends C52720t {

    /* renamed from: a */
    public static final C52771j f84212a = new C32348e();

    C32348e() {
    }

    public final String getName() {
        return "listState";
    }

    public final C52761d getOwner() {
        return C52728w.m112245a(FollowingRelationState.class);
    }

    public final String getSignature() {
        return "getListState()Lcom/bytedance/jedi/arch/ext/list/ListState;";
    }

    public final Object get(Object obj) {
        return ((FollowingRelationState) obj).getListState();
    }
}
