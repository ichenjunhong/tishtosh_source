package com.p683ss.android.ugc.aweme.main;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.main.bg */
final /* synthetic */ class C36526bg implements OnClickListener {

    /* renamed from: a */
    private final MainFragment f93603a;

    C36526bg(MainFragment mainFragment) {
        this.f93603a = mainFragment;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f93603a.mo75497b(view);
    }
}
