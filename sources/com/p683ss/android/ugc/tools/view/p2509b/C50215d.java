package com.p683ss.android.ugc.tools.view.p2509b;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.tools.view.b.d */
final /* synthetic */ class C50215d implements OnClickListener {

    /* renamed from: a */
    private final C50214b f125783a;

    C50215d(C50214b bVar) {
        this.f125783a = bVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C50214b bVar = this.f125783a;
        if (C50211c.this.f125776r != null) {
            C50211c.this.f125776r.mo73964a();
        }
        if (bVar.f125780a != null) {
            bVar.f125780a.f125784a = false;
        }
    }
}
