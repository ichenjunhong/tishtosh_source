package com.p683ss.android.ugc.aweme.feedback;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.feedback.a */
final /* synthetic */ class C31267a implements OnClickListener {

    /* renamed from: a */
    private final FeedbackActivity f81938a;

    C31267a(FeedbackActivity feedbackActivity) {
        this.f81938a = feedbackActivity;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f81938a.onBackPressed();
    }
}
