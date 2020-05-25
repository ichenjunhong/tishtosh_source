package com.p683ss.android.ugc.aweme.i18n.language.p1806b;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;

/* renamed from: com.ss.android.ugc.aweme.i18n.language.b.b */
final /* synthetic */ class C33108b implements OnClickListener {

    /* renamed from: a */
    private final C33107a f85940a;

    C33108b(C33107a aVar) {
        this.f85940a = aVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C33107a aVar = this.f85940a;
        C33121l.m76125b(3);
        C26890h.m65011a("choose_language_popup", new C23089d().mo47829a("enter_from", "homepage_hot").mo47829a("language_type", "cancel").f61491a);
        aVar.dismiss();
    }
}
