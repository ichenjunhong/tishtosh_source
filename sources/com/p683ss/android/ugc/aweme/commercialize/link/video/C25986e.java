package com.p683ss.android.ugc.aweme.commercialize.link.video;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.commercialize.link.video.e */
final /* synthetic */ class C25986e implements OnClickListener {

    /* renamed from: a */
    private final I18nStrongLinkContent f68606a;

    C25986e(I18nStrongLinkContent i18nStrongLinkContent) {
        this.f68606a = i18nStrongLinkContent;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        I18nStrongLinkContent i18nStrongLinkContent = this.f68606a;
        if (i18nStrongLinkContent.f68589a != null) {
            i18nStrongLinkContent.f68589a.mo53093b();
        }
    }
}
