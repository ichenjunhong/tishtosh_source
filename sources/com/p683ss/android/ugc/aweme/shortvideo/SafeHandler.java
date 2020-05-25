package com.p683ss.android.ugc.aweme.shortvideo;

import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.GenericLifecycleObserver;
import android.os.Handler;
import android.os.Looper;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.SafeHandler */
public class SafeHandler extends Handler implements GenericLifecycleObserver {

    /* renamed from: a */
    private final C0184k f107020a;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.SafeHandler$1 */
    static /* synthetic */ class C423731 {

        /* renamed from: a */
        static final /* synthetic */ int[] f107021a = new int[C0177a.values().length];

        static {
            try {
                f107021a[C0177a.ON_DESTROY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo86355a() {
        removeCallbacksAndMessages(null);
        if (this.f107020a != null) {
            this.f107020a.getLifecycle().mo325b(this);
        }
    }

    public SafeHandler(C0184k kVar) {
        super(Looper.getMainLooper());
        this.f107020a = kVar;
        if (this.f107020a != null) {
            this.f107020a.getLifecycle().mo324a(this);
        }
    }

    /* renamed from: a */
    public void mo265a(C0184k kVar, C0177a aVar) {
        if (C423731.f107021a[aVar.ordinal()] == 1) {
            mo86355a();
        }
    }
}
