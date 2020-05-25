package com.p683ss.android.ugc.aweme.follow.recommend.follow.viewModel;

import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52761d;
import p2628d.p2648k.C52771j;

/* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.viewModel.c */
final /* synthetic */ class C31976c extends C52720t {

    /* renamed from: a */
    public static final C52771j f83475a = new C31976c();

    C31976c() {
    }

    public final String getName() {
        return "listState";
    }

    public final C52761d getOwner() {
        return C52728w.m112245a(RecommendFollowState.class);
    }

    public final String getSignature() {
        return "getListState()Lcom/bytedance/jedi/arch/ext/list/ListState;";
    }

    public final Object get(Object obj) {
        return ((RecommendFollowState) obj).getListState();
    }
}
