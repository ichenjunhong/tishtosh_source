package com.p683ss.android.ugc.aweme.shortvideo.p2242ui;

import android.content.DialogInterface;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.cc */
final /* synthetic */ class C45108cc implements OnClickListener {

    /* renamed from: a */
    private final C45054bg f114227a;

    C45108cc(C45054bg bgVar) {
        this.f114227a = bgVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C45054bg bgVar = this.f114227a;
        if (!((Boolean) C39618d.f101174o.mo74242d().mo74245a()).booleanValue()) {
            C39618d.f101174o.mo74242d().mo74246a(Boolean.valueOf(true));
            new C10643a(bgVar.getContext()).mo18885a((int) R.string.b78).mo18899b((int) R.string.a2_).mo18886a((int) R.string.buz, (DialogInterface.OnClickListener) null).mo18897a().mo18882b();
            return;
        }
        bgVar.mo91420a(true);
    }
}
