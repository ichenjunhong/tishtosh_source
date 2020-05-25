package com.p683ss.android.ugc.aweme.shortvideo.p2242ui;

import android.content.DialogInterface;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.ba */
final /* synthetic */ class C45048ba implements OnClickListener {

    /* renamed from: a */
    private final VideoPublishActivity f114087a;

    C45048ba(VideoPublishActivity videoPublishActivity) {
        this.f114087a = videoPublishActivity;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        VideoPublishActivity videoPublishActivity = this.f114087a;
        if (((C45054bg) videoPublishActivity.getSupportFragmentManager().mo2222a((int) R.id.ajf)).f114132r) {
            new C10643a(videoPublishActivity).mo18899b((int) R.string.d39).mo18886a((int) R.string.b8q, (DialogInterface.OnClickListener) new C45051bd(videoPublishActivity)).mo18900b((int) R.string.wf, C45052be.f114091a).mo18897a().mo18882b();
        } else {
            videoPublishActivity.mo91169e();
        }
    }
}
