package com.p683ss.android.ugc.aweme.miniapp.anchor.p1950a;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.miniapp.anchor.a.b */
final /* synthetic */ class C36796b implements OnClickListener {

    /* renamed from: a */
    private final C36795a f94054a;

    /* renamed from: b */
    private final int f94055b;

    C36796b(C36795a aVar, int i) {
        this.f94054a = aVar;
        this.f94055b = i;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C36795a aVar = this.f94054a;
        int i = this.f94055b;
        if (aVar.f94053b != null) {
            aVar.f94053b.mo75996a(aVar.f94052a.get(i));
        }
    }
}
