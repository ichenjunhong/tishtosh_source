package com.p683ss.android.ugc.aweme.profile.p2090ui;

import android.content.DialogInterface;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.p2090ui.p2092b.C40247c;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.aq */
final /* synthetic */ class C40231aq implements OnClickListener {

    /* renamed from: a */
    private final C40212af f102764a;

    /* renamed from: b */
    private final User f102765b;

    C40231aq(C40212af afVar, User user) {
        this.f102764a = afVar;
        this.f102765b = user;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C40212af afVar = this.f102764a;
        new C10643a(afVar.getActivity()).mo18885a((int) R.string.gpp).mo18899b((int) R.string.gpn).mo18886a((int) R.string.gpo, (DialogInterface.OnClickListener) new C40224aj(afVar, this.f102765b)).mo18897a().mo18882b();
        C40247c.m89518a("weblink", afVar.f103081w);
    }
}
