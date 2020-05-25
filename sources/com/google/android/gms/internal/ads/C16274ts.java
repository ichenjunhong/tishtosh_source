package com.google.android.gms.internal.ads;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.ts */
final class C16274ts implements OnGlobalLayoutListener {

    /* renamed from: a */
    private final /* synthetic */ WeakReference f45641a;

    /* renamed from: b */
    private final /* synthetic */ C16266tk f45642b;

    C16274ts(C16266tk tkVar, WeakReference weakReference) {
        this.f45642b = tkVar;
        this.f45641a = weakReference;
    }

    public final void onGlobalLayout() {
        C16266tk.m38833a(this.f45642b, this.f45641a, false);
    }
}
