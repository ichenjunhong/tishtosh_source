package com.p683ss.android.ugc.aweme.music.adapter;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.music.adapter.q */
final /* synthetic */ class C37319q implements OnClickListener {

    /* renamed from: a */
    private final C37315b f95241a;

    C37319q(C37315b bVar) {
        this.f95241a = bVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C37315b bVar = this.f95241a;
        if (C37313p.this.f95227a != null) {
            C37313p.this.f95227a.mo76608a(bVar.getLayoutPosition());
        }
    }
}
