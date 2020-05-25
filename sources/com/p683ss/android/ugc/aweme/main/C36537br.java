package com.p683ss.android.ugc.aweme.main;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.qrcode.QRCodePermissionActivity;

/* renamed from: com.ss.android.ugc.aweme.main.br */
final /* synthetic */ class C36537br implements OnClickListener {

    /* renamed from: a */
    private final MainFragment f93616a;

    C36537br(MainFragment mainFragment) {
        this.f93616a = mainFragment;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        MainFragment mainFragment = this.f93616a;
        C26890h.m65011a("qr_code_scan_enter", C23089d.m56640a().mo47829a("enter_from", "homepage_hot").f61491a);
        QRCodePermissionActivity.m90501a(mainFragment.getContext(), false);
    }
}
