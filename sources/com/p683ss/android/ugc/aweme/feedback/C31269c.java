package com.p683ss.android.ugc.aweme.feedback;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.feedback.c */
final /* synthetic */ class C31269c implements OnClickListener {

    /* renamed from: a */
    private final FeedbackActivity f81940a;

    C31269c(FeedbackActivity feedbackActivity) {
        this.f81940a = feedbackActivity;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f81940a.mo64141c();
    }
}
