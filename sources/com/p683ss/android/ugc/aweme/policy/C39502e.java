package com.p683ss.android.ugc.aweme.policy;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.base.C23566n;

/* renamed from: com.ss.android.ugc.aweme.policy.e */
final /* synthetic */ class C39502e implements OnClickListener {

    /* renamed from: a */
    private final C39498b f101051a;

    /* renamed from: b */
    private final Policy f101052b;

    C39502e(C39498b bVar, Policy policy) {
        this.f101051a = bVar;
        this.f101052b = policy;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C39498b bVar = this.f101051a;
        int i = ((C39495b) this.f101052b.getConfigs().get(0)).f101038c;
        if (bVar.f101047b != null) {
            C23566n.m57766a().mo48750a(bVar.f101046a, new C39501d(i), 1);
        }
    }
}
