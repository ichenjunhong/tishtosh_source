package com.p683ss.android.ugc.aweme.commercialize.link.video;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.commercialize.link.video.f */
final /* synthetic */ class C25987f implements OnClickListener {

    /* renamed from: a */
    private final CommerceTagLayout f68607a;

    /* renamed from: b */
    private final C25993l f68608b;

    C25987f(CommerceTagLayout commerceTagLayout, C25993l lVar) {
        this.f68607a = commerceTagLayout;
        this.f68608b = lVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        CommerceTagLayout commerceTagLayout = this.f68607a;
        commerceTagLayout.animate().alpha(0.0f).setDuration(200).withEndAction(new C25988g(commerceTagLayout, this.f68608b));
    }
}
