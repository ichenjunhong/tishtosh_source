package com.p683ss.android.ugc.aweme.forward.p1779vh;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.forward.vh.a */
final /* synthetic */ class C32428a implements OnClickListener {

    /* renamed from: a */
    private final BaseForwardViewHolder f84438a;

    C32428a(BaseForwardViewHolder baseForwardViewHolder) {
        this.f84438a = baseForwardViewHolder;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f84438a.mo65663c(view);
    }
}
