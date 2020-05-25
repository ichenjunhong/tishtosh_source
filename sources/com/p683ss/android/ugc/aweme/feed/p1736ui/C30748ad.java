package com.p683ss.android.ugc.aweme.feed.p1736ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.C10720a;
import com.bytedance.ies.dmt.p664ui.widget.C10722c;
import com.bytedance.ies.dmt.p664ui.widget.C10722c.C10723a;
import com.bytedance.ies.dmt.p664ui.widget.DmtDefaultView;
import com.p683ss.android.ugc.aweme.feed.p1736ui.C30790be.C30791a;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.ad */
final /* synthetic */ class C30748ad implements C30791a {

    /* renamed from: a */
    private final C31143x f80576a;

    C30748ad(C31143x xVar) {
        this.f80576a = xVar;
    }

    /* renamed from: a */
    public final View mo63433a(View view) {
        C31143x xVar = this.f80576a;
        C10722c cVar = new C10723a(xVar.getActivity()).mo19277a((int) R.drawable.dgl).mo19280b((int) R.string.f5o).mo19282c(R.string.f5k).mo19278a(C10720a.BORDER, R.string.f5u, new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                C31143x.this.mo59855d_(false);
            }
        }).f28711a;
        DmtDefaultView dmtDefaultView = new DmtDefaultView(view.getContext());
        dmtDefaultView.setStatus(cVar);
        return dmtDefaultView;
    }
}
