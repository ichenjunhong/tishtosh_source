package com.p683ss.android.ugc.aweme.feed.p1736ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.commercialize.C25945k;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26503d;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.da */
final /* synthetic */ class C30896da implements OnClickListener {

    /* renamed from: a */
    private final C30890cy f80931a;

    C30896da(C30890cy cyVar) {
        this.f80931a = cyVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C30890cy cyVar = this.f80931a;
        if (!cyVar.mo60602f() && cyVar.f80910v != null && cyVar.f80909u != null) {
            C26503d.m64058a(cyVar.f79012e);
            C25945k.m62914e().mo53191a(cyVar.f79017j, cyVar.f79011d, cyVar.f80909u, 1, cyVar.f80910v);
        }
    }
}
