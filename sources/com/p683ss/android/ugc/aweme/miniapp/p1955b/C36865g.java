package com.p683ss.android.ugc.aweme.miniapp.p1955b;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.miniapp_api.model.C36966e;
import com.p683ss.android.ugc.aweme.miniapp_api.model.p1962b.C36960b.C36961a;
import com.p683ss.android.ugc.aweme.miniapp_api.services.C36983a;

/* renamed from: com.ss.android.ugc.aweme.miniapp.b.g */
final /* synthetic */ class C36865g implements OnClickListener {

    /* renamed from: a */
    private final C36966e f94220a;

    /* renamed from: b */
    private final C36862a f94221b;

    C36865g(C36966e eVar, C36862a aVar) {
        this.f94220a = eVar;
        this.f94221b = aVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C36966e eVar = this.f94220a;
        C36862a aVar = this.f94221b;
        C36983a.m83185b().mo76294a().openMiniApp(view.getContext(), eVar, new C36961a().mo76222b("setting_page").mo76220a("recently").mo76223c("021001").mo76221a());
        aVar.mo76060a(eVar.getAppId());
        C26890h.m65011a("mp_click", C23089d.m56640a().mo47829a("mp_id", eVar.getAppId()).mo47829a("author_id", C20902b.m53242a().getCurUserId()).mo47829a("enter_from", "setting_page").mo47829a("click_type", "setting_page_inner").mo47829a("_param_for_special", eVar.getType() == 1 ? "micro_app" : "micro_game").f61491a);
    }
}
