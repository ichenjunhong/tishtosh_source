package com.p683ss.android.ugc.aweme.profile.p2090ui;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.al */
final /* synthetic */ class C40226al implements OnClickListener {

    /* renamed from: a */
    private final C40212af f102759a;

    C40226al(C40212af afVar) {
        this.f102759a = afVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C40212af afVar = this.f102759a;
        C26890h.m65011a("enter_profile_edit", C23089d.m56640a().mo47829a("enter_method", "click_edit_profile").f61491a);
        afVar.mo82448a((Bundle) null);
    }
}
