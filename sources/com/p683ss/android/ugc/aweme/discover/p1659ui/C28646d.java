package com.p683ss.android.ugc.aweme.discover.p1659ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.base.utils.KeyboardUtils;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.d */
final /* synthetic */ class C28646d implements OnClickListener {

    /* renamed from: a */
    private final C28527b f75210a;

    C28646d(C28527b bVar) {
        this.f75210a = bVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C28527b bVar = this.f75210a;
        bVar.f74969b.setText("");
        bVar.f74969b.setCursorVisible(true);
        KeyboardUtils.m58183b(bVar.f74969b);
    }
}
