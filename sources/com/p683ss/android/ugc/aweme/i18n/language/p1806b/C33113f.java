package com.p683ss.android.ugc.aweme.i18n.language.p1806b;

import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.i18n.language.I18nManagerServiceImpl;
import com.p683ss.android.ugc.aweme.i18n.language.p1805a.C33098b;
import com.p683ss.android.ugc.aweme.language.C35834e;

/* renamed from: com.ss.android.ugc.aweme.i18n.language.b.f */
final /* synthetic */ class C33113f implements OnClickListener {

    /* renamed from: a */
    private final C33111e f85947a;

    /* renamed from: b */
    private final C35834e f85948b;

    C33113f(C33111e eVar, C35834e eVar2) {
        this.f85947a = eVar;
        this.f85948b = eVar2;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C33111e eVar = this.f85947a;
        C35834e eVar2 = this.f85948b;
        C33121l.m76125b(3);
        C26890h.m65011a("choose_language_popup", new C23089d().mo47829a("enter_from", "homepage_hot").mo47829a("language_type", eVar2.mo70127g()).f61491a);
        if (TextUtils.equals(eVar2.mo70127g(), I18nManagerServiceImpl.createI18nManagerServicebyMonsterPlugin().getCurrentI18nItem(eVar.f85943a).mo70127g())) {
            C33114g.m76116a(eVar.f85944b);
            return;
        }
        C33114g.m76116a(eVar.f85944b);
        C33098b.m76080a().mo70130a(eVar2.mo70121a(), eVar2.mo70127g(), eVar.f85943a);
        C20854a.m53167g().updateLanguage(null, I18nManagerServiceImpl.createI18nManagerServicebyMonsterPlugin().getAppLanguage(), 0);
    }
}
