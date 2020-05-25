package com.p683ss.android.ugc.aweme.shortvideo.p2242ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.shortvideo.p2220q.C44403a;
import com.p683ss.android.ugc.aweme.tools.draft.p2359e.C46994b;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.bb */
final /* synthetic */ class C45049bb implements OnClickListener {

    /* renamed from: a */
    private final VideoPublishActivity f114088a;

    C45049bb(VideoPublishActivity videoPublishActivity) {
        this.f114088a = videoPublishActivity;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        VideoPublishActivity videoPublishActivity = this.f114088a;
        C46994b.m102064a().setPublishFormDraftCancel(true);
        Intent intent = new Intent();
        intent.setFlags(536870912);
        C44403a.m97196a().mo48307c(videoPublishActivity, intent);
    }
}
