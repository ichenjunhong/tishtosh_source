package com.p683ss.android.ugc.aweme.profile.p2090ui;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.commerce.C25513e;
import com.p683ss.android.ugc.aweme.commercialize.C25945k;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.ab */
final /* synthetic */ class C40208ab implements OnClickListener {

    /* renamed from: a */
    private final EnterpriseTransformLayout f102690a;

    /* renamed from: b */
    private final C40066a f102691b;

    /* renamed from: c */
    private final String f102692c;

    /* renamed from: d */
    private final C25513e f102693d;

    /* renamed from: e */
    private final String f102694e;

    C40208ab(EnterpriseTransformLayout enterpriseTransformLayout, C40066a aVar, String str, C25513e eVar, String str2) {
        this.f102690a = enterpriseTransformLayout;
        this.f102691b = aVar;
        this.f102692c = str;
        this.f102693d = eVar;
        this.f102694e = str2;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        EnterpriseTransformLayout enterpriseTransformLayout = this.f102690a;
        C40066a aVar = this.f102691b;
        String str = this.f102692c;
        C25513e eVar = this.f102693d;
        String str2 = this.f102694e;
        if (aVar == null || !aVar.mo82127a()) {
            Context context = view.getContext();
            String text = eVar.getText();
            if (!C25945k.m62914e().mo53193a(context, str, true)) {
                C25945k.m62914e().mo53192a(context, str, text);
            }
        }
        enterpriseTransformLayout.mo82125b(str2);
    }
}
