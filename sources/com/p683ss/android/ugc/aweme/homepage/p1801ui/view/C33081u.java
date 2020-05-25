package com.p683ss.android.ugc.aweme.homepage.p1801ui.view;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;

/* renamed from: com.ss.android.ugc.aweme.homepage.ui.view.u */
final /* synthetic */ class C33081u implements OnClickListener {

    /* renamed from: a */
    private final MainTabStrip f85900a;

    C33081u(MainTabStrip mainTabStrip) {
        this.f85900a = mainTabStrip;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        MainTabStrip mainTabStrip = this.f85900a;
        if (mainTabStrip.f85778b != null) {
            if (mainTabStrip.f85801y) {
                C26890h.m65011a("homepage_follow_notice", C23089d.m56640a().mo47829a("notice_type", "head").mo47829a("action_type", "click").mo47829a("to_user_id", mainTabStrip.f85764B).f61491a);
            }
            mainTabStrip.mo69962a("homepage_follow", 0);
            MainTabStrip.m75960c(2);
        }
    }
}
