package com.p683ss.android.ugc.aweme.antiaddic.lock.p1357ui.fragment.p1358v2;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.antiaddic.lock.C22722h;

/* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.ui.fragment.v2.g */
final /* synthetic */ class C22769g implements OnClickListener {

    /* renamed from: a */
    private final TeenagerLockOptionsFragmentV2 f61011a;

    C22769g(TeenagerLockOptionsFragmentV2 teenagerLockOptionsFragmentV2) {
        this.f61011a = teenagerLockOptionsFragmentV2;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        if (this.f61011a.getContext() != null) {
            C22722h.m55982a("teen_mode", "appeal");
        }
    }
}
