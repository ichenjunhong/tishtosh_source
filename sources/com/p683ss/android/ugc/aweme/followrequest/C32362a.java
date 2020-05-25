package com.p683ss.android.ugc.aweme.followrequest;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.followrequest.a */
final /* synthetic */ class C32362a implements OnClickListener {

    /* renamed from: a */
    private final FollowRequestActivity f84239a;

    C32362a(FollowRequestActivity followRequestActivity) {
        this.f84239a = followRequestActivity;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        FollowRequestActivity followRequestActivity = this.f84239a;
        followRequestActivity.mListStatusView.mo19212f();
        if (followRequestActivity.f84232a != null) {
            followRequestActivity.f84232a.mo65500e();
        }
    }
}
