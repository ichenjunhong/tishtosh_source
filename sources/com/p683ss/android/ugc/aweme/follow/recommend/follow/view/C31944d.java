package com.p683ss.android.ugc.aweme.follow.recommend.follow.view;

import com.p683ss.android.ugc.aweme.follow.recommend.follow.viewModel.RecommendFollowState;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52761d;
import p2628d.p2648k.C52771j;

/* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.view.d */
final /* synthetic */ class C31944d extends C52720t {

    /* renamed from: a */
    public static final C52771j f83437a = new C31944d();

    C31944d() {
    }

    public final String getName() {
        return "dislikeSuccess";
    }

    public final C52761d getOwner() {
        return C52728w.m112245a(RecommendFollowState.class);
    }

    public final String getSignature() {
        return "getDislikeSuccess()Lkotlin/Pair;";
    }

    public final Object get(Object obj) {
        return ((RecommendFollowState) obj).getDislikeSuccess();
    }
}
