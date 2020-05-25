package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import java.lang.ref.WeakReference;

@C16299uq
final class agw extends agx implements OnScrollChangedListener {

    /* renamed from: a */
    private final WeakReference<OnScrollChangedListener> f40450a;

    public agw(View view, OnScrollChangedListener onScrollChangedListener) {
        super(view);
        this.f40450a = new WeakReference<>(onScrollChangedListener);
    }

    public final void onScrollChanged() {
        OnScrollChangedListener onScrollChangedListener = (OnScrollChangedListener) this.f40450a.get();
        if (onScrollChangedListener != null) {
            onScrollChangedListener.onScrollChanged();
        } else {
            mo28840b();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo28835a(ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.addOnScrollChangedListener(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo28836b(ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.removeOnScrollChangedListener(this);
    }
}
