package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.p1822a;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.p1793g.p1794a.C32800a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.gifsearch.p1826c.p1827a.C33598b;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.a.c */
final /* synthetic */ class C33483c implements OnClickListener {

    /* renamed from: a */
    private final C33476a f86767a;

    /* renamed from: b */
    private final C33598b f86768b;

    C33483c(C33476a aVar, C33598b bVar) {
        this.f86767a = aVar;
        this.f86768b = bVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C33476a aVar = this.f86767a;
        C33598b bVar = this.f86768b;
        if (aVar.f86759f != null && !C32800a.m75680a(view, 500)) {
            aVar.f86759f.mo70898a(bVar);
        }
    }
}
