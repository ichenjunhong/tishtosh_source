package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;

final class anu implements OnAttachStateChangeListener {

    /* renamed from: a */
    private final /* synthetic */ C16442zy f41099a;

    /* renamed from: b */
    private final /* synthetic */ anq f41100b;

    anu(anq anq, C16442zy zyVar) {
        this.f41100b = anq;
        this.f41099a = zyVar;
    }

    public final void onViewDetachedFromWindow(View view) {
    }

    public final void onViewAttachedToWindow(View view) {
        this.f41100b.m33681a(view, this.f41099a, 10);
    }
}
