package com.p683ss.android.ugc.awemepushlib.interaction;

import android.os.Handler;
import android.os.Looper;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;

/* renamed from: com.ss.android.ugc.awemepushlib.interaction.n */
final /* synthetic */ class C48463n implements Runnable {

    /* renamed from: a */
    private final boolean f121837a;

    C48463n(boolean z) {
        this.f121837a = z;
    }

    public final void run() {
        boolean z = this.f121837a;
        int intValue = C32816h.m75716b().getPushdelayinitSwitch().intValue();
        if (z) {
            intValue = 0;
        }
        new Handler(Looper.getMainLooper()).postDelayed(C48456g.f121830a, (long) intValue);
    }
}
