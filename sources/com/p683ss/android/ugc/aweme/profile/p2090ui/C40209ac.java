package com.p683ss.android.ugc.aweme.profile.p2090ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.ac */
final /* synthetic */ class C40209ac implements OnClickListener {

    /* renamed from: a */
    private final EnterpriseTransformLayout f102695a;

    /* renamed from: b */
    private final C40066a f102696b;

    /* renamed from: c */
    private final String f102697c;

    /* renamed from: d */
    private final String f102698d;

    C40209ac(EnterpriseTransformLayout enterpriseTransformLayout, C40066a aVar, String str, String str2) {
        this.f102695a = enterpriseTransformLayout;
        this.f102696b = aVar;
        this.f102697c = str;
        this.f102698d = str2;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        EnterpriseTransformLayout enterpriseTransformLayout = this.f102695a;
        C40066a aVar = this.f102696b;
        String str = this.f102697c;
        String str2 = this.f102698d;
        if (aVar == null || !aVar.mo82127a()) {
            enterpriseTransformLayout.mo82124a(str, str2);
        }
        enterpriseTransformLayout.mo82125b(str2);
    }
}
