package com.p683ss.android.ugc.aweme.main;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.main.av */
final /* synthetic */ class C36507av implements OnClickListener {

    /* renamed from: a */
    private final MainFragment f93577a;

    C36507av(MainFragment mainFragment) {
        this.f93577a = mainFragment;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f93577a.mo75501c(view);
    }
}
