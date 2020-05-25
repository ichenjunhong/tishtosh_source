package com.p683ss.android.ugc.aweme.mobile;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.mobile.C37139b.C37140a;
import com.p683ss.android.ugc.aweme.utils.C47957v;

/* renamed from: com.ss.android.ugc.aweme.mobile.g */
final /* synthetic */ class C37145g implements OnClickListener {

    /* renamed from: a */
    private final C37139b f94818a;

    /* renamed from: b */
    private final C37140a f94819b;

    C37145g(C37139b bVar, C37140a aVar) {
        this.f94818a = bVar;
        this.f94819b = aVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C37139b bVar = this.f94818a;
        C37140a aVar = this.f94819b;
        if (aVar != null) {
            aVar.mo66202b(bVar.f94807a);
        }
        C47957v.m103768a((Runnable) new C37146h(bVar));
    }
}
