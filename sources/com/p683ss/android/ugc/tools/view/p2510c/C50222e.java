package com.p683ss.android.ugc.tools.view.p2510c;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* renamed from: com.ss.android.ugc.tools.view.c.e */
public final class C50222e implements OnTouchListener {

    /* renamed from: a */
    private final float f125796a = 1.2f;

    /* renamed from: b */
    private final long f125797b = 200;

    /* renamed from: c */
    private final OnTouchListener f125798c = null;

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 3) {
            switch (action) {
                case 0:
                    view.animate().scaleX(this.f125796a).scaleY(this.f125796a).setDuration(this.f125797b).start();
                    break;
                case 1:
                    break;
            }
        }
        view.animate().scaleX(1.0f).scaleY(1.0f).setDuration(this.f125797b).start();
        if (this.f125798c == null || !this.f125798c.onTouch(view, motionEvent)) {
            return false;
        }
        return true;
    }

    public C50222e(float f, long j, OnTouchListener onTouchListener) {
    }
}
