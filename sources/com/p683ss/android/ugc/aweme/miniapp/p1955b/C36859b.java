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

/* renamed from: com.ss.android.ugc.aweme.miniapp.b.b */
final /* synthetic */ class C36859b implements OnClickListener {

    /* renamed from: a */
    private final C36858a f94207a;

    /* renamed from: b */
    private final C36966e f94208b;

    C36859b(C36858a aVar, C36966e eVar) {
        this.f94207a = aVar;
        this.f94208b = eVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C36858a aVar = this.f94207a;
        C36966e eVar = this.f94208b;
        C36983a.m83185b().mo76294a().openMiniApp(view.getContext(), eVar, new C36961a().mo76222b("setting_page").mo76223c("021001").mo76221a());
        C26890h.m65011a("mp_click", C23089d.m56640a().mo47829a("mp_id", eVar.getAppId()).mo47829a("author_id", C20902b.m53242a().getCurUserId()).mo47829a("click_type", "setting_page_outer").mo47829a("enter_from", "setting_page").mo47829a("_param_for_special", eVar.isApp() ? "micro_app" : "micro_game").f61491a);
    }
}
