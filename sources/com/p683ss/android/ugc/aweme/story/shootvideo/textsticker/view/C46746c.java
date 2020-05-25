package com.p683ss.android.ugc.aweme.story.shootvideo.textsticker.view;

import android.view.View;
import com.bytedance.common.utility.C9432q;

/* renamed from: com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.c */
final /* synthetic */ class C46746c implements Runnable {

    /* renamed from: a */
    private final DmtAutoCenterScrollView f118051a;

    /* renamed from: b */
    private final View f118052b;

    C46746c(DmtAutoCenterScrollView dmtAutoCenterScrollView, View view) {
        this.f118051a = dmtAutoCenterScrollView;
        this.f118052b = view;
    }

    public final void run() {
        DmtAutoCenterScrollView dmtAutoCenterScrollView = this.f118051a;
        View view = this.f118052b;
        dmtAutoCenterScrollView.smoothScrollTo((view.getLeft() - (dmtAutoCenterScrollView.getWidth() / 2)) - ((int) C9432q.m18687b(view.getContext(), (float) DmtAutoCenterScrollView.f117889a)), 0);
    }
}
