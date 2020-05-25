package com.google.android.gms.internal.ads;

import android.view.ViewTreeObserver.OnScrollChangedListener;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.tt */
final class C16275tt implements OnScrollChangedListener {

    /* renamed from: a */
    private final /* synthetic */ WeakReference f45643a;

    /* renamed from: b */
    private final /* synthetic */ C16266tk f45644b;

    C16275tt(C16266tk tkVar, WeakReference weakReference) {
        this.f45644b = tkVar;
        this.f45643a = weakReference;
    }

    public final void onScrollChanged() {
        C16266tk.m38833a(this.f45644b, this.f45643a, true);
    }
}
