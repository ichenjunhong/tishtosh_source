package com.p683ss.android.ugc.aweme.profile.p2090ui.widget;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.q */
final /* synthetic */ class C40456q implements OnClickListener {

    /* renamed from: a */
    private final C40454p f103293a;

    C40456q(C40454p pVar) {
        this.f103293a = pVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C40454p pVar = this.f103293a;
        if (pVar.f103287h == 1) {
            C26890h.m65011a("remark_toast", C23089d.m56640a().mo47829a("action_type", "cancel").f61491a);
        }
        pVar.dismiss();
    }
}
