package com.p683ss.android.ugc.aweme.poi.p2074ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.poi.utils.C39452l;
import com.p683ss.android.ugc.aweme.router.C41302w;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.o */
final /* synthetic */ class C39393o implements OnClickListener {

    /* renamed from: a */
    private final C39389l f100769a;

    C39393o(C39389l lVar) {
        this.f100769a = lVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C39389l lVar = this.f100769a;
        C39452l.m87732a(lVar.f100759c, "click_favourite_hint", C23089d.m56640a().mo47829a("enter_from", "poi_page").mo47829a("poi_id", lVar.f100759c.getPoiId()));
        lVar.f100760d.dismiss();
        C41302w.m91042a().mo83861a("aweme://favorite?enter_from=poi_page&enter_method=click_favourite_hint&tab_name=location");
    }
}
