package com.p683ss.android.ugc.aweme.commercialize.link.video;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.commercialize.link.video.h */
final /* synthetic */ class C25989h implements OnClickListener {

    /* renamed from: a */
    private final I18nWeakLinkContent f68611a;

    C25989h(I18nWeakLinkContent i18nWeakLinkContent) {
        this.f68611a = i18nWeakLinkContent;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        I18nWeakLinkContent i18nWeakLinkContent = this.f68611a;
        if (i18nWeakLinkContent.f68592a != null) {
            i18nWeakLinkContent.f68592a.mo53093b();
        }
    }
}
