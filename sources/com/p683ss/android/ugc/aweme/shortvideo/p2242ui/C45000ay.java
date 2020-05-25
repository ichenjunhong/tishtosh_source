package com.p683ss.android.ugc.aweme.shortvideo.p2242ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.ay */
final /* synthetic */ class C45000ay implements OnClickListener {

    /* renamed from: a */
    private final VideoPreviewActivity f113961a;

    C45000ay(VideoPreviewActivity videoPreviewActivity) {
        this.f113961a = videoPreviewActivity;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f113961a.onBackPressed();
    }
}
