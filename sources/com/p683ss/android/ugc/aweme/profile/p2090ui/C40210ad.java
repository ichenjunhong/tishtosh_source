package com.p683ss.android.ugc.aweme.profile.p2090ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.ad */
final /* synthetic */ class C40210ad implements OnClickListener {

    /* renamed from: a */
    private final EnterpriseTransformLayout f102699a;

    /* renamed from: b */
    private final C40066a f102700b;

    /* renamed from: c */
    private final String f102701c;

    /* renamed from: d */
    private final String f102702d;

    C40210ad(EnterpriseTransformLayout enterpriseTransformLayout, C40066a aVar, String str, String str2) {
        this.f102699a = enterpriseTransformLayout;
        this.f102700b = aVar;
        this.f102701c = str;
        this.f102702d = str2;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        EnterpriseTransformLayout enterpriseTransformLayout = this.f102699a;
        C40066a aVar = this.f102700b;
        String str = this.f102701c;
        String str2 = this.f102702d;
        if (aVar == null || !aVar.mo82127a()) {
            enterpriseTransformLayout.mo82124a(str, str2);
        }
        enterpriseTransformLayout.mo82125b(str2);
    }
}
