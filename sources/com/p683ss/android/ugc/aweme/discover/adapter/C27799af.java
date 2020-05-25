package com.p683ss.android.ugc.aweme.discover.adapter;

import android.animation.ObjectAnimator;
import android.view.animation.LinearInterpolator;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.af */
final /* synthetic */ class C27799af implements Runnable {

    /* renamed from: a */
    private final RankingListCoverViewHolder f73046a;

    C27799af(RankingListCoverViewHolder rankingListCoverViewHolder) {
        this.f73046a = rankingListCoverViewHolder;
    }

    public final void run() {
        RankingListCoverViewHolder rankingListCoverViewHolder = this.f73046a;
        ObjectAnimator ofInt = ObjectAnimator.ofInt(rankingListCoverViewHolder.f72889a, "scrollX", new int[]{0});
        ofInt.setDuration(200);
        ofInt.setInterpolator(new LinearInterpolator());
        ofInt.start();
        rankingListCoverViewHolder.f72889a.postDelayed(new C27801ah(rankingListCoverViewHolder), 2000);
    }
}
