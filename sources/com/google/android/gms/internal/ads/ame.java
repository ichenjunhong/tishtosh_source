package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;

final class ame implements OnAttachStateChangeListener {

    /* renamed from: a */
    private final /* synthetic */ C16442zy f40922a;

    /* renamed from: b */
    private final /* synthetic */ amb f40923b;

    ame(amb amb, C16442zy zyVar) {
        this.f40923b = amb;
        this.f40922a = zyVar;
    }

    public final void onViewDetachedFromWindow(View view) {
    }

    public final void onViewAttachedToWindow(View view) {
        this.f40923b.m33308a(view, this.f40922a, 10);
    }
}
