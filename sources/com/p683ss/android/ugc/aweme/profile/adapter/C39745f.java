package com.p683ss.android.ugc.aweme.profile.adapter;

import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.login.C27965f;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;

/* renamed from: com.ss.android.ugc.aweme.profile.adapter.f */
final /* synthetic */ class C39745f implements OnClickListener {

    /* renamed from: a */
    private final C39744e f101473a;

    C39745f(C39744e eVar) {
        this.f101473a = eVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C39744e eVar = this.f101473a;
        if (!C20854a.m53161a().userService().isLogin()) {
            C27965f.m66719a((Activity) eVar.f101469a, "", "click_draft");
        } else {
            AVExternalServiceImpl.getAVServiceImpl_Monster().asyncService(new C39749j(eVar));
        }
    }
}
