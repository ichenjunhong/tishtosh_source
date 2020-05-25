package com.google.android.gms.ads.internal;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* renamed from: com.google.android.gms.ads.internal.bk */
final class C14977bk implements OnTouchListener {

    /* renamed from: a */
    private final /* synthetic */ C14987bu f38673a;

    /* renamed from: b */
    private final /* synthetic */ C14975bi f38674b;

    C14977bk(C14975bi biVar, C14987bu buVar) {
        this.f38674b = biVar;
        this.f38673a = buVar;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.f38673a.mo27620a();
        if (this.f38674b.f38669b != null) {
            this.f38674b.f38669b.mo31551c();
        }
        return false;
    }
}
