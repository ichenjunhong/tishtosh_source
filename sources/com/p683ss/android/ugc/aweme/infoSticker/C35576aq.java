package com.p683ss.android.ugc.aweme.infoSticker;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9431p;

/* renamed from: com.ss.android.ugc.aweme.infoSticker.aq */
final /* synthetic */ class C35576aq implements OnClickListener {

    /* renamed from: a */
    private final C35574ap f91444a;

    C35576aq(C35574ap apVar) {
        this.f91444a = apVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C35574ap apVar = this.f91444a;
        if (C9431p.m18664a(apVar.mo73968b())) {
            apVar.f91438l.mo73940a(0);
        } else {
            apVar.f91438l.mo73942a(apVar.mo73968b());
        }
    }
}
