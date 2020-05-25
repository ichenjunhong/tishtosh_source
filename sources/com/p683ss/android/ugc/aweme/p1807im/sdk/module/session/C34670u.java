package com.p683ss.android.ugc.aweme.p1807im.sdk.module.session;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.newstyle.p1865b.C34647a;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.module.session.u */
final /* synthetic */ class C34670u implements OnClickListener {

    /* renamed from: a */
    private final C34667r f89325a;

    /* renamed from: b */
    private final C34647a f89326b;

    C34670u(C34667r rVar, C34647a aVar) {
        this.f89325a = rVar;
        this.f89326b = aVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C34667r rVar = this.f89325a;
        C34647a aVar = this.f89326b;
        if (rVar.f89306f != null && aVar != null) {
            aVar.mo72674a(view.getContext(), rVar.f89307g, rVar.f89306f, 2);
        }
    }
}
