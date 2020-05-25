package com.p683ss.android.ugc.aweme.discover.adapter;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.ae */
final /* synthetic */ class C27798ae implements Runnable {

    /* renamed from: a */
    private final RankingListCoverViewHolder f73045a;

    C27798ae(RankingListCoverViewHolder rankingListCoverViewHolder) {
        this.f73045a = rankingListCoverViewHolder;
    }

    public final void run() {
        RankingListCoverViewHolder rankingListCoverViewHolder = this.f73045a;
        rankingListCoverViewHolder.f72889a.setSmoothScrollingEnabled(false);
        rankingListCoverViewHolder.f72889a.fullScroll(66);
        rankingListCoverViewHolder.f72889a.setSmoothScrollingEnabled(true);
    }
}
