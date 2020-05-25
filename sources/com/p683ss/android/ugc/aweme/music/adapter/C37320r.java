package com.p683ss.android.ugc.aweme.music.adapter;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.music.adapter.r */
final /* synthetic */ class C37320r implements OnClickListener {

    /* renamed from: a */
    private final C37317c f95242a;

    C37320r(C37317c cVar) {
        this.f95242a = cVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C37317c cVar = this.f95242a;
        if (C37313p.this.f95227a != null) {
            C37313p.this.f95227a.mo76608a(cVar.getLayoutPosition());
        }
    }
}
