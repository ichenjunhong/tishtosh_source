package com.p683ss.android.ugc.aweme.account.login.fragment;

import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;

/* renamed from: com.ss.android.ugc.aweme.account.login.fragment.c */
final /* synthetic */ class C21298c implements OnGlobalLayoutListener {

    /* renamed from: a */
    private final C21168a f57833a;

    /* renamed from: b */
    private final View f57834b;

    C21298c(C21168a aVar, View view) {
        this.f57833a = aVar;
        this.f57834b = view;
    }

    public final void onGlobalLayout() {
        C21168a aVar = this.f57833a;
        View view = this.f57834b;
        if (aVar.isViewValid() && aVar.getContext() != null && aVar.f57512e != null) {
            int height = view.getRootView().getHeight() - view.getHeight();
            aVar.f57512e.removeCallbacksAndMessages(null);
            aVar.f57512e.post(new C21300e(aVar, height));
        }
    }
}
