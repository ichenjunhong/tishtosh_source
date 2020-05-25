package com.p683ss.android.ugc.aweme.profile.p2090ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.x */
final /* synthetic */ class C40475x implements OnClickListener {

    /* renamed from: a */
    private final EnterpriseTransformLayout f103327a;

    /* renamed from: b */
    private final C40066a f103328b;

    /* renamed from: c */
    private final String f103329c;

    C40475x(EnterpriseTransformLayout enterpriseTransformLayout, C40066a aVar, String str) {
        this.f103327a = enterpriseTransformLayout;
        this.f103328b = aVar;
        this.f103329c = str;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        EnterpriseTransformLayout enterpriseTransformLayout = this.f103327a;
        C40066a aVar = this.f103328b;
        enterpriseTransformLayout.mo82125b(this.f103329c);
    }
}
