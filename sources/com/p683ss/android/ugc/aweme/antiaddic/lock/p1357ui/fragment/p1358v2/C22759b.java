package com.p683ss.android.ugc.aweme.antiaddic.lock.p1357ui.fragment.p1358v2;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.ui.fragment.v2.b */
final /* synthetic */ class C22759b implements OnClickListener {

    /* renamed from: a */
    private final C22753a f60995a;

    C22759b(C22753a aVar) {
        this.f60995a = aVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f60995a.getActivity().onBackPressed();
    }
}
