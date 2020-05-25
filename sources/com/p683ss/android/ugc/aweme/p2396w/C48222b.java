package com.p683ss.android.ugc.aweme.p2396w;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* renamed from: com.ss.android.ugc.aweme.w.b */
public final class C48222b implements OnTouchListener {

    /* renamed from: a */
    private final float f121353a = 1.2f;

    /* renamed from: b */
    private final long f121354b;

    /* renamed from: c */
    private final OnTouchListener f121355c;

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 3) {
            switch (action) {
                case 0:
                    view.animate().scaleX(this.f121353a).scaleY(this.f121353a).setDuration(this.f121354b).start();
                    break;
                case 1:
                    break;
            }
        }
        view.animate().scaleX(1.0f).scaleY(1.0f).setDuration(this.f121354b).start();
        if (this.f121355c == null || !this.f121355c.onTouch(view, motionEvent)) {
            return false;
        }
        return true;
    }

    public C48222b(float f, long j, OnTouchListener onTouchListener) {
        this.f121354b = j;
        this.f121355c = null;
    }
}
