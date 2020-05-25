package com.p683ss.android.ugc.aweme.feedback;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.feedback.b */
final /* synthetic */ class C31268b implements OnClickListener {

    /* renamed from: a */
    private final FeedbackActivity f81939a;

    C31268b(FeedbackActivity feedbackActivity) {
        this.f81939a = feedbackActivity;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f81939a.finish();
    }
}
