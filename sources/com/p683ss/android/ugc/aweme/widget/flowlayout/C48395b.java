package com.p683ss.android.ugc.aweme.widget.flowlayout;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.widget.flowlayout.b */
final /* synthetic */ class C48395b implements OnClickListener {

    /* renamed from: a */
    private final TagFlowLayout f121730a;

    /* renamed from: b */
    private final C48396c f121731b;

    /* renamed from: c */
    private final int f121732c;

    C48395b(TagFlowLayout tagFlowLayout, C48396c cVar, int i) {
        this.f121730a = tagFlowLayout;
        this.f121731b = cVar;
        this.f121732c = i;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f121730a.mo95850a(this.f121731b, this.f121732c, view);
    }
}
