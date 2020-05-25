package com.bytedance.android.live.core.p230g;

import android.view.View;

/* renamed from: com.bytedance.android.live.core.g.b */
final /* synthetic */ class C3870b implements Runnable {

    /* renamed from: a */
    private final View f10889a;

    C3870b(View view) {
        this.f10889a = view;
    }

    public final void run() {
        this.f10889a.requestLayout();
    }
}
