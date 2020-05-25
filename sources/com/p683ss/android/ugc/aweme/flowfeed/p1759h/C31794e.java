package com.p683ss.android.ugc.aweme.flowfeed.p1759h;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.flowfeed.h.e */
final /* synthetic */ class C31794e implements OnClickListener {

    /* renamed from: a */
    private final C31782a f83083a;

    C31794e(C31782a aVar) {
        this.f83083a = aVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C31782a aVar = this.f83083a;
        if (aVar.f83052g != null) {
            aVar.f83052g.mo64660a(view, aVar.itemView, aVar.f83048c, aVar.f83048c.getAuthor());
        }
    }
}
