package com.p683ss.android.ugc.aweme.commercialize.link.video;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.commercialize.link.video.i */
final /* synthetic */ class C25990i implements OnClickListener {

    /* renamed from: a */
    private final CommerceTagLayout f68612a;

    /* renamed from: b */
    private final C25993l f68613b;

    C25990i(CommerceTagLayout commerceTagLayout, C25993l lVar) {
        this.f68612a = commerceTagLayout;
        this.f68613b = lVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        CommerceTagLayout commerceTagLayout = this.f68612a;
        commerceTagLayout.animate().alpha(0.0f).setDuration(200).withEndAction(new C25991j(commerceTagLayout, this.f68613b));
    }
}
