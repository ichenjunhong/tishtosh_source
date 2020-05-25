package com.p683ss.android.ugc.aweme.discover.panel;

/* renamed from: com.ss.android.ugc.aweme.discover.panel.a */
final /* synthetic */ class C28427a implements Runnable {

    /* renamed from: a */
    private final AbsSearchFragmentPanel f74701a;

    /* renamed from: b */
    private final int f74702b;

    C28427a(AbsSearchFragmentPanel absSearchFragmentPanel, int i) {
        this.f74701a = absSearchFragmentPanel;
        this.f74702b = i;
    }

    public final void run() {
        AbsSearchFragmentPanel absSearchFragmentPanel = this.f74701a;
        absSearchFragmentPanel.mListView.mo4814b(this.f74702b);
    }
}
