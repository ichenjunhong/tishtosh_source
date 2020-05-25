package com.p683ss.android.ugc.aweme.commercialize.splash;

import android.animation.ObjectAnimator;
import android.view.View;

/* renamed from: com.ss.android.ugc.aweme.commercialize.splash.h */
final /* synthetic */ class C26225h implements Runnable {

    /* renamed from: a */
    private final View f69257a;

    C26225h(View view) {
        this.f69257a = view;
    }

    public final void run() {
        View view = this.f69257a;
        view.setVisibility(0);
        view.setAlpha(0.0f);
        ObjectAnimator.ofFloat(view, "alpha", new float[]{0.0f, 1.0f}).setDuration(430).start();
    }
}
