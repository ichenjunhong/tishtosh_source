package com.p683ss.android.ugc.aweme.anim;

import android.animation.ValueAnimator;
import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0200t;

/* renamed from: com.ss.android.ugc.aweme.anim.BackgroundAnimHelper */
public class BackgroundAnimHelper implements C0183j {

    /* renamed from: a */
    private ValueAnimator f60867a;

    @C0200t(mo345a = C0177a.ON_PAUSE)
    public void stopAnim() {
        this.f60867a.cancel();
    }

    @C0200t(mo345a = C0177a.ON_RESUME)
    public void resumeAnim() {
        if (!this.f60867a.isStarted()) {
            this.f60867a.start();
        }
    }
}
