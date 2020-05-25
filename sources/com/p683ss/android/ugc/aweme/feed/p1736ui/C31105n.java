package com.p683ss.android.ugc.aweme.feed.p1736ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.n */
final /* synthetic */ class C31105n implements OnClickListener {

    /* renamed from: a */
    private final DisLikeAwemeLayout f81393a;

    C31105n(DisLikeAwemeLayout disLikeAwemeLayout) {
        this.f81393a = disLikeAwemeLayout;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        DisLikeAwemeLayout disLikeAwemeLayout = this.f81393a;
        if (disLikeAwemeLayout.f80357b != null && disLikeAwemeLayout.f80368m) {
            disLikeAwemeLayout.f80357b.mo55955a(false);
        }
    }
}
