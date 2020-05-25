package com.p683ss.android.ugc.aweme.shortvideo.p2242ui;

import android.os.Build.VERSION;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.av */
final /* synthetic */ class C44997av implements OnClickListener {

    /* renamed from: a */
    private final VEVideoPublishPreviewActivity f113955a;

    C44997av(VEVideoPublishPreviewActivity vEVideoPublishPreviewActivity) {
        this.f113955a = vEVideoPublishPreviewActivity;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        VEVideoPublishPreviewActivity vEVideoPublishPreviewActivity = this.f113955a;
        if (VERSION.SDK_INT >= 21) {
            vEVideoPublishPreviewActivity.f113695a.bringToFront();
            vEVideoPublishPreviewActivity.f113698d.post(new C44999ax(vEVideoPublishPreviewActivity));
            return;
        }
        vEVideoPublishPreviewActivity.finish();
    }
}
