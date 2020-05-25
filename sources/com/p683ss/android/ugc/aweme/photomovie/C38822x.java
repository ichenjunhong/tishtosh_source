package com.p683ss.android.ugc.aweme.photomovie;

import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.photomovie.x */
final /* synthetic */ class C38822x implements OnClickListener {

    /* renamed from: a */
    private final C38805m f98788a;

    C38822x(C38805m mVar) {
        this.f98788a = mVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C38805m mVar = this.f98788a;
        if (!((Boolean) C39618d.f101174o.mo74242d().mo74245a()).booleanValue()) {
            C39618d.f101174o.mo74242d().mo74246a(Boolean.valueOf(true));
            new C10643a(mVar.getContext()).mo18885a((int) R.string.b78).mo18899b((int) R.string.a2_).mo18886a((int) R.string.buz, (DialogInterface.OnClickListener) null).mo18897a().mo18882b();
            return;
        }
        mVar.mo78777a(false);
        Intent intent = new Intent(mVar.getActivity(), C39618d.f101162c.mo74158d());
        intent.setFlags(872415232);
        intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_DRAFT", true);
        mVar.startActivity(intent);
    }
}
