package com.bytedance.android.live.broadcast;

import android.widget.FrameLayout.LayoutParams;

/* renamed from: com.bytedance.android.live.broadcast.o */
final /* synthetic */ class C3462o implements Runnable {

    /* renamed from: a */
    private final C3134c f9904a;

    C3462o(C3134c cVar) {
        this.f9904a = cVar;
    }

    public final void run() {
        C3134c cVar = this.f9904a;
        if (!cVar.f10829E) {
            LayoutParams layoutParams = (LayoutParams) cVar.f9132f.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -1;
            layoutParams.topMargin = 0;
            cVar.f9132f.setLayoutParams(layoutParams);
        }
    }
}
