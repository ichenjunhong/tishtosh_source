package com.p683ss.android.ugc.aweme.p1807im.sdk.widget;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35200an;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.widget.m */
final /* synthetic */ class C35411m implements OnClickListener {

    /* renamed from: a */
    private final ImTextTitleBar f91026a;

    C35411m(ImTextTitleBar imTextTitleBar) {
        this.f91026a = imTextTitleBar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        ImTextTitleBar imTextTitleBar = this.f91026a;
        if (!C35200an.m79575a(view, 500) && imTextTitleBar.f90791a != null) {
            imTextTitleBar.f90791a.mo70671c();
        }
    }
}
