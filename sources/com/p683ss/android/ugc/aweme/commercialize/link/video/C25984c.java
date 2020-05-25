package com.p683ss.android.ugc.aweme.commercialize.link.video;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.commercialize.link.video.c */
final /* synthetic */ class C25984c implements OnClickListener {

    /* renamed from: a */
    private final CommerceTagLayout f68602a;

    /* renamed from: b */
    private final C25993l f68603b;

    C25984c(CommerceTagLayout commerceTagLayout, C25993l lVar) {
        this.f68602a = commerceTagLayout;
        this.f68603b = lVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        CommerceTagLayout commerceTagLayout = this.f68602a;
        commerceTagLayout.animate().alpha(0.0f).setDuration(200).withEndAction(new C25985d(commerceTagLayout, this.f68603b));
    }
}
