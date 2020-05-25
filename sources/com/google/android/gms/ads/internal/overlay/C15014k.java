package com.google.android.gms.ads.internal.overlay;

import android.graphics.drawable.Drawable;

/* renamed from: com.google.android.gms.ads.internal.overlay.k */
final /* synthetic */ class C15014k implements Runnable {

    /* renamed from: a */
    private final C15013j f38815a;

    /* renamed from: b */
    private final Drawable f38816b;

    C15014k(C15013j jVar, Drawable drawable) {
        this.f38815a = jVar;
        this.f38816b = drawable;
    }

    public final void run() {
        C15013j jVar = this.f38815a;
        jVar.f38814a.f38786a.getWindow().setBackgroundDrawable(this.f38816b);
    }
}
