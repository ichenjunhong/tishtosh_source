package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.google.android.gms.internal.ads.C16299uq;
import com.google.android.gms.internal.ads.ada;

@C16299uq
/* renamed from: com.google.android.gms.ads.internal.overlay.h */
final class C15011h extends RelativeLayout {

    /* renamed from: a */
    boolean f38808a;

    /* renamed from: b */
    private ada f38809b;

    public C15011h(Context context, String str, String str2) {
        super(context);
        this.f38809b = new ada(context, str);
        this.f38809b.f40273d = str2;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f38808a) {
            this.f38809b.mo28705a(motionEvent);
        }
        return false;
    }
}
