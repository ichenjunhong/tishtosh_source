package com.p683ss.android.ugc.aweme.p1807im.sdk.media.preview.model;

import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0200t;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23275b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.media.preview.model.MediaPreviewLifecycleObserver */
public final class MediaPreviewLifecycleObserver implements C0183j {

    /* renamed from: a */
    private final C23275b<C0177a> f89033a;

    @C0200t(mo345a = C0177a.ON_CREATE)
    public final void onCreate() {
        this.f89033a.setValue(C0177a.ON_CREATE);
    }

    @C0200t(mo345a = C0177a.ON_DESTROY)
    public final void onDestroy() {
        this.f89033a.setValue(C0177a.ON_DESTROY);
    }

    @C0200t(mo345a = C0177a.ON_PAUSE)
    public final void onPause() {
        this.f89033a.setValue(C0177a.ON_PAUSE);
    }

    @C0200t(mo345a = C0177a.ON_RESUME)
    public final void onResume() {
        this.f89033a.setValue(C0177a.ON_RESUME);
    }

    @C0200t(mo345a = C0177a.ON_START)
    public final void onStart() {
        this.f89033a.setValue(C0177a.ON_START);
    }

    @C0200t(mo345a = C0177a.ON_STOP)
    public final void onStop() {
        this.f89033a.setValue(C0177a.ON_STOP);
    }

    public MediaPreviewLifecycleObserver(C23275b<C0177a> bVar) {
        C52711k.m112240b(bVar, "liveData");
        this.f89033a = bVar;
    }
}
