package com.p683ss.android.ugc.aweme.miniapp.p1955b;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.app.AwemeApplication;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.miniapp.appgroup.MicroAppGroupActivity;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.miniapp.b.c */
final /* synthetic */ class C36860c implements OnClickListener {

    /* renamed from: a */
    private final C36858a f94209a;

    C36860c(C36858a aVar) {
        this.f94209a = aVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C36858a aVar = this.f94209a;
        Activity b = AwemeApplication.m56200b();
        if (b != null) {
            C26890h.m65011a("click_more_microapp", C23089d.m56640a().mo47829a("author_id", C20902b.m53242a().getCurUserId()).mo47829a("enter_from", "setting_page").mo47829a("click_type", "setting_page_outer").f61491a);
            C26890h.m65011a("click_mp_entrance", C23089d.m56640a().mo47829a("enter_from", "navigation_panel").mo47829a("scene_id", "021001").f61491a);
            b.startActivity(new Intent(b, MicroAppGroupActivity.class));
            b.overridePendingTransition(R.anim.bn, R.anim.bw);
        }
    }
}
