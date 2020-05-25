package com.p683ss.android.ugc.aweme.profile.p2090ui;

import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.common.util.C18922i;
import com.p683ss.android.ugc.aweme.router.C41302w;
import com.p683ss.android.ugc.aweme.utils.C47915gg;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.z */
final /* synthetic */ class C40477z implements OnClickListener {

    /* renamed from: a */
    private final EnterpriseTransformLayout f103335a;

    /* renamed from: b */
    private final C40066a f103336b;

    /* renamed from: c */
    private final String f103337c;

    /* renamed from: d */
    private final String f103338d;

    C40477z(EnterpriseTransformLayout enterpriseTransformLayout, C40066a aVar, String str, String str2) {
        this.f103335a = enterpriseTransformLayout;
        this.f103336b = aVar;
        this.f103337c = str;
        this.f103338d = str2;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        EnterpriseTransformLayout enterpriseTransformLayout = this.f103335a;
        C40066a aVar = this.f103336b;
        String str = this.f103337c;
        String str2 = this.f103338d;
        if (aVar == null || !aVar.mo82127a()) {
            if (!TextUtils.isEmpty(str)) {
                C18922i iVar = new C18922i(str);
                iVar.mo38778a("enter_from", C47915gg.m103664m(enterpriseTransformLayout.f102097h) ? "personal_homepage" : "others_homepage");
                iVar.mo38778a("content_source", "personal_information");
                str = iVar.mo38774a();
            }
            C41302w.m91042a().mo83861a(str);
        }
        enterpriseTransformLayout.mo82125b(str2);
    }
}
