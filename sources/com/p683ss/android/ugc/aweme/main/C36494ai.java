package com.p683ss.android.ugc.aweme.main;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.main.ai */
final /* synthetic */ class C36494ai implements OnClickListener {

    /* renamed from: a */
    private final MainActivity f93564a;

    C36494ai(MainActivity mainActivity) {
        this.f93564a = mainActivity;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f93564a.lambda$onAwesomeSplashEvent$22$MainActivity(view);
    }
}
