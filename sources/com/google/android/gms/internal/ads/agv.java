package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import com.google.android.gms.ads.internal.C14963ax;
import java.lang.ref.WeakReference;

@C16299uq
final class agv extends agx implements OnGlobalLayoutListener {

    /* renamed from: a */
    private final WeakReference<OnGlobalLayoutListener> f40449a;

    public agv(View view, OnGlobalLayoutListener onGlobalLayoutListener) {
        super(view);
        this.f40449a = new WeakReference<>(onGlobalLayoutListener);
    }

    public final void onGlobalLayout() {
        OnGlobalLayoutListener onGlobalLayoutListener = (OnGlobalLayoutListener) this.f40449a.get();
        if (onGlobalLayoutListener != null) {
            onGlobalLayoutListener.onGlobalLayout();
        } else {
            mo28840b();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo28835a(ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.addOnGlobalLayoutListener(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo28836b(ViewTreeObserver viewTreeObserver) {
        C14963ax.m30832b().mo28690a(viewTreeObserver, (OnGlobalLayoutListener) this);
    }
}
