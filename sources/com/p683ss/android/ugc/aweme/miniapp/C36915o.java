package com.p683ss.android.ugc.aweme.miniapp;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.miniapp.o */
final /* synthetic */ class C36915o implements OnClickListener {

    /* renamed from: a */
    private final RecentlyUsedMicroAppActivity f94303a;

    C36915o(RecentlyUsedMicroAppActivity recentlyUsedMicroAppActivity) {
        this.f94303a = recentlyUsedMicroAppActivity;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f94303a.mo75976b();
    }
}
