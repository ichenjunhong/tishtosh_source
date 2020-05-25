package com.p683ss.android.ugc.aweme.profile.p2090ui.widget;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.s */
final /* synthetic */ class C40458s implements OnClickListener {

    /* renamed from: a */
    private final C40454p f103295a;

    C40458s(C40454p pVar) {
        this.f103295a = pVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C40454p pVar = this.f103295a;
        if (pVar.f103281b != null) {
            pVar.f103281b.setText("");
        }
    }
}
