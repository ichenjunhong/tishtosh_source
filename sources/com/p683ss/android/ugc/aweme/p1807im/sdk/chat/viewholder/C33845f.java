package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.p702im.core.p706c.C11207p;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.f */
public final /* synthetic */ class C33845f implements OnClickListener {

    /* renamed from: a */
    private final C33805c f87805a;

    /* renamed from: b */
    private final C11207p f87806b;

    public C33845f(C33805c cVar, C11207p pVar) {
        this.f87805a = cVar;
        this.f87806b = pVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C33805c cVar = this.f87805a;
        if (C33805c.m77464a(this.f87806b) && cVar.f87701c != null) {
            cVar.f87701c.setChecked(!cVar.f87701c.isChecked());
        }
    }
}
