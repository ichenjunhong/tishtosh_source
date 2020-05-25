package com.p683ss.android.ugc.aweme.base;

import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.GenericLifecycleObserver;
import android.os.Handler;
import android.os.Looper;

/* renamed from: com.ss.android.ugc.aweme.base.SafeHandler */
public class SafeHandler extends Handler implements GenericLifecycleObserver {

    /* renamed from: a */
    private final C0184k f62381a;

    /* renamed from: com.ss.android.ugc.aweme.base.SafeHandler$1 */
    static /* synthetic */ class C233701 {

        /* renamed from: a */
        static final /* synthetic */ int[] f62382a = new int[C0177a.values().length];

        static {
            try {
                f62382a[C0177a.ON_DESTROY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public SafeHandler(C0184k kVar) {
        super(Looper.getMainLooper());
        this.f62381a = kVar;
        if (this.f62381a != null) {
            this.f62381a.getLifecycle().mo324a(this);
        }
    }

    /* renamed from: a */
    public final void mo265a(C0184k kVar, C0177a aVar) {
        if (C233701.f62382a[aVar.ordinal()] == 1) {
            removeCallbacksAndMessages(null);
            if (this.f62381a != null) {
                this.f62381a.getLifecycle().mo325b(this);
            }
        }
    }
}
