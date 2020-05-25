package com.p683ss.android.ugc.aweme.account.base;

import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0200t;
import android.os.Handler;

/* renamed from: com.ss.android.ugc.aweme.account.base.SafeHandler */
public class SafeHandler extends Handler implements C0183j {

    /* renamed from: a */
    private final C0184k f56901a;

    @C0200t(mo345a = C0177a.ON_DESTROY)
    public void destroy() {
        removeCallbacksAndMessages(null);
    }

    public SafeHandler(C0184k kVar) {
        this.f56901a = kVar;
        this.f56901a.getLifecycle().mo324a(this);
    }
}
