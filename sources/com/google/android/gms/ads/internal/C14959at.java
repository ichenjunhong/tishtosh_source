package com.google.android.gms.ads.internal;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* renamed from: com.google.android.gms.ads.internal.at */
final class C14959at implements OnTouchListener {

    /* renamed from: a */
    private final /* synthetic */ C14957ar f38567a;

    C14959at(C14957ar arVar) {
        this.f38567a = arVar;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.f38567a.f38560d != null) {
            this.f38567a.f38560d.mo30080a(motionEvent);
        }
        return false;
    }
}
