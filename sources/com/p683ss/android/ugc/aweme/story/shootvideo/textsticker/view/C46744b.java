package com.p683ss.android.ugc.aweme.story.shootvideo.textsticker.view;

import android.view.View;

/* renamed from: com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.b */
final /* synthetic */ class C46744b implements Runnable {

    /* renamed from: a */
    private final DmtAutoCenterScrollView f118049a;

    /* renamed from: b */
    private final View f118050b;

    C46744b(DmtAutoCenterScrollView dmtAutoCenterScrollView, View view) {
        this.f118049a = dmtAutoCenterScrollView;
        this.f118050b = view;
    }

    public final void run() {
        DmtAutoCenterScrollView dmtAutoCenterScrollView = this.f118049a;
        View view = this.f118050b;
        dmtAutoCenterScrollView.smoothScrollTo(((view.getLeft() + view.getRight()) / 2) - (dmtAutoCenterScrollView.getWidth() / 2), 0);
    }
}
