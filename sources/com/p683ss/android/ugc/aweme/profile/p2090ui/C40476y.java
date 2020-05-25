package com.p683ss.android.ugc.aweme.profile.p2090ui;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.commerce.C25514f;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26435bs;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26503d;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.y */
final /* synthetic */ class C40476y implements OnClickListener {

    /* renamed from: a */
    private final EnterpriseTransformLayout f103330a;

    /* renamed from: b */
    private final C40066a f103331b;

    /* renamed from: c */
    private final String f103332c;

    /* renamed from: d */
    private final String f103333d;

    /* renamed from: e */
    private final int f103334e;

    C40476y(EnterpriseTransformLayout enterpriseTransformLayout, C40066a aVar, String str, String str2, int i) {
        this.f103330a = enterpriseTransformLayout;
        this.f103331b = aVar;
        this.f103332c = str;
        this.f103333d = str2;
        this.f103334e = i;
    }

    public final void onClick(View view) {
        String str;
        ClickInstrumentation.onClick(view);
        EnterpriseTransformLayout enterpriseTransformLayout = this.f103330a;
        C40066a aVar = this.f103331b;
        String str2 = this.f103332c;
        String str3 = this.f103333d;
        int i = this.f103334e;
        if (aVar == null || !aVar.mo82127a()) {
            C25514f a = C26503d.m64054a(enterpriseTransformLayout.f102097h);
            C25514f a2 = C26503d.m64054a(enterpriseTransformLayout.f102097h);
            if (a2 == null) {
                str = null;
            } else {
                str = a2.getEncryptKey();
            }
            if (enterpriseTransformLayout.f102098i == null || TextUtils.isEmpty(str)) {
                Context context = enterpriseTransformLayout.getContext();
                if (context != null && !TextUtils.isEmpty(str2)) {
                    StringBuilder sb = new StringBuilder("tel:");
                    sb.append(str2);
                    Intent intent = new Intent("android.intent.action.DIAL", Uri.parse(sb.toString()));
                    intent.setFlags(268435456);
                    context.startActivity(intent);
                }
            } else {
                C26435bs.m63920a().mo54161a(enterpriseTransformLayout.f102098i, a.getPhoneNumber(), a.getPhoneId(), a.getEncryptKey(), "homepage_ad");
            }
        }
        enterpriseTransformLayout.mo82125b(str3);
        enterpriseTransformLayout.mo82122a(i);
    }
}
