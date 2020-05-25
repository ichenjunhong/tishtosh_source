package com.p683ss.android.ugc.aweme.feed.panel;

/* renamed from: com.ss.android.ugc.aweme.feed.panel.a */
final /* synthetic */ class C30592a implements Runnable {

    /* renamed from: a */
    private final AbsCellFeedFragmentPanel f79899a;

    /* renamed from: b */
    private final int f79900b;

    C30592a(AbsCellFeedFragmentPanel absCellFeedFragmentPanel, int i) {
        this.f79899a = absCellFeedFragmentPanel;
        this.f79900b = i;
    }

    public final void run() {
        AbsCellFeedFragmentPanel absCellFeedFragmentPanel = this.f79899a;
        absCellFeedFragmentPanel.mListView.mo4814b(this.f79900b);
    }
}
