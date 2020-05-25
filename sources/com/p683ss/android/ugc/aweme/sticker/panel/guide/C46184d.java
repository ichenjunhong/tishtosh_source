package com.p683ss.android.ugc.aweme.sticker.panel.guide;

import android.graphics.drawable.Animatable;

/* renamed from: com.ss.android.ugc.aweme.sticker.panel.guide.d */
final /* synthetic */ class C46184d implements Runnable {

    /* renamed from: a */
    private final C461834 f116544a;

    /* renamed from: b */
    private final Animatable f116545b;

    C46184d(C461834 r1, Animatable animatable) {
        this.f116544a = r1;
        this.f116545b = animatable;
    }

    public final void run() {
        C461834 r0 = this.f116544a;
        Animatable animatable = this.f116545b;
        if (animatable.isRunning()) {
            animatable.stop();
            C46177c.this.f116529a.callOnClick();
        }
    }
}
