package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

@C16299uq
abstract class agx {

    /* renamed from: a */
    private final WeakReference<View> f40451a;

    public agx(View view) {
        this.f40451a = new WeakReference<>(view);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo28835a(ViewTreeObserver viewTreeObserver);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo28836b(ViewTreeObserver viewTreeObserver);

    /* renamed from: a */
    public final void mo28839a() {
        ViewTreeObserver c = m32866c();
        if (c != null) {
            mo28835a(c);
        }
    }

    /* renamed from: b */
    public final void mo28840b() {
        ViewTreeObserver c = m32866c();
        if (c != null) {
            mo28836b(c);
        }
    }

    /* renamed from: c */
    private final ViewTreeObserver m32866c() {
        View view = (View) this.f40451a.get();
        if (view == null) {
            return null;
        }
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver == null || !viewTreeObserver.isAlive()) {
            return null;
        }
        return viewTreeObserver;
    }
}
