package com.p683ss.android.ugc.aweme.infoSticker;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.infoSticker.y */
final /* synthetic */ class C35639y implements OnClickListener {

    /* renamed from: a */
    private final C35638x f91599a;

    /* renamed from: b */
    private final int f91600b;

    C35639y(C35638x xVar, int i) {
        this.f91599a = xVar;
        this.f91600b = i;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C35638x xVar = this.f91599a;
        xVar.f91595a.setCurrentItem(this.f91600b, true);
    }
}
