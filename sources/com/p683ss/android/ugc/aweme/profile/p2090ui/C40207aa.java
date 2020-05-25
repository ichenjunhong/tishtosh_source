package com.p683ss.android.ugc.aweme.profile.p2090ui;

import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.commercialize.C25945k;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.aa */
final /* synthetic */ class C40207aa implements OnClickListener {

    /* renamed from: a */
    private final EnterpriseTransformLayout f102685a;

    /* renamed from: b */
    private final C40066a f102686b;

    /* renamed from: c */
    private final String f102687c;

    /* renamed from: d */
    private final String f102688d;

    /* renamed from: e */
    private final int f102689e;

    C40207aa(EnterpriseTransformLayout enterpriseTransformLayout, C40066a aVar, String str, String str2, int i) {
        this.f102685a = enterpriseTransformLayout;
        this.f102686b = aVar;
        this.f102687c = str;
        this.f102688d = str2;
        this.f102689e = i;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        EnterpriseTransformLayout enterpriseTransformLayout = this.f102685a;
        C40066a aVar = this.f102686b;
        String str = this.f102687c;
        String str2 = this.f102688d;
        int i = this.f102689e;
        if (aVar == null || !aVar.mo82127a()) {
            Uri parse = Uri.parse(str);
            if (C25945k.m62933x().mo54133a(parse) && C25945k.m62933x().mo54131a(enterpriseTransformLayout.getContext())) {
                C25945k.m62933x().mo54132a(enterpriseTransformLayout.getContext(), parse);
            }
        }
        enterpriseTransformLayout.mo82125b(str2);
        enterpriseTransformLayout.mo82122a(i);
    }
}
